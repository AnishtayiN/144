package p000a.p006b.p025d.p026a;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.C0125t;
import p000a.p006b.p010c.p021h.InterfaceC0116k;

/* renamed from: a.b.d.a.p */
/* loaded from: classes.dex */
public class C0156p implements InterfaceC0116k {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0155o f789a;

    public C0156p(LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o) {
        this.f789a = layoutInflaterFactory2C0155o;
    }

    /* renamed from: a */
    public C0125t m589a(View view, C0125t c0125t) {
        int m499a = c0125t.m499a();
        int m574h = this.f789a.m574h(m499a);
        if (m499a != m574h) {
            c0125t = Build.VERSION.SDK_INT >= 20 ? new C0125t(((WindowInsets) c0125t.f623a).replaceSystemWindowInsets(Build.VERSION.SDK_INT >= 20 ? ((WindowInsets) c0125t.f623a).getSystemWindowInsetLeft() : 0, m574h, Build.VERSION.SDK_INT >= 20 ? ((WindowInsets) c0125t.f623a).getSystemWindowInsetRight() : 0, Build.VERSION.SDK_INT >= 20 ? ((WindowInsets) c0125t.f623a).getSystemWindowInsetBottom() : 0)) : null;
        }
        return C0119n.m454a(view, c0125t);
    }
}
