package p000a.p006b.p010c.p011a;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000a.p001a.p005b.C0019o;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p011a.AbstractC0050j;
import p000a.p006b.p010c.p011a.C0035b;
import p000a.p006b.p010c.p011a.ComponentCallbacksC0041e;
import p000a.p006b.p010c.p020g.C0098c;
import p000a.p006b.p010c.p020g.C0100e;
import p000a.p006b.p010c.p021h.C0119n;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.c.a.k */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0051k extends AbstractC0050j implements LayoutInflater.Factory2 {

    /* renamed from: F */
    public static Field f292F;

    /* renamed from: G */
    public static final Interpolator f293G = new DecelerateInterpolator(2.5f);

    /* renamed from: H */
    public static final Interpolator f294H = new DecelerateInterpolator(1.5f);

    /* renamed from: C */
    public ArrayList<j> f297C;

    /* renamed from: D */
    public C0055o f298D;

    /* renamed from: b */
    public ArrayList<i> f300b;

    /* renamed from: c */
    public boolean f301c;

    /* renamed from: f */
    public SparseArray<ComponentCallbacksC0041e> f304f;

    /* renamed from: g */
    public ArrayList<C0035b> f305g;

    /* renamed from: h */
    public ArrayList<ComponentCallbacksC0041e> f306h;

    /* renamed from: i */
    public ArrayList<C0035b> f307i;

    /* renamed from: j */
    public ArrayList<Integer> f308j;

    /* renamed from: k */
    public ArrayList<AbstractC0050j.c> f309k;

    /* renamed from: n */
    public AbstractC0049i f312n;

    /* renamed from: o */
    public AbstractC0045g f313o;

    /* renamed from: p */
    public ComponentCallbacksC0041e f314p;

    /* renamed from: q */
    public ComponentCallbacksC0041e f315q;

    /* renamed from: r */
    public boolean f316r;

    /* renamed from: s */
    public boolean f317s;

    /* renamed from: t */
    public boolean f318t;

    /* renamed from: u */
    public boolean f319u;

    /* renamed from: v */
    public String f320v;

    /* renamed from: w */
    public boolean f321w;

    /* renamed from: x */
    public ArrayList<C0035b> f322x;

    /* renamed from: y */
    public ArrayList<Boolean> f323y;

    /* renamed from: z */
    public ArrayList<ComponentCallbacksC0041e> f324z;

    /* renamed from: d */
    public int f302d = 0;

    /* renamed from: e */
    public final ArrayList<ComponentCallbacksC0041e> f303e = new ArrayList<>();

    /* renamed from: l */
    public final CopyOnWriteArrayList<g> f310l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    public int f311m = 0;

    /* renamed from: A */
    public Bundle f295A = null;

    /* renamed from: B */
    public SparseArray<Parcelable> f296B = null;

    /* renamed from: E */
    public Runnable f299E = new a();

    /* renamed from: a.b.c.a.k$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0051k.this.m293o();
        }
    }

    /* renamed from: a.b.c.a.k$b */
    public static class b extends c {

        /* renamed from: b */
        public View f326b;

        /* renamed from: a.b.c.a.k$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f326b.setLayerType(0, null);
            }
        }

        public b(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f326b = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (C0119n.m474i(this.f326b) || Build.VERSION.SDK_INT >= 24) {
                this.f326b.post(new a());
            } else {
                this.f326b.setLayerType(0, null);
            }
            Animation.AnimationListener animationListener = this.f328a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }
    }

    /* renamed from: a.b.c.a.k$c */
    public static class c implements Animation.AnimationListener {

        /* renamed from: a */
        public final Animation.AnimationListener f328a;

        public c(Animation.AnimationListener animationListener) {
            this.f328a = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f328a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f328a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: a.b.c.a.k$d */
    public static class d {

        /* renamed from: a */
        public final Animation f329a;

        /* renamed from: b */
        public final Animator f330b;

        public d(Animator animator) {
            this.f329a = null;
            this.f330b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public d(Animation animation) {
            this.f329a = animation;
            this.f330b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: a.b.c.a.k$e */
    public static class e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public View f331a;

        public e(View view) {
            this.f331a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f331a.setLayerType(0, null);
            animator.removeListener(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f331a.setLayerType(2, null);
        }
    }

    /* renamed from: a.b.c.a.k$f */
    public static class f extends AnimationSet implements Runnable {

        /* renamed from: b */
        public final ViewGroup f332b;

        /* renamed from: c */
        public final View f333c;

        /* renamed from: d */
        public boolean f334d;

        /* renamed from: e */
        public boolean f335e;

        /* renamed from: f */
        public boolean f336f;

        public f(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f336f = true;
            this.f332b = viewGroup;
            this.f333c = view;
            addAnimation(animation);
            this.f332b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f336f = true;
            if (this.f334d) {
                return !this.f335e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f334d = true;
                ViewTreeObserverOnPreDrawListenerC0040d0.m159a(this.f332b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f336f = true;
            if (this.f334d) {
                return !this.f335e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f334d = true;
                ViewTreeObserverOnPreDrawListenerC0040d0.m159a(this.f332b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f334d || !this.f336f) {
                this.f332b.endViewTransition(this.f333c);
                this.f335e = true;
            } else {
                this.f336f = false;
                this.f332b.post(this);
            }
        }
    }

    /* renamed from: a.b.c.a.k$g */
    public static final class g {

        /* renamed from: a */
        public final AbstractC0050j.b f337a;

        /* renamed from: b */
        public final boolean f338b;
    }

    /* renamed from: a.b.c.a.k$h */
    public static class h {

        /* renamed from: a */
        public static final int[] f339a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* renamed from: a.b.c.a.k$i */
    public interface i {
    }

    /* renamed from: a.b.c.a.k$j */
    public static class j implements ComponentCallbacksC0041e.e {

        /* renamed from: a */
        public final boolean f340a;

        /* renamed from: b */
        public final C0035b f341b;

        /* renamed from: c */
        public int f342c;

        public j(C0035b c0035b, boolean z) {
            this.f340a = z;
            this.f341b = c0035b;
        }

        /* renamed from: a */
        public void m300a() {
            boolean z = this.f342c > 0;
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f341b.f157a;
            int size = layoutInflaterFactory2C0051k.f303e.size();
            for (int i = 0; i < size; i++) {
                ComponentCallbacksC0041e componentCallbacksC0041e = layoutInflaterFactory2C0051k.f303e.get(i);
                componentCallbacksC0041e.m167a((ComponentCallbacksC0041e.e) null);
                if (z) {
                    ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
                    if (cVar == null ? false : cVar.f267q) {
                        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k2 = componentCallbacksC0041e.f241s;
                        if (layoutInflaterFactory2C0051k2 == null || layoutInflaterFactory2C0051k2.f312n == null) {
                            componentCallbacksC0041e.m184d().f267q = false;
                        } else if (Looper.myLooper() != componentCallbacksC0041e.f241s.f312n.f290c.getLooper()) {
                            componentCallbacksC0041e.f241s.f312n.f290c.postAtFrontOfQueue(new RunnableC0039d(componentCallbacksC0041e));
                        } else {
                            componentCallbacksC0041e.m181c();
                        }
                    }
                }
            }
            C0035b c0035b = this.f341b;
            c0035b.f157a.m237a(c0035b, this.f340a, !z, true);
        }
    }

    static {
        new AccelerateInterpolator(2.5f);
        new AccelerateInterpolator(1.5f);
    }

    /* renamed from: a */
    public static d m226a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f293G);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(f294H);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new d(animationSet);
    }

    /* renamed from: a */
    public static Animation.AnimationListener m227a(Animation animation) {
        try {
            if (f292F == null) {
                f292F = Animation.class.getDeclaredField("mListener");
                f292F.setAccessible(true);
            }
            return (Animation.AnimationListener) f292F.get(animation);
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        } catch (NoSuchFieldException e3) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e3);
            return null;
        }
    }

    /* renamed from: a */
    public static void m228a(C0055o c0055o) {
        if (c0055o == null) {
            return;
        }
        List<ComponentCallbacksC0041e> list = c0055o.f354a;
        if (list != null) {
            Iterator<ComponentCallbacksC0041e> it = list.iterator();
            while (it.hasNext()) {
                it.next().f205E = true;
            }
        }
        List<C0055o> list2 = c0055o.f355b;
        if (list2 != null) {
            Iterator<C0055o> it2 = list2.iterator();
            while (it2.hasNext()) {
                m228a(it2.next());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r0 == false) goto L27;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m229a(android.view.View r5, p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k.d r6) {
        /*
            if (r5 == 0) goto L6f
            if (r6 != 0) goto L6
            goto L6f
        L6:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L4a
            int r0 = r5.getLayerType()
            if (r0 != 0) goto L4a
            boolean r0 = p000a.p006b.p010c.p021h.C0119n.m473h(r5)
            if (r0 == 0) goto L4a
            android.view.animation.Animation r0 = r6.f329a
            boolean r1 = r0 instanceof android.view.animation.AlphaAnimation
            if (r1 == 0) goto L21
            goto L3a
        L21:
            boolean r1 = r0 instanceof android.view.animation.AnimationSet
            if (r1 == 0) goto L41
            android.view.animation.AnimationSet r0 = (android.view.animation.AnimationSet) r0
            java.util.List r0 = r0.getAnimations()
            r1 = 0
        L2c:
            int r4 = r0.size()
            if (r1 >= r4) goto L3f
            java.lang.Object r4 = r0.get(r1)
            boolean r4 = r4 instanceof android.view.animation.AlphaAnimation
            if (r4 == 0) goto L3c
        L3a:
            r0 = 1
            goto L47
        L3c:
            int r1 = r1 + 1
            goto L2c
        L3f:
            r0 = 0
            goto L47
        L41:
            android.animation.Animator r0 = r6.f330b
            boolean r0 = m230a(r0)
        L47:
            if (r0 == 0) goto L4a
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 == 0) goto L6f
            android.animation.Animator r0 = r6.f330b
            if (r0 == 0) goto L5a
            a.b.c.a.k$e r6 = new a.b.c.a.k$e
            r6.<init>(r5)
            r0.addListener(r6)
            goto L6f
        L5a:
            android.view.animation.Animation r0 = r6.f329a
            android.view.animation.Animation$AnimationListener r0 = m227a(r0)
            r1 = 2
            r2 = 0
            r5.setLayerType(r1, r2)
            android.view.animation.Animation r6 = r6.f329a
            a.b.c.a.k$b r1 = new a.b.c.a.k$b
            r1.<init>(r5, r0)
            r6.setAnimationListener(r1)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k.m229a(android.view.View, a.b.c.a.k$d):void");
    }

    /* renamed from: a */
    public static boolean m230a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (m230a(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public static int m231d(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: a */
    public ComponentCallbacksC0041e m232a(String str) {
        ComponentCallbacksC0041e m163a;
        SparseArray<ComponentCallbacksC0041e> sparseArray = this.f304f;
        if (sparseArray == null || str == null) {
            return null;
        }
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0041e valueAt = this.f304f.valueAt(size);
            if (valueAt != null && (m163a = valueAt.m163a(str)) != null) {
                return m163a;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k.d m233a(p000a.p006b.p010c.p011a.ComponentCallbacksC0041e r7, int r8, boolean r9, int r10) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k.m233a(a.b.c.a.e, int, boolean, int):a.b.c.a.k$d");
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0050j
    /* renamed from: a */
    public List<ComponentCallbacksC0041e> mo221a() {
        List<ComponentCallbacksC0041e> list;
        if (this.f303e.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f303e) {
            list = (List) this.f303e.clone();
        }
        return list;
    }

    /* renamed from: a */
    public final void m234a(int i2) {
        try {
            this.f301c = true;
            m236a(i2, false);
            this.f301c = false;
            m293o();
        } catch (Throwable th) {
            this.f301c = false;
            throw th;
        }
    }

    /* renamed from: a */
    public void m235a(int i2, C0035b c0035b) {
        synchronized (this) {
            if (this.f307i == null) {
                this.f307i = new ArrayList<>();
            }
            int size = this.f307i.size();
            if (i2 < size) {
                this.f307i.set(i2, c0035b);
            } else {
                while (size < i2) {
                    this.f307i.add(null);
                    if (this.f308j == null) {
                        this.f308j = new ArrayList<>();
                    }
                    this.f308j.add(Integer.valueOf(size));
                    size++;
                }
                this.f307i.add(c0035b);
            }
        }
    }

    /* renamed from: a */
    public void m236a(int i2, boolean z) {
        AbstractC0049i abstractC0049i;
        if (this.f312n == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.f311m) {
            this.f311m = i2;
            if (this.f304f != null) {
                int size = this.f303e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    m275e(this.f303e.get(i3));
                }
                int size2 = this.f304f.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ComponentCallbacksC0041e valueAt = this.f304f.valueAt(i4);
                    if (valueAt != null && ((valueAt.f235m || valueAt.f203C) && !valueAt.f215O)) {
                        m275e(valueAt);
                    }
                }
                m299u();
                if (this.f316r && (abstractC0049i = this.f312n) != null && this.f311m == 4) {
                    ActivityC0043f.this.mo214h();
                    this.f316r = false;
                }
            }
        }
    }

    /* renamed from: a */
    public void m237a(C0035b c0035b, boolean z, boolean z2, boolean z3) {
        if (z) {
            c0035b.m133a(z3);
        } else {
            c0035b.m130a();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0035b);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0063w.m311a(this, (ArrayList<C0035b>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            m236a(this.f311m, true);
        }
        SparseArray<ComponentCallbacksC0041e> sparseArray = this.f304f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0041e valueAt = this.f304f.valueAt(i2);
                if (valueAt != null && valueAt.f210J != null && valueAt.f215O && c0035b.m136b(valueAt.f248z)) {
                    float f2 = valueAt.f217Q;
                    if (f2 > 0.0f) {
                        valueAt.f210J.setAlpha(f2);
                    }
                    if (z3) {
                        valueAt.f217Q = 0.0f;
                    } else {
                        valueAt.f217Q = -1.0f;
                        valueAt.f215O = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m238a(ComponentCallbacksC0041e componentCallbacksC0041e) {
        if (componentCallbacksC0041e.f203C) {
            componentCallbacksC0041e.f203C = false;
            if (componentCallbacksC0041e.f234l) {
                return;
            }
            if (this.f303e.contains(componentCallbacksC0041e)) {
                throw new IllegalStateException("Fragment already added: " + componentCallbacksC0041e);
            }
            synchronized (this.f303e) {
                this.f303e.add(componentCallbacksC0041e);
            }
            componentCallbacksC0041e.f234l = true;
            if (componentCallbacksC0041e.f206F && componentCallbacksC0041e.f207G) {
                this.f316r = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if (r0 != 3) goto L344;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m239a(p000a.p006b.p010c.p011a.ComponentCallbacksC0041e r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k.m239a(a.b.c.a.e, int, int, int, boolean):void");
    }

    /* renamed from: a */
    public void m240a(ComponentCallbacksC0041e componentCallbacksC0041e, Context context, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m240a(componentCallbacksC0041e, context, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void m241a(ComponentCallbacksC0041e componentCallbacksC0041e, Bundle bundle, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m241a(componentCallbacksC0041e, bundle, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void m242a(ComponentCallbacksC0041e componentCallbacksC0041e, View view, Bundle bundle, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m242a(componentCallbacksC0041e, view, bundle, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void m243a(ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        m271d(componentCallbacksC0041e);
        if (componentCallbacksC0041e.f203C) {
            return;
        }
        if (this.f303e.contains(componentCallbacksC0041e)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC0041e);
        }
        synchronized (this.f303e) {
            this.f303e.add(componentCallbacksC0041e);
        }
        componentCallbacksC0041e.f234l = true;
        componentCallbacksC0041e.f235m = false;
        if (componentCallbacksC0041e.f210J == null) {
            componentCallbacksC0041e.f216P = false;
        }
        if (componentCallbacksC0041e.f206F && componentCallbacksC0041e.f207G) {
            this.f316r = true;
        }
        if (z) {
            m239a(componentCallbacksC0041e, this.f311m, 0, 0, false);
        }
    }

    /* renamed from: a */
    public void m244a(AbstractC0049i abstractC0049i, AbstractC0045g abstractC0045g, ComponentCallbacksC0041e componentCallbacksC0041e) {
        if (this.f312n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f312n = abstractC0049i;
        this.f313o = abstractC0045g;
        this.f314p = componentCallbacksC0041e;
    }

    /* renamed from: a */
    public final void m245a(C0098c<ComponentCallbacksC0041e> c0098c) {
        int i2 = this.f311m;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        int size = this.f303e.size();
        for (int i3 = 0; i3 < size; i3++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i3);
            if (componentCallbacksC0041e.f224b < min) {
                m239a(componentCallbacksC0041e, min, componentCallbacksC0041e.m192k(), componentCallbacksC0041e.m193l(), false);
                if (componentCallbacksC0041e.f210J != null && !componentCallbacksC0041e.f202B && componentCallbacksC0041e.f215O) {
                    c0098c.add(componentCallbacksC0041e);
                }
            }
        }
    }

    /* renamed from: a */
    public void m246a(Configuration configuration) {
        for (int i2 = 0; i2 < this.f303e.size(); i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i2);
            if (componentCallbacksC0041e != null) {
                componentCallbacksC0041e.m169a(configuration);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m247a(Parcelable parcelable, C0055o c0055o) {
        List<C0055o> list;
        List<C0019o> list2;
        if (parcelable == null) {
            return;
        }
        C0056p c0056p = (C0056p) parcelable;
        if (c0056p.f357b == null) {
            return;
        }
        C0019o c0019o = null;
        if (c0055o != null) {
            List<ComponentCallbacksC0041e> list3 = c0055o.f354a;
            list = c0055o.f355b;
            list2 = c0055o.f356c;
            int size = list3 != null ? list3.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0041e componentCallbacksC0041e = list3.get(i2);
                int i3 = 0;
                while (true) {
                    C0057q[] c0057qArr = c0056p.f357b;
                    if (i3 >= c0057qArr.length || c0057qArr[i3].f363c == componentCallbacksC0041e.f228f) {
                        break;
                    } else {
                        i3++;
                    }
                }
                C0057q[] c0057qArr2 = c0056p.f357b;
                if (i3 == c0057qArr2.length) {
                    StringBuilder m1134a = C0335a.m1134a("Could not find active fragment with index ");
                    m1134a.append(componentCallbacksC0041e.f228f);
                    m249a(new IllegalStateException(m1134a.toString()));
                    throw null;
                }
                C0057q c0057q = c0057qArr2[i3];
                c0057q.f373m = componentCallbacksC0041e;
                componentCallbacksC0041e.f226d = null;
                componentCallbacksC0041e.f240r = 0;
                componentCallbacksC0041e.f237o = false;
                componentCallbacksC0041e.f234l = false;
                componentCallbacksC0041e.f231i = null;
                Bundle bundle = c0057q.f372l;
                if (bundle != null) {
                    bundle.setClassLoader(this.f312n.f289b.getClassLoader());
                    componentCallbacksC0041e.f226d = c0057q.f372l.getSparseParcelableArray("android:view_state");
                    componentCallbacksC0041e.f225c = c0057q.f372l;
                }
            }
        } else {
            list = null;
            list2 = null;
        }
        this.f304f = new SparseArray<>(c0056p.f357b.length);
        int i4 = 0;
        while (true) {
            C0057q[] c0057qArr3 = c0056p.f357b;
            if (i4 >= c0057qArr3.length) {
                break;
            }
            C0057q c0057q2 = c0057qArr3[i4];
            if (c0057q2 != null) {
                C0055o c0055o2 = (list == null || i4 >= list.size()) ? c0019o : list.get(i4);
                if (list2 != null && i4 < list2.size()) {
                    c0019o = list2.get(i4);
                }
                AbstractC0049i abstractC0049i = this.f312n;
                AbstractC0045g abstractC0045g = this.f313o;
                ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
                if (c0057q2.f373m == null) {
                    Context context = abstractC0049i.f289b;
                    Bundle bundle2 = c0057q2.f370j;
                    if (bundle2 != null) {
                        bundle2.setClassLoader(context.getClassLoader());
                    }
                    if (abstractC0045g != null) {
                        c0057q2.f373m = abstractC0045g.mo203a(context, c0057q2.f362b, c0057q2.f370j);
                    } else {
                        c0057q2.f373m = ComponentCallbacksC0041e.m161a(context, c0057q2.f362b, c0057q2.f370j);
                    }
                    Bundle bundle3 = c0057q2.f372l;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(context.getClassLoader());
                        c0057q2.f373m.f225c = c0057q2.f372l;
                    }
                    c0057q2.f373m.m166a(c0057q2.f363c, componentCallbacksC0041e2);
                    ComponentCallbacksC0041e componentCallbacksC0041e3 = c0057q2.f373m;
                    componentCallbacksC0041e3.f236n = c0057q2.f364d;
                    componentCallbacksC0041e3.f238p = true;
                    componentCallbacksC0041e3.f247y = c0057q2.f365e;
                    componentCallbacksC0041e3.f248z = c0057q2.f366f;
                    componentCallbacksC0041e3.f201A = c0057q2.f367g;
                    componentCallbacksC0041e3.f204D = c0057q2.f368h;
                    componentCallbacksC0041e3.f203C = c0057q2.f369i;
                    componentCallbacksC0041e3.f202B = c0057q2.f371k;
                    componentCallbacksC0041e3.f241s = abstractC0049i.f291d;
                }
                ComponentCallbacksC0041e componentCallbacksC0041e4 = c0057q2.f373m;
                componentCallbacksC0041e4.f244v = c0055o2;
                componentCallbacksC0041e4.f245w = c0019o;
                this.f304f.put(componentCallbacksC0041e4.f228f, componentCallbacksC0041e4);
                c0057q2.f373m = null;
            }
            i4++;
            c0019o = null;
        }
        if (c0055o != null) {
            List<ComponentCallbacksC0041e> list4 = c0055o.f354a;
            int size2 = list4 != null ? list4.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                ComponentCallbacksC0041e componentCallbacksC0041e5 = list4.get(i5);
                int i6 = componentCallbacksC0041e5.f232j;
                if (i6 >= 0) {
                    componentCallbacksC0041e5.f231i = this.f304f.get(i6);
                    if (componentCallbacksC0041e5.f231i == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + componentCallbacksC0041e5 + " target no longer exists: " + componentCallbacksC0041e5.f232j);
                    }
                }
            }
        }
        this.f303e.clear();
        if (c0056p.f358c != null) {
            int i7 = 0;
            while (true) {
                int[] iArr = c0056p.f358c;
                if (i7 >= iArr.length) {
                    break;
                }
                ComponentCallbacksC0041e componentCallbacksC0041e6 = this.f304f.get(iArr[i7]);
                if (componentCallbacksC0041e6 == null) {
                    StringBuilder m1134a2 = C0335a.m1134a("No instantiated fragment for index #");
                    m1134a2.append(c0056p.f358c[i7]);
                    m249a(new IllegalStateException(m1134a2.toString()));
                    throw null;
                }
                componentCallbacksC0041e6.f234l = true;
                if (this.f303e.contains(componentCallbacksC0041e6)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.f303e) {
                    this.f303e.add(componentCallbacksC0041e6);
                }
                i7++;
            }
        }
        C0037c[] c0037cArr = c0056p.f359d;
        if (c0037cArr != null) {
            this.f305g = new ArrayList<>(c0037cArr.length);
            int i8 = 0;
            while (true) {
                C0037c[] c0037cArr2 = c0056p.f359d;
                if (i8 >= c0037cArr2.length) {
                    break;
                }
                C0035b m156a = c0037cArr2[i8].m156a(this);
                this.f305g.add(m156a);
                int i9 = m156a.f168l;
                if (i9 >= 0) {
                    m235a(i9, m156a);
                }
                i8++;
            }
        } else {
            this.f305g = null;
        }
        int i10 = c0056p.f360e;
        if (i10 >= 0) {
            this.f315q = this.f304f.get(i10);
        }
        this.f302d = c0056p.f361f;
    }

    /* renamed from: a */
    public void m248a(Menu menu) {
        if (this.f311m < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f303e.size(); i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i2);
            if (componentCallbacksC0041e != null) {
                componentCallbacksC0041e.m172a(menu);
            }
        }
    }

    /* renamed from: a */
    public final void m249a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0100e("FragmentManager"));
        AbstractC0049i abstractC0049i = this.f312n;
        if (abstractC0049i == null) {
            try {
                mo222a("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            ActivityC0043f.this.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0050j
    /* renamed from: a */
    public void mo222a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        SparseArray<ComponentCallbacksC0041e> sparseArray = this.f304f;
        if (sparseArray != null && (size5 = sparseArray.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                ComponentCallbacksC0041e valueAt = this.f304f.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    printWriter.print(str2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(valueAt.f247y));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(valueAt.f248z));
                    printWriter.print(" mTag=");
                    printWriter.println(valueAt.f201A);
                    printWriter.print(str2);
                    printWriter.print("mState=");
                    printWriter.print(valueAt.f224b);
                    printWriter.print(" mIndex=");
                    printWriter.print(valueAt.f228f);
                    printWriter.print(" mWho=");
                    printWriter.print(valueAt.f229g);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(valueAt.f240r);
                    printWriter.print(str2);
                    printWriter.print("mAdded=");
                    printWriter.print(valueAt.f234l);
                    printWriter.print(" mRemoving=");
                    printWriter.print(valueAt.f235m);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(valueAt.f236n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(valueAt.f237o);
                    printWriter.print(str2);
                    printWriter.print("mHidden=");
                    printWriter.print(valueAt.f202B);
                    printWriter.print(" mDetached=");
                    printWriter.print(valueAt.f203C);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(valueAt.f207G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(valueAt.f206F);
                    printWriter.print(str2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(valueAt.f204D);
                    printWriter.print(" mRetaining=");
                    printWriter.print(valueAt.f205E);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(valueAt.f213M);
                    if (valueAt.f241s != null) {
                        printWriter.print(str2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(valueAt.f241s);
                    }
                    if (valueAt.f242t != null) {
                        printWriter.print(str2);
                        printWriter.print("mHost=");
                        printWriter.println(valueAt.f242t);
                    }
                    if (valueAt.f246x != null) {
                        printWriter.print(str2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(valueAt.f246x);
                    }
                    if (valueAt.f230h != null) {
                        printWriter.print(str2);
                        printWriter.print("mArguments=");
                        printWriter.println(valueAt.f230h);
                    }
                    if (valueAt.f225c != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(valueAt.f225c);
                    }
                    if (valueAt.f226d != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(valueAt.f226d);
                    }
                    if (valueAt.f231i != null) {
                        printWriter.print(str2);
                        printWriter.print("mTarget=");
                        printWriter.print(valueAt.f231i);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(valueAt.f233k);
                    }
                    if (valueAt.m192k() != 0) {
                        printWriter.print(str2);
                        printWriter.print("mNextAnim=");
                        printWriter.println(valueAt.m192k());
                    }
                    if (valueAt.f209I != null) {
                        printWriter.print(str2);
                        printWriter.print("mContainer=");
                        printWriter.println(valueAt.f209I);
                    }
                    if (valueAt.f210J != null) {
                        printWriter.print(str2);
                        printWriter.print("mView=");
                        printWriter.println(valueAt.f210J);
                    }
                    if (valueAt.f211K != null) {
                        printWriter.print(str2);
                        printWriter.print("mInnerView=");
                        printWriter.println(valueAt.f210J);
                    }
                    if (valueAt.m186e() != null) {
                        printWriter.print(str2);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(valueAt.m186e());
                        printWriter.print(str2);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(valueAt.m196o());
                    }
                    if (valueAt.m188g() != null) {
                        AbstractC0038c0.m157a(valueAt).mo158a(str2, fileDescriptor, printWriter, strArr);
                    }
                    if (valueAt.f243u != null) {
                        printWriter.print(str2);
                        printWriter.println("Child " + valueAt.f243u + ":");
                        valueAt.f243u.mo222a(str2 + "  ", fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        int size6 = this.f303e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0041e.toString());
            }
        }
        ArrayList<ComponentCallbacksC0041e> arrayList = this.f306h;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f306h.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(componentCallbacksC0041e2.toString());
            }
        }
        ArrayList<C0035b> arrayList2 = this.f305g;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                C0035b c0035b = this.f305g.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c0035b.toString());
                c0035b.m132a(str2, printWriter, true);
            }
        }
        synchronized (this) {
            if (this.f307i != null && (size2 = this.f307i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = (C0035b) this.f307i.get(i6);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
            if (this.f308j != null && this.f308j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f308j.toArray()));
            }
        }
        ArrayList<i> arrayList3 = this.f300b;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                Object obj2 = (i) this.f300b.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(obj2);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f312n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f313o);
        if (this.f314p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f314p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f311m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f317s);
        printWriter.print(" mStopped=");
        printWriter.print(this.f318t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f319u);
        if (this.f316r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f316r);
        }
        if (this.f320v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f320v);
        }
    }

    /* renamed from: a */
    public final void m250a(ArrayList<C0035b> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<j> arrayList3 = this.f297C;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            j jVar = this.f297C.get(i2);
            if (arrayList == null || jVar.f340a || (indexOf2 = arrayList.indexOf(jVar.f341b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if ((jVar.f342c == 0) || (arrayList != null && jVar.f341b.m134a(arrayList, 0, arrayList.size()))) {
                    this.f297C.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || jVar.f340a || (indexOf = arrayList.indexOf(jVar.f341b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        jVar.m300a();
                    } else {
                        C0035b c0035b = jVar.f341b;
                        c0035b.f157a.m237a(c0035b, jVar.f340a, false, false);
                    }
                }
            } else {
                C0035b c0035b2 = jVar.f341b;
                c0035b2.f157a.m237a(c0035b2, jVar.f340a, false, false);
            }
            i2++;
        }
    }

    /* renamed from: a */
    public final void m251a(ArrayList<C0035b> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        ArrayList<C0035b> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z2 = arrayList3.get(i2).f175s;
        ArrayList<ComponentCallbacksC0041e> arrayList5 = this.f324z;
        if (arrayList5 == null) {
            this.f324z = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f324z.addAll(this.f303e);
        ComponentCallbacksC0041e componentCallbacksC0041e = this.f315q;
        int i10 = i2;
        boolean z3 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i3) {
                this.f324z.clear();
                if (!z2) {
                    C0063w.m311a(this, arrayList, arrayList2, i2, i3, false);
                }
                int i12 = i2;
                while (i12 < i3) {
                    C0035b c0035b = arrayList.get(i12);
                    if (arrayList2.get(i12).booleanValue()) {
                        c0035b.m131a(-1);
                        c0035b.m133a(i12 == i3 + (-1));
                    } else {
                        c0035b.m131a(1);
                        c0035b.m130a();
                    }
                    i12++;
                }
                if (z2) {
                    C0098c<ComponentCallbacksC0041e> c0098c = new C0098c<>();
                    m245a(c0098c);
                    i4 = i2;
                    int i13 = i3;
                    for (int i14 = i3 - 1; i14 >= i4; i14--) {
                        C0035b c0035b2 = arrayList.get(i14);
                        boolean booleanValue = arrayList2.get(i14).booleanValue();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= c0035b2.f158b.size()) {
                                z = false;
                            } else if (C0035b.m129a(c0035b2.f158b.get(i15))) {
                                z = true;
                            } else {
                                i15++;
                            }
                        }
                        if (z && !c0035b2.m134a(arrayList, i14 + 1, i3)) {
                            if (this.f297C == null) {
                                this.f297C = new ArrayList<>();
                            }
                            j jVar = new j(c0035b2, booleanValue);
                            this.f297C.add(jVar);
                            for (int i16 = 0; i16 < c0035b2.f158b.size(); i16++) {
                                C0035b.a aVar = c0035b2.f158b.get(i16);
                                if (C0035b.m129a(aVar)) {
                                    aVar.f178b.m167a(jVar);
                                }
                            }
                            if (booleanValue) {
                                c0035b2.m130a();
                            } else {
                                c0035b2.m133a(false);
                            }
                            i13--;
                            if (i14 != i13) {
                                arrayList.remove(i14);
                                arrayList.add(i13, c0035b2);
                            }
                            m245a(c0098c);
                        }
                    }
                    i5 = 0;
                    int i17 = c0098c.f542d;
                    for (int i18 = 0; i18 < i17; i18++) {
                        ComponentCallbacksC0041e componentCallbacksC0041e2 = (ComponentCallbacksC0041e) c0098c.f541c[i18];
                        if (!componentCallbacksC0041e2.f234l) {
                            View view = componentCallbacksC0041e2.f210J;
                            componentCallbacksC0041e2.f217Q = view.getAlpha();
                            view.setAlpha(0.0f);
                        }
                    }
                    i6 = i13;
                } else {
                    i4 = i2;
                    i5 = 0;
                    i6 = i3;
                }
                if (i6 != i4 && z2) {
                    C0063w.m311a(this, arrayList, arrayList2, i2, i6, true);
                    m236a(this.f311m, true);
                }
                while (i4 < i3) {
                    C0035b c0035b3 = arrayList.get(i4);
                    if (arrayList2.get(i4).booleanValue() && (i7 = c0035b3.f168l) >= 0) {
                        m264c(i7);
                        c0035b3.f168l = -1;
                    }
                    ArrayList<Runnable> arrayList6 = c0035b3.f176t;
                    if (arrayList6 != null) {
                        int size = arrayList6.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            c0035b3.f176t.get(i19).run();
                        }
                        c0035b3.f176t = null;
                    }
                    i4++;
                }
                if (!z3 || this.f309k == null) {
                    return;
                }
                while (i5 < this.f309k.size()) {
                    this.f309k.get(i5).m225a();
                    i5++;
                }
                return;
            }
            C0035b c0035b4 = arrayList3.get(i10);
            int i20 = 3;
            if (arrayList4.get(i10).booleanValue()) {
                ArrayList<ComponentCallbacksC0041e> arrayList7 = this.f324z;
                ComponentCallbacksC0041e componentCallbacksC0041e3 = componentCallbacksC0041e;
                for (int i21 = 0; i21 < c0035b4.f158b.size(); i21++) {
                    C0035b.a aVar2 = c0035b4.f158b.get(i21);
                    int i22 = aVar2.f177a;
                    if (i22 != 1) {
                        if (i22 != 3) {
                            switch (i22) {
                                case 8:
                                    componentCallbacksC0041e3 = null;
                                    break;
                                case 9:
                                    componentCallbacksC0041e3 = aVar2.f178b;
                                    break;
                            }
                        }
                        arrayList7.add(aVar2.f178b);
                    }
                    arrayList7.remove(aVar2.f178b);
                }
                componentCallbacksC0041e = componentCallbacksC0041e3;
            } else {
                ArrayList<ComponentCallbacksC0041e> arrayList8 = this.f324z;
                ComponentCallbacksC0041e componentCallbacksC0041e4 = componentCallbacksC0041e;
                int i23 = 0;
                while (i23 < c0035b4.f158b.size()) {
                    C0035b.a aVar3 = c0035b4.f158b.get(i23);
                    int i24 = aVar3.f177a;
                    if (i24 != i11) {
                        if (i24 != 2) {
                            if (i24 == i20 || i24 == 6) {
                                arrayList8.remove(aVar3.f178b);
                                ComponentCallbacksC0041e componentCallbacksC0041e5 = aVar3.f178b;
                                if (componentCallbacksC0041e5 == componentCallbacksC0041e4) {
                                    c0035b4.f158b.add(i23, new C0035b.a(9, componentCallbacksC0041e5));
                                    i23++;
                                    componentCallbacksC0041e4 = null;
                                }
                            } else if (i24 != 7) {
                                if (i24 == 8) {
                                    c0035b4.f158b.add(i23, new C0035b.a(9, componentCallbacksC0041e4));
                                    i23++;
                                    componentCallbacksC0041e4 = aVar3.f178b;
                                }
                            }
                            i8 = 1;
                        } else {
                            ComponentCallbacksC0041e componentCallbacksC0041e6 = aVar3.f178b;
                            int i25 = componentCallbacksC0041e6.f248z;
                            int i26 = i23;
                            ComponentCallbacksC0041e componentCallbacksC0041e7 = componentCallbacksC0041e4;
                            int size2 = arrayList8.size() - 1;
                            boolean z4 = false;
                            while (size2 >= 0) {
                                ComponentCallbacksC0041e componentCallbacksC0041e8 = arrayList8.get(size2);
                                if (componentCallbacksC0041e8.f248z != i25) {
                                    i9 = i25;
                                } else if (componentCallbacksC0041e8 == componentCallbacksC0041e6) {
                                    i9 = i25;
                                    z4 = true;
                                } else {
                                    if (componentCallbacksC0041e8 == componentCallbacksC0041e7) {
                                        i9 = i25;
                                        c0035b4.f158b.add(i26, new C0035b.a(9, componentCallbacksC0041e8));
                                        i26++;
                                        componentCallbacksC0041e7 = null;
                                    } else {
                                        i9 = i25;
                                    }
                                    C0035b.a aVar4 = new C0035b.a(3, componentCallbacksC0041e8);
                                    aVar4.f179c = aVar3.f179c;
                                    aVar4.f181e = aVar3.f181e;
                                    aVar4.f180d = aVar3.f180d;
                                    aVar4.f182f = aVar3.f182f;
                                    c0035b4.f158b.add(i26, aVar4);
                                    arrayList8.remove(componentCallbacksC0041e8);
                                    i26++;
                                }
                                size2--;
                                i25 = i9;
                            }
                            if (z4) {
                                c0035b4.f158b.remove(i26);
                                i23 = i26 - 1;
                                i8 = 1;
                            } else {
                                i8 = 1;
                                aVar3.f177a = 1;
                                arrayList8.add(componentCallbacksC0041e6);
                                i23 = i26;
                            }
                            componentCallbacksC0041e4 = componentCallbacksC0041e7;
                        }
                        i23 += i8;
                        i20 = 3;
                        i11 = 1;
                    }
                    i8 = 1;
                    arrayList8.add(aVar3.f178b);
                    i23 += i8;
                    i20 = 3;
                    i11 = 1;
                }
                componentCallbacksC0041e = componentCallbacksC0041e4;
            }
            z3 = z3 || c0035b4.f165i;
            i10++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        }
    }

    /* renamed from: a */
    public void m252a(boolean z) {
        for (int size = this.f303e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(size);
            if (componentCallbacksC0041e != null) {
                componentCallbacksC0041e.m174a(z);
            }
        }
    }

    /* renamed from: a */
    public boolean m253a(Menu menu, MenuInflater menuInflater) {
        if (this.f311m < 1) {
            return false;
        }
        ArrayList<ComponentCallbacksC0041e> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.f303e.size(); i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i2);
            if (componentCallbacksC0041e != null && componentCallbacksC0041e.m175a(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(componentCallbacksC0041e);
                z = true;
            }
        }
        if (this.f306h != null) {
            for (int i3 = 0; i3 < this.f306h.size(); i3++) {
                ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f306h.get(i3);
                if (arrayList == null || !arrayList.contains(componentCallbacksC0041e2)) {
                    componentCallbacksC0041e2.m200s();
                }
            }
        }
        this.f306h = arrayList;
        return z;
    }

    /* renamed from: a */
    public boolean m254a(MenuItem menuItem) {
        if (this.f311m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f303e.size(); i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i2);
            if (componentCallbacksC0041e != null && componentCallbacksC0041e.m176a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public ComponentCallbacksC0041e m255b(int i2) {
        for (int size = this.f303e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(size);
            if (componentCallbacksC0041e != null && componentCallbacksC0041e.f247y == i2) {
                return componentCallbacksC0041e;
            }
        }
        SparseArray<ComponentCallbacksC0041e> sparseArray = this.f304f;
        if (sparseArray == null) {
            return null;
        }
        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
            ComponentCallbacksC0041e valueAt = this.f304f.valueAt(size2);
            if (valueAt != null && valueAt.f247y == i2) {
                return valueAt;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void m256b(ComponentCallbacksC0041e componentCallbacksC0041e) {
        if (componentCallbacksC0041e.f203C) {
            return;
        }
        componentCallbacksC0041e.f203C = true;
        if (componentCallbacksC0041e.f234l) {
            synchronized (this.f303e) {
                this.f303e.remove(componentCallbacksC0041e);
            }
            if (componentCallbacksC0041e.f206F && componentCallbacksC0041e.f207G) {
                this.f316r = true;
            }
            componentCallbacksC0041e.f234l = false;
        }
    }

    /* renamed from: b */
    public void m257b(ComponentCallbacksC0041e componentCallbacksC0041e, Context context, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m257b(componentCallbacksC0041e, context, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: b */
    public void m258b(ComponentCallbacksC0041e componentCallbacksC0041e, Bundle bundle, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m258b(componentCallbacksC0041e, bundle, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: b */
    public void m259b(ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m259b(componentCallbacksC0041e, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: b */
    public void m260b(boolean z) {
        for (int size = this.f303e.size() - 1; size >= 0; size--) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(size);
            if (componentCallbacksC0041e != null) {
                componentCallbacksC0041e.m178b(z);
            }
        }
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0050j
    /* renamed from: b */
    public boolean mo223b() {
        return this.f317s || this.f318t;
    }

    /* renamed from: b */
    public boolean m261b(Menu menu) {
        if (this.f311m < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.f303e.size(); i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i2);
            if (componentCallbacksC0041e != null && componentCallbacksC0041e.m179b(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public boolean m262b(MenuItem menuItem) {
        if (this.f311m < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f303e.size(); i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i2);
            if (componentCallbacksC0041e != null && componentCallbacksC0041e.m180b(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m263b(ArrayList<C0035b> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f300b != null && this.f300b.size() != 0) {
                int size = this.f300b.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    ((C0035b) this.f300b.get(i2)).m135a(arrayList, arrayList2);
                    z |= true;
                }
                this.f300b.clear();
                this.f312n.f290c.removeCallbacks(this.f299E);
                return z;
            }
            return false;
        }
    }

    /* renamed from: c */
    public void m264c(int i2) {
        synchronized (this) {
            this.f307i.set(i2, null);
            if (this.f308j == null) {
                this.f308j = new ArrayList<>();
            }
            this.f308j.add(Integer.valueOf(i2));
        }
    }

    /* renamed from: c */
    public void m265c(ComponentCallbacksC0041e componentCallbacksC0041e) {
        if (componentCallbacksC0041e.f202B) {
            return;
        }
        componentCallbacksC0041e.f202B = true;
        componentCallbacksC0041e.f216P = true ^ componentCallbacksC0041e.f216P;
    }

    /* renamed from: c */
    public void m266c(ComponentCallbacksC0041e componentCallbacksC0041e, Bundle bundle, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m266c(componentCallbacksC0041e, bundle, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: c */
    public void m267c(ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m267c(componentCallbacksC0041e, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: c */
    public final void m268c(ArrayList<C0035b> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m250a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f175s) {
                if (i3 != i2) {
                    m251a(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f175s) {
                        i3++;
                    }
                }
                m251a(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            m251a(arrayList, arrayList2, i3, size);
        }
    }

    /* renamed from: c */
    public final void m269c(boolean z) {
        if (this.f301c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f312n == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f312n.f290c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            m274e();
        }
        if (this.f322x == null) {
            this.f322x = new ArrayList<>();
            this.f323y = new ArrayList<>();
        }
        this.f301c = true;
        try {
            m250a((ArrayList<C0035b>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f301c = false;
        }
    }

    @Override // p000a.p006b.p010c.p011a.AbstractC0050j
    /* renamed from: c */
    public boolean mo224c() {
        int size;
        AbstractC0050j m201t;
        m274e();
        m293o();
        m269c(true);
        ComponentCallbacksC0041e componentCallbacksC0041e = this.f315q;
        if (componentCallbacksC0041e != null && (m201t = componentCallbacksC0041e.m201t()) != null && m201t.mo224c()) {
            return true;
        }
        ArrayList<C0035b> arrayList = this.f322x;
        ArrayList<Boolean> arrayList2 = this.f323y;
        ArrayList<C0035b> arrayList3 = this.f305g;
        boolean z = false;
        if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
            arrayList.add(this.f305g.remove(size));
            arrayList2.add(true);
            z = true;
        }
        if (z) {
            this.f301c = true;
            try {
                m268c(this.f322x, this.f323y);
            } finally {
                m277f();
            }
        }
        m292n();
        m270d();
        return z;
    }

    /* renamed from: d */
    public final void m270d() {
        SparseArray<ComponentCallbacksC0041e> sparseArray = this.f304f;
        if (sparseArray != null) {
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                if (this.f304f.valueAt(size) == null) {
                    SparseArray<ComponentCallbacksC0041e> sparseArray2 = this.f304f;
                    sparseArray2.delete(sparseArray2.keyAt(size));
                }
            }
        }
    }

    /* renamed from: d */
    public void m271d(ComponentCallbacksC0041e componentCallbacksC0041e) {
        if (componentCallbacksC0041e.f228f >= 0) {
            return;
        }
        int i2 = this.f302d;
        this.f302d = i2 + 1;
        componentCallbacksC0041e.m166a(i2, this.f314p);
        if (this.f304f == null) {
            this.f304f = new SparseArray<>();
        }
        this.f304f.put(componentCallbacksC0041e.f228f, componentCallbacksC0041e);
    }

    /* renamed from: d */
    public void m272d(ComponentCallbacksC0041e componentCallbacksC0041e, Bundle bundle, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m272d(componentCallbacksC0041e, bundle, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: d */
    public void m273d(ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m273d(componentCallbacksC0041e, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: e */
    public final void m274e() {
        if (mo223b()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f320v == null) {
            return;
        }
        StringBuilder m1134a = C0335a.m1134a("Can not perform this action inside of ");
        m1134a.append(this.f320v);
        throw new IllegalStateException(m1134a.toString());
    }

    /* renamed from: e */
    public void m275e(ComponentCallbacksC0041e componentCallbacksC0041e) {
        Animator animator;
        if (componentCallbacksC0041e == null) {
            return;
        }
        int i2 = this.f311m;
        if (componentCallbacksC0041e.f235m) {
            i2 = componentCallbacksC0041e.m199r() ? Math.min(i2, 1) : Math.min(i2, 0);
        }
        m239a(componentCallbacksC0041e, i2, componentCallbacksC0041e.m193l(), componentCallbacksC0041e.m194m(), false);
        View view = componentCallbacksC0041e.f210J;
        if (view != null) {
            ViewGroup viewGroup = componentCallbacksC0041e.f209I;
            ComponentCallbacksC0041e componentCallbacksC0041e2 = null;
            if (viewGroup != null && view != null) {
                int indexOf = this.f303e.indexOf(componentCallbacksC0041e);
                while (true) {
                    indexOf--;
                    if (indexOf < 0) {
                        break;
                    }
                    ComponentCallbacksC0041e componentCallbacksC0041e3 = this.f303e.get(indexOf);
                    if (componentCallbacksC0041e3.f209I == viewGroup && componentCallbacksC0041e3.f210J != null) {
                        componentCallbacksC0041e2 = componentCallbacksC0041e3;
                        break;
                    }
                }
            }
            if (componentCallbacksC0041e2 != null) {
                View view2 = componentCallbacksC0041e2.f210J;
                ViewGroup viewGroup2 = componentCallbacksC0041e.f209I;
                int indexOfChild = viewGroup2.indexOfChild(view2);
                int indexOfChild2 = viewGroup2.indexOfChild(componentCallbacksC0041e.f210J);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup2.removeViewAt(indexOfChild2);
                    viewGroup2.addView(componentCallbacksC0041e.f210J, indexOfChild);
                }
            }
            if (componentCallbacksC0041e.f215O && componentCallbacksC0041e.f209I != null) {
                float f2 = componentCallbacksC0041e.f217Q;
                if (f2 > 0.0f) {
                    componentCallbacksC0041e.f210J.setAlpha(f2);
                }
                componentCallbacksC0041e.f217Q = 0.0f;
                componentCallbacksC0041e.f215O = false;
                d m233a = m233a(componentCallbacksC0041e, componentCallbacksC0041e.m193l(), true, componentCallbacksC0041e.m194m());
                if (m233a != null) {
                    m229a(componentCallbacksC0041e.f210J, m233a);
                    Animation animation = m233a.f329a;
                    if (animation != null) {
                        componentCallbacksC0041e.f210J.startAnimation(animation);
                    } else {
                        m233a.f330b.setTarget(componentCallbacksC0041e.f210J);
                        m233a.f330b.start();
                    }
                }
            }
        }
        if (componentCallbacksC0041e.f216P) {
            if (componentCallbacksC0041e.f210J != null) {
                d m233a2 = m233a(componentCallbacksC0041e, componentCallbacksC0041e.m193l(), !componentCallbacksC0041e.f202B, componentCallbacksC0041e.m194m());
                if (m233a2 == null || (animator = m233a2.f330b) == null) {
                    if (m233a2 != null) {
                        m229a(componentCallbacksC0041e.f210J, m233a2);
                        componentCallbacksC0041e.f210J.startAnimation(m233a2.f329a);
                        m233a2.f329a.start();
                    }
                    componentCallbacksC0041e.f210J.setVisibility((!componentCallbacksC0041e.f202B || componentCallbacksC0041e.m198q()) ? 0 : 8);
                    if (componentCallbacksC0041e.m198q()) {
                        componentCallbacksC0041e.m183c(false);
                    }
                } else {
                    animator.setTarget(componentCallbacksC0041e.f210J);
                    if (!componentCallbacksC0041e.f202B) {
                        componentCallbacksC0041e.f210J.setVisibility(0);
                    } else if (componentCallbacksC0041e.m198q()) {
                        componentCallbacksC0041e.m183c(false);
                    } else {
                        ViewGroup viewGroup3 = componentCallbacksC0041e.f209I;
                        View view3 = componentCallbacksC0041e.f210J;
                        viewGroup3.startViewTransition(view3);
                        m233a2.f330b.addListener(new C0054n(this, viewGroup3, view3, componentCallbacksC0041e));
                    }
                    m229a(componentCallbacksC0041e.f210J, m233a2);
                    m233a2.f330b.start();
                }
            }
            if (componentCallbacksC0041e.f234l && componentCallbacksC0041e.f206F && componentCallbacksC0041e.f207G) {
                this.f316r = true;
            }
            componentCallbacksC0041e.f216P = false;
            boolean z = componentCallbacksC0041e.f202B;
        }
    }

    /* renamed from: e */
    public void m276e(ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m276e(componentCallbacksC0041e, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: f */
    public final void m277f() {
        this.f301c = false;
        this.f323y.clear();
        this.f322x.clear();
    }

    /* renamed from: f */
    public void m278f(ComponentCallbacksC0041e componentCallbacksC0041e) {
        boolean z = !componentCallbacksC0041e.m199r();
        if (!componentCallbacksC0041e.f203C || z) {
            synchronized (this.f303e) {
                this.f303e.remove(componentCallbacksC0041e);
            }
            if (componentCallbacksC0041e.f206F && componentCallbacksC0041e.f207G) {
                this.f316r = true;
            }
            componentCallbacksC0041e.f234l = false;
            componentCallbacksC0041e.f235m = true;
        }
    }

    /* renamed from: f */
    public void m279f(ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m279f(componentCallbacksC0041e, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: g */
    public void m280g() {
        this.f317s = false;
        this.f318t = false;
        m234a(2);
    }

    /* renamed from: g */
    public void m281g(ComponentCallbacksC0041e componentCallbacksC0041e) {
        if (componentCallbacksC0041e.f211K == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.f296B;
        if (sparseArray == null) {
            this.f296B = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        componentCallbacksC0041e.f211K.saveHierarchyState(this.f296B);
        if (this.f296B.size() > 0) {
            componentCallbacksC0041e.f226d = this.f296B;
            this.f296B = null;
        }
    }

    /* renamed from: g */
    public void m282g(ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m282g(componentCallbacksC0041e, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: h */
    public void m283h() {
        this.f317s = false;
        this.f318t = false;
        m234a(1);
    }

    /* renamed from: h */
    public void m284h(ComponentCallbacksC0041e componentCallbacksC0041e) {
        if (componentCallbacksC0041e == null || (this.f304f.get(componentCallbacksC0041e.f228f) == componentCallbacksC0041e && (componentCallbacksC0041e.f242t == null || componentCallbacksC0041e.f241s == this))) {
            this.f315q = componentCallbacksC0041e;
            return;
        }
        throw new IllegalArgumentException("Fragment " + componentCallbacksC0041e + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: h */
    public void m285h(ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        ComponentCallbacksC0041e componentCallbacksC0041e2 = this.f314p;
        if (componentCallbacksC0041e2 != null) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e2.f241s;
            if (layoutInflaterFactory2C0051k instanceof LayoutInflaterFactory2C0051k) {
                layoutInflaterFactory2C0051k.m285h(componentCallbacksC0041e, true);
            }
        }
        Iterator<g> it = this.f310l.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (!z || next.f338b) {
                AbstractC0050j.b bVar = next.f337a;
                throw null;
            }
        }
    }

    /* renamed from: i */
    public void m286i() {
        this.f319u = true;
        m293o();
        m234a(0);
        this.f312n = null;
        this.f313o = null;
        this.f314p = null;
    }

    /* renamed from: i */
    public void m287i(ComponentCallbacksC0041e componentCallbacksC0041e) {
        if (componentCallbacksC0041e.f202B) {
            componentCallbacksC0041e.f202B = false;
            componentCallbacksC0041e.f216P = !componentCallbacksC0041e.f216P;
        }
    }

    /* renamed from: j */
    public void m288j() {
        for (int i2 = 0; i2 < this.f303e.size(); i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i2);
            if (componentCallbacksC0041e != null) {
                componentCallbacksC0041e.m202u();
            }
        }
    }

    /* renamed from: k */
    public void m289k() {
        m234a(3);
    }

    /* renamed from: l */
    public void m290l() {
        this.f317s = false;
        this.f318t = false;
        m234a(4);
    }

    /* renamed from: m */
    public void m291m() {
        this.f317s = false;
        this.f318t = false;
        m234a(3);
    }

    /* renamed from: n */
    public void m292n() {
        if (this.f321w) {
            this.f321w = false;
            m299u();
        }
    }

    /* renamed from: o */
    public boolean m293o() {
        m269c(true);
        boolean z = false;
        while (m263b(this.f322x, this.f323y)) {
            this.f301c = true;
            try {
                m268c(this.f322x, this.f323y);
                m277f();
                z = true;
            } catch (Throwable th) {
                m277f();
                throw th;
            }
        }
        if (this.f321w) {
            this.f321w = false;
            m299u();
        }
        m270d();
        return z;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        ComponentCallbacksC0041e componentCallbacksC0041e;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.f339a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!ComponentCallbacksC0041e.m162a(this.f312n.f289b, str2)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        ComponentCallbacksC0041e m255b = resourceId != -1 ? m255b(resourceId) : null;
        if (m255b == null && string != null) {
            int size = this.f303e.size() - 1;
            while (true) {
                if (size >= 0) {
                    componentCallbacksC0041e = this.f303e.get(size);
                    if (componentCallbacksC0041e != null && string.equals(componentCallbacksC0041e.f201A)) {
                        break;
                    }
                    size--;
                } else {
                    SparseArray<ComponentCallbacksC0041e> sparseArray = this.f304f;
                    if (sparseArray != null) {
                        for (int size2 = sparseArray.size() - 1; size2 >= 0; size2--) {
                            componentCallbacksC0041e = this.f304f.valueAt(size2);
                            if (componentCallbacksC0041e != null && string.equals(componentCallbacksC0041e.f201A)) {
                                break;
                            }
                        }
                    }
                    componentCallbacksC0041e = null;
                }
            }
        } else {
            componentCallbacksC0041e = m255b;
        }
        if (componentCallbacksC0041e == null && id != -1) {
            componentCallbacksC0041e = m255b(id);
        }
        if (componentCallbacksC0041e == null) {
            ComponentCallbacksC0041e mo203a = this.f313o.mo203a(context, str2, null);
            mo203a.f236n = true;
            mo203a.f247y = resourceId != 0 ? resourceId : id;
            mo203a.f248z = id;
            mo203a.f201A = string;
            mo203a.f237o = true;
            mo203a.f241s = this;
            AbstractC0049i abstractC0049i = this.f312n;
            mo203a.f242t = abstractC0049i;
            Context context2 = abstractC0049i.f289b;
            mo203a.m170a(attributeSet, mo203a.f225c);
            m243a(mo203a, true);
            componentCallbacksC0041e = mo203a;
        } else {
            if (componentCallbacksC0041e.f237o) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
            }
            componentCallbacksC0041e.f237o = true;
            AbstractC0049i abstractC0049i2 = this.f312n;
            componentCallbacksC0041e.f242t = abstractC0049i2;
            if (!componentCallbacksC0041e.f205E) {
                Context context3 = abstractC0049i2.f289b;
                componentCallbacksC0041e.m170a(attributeSet, componentCallbacksC0041e.f225c);
            }
        }
        if (this.f311m >= 1 || !componentCallbacksC0041e.f236n) {
            m239a(componentCallbacksC0041e, this.f311m, 0, 0, false);
        } else {
            m239a(componentCallbacksC0041e, 1, 0, 0, false);
        }
        View view2 = componentCallbacksC0041e.f210J;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (componentCallbacksC0041e.f210J.getTag() == null) {
                componentCallbacksC0041e.f210J.setTag(string);
            }
            return componentCallbacksC0041e.f210J;
        }
        throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: p */
    public LayoutInflater.Factory2 m294p() {
        return this;
    }

    /* renamed from: q */
    public void m295q() {
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k;
        this.f298D = null;
        this.f317s = false;
        this.f318t = false;
        int size = this.f303e.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f303e.get(i2);
            if (componentCallbacksC0041e != null && (layoutInflaterFactory2C0051k = componentCallbacksC0041e.f243u) != null) {
                layoutInflaterFactory2C0051k.m295q();
            }
        }
    }

    /* renamed from: r */
    public Parcelable m296r() {
        int size;
        int i2;
        C0037c[] c0037cArr;
        int[] iArr;
        int size2;
        Bundle bundle;
        if (this.f297C != null) {
            while (!this.f297C.isEmpty()) {
                this.f297C.remove(0).m300a();
            }
        }
        SparseArray<ComponentCallbacksC0041e> sparseArray = this.f304f;
        if (sparseArray == null) {
            i2 = 0;
            size = 0;
        } else {
            size = sparseArray.size();
            i2 = 0;
        }
        while (true) {
            c0037cArr = null;
            if (i2 >= size) {
                break;
            }
            ComponentCallbacksC0041e valueAt = this.f304f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.m186e() != null) {
                    int m196o = valueAt.m196o();
                    View m186e = valueAt.m186e();
                    Animation animation = m186e.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        m186e.clearAnimation();
                    }
                    valueAt.m173a((View) null);
                    m239a(valueAt, m196o, 0, 0, false);
                } else if (valueAt.m187f() != null) {
                    valueAt.m187f().end();
                }
            }
            i2++;
        }
        m293o();
        this.f317s = true;
        this.f298D = null;
        SparseArray<ComponentCallbacksC0041e> sparseArray2 = this.f304f;
        if (sparseArray2 == null || sparseArray2.size() <= 0) {
            return null;
        }
        int size3 = this.f304f.size();
        C0057q[] c0057qArr = new C0057q[size3];
        boolean z = false;
        for (int i3 = 0; i3 < size3; i3++) {
            ComponentCallbacksC0041e valueAt2 = this.f304f.valueAt(i3);
            if (valueAt2 != null) {
                if (valueAt2.f228f < 0) {
                    m249a(new IllegalStateException("Failure saving state: active " + valueAt2 + " has cleared index: " + valueAt2.f228f));
                    throw null;
                }
                C0057q c0057q = new C0057q(valueAt2);
                c0057qArr[i3] = c0057q;
                if (valueAt2.f224b <= 0 || c0057q.f372l != null) {
                    c0057q.f372l = valueAt2.f225c;
                } else {
                    if (this.f295A == null) {
                        this.f295A = new Bundle();
                    }
                    valueAt2.m177b(this.f295A);
                    m272d(valueAt2, this.f295A, false);
                    if (this.f295A.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = this.f295A;
                        this.f295A = null;
                    }
                    if (valueAt2.f210J != null) {
                        m281g(valueAt2);
                    }
                    if (valueAt2.f226d != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", valueAt2.f226d);
                    }
                    if (!valueAt2.f213M) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", valueAt2.f213M);
                    }
                    c0057q.f372l = bundle;
                    ComponentCallbacksC0041e componentCallbacksC0041e = valueAt2.f231i;
                    if (componentCallbacksC0041e != null) {
                        if (componentCallbacksC0041e.f228f < 0) {
                            m249a(new IllegalStateException("Failure saving state: " + valueAt2 + " has target not in fragment manager: " + valueAt2.f231i));
                            throw null;
                        }
                        if (c0057q.f372l == null) {
                            c0057q.f372l = new Bundle();
                        }
                        Bundle bundle2 = c0057q.f372l;
                        ComponentCallbacksC0041e componentCallbacksC0041e2 = valueAt2.f231i;
                        int i4 = componentCallbacksC0041e2.f228f;
                        if (i4 < 0) {
                            m249a(new IllegalStateException(C0335a.m1132a("Fragment ", componentCallbacksC0041e2, " is not currently in the FragmentManager")));
                            throw null;
                        }
                        bundle2.putInt("android:target_state", i4);
                        int i5 = valueAt2.f233k;
                        if (i5 != 0) {
                            c0057q.f372l.putInt("android:target_req_state", i5);
                        }
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        int size4 = this.f303e.size();
        if (size4 > 0) {
            iArr = new int[size4];
            for (int i6 = 0; i6 < size4; i6++) {
                iArr[i6] = this.f303e.get(i6).f228f;
                if (iArr[i6] < 0) {
                    StringBuilder m1134a = C0335a.m1134a("Failure saving state: active ");
                    m1134a.append(this.f303e.get(i6));
                    m1134a.append(" has cleared index: ");
                    m1134a.append(iArr[i6]);
                    m249a(new IllegalStateException(m1134a.toString()));
                    throw null;
                }
            }
        } else {
            iArr = null;
        }
        ArrayList<C0035b> arrayList = this.f305g;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            c0037cArr = new C0037c[size2];
            for (int i7 = 0; i7 < size2; i7++) {
                c0037cArr[i7] = new C0037c(this.f305g.get(i7));
            }
        }
        C0056p c0056p = new C0056p();
        c0056p.f357b = c0057qArr;
        c0056p.f358c = iArr;
        c0056p.f359d = c0037cArr;
        ComponentCallbacksC0041e componentCallbacksC0041e3 = this.f315q;
        if (componentCallbacksC0041e3 != null) {
            c0056p.f360e = componentCallbacksC0041e3.f228f;
        }
        c0056p.f361f = this.f302d;
        m297s();
        return c0056p;
    }

    /* renamed from: s */
    public void m297s() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        C0055o c0055o;
        if (this.f304f != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i2 = 0; i2 < this.f304f.size(); i2++) {
                ComponentCallbacksC0041e valueAt = this.f304f.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.f204D) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAt);
                        ComponentCallbacksC0041e componentCallbacksC0041e = valueAt.f231i;
                        valueAt.f232j = componentCallbacksC0041e != null ? componentCallbacksC0041e.f228f : -1;
                    }
                    LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = valueAt.f243u;
                    if (layoutInflaterFactory2C0051k != null) {
                        layoutInflaterFactory2C0051k.m297s();
                        c0055o = valueAt.f243u.f298D;
                    } else {
                        c0055o = valueAt.f244v;
                    }
                    if (arrayList2 == null && c0055o != null) {
                        arrayList2 = new ArrayList(this.f304f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(c0055o);
                    }
                    if (arrayList3 == null && valueAt.f245w != null) {
                        arrayList3 = new ArrayList(this.f304f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(valueAt.f245w);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.f298D = null;
        } else {
            this.f298D = new C0055o(arrayList, arrayList2, arrayList3);
        }
    }

    /* renamed from: t */
    public void m298t() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = (this.f297C == null || this.f297C.isEmpty()) ? false : true;
            if (this.f300b != null && this.f300b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f312n.f290c.removeCallbacks(this.f299E);
                this.f312n.f290c.post(this.f299E);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ComponentCallbacksC0041e componentCallbacksC0041e = this.f314p;
        if (componentCallbacksC0041e != null) {
            C0027d.m78a((Object) componentCallbacksC0041e, sb);
        } else {
            C0027d.m78a((Object) this.f312n, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public void m299u() {
        if (this.f304f == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f304f.size(); i2++) {
            ComponentCallbacksC0041e valueAt = this.f304f.valueAt(i2);
            if (valueAt != null && valueAt.f212L) {
                if (this.f301c) {
                    this.f321w = true;
                } else {
                    valueAt.f212L = false;
                    m239a(valueAt, this.f311m, 0, 0, false);
                }
            }
        }
    }
}
