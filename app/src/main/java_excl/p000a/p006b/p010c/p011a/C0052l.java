package p000a.p006b.p010c.p011a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k;

/* renamed from: a.b.c.a.l */
/* loaded from: classes.dex */
public class C0052l extends LayoutInflaterFactory2C0051k.c {

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f343b;

    /* renamed from: c */
    public final /* synthetic */ ComponentCallbacksC0041e f344c;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0051k f345d;

    /* renamed from: a.b.c.a.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0052l.this.f344c.m186e() != null) {
                C0052l.this.f344c.m173a((View) null);
                C0052l c0052l = C0052l.this;
                LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = c0052l.f345d;
                ComponentCallbacksC0041e componentCallbacksC0041e = c0052l.f344c;
                layoutInflaterFactory2C0051k.m239a(componentCallbacksC0041e, componentCallbacksC0041e.m196o(), 0, 0, false);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052l(LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k, Animation.AnimationListener animationListener, ViewGroup viewGroup, ComponentCallbacksC0041e componentCallbacksC0041e) {
        super(animationListener);
        this.f345d = layoutInflaterFactory2C0051k;
        this.f343b = viewGroup;
        this.f344c = componentCallbacksC0041e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        Animation.AnimationListener animationListener = this.f328a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(animation);
        }
        this.f343b.post(new a());
    }
}
