package p000a.p006b.p010c.p011a;

import android.app.Activity;
import android.os.Build;
import p000a.p006b.p010c.p012b.C0067a;

/* renamed from: a.b.c.a.a */
/* loaded from: classes.dex */
public class C0033a extends C0067a {

    /* renamed from: a.b.c.a.a$a */
    public interface a {
    }

    /* renamed from: a.b.c.a.a$b */
    public interface b {
    }

    /* renamed from: a */
    public static void m127a() {
    }

    /* renamed from: a */
    public static void m128a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }
}
