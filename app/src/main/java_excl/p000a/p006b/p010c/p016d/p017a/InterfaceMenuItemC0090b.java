package p000a.p006b.p010c.p016d.p017a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import p000a.p006b.p010c.p021h.AbstractC0108c;

/* renamed from: a.b.c.d.a.b */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC0090b extends MenuItem {
    /* renamed from: a */
    InterfaceMenuItemC0090b mo363a(AbstractC0108c abstractC0108c);

    /* renamed from: a */
    AbstractC0108c mo364a();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0090b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i);

    @Override // android.view.MenuItem
    InterfaceMenuItemC0090b setTooltipText(CharSequence charSequence);
}
