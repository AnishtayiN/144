package p000a.p006b.p025d.p033f.p034i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p006b.p010c.p012b.C0067a;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuC0089a;
import p000a.p006b.p010c.p021h.C0120o;

/* renamed from: a.b.d.f.i.h */
/* loaded from: classes.dex */
public class C0201h implements InterfaceMenuC0089a {

    /* renamed from: A */
    public static final int[] f1078A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f1079a;

    /* renamed from: b */
    public final Resources f1080b;

    /* renamed from: c */
    public boolean f1081c;

    /* renamed from: d */
    public boolean f1082d;

    /* renamed from: e */
    public a f1083e;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f1091m;

    /* renamed from: n */
    public CharSequence f1092n;

    /* renamed from: o */
    public Drawable f1093o;

    /* renamed from: p */
    public View f1094p;

    /* renamed from: x */
    public C0204k f1102x;

    /* renamed from: z */
    public boolean f1104z;

    /* renamed from: l */
    public int f1090l = 0;

    /* renamed from: q */
    public boolean f1095q = false;

    /* renamed from: r */
    public boolean f1096r = false;

    /* renamed from: s */
    public boolean f1097s = false;

    /* renamed from: t */
    public boolean f1098t = false;

    /* renamed from: u */
    public boolean f1099u = false;

    /* renamed from: v */
    public ArrayList<C0204k> f1100v = new ArrayList<>();

    /* renamed from: w */
    public CopyOnWriteArrayList<WeakReference<InterfaceC0209p>> f1101w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    public boolean f1103y = false;

    /* renamed from: f */
    public ArrayList<C0204k> f1084f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C0204k> f1085g = new ArrayList<>();

    /* renamed from: h */
    public boolean f1086h = true;

    /* renamed from: i */
    public ArrayList<C0204k> f1087i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C0204k> f1088j = new ArrayList<>();

    /* renamed from: k */
    public boolean f1089k = true;

    /* renamed from: a.b.d.f.i.h$a */
    public interface a {
        /* renamed from: a */
        void mo559a(C0201h c0201h);

        /* renamed from: a */
        boolean mo561a(C0201h c0201h, MenuItem menuItem);
    }

    /* renamed from: a.b.d.f.i.h$b */
    public interface b {
        /* renamed from: a */
        boolean mo717a(C0204k c0204k);
    }

    public C0201h(Context context) {
        this.f1079a = context;
        this.f1080b = context.getResources();
        this.f1082d = this.f1080b.getConfiguration().keyboard != 1 && C0120o.m487a(ViewConfiguration.get(this.f1079a), this.f1079a);
    }

    /* renamed from: a */
    public C0204k m688a(int i, KeyEvent keyEvent) {
        ArrayList<C0204k> arrayList = this.f1100v;
        arrayList.clear();
        m698a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo711f = mo711f();
        for (int i2 = 0; i2 < size; i2++) {
            C0204k c0204k = arrayList.get(i2);
            char c2 = mo711f ? c0204k.f1123j : c0204k.f1121h;
            if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (mo711f && c2 == '\b' && i == 67))) {
                return c0204k;
            }
        }
        return null;
    }

    /* renamed from: a */
    public MenuItem m689a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f1078A;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                C0204k c0204k = new C0204k(this, i, i2, i3, i6, charSequence, this.f1090l);
                ContextMenu.ContextMenuInfo contextMenuInfo = this.f1091m;
                if (contextMenuInfo != null) {
                    c0204k.f1113E = contextMenuInfo;
                }
                ArrayList<C0204k> arrayList = this.f1084f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    }
                    if (arrayList.get(size).f1117d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, c0204k);
                m706b(true);
                return c0204k;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public void m690a() {
        ArrayList<C0204k> m709d = m709d();
        if (this.f1089k) {
            Iterator<WeakReference<InterfaceC0209p>> it = this.f1101w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0209p> next = it.next();
                InterfaceC0209p interfaceC0209p = next.get();
                if (interfaceC0209p == null) {
                    this.f1101w.remove(next);
                } else {
                    z |= interfaceC0209p.mo673a();
                }
            }
            if (z) {
                this.f1087i.clear();
                this.f1088j.clear();
                int size = m709d.size();
                for (int i = 0; i < size; i++) {
                    C0204k c0204k = m709d.get(i);
                    if (c0204k.m725d()) {
                        this.f1087i.add(c0204k);
                    } else {
                        this.f1088j.add(c0204k);
                    }
                }
            } else {
                this.f1087i.clear();
                this.f1088j.clear();
                this.f1088j.addAll(m709d());
            }
            this.f1089k = false;
        }
    }

    /* renamed from: a */
    public final void m691a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f1080b;
        if (view != null) {
            this.f1094p = view;
            this.f1092n = null;
            this.f1093o = null;
        } else {
            if (i > 0) {
                this.f1092n = resources.getText(i);
            } else if (charSequence != null) {
                this.f1092n = charSequence;
            }
            if (i2 > 0) {
                this.f1093o = C0067a.m320b(this.f1079a, i2);
            } else if (drawable != null) {
                this.f1093o = drawable;
            }
            this.f1094p = null;
        }
        m706b(false);
    }

    /* renamed from: a */
    public final void m692a(int i, boolean z) {
        if (i < 0 || i >= this.f1084f.size()) {
            return;
        }
        this.f1084f.remove(i);
        if (z) {
            m706b(true);
        }
    }

    /* renamed from: a */
    public void mo693a(a aVar) {
        this.f1083e = aVar;
    }

    /* renamed from: a */
    public void m694a(InterfaceC0209p interfaceC0209p) {
        Iterator<WeakReference<InterfaceC0209p>> it = this.f1101w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0209p> next = it.next();
            InterfaceC0209p interfaceC0209p2 = next.get();
            if (interfaceC0209p2 == null || interfaceC0209p2 == interfaceC0209p) {
                this.f1101w.remove(next);
            }
        }
    }

    /* renamed from: a */
    public void m695a(InterfaceC0209p interfaceC0209p, Context context) {
        this.f1101w.add(new WeakReference<>(interfaceC0209p));
        interfaceC0209p.mo661a(context, this);
        this.f1089k = true;
    }

    /* renamed from: a */
    public void m696a(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo704b());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0214u) item.getSubMenu()).m696a(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: a */
    public void m697a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1084f.size();
        m716k();
        for (int i = 0; i < size; i++) {
            C0204k c0204k = this.f1084f.get(i);
            if (c0204k.f1115b == groupId && c0204k.m726e() && c0204k.isCheckable()) {
                c0204k.m720a(c0204k == menuItem);
            }
        }
        m715j();
    }

    /* renamed from: a */
    public void m698a(List<C0204k> list, int i, KeyEvent keyEvent) {
        boolean mo711f = mo711f();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1084f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0204k c0204k = this.f1084f.get(i2);
                if (c0204k.hasSubMenu()) {
                    c0204k.f1128o.m698a(list, i, keyEvent);
                }
                char c2 = mo711f ? c0204k.f1123j : c0204k.f1121h;
                if (((modifiers & 69647) == ((mo711f ? c0204k.f1124k : c0204k.f1122i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (mo711f && c2 == '\b' && i == 67)) && c0204k.isEnabled()) {
                        list.add(c0204k);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m699a(boolean z) {
        if (this.f1099u) {
            return;
        }
        this.f1099u = true;
        Iterator<WeakReference<InterfaceC0209p>> it = this.f1101w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0209p> next = it.next();
            InterfaceC0209p interfaceC0209p = next.get();
            if (interfaceC0209p == null) {
                this.f1101w.remove(next);
            } else {
                interfaceC0209p.mo659a(this, z);
            }
        }
        this.f1099u = false;
    }

    /* renamed from: a */
    public boolean mo700a(C0201h c0201h, MenuItem menuItem) {
        a aVar = this.f1083e;
        return aVar != null && aVar.mo561a(c0201h, menuItem);
    }

    /* renamed from: a */
    public boolean mo701a(C0204k c0204k) {
        boolean z = false;
        if (!this.f1101w.isEmpty() && this.f1102x == c0204k) {
            m716k();
            Iterator<WeakReference<InterfaceC0209p>> it = this.f1101w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0209p> next = it.next();
                InterfaceC0209p interfaceC0209p = next.get();
                if (interfaceC0209p == null) {
                    this.f1101w.remove(next);
                } else {
                    z = interfaceC0209p.mo666b(this, c0204k);
                    if (z) {
                        break;
                    }
                }
            }
            m715j();
            if (z) {
                this.f1102x = null;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m702a(MenuItem menuItem, int i) {
        return m703a(menuItem, (InterfaceC0209p) null, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m703a(android.view.MenuItem r7, p000a.p006b.p025d.p033f.p034i.InterfaceC0209p r8, int r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p033f.p034i.C0201h.m703a(android.view.MenuItem, a.b.d.f.i.p, int):boolean");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m689a(0, 0, 0, this.f1080b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m689a(i, i2, i3, this.f1080b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m689a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m689a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f1079a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = m689a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1080b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1080b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0204k c0204k = (C0204k) m689a(i, i2, i3, charSequence);
        SubMenuC0214u subMenuC0214u = new SubMenuC0214u(this.f1079a, this, c0204k);
        c0204k.f1128o = subMenuC0214u;
        subMenuC0214u.setHeaderTitle(c0204k.f1118e);
        return subMenuC0214u;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public String mo704b() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: b */
    public void m705b(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0214u) item.getSubMenu()).m705b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo704b(), sparseArray);
        }
    }

    /* renamed from: b */
    public void m706b(boolean z) {
        if (this.f1095q) {
            this.f1096r = true;
            if (z) {
                this.f1097s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f1086h = true;
            this.f1089k = true;
        }
        if (this.f1101w.isEmpty()) {
            return;
        }
        m716k();
        Iterator<WeakReference<InterfaceC0209p>> it = this.f1101w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0209p> next = it.next();
            InterfaceC0209p interfaceC0209p = next.get();
            if (interfaceC0209p == null) {
                this.f1101w.remove(next);
            } else {
                interfaceC0209p.mo662a(z);
            }
        }
        m715j();
    }

    /* renamed from: b */
    public boolean mo707b(C0204k c0204k) {
        boolean z = false;
        if (this.f1101w.isEmpty()) {
            return false;
        }
        m716k();
        Iterator<WeakReference<InterfaceC0209p>> it = this.f1101w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0209p> next = it.next();
            InterfaceC0209p interfaceC0209p = next.get();
            if (interfaceC0209p == null) {
                this.f1101w.remove(next);
            } else {
                z = interfaceC0209p.mo663a(this, c0204k);
                if (z) {
                    break;
                }
            }
        }
        m715j();
        if (z) {
            this.f1102x = c0204k;
        }
        return z;
    }

    /* renamed from: c */
    public C0201h mo708c() {
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C0204k c0204k = this.f1102x;
        if (c0204k != null) {
            mo701a(c0204k);
        }
        this.f1084f.clear();
        m706b(true);
    }

    public void clearHeader() {
        this.f1093o = null;
        this.f1092n = null;
        this.f1094p = null;
        m706b(false);
    }

    @Override // android.view.Menu
    public void close() {
        m699a(true);
    }

    /* renamed from: d */
    public ArrayList<C0204k> m709d() {
        if (!this.f1086h) {
            return this.f1085g;
        }
        this.f1085g.clear();
        int size = this.f1084f.size();
        for (int i = 0; i < size; i++) {
            C0204k c0204k = this.f1084f.get(i);
            if (c0204k.isVisible()) {
                this.f1085g.add(c0204k);
            }
        }
        this.f1086h = false;
        this.f1089k = true;
        return this.f1085g;
    }

    /* renamed from: e */
    public boolean mo710e() {
        return this.f1103y;
    }

    /* renamed from: f */
    public boolean mo711f() {
        return this.f1081c;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0204k c0204k = this.f1084f.get(i2);
            if (c0204k.f1114a == i) {
                return c0204k;
            }
            if (c0204k.hasSubMenu() && (findItem = c0204k.f1128o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo712g() {
        return this.f1082d;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1084f.get(i);
    }

    /* renamed from: h */
    public void m713h() {
        this.f1089k = true;
        m706b(true);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1104z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1084f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m714i() {
        this.f1086h = true;
        m706b(true);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m688a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public void m715j() {
        this.f1095q = false;
        if (this.f1096r) {
            this.f1096r = false;
            m706b(this.f1097s);
        }
    }

    /* renamed from: k */
    public void m716k() {
        if (this.f1095q) {
            return;
        }
        this.f1095q = true;
        this.f1096r = false;
        this.f1097s = false;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m702a(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0204k m688a = m688a(i, keyEvent);
        boolean m703a = m688a != null ? m703a(m688a, (InterfaceC0209p) null, i2) : false;
        if ((i2 & 2) != 0) {
            m699a(true);
        }
        return m703a;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f1084f.get(i2).f1115b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f1084f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f1084f.get(i2).f1115b != i) {
                    break;
                }
                m692a(i2, false);
                i3 = i4;
            }
            m706b(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f1084f.get(i2).f1114a == i) {
                break;
            } else {
                i2++;
            }
        }
        m692a(i2, true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1084f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0204k c0204k = this.f1084f.get(i2);
            if (c0204k.f1115b == i) {
                c0204k.f1138y = (c0204k.f1138y & (-5)) | (z2 ? 4 : 0);
                c0204k.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1103y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1084f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0204k c0204k = this.f1084f.get(i2);
            if (c0204k.f1115b == i) {
                c0204k.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1084f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0204k c0204k = this.f1084f.get(i2);
            if (c0204k.f1115b == i && c0204k.m724c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m706b(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1081c = z;
        m706b(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1084f.size();
    }
}
