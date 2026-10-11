package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p027b.C0175j;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f1841b;

    /* renamed from: c */
    public int f1842c;

    /* renamed from: d */
    public int f1843d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1842c = -1;
        this.f1843d = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.ButtonBarLayout);
        this.f1841b = obtainStyledAttributes.getBoolean(C0175j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C0171f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* renamed from: a */
    public final int m1051a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean m1052a() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f1843d, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1841b) {
            if (size > this.f1842c && m1052a()) {
                setStacked(false);
            }
            this.f1842c = size;
        }
        if (m1052a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1841b && !m1052a()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int m1051a = m1051a(0);
        if (m1051a >= 0) {
            View childAt = getChildAt(m1051a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m1052a()) {
                int m1051a2 = m1051a(m1051a + 1);
                i4 = m1051a2 >= 0 ? getChildAt(m1051a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i4 = getPaddingBottom() + measuredHeight;
            }
        }
        if (C0119n.m469d(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1841b != z) {
            this.f1841b = z;
            if (!this.f1841b && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
