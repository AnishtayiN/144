package p000a.p006b.p010c.p021h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;
import p000a.p006b.p025d.p026a.C0165y;

/* renamed from: a.b.c.h.p */
/* loaded from: classes.dex */
public final class C0121p {

    /* renamed from: a */
    public WeakReference<View> f613a;

    /* renamed from: b */
    public Runnable f614b = null;

    /* renamed from: c */
    public Runnable f615c = null;

    /* renamed from: d */
    public int f616d = -1;

    /* renamed from: a.b.c.h.p$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0122q f617a;

        /* renamed from: b */
        public final /* synthetic */ View f618b;

        public a(C0121p c0121p, InterfaceC0122q interfaceC0122q, View view) {
            this.f617a = interfaceC0122q;
            this.f618b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f617a.mo497c(this.f618b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f617a.mo495a(this.f618b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f617a.mo496b(this.f618b);
        }
    }

    /* renamed from: a.b.c.h.p$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0124s f619a;

        /* renamed from: b */
        public final /* synthetic */ View f620b;

        public b(C0121p c0121p, InterfaceC0124s interfaceC0124s, View view) {
            this.f619a = interfaceC0124s;
            this.f620b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) C0165y.this.f819d.getParent()).invalidate();
        }
    }

    /* renamed from: a.b.c.h.p$c */
    public static class c implements InterfaceC0122q {

        /* renamed from: a */
        public C0121p f621a;

        /* renamed from: b */
        public boolean f622b;

        public c(C0121p c0121p) {
            this.f621a = c0121p;
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: a */
        public void mo495a(View view) {
            int i = this.f621a.f616d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f621a.f616d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f622b) {
                C0121p c0121p = this.f621a;
                Runnable runnable = c0121p.f615c;
                if (runnable != null) {
                    c0121p.f615c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC0122q interfaceC0122q = tag instanceof InterfaceC0122q ? (InterfaceC0122q) tag : null;
                if (interfaceC0122q != null) {
                    interfaceC0122q.mo495a(view);
                }
                this.f622b = true;
            }
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: b */
        public void mo496b(View view) {
            this.f622b = false;
            if (this.f621a.f616d > -1) {
                view.setLayerType(2, null);
            }
            C0121p c0121p = this.f621a;
            Runnable runnable = c0121p.f614b;
            if (runnable != null) {
                c0121p.f614b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC0122q interfaceC0122q = tag instanceof InterfaceC0122q ? (InterfaceC0122q) tag : null;
            if (interfaceC0122q != null) {
                interfaceC0122q.mo496b(view);
            }
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: c */
        public void mo497c(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC0122q interfaceC0122q = tag instanceof InterfaceC0122q ? (InterfaceC0122q) tag : null;
            if (interfaceC0122q != null) {
                interfaceC0122q.mo497c(view);
            }
        }
    }

    public C0121p(View view) {
        this.f613a = new WeakReference<>(view);
    }

    /* renamed from: a */
    public C0121p m488a(float f) {
        View view = this.f613a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: a */
    public C0121p m489a(long j) {
        View view = this.f613a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0121p m490a(InterfaceC0122q interfaceC0122q) {
        View view = this.f613a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                m493a(view, interfaceC0122q);
            } else {
                view.setTag(2113929216, interfaceC0122q);
                m493a(view, new c(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0121p m491a(InterfaceC0124s interfaceC0124s) {
        View view = this.f613a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(interfaceC0124s != null ? new b(this, interfaceC0124s, view) : null);
        }
        return this;
    }

    /* renamed from: a */
    public void m492a() {
        View view = this.f613a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    public final void m493a(View view, InterfaceC0122q interfaceC0122q) {
        if (interfaceC0122q != null) {
            view.animate().setListener(new a(this, interfaceC0122q, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: b */
    public C0121p m494b(float f) {
        View view = this.f613a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
