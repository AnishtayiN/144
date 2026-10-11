package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AlertController;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.C0107b;
import p000a.p006b.p010c.p021h.C0112g;
import p000a.p006b.p010c.p021h.C0115j;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.InterfaceC0110e;
import p000a.p006b.p010c.p021h.InterfaceC0113h;
import p000a.p006b.p010c.p021h.InterfaceC0114i;
import p000a.p006b.p010c.p021h.InterfaceC0117l;
import p000a.p006b.p010c.p021h.p022u.C0126a;
import p000a.p006b.p025d.p026a.C0143c;
import p038c.p039a.p040a.p041a.C0335a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0113h, InterfaceC0110e, InterfaceC0117l {

    /* renamed from: B */
    public static final C0283a f1609B = new C0283a();

    /* renamed from: C */
    public static final int[] f1610C = {R.attr.fillViewport};

    /* renamed from: A */
    public InterfaceC0284b f1611A;

    /* renamed from: b */
    public long f1612b;

    /* renamed from: c */
    public final Rect f1613c;

    /* renamed from: d */
    public OverScroller f1614d;

    /* renamed from: e */
    public EdgeEffect f1615e;

    /* renamed from: f */
    public EdgeEffect f1616f;

    /* renamed from: g */
    public int f1617g;

    /* renamed from: h */
    public boolean f1618h;

    /* renamed from: i */
    public boolean f1619i;

    /* renamed from: j */
    public View f1620j;

    /* renamed from: k */
    public boolean f1621k;

    /* renamed from: l */
    public VelocityTracker f1622l;

    /* renamed from: m */
    public boolean f1623m;

    /* renamed from: n */
    public boolean f1624n;

    /* renamed from: o */
    public int f1625o;

    /* renamed from: p */
    public int f1626p;

    /* renamed from: q */
    public int f1627q;

    /* renamed from: r */
    public int f1628r;

    /* renamed from: s */
    public final int[] f1629s;

    /* renamed from: t */
    public final int[] f1630t;

    /* renamed from: u */
    public int f1631u;

    /* renamed from: v */
    public int f1632v;

    /* renamed from: w */
    public C0285c f1633w;

    /* renamed from: x */
    public final C0115j f1634x;

    /* renamed from: y */
    public final C0112g f1635y;

    /* renamed from: z */
    public float f1636z;

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    public static class C0283a extends C0107b {
        @Override // p000a.p006b.p010c.p021h.C0107b
        /* renamed from: a */
        public void mo432a(View view, C0126a c0126a) {
            int scrollRange;
            super.mo432a(view, c0126a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c0126a.f624a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c0126a.f624a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                c0126a.f624a.addAction(8192);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c0126a.f624a.addAction(4096);
            }
        }

        @Override // p000a.p006b.p010c.p021h.C0107b
        /* renamed from: a */
        public boolean mo433a(View view, int i, Bundle bundle) {
            if (super.mo433a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.m996b(0, min);
                return true;
            }
            if (i != 8192) {
                return false;
            }
            int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
            if (max == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m996b(0, max);
            return true;
        }

        @Override // p000a.p006b.p010c.p021h.C0107b
        /* renamed from: b */
        public void mo436b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo436b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            int scrollX = nestedScrollView.getScrollX();
            if (Build.VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollX(scrollX);
            }
            int scrollRange = nestedScrollView.getScrollRange();
            if (Build.VERSION.SDK_INT >= 15) {
                accessibilityEvent.setMaxScrollY(scrollRange);
            }
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface InterfaceC0284b {
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$c */
    public static class C0285c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0285c> CREATOR = new a();

        /* renamed from: b */
        public int f1637b;

        /* renamed from: android.support.v4.widget.NestedScrollView$c$a */
        public static class a implements Parcelable.Creator<C0285c> {
            @Override // android.os.Parcelable.Creator
            public C0285c createFromParcel(Parcel parcel) {
                return new C0285c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0285c[] newArray(int i) {
                return new C0285c[i];
            }
        }

        public C0285c(Parcel parcel) {
            super(parcel);
            this.f1637b = parcel.readInt();
        }

        public C0285c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m1134a = C0335a.m1134a("HorizontalScrollView.SavedState{");
            m1134a.append(Integer.toHexString(System.identityHashCode(this)));
            m1134a.append(" scrollPosition=");
            m1134a.append(this.f1637b);
            m1134a.append("}");
            return m1134a.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1637b);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1613c = new Rect();
        this.f1618h = true;
        this.f1619i = false;
        this.f1620j = null;
        this.f1621k = false;
        this.f1624n = true;
        this.f1628r = -1;
        this.f1629s = new int[2];
        this.f1630t = new int[2];
        this.f1614d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1625o = viewConfiguration.getScaledTouchSlop();
        this.f1626p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1627q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1610C, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1634x = new C0115j(this);
        this.f1635y = new C0112g(this);
        setNestedScrollingEnabled(true);
        C0119n.m457a(this, f1609B);
    }

    /* renamed from: a */
    public static boolean m980a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m980a((View) parent, view2);
    }

    /* renamed from: b */
    public static int m981b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1636z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1636z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1636z;
    }

    /* renamed from: a */
    public int m982a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        if (rect.bottom > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || rect.bottom >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* renamed from: a */
    public final void m983a() {
        if (getOverScrollMode() == 2) {
            this.f1615e = null;
            this.f1616f = null;
        } else if (this.f1615e == null) {
            Context context = getContext();
            this.f1615e = new EdgeEffect(context);
            this.f1616f = new EdgeEffect(context);
        }
    }

    /* renamed from: a */
    public final void m984a(int i, int i2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1612b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int max = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f1632v = getScrollY();
            this.f1614d.startScroll(getScrollX(), scrollY, 0, max);
            C0119n.m476k(this);
        } else {
            if (!this.f1614d.isFinished()) {
                this.f1614d.abortAnimation();
            }
            scrollBy(i, i2);
        }
        this.f1612b = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: a */
    public final void m985a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1628r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1617g = (int) motionEvent.getY(i);
            this.f1628r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f1622l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    public final void m986a(View view) {
        view.getDrawingRect(this.f1613c);
        offsetDescendantRectToMyCoords(view, this.f1613c);
        int m982a = m982a(this.f1613c);
        if (m982a != 0) {
            scrollBy(0, m982a);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0113h
    /* renamed from: a */
    public void mo447a(View view, int i) {
        this.f1634x.f603a = 0;
        m1003h(i);
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0113h
    /* renamed from: a */
    public void mo448a(View view, int i, int i2, int i3, int i4, int i5) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        m990a(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5);
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0113h
    /* renamed from: a */
    public void mo449a(View view, int i, int i2, int[] iArr, int i3) {
        m991a(i, i2, iArr, (int[]) null, i3);
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0113h
    /* renamed from: a */
    public void mo450a(View view, View view2, int i, int i2) {
        this.f1634x.f603a = i;
        m998c(2, i2);
    }

    /* renamed from: a */
    public boolean m987a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m993a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m995b(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1613c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1613c);
            m995b(m982a(this.f1613c));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!m993a(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m988a(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4) {
                            if (!z5) {
                            }
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else {
                        if (!z5) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m995b(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m989a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = 0
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = 0
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r7 = r2
        L4e:
            r2 = 1
            goto L55
        L50:
            if (r3 >= r7) goto L53
            goto L4e
        L53:
            r7 = r3
            r2 = 0
        L55:
            if (r6 <= r1) goto L5a
            r8 = r1
        L58:
            r1 = 1
            goto L5f
        L5a:
            if (r6 >= r8) goto L5d
            goto L58
        L5d:
            r8 = r6
            r1 = 0
        L5f:
            if (r1 == 0) goto L7e
            boolean r3 = r12.m1001f(r5)
            if (r3 != 0) goto L7e
            android.widget.OverScroller r3 = r0.f1614d
            r6 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r8
            r16 = r6
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L7e:
            r12.onOverScrolled(r7, r8, r2, r1)
            if (r2 != 0) goto L85
            if (r1 == 0) goto L86
        L85:
            r4 = 1
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.m989a(int, int, int, int, int, int, int, int):boolean");
    }

    /* renamed from: a */
    public boolean m990a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        ViewParent m444a;
        int i6;
        int i7;
        C0112g c0112g = this.f1635y;
        if (!c0112g.f601d || (m444a = c0112g.m444a(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr == null) {
                return false;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        if (iArr != null) {
            c0112g.f600c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        C0027d.m71a(m444a, c0112g.f600c, i, i2, i3, i4, i5);
        if (iArr != null) {
            c0112g.f600c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m991a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m444a;
        int i4;
        int i5;
        int[] iArr3;
        C0112g c0112g = this.f1635y;
        if (!c0112g.f601d || (m444a = c0112g.m444a(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            c0112g.f600c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (c0112g.f602e == null) {
                c0112g.f602e = new int[2];
            }
            iArr3 = c0112g.f602e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        C0027d.m72a(m444a, c0112g.f600c, i, i2, iArr3, i3);
        if (iArr2 != null) {
            c0112g.f600c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m992a(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f1613c
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L33
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L62
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L61
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L61
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L4c
            r6 = 0
        L4c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r3)
            if (r6 == 0) goto L5f
            if (r6 == r5) goto L5f
            boolean r6 = r6.requestFocus(r3)
            if (r6 == 0) goto L5f
            goto L60
        L5f:
            r1 = 0
        L60:
            return r1
        L61:
            return r2
        L62:
            int r0 = r6.getAction()
            if (r0 != 0) goto La6
            int r0 = r6.getKeyCode()
            r1 = 19
            r4 = 33
            if (r0 == r1) goto L97
            r1 = 20
            if (r0 == r1) goto L87
            r1 = 62
            if (r0 == r1) goto L7b
            goto La6
        L7b:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L83
            r3 = 33
        L83:
            r5.m1002g(r3)
            goto La6
        L87:
            boolean r6 = r6.isAltPressed()
            if (r6 != 0) goto L92
            boolean r2 = r5.m987a(r3)
            goto La6
        L92:
            boolean r2 = r5.m1000e(r3)
            goto La6
        L97:
            boolean r6 = r6.isAltPressed()
            if (r6 != 0) goto La2
            boolean r2 = r5.m987a(r4)
            goto La6
        La2:
            boolean r2 = r5.m1000e(r4)
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.m992a(android.view.KeyEvent):boolean");
    }

    /* renamed from: a */
    public final boolean m993a(View view, int i, int i2) {
        view.getDrawingRect(this.f1613c);
        offsetDescendantRectToMyCoords(view, this.f1613c);
        return this.f1613c.bottom + i >= getScrollY() && this.f1613c.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public final void m994b() {
        VelocityTracker velocityTracker = this.f1622l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1622l = null;
        }
    }

    /* renamed from: b */
    public final void m995b(int i) {
        if (i != 0) {
            if (this.f1624n) {
                m984a(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* renamed from: b */
    public final void m996b(int i, int i2) {
        m984a(i - getScrollX(), i2 - getScrollY());
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0113h
    /* renamed from: b */
    public boolean mo451b(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public void m997c(int i) {
        if (getChildCount() > 0) {
            m998c(2, 1);
            this.f1614d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1632v = getScrollY();
            C0119n.m476k(this);
        }
    }

    /* renamed from: c */
    public boolean m998c(int i, int i2) {
        boolean z;
        C0112g c0112g = this.f1635y;
        if (c0112g.m446b(i2)) {
            return true;
        }
        if (c0112g.f601d) {
            View view = c0112g.f600c;
            for (ViewParent parent = c0112g.f600c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = c0112g.f600c;
                boolean z2 = parent instanceof InterfaceC0113h;
                if (z2) {
                    z = ((InterfaceC0113h) parent).mo451b(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                z = parent.onStartNestedScroll(view, view2, i);
                            } catch (AbstractMethodError e) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            }
                        } else if (parent instanceof InterfaceC0114i) {
                            z = ((InterfaceC0114i) parent).onStartNestedScroll(view, view2, i);
                        }
                    }
                    z = false;
                }
                if (z) {
                    c0112g.m445a(i2, parent);
                    View view3 = c0112g.f600c;
                    if (z2) {
                        ((InterfaceC0113h) parent).mo450a(view, view3, i, i2);
                        return true;
                    }
                    if (i2 != 0) {
                        return true;
                    }
                    if (Build.VERSION.SDK_INT < 21) {
                        if (!(parent instanceof InterfaceC0114i)) {
                            return true;
                        }
                        ((InterfaceC0114i) parent).onNestedScrollAccepted(view, view3, i);
                        return true;
                    }
                    try {
                        parent.onNestedScrollAccepted(view, view3, i);
                        return true;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        return true;
                    }
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        boolean z = false;
        if (!this.f1614d.computeScrollOffset()) {
            if (m1001f(1)) {
                m1003h(1);
            }
            this.f1632v = 0;
            return;
        }
        this.f1614d.getCurrX();
        int currY = this.f1614d.getCurrY();
        int i = currY - this.f1632v;
        if (m991a(0, i, this.f1630t, (int[]) null, 1)) {
            i -= this.f1630t[1];
        }
        if (i != 0) {
            int scrollRange = getScrollRange();
            int scrollY = getScrollY();
            m989a(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            if (!m990a(0, scrollY2, 0, i - scrollY2, (int[]) null, 1)) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m983a();
                    if (currY <= 0 && scrollY > 0) {
                        this.f1615e.onAbsorb((int) this.f1614d.getCurrVelocity());
                    } else if (currY >= scrollRange && scrollY < scrollRange) {
                        this.f1616f.onAbsorb((int) this.f1614d.getCurrVelocity());
                    }
                }
            }
        }
        this.f1632v = currY;
        C0119n.m476k(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public final void m999d(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        float f = i;
        if (dispatchNestedPreFling(0.0f, f)) {
            return;
        }
        dispatchNestedFling(0.0f, f, z);
        m997c(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m992a(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent m444a;
        C0112g c0112g = this.f1635y;
        if (!c0112g.f601d || (m444a = c0112g.m444a(0)) == null) {
            return false;
        }
        return C0027d.m81a(m444a, c0112g.f600c, f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent m444a;
        C0112g c0112g = this.f1635y;
        if (!c0112g.f601d || (m444a = c0112g.m444a(0)) == null) {
            return false;
        }
        View view = c0112g.f600c;
        if (Build.VERSION.SDK_INT < 21) {
            if (m444a instanceof InterfaceC0114i) {
                return ((InterfaceC0114i) m444a).onNestedPreFling(view, f, f2);
            }
            return false;
        }
        try {
            return m444a.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + m444a + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m991a(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return m990a(i, i2, i3, i4, iArr, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f1615e != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.f1615e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate(paddingLeft, min);
                this.f1615e.setSize(width, height);
                if (this.f1615e.draw(canvas)) {
                    C0119n.m476k(this);
                }
                canvas.restoreToCount(save);
            }
            if (this.f1616f.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i = 0 + getPaddingLeft();
            }
            if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f1616f.setSize(width2, height2);
            if (this.f1616f.draw(canvas)) {
                C0119n.m476k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public boolean m1000e(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f1613c;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1613c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1613c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1613c;
        return m988a(i, rect3.top, rect3.bottom);
    }

    /* renamed from: f */
    public boolean m1001f(int i) {
        return this.f1635y.m444a(i) != null;
    }

    /* renamed from: g */
    public boolean m1002g(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f1613c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                Rect rect = this.f1613c;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.f1613c.top = getScrollY() - height;
            Rect rect2 = this.f1613c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1613c;
        int i2 = rect3.top;
        rect3.bottom = height + i2;
        return m988a(i, i2, rect3.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1634x.f603a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void m1003h(int i) {
        C0112g c0112g = this.f1635y;
        ViewParent m444a = c0112g.m444a(i);
        if (m444a != null) {
            C0027d.m70a(m444a, c0112g.f600c, i);
            c0112g.m445a(i, null);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m1001f(0);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f1635y.f601d;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1619i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1621k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f1618h = false;
        View view = this.f1620j;
        if (view != null && m980a(view, this)) {
            m986a(this.f1620j);
        }
        this.f1620j = null;
        if (!this.f1619i) {
            if (this.f1633w != null) {
                scrollTo(getScrollX(), this.f1633w.f1637b);
                this.f1633w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m981b = m981b(scrollY, paddingTop, i5);
            if (m981b != scrollY) {
                scrollTo(getScrollX(), m981b);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1619i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1623m && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m999d((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo449a(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo448a(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo450a(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus == null || (true ^ m993a(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0285c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0285c c0285c = (C0285c) parcelable;
        super.onRestoreInstanceState(c0285c.getSuperState());
        this.f1633w = c0285c;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0285c c0285c = new C0285c(super.onSaveInstanceState());
        c0285c.f1637b = getScrollY();
        return c0285c;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0284b interfaceC0284b = this.f1611A;
        if (interfaceC0284b != null) {
            C0143c c0143c = (C0143c) interfaceC0284b;
            AlertController.m1004a(this, c0143c.f684a, c0143c.f685b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m993a(findFocus, 0, i4)) {
            return;
        }
        findFocus.getDrawingRect(this.f1613c);
        offsetDescendantRectToMyCoords(findFocus, this.f1613c);
        m995b(m982a(this.f1613c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo451b(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public void onStopNestedScroll(View view) {
        mo447a(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1622l == null) {
            this.f1622l = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1631u = 0;
        }
        obtain.offsetLocation(0.0f, this.f1631u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1622l;
                velocityTracker.computeCurrentVelocity(1000, this.f1627q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1628r);
                if (Math.abs(yVelocity) > this.f1626p) {
                    m999d(-yVelocity);
                } else if (this.f1614d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0119n.m476k(this);
                }
                this.f1628r = -1;
                this.f1621k = false;
                m994b();
                m1003h(0);
                EdgeEffect edgeEffect = this.f1615e;
                if (edgeEffect != null) {
                    edgeEffect.onRelease();
                    this.f1616f.onRelease();
                }
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1628r);
                if (findPointerIndex == -1) {
                    StringBuilder m1134a = C0335a.m1134a("Invalid pointerId=");
                    m1134a.append(this.f1628r);
                    m1134a.append(" in onTouchEvent");
                    Log.e("NestedScrollView", m1134a.toString());
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = this.f1617g - y;
                    if (m991a(0, i, this.f1630t, this.f1629s, 0)) {
                        i -= this.f1630t[1];
                        obtain.offsetLocation(0.0f, this.f1629s[1]);
                        this.f1631u += this.f1629s[1];
                    }
                    if (!this.f1621k && Math.abs(i) > this.f1625o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1621k = true;
                        i = i > 0 ? i - this.f1625o : i + this.f1625o;
                    }
                    int i2 = i;
                    if (this.f1621k) {
                        this.f1617g = y - this.f1629s[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (m989a(0, i2, 0, getScrollY(), 0, scrollRange, 0, 0) && !m1001f(0)) {
                            this.f1622l.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (m990a(0, scrollY2, 0, i2 - scrollY2, this.f1629s, 0)) {
                            this.f1617g = this.f1617g - this.f1629s[1];
                            obtain.offsetLocation(0.0f, r1[1]);
                            this.f1631u += this.f1629s[1];
                        } else if (z) {
                            m983a();
                            int i3 = scrollY + i2;
                            if (i3 < 0) {
                                EdgeEffect edgeEffect2 = this.f1615e;
                                float height = i2 / getHeight();
                                float x = motionEvent.getX(findPointerIndex) / getWidth();
                                if (Build.VERSION.SDK_INT >= 21) {
                                    edgeEffect2.onPull(height, x);
                                } else {
                                    edgeEffect2.onPull(height);
                                }
                                if (!this.f1616f.isFinished()) {
                                    this.f1616f.onRelease();
                                }
                            } else if (i3 > scrollRange) {
                                EdgeEffect edgeEffect3 = this.f1616f;
                                float height2 = i2 / getHeight();
                                float x2 = 1.0f - (motionEvent.getX(findPointerIndex) / getWidth());
                                if (Build.VERSION.SDK_INT >= 21) {
                                    edgeEffect3.onPull(height2, x2);
                                } else {
                                    edgeEffect3.onPull(height2);
                                }
                                if (!this.f1615e.isFinished()) {
                                    this.f1615e.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect4 = this.f1615e;
                            if (edgeEffect4 != null && (!edgeEffect4.isFinished() || !this.f1616f.isFinished())) {
                                C0119n.m476k(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1621k && getChildCount() > 0 && this.f1614d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0119n.m476k(this);
                }
                this.f1628r = -1;
                this.f1621k = false;
                m994b();
                m1003h(0);
                EdgeEffect edgeEffect5 = this.f1615e;
                if (edgeEffect5 != null) {
                    edgeEffect5.onRelease();
                    this.f1616f.onRelease();
                }
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1617g = (int) motionEvent.getY(actionIndex);
                this.f1628r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m985a(motionEvent);
                this.f1617g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1628r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.f1614d.isFinished();
            this.f1621k = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1614d.isFinished()) {
                this.f1614d.abortAnimation();
            }
            this.f1617g = (int) motionEvent.getY();
            this.f1628r = motionEvent.getPointerId(0);
            m998c(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f1622l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1618h) {
            this.f1620j = view2;
        } else {
            m986a(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int m982a = m982a(rect);
        boolean z2 = m982a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, m982a);
            } else {
                m984a(0, m982a);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m994b();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1618h = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m981b = m981b(i, width, width2);
            int m981b2 = m981b(i2, height, height2);
            if (m981b == getScrollX() && m981b2 == getScrollY()) {
                return;
            }
            super.scrollTo(m981b, m981b2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f1623m) {
            this.f1623m = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0112g c0112g = this.f1635y;
        if (c0112g.f601d) {
            C0119n.m478m(c0112g.f600c);
        }
        c0112g.f601d = z;
    }

    public void setOnScrollChangeListener(InterfaceC0284b interfaceC0284b) {
        this.f1611A = interfaceC0284b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f1624n = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return m998c(i, 0);
    }

    @Override // android.view.View, p000a.p006b.p010c.p021h.InterfaceC0111f
    public void stopNestedScroll() {
        m1003h(0);
    }
}
