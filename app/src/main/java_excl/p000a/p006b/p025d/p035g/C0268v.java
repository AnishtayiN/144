package p000a.p006b.p025d.p035g;

import android.view.View;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0212s;
import p000a.p006b.p025d.p035g.C0270w;

/* renamed from: a.b.d.g.v */
/* loaded from: classes.dex */
public class C0268v extends AbstractViewOnTouchListenerC0247k0 {

    /* renamed from: k */
    public final /* synthetic */ C0270w.b f1473k;

    /* renamed from: l */
    public final /* synthetic */ C0270w f1474l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0268v(C0270w c0270w, View view, C0270w.b bVar) {
        super(view);
        this.f1474l = c0270w;
        this.f1473k = bVar;
    }

    @Override // p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0
    /* renamed from: b */
    public InterfaceC0212s mo770b() {
        return this.f1473k;
    }

    @Override // p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0
    /* renamed from: c */
    public boolean mo771c() {
        if (this.f1474l.f1500g.mo676b()) {
            return true;
        }
        this.f1474l.f1500g.mo681d();
        return true;
    }
}
