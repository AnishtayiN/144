package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p035g.C0219b;
import p000a.p006b.p025d.p035g.C0269v0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    public boolean f1768b;

    /* renamed from: c */
    public View f1769c;

    /* renamed from: d */
    public View f1770d;

    /* renamed from: e */
    public View f1771e;

    /* renamed from: f */
    public Drawable f1772f;

    /* renamed from: g */
    public Drawable f1773g;

    /* renamed from: h */
    public Drawable f1774h;

    /* renamed from: i */
    public boolean f1775i;

    /* renamed from: j */
    public boolean f1776j;

    /* renamed from: k */
    public int f1777k;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0119n.m461a(this, new C0219b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.ActionBar);
        this.f1772f = obtainStyledAttributes.getDrawable(C0175j.ActionBar_background);
        this.f1773g = obtainStyledAttributes.getDrawable(C0175j.ActionBar_backgroundStacked);
        this.f1777k = obtainStyledAttributes.getDimensionPixelSize(C0175j.ActionBar_height, -1);
        if (getId() == C0171f.split_action_bar) {
            this.f1775i = true;
            this.f1774h = obtainStyledAttributes.getDrawable(C0175j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f1775i ? !(this.f1772f != null || this.f1773g != null) : this.f1774h == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public final int m1024a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m1025b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1772f;
        if (drawable != null && drawable.isStateful()) {
            this.f1772f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1773g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1773g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1774h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1774h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1769c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1772f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1773g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1774h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1770d = findViewById(C0171f.action_bar);
        this.f1771e = findViewById(C0171f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1768b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1769c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f1775i) {
            Drawable drawable2 = this.f1774h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f1772f != null) {
                if (this.f1770d.getVisibility() == 0) {
                    this.f1772f.setBounds(this.f1770d.getLeft(), this.f1770d.getTop(), this.f1770d.getRight(), this.f1770d.getBottom());
                } else {
                    View view2 = this.f1771e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f1772f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f1772f.setBounds(this.f1771e.getLeft(), this.f1771e.getTop(), this.f1771e.getRight(), this.f1771e.getBottom());
                    }
                }
                z3 = true;
            }
            this.f1776j = z4;
            if (!z4 || (drawable = this.f1773g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f1770d == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f1777k) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1770d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f1769c;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m1024a(this.f1769c) + (!m1025b(this.f1770d) ? m1024a(this.f1770d) : !m1025b(this.f1771e) ? m1024a(this.f1771e) : 0), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1772f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1772f);
        }
        this.f1772f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1770d;
            if (view != null) {
                this.f1772f.setBounds(view.getLeft(), this.f1770d.getTop(), this.f1770d.getRight(), this.f1770d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1775i ? this.f1772f != null || this.f1773g != null : this.f1774h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1774h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1774h);
        }
        this.f1774h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1775i && (drawable2 = this.f1774h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1775i ? !(this.f1772f != null || this.f1773g != null) : this.f1774h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1773g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1773g);
        }
        this.f1773g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1776j && (drawable2 = this.f1773g) != null) {
                drawable2.setBounds(this.f1769c.getLeft(), this.f1769c.getTop(), this.f1769c.getRight(), this.f1769c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1775i ? this.f1772f != null || this.f1773g != null : this.f1774h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C0269v0 c0269v0) {
        View view = this.f1769c;
        if (view != null) {
            removeView(view);
        }
        this.f1769c = c0269v0;
        if (c0269v0 != null) {
            addView(c0269v0);
            ViewGroup.LayoutParams layoutParams = c0269v0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0269v0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1768b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1772f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1773g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1774h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1772f && !this.f1775i) || (drawable == this.f1773g && this.f1776j) || ((drawable == this.f1774h && this.f1775i) || super.verifyDrawable(drawable));
    }
}
