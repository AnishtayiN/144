package p000a.p006b.p010c.p021h;

import android.os.Build;
import android.view.WindowInsets;

/* renamed from: a.b.c.h.t */
/* loaded from: classes.dex */
public class C0125t {

    /* renamed from: a */
    public final Object f623a;

    public C0125t(Object obj) {
        this.f623a = obj;
    }

    /* renamed from: a */
    public static C0125t m498a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0125t(obj);
    }

    /* renamed from: a */
    public int m499a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f623a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0125t.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f623a;
        Object obj3 = ((C0125t) obj).f623a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f623a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
