package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p006b.p010c.p016d.p017a.InterfaceSubMenuC0091c;

/* renamed from: a.b.d.f.i.v */
/* loaded from: classes.dex */
public class SubMenuC0215v extends MenuC0211r implements SubMenu {
    public SubMenuC0215v(Context context, InterfaceSubMenuC0091c interfaceSubMenuC0091c) {
        super(context, interfaceSubMenuC0091c);
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        ((InterfaceSubMenuC0091c) this.f1023a).clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m667a(((InterfaceSubMenuC0091c) this.f1023a).getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        ((InterfaceSubMenuC0091c) this.f1023a).setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        ((InterfaceSubMenuC0091c) this.f1023a).setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        ((InterfaceSubMenuC0091c) this.f1023a).setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        ((InterfaceSubMenuC0091c) this.f1023a).setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        ((InterfaceSubMenuC0091c) this.f1023a).setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        ((InterfaceSubMenuC0091c) this.f1023a).setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        ((InterfaceSubMenuC0091c) this.f1023a).setIcon(drawable);
        return this;
    }
}
