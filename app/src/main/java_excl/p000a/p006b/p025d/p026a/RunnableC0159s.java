package p000a.p006b.p025d.p026a;

import android.view.View;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.C0121p;
import p000a.p006b.p010c.p021h.C0123r;
import p000a.p006b.p010c.p021h.InterfaceC0122q;

/* renamed from: a.b.d.a.s */
/* loaded from: classes.dex */
public class RunnableC0159s implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0155o f792b;

    /* renamed from: a.b.d.a.s$a */
    public class a extends C0123r {
        public a() {
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: a */
        public void mo495a(View view) {
            RunnableC0159s.this.f792b.f743n.setAlpha(1.0f);
            RunnableC0159s.this.f792b.f746q.m490a((InterfaceC0122q) null);
            RunnableC0159s.this.f792b.f746q = null;
        }

        @Override // p000a.p006b.p010c.p021h.C0123r, p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: b */
        public void mo496b(View view) {
            RunnableC0159s.this.f792b.f743n.setVisibility(0);
        }
    }

    public RunnableC0159s(LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o) {
        this.f792b = layoutInflaterFactory2C0155o;
    }

    @Override // java.lang.Runnable
    public void run() {
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = this.f792b;
        layoutInflaterFactory2C0155o.f744o.showAtLocation(layoutInflaterFactory2C0155o.f743n, 55, 0, 0);
        this.f792b.m567d();
        if (!this.f792b.m577j()) {
            this.f792b.f743n.setAlpha(1.0f);
            this.f792b.f743n.setVisibility(0);
            return;
        }
        this.f792b.f743n.setAlpha(0.0f);
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o2 = this.f792b;
        C0121p m453a = C0119n.m453a(layoutInflaterFactory2C0155o2.f743n);
        m453a.m488a(1.0f);
        layoutInflaterFactory2C0155o2.f746q = m453a;
        this.f792b.f746q.m490a(new a());
    }
}
