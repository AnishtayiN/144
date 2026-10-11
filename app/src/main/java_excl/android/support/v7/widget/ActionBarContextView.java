package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p029d.p030a.C0181a;
import p000a.p006b.p025d.p033f.AbstractC0186a;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;
import p000a.p006b.p025d.p035g.AbstractC0216a;
import p000a.p006b.p025d.p035g.C0222c;
import p000a.p006b.p025d.p035g.C0242i1;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0216a {

    /* renamed from: j */
    public CharSequence f1778j;

    /* renamed from: k */
    public CharSequence f1779k;

    /* renamed from: l */
    public View f1780l;

    /* renamed from: m */
    public View f1781m;

    /* renamed from: n */
    public LinearLayout f1782n;

    /* renamed from: o */
    public TextView f1783o;

    /* renamed from: p */
    public TextView f1784p;

    /* renamed from: q */
    public int f1785q;

    /* renamed from: r */
    public int f1786r;

    /* renamed from: s */
    public boolean f1787s;

    /* renamed from: t */
    public int f1788t;

    /* renamed from: android.support.v7.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0293a implements View.OnClickListener {

        /* renamed from: b */
        public final /* synthetic */ AbstractC0186a f1789b;

        public ViewOnClickListenerC0293a(ActionBarContextView actionBarContextView, AbstractC0186a abstractC0186a) {
            this.f1789b = abstractC0186a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f1789b.mo601a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0166a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.ActionMode, i, 0);
        int i2 = C0175j.ActionMode_background;
        C0119n.m461a(this, (!obtainStyledAttributes.hasValue(i2) || (resourceId = obtainStyledAttributes.getResourceId(i2, 0)) == 0) ? obtainStyledAttributes.getDrawable(i2) : C0181a.m618c(context, resourceId));
        this.f1785q = obtainStyledAttributes.getResourceId(C0175j.ActionMode_titleTextStyle, 0);
        this.f1786r = obtainStyledAttributes.getResourceId(C0175j.ActionMode_subtitleTextStyle, 0);
        this.f1191f = obtainStyledAttributes.getLayoutDimension(C0175j.ActionMode_height, 0);
        this.f1788t = obtainStyledAttributes.getResourceId(C0175j.ActionMode_closeItemLayout, C0172g.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void m1026a() {
        if (this.f1780l == null) {
            m1030d();
        }
    }

    /* renamed from: a */
    public void m1027a(AbstractC0186a abstractC0186a) {
        View view = this.f1780l;
        if (view == null) {
            this.f1780l = LayoutInflater.from(getContext()).inflate(this.f1788t, (ViewGroup) this, false);
            addView(this.f1780l);
        } else if (view.getParent() == null) {
            addView(this.f1780l);
        }
        this.f1780l.findViewById(C0171f.action_mode_close_button).setOnClickListener(new ViewOnClickListenerC0293a(this, abstractC0186a));
        C0201h c0201h = (C0201h) abstractC0186a.mo609c();
        C0222c c0222c = this.f1190e;
        if (c0222c != null) {
            c0222c.m763b();
        }
        this.f1190e = new C0222c(getContext());
        C0222c c0222c2 = this.f1190e;
        c0222c2.f1211m = true;
        c0222c2.f1212n = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c0201h.m695a(this.f1190e, this.f1188c);
        C0222c c0222c3 = this.f1190e;
        InterfaceC0210q interfaceC0210q = c0222c3.f1019i;
        if (interfaceC0210q == null) {
            c0222c3.f1019i = (InterfaceC0210q) c0222c3.f1015e.inflate(c0222c3.f1017g, (ViewGroup) this, false);
            c0222c3.f1019i.mo738a(c0222c3.f1014d);
            c0222c3.mo662a(true);
        }
        InterfaceC0210q interfaceC0210q2 = c0222c3.f1019i;
        if (interfaceC0210q != interfaceC0210q2) {
            ((ActionMenuView) interfaceC0210q2).setPresenter(c0222c3);
        }
        this.f1189d = (ActionMenuView) interfaceC0210q2;
        C0119n.m461a(this.f1189d, (Drawable) null);
        addView(this.f1189d, layoutParams);
    }

    /* renamed from: b */
    public final void m1028b() {
        if (this.f1782n == null) {
            LayoutInflater.from(getContext()).inflate(C0172g.abc_action_bar_title_item, this);
            this.f1782n = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1783o = (TextView) this.f1782n.findViewById(C0171f.action_bar_title);
            this.f1784p = (TextView) this.f1782n.findViewById(C0171f.action_bar_subtitle);
            if (this.f1785q != 0) {
                this.f1783o.setTextAppearance(getContext(), this.f1785q);
            }
            if (this.f1786r != 0) {
                this.f1784p.setTextAppearance(getContext(), this.f1786r);
            }
        }
        this.f1783o.setText(this.f1778j);
        this.f1784p.setText(this.f1779k);
        boolean z = !TextUtils.isEmpty(this.f1778j);
        boolean z2 = !TextUtils.isEmpty(this.f1779k);
        int i = 0;
        this.f1784p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f1782n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f1782n.getParent() == null) {
            addView(this.f1782n);
        }
    }

    /* renamed from: c */
    public boolean m1029c() {
        return this.f1787s;
    }

    /* renamed from: d */
    public void m1030d() {
        removeAllViews();
        this.f1781m = null;
        this.f1189d = null;
    }

    /* renamed from: e */
    public boolean m1031e() {
        C0222c c0222c = this.f1190e;
        if (c0222c != null) {
            return c0222c.m767f();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p000a.p006b.p025d.p035g.AbstractC0216a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p000a.p006b.p025d.p035g.AbstractC0216a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1779k;
    }

    public CharSequence getTitle() {
        return this.f1778j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0222c c0222c = this.f1190e;
        if (c0222c != null) {
            c0222c.m764c();
            this.f1190e.m765d();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(ActionBarContextView.class.getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f1778j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean m837a = C0242i1.m837a(this);
        int paddingRight = m837a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1780l;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1780l.getLayoutParams();
            int i6 = m837a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = m837a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = m837a ? paddingRight - i6 : paddingRight + i6;
            int m744a = i8 + m744a(this.f1780l, i8, paddingTop, paddingTop2, m837a);
            i5 = m837a ? m744a - i7 : m744a + i7;
        }
        LinearLayout linearLayout = this.f1782n;
        if (linearLayout != null && this.f1781m == null && linearLayout.getVisibility() != 8) {
            i5 += m744a(this.f1782n, i5, paddingTop, paddingTop2, m837a);
        }
        int i9 = i5;
        View view2 = this.f1781m;
        if (view2 != null) {
            m744a(view2, i9, paddingTop, paddingTop2, m837a);
        }
        int paddingLeft = m837a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1189d;
        if (actionMenuView != null) {
            m744a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m837a);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(ActionBarContextView.class.getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f1191f;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1780l;
        if (view != null) {
            int m743a = m743a(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1780l.getLayoutParams();
            paddingLeft = m743a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1189d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m743a(this.f1189d, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f1782n;
        if (linearLayout != null && this.f1781m == null) {
            if (this.f1787s) {
                this.f1782n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1782n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f1782n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m743a(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f1781m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            int i6 = layoutParams.width;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i7 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            int i8 = layoutParams.height;
            if (i8 >= 0) {
                i4 = Math.min(i8, i4);
            }
            this.f1781m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(i4, i7));
        }
        if (this.f1191f > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // p000a.p006b.p025d.p035g.AbstractC0216a
    public void setContentHeight(int i) {
        this.f1191f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1781m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1781m = view;
        if (view != null && (linearLayout = this.f1782n) != null) {
            removeView(linearLayout);
            this.f1782n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1779k = charSequence;
        m1028b();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1778j = charSequence;
        m1028b();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1787s) {
            requestLayout();
        }
        this.f1787s = z;
    }

    @Override // p000a.p006b.p025d.p035g.AbstractC0216a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
