package p000a.p006b.p010c.p018e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.b.c.e.c */
/* loaded from: classes.dex */
public class C0094c {

    /* renamed from: b */
    public HandlerThread f505b;

    /* renamed from: c */
    public Handler f506c;

    /* renamed from: f */
    public final int f509f;

    /* renamed from: g */
    public final int f510g;

    /* renamed from: h */
    public final String f511h;

    /* renamed from: a */
    public final Object f504a = new Object();

    /* renamed from: e */
    public Handler.Callback f508e = new a();

    /* renamed from: d */
    public int f507d = 0;

    /* renamed from: a.b.c.e.c$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                C0094c.this.m371a();
                return true;
            }
            if (i != 1) {
                return true;
            }
            C0094c.this.m372a((Runnable) message.obj);
            return true;
        }
    }

    /* renamed from: a.b.c.e.c$b */
    public class b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Callable f513b;

        /* renamed from: c */
        public final /* synthetic */ Handler f514c;

        /* renamed from: d */
        public final /* synthetic */ d f515d;

        /* renamed from: a.b.c.e.c$b$a */
        public class a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ Object f516b;

            public a(Object obj) {
                this.f516b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f515d.mo369a(this.f516b);
            }
        }

        public b(C0094c c0094c, Callable callable, Handler handler, d dVar) {
            this.f513b = callable;
            this.f514c = handler;
            this.f515d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f513b.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f514c.post(new a(obj));
        }
    }

    /* renamed from: a.b.c.e.c$c */
    public class c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f518b;

        /* renamed from: c */
        public final /* synthetic */ Callable f519c;

        /* renamed from: d */
        public final /* synthetic */ ReentrantLock f520d;

        /* renamed from: e */
        public final /* synthetic */ AtomicBoolean f521e;

        /* renamed from: f */
        public final /* synthetic */ Condition f522f;

        public c(C0094c c0094c, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f518b = atomicReference;
            this.f519c = callable;
            this.f520d = reentrantLock;
            this.f521e = atomicBoolean;
            this.f522f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f518b.set(this.f519c.call());
            } catch (Exception unused) {
            }
            this.f520d.lock();
            try {
                this.f521e.set(false);
                this.f522f.signal();
            } finally {
                this.f520d.unlock();
            }
        }
    }

    /* renamed from: a.b.c.e.c$d */
    public interface d<T> {
        /* renamed from: a */
        void mo369a(T t);
    }

    public C0094c(String str, int i, int i2) {
        this.f511h = str;
        this.f510g = i;
        this.f509f = i2;
    }

    /* renamed from: a */
    public <T> T m370a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m374b(new c(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public void m371a() {
        synchronized (this.f504a) {
            if (this.f506c.hasMessages(1)) {
                return;
            }
            this.f505b.quit();
            this.f505b = null;
            this.f506c = null;
        }
    }

    /* renamed from: a */
    public void m372a(Runnable runnable) {
        runnable.run();
        synchronized (this.f504a) {
            this.f506c.removeMessages(0);
            this.f506c.sendMessageDelayed(this.f506c.obtainMessage(0), this.f509f);
        }
    }

    /* renamed from: a */
    public <T> void m373a(Callable<T> callable, d<T> dVar) {
        m374b(new b(this, callable, new Handler(), dVar));
    }

    /* renamed from: b */
    public final void m374b(Runnable runnable) {
        synchronized (this.f504a) {
            if (this.f505b == null) {
                this.f505b = new HandlerThread(this.f511h, this.f510g);
                this.f505b.start();
                this.f506c = new Handler(this.f505b.getLooper(), this.f508e);
                this.f507d++;
            }
            this.f506c.removeMessages(0);
            this.f506c.sendMessage(this.f506c.obtainMessage(1, runnable));
        }
    }
}
