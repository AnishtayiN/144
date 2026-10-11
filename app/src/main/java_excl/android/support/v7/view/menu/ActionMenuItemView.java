package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.C0204k;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0212s;
import p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0;
import p000a.p006b.p025d.p035g.C0222c;
import p000a.p006b.p025d.p035g.C0274y;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0274y implements InterfaceC0210q.a, View.OnClickListener, ActionMenuView.InterfaceC0299a {

    /* renamed from: e */
    public C0204k f1736e;

    /* renamed from: f */
    public CharSequence f1737f;

    /* renamed from: g */
    public Drawable f1738g;

    /* renamed from: h */
    public C0201h.b f1739h;

    /* renamed from: i */
    public AbstractViewOnTouchListenerC0247k0 f1740i;

    /* renamed from: j */
    public AbstractC0292b f1741j;

    /* renamed from: k */
    public boolean f1742k;

    /* renamed from: l */
    public boolean f1743l;

    /* renamed from: m */
    public int f1744m;

    /* renamed from: n */
    public int f1745n;

    /* renamed from: o */
    public int f1746o;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    public class C0291a extends AbstractViewOnTouchListenerC0247k0 {
        public C0291a() {
            super(ActionMenuItemView.this);
        }

        @Override // p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0
        /* renamed from: b */
        public InterfaceC0212s mo770b() {
            C0222c.a aVar;
            AbstractC0292b abstractC0292b = ActionMenuItemView.this.f1741j;
            if (abstractC0292b == null || (aVar = C0222c.this.f1224z) == null) {
                return null;
            }
            return aVar.m732a();
        }

        @Override // p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0
        /* renamed from: c */
        public boolean mo771c() {
            InterfaceC0212s mo770b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0201h.b bVar = actionMenuItemView.f1739h;
            return bVar != null && bVar.mo717a(actionMenuItemView.f1736e) && (mo770b = mo770b()) != null && mo770b.mo676b();
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0292b {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1742k = m1017e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.ActionMenuItemView, i, 0);
        this.f1744m = obtainStyledAttributes.getDimensionPixelSize(C0175j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1746o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1745n = -1;
        setSaveEnabled(false);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0210q.a
    /* renamed from: a */
    public void mo739a(C0204k c0204k, int i) {
        this.f1736e = c0204k;
        setIcon(c0204k.getIcon());
        setTitle(mo740c() ? c0204k.getTitleCondensed() : c0204k.f1118e);
        setId(c0204k.f1114a);
        setVisibility(c0204k.isVisible() ? 0 : 8);
        setEnabled(c0204k.isEnabled());
        if (c0204k.hasSubMenu() && this.f1740i == null) {
            this.f1740i = new C0291a();
        }
    }

    @Override // android.support.v7.widget.ActionMenuView.InterfaceC0299a
    /* renamed from: a */
    public boolean mo768a() {
        return m1016d() && this.f1736e.getIcon() == null;
    }

    @Override // android.support.v7.widget.ActionMenuView.InterfaceC0299a
    /* renamed from: b */
    public boolean mo769b() {
        return m1016d();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0210q.a
    /* renamed from: c */
    public boolean mo740c() {
        return true;
    }

    /* renamed from: d */
    public boolean m1016d() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: e */
    public final boolean m1017e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: f */
    public final void m1018f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1737f);
        if (this.f1738g != null) {
            if (!((this.f1736e.f1139z & 4) == 4) || (!this.f1742k && !this.f1743l)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f1737f : null);
        CharSequence charSequence = this.f1736e.f1131r;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f1736e.f1118e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1736e.f1132s;
        if (TextUtils.isEmpty(charSequence2)) {
            C0027d.m69a((View) this, z3 ? null : this.f1736e.f1118e);
        } else {
            C0027d.m69a((View) this, charSequence2);
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0210q.a
    public C0204k getItemData() {
        return this.f1736e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0201h.b bVar = this.f1739h;
        if (bVar != null) {
            bVar.mo717a(this.f1736e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1742k = m1017e();
        m1018f();
    }

    @Override // p000a.p006b.p025d.p035g.C0274y, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean m1016d = m1016d();
        if (m1016d && (i3 = this.f1745n) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1744m) : this.f1744m;
        if (mode != 1073741824 && this.f1744m > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m1016d || this.f1738g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1738g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0247k0 abstractViewOnTouchListenerC0247k0;
        if (this.f1736e.hasSubMenu() && (abstractViewOnTouchListenerC0247k0 = this.f1740i) != null && abstractViewOnTouchListenerC0247k0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1743l != z) {
            this.f1743l = z;
            C0204k c0204k = this.f1736e;
            if (c0204k != null) {
                c0204k.f1127n.m713h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1738g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1746o;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.f1746o;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1018f();
    }

    public void setItemInvoker(C0201h.b bVar) {
        this.f1739h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1745n = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0292b abstractC0292b) {
        this.f1741j = abstractC0292b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1737f = charSequence;
        m1018f();
    }
}
