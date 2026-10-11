package p000a.p006b.p010c.p011a;

import android.graphics.Rect;
import android.view.View;
import p000a.p006b.p010c.p020g.C0096a;

/* renamed from: a.b.c.a.u */
/* loaded from: classes.dex */
public final class RunnableC0061u implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ComponentCallbacksC0041e f383b;

    /* renamed from: c */
    public final /* synthetic */ ComponentCallbacksC0041e f384c;

    /* renamed from: d */
    public final /* synthetic */ boolean f385d;

    /* renamed from: e */
    public final /* synthetic */ C0096a f386e;

    /* renamed from: f */
    public final /* synthetic */ View f387f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC0036b0 f388g;

    /* renamed from: h */
    public final /* synthetic */ Rect f389h;

    public RunnableC0061u(ComponentCallbacksC0041e componentCallbacksC0041e, ComponentCallbacksC0041e componentCallbacksC0041e2, boolean z, C0096a c0096a, View view, AbstractC0036b0 abstractC0036b0, Rect rect) {
        this.f383b = componentCallbacksC0041e;
        this.f384c = componentCallbacksC0041e2;
        this.f385d = z;
        this.f386e = c0096a;
        this.f387f = view;
        this.f388g = abstractC0036b0;
        this.f389h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0063w.m310a(this.f383b, this.f384c, this.f385d, (C0096a<String, View>) this.f386e, false);
        View view = this.f387f;
        if (view != null) {
            this.f388g.m140a(view, this.f389h);
        }
    }
}
