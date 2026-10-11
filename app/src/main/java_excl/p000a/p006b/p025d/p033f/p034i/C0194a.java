package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p012b.C0067a;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p021h.AbstractC0108c;

/* renamed from: a.b.d.f.i.a */
/* loaded from: classes.dex */
public class C0194a implements InterfaceMenuItemC0090b {

    /* renamed from: a */
    public final int f993a;

    /* renamed from: b */
    public final int f994b;

    /* renamed from: c */
    public final int f995c;

    /* renamed from: d */
    public CharSequence f996d;

    /* renamed from: e */
    public CharSequence f997e;

    /* renamed from: f */
    public Intent f998f;

    /* renamed from: g */
    public char f999g;

    /* renamed from: i */
    public char f1001i;

    /* renamed from: k */
    public Drawable f1003k;

    /* renamed from: l */
    public Context f1004l;

    /* renamed from: m */
    public CharSequence f1005m;

    /* renamed from: n */
    public CharSequence f1006n;

    /* renamed from: h */
    public int f1000h = 4096;

    /* renamed from: j */
    public int f1002j = 4096;

    /* renamed from: o */
    public ColorStateList f1007o = null;

    /* renamed from: p */
    public PorterDuff.Mode f1008p = null;

    /* renamed from: q */
    public boolean f1009q = false;

    /* renamed from: r */
    public boolean f1010r = false;

    /* renamed from: s */
    public int f1011s = 16;

    public C0194a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1004l = context;
        this.f993a = i2;
        this.f994b = i;
        this.f995c = i4;
        this.f996d = charSequence;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b
    /* renamed from: a */
    public InterfaceMenuItemC0090b mo363a(AbstractC0108c abstractC0108c) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b
    /* renamed from: a */
    public AbstractC0108c mo364a() {
        return null;
    }

    /* renamed from: b */
    public final void m656b() {
        if (this.f1003k != null) {
            if (this.f1009q || this.f1010r) {
                this.f1003k = C0027d.m91b(this.f1003k);
                this.f1003k = this.f1003k.mutate();
                if (this.f1009q) {
                    C0027d.m65a(this.f1003k, this.f1007o);
                }
                if (this.f1010r) {
                    C0027d.m66a(this.f1003k, this.f1008p);
                }
            }
        }
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1002j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1001i;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1005m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f994b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1003k;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1007o;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1008p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f998f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f993a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1000h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f999g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f995c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f996d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f997e;
        return charSequence != null ? charSequence : this.f996d;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1006n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1011s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1011s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1011s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1011s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1001i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f1001i = Character.toLowerCase(c2);
        this.f1002j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1011s = (z ? 1 : 0) | (this.f1011s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1011s = (z ? 2 : 0) | (this.f1011s & (-3));
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public InterfaceMenuItemC0090b setContentDescription(CharSequence charSequence) {
        this.f1005m = charSequence;
        return this;
    }


    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1011s = (z ? 16 : 0) | (this.f1011s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1003k = C0067a.m320b(this.f1004l, i);
        m656b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1003k = drawable;
        m656b();
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1007o = colorStateList;
        this.f1009q = true;
        m656b();
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1008p = mode;
        this.f1010r = true;
        m656b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f998f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f999g = c2;
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f999g = c2;
        this.f1000h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f999g = c2;
        this.f1001i = Character.toLowerCase(c3);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f999g = c2;
        this.f1000h = KeyEvent.normalizeMetaState(i);
        this.f1001i = Character.toLowerCase(c3);
        this.f1002j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f996d = this.f1004l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f996d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f997e = charSequence;
        return this;
    }

    @Override // p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b, android.view.MenuItem
    public InterfaceMenuItemC0090b setTooltipText(CharSequence charSequence) {
        this.f1006n = charSequence;
        return this;
    }


    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f1011s = (this.f1011s & 8) | (z ? 0 : 8);
        return this;
    }
}
