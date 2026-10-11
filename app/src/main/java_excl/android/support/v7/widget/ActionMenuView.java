package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.C0204k;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;
import p000a.p006b.p025d.p035g.C0222c;
import p000a.p006b.p025d.p035g.C0242i1;
import p000a.p006b.p025d.p035g.C0249l0;

/* loaded from: classes.dex */
public class ActionMenuView extends C0249l0 implements C0201h.b, InterfaceC0210q {

    /* renamed from: A */
    public int f1821A;

    /* renamed from: B */
    public InterfaceC0303e f1822B;

    /* renamed from: q */
    public C0201h f1823q;

    /* renamed from: r */
    public Context f1824r;

    /* renamed from: s */
    public int f1825s;

    /* renamed from: t */
    public boolean f1826t;

    /* renamed from: u */
    public C0222c f1827u;

    /* renamed from: v */
    public InterfaceC0209p.a f1828v;

    /* renamed from: w */
    public C0201h.a f1829w;

    /* renamed from: x */
    public boolean f1830x;

    /* renamed from: y */
    public int f1831y;

    /* renamed from: z */
    public int f1832z;

    /* renamed from: android.support.v7.widget.ActionMenuView$a */
    public interface InterfaceC0299a {
        /* renamed from: a */
        boolean mo768a();

        /* renamed from: b */
        boolean mo769b();
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$b */
    public static class C0300b implements InterfaceC0209p.a {
        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
        /* renamed from: a */
        public void mo579a(C0201h c0201h, boolean z) {
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
        /* renamed from: a */
        public boolean mo580a(C0201h c0201h) {
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$c */
    public static class C0301c extends C0249l0.a {

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public boolean f1833c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public int f1834d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public int f1835e;

        /* renamed from: f */
        @ViewDebug.ExportedProperty
        public boolean f1836f;

        /* renamed from: g */
        @ViewDebug.ExportedProperty
        public boolean f1837g;

        /* renamed from: h */
        public boolean f1838h;

        public C0301c(int i, int i2) {
            super(i, i2);
            this.f1833c = false;
        }

        public C0301c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0301c(C0301c c0301c) {
            super(c0301c);
            this.f1833c = c0301c.f1833c;
        }

        public C0301c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$d */
    public class C0302d implements C0201h.a {
        public C0302d() {
        }

        @Override // p000a.p006b.p025d.p033f.p034i.C0201h.a
        /* renamed from: a */
        public void mo559a(C0201h c0201h) {
            C0201h.a aVar = ActionMenuView.this.f1829w;
            if (aVar != null) {
                aVar.mo559a(c0201h);
            }
        }

        @Override // p000a.p006b.p025d.p033f.p034i.C0201h.a
        /* renamed from: a */
        public boolean mo561a(C0201h c0201h, MenuItem menuItem) {
            InterfaceC0303e interfaceC0303e = ActionMenuView.this.f1822B;
            if (interfaceC0303e == null) {
                return false;
            }
            Toolbar.InterfaceC0328f interfaceC0328f = Toolbar.this.f1945H;
            return interfaceC0328f != null ? interfaceC0328f.onMenuItemClick(menuItem) : false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuView$e */
    public interface InterfaceC0303e {
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1832z = (int) (56.0f * f);
        this.f1821A = (int) (f * 4.0f);
        this.f1824r = context;
        this.f1825s = 0;
    }

    /* renamed from: b */
    public static int m1038b(View view, int i, int i2, int i3, int i4) {
        C0301c c0301c = (C0301c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.m1016d();
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        c0301c.f1836f = !c0301c.f1833c && z;
        c0301c.f1834d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0210q
    /* renamed from: a */
    public void mo738a(C0201h c0201h) {
        this.f1823q = c0201h;
    }

    /* renamed from: a */
    public void m1039a(InterfaceC0209p.a aVar, C0201h.a aVar2) {
        this.f1828v = aVar;
        this.f1829w = aVar2;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h.b
    /* renamed from: a */
    public boolean mo717a(C0204k c0204k) {
        return this.f1823q.m703a(c0204k, (InterfaceC0209p) null, 0);
    }

    /* renamed from: c */
    public boolean m1040c(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0299a)) {
            z = false | ((InterfaceC0299a) childAt).mo769b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0299a)) ? z : z | ((InterfaceC0299a) childAt2).mo768a();
    }

    @Override // p000a.p006b.p025d.p035g.C0249l0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof C0301c);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: g */
    public void m1041g() {
        C0222c c0222c = this.f1827u;
        if (c0222c != null) {
            c0222c.m763b();
        }
    }

    @Override // p000a.p006b.p025d.p035g.C0249l0, android.view.ViewGroup
    public C0301c generateDefaultLayoutParams() {
        C0301c c0301c = new C0301c(-2, -2);
        c0301c.f1363b = 16;
        return c0301c;
    }

    @Override // p000a.p006b.p025d.p035g.C0249l0, android.view.ViewGroup
    public C0301c generateLayoutParams(AttributeSet attributeSet) {
        return new C0301c(getContext(), attributeSet);
    }

    @Override // p000a.p006b.p025d.p035g.C0249l0, android.view.ViewGroup
    public C0301c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0301c c0301c = layoutParams instanceof C0301c ? new C0301c((C0301c) layoutParams) : new C0301c(layoutParams);
        if (c0301c.f1363b <= 0) {
            c0301c.f1363b = 16;
        }
        return c0301c;
    }

    public Menu getMenu() {
        if (this.f1823q == null) {
            Context context = getContext();
            this.f1823q = new C0201h(context);
            this.f1823q.mo693a(new C0302d());
            this.f1827u = new C0222c(context);
            C0222c c0222c = this.f1827u;
            c0222c.f1211m = true;
            c0222c.f1212n = true;
            InterfaceC0209p.a aVar = this.f1828v;
            if (aVar == null) {
                aVar = new C0300b();
            }
            c0222c.f1016f = aVar;
            this.f1823q.m695a(this.f1827u, this.f1824r);
            C0222c c0222c2 = this.f1827u;
            c0222c2.f1019i = this;
            mo738a(c0222c2.f1014d);
        }
        return this.f1823q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0222c c0222c = this.f1827u;
        C0222c.d dVar = c0222c.f1208j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (c0222c.f1210l) {
            return c0222c.f1209k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1825s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public C0301c m1042h() {
        C0301c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1833c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: i */
    public boolean m1043i() {
        C0222c c0222c = this.f1827u;
        return c0222c != null && c0222c.m764c();
    }

    /* renamed from: j */
    public boolean m1044j() {
        C0222c c0222c = this.f1827u;
        if (c0222c != null) {
            if (c0222c.f1204A != null || c0222c.m766e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean m1045k() {
        C0222c c0222c = this.f1827u;
        return c0222c != null && c0222c.m766e();
    }

    /* renamed from: l */
    public boolean m1046l() {
        return this.f1826t;
    }

    /* renamed from: m */
    public C0201h m1047m() {
        return this.f1823q;
    }

    /* renamed from: n */
    public boolean m1048n() {
        C0222c c0222c = this.f1827u;
        return c0222c != null && c0222c.m767f();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0222c c0222c = this.f1827u;
        if (c0222c != null) {
            c0222c.mo662a(false);
            if (this.f1827u.m766e()) {
                this.f1827u.m764c();
                this.f1827u.m767f();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1041g();
    }

    @Override // p000a.p006b.p025d.p035g.C0249l0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int width;
        int i7;
        if (!this.f1830x) {
            if (this.f1350e == 1) {
                m869b(i, i2, i3, i4);
                return;
            } else {
                m864a(i, i2, i3, i4);
                return;
            }
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean m837a = C0242i1.m837a(this);
        int i10 = paddingRight;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0301c c0301c = (C0301c) childAt.getLayoutParams();
                if (c0301c.f1833c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1040c(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m837a) {
                        i7 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0301c).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0301c).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i14 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i14, width, measuredHeight + i14);
                    i10 -= measuredWidth;
                    i11 = 1;
                } else {
                    i10 -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0301c).leftMargin) + ((ViewGroup.MarginLayoutParams) c0301c).rightMargin;
                    m1040c(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i9 / 2) - (measuredWidth2 / 2);
            int i16 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i6 = i10 / i17;
            i5 = 0;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int max = Math.max(i5, i6);
        if (m837a) {
            int width2 = getWidth() - getPaddingRight();
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                C0301c c0301c2 = (C0301c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0301c2.f1833c) {
                    int i18 = width2 - ((ViewGroup.MarginLayoutParams) c0301c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0301c2).leftMargin) + max);
                }
                i5++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i5 < childCount) {
            View childAt4 = getChildAt(i5);
            C0301c c0301c3 = (C0301c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0301c3.f1833c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0301c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0301c3).rightMargin + max + i20;
            }
            i5++;
        }
    }

    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v18 */
    @Override // p000a.p006b.p025d.p035g.C0249l0, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int r6;
        C0201h c0201h;
        boolean z2 = this.f1830x;
        this.f1830x = View.MeasureSpec.getMode(i) == 1073741824;
        if (z2 != this.f1830x) {
            this.f1831y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1830x && (c0201h = this.f1823q) != null && size != this.f1831y) {
            this.f1831y = size;
            c0201h.m706b(true);
        }
        int childCount = getChildCount();
        if (!this.f1830x || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                C0301c c0301c = (C0301c) getChildAt(i8).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0301c).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0301c).leftMargin = 0;
            }
            if (this.f1350e == 1) {
                m876d(i, i2);
                return;
            } else {
                m874c(i, i2);
                return;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f1832z;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = i11;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        boolean z3 = false;
        int i18 = 0;
        int i19 = 0;
        long j = 0;
        while (i16 < childCount2) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                i7 = size3;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z4) {
                    int i20 = this.f1821A;
                    i7 = size3;
                    r6 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                } else {
                    i7 = size3;
                    r6 = 0;
                }
                C0301c c0301c2 = (C0301c) childAt.getLayoutParams();
                c0301c2.f1838h = r6;
                c0301c2.f1835e = r6;
                c0301c2.f1834d = r6;
                c0301c2.f1836f = r6;
                ((ViewGroup.MarginLayoutParams) c0301c2).leftMargin = r6;
                ((ViewGroup.MarginLayoutParams) c0301c2).rightMargin = r6;
                c0301c2.f1837g = z4 && ((ActionMenuItemView) childAt).m1016d();
                int m1038b = m1038b(childAt, i13, c0301c2.f1833c ? 1 : i14, childMeasureSpec, paddingBottom);
                i15 = Math.max(i15, m1038b);
                if (c0301c2.f1836f) {
                    i19++;
                }
                if (c0301c2.f1833c) {
                    z3 = true;
                }
                i14 -= m1038b;
                int max = Math.max(i17, childAt.getMeasuredHeight());
                if (m1038b == 1) {
                    j |= 1 << i16;
                }
                i17 = max;
            }
            i16++;
            size3 = i7;
        }
        int i21 = size3;
        boolean z5 = z3 && i18 == 2;
        int i22 = i14;
        boolean z6 = false;
        while (i19 > 0 && i22 > 0) {
            int i23 = Integer.MAX_VALUE;
            int i24 = 0;
            int i25 = 0;
            long j2 = 0;
            while (i24 < childCount2) {
                boolean z7 = z6;
                C0301c c0301c3 = (C0301c) getChildAt(i24).getLayoutParams();
                int i26 = i17;
                if (c0301c3.f1836f) {
                    int i27 = c0301c3.f1834d;
                    if (i27 < i23) {
                        i23 = i27;
                        j2 = 1 << i24;
                        i25 = 1;
                    } else if (i27 == i23) {
                        j2 |= 1 << i24;
                        i25++;
                    }
                }
                i24++;
                i17 = i26;
                z6 = z7;
            }
            z = z6;
            i5 = i17;
            j |= j2;
            if (i25 > i22) {
                i3 = mode;
                i4 = i9;
                break;
            }
            int i28 = i23 + 1;
            int i29 = i22;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                C0301c c0301c4 = (C0301c) childAt2.getLayoutParams();
                int i31 = i9;
                int i32 = mode;
                long j3 = 1 << i30;
                if ((j2 & j3) == 0) {
                    if (c0301c4.f1834d == i28) {
                        j |= j3;
                    }
                    i6 = i28;
                } else {
                    if (z5 && c0301c4.f1837g && i29 == 1) {
                        int i33 = this.f1821A;
                        i6 = i28;
                        childAt2.setPadding(i33 + i13, 0, i33, 0);
                    } else {
                        i6 = i28;
                    }
                    c0301c4.f1834d++;
                    c0301c4.f1838h = true;
                    i29--;
                }
                i30++;
                mode = i32;
                i28 = i6;
                i9 = i31;
            }
            i22 = i29;
            i17 = i5;
            z6 = true;
        }
        i3 = mode;
        i4 = i9;
        z = z6;
        i5 = i17;
        boolean z8 = !z3 && i18 == 1;
        if (i22 > 0 && j != 0 && (i22 < i18 - 1 || z8 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z8) {
                if ((j & 1) != 0 && !((C0301c) getChildAt(0).getLayoutParams()).f1837g) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j & (1 << i34)) != 0 && !((C0301c) getChildAt(i34).getLayoutParams()).f1837g) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) ((i22 * i13) / bitCount) : 0;
            boolean z9 = z;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    C0301c c0301c5 = (C0301c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0301c5.f1835e = i35;
                        c0301c5.f1838h = true;
                        if (i36 == 0 && !c0301c5.f1837g) {
                            ((ViewGroup.MarginLayoutParams) c0301c5).leftMargin = (-i35) / 2;
                        }
                    } else if (c0301c5.f1833c) {
                        c0301c5.f1835e = i35;
                        c0301c5.f1838h = true;
                        ((ViewGroup.MarginLayoutParams) c0301c5).rightMargin = (-i35) / 2;
                    } else {
                        if (i36 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0301c5).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c0301c5).rightMargin = i35 / 2;
                        }
                    }
                    z9 = true;
                }
            }
            z = z9;
        }
        if (z) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                C0301c c0301c6 = (C0301c) childAt4.getLayoutParams();
                if (c0301c6.f1838h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0301c6.f1834d * i13) + c0301c6.f1835e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i4, i3 != 1073741824 ? i5 : i21);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1827u.f1219u = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0303e interfaceC0303e) {
        this.f1822B = interfaceC0303e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0222c c0222c = this.f1827u;
        C0222c.d dVar = c0222c.f1208j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            c0222c.f1210l = true;
            c0222c.f1209k = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f1826t = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1825s != i) {
            this.f1825s = i;
            if (i == 0) {
                this.f1824r = getContext();
            } else {
                this.f1824r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0222c c0222c) {
        this.f1827u = c0222c;
        C0222c c0222c2 = this.f1827u;
        c0222c2.f1019i = this;
        mo738a(c0222c2.f1014d);
    }
}
