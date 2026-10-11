package p000a.p006b.p010c.p011a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.b.c.a.m */
/* loaded from: classes.dex */
public class C0053m extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f347a;

    /* renamed from: b */
    public final /* synthetic */ View f348b;

    /* renamed from: c */
    public final /* synthetic */ ComponentCallbacksC0041e f349c;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0051k f350d;

    public C0053m(LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k, ViewGroup viewGroup, View view, ComponentCallbacksC0041e componentCallbacksC0041e) {
        this.f350d = layoutInflaterFactory2C0051k;
        this.f347a = viewGroup;
        this.f348b = view;
        this.f349c = componentCallbacksC0041e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f347a.endViewTransition(this.f348b);
        Animator m187f = this.f349c.m187f();
        this.f349c.m168a((Animator) null);
        if (m187f == null || this.f347a.indexOfChild(this.f348b) >= 0) {
            return;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f350d;
        ComponentCallbacksC0041e componentCallbacksC0041e = this.f349c;
        layoutInflaterFactory2C0051k.m239a(componentCallbacksC0041e, componentCallbacksC0041e.m196o(), 0, 0, false);
    }
}
