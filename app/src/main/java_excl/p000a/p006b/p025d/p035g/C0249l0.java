package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p029d.p030a.C0181a;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.d.g.l0 */
/* loaded from: classes.dex */
public class C0249l0 extends ViewGroup {

    /* renamed from: b */
    public boolean f1347b;

    /* renamed from: c */
    public int f1348c;

    /* renamed from: d */
    public int f1349d;

    /* renamed from: e */
    public int f1350e;

    /* renamed from: f */
    public int f1351f;

    /* renamed from: g */
    public int f1352g;

    /* renamed from: h */
    public float f1353h;

    /* renamed from: i */
    public boolean f1354i;

    /* renamed from: j */
    public int[] f1355j;

    /* renamed from: k */
    public int[] f1356k;

    /* renamed from: l */
    public Drawable f1357l;

    /* renamed from: m */
    public int f1358m;

    /* renamed from: n */
    public int f1359n;

    /* renamed from: o */
    public int f1360o;

    /* renamed from: p */
    public int f1361p;

    /* renamed from: a.b.d.g.l0$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f1362a;

        /* renamed from: b */
        public int f1363b;

        public a(int i, int i2) {
            super(i, i2);
            this.f1363b = -1;
            this.f1362a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1363b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.LinearLayoutCompat_Layout);
            this.f1362a = obtainStyledAttributes.getFloat(C0175j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1363b = obtainStyledAttributes.getInt(C0175j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1363b = -1;
        }
    }

    public C0249l0(Context context) {
        this(context, null);
    }

    public C0249l0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0249l0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        this.f1347b = true;
        this.f1348c = -1;
        this.f1349d = 0;
        this.f1351f = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(C0175j.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(C0175j.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(C0175j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f1353h = obtainStyledAttributes.getFloat(C0175j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1348c = obtainStyledAttributes.getInt(C0175j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1354i = obtainStyledAttributes.getBoolean(C0175j.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = C0175j.LinearLayoutCompat_divider;
        setDividerDrawable((!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) ? obtainStyledAttributes.getDrawable(i4) : C0181a.m618c(context, resourceId));
        this.f1360o = obtainStyledAttributes.getInt(C0175j.LinearLayoutCompat_showDividers, 0);
        this.f1361p = obtainStyledAttributes.getDimensionPixelSize(C0175j.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public View m862a(int i) {
        return getChildAt(i);
    }

    /* renamed from: a */
    public final void m863a(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m862a = m862a(i3);
            if (m862a.getVisibility() != 8) {
                a aVar = (a) m862a.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = m862a.getMeasuredWidth();
                    measureChildWithMargins(m862a, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m864a(int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0249l0.m864a(int, int, int, int):void");
    }

    /* renamed from: a */
    public void m865a(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean m837a = C0242i1.m837a(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View m862a = m862a(i2);
            if (m862a != null && m862a.getVisibility() != 8 && m872b(i2)) {
                a aVar = (a) m862a.getLayoutParams();
                m871b(canvas, m837a ? m862a.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (m862a.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1358m);
            }
        }
        if (m872b(virtualChildCount)) {
            View m862a2 = m862a(virtualChildCount - 1);
            if (m862a2 != null) {
                a aVar2 = (a) m862a2.getLayoutParams();
                if (m837a) {
                    left = m862a2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i = this.f1358m;
                    right = left - i;
                } else {
                    right = m862a2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (m837a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f1358m;
                right = left - i;
            }
            m871b(canvas, right);
        }
    }

    /* renamed from: a */
    public void m866a(Canvas canvas, int i) {
        this.f1357l.setBounds(getPaddingLeft() + this.f1361p, i, (getWidth() - getPaddingRight()) - this.f1361p, this.f1359n + i);
        this.f1357l.draw(canvas);
    }

    /* renamed from: a */
    public void m867a(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: b */
    public final void m868b(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View m862a = m862a(i3);
            if (m862a.getVisibility() != 8) {
                a aVar = (a) m862a.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = m862a.getMeasuredHeight();
                    measureChildWithMargins(m862a, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i4;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m869b(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.f1351f
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.f1352g
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.f1352g
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb8
            android.view.View r3 = r11.m862a(r15)
            r4 = 1
            if (r3 != 0) goto L52
            int r3 = r11.m878f()
            int r3 = r3 + r13
        L50:
            r13 = r3
            goto Lb6
        L52:
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 == r6) goto Lb6
            int r5 = r3.getMeasuredWidth()
            int r6 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
            a.b.d.g.l0$a r7 = (p000a.p006b.p025d.p035g.C0249l0.a) r7
            int r8 = r7.f1363b
            if (r8 >= 0) goto L6d
            r8 = r2
        L6d:
            int r9 = p000a.p006b.p010c.p021h.C0119n.m468c(r11)
            int r8 = p000a.p006b.p008b.p009a.C0027d.m34a(r8, r9)
            r8 = r8 & 7
            if (r8 == r4) goto L85
            r9 = 5
            if (r8 == r9) goto L80
            int r8 = r7.leftMargin
            int r8 = r8 + r0
            goto L90
        L80:
            int r8 = r12 - r5
            int r9 = r7.rightMargin
            goto L8f
        L85:
            int r8 = r14 - r5
            int r8 = r8 / 2
            int r8 = r8 + r0
            int r9 = r7.leftMargin
            int r8 = r8 + r9
            int r9 = r7.rightMargin
        L8f:
            int r8 = r8 - r9
        L90:
            boolean r9 = r11.m872b(r15)
            if (r9 == 0) goto L99
            int r9 = r11.f1359n
            int r13 = r13 + r9
        L99:
            int r9 = r7.topMargin
            int r13 = r13 + r9
            int r9 = r11.m875d()
            int r9 = r9 + r13
            int r5 = r5 + r8
            int r10 = r6 + r9
            r3.layout(r8, r9, r5, r10)
            int r3 = r7.bottomMargin
            int r6 = r6 + r3
            int r3 = r11.m877e()
            int r3 = r3 + r6
            int r3 = r3 + r13
            int r13 = r11.m873c()
            int r15 = r15 + r13
            goto L50
        Lb6:
            int r15 = r15 + r4
            goto L42
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0249l0.m869b(int, int, int, int):void");
    }

    /* renamed from: b */
    public void m870b(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View m862a = m862a(i);
            if (m862a != null && m862a.getVisibility() != 8 && m872b(i)) {
                m866a(canvas, (m862a.getTop() - ((ViewGroup.MarginLayoutParams) ((a) m862a.getLayoutParams())).topMargin) - this.f1359n);
            }
        }
        if (m872b(virtualChildCount)) {
            View m862a2 = m862a(virtualChildCount - 1);
            m866a(canvas, m862a2 == null ? (getHeight() - getPaddingBottom()) - this.f1359n : m862a2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) m862a2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: b */
    public void m871b(Canvas canvas, int i) {
        this.f1357l.setBounds(i, getPaddingTop() + this.f1361p, this.f1358m + i, (getHeight() - getPaddingBottom()) - this.f1361p);
        this.f1357l.draw(canvas);
    }

    /* renamed from: b */
    public boolean m872b(int i) {
        if (i == 0) {
            return (this.f1360o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1360o & 4) != 0;
        }
        if ((this.f1360o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public int m873c() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m874c(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0249l0.m874c(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: d */
    public int m875d() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b6  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m876d(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0249l0.m876d(int, int):void");
    }

    /* renamed from: e */
    public int m877e() {
        return 0;
    }

    /* renamed from: f */
    public int m878f() {
        return 0;
    }

    @Override // android.view.ViewGroup
    public a generateDefaultLayoutParams() {
        int i = this.f1350e;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1348c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1348c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1348c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i3 = this.f1349d;
        if (this.f1350e == 1 && (i = this.f1351f & C0175j.AppCompatTheme_windowActionBarOverlay) != 48) {
            if (i == 16) {
                i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1352g) / 2;
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1352g;
            }
        }
        return i3 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1348c;
    }

    public Drawable getDividerDrawable() {
        return this.f1357l;
    }

    public int getDividerPadding() {
        return this.f1361p;
    }

    public int getDividerWidth() {
        return this.f1358m;
    }

    public int getGravity() {
        return this.f1351f;
    }

    public int getOrientation() {
        return this.f1350e;
    }

    public int getShowDividers() {
        return this.f1360o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1353h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f1357l == null) {
            return;
        }
        if (this.f1350e == 1) {
            m870b(canvas);
        } else {
            m865a(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0249l0.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0249l0.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1350e == 1) {
            m869b(i, i2, i3, i4);
        } else {
            m864a(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1350e == 1) {
            m876d(i, i2);
        } else {
            m874c(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f1347b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1348c = i;
            return;
        }
        StringBuilder m1134a = C0335a.m1134a("base aligned child index out of range (0, ");
        m1134a.append(getChildCount());
        m1134a.append(")");
        throw new IllegalArgumentException(m1134a.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1357l) {
            return;
        }
        this.f1357l = drawable;
        if (drawable != null) {
            this.f1358m = drawable.getIntrinsicWidth();
            this.f1359n = drawable.getIntrinsicHeight();
        } else {
            this.f1358m = 0;
            this.f1359n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1361p = i;
    }

    public void setGravity(int i) {
        if (this.f1351f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & C0175j.AppCompatTheme_windowActionBarOverlay) == 0) {
                i |= 48;
            }
            this.f1351f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1351f;
        if ((8388615 & i3) != i2) {
            this.f1351f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1354i = z;
    }

    public void setOrientation(int i) {
        if (this.f1350e != i) {
            this.f1350e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1360o) {
            requestLayout();
        }
        this.f1360o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & C0175j.AppCompatTheme_windowActionBarOverlay;
        int i3 = this.f1351f;
        if ((i3 & C0175j.AppCompatTheme_windowActionBarOverlay) != i2) {
            this.f1351f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1353h = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
