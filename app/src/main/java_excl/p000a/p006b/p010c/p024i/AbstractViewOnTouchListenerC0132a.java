package p000a.p006b.p010c.p024i;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import p000a.p006b.p010c.p021h.C0119n;

/* renamed from: a.b.c.i.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0132a implements View.OnTouchListener {

    /* renamed from: s */
    public static final int f631s = ViewConfiguration.getTapTimeout();

    /* renamed from: d */
    public final View f634d;

    /* renamed from: e */
    public Runnable f635e;

    /* renamed from: h */
    public int f638h;

    /* renamed from: i */
    public int f639i;

    /* renamed from: m */
    public boolean f643m;

    /* renamed from: n */
    public boolean f644n;

    /* renamed from: o */
    public boolean f645o;

    /* renamed from: p */
    public boolean f646p;

    /* renamed from: q */
    public boolean f647q;

    /* renamed from: r */
    public boolean f648r;

    /* renamed from: b */
    public final a f632b = new a();

    /* renamed from: c */
    public final Interpolator f633c = new AccelerateInterpolator();

    /* renamed from: f */
    public float[] f636f = {0.0f, 0.0f};

    /* renamed from: g */
    public float[] f637g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: j */
    public float[] f640j = {0.0f, 0.0f};

    /* renamed from: k */
    public float[] f641k = {0.0f, 0.0f};

    /* renamed from: l */
    public float[] f642l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: a.b.c.i.a$a */
    public static class a {

        /* renamed from: a */
        public int f649a;

        /* renamed from: b */
        public int f650b;

        /* renamed from: c */
        public float f651c;

        /* renamed from: d */
        public float f652d;

        /* renamed from: j */
        public float f658j;

        /* renamed from: k */
        public int f659k;

        /* renamed from: e */
        public long f653e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f657i = -1;

        /* renamed from: f */
        public long f654f = 0;

        /* renamed from: g */
        public int f655g = 0;

        /* renamed from: h */
        public int f656h = 0;

        /* renamed from: a */
        public final float m507a(long j) {
            if (j < this.f653e) {
                return 0.0f;
            }
            long j2 = this.f657i;
            if (j2 < 0 || j < j2) {
                return AbstractViewOnTouchListenerC0132a.m500a((j - this.f653e) / this.f649a, 0.0f, 1.0f) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.f658j;
            return (AbstractViewOnTouchListenerC0132a.m500a(j3 / this.f659k, 0.0f, 1.0f) * f) + (1.0f - f);
        }

        /* renamed from: a */
        public void m508a() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f659k = AbstractViewOnTouchListenerC0132a.m501a((int) (currentAnimationTimeMillis - this.f653e), 0, this.f650b);
            this.f658j = m507a(currentAnimationTimeMillis);
            this.f657i = currentAnimationTimeMillis;
        }

        /* renamed from: b */
        public void m509b() {
            this.f653e = AnimationUtils.currentAnimationTimeMillis();
            this.f657i = -1L;
            this.f654f = this.f653e;
            this.f658j = 0.5f;
            this.f655g = 0;
            this.f656h = 0;
        }
    }

    /* renamed from: a.b.c.i.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt;
            AbstractViewOnTouchListenerC0132a abstractViewOnTouchListenerC0132a = AbstractViewOnTouchListenerC0132a.this;
            if (abstractViewOnTouchListenerC0132a.f646p) {
                if (abstractViewOnTouchListenerC0132a.f644n) {
                    abstractViewOnTouchListenerC0132a.f644n = false;
                    abstractViewOnTouchListenerC0132a.f632b.m509b();
                }
                a aVar = AbstractViewOnTouchListenerC0132a.this.f632b;
                if ((aVar.f657i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f657i + ((long) aVar.f659k)) || !AbstractViewOnTouchListenerC0132a.this.m506b()) {
                    AbstractViewOnTouchListenerC0132a.this.f646p = false;
                    return;
                }
                AbstractViewOnTouchListenerC0132a abstractViewOnTouchListenerC0132a2 = AbstractViewOnTouchListenerC0132a.this;
                if (abstractViewOnTouchListenerC0132a2.f645o) {
                    abstractViewOnTouchListenerC0132a2.f645o = false;
                    abstractViewOnTouchListenerC0132a2.m505a();
                }
                if (aVar.f654f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float m507a = aVar.m507a(currentAnimationTimeMillis);
                long j = currentAnimationTimeMillis - aVar.f654f;
                aVar.f654f = currentAnimationTimeMillis;
                float f = j * ((m507a * 4.0f) + ((-4.0f) * m507a * m507a));
                aVar.f655g = (int) (aVar.f651c * f);
                aVar.f656h = (int) (f * aVar.f652d);
                int i = aVar.f655g;
                int i2 = aVar.f656h;
                ListView listView = ((C0136e) AbstractViewOnTouchListenerC0132a.this).f673t;
                if (Build.VERSION.SDK_INT >= 19) {
                    listView.scrollListBy(i2);
                } else {
                    int firstVisiblePosition = listView.getFirstVisiblePosition();
                    if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
                        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
                    }
                }
                C0119n.m462a(AbstractViewOnTouchListenerC0132a.this.f634d, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC0132a(View view) {
        this.f634d = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f642l;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.f641k;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        this.f638h = 1;
        float[] fArr3 = this.f637g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f636f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f640j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f639i = f631s;
        a aVar = this.f632b;
        aVar.f649a = 500;
        aVar.f650b = 500;
    }

    /* renamed from: a */
    public static float m500a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    public static int m501a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public final float m502a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f638h;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f646p && this.f638h == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m503a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f636f
            r0 = r0[r4]
            float[] r1 = r3.f637g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = m500a(r0, r2, r1)
            float r1 = r3.m502a(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.m502a(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L26
            android.view.animation.Interpolator r6 = r3.f633c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L30
        L26:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L39
            android.view.animation.Interpolator r6 = r3.f633c
            float r5 = r6.getInterpolation(r5)
        L30:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = m500a(r5, r6, r0)
            goto L3a
        L39:
            r5 = 0
        L3a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3f
            return r2
        L3f:
            float[] r6 = r3.f640j
            r6 = r6[r4]
            float[] r0 = r3.f641k
            r0 = r0[r4]
            float[] r1 = r3.f642l
            r4 = r1[r4]
            float r6 = r6 * r7
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L58
            float r5 = r5 * r6
            float r4 = m500a(r5, r0, r4)
            return r4
        L58:
            float r5 = -r5
            float r5 = r5 * r6
            float r4 = m500a(r5, r0, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p024i.AbstractViewOnTouchListenerC0132a.m503a(int, float, float, float):float");
    }

    /* renamed from: a */
    public AbstractViewOnTouchListenerC0132a m504a(boolean z) {
        if (this.f647q && !z) {
            if (this.f644n) {
                this.f646p = false;
            } else {
                this.f632b.m508a();
            }
        }
        this.f647q = z;
        return this;
    }

    /* renamed from: a */
    public void m505a() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f634d.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m506b() {
        /*
            r9 = this;
            a.b.c.i.a$a r0 = r9.f632b
            float r1 = r0.f652d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f651c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            a.b.c.i.e r4 = (p000a.p006b.p010c.p024i.C0136e) r4
            android.widget.ListView r4 = r4.f673t
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = 0
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = 1
        L51:
            if (r1 != 0) goto L59
        L53:
            if (r0 == 0) goto L58
            r0 = r9
            a.b.c.i.e r0 = (p000a.p006b.p010c.p024i.C0136e) r0
        L58:
            r2 = 0
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p024i.AbstractViewOnTouchListenerC0132a.m506b():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L32;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f647q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L27
            r6 = 3
            if (r0 == r6) goto L16
            goto L86
        L16:
            boolean r6 = r5.f644n
            if (r6 == 0) goto L1d
            r5.f646p = r1
            goto L86
        L1d:
            a.b.c.i.a$a r6 = r5.f632b
            r6.m508a()
            goto L86
        L23:
            r5.f645o = r2
            r5.f643m = r1
        L27:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f634d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m503a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f634d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m503a(r2, r7, r6, r3)
            a.b.c.i.a$a r7 = r5.f632b
            r7.f651c = r0
            r7.f652d = r6
            boolean r6 = r5.f646p
            if (r6 != 0) goto L86
            boolean r6 = r5.m506b()
            if (r6 == 0) goto L86
            java.lang.Runnable r6 = r5.f635e
            if (r6 != 0) goto L6a
            a.b.c.i.a$b r6 = new a.b.c.i.a$b
            r6.<init>()
            r5.f635e = r6
        L6a:
            r5.f646p = r2
            r5.f644n = r2
            boolean r6 = r5.f643m
            if (r6 != 0) goto L7f
            int r6 = r5.f639i
            if (r6 <= 0) goto L7f
            android.view.View r7 = r5.f634d
            java.lang.Runnable r0 = r5.f635e
            long r3 = (long) r6
            p000a.p006b.p010c.p021h.C0119n.m463a(r7, r0, r3)
            goto L84
        L7f:
            java.lang.Runnable r6 = r5.f635e
            r6.run()
        L84:
            r5.f643m = r2
        L86:
            boolean r6 = r5.f648r
            if (r6 == 0) goto L8f
            boolean r6 = r5.f646p
            if (r6 == 0) goto L8f
            r1 = 1
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p024i.AbstractViewOnTouchListenerC0132a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
