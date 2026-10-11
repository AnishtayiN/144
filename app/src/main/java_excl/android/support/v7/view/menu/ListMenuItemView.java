package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p027b.C0173h;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.p034i.C0204k;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;
import p000a.p006b.p025d.p035g.C0224c1;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0210q.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public C0204k f1751b;

    /* renamed from: c */
    public ImageView f1752c;

    /* renamed from: d */
    public RadioButton f1753d;

    /* renamed from: e */
    public TextView f1754e;

    /* renamed from: f */
    public CheckBox f1755f;

    /* renamed from: g */
    public TextView f1756g;

    /* renamed from: h */
    public ImageView f1757h;

    /* renamed from: i */
    public ImageView f1758i;

    /* renamed from: j */
    public LinearLayout f1759j;

    /* renamed from: k */
    public Drawable f1760k;

    /* renamed from: l */
    public int f1761l;

    /* renamed from: m */
    public Context f1762m;

    /* renamed from: n */
    public boolean f1763n;

    /* renamed from: o */
    public Drawable f1764o;

    /* renamed from: p */
    public boolean f1765p;

    /* renamed from: q */
    public LayoutInflater f1766q;

    /* renamed from: r */
    public boolean f1767r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0166a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0224c1 m775a = C0224c1.m775a(getContext(), attributeSet, C0175j.MenuView, i, 0);
        this.f1760k = m775a.m781b(C0175j.MenuView_android_itemBackground);
        this.f1761l = m775a.m788f(C0175j.MenuView_android_itemTextAppearance, -1);
        this.f1763n = m775a.m779a(C0175j.MenuView_preserveIconSpacing, false);
        this.f1762m = context;
        this.f1764o = m775a.m781b(C0175j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C0166a.dropDownListViewStyle, 0);
        this.f1765p = obtainStyledAttributes.hasValue(0);
        m775a.f1236b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1766q == null) {
            this.f1766q = LayoutInflater.from(getContext());
        }
        return this.f1766q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f1757h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m1019a() {
        this.f1755f = (CheckBox) getInflater().inflate(C0172g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        m1020a(this.f1755f);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0210q.a
    /* renamed from: a */
    public void mo739a(C0204k c0204k, int i) {
        this.f1751b = c0204k;
        setVisibility(c0204k.isVisible() ? 0 : 8);
        setTitle(mo740c() ? c0204k.getTitleCondensed() : c0204k.f1118e);
        setCheckable(c0204k.isCheckable());
        boolean m727f = c0204k.m727f();
        c0204k.m721b();
        m1022a(m727f);
        setIcon(c0204k.getIcon());
        setEnabled(c0204k.isEnabled());
        setSubMenuArrowVisible(c0204k.hasSubMenu());
        setContentDescription(c0204k.f1131r);
    }

    /* renamed from: a */
    public final void m1020a(View view) {
        LinearLayout linearLayout = this.f1759j;
        if (linearLayout != null) {
            linearLayout.addView(view, -1);
        } else {
            addView(view, -1);
        }
    }

    /* renamed from: a */
    public final void m1021a(View view, int i) {
        LinearLayout linearLayout = this.f1759j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: a */
    public void m1022a(boolean z) {
        String sb;
        int i = (z && this.f1751b.m727f()) ? 0 : 8;
        if (i == 0) {
            TextView textView = this.f1756g;
            C0204k c0204k = this.f1751b;
            char m721b = c0204k.m721b();
            if (m721b == 0) {
                sb = "";
            } else {
                Resources resources = c0204k.f1127n.f1079a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(c0204k.f1127n.f1079a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(C0173h.abc_prepend_shortcut_label));
                }
                int i2 = c0204k.f1127n.mo711f() ? c0204k.f1124k : c0204k.f1122i;
                C0204k.m718a(sb2, i2, 65536, resources.getString(C0173h.abc_menu_meta_shortcut_label));
                C0204k.m718a(sb2, i2, 4096, resources.getString(C0173h.abc_menu_ctrl_shortcut_label));
                C0204k.m718a(sb2, i2, 2, resources.getString(C0173h.abc_menu_alt_shortcut_label));
                C0204k.m718a(sb2, i2, 1, resources.getString(C0173h.abc_menu_shift_shortcut_label));
                C0204k.m718a(sb2, i2, 4, resources.getString(C0173h.abc_menu_sym_shortcut_label));
                C0204k.m718a(sb2, i2, 8, resources.getString(C0173h.abc_menu_function_shortcut_label));
                if (m721b == '\b') {
                    sb2.append(resources.getString(C0173h.abc_menu_delete_shortcut_label));
                } else if (m721b == '\n') {
                    sb2.append(resources.getString(C0173h.abc_menu_enter_shortcut_label));
                } else if (m721b != ' ') {
                    sb2.append(m721b);
                } else {
                    sb2.append(resources.getString(C0173h.abc_menu_space_shortcut_label));
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f1756g.getVisibility() != i) {
            this.f1756g.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1758i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1758i.getLayoutParams();
        rect.top = this.f1758i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* renamed from: b */
    public final void m1023b() {
        this.f1753d = (RadioButton) getInflater().inflate(C0172g.abc_list_menu_item_radio, (ViewGroup) this, false);
        m1020a(this.f1753d);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0210q.a
    /* renamed from: c */
    public boolean mo740c() {
        return false;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0210q.a
    public C0204k getItemData() {
        return this.f1751b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        C0119n.m461a(this, this.f1760k);
        this.f1754e = (TextView) findViewById(C0171f.title);
        int i = this.f1761l;
        if (i != -1) {
            this.f1754e.setTextAppearance(this.f1762m, i);
        }
        this.f1756g = (TextView) findViewById(C0171f.shortcut);
        this.f1757h = (ImageView) findViewById(C0171f.submenuarrow);
        ImageView imageView = this.f1757h;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1764o);
        }
        this.f1758i = (ImageView) findViewById(C0171f.group_divider);
        this.f1759j = (LinearLayout) findViewById(C0171f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1752c != null && this.f1763n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1752c.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f1753d == null && this.f1755f == null) {
            return;
        }
        if (this.f1751b.m726e()) {
            if (this.f1753d == null) {
                m1023b();
            }
            compoundButton = this.f1753d;
            compoundButton2 = this.f1755f;
        } else {
            if (this.f1755f == null) {
                m1019a();
            }
            compoundButton = this.f1755f;
            compoundButton2 = this.f1753d;
        }
        if (z) {
            compoundButton.setChecked(this.f1751b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1755f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1753d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1751b.m726e()) {
            if (this.f1753d == null) {
                m1023b();
            }
            compoundButton = this.f1753d;
        } else {
            if (this.f1755f == null) {
                m1019a();
            }
            compoundButton = this.f1755f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1767r = z;
        this.f1763n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f1758i;
        if (imageView != null) {
            imageView.setVisibility((this.f1765p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1751b.f1127n.f1098t || this.f1767r;
        if (z || this.f1763n) {
            if (this.f1752c == null && drawable == null && !this.f1763n) {
                return;
            }
            if (this.f1752c == null) {
                this.f1752c = (ImageView) getInflater().inflate(C0172g.abc_list_menu_item_icon, (ViewGroup) this, false);
                m1021a(this.f1752c, 0);
            }
            if (drawable == null && !this.f1763n) {
                this.f1752c.setVisibility(8);
                return;
            }
            ImageView imageView = this.f1752c;
            if (!z) {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            if (this.f1752c.getVisibility() != 0) {
                this.f1752c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1754e.getVisibility() != 8) {
                this.f1754e.setVisibility(8);
            }
        } else {
            this.f1754e.setText(charSequence);
            if (this.f1754e.getVisibility() != 0) {
                this.f1754e.setVisibility(0);
            }
        }
    }
}
