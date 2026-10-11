package p000a.p006b.p010c.p011a;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: a.b.c.a.d0 */
/* loaded from: classes.dex */
public class ViewTreeObserverOnPreDrawListenerC0040d0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f196b;

    /* renamed from: c */
    public ViewTreeObserver f197c;

    /* renamed from: d */
    public final Runnable f198d;

    public ViewTreeObserverOnPreDrawListenerC0040d0(View view, Runnable runnable) {
        this.f196b = view;
        this.f197c = view.getViewTreeObserver();
        this.f198d = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC0040d0 m159a(View view, Runnable runnable) {
        ViewTreeObserverOnPreDrawListenerC0040d0 viewTreeObserverOnPreDrawListenerC0040d0 = new ViewTreeObserverOnPreDrawListenerC0040d0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0040d0);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0040d0);
        return viewTreeObserverOnPreDrawListenerC0040d0;
    }

    /* renamed from: a */
    public void m160a() {
        if (this.f197c.isAlive()) {
            this.f197c.removeOnPreDrawListener(this);
        } else {
            this.f196b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f196b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m160a();
        this.f198d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f197c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m160a();
    }
}
