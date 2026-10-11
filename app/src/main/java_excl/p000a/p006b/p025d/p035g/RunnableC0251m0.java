package p000a.p006b.p025d.p035g;

import android.view.View;

/* renamed from: a.b.d.g.m0 */
/* loaded from: classes.dex */
public class RunnableC0251m0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C0255o0 f1368b;

    public RunnableC0251m0(C0255o0 c0255o0) {
        this.f1368b = c0255o0;
    }

    @Override // java.lang.Runnable
    public void run() {
        View view = this.f1368b.f1402t;
        if (view == null || view.getWindowToken() == null) {
            return;
        }
        this.f1368b.mo681d();
    }
}
