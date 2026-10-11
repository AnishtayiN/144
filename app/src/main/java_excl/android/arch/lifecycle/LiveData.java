package android.arch.lifecycle;

import p000a.p001a.p002a.p003a.C0000a;
import p000a.p001a.p002a.p004b.C0004b;
import p000a.p001a.p005b.AbstractC0008d;
import p000a.p001a.p005b.C0011g;
import p000a.p001a.p005b.InterfaceC0010f;
import p000a.p001a.p005b.InterfaceC0015k;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: i */
    public static final Object f1573i = new Object();

    /* renamed from: a */
    public final Object f1574a = new Object();

    /* renamed from: b */
    public C0004b<InterfaceC0015k<T>, LiveData<T>.AbstractC0279b> f1575b = new C0004b<>();

    /* renamed from: c */
    public int f1576c = 0;

    /* renamed from: d */
    public volatile Object f1577d;

    /* renamed from: e */
    public volatile Object f1578e;

    /* renamed from: f */
    public int f1579f;

    /* renamed from: g */
    public boolean f1580g;

    /* renamed from: h */
    public boolean f1581h;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC0279b implements GenericLifecycleObserver {

        /* renamed from: e */
        public final InterfaceC0010f f1582e;

        /* renamed from: f */
        public final /* synthetic */ LiveData f1583f;

        @Override // android.arch.lifecycle.LiveData.AbstractC0279b
        /* renamed from: a */
        public void mo967a() {
            ((C0011g) this.f1582e.mo14a()).f29a.remove(this);
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        /* renamed from: a */
        public void mo954a(InterfaceC0010f interfaceC0010f, AbstractC0008d.a aVar) {
            if (((C0011g) this.f1582e.mo14a()).f30b == AbstractC0008d.b.DESTROYED) {
                this.f1583f.mo963a((InterfaceC0015k) null);
            } else {
                m969a(mo968b());
            }
        }

        @Override // android.arch.lifecycle.LiveData.AbstractC0279b
        /* renamed from: b */
        public boolean mo968b() {
            return ((C0011g) this.f1582e.mo14a()).f30b.compareTo(AbstractC0008d.b.STARTED) >= 0;
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$a */
    public class RunnableC0278a implements Runnable {
        public RunnableC0278a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f1574a) {
                obj = LiveData.this.f1578e;
                LiveData.this.f1578e = LiveData.f1573i;
            }
            LiveData.this.mo23a((LiveData) obj);
        }
    }

    /* renamed from: android.arch.lifecycle.LiveData$b */
    public abstract class AbstractC0279b {

        /* renamed from: a */
        public final InterfaceC0015k<T> f1585a;

        /* renamed from: b */
        public boolean f1586b;

        /* renamed from: c */
        public int f1587c;

        /* renamed from: d */
        public final /* synthetic */ LiveData f1588d;

        /* renamed from: a */
        public void mo967a() {
        }

        /* renamed from: a */
        public void m969a(boolean z) {
            if (z == this.f1586b) {
                return;
            }
            this.f1586b = z;
            boolean z2 = this.f1588d.f1576c == 0;
            this.f1588d.f1576c += this.f1586b ? 1 : -1;
            if (z2 && this.f1586b) {
                this.f1588d.mo962a();
            }
            LiveData liveData = this.f1588d;
            if (liveData.f1576c == 0 && !this.f1586b) {
                liveData.mo965b();
            }
            if (this.f1586b) {
                this.f1588d.m966b(this);
            }
        }

        /* renamed from: b */
        public abstract boolean mo968b();
    }

    public LiveData() {
        Object obj = f1573i;
        this.f1577d = obj;
        this.f1578e = obj;
        this.f1579f = -1;
        new RunnableC0278a();
    }

    /* renamed from: a */
    public static void m961a(String str) {
        if (C0000a.m0b().mo2a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: a */
    public void mo962a() {
    }

    /* renamed from: a */
    public void mo963a(InterfaceC0015k<T> interfaceC0015k) {
        m961a("removeObserver");
        LiveData<T>.AbstractC0279b remove = this.f1575b.remove(interfaceC0015k);
        if (remove == null) {
            return;
        }
        remove.mo967a();
        remove.m969a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m964a(LiveData<T>.AbstractC0279b abstractC0279b) {
        if (abstractC0279b.f1586b) {
            if (!abstractC0279b.mo968b()) {
                abstractC0279b.m969a(false);
                return;
            }
            int i = abstractC0279b.f1587c;
            int i2 = this.f1579f;
            if (i >= i2) {
                return;
            }
            abstractC0279b.f1587c = i2;
            abstractC0279b.f1585a.m24a(this.f1577d);
        }
    }

    /* renamed from: a */
    public void mo23a(T t) {
        m961a("setValue");
        this.f1579f++;
        this.f1577d = t;
        m966b(null);
    }

    /* renamed from: b */
    public void mo965b() {
    }

    /* renamed from: b */
    public final void m966b(LiveData<T>.AbstractC0279b abstractC0279b) {
        if (this.f1580g) {
            this.f1581h = true;
            return;
        }
        this.f1580g = true;
        do {
            this.f1581h = false;
            if (abstractC0279b != null) {
                m964a((AbstractC0279b) abstractC0279b);
                abstractC0279b = null;
            } else {
                C0004b<InterfaceC0015k<T>, LiveData<T>.AbstractC0279b>.e m6a = this.f1575b.m6a();
                while (m6a.hasNext()) {
                    m964a((AbstractC0279b) m6a.next().getValue());
                    if (this.f1581h) {
                        break;
                    }
                }
            }
        } while (this.f1581h);
        this.f1580g = false;
    }
}
