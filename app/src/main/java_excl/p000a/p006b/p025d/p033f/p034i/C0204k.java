package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p021h.AbstractC0108c;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.f.i.k */
/* loaded from: classes.dex */
public final class C0204k implements InterfaceMenuItemC0090b {

    /* renamed from: A */
    public View f1109A;

    /* renamed from: B */
    public AbstractC0108c f1110B;

    /* renamed from: C */
    public MenuItem.OnActionExpandListener f1111C;

    /* renamed from: E */
    public ContextMenu.ContextMenuInfo f1113E;

    /* renamed from: a */
    public final int f1114a;

    /* renamed from: b */
    public final int f1115b;

    /* renamed from: c */
    public final int f1116c;

    /* renamed from: d */
    public final int f1117d;

    /* renamed from: e */
    public CharSequence f1118e;

    /* renamed from: f */
    public CharSequence f1119f;

    /* renamed from: g */
    public Intent f1120g;

    /* renamed from: h */
    public char f1121h;

    /* renamed from: j */
    public char f1123j;

    /* renamed from: l */
    public Drawable f1125l;

    /* renamed from: n */
    public C0201h f1127n;

    /* renamed from: o */
    public SubMenuC0214u f1128o;

    /* renamed from: p */
    public Runnable f1129p;

    /* renamed from: q */
    public MenuItem.OnMenuItemClickListener f1130q;

    /* renamed from: r */
    public CharSequence f1131r;

    /* renamed from: s */
    public CharSequence f1132s;

    /* renamed from: z */
    public int f1139z;

    /* renamed from: i */
    public int f1122i = 4096;

    /* renamed from: k */
    public int f1124k = 4096;

    /* renamed from: m */
    public int f1126m = 0;

    /* renamed from: t */
    public ColorStateList f1133t = null;

    /* renamed from: u */
    public PorterDuff.Mode f1134u = null;

    /* renamed from: v */
    public boolean f1135v = false;

    /* renamed from: w */
    public boolean f1136w = false;

    /* renamed from: x */
    public boolean f1137x = false;

    /* renamed from: y */
    public int f1138y = 16;

    /* renamed from: D */
    public boolean f1112D = false;

    /* renamed from: a.b.d.f.i.k$a */
    public class a implements AbstractC0108c.b {
        public a() {
        }
    }

    public C0204k(C0201h c0201h, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1139z = 0;
        this.f1127n = c0201h;
        this.f1114a = i2;
        this.f1115b = i;
        this.f1116c = i3;
        this.f1117d = i4;
        this.f1118e = charSequence;
        this.f1139z = i5;
    }

    /* renamed from: a */
    public static void m718a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b
    /* renamed from: a */
    public InterfaceMenuItemC0090b mo363a(AbstractC0108c abstractC0108c) {
        AbstractC0108c abstractC0108c2 = this.f1110B;
        if (abstractC0108c2 != null) {
            abstractC0108c2.f593a = null;
        }
        this.f1109A = null;
        this.f1110B = abstractC0108c;
        this.f1127n.m706b(true);
        AbstractC0108c abstractC0108c3 = this.f1110B;
        if (abstractC0108c3 != null) {
            abstractC0108c3.mo440a(new a());
        }
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b
    /* renamed from: a */
    public AbstractC0108c mo364a() {
        return this.f1110B;
    }

    /* renamed from: a */
    public final Drawable m719a(Drawable drawable) {
        if (drawable != null && this.f1137x && (this.f1135v || this.f1136w)) {
            drawable = C0027d.m91b(drawable).mutate();
            if (this.f1135v) {
                C0027d.m65a(drawable, this.f1133t);
            }
            if (this.f1136w) {
                C0027d.m66a(drawable, this.f1134u);
            }
            this.f1137x = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public void m720a(boolean z) {
        int i = this.f1138y;
        this.f1138y = (z ? 2 : 0) | (i & (-3));
        if (i != this.f1138y) {
            this.f1127n.m706b(false);
        }
    }

    /* renamed from: b */
    public char m721b() {
        return this.f1127n.mo711f() ? this.f1123j : this.f1121h;
    }

    /* renamed from: b */
    public void m722b(boolean z) {
        if (z) {
            this.f1138y |= 32;
        } else {
            this.f1138y &= -33;
        }
    }

    /* renamed from: c */
    public boolean m723c() {
        AbstractC0108c abstractC0108c;
        if ((this.f1139z & 8) == 0) {
            return false;
        }
        if (this.f1109A == null && (abstractC0108c = this.f1110B) != null) {
            this.f1109A = abstractC0108c.mo439a(this);
        }
        return this.f1109A != null;
    }

    /* renamed from: c */
    public boolean m724c(boolean z) {
        int i = this.f1138y;
        this.f1138y = (z ? 0 : 8) | (i & (-9));
        return i != this.f1138y;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1139z & 8) == 0) {
            return false;
        }
        if (this.f1109A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1111C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1127n.mo701a(this);
        }
        return false;
    }

    /* renamed from: d */
    public boolean m725d() {
        return (this.f1138y & 32) == 32;
    }

    /* renamed from: e */
    public boolean m726e() {
        return (this.f1138y & 4) != 0;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m723c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1111C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1127n.mo707b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean m727f() {
        return this.f1127n.mo712g() && m721b() != 0;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1109A;
        if (view != null) {
            return view;
        }
        AbstractC0108c abstractC0108c = this.f1110B;
        if (abstractC0108c == null) {
            return null;
        }
        this.f1109A = abstractC0108c.mo439a(this);
        return this.f1109A;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1124k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1123j;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1131r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1115b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1125l;
        if (drawable != null) {
            return m719a(drawable);
        }
        int i = this.f1126m;
        if (i == 0) {
            return null;
        }
        Drawable m618c = C0181a.m618c(this.f1127n.f1079a, i);
        this.f1126m = 0;
        this.f1125l = m618c;
        return m719a(m618c);
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1133t;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1134u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1120g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1114a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1113E;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1122i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1121h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1116c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1128o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1118e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1119f;
        if (charSequence == null) {
            charSequence = this.f1118e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1132s;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1128o != null;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1112D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1138y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1138y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1138y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0108c abstractC0108c = this.f1110B;
        return (abstractC0108c == null || !abstractC0108c.mo442b()) ? (this.f1138y & 8) == 0 : (this.f1138y & 8) == 0 && this.f1110B.mo441a();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public InterfaceMenuItemC0090b setActionView(View view) {
        int i;
        this.f1109A = view;
        this.f1110B = null;
        if (view != null && view.getId() == -1 && (i = this.f1114a) > 0) {
            view.setId(i);
        }
        this.f1127n.m713h();
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.f1127n.f1079a;
        setActionView(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }


    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f1123j == c2) {
            return this;
        }
        this.f1123j = Character.toLowerCase(c2);
        this.f1127n.m706b(false);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f1123j == c2 && this.f1124k == i) {
            return this;
        }
        this.f1123j = Character.toLowerCase(c2);
        this.f1124k = KeyEvent.normalizeMetaState(i);
        this.f1127n.m706b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1138y;
        this.f1138y = (z ? 1 : 0) | (i & (-2));
        if (i != this.f1138y) {
            this.f1127n.m706b(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1138y & 4) != 0) {
            this.f1127n.m697a((MenuItem) this);
        } else {
            m720a(z);
        }
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public InterfaceMenuItemC0090b setContentDescription(CharSequence charSequence) {
        this.f1131r = charSequence;
        this.f1127n.m706b(false);
        return this;
    }


    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1138y |= 16;
        } else {
            this.f1138y &= -17;
        }
        this.f1127n.m706b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1125l = null;
        this.f1126m = i;
        this.f1137x = true;
        this.f1127n.m706b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1126m = 0;
        this.f1125l = drawable;
        this.f1137x = true;
        this.f1127n.m706b(false);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1133t = colorStateList;
        this.f1135v = true;
        this.f1137x = true;
        this.f1127n.m706b(false);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1134u = mode;
        this.f1136w = true;
        this.f1137x = true;
        this.f1127n.m706b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1120g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f1121h == c2) {
            return this;
        }
        this.f1121h = c2;
        this.f1127n.m706b(false);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        if (this.f1121h == c2 && this.f1122i == i) {
            return this;
        }
        this.f1121h = c2;
        this.f1122i = KeyEvent.normalizeMetaState(i);
        this.f1127n.m706b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1111C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1130q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1121h = c2;
        this.f1123j = Character.toLowerCase(c3);
        this.f1127n.m706b(false);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f1121h = c2;
        this.f1122i = KeyEvent.normalizeMetaState(i);
        this.f1123j = Character.toLowerCase(c3);
        this.f1124k = KeyEvent.normalizeMetaState(i2);
        this.f1127n.m706b(false);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1139z = i;
        this.f1127n.m713h();
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f1127n.f1079a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1118e = charSequence;
        this.f1127n.m706b(false);
        SubMenuC0214u subMenuC0214u = this.f1128o;
        if (subMenuC0214u != null) {
            subMenuC0214u.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1119f = charSequence;
        this.f1127n.m706b(false);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public InterfaceMenuItemC0090b setTooltipText(CharSequence charSequence) {
        this.f1132s = charSequence;
        this.f1127n.m706b(false);
        return this;
    }


    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m724c(z)) {
            C0201h c0201h = this.f1127n;
            c0201h.f1086h = true;
            c0201h.m706b(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1118e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
