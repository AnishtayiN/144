package p000a.p006b.p025d.p033f.p034i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuC0089a;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p016d.p017a.InterfaceSubMenuC0091c;

/* renamed from: a.b.d.f.i.r */
/* loaded from: classes.dex */
public class MenuC0211r extends AbstractC0196c<InterfaceMenuC0089a> implements Menu {
    public MenuC0211r(Context context, InterfaceMenuC0089a interfaceMenuC0089a) {
        super(context, interfaceMenuC0089a);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m667a(((InterfaceMenuC0089a) this.f1023a).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m667a(((InterfaceMenuC0089a) this.f1023a).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m667a(((InterfaceMenuC0089a) this.f1023a).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m667a(((InterfaceMenuC0089a) this.f1023a).add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = ((InterfaceMenuC0089a) this.f1023a).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m667a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m668a(((InterfaceMenuC0089a) this.f1023a).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m668a(((InterfaceMenuC0089a) this.f1023a).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m668a(((InterfaceMenuC0089a) this.f1023a).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m668a(((InterfaceMenuC0089a) this.f1023a).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        Map<InterfaceMenuItemC0090b, MenuItem> map = this.f1021c;
        if (map != null) {
            map.clear();
        }
        Map<InterfaceSubMenuC0091c, SubMenu> map2 = this.f1022d;
        if (map2 != null) {
            map2.clear();
        }
        ((InterfaceMenuC0089a) this.f1023a).clear();
    }

    @Override // android.view.Menu
    public void close() {
        ((InterfaceMenuC0089a) this.f1023a).close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m667a(((InterfaceMenuC0089a) this.f1023a).findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m667a(((InterfaceMenuC0089a) this.f1023a).getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((InterfaceMenuC0089a) this.f1023a).hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((InterfaceMenuC0089a) this.f1023a).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((InterfaceMenuC0089a) this.f1023a).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((InterfaceMenuC0089a) this.f1023a).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        Map<InterfaceMenuItemC0090b, MenuItem> map = this.f1021c;
        if (map != null) {
            Iterator<InterfaceMenuItemC0090b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
        ((InterfaceMenuC0089a) this.f1023a).removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        Map<InterfaceMenuItemC0090b, MenuItem> map = this.f1021c;
        if (map != null) {
            Iterator<InterfaceMenuItemC0090b> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (i == it.next().getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((InterfaceMenuC0089a) this.f1023a).removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((InterfaceMenuC0089a) this.f1023a).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((InterfaceMenuC0089a) this.f1023a).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((InterfaceMenuC0089a) this.f1023a).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((InterfaceMenuC0089a) this.f1023a).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return ((InterfaceMenuC0089a) this.f1023a).size();
    }
}
