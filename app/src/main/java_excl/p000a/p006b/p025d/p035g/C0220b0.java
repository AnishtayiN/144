package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.support.v7.widget.CardView;

/* renamed from: a.b.d.g.b0 */
/* loaded from: classes.dex */
public class C0220b0 implements InterfaceC0229e0 {
    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public float mo749a(InterfaceC0226d0 interfaceC0226d0) {
        return m762i(interfaceC0226d0).f1429a * 2.0f;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public void mo746a() {
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public void mo750a(InterfaceC0226d0 interfaceC0226d0, float f) {
        C0263s0 m762i = m762i(interfaceC0226d0);
        if (f == m762i.f1429a) {
            return;
        }
        m762i.f1429a = f;
        m762i.m898a((Rect) null);
        m762i.invalidateSelf();
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public void mo751a(InterfaceC0226d0 interfaceC0226d0, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0263s0 c0263s0 = new C0263s0(colorStateList, f);
        CardView.C0304a c0304a = (CardView.C0304a) interfaceC0226d0;
        c0304a.f1853a = c0263s0;
        CardView.this.setBackgroundDrawable(c0263s0);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        mo756c(c0304a, f3);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: a */
    public void mo752a(InterfaceC0226d0 interfaceC0226d0, ColorStateList colorStateList) {
        C0263s0 m762i = m762i(interfaceC0226d0);
        m762i.m897a(colorStateList);
        m762i.invalidateSelf();
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: b */
    public float mo753b(InterfaceC0226d0 interfaceC0226d0) {
        return m762i(interfaceC0226d0).f1429a * 2.0f;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: b */
    public void mo754b(InterfaceC0226d0 interfaceC0226d0, float f) {
        CardView.this.setElevation(f);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: c */
    public void mo755c(InterfaceC0226d0 interfaceC0226d0) {
        mo756c(interfaceC0226d0, m762i(interfaceC0226d0).f1433e);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: c */
    public void mo756c(InterfaceC0226d0 interfaceC0226d0, float f) {
        C0263s0 m762i = m762i(interfaceC0226d0);
        CardView.C0304a c0304a = (CardView.C0304a) interfaceC0226d0;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean m1057a = c0304a.m1057a();
        if (f != m762i.f1433e || m762i.f1434f != useCompatPadding || m762i.f1435g != m1057a) {
            m762i.f1433e = f;
            m762i.f1434f = useCompatPadding;
            m762i.f1435g = m1057a;
            m762i.m898a((Rect) null);
            m762i.invalidateSelf();
        }
        if (!CardView.this.getUseCompatPadding()) {
            c0304a.m1056a(0, 0, 0, 0);
            return;
        }
        float f2 = m762i(c0304a).f1433e;
        float f3 = m762i(c0304a).f1429a;
        int ceil = (int) Math.ceil(C0265t0.m899a(f2, f3, c0304a.m1057a()));
        int ceil2 = (int) Math.ceil(C0265t0.m900b(f2, f3, c0304a.m1057a()));
        c0304a.m1056a(ceil, ceil2, ceil, ceil2);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: d */
    public void mo757d(InterfaceC0226d0 interfaceC0226d0) {
        mo756c(interfaceC0226d0, m762i(interfaceC0226d0).f1433e);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: e */
    public float mo758e(InterfaceC0226d0 interfaceC0226d0) {
        return CardView.this.getElevation();
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: f */
    public float mo759f(InterfaceC0226d0 interfaceC0226d0) {
        return m762i(interfaceC0226d0).f1429a;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: g */
    public float mo760g(InterfaceC0226d0 interfaceC0226d0) {
        return m762i(interfaceC0226d0).f1433e;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0229e0
    /* renamed from: h */
    public ColorStateList mo761h(InterfaceC0226d0 interfaceC0226d0) {
        return m762i(interfaceC0226d0).f1436h;
    }

    /* renamed from: i */
    public final C0263s0 m762i(InterfaceC0226d0 interfaceC0226d0) {
        return (C0263s0) ((CardView.C0304a) interfaceC0226d0).f1853a;
    }
}
