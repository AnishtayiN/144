package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p016d.p017a.InterfaceSubMenuC0091c;
import p000a.p006b.p010c.p020g.C0096a;

/* renamed from: a.b.d.f.i.c */
/* loaded from: classes.dex */
public abstract class AbstractC0196c<T> extends C0197d<T> {

    /* renamed from: b */
    public final Context f1020b;

    /* renamed from: c */
    public Map<InterfaceMenuItemC0090b, MenuItem> f1021c;

    /* renamed from: d */
    public Map<InterfaceSubMenuC0091c, SubMenu> f1022d;

    public AbstractC0196c(Context context, T t) {
        super(t);
        this.f1020b = context;
    }

    /* renamed from: a */
    public final MenuItem m667a(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC0090b)) {
            return menuItem;
        }
        InterfaceMenuItemC0090b interfaceMenuItemC0090b = (InterfaceMenuItemC0090b) menuItem;
        if (this.f1021c == null) {
            this.f1021c = new C0096a();
        }
        MenuItem menuItem2 = this.f1021c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem m52a = C0027d.m52a(this.f1020b, interfaceMenuItemC0090b);
        this.f1021c.put(interfaceMenuItemC0090b, m52a);
        return m52a;
    }

    /* renamed from: a */
    public final SubMenu m668a(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC0091c)) {
            return subMenu;
        }
        InterfaceSubMenuC0091c interfaceSubMenuC0091c = (InterfaceSubMenuC0091c) subMenu;
        if (this.f1022d == null) {
            this.f1022d = new C0096a();
        }
        SubMenu subMenu2 = this.f1022d.get(interfaceSubMenuC0091c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0215v subMenuC0215v = new SubMenuC0215v(this.f1020b, interfaceSubMenuC0091c);
        this.f1022d.put(interfaceSubMenuC0091c, subMenuC0215v);
        return subMenuC0215v;
    }
}
