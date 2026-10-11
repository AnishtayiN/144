package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p021h.AbstractC0108c;
import p000a.p006b.p025d.p033f.p034i.MenuItemC0205l;

/* renamed from: a.b.d.f.i.m */
/* loaded from: classes.dex */
public class C0206m extends MenuItemC0205l {

    /* renamed from: a.b.d.f.i.m$a */
    public class a extends MenuItemC0205l.a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        public AbstractC0108c.b f1147d;

        public a(C0206m c0206m, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p000a.p006b.p010c.p021h.AbstractC0108c
        /* renamed from: a */
        public View mo439a(MenuItem menuItem) {
            return this.f1142b.onCreateActionView(menuItem);
        }

        @Override // p000a.p006b.p010c.p021h.AbstractC0108c
        /* renamed from: a */
        public void mo440a(AbstractC0108c.b bVar) {
            this.f1147d = bVar;
            this.f1142b.setVisibilityListener(bVar != null ? this : null);
        }

        @Override // p000a.p006b.p010c.p021h.AbstractC0108c
        /* renamed from: a */
        public boolean mo441a() {
            return this.f1142b.isVisible();
        }

        @Override // p000a.p006b.p010c.p021h.AbstractC0108c
        /* renamed from: b */
        public boolean mo442b() {
            return this.f1142b.overridesItemVisibility();
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0108c.b bVar = this.f1147d;
            if (bVar != null) {
                C0204k.this.f1127n.m714i();
            }
        }
    }

    public C0206m(Context context, InterfaceMenuItemC0090b interfaceMenuItemC0090b) {
        super(context, interfaceMenuItemC0090b);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.MenuItemC0205l
    /* renamed from: a */
    public MenuItemC0205l.a mo728a(ActionProvider actionProvider) {
        return new a(this, this.f1020b, actionProvider);
    }
}
