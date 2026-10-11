package android.support.v7.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import p000a.p006b.p010c.p021h.C0115j;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.InterfaceC0114i;
import p000a.p006b.p025d.p026a.C0165y;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p029d.p030a.C0181a;
import p000a.p006b.p025d.p033f.C0192g;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p035g.C0222c;
import p000a.p006b.p025d.p035g.C0230e1;
import p000a.p006b.p025d.p035g.C0242i1;
import p000a.p006b.p025d.p035g.InterfaceC0232f0;
import p000a.p006b.p025d.p035g.InterfaceC0235g0;
import p038c.p039a.p040a.p041a.C0335a;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0232f0, InterfaceC0114i {

    /* renamed from: C */
    public static final int[] f1790C = {C0166a.actionBarSize, R.attr.windowContentOverlay};

    /* renamed from: A */
    public final Runnable f1791A;

    /* renamed from: B */
    public final C0115j f1792B;

    /* renamed from: b */
    public int f1793b;

    /* renamed from: c */
    public int f1794c;

    /* renamed from: d */
    public ContentFrameLayout f1795d;

    /* renamed from: e */
    public ActionBarContainer f1796e;

    /* renamed from: f */
    public InterfaceC0235g0 f1797f;

    /* renamed from: g */
    public Drawable f1798g;

    /* renamed from: h */
    public boolean f1799h;

    /* renamed from: i */
    public boolean f1800i;

    /* renamed from: j */
    public boolean f1801j;

    /* renamed from: k */
    public boolean f1802k;

    /* renamed from: l */
    public boolean f1803l;

    /* renamed from: m */
    public int f1804m;

    /* renamed from: n */
    public int f1805n;

    /* renamed from: o */
    public final Rect f1806o;

    /* renamed from: p */
    public final Rect f1807p;

    /* renamed from: q */
    public final Rect f1808q;

    /* renamed from: r */
    public final Rect f1809r;

    /* renamed from: s */
    public final Rect f1810s;

    /* renamed from: t */
    public final Rect f1811t;

    /* renamed from: u */
    public final Rect f1812u;

    /* renamed from: v */
    public InterfaceC0297d f1813v;

    /* renamed from: w */
    public OverScroller f1814w;

    /* renamed from: x */
    public ViewPropertyAnimator f1815x;

    /* renamed from: y */
    public final AnimatorListenerAdapter f1816y;

    /* renamed from: z */
    public final Runnable f1817z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public class C0294a extends AnimatorListenerAdapter {
        public C0294a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1815x = null;
            actionBarOverlayLayout.f1803l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1815x = null;
            actionBarOverlayLayout.f1803l = false;
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public class RunnableC0295b implements Runnable {
        public RunnableC0295b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1035h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1815x = actionBarOverlayLayout.f1796e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1816y);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$c */
    public class RunnableC0296c implements Runnable {
        public RunnableC0296c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m1035h();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1815x = actionBarOverlayLayout.f1796e.animate().translationY(-ActionBarOverlayLayout.this.f1796e.getHeight()).setListener(ActionBarOverlayLayout.this.f1816y);
        }
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$d */
    public interface InterfaceC0297d {
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$e */
    public static class C0298e extends ViewGroup.MarginLayoutParams {
        public C0298e(int i, int i2) {
            super(i, i2);
        }

        public C0298e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0298e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1794c = 0;
        this.f1806o = new Rect();
        this.f1807p = new Rect();
        this.f1808q = new Rect();
        this.f1809r = new Rect();
        this.f1810s = new Rect();
        this.f1811t = new Rect();
        this.f1812u = new Rect();
        this.f1816y = new C0294a();
        this.f1817z = new RunnableC0295b();
        this.f1791A = new RunnableC0296c();
        m1032a(context);
        this.f1792B = new C0115j(this);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: a */
    public void mo811a(int i) {
        m1037j();
        if (i == 2) {
            ((C0230e1) this.f1797f).m807c();
        } else if (i == 5) {
            ((C0230e1) this.f1797f).m805b();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* renamed from: a */
    public final void m1032a(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1790C);
        this.f1793b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f1798g = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f1798g == null);
        obtainStyledAttributes.recycle();
        this.f1799h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1814w = new OverScroller(context);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: a */
    public void mo812a(Menu menu, InterfaceC0209p.a aVar) {
        m1037j();
        C0230e1 c0230e1 = (C0230e1) this.f1797f;
        if (c0230e1.f1262n == null) {
            c0230e1.f1262n = new C0222c(c0230e1.f1249a.getContext());
            c0230e1.f1262n.m658a(C0171f.action_menu_presenter);
        }
        C0222c c0222c = c0230e1.f1262n;
        c0222c.f1016f = aVar;
        c0230e1.f1249a.m1096a((C0201h) menu, c0222c);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: a */
    public boolean mo813a() {
        m1037j();
        return ((C0230e1) this.f1797f).f1249a.m1120p();
    }

    /* renamed from: a */
    public final boolean m1033a(float f) {
        this.f1814w.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1814w.getFinalY() > this.f1796e.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1034a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.support.v7.widget.ActionBarOverlayLayout$e r3 = (android.support.v7.widget.ActionBarOverlayLayout.C0298e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = 1
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = 1
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = 1
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            r5 = 1
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.m1034a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: b */
    public void mo814b() {
        m1037j();
        ((C0230e1) this.f1797f).f1249a.m1107d();
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: c */
    public boolean mo815c() {
        m1037j();
        return ((C0230e1) this.f1797f).f1249a.m1117m();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0298e;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: d */
    public void mo816d() {
        m1037j();
        ((C0230e1) this.f1797f).f1261m = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1798g == null || this.f1799h) {
            return;
        }
        if (this.f1796e.getVisibility() == 0) {
            i = (int) (this.f1796e.getTranslationY() + this.f1796e.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f1798g.setBounds(0, i, getWidth(), this.f1798g.getIntrinsicHeight() + i);
        this.f1798g.draw(canvas);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: e */
    public boolean mo817e() {
        m1037j();
        return ((C0230e1) this.f1797f).f1249a.m1118n();
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: f */
    public boolean mo818f() {
        m1037j();
        return ((C0230e1) this.f1797f).f1249a.m1104b();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        m1037j();
        int m471f = C0119n.m471f(this) & 256;
        boolean m1034a = m1034a(this.f1796e, rect, true, true, false, true);
        this.f1809r.set(rect);
        C0242i1.m836a(this, this.f1809r, this.f1806o);
        if (!this.f1810s.equals(this.f1809r)) {
            this.f1810s.set(this.f1809r);
            m1034a = true;
        }
        if (!this.f1807p.equals(this.f1806o)) {
            this.f1807p.set(this.f1806o);
            m1034a = true;
        }
        if (m1034a) {
            requestLayout();
        }
        return true;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    /* renamed from: g */
    public boolean mo819g() {
        m1037j();
        return ((C0230e1) this.f1797f).f1249a.m1116l();
    }

    @Override // android.view.ViewGroup
    public C0298e generateDefaultLayoutParams() {
        return new C0298e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public C0298e generateLayoutParams(AttributeSet attributeSet) {
        return new C0298e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0298e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1796e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1792B.f603a;
    }

    public CharSequence getTitle() {
        m1037j();
        return ((C0230e1) this.f1797f).f1249a.getTitle();
    }

    /* renamed from: h */
    public void m1035h() {
        removeCallbacks(this.f1817z);
        removeCallbacks(this.f1791A);
        ViewPropertyAnimator viewPropertyAnimator = this.f1815x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: i */
    public boolean m1036i() {
        return this.f1800i;
    }

    /* renamed from: j */
    public void m1037j() {
        InterfaceC0235g0 wrapper;
        if (this.f1795d == null) {
            this.f1795d = (ContentFrameLayout) findViewById(C0171f.action_bar_activity_content);
            this.f1796e = (ActionBarContainer) findViewById(C0171f.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(C0171f.action_bar);
            if (findViewById instanceof InterfaceC0235g0) {
                wrapper = (InterfaceC0235g0) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    StringBuilder m1134a = C0335a.m1134a("Can't make a decor toolbar out of ");
                    m1134a.append(findViewById.getClass().getSimpleName());
                    throw new IllegalStateException(m1134a.toString());
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f1797f = wrapper;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1032a(getContext());
        C0119n.m477l(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1035h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C0298e c0298e = (C0298e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) c0298e).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) c0298e).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        m1037j();
        measureChildWithMargins(this.f1796e, i, 0, i2, 0);
        C0298e c0298e = (C0298e) this.f1796e.getLayoutParams();
        int max = Math.max(0, this.f1796e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0298e).leftMargin + ((ViewGroup.MarginLayoutParams) c0298e).rightMargin);
        int max2 = Math.max(0, this.f1796e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0298e).topMargin + ((ViewGroup.MarginLayoutParams) c0298e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1796e.getMeasuredState());
        boolean z = (C0119n.m471f(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f1793b;
            if (this.f1801j && this.f1796e.getTabContainer() != null) {
                measuredHeight += this.f1793b;
            }
        } else {
            measuredHeight = this.f1796e.getVisibility() != 8 ? this.f1796e.getMeasuredHeight() : 0;
        }
        this.f1808q.set(this.f1806o);
        this.f1811t.set(this.f1809r);
        if (this.f1800i || z) {
            Rect rect = this.f1811t;
            rect.top += measuredHeight;
            rect.bottom += 0;
        } else {
            Rect rect2 = this.f1808q;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m1034a(this.f1795d, this.f1808q, true, true, true, true);
        if (!this.f1812u.equals(this.f1811t)) {
            this.f1812u.set(this.f1811t);
            this.f1795d.m1059a(this.f1811t);
        }
        measureChildWithMargins(this.f1795d, i, 0, i2, 0);
        C0298e c0298e2 = (C0298e) this.f1795d.getLayoutParams();
        int max3 = Math.max(max, this.f1795d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0298e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0298e2).rightMargin);
        int max4 = Math.max(max2, this.f1795d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0298e2).topMargin + ((ViewGroup.MarginLayoutParams) c0298e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1795d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1802k || !z) {
            return false;
        }
        if (m1033a(f2)) {
            m1035h();
            this.f1791A.run();
        } else {
            m1035h();
            this.f1817z.run();
        }
        this.f1803l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f1804m += i2;
        setActionBarHideOffset(this.f1804m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public void onNestedScrollAccepted(View view, View view2, int i) {
        C0165y c0165y;
        C0192g c0192g;
        this.f1792B.m452a(i);
        this.f1804m = getActionBarHideOffset();
        m1035h();
        InterfaceC0297d interfaceC0297d = this.f1813v;
        if (interfaceC0297d == null || (c0192g = (c0165y = (C0165y) interfaceC0297d).f837v) == null) {
            return;
        }
        c0192g.m654a();
        c0165y.f837v = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1796e.getVisibility() != 0) {
            return false;
        }
        return this.f1802k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p000a.p006b.p010c.p021h.InterfaceC0114i
    public void onStopNestedScroll(View view) {
        if (this.f1802k && !this.f1803l) {
            if (this.f1804m <= this.f1796e.getHeight()) {
                m1035h();
                postDelayed(this.f1817z, 600L);
            } else {
                m1035h();
                postDelayed(this.f1791A, 600L);
            }
        }
        InterfaceC0297d interfaceC0297d = this.f1813v;
        if (interfaceC0297d != null) {
            ((C0165y) interfaceC0297d).m598e();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        m1037j();
        int i2 = this.f1805n ^ i;
        this.f1805n = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        InterfaceC0297d interfaceC0297d = this.f1813v;
        if (interfaceC0297d != null) {
            ((C0165y) interfaceC0297d).f832q = !z2;
            if (z || !z2) {
                C0165y c0165y = (C0165y) this.f1813v;
                if (c0165y.f834s) {
                    c0165y.f834s = false;
                    c0165y.m600f(true);
                }
            } else {
                C0165y c0165y2 = (C0165y) interfaceC0297d;
                if (!c0165y2.f834s) {
                    c0165y2.f834s = true;
                    c0165y2.m600f(true);
                }
            }
        }
        if ((i2 & 256) == 0 || this.f1813v == null) {
            return;
        }
        C0119n.m477l(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1794c = i;
        InterfaceC0297d interfaceC0297d = this.f1813v;
        if (interfaceC0297d != null) {
            ((C0165y) interfaceC0297d).f831p = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        m1035h();
        this.f1796e.setTranslationY(-Math.max(0, Math.min(i, this.f1796e.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0297d interfaceC0297d) {
        this.f1813v = interfaceC0297d;
        if (getWindowToken() != null) {
            ((C0165y) this.f1813v).f831p = this.f1794c;
            int i = this.f1805n;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C0119n.m477l(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1801j = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1802k) {
            this.f1802k = z;
            if (z) {
                return;
            }
            m1035h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m1037j();
        C0230e1 c0230e1 = (C0230e1) this.f1797f;
        c0230e1.f1253e = i != 0 ? C0181a.m618c(c0230e1.m799a(), i) : null;
        c0230e1.m810f();
    }

    public void setIcon(Drawable drawable) {
        m1037j();
        C0230e1 c0230e1 = (C0230e1) this.f1797f;
        c0230e1.f1253e = drawable;
        c0230e1.m810f();
    }

    public void setLogo(int i) {
        m1037j();
        C0230e1 c0230e1 = (C0230e1) this.f1797f;
        c0230e1.m802a(i != 0 ? C0181a.m618c(c0230e1.m799a(), i) : null);
    }

    public void setOverlayMode(boolean z) {
        this.f1800i = z;
        this.f1799h = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    public void setWindowCallback(Window.Callback callback) {
        m1037j();
        ((C0230e1) this.f1797f).f1260l = callback;
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0232f0
    public void setWindowTitle(CharSequence charSequence) {
        m1037j();
        ((C0230e1) this.f1797f).m806b(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
