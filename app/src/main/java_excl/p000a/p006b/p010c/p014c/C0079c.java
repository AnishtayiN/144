package p000a.p006b.p010c.p014c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import p000a.p006b.p010c.p012b.p013c.AbstractC0076h;
import p000a.p006b.p010c.p012b.p013c.C0071c;
import p000a.p006b.p010c.p012b.p013c.C0073e;
import p000a.p006b.p010c.p012b.p013c.InterfaceC0070b;
import p000a.p006b.p010c.p018e.C0093b;
import p000a.p006b.p010c.p020g.C0102g;

/* renamed from: a.b.c.c.c */
/* loaded from: classes.dex */
public class C0079c {

    /* renamed from: a */
    public static final C0084h f452a;

    /* renamed from: b */
    public static final C0102g<String, Typeface> f453b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f452a = new C0083g();
        } else if (i >= 26) {
            f452a = new C0082f();
        } else {
            if (i >= 24) {
                if (C0081e.f456c == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (C0081e.f456c != null) {
                    f452a = new C0081e();
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                f452a = new C0080d();
            } else {
                f452a = new C0084h();
            }
        }
        f453b = new C0102g<>(16);
    }

    /* renamed from: a */
    public static Typeface m338a(Context context, InterfaceC0070b interfaceC0070b, Resources resources, int i, int i2, AbstractC0076h abstractC0076h, Handler handler, boolean z) {
        Typeface mo345a;
        if (interfaceC0070b instanceof C0073e) {
            C0073e c0073e = (C0073e) interfaceC0070b;
            boolean z2 = false;
            if (!z ? abstractC0076h == null : c0073e.f443c == 0) {
                z2 = true;
            }
            mo345a = C0093b.m367a(context, c0073e.f441a, abstractC0076h, handler, z2, z ? c0073e.f442b : -1, i2);
        } else {
            mo345a = f452a.mo345a(context, (C0071c) interfaceC0070b, resources, i2);
            if (abstractC0076h != null) {
                if (mo345a != null) {
                    abstractC0076h.m331a(mo345a, handler);
                } else {
                    abstractC0076h.m329a(-3, handler);
                }
            }
        }
        if (mo345a != null) {
            f453b.m406a(m340a(resources, i, i2), mo345a);
        }
        return mo345a;
    }

    /* renamed from: a */
    public static Typeface m339a(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo346a = f452a.mo346a(context, resources, i, str, i2);
        if (mo346a != null) {
            f453b.m406a(m340a(resources, i, i2), mo346a);
        }
        return mo346a;
    }

    /* renamed from: a */
    public static String m340a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
