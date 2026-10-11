package p000a.p006b.p010c.p012b.p013c;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* renamed from: a.b.c.b.c.h */
/* loaded from: classes.dex */
public abstract class AbstractC0076h {

    /* renamed from: a.b.c.b.c.h$a */
    public class a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Typeface f446b;

        public a(Typeface typeface) {
            this.f446b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0076h.this.mo330a(this.f446b);
        }
    }

    /* renamed from: a.b.c.b.c.h$b */
    public class b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f448b;

        public b(int i) {
            this.f448b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0076h.this.mo328a(this.f448b);
        }
    }

    /* renamed from: a */
    public abstract void mo328a(int i);

    /* renamed from: a */
    public final void m329a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b(i));
    }

    /* renamed from: a */
    public abstract void mo330a(Typeface typeface);

    /* renamed from: a */
    public final void m331a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }
}
