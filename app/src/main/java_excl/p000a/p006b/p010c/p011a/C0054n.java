package p000a.p006b.p010c.p011a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.c.a.n */
/* loaded from: classes.dex */
public class C0054n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f351a;

    /* renamed from: b */
    public final /* synthetic */ View f352b;

    /* renamed from: c */
    public final /* synthetic */ ComponentCallbacksC0041e f353c;

    public C0054n(LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k, ViewGroup viewGroup, View view, ComponentCallbacksC0041e componentCallbacksC0041e) {
        this.f351a = viewGroup;
        this.f352b = view;
        this.f353c = componentCallbacksC0041e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f351a.endViewTransition(this.f352b);
        animator.removeListener(this);
        View view = this.f353c.f210J;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
