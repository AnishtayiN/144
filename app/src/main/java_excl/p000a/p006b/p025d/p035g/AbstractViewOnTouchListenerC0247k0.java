package p000a.p006b.p025d.p035g;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0212s;

/* renamed from: a.b.d.g.k0 */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0247k0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final float f1334b;

    /* renamed from: c */
    public final int f1335c;

    /* renamed from: d */
    public final int f1336d;

    /* renamed from: e */
    public final View f1337e;

    /* renamed from: f */
    public Runnable f1338f;

    /* renamed from: g */
    public Runnable f1339g;

    /* renamed from: h */
    public boolean f1340h;

    /* renamed from: i */
    public int f1341i;

    /* renamed from: j */
    public final int[] f1342j = new int[2];

    /* renamed from: a.b.d.g.k0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0247k0.this.f1337e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: a.b.d.g.k0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0247k0 abstractViewOnTouchListenerC0247k0 = AbstractViewOnTouchListenerC0247k0.this;
            abstractViewOnTouchListenerC0247k0.m861a();
            View view = abstractViewOnTouchListenerC0247k0.f1337e;
            if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0247k0.mo771c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                abstractViewOnTouchListenerC0247k0.f1340h = true;
            }
        }
    }

    public AbstractViewOnTouchListenerC0247k0(View view) {
        this.f1337e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1334b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f1335c = ViewConfiguration.getTapTimeout();
        this.f1336d = (ViewConfiguration.getLongPressTimeout() + this.f1335c) / 2;
    }

    /* renamed from: a */
    public final void m861a() {
        Runnable runnable = this.f1339g;
        if (runnable != null) {
            this.f1337e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1338f;
        if (runnable2 != null) {
            this.f1337e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract InterfaceC0212s mo770b();

    /* renamed from: c */
    public abstract boolean mo771c();

    /* renamed from: d */
    public boolean mo772d() {
        InterfaceC0212s mo770b = mo770b();
        if (mo770b == null || !mo770b.mo676b()) {
            return true;
        }
        mo770b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r4 != 3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1340h = false;
        this.f1341i = -1;
        Runnable runnable = this.f1338f;
        if (runnable != null) {
            this.f1337e.removeCallbacks(runnable);
        }
    }
}
