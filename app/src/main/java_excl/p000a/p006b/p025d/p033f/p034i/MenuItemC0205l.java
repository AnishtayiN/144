package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p021h.AbstractC0108c;
import p000a.p006b.p025d.p033f.InterfaceC0187b;

/* renamed from: a.b.d.f.i.l */
/* loaded from: classes.dex */
public class MenuItemC0205l extends AbstractC0196c<InterfaceMenuItemC0090b> implements MenuItem {

    /* renamed from: e */
    public Method f1141e;

    /* renamed from: a.b.d.f.i.l$a */
    public class a extends AbstractC0108c {

        /* renamed from: b */
        public final ActionProvider f1142b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1142b = actionProvider;
        }
    }

    /* renamed from: a.b.d.f.i.l$b */
    public static class b extends FrameLayout implements InterfaceC0187b {

        /* renamed from: b */
        public final CollapsibleActionView f1144b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f1144b = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // p000a.p006b.p025d.p033f.InterfaceC0187b
        /* renamed from: a */
        public void mo644a() {
            this.f1144b.onActionViewExpanded();
        }

        @Override // p000a.p006b.p025d.p033f.InterfaceC0187b
        /* renamed from: b */
        public void mo645b() {
            this.f1144b.onActionViewCollapsed();
        }
    }

    /* renamed from: a.b.d.f.i.l$c */
    public class c extends C0197d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        public c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1023a).onMenuItemActionCollapse(MenuItemC0205l.this.m667a(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.f1023a).onMenuItemActionExpand(MenuItemC0205l.this.m667a(menuItem));
        }
    }

    /* renamed from: a.b.d.f.i.l$d */
    public class d extends C0197d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.f1023a).onMenuItemClick(MenuItemC0205l.this.m667a(menuItem));
        }
    }

    public MenuItemC0205l(Context context, InterfaceMenuItemC0090b interfaceMenuItemC0090b) {
        super(context, interfaceMenuItemC0090b);
    }

    /* renamed from: a */
    public a mo728a(ActionProvider actionProvider) {
        return new a(this.f1020b, actionProvider);
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return ((InterfaceMenuItemC0090b) this.f1023a).collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return ((InterfaceMenuItemC0090b) this.f1023a).expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0108c mo364a = ((InterfaceMenuItemC0090b) this.f1023a).mo364a();
        if (mo364a instanceof a) {
            return ((a) mo364a).f1142b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = ((InterfaceMenuItemC0090b) this.f1023a).getActionView();
        return actionView instanceof b ? (View) ((b) actionView).f1144b : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m668a(((InterfaceMenuItemC0090b) this.f1023a).getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return ((InterfaceMenuItemC0090b) this.f1023a).getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return ((InterfaceMenuItemC0090b) this.f1023a).hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return ((InterfaceMenuItemC0090b) this.f1023a).isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return ((InterfaceMenuItemC0090b) this.f1023a).isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return ((InterfaceMenuItemC0090b) this.f1023a).isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return ((InterfaceMenuItemC0090b) this.f1023a).isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return ((InterfaceMenuItemC0090b) this.f1023a).isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((InterfaceMenuItemC0090b) this.f1023a).mo363a(actionProvider != null ? mo728a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        ((InterfaceMenuItemC0090b) this.f1023a).setActionView(i);
        View actionView = ((InterfaceMenuItemC0090b) this.f1023a).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((InterfaceMenuItemC0090b) this.f1023a).setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((InterfaceMenuItemC0090b) this.f1023a).setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        ((InterfaceMenuItemC0090b) this.f1023a).setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        ((InterfaceMenuItemC0090b) this.f1023a).setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        ((InterfaceMenuItemC0090b) this.f1023a).setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        ((InterfaceMenuItemC0090b) this.f1023a).setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        ((InterfaceMenuItemC0090b) this.f1023a).setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        ((InterfaceMenuItemC0090b) this.f1023a).setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        ((InterfaceMenuItemC0090b) this.f1023a).setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        ((InterfaceMenuItemC0090b) this.f1023a).setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((InterfaceMenuItemC0090b) this.f1023a).setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        ((InterfaceMenuItemC0090b) this.f1023a).setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        ((InterfaceMenuItemC0090b) this.f1023a).setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        ((InterfaceMenuItemC0090b) this.f1023a).setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        ((InterfaceMenuItemC0090b) this.f1023a).setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((InterfaceMenuItemC0090b) this.f1023a).setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((InterfaceMenuItemC0090b) this.f1023a).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        ((InterfaceMenuItemC0090b) this.f1023a).setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        ((InterfaceMenuItemC0090b) this.f1023a).setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        ((InterfaceMenuItemC0090b) this.f1023a).setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        ((InterfaceMenuItemC0090b) this.f1023a).setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        ((InterfaceMenuItemC0090b) this.f1023a).setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        ((InterfaceMenuItemC0090b) this.f1023a).setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((InterfaceMenuItemC0090b) this.f1023a).setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        ((InterfaceMenuItemC0090b) this.f1023a).setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return ((InterfaceMenuItemC0090b) this.f1023a).setVisible(z);
    }
}
