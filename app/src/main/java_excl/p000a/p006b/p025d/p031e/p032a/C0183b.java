package p000a.p006b.p025d.p031e.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p000a.p006b.p008b.p009a.C0027d;

/* renamed from: a.b.d.e.a.b */
/* loaded from: classes.dex */
public class C0183b extends Drawable implements Drawable.Callback {

    /* renamed from: b */
    public c f870b;

    /* renamed from: c */
    public Rect f871c;

    /* renamed from: d */
    public Drawable f872d;

    /* renamed from: e */
    public Drawable f873e;

    /* renamed from: g */
    public boolean f875g;

    /* renamed from: i */
    public boolean f877i;

    /* renamed from: j */
    public Runnable f878j;

    /* renamed from: k */
    public long f879k;

    /* renamed from: l */
    public long f880l;

    /* renamed from: m */
    public b f881m;

    /* renamed from: f */
    public int f874f = 255;

    /* renamed from: h */
    public int f876h = -1;

    /* renamed from: a.b.d.e.a.b$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0183b.this.m633a(true);
            C0183b.this.invalidateSelf();
        }
    }

    /* renamed from: a.b.d.e.a.b$b */
    public static class b implements Drawable.Callback {

        /* renamed from: b */
        public Drawable.Callback f883b;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f883b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f883b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: a.b.d.e.a.b$c */
    public static abstract class c extends Drawable.ConstantState {

        /* renamed from: A */
        public int f884A;

        /* renamed from: B */
        public int f885B;

        /* renamed from: C */
        public boolean f886C;

        /* renamed from: D */
        public ColorFilter f887D;

        /* renamed from: E */
        public boolean f888E;

        /* renamed from: F */
        public ColorStateList f889F;

        /* renamed from: G */
        public PorterDuff.Mode f890G;

        /* renamed from: H */
        public boolean f891H;

        /* renamed from: I */
        public boolean f892I;

        /* renamed from: a */
        public final C0183b f893a;

        /* renamed from: b */
        public Resources f894b;

        /* renamed from: c */
        public int f895c;

        /* renamed from: d */
        public int f896d;

        /* renamed from: e */
        public int f897e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f898f;

        /* renamed from: g */
        public Drawable[] f899g;

        /* renamed from: h */
        public int f900h;

        /* renamed from: i */
        public boolean f901i;

        /* renamed from: j */
        public boolean f902j;

        /* renamed from: k */
        public Rect f903k;

        /* renamed from: l */
        public boolean f904l;

        /* renamed from: m */
        public boolean f905m;

        /* renamed from: n */
        public int f906n;

        /* renamed from: o */
        public int f907o;

        /* renamed from: p */
        public int f908p;

        /* renamed from: q */
        public int f909q;

        /* renamed from: r */
        public boolean f910r;

        /* renamed from: s */
        public int f911s;

        /* renamed from: t */
        public boolean f912t;

        /* renamed from: u */
        public boolean f913u;

        /* renamed from: v */
        public boolean f914v;

        /* renamed from: w */
        public boolean f915w;

        /* renamed from: x */
        public boolean f916x;

        /* renamed from: y */
        public boolean f917y;

        /* renamed from: z */
        public int f918z;

        public c(c cVar, C0183b c0183b, Resources resources) {
            this.f895c = 160;
            this.f901i = false;
            this.f904l = false;
            this.f916x = true;
            this.f884A = 0;
            this.f885B = 0;
            this.f893a = c0183b;
            this.f894b = resources != null ? resources : cVar != null ? cVar.f894b : null;
            this.f895c = C0183b.m631a(resources, cVar != null ? cVar.f895c : 0);
            if (cVar == null) {
                this.f899g = new Drawable[10];
                this.f900h = 0;
                return;
            }
            this.f896d = cVar.f896d;
            this.f897e = cVar.f897e;
            this.f914v = true;
            this.f915w = true;
            this.f901i = cVar.f901i;
            this.f904l = cVar.f904l;
            this.f916x = cVar.f916x;
            this.f917y = cVar.f917y;
            this.f918z = cVar.f918z;
            this.f884A = cVar.f884A;
            this.f885B = cVar.f885B;
            this.f886C = cVar.f886C;
            this.f887D = cVar.f887D;
            this.f888E = cVar.f888E;
            this.f889F = cVar.f889F;
            this.f890G = cVar.f890G;
            this.f891H = cVar.f891H;
            this.f892I = cVar.f892I;
            if (cVar.f895c == this.f895c) {
                if (cVar.f902j) {
                    this.f903k = new Rect(cVar.f903k);
                    this.f902j = true;
                }
                if (cVar.f905m) {
                    this.f906n = cVar.f906n;
                    this.f907o = cVar.f907o;
                    this.f908p = cVar.f908p;
                    this.f909q = cVar.f909q;
                    this.f905m = true;
                }
            }
            if (cVar.f910r) {
                this.f911s = cVar.f911s;
                this.f910r = true;
            }
            if (cVar.f912t) {
                this.f913u = cVar.f913u;
                this.f912t = true;
            }
            Drawable[] drawableArr = cVar.f899g;
            this.f899g = new Drawable[drawableArr.length];
            this.f900h = cVar.f900h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f898f;
            if (sparseArray != null) {
                this.f898f = sparseArray.clone();
            } else {
                this.f898f = new SparseArray<>(this.f900h);
            }
            int i = this.f900h;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                    if (constantState != null) {
                        this.f898f.put(i2, constantState);
                    } else {
                        this.f899g[i2] = drawableArr[i2];
                    }
                }
            }
        }

        /* renamed from: a */
        public final int m635a(Drawable drawable) {
            int i = this.f900h;
            if (i >= this.f899g.length) {
                mo637a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f893a);
            this.f899g[i] = drawable;
            this.f900h++;
            this.f897e = drawable.getChangingConfigurations() | this.f897e;
            this.f910r = false;
            this.f912t = false;
            this.f903k = null;
            this.f902j = false;
            this.f905m = false;
            this.f914v = false;
            return i;
        }

        /* renamed from: a */
        public final Drawable m636a(int i) {
            int indexOfKey;
            Drawable drawable = this.f899g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f898f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f898f.valueAt(indexOfKey).newDrawable(this.f894b);
            if (Build.VERSION.SDK_INT >= 23) {
                newDrawable.setLayoutDirection(this.f918z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f893a);
            this.f899g[i] = mutate;
            this.f898f.removeAt(indexOfKey);
            if (this.f898f.size() == 0) {
                this.f898f = null;
            }
            return mutate;
        }

        /* renamed from: a */
        public void mo637a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f899g, 0, drawableArr, 0, i);
            this.f899g = drawableArr;
        }

        /* renamed from: a */
        public final void m638a(Resources.Theme theme) {
            if (theme != null) {
                m642c();
                int i = this.f900h;
                Drawable[] drawableArr = this.f899g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f897e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m639a(theme.getResources());
            }
        }

        /* renamed from: a */
        public final void m639a(Resources resources) {
            if (resources != null) {
                this.f894b = resources;
                int m631a = C0183b.m631a(resources, this.f895c);
                int i = this.f895c;
                this.f895c = m631a;
                if (i != m631a) {
                    this.f905m = false;
                    this.f902j = false;
                }
            }
        }

        /* renamed from: a */
        public synchronized boolean m640a() {
            if (this.f914v) {
                return this.f915w;
            }
            m642c();
            this.f914v = true;
            int i = this.f900h;
            Drawable[] drawableArr = this.f899g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f915w = false;
                    return false;
                }
            }
            this.f915w = true;
            return true;
        }

        /* renamed from: b */
        public void m641b() {
            this.f905m = true;
            m642c();
            int i = this.f900h;
            Drawable[] drawableArr = this.f899g;
            this.f907o = -1;
            this.f906n = -1;
            this.f909q = 0;
            this.f908p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f906n) {
                    this.f906n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f907o) {
                    this.f907o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f908p) {
                    this.f908p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f909q) {
                    this.f909q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void m642c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f898f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f898f.keyAt(i);
                    Drawable.ConstantState valueAt = this.f898f.valueAt(i);
                    Drawable[] drawableArr = this.f899g;
                    Drawable newDrawable = valueAt.newDrawable(this.f894b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        newDrawable.setLayoutDirection(this.f918z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f893a);
                    drawableArr[keyAt] = mutate;
                }
                this.f898f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f900h;
            Drawable[] drawableArr = this.f899g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f898f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public abstract void mo628d();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f896d | this.f897e;
        }
    }

    /* renamed from: a */
    public static int m631a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* renamed from: a */
    public c mo620a() {
        throw null;
    }

    /* renamed from: a */
    public void mo621a(c cVar) {
        this.f870b = cVar;
        int i = this.f876h;
        if (i >= 0) {
            this.f872d = cVar.m636a(i);
            Drawable drawable = this.f872d;
            if (drawable != null) {
                m632a(drawable);
            }
        }
        this.f873e = null;
    }

    /* renamed from: a */
    public final void m632a(Drawable drawable) {
        if (this.f881m == null) {
            this.f881m = new b();
        }
        b bVar = this.f881m;
        bVar.f883b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f870b.f884A <= 0 && this.f875g) {
                drawable.setAlpha(this.f874f);
            }
            if (this.f870b.f888E) {
                drawable.setColorFilter(this.f870b.f887D);
            } else {
                if (this.f870b.f891H) {
                    C0027d.m65a(drawable, this.f870b.f889F);
                }
                if (this.f870b.f892I) {
                    C0027d.m66a(drawable, this.f870b.f890G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f870b.f916x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f870b.f886C);
            }
            Rect rect = this.f871c;
            if (Build.VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.f881m;
            Drawable.Callback callback = bVar2.f883b;
            bVar2.f883b = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m633a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f875g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f872d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f879k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f874f
            r3.setAlpha(r9)
            r13.f879k = r7
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            a.b.d.e.a.b$c r9 = r13.f870b
            int r9 = r9.f884A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f874f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f879k = r7
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f873e
            if (r9 == 0) goto L65
            long r10 = r13.f880l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f873e = r0
            r13.f880l = r7
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            a.b.d.e.a.b$c r4 = r13.f870b
            int r4 = r4.f885B
            int r3 = r3 / r4
            int r4 = r13.f874f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f880l = r7
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f878j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p031e.p032a.C0183b.m633a(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m634a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f876h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.b.d.e.a.b$c r0 = r9.f870b
            int r0 = r0.f885B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f873e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f872d
            if (r0 == 0) goto L29
            r9.f873e = r0
            a.b.d.e.a.b$c r0 = r9.f870b
            int r0 = r0.f885B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f880l = r0
            goto L35
        L29:
            r9.f873e = r4
            r9.f880l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f872d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            a.b.d.e.a.b$c r0 = r9.f870b
            int r1 = r0.f900h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m636a(r10)
            r9.f872d = r0
            r9.f876h = r10
            if (r0 == 0) goto L5a
            a.b.d.e.a.b$c r10 = r9.f870b
            int r10 = r10.f884A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f879k = r2
        L51:
            r9.m632a(r0)
            goto L5a
        L55:
            r9.f872d = r4
            r10 = -1
            r9.f876h = r10
        L5a:
            long r0 = r9.f879k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f880l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f878j
            if (r0 != 0) goto L73
            a.b.d.e.a.b$a r0 = new a.b.d.e.a.b$a
            r0.<init>()
            r9.f878j = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m633a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p031e.p032a.C0183b.m634a(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f870b.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f872d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f873e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f874f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f870b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f870b.m640a()) {
            return null;
        }
        this.f870b.f896d = getChangingConfigurations();
        return this.f870b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f872d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f871c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.f870b;
        if (cVar.f904l) {
            if (!cVar.f905m) {
                cVar.m641b();
            }
            return cVar.f907o;
        }
        Drawable drawable = this.f872d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.f870b;
        if (cVar.f904l) {
            if (!cVar.f905m) {
                cVar.m641b();
            }
            return cVar.f906n;
        }
        Drawable drawable = this.f872d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        c cVar = this.f870b;
        if (cVar.f904l) {
            if (!cVar.f905m) {
                cVar.m641b();
            }
            return cVar.f909q;
        }
        Drawable drawable = this.f872d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        c cVar = this.f870b;
        if (cVar.f904l) {
            if (!cVar.f905m) {
                cVar.m641b();
            }
            return cVar.f908p;
        }
        Drawable drawable = this.f872d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f872d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f870b;
        if (cVar.f910r) {
            return cVar.f911s;
        }
        cVar.m642c();
        int i = cVar.f900h;
        Drawable[] drawableArr = cVar.f899g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        cVar.f911s = opacity;
        cVar.f910r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f872d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f870b;
        Rect rect2 = null;
        if (!cVar.f901i) {
            if (cVar.f903k != null || cVar.f902j) {
                rect2 = cVar.f903k;
            } else {
                cVar.m642c();
                Rect rect3 = new Rect();
                int i = cVar.f900h;
                Drawable[] drawableArr = cVar.f899g;
                Rect rect4 = null;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect4 == null) {
                            rect4 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect3.left;
                        if (i3 > rect4.left) {
                            rect4.left = i3;
                        }
                        int i4 = rect3.top;
                        if (i4 > rect4.top) {
                            rect4.top = i4;
                        }
                        int i5 = rect3.right;
                        if (i5 > rect4.right) {
                            rect4.right = i5;
                        }
                        int i6 = rect3.bottom;
                        if (i6 > rect4.bottom) {
                            rect4.bottom = i6;
                        }
                    }
                }
                cVar.f902j = true;
                cVar.f903k = rect4;
                rect2 = rect4;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f872d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f870b.f886C && getLayoutDirection() == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f870b;
        if (cVar != null) {
            cVar.f910r = false;
            cVar.f912t = false;
        }
        if (drawable != this.f872d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f870b.f886C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f873e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f873e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f872d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f875g) {
                this.f872d.setAlpha(this.f874f);
            }
        }
        if (this.f880l != 0) {
            this.f880l = 0L;
            z = true;
        }
        if (this.f879k != 0) {
            this.f879k = 0L;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f877i && super.mutate() == this) {
            c mo620a = mo620a();
            mo620a.mo628d();
            mo621a(mo620a);
            this.f877i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f873e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f872d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        c cVar = this.f870b;
        int i2 = this.f876h;
        int i3 = cVar.f900h;
        Drawable[] drawableArr = cVar.f899g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        cVar.f918z = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f873e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f872d;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f873e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f872d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable != this.f872d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f875g && this.f874f == i) {
            return;
        }
        this.f875g = true;
        this.f874f = i;
        Drawable drawable = this.f872d;
        if (drawable != null) {
            if (this.f879k == 0) {
                drawable.setAlpha(i);
            } else {
                m633a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f870b;
        if (cVar.f886C != z) {
            cVar.f886C = z;
            Drawable drawable = this.f872d;
            if (drawable != null) {
                C0027d.m67a(drawable, cVar.f886C);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f870b;
        cVar.f888E = true;
        if (cVar.f887D != colorFilter) {
            cVar.f887D = colorFilter;
            Drawable drawable = this.f872d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f870b;
        if (cVar.f916x != z) {
            cVar.f916x = z;
            Drawable drawable = this.f872d;
            if (drawable != null) {
                drawable.setDither(cVar.f916x);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f872d;
        if (drawable != null) {
            C0027d.m62a(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f871c;
        if (rect == null) {
            this.f871c = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f872d;
        if (drawable != null) {
            C0027d.m64a(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f870b;
        cVar.f891H = true;
        if (cVar.f889F != colorStateList) {
            cVar.f889F = colorStateList;
            C0027d.m65a(this.f872d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f870b;
        cVar.f892I = true;
        if (cVar.f890G != mode) {
            cVar.f890G = mode;
            C0027d.m66a(this.f872d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f873e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f872d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f872d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
