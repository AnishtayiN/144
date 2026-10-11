package p000a.p006b.p025d.p026a;

import android.view.View;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.C0123r;
import p000a.p006b.p010c.p021h.InterfaceC0122q;

/* renamed from: a.b.d.a.t */
/* loaded from: classes.dex */
public class C0160t extends C0123r {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0155o f794a;

    public C0160t(LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o) {
        this.f794a = layoutInflaterFactory2C0155o;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
    /* renamed from: a */
    public void mo495a(View view) {
        this.f794a.f743n.setAlpha(1.0f);
        this.f794a.f746q.m490a((InterfaceC0122q) null);
        this.f794a.f746q = null;
    }

    @Override // p000a.p006b.p010c.p021h.C0123r, p000a.p006b.p010c.p021h.InterfaceC0122q
    /* renamed from: b */
    public void mo496b(View view) {
        this.f794a.f743n.setVisibility(0);
        this.f794a.f743n.sendAccessibilityEvent(32);
        if (this.f794a.f743n.getParent() instanceof View) {
            C0119n.m477l((View) this.f794a.f743n.getParent());
        }
    }
}
