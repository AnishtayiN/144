package p000a.p006b.p010c.p014c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p012b.p013c.C0071c;
import p000a.p006b.p010c.p012b.p013c.C0072d;
import p000a.p006b.p010c.p018e.C0093b;

/* renamed from: a.b.c.c.h */
/* loaded from: classes.dex */
public class C0084h {
    /* renamed from: a */
    public C0093b.f m356a(C0093b.f[] fVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C0093b.f fVar = null;
        int i3 = Integer.MAX_VALUE;
        for (C0093b.f fVar2 : fVarArr) {
            int abs = (Math.abs(fVar2.f499c - i2) * 2) + (fVar2.f500d == z ? 0 : 1);
            if (fVar == null || i3 > abs) {
                fVar = fVar2;
                i3 = abs;
            }
        }
        return fVar;
    }

    /* renamed from: a */
    public Typeface mo345a(Context context, C0071c c0071c, Resources resources, int i) {
        C0072d[] c0072dArr = c0071c.f434a;
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C0072d c0072d = null;
        int i3 = Integer.MAX_VALUE;
        for (C0072d c0072d2 : c0072dArr) {
            int abs = (Math.abs(c0072d2.f436b - i2) * 2) + (c0072d2.f437c == z ? 0 : 1);
            if (c0072d == null || i3 > abs) {
                c0072d = c0072d2;
                i3 = abs;
            }
        }
        if (c0072d == null) {
            return null;
        }
        return C0079c.m339a(context, resources, c0072d.f440f, c0072d.f435a, i);
    }

    /* renamed from: a */
    public Typeface mo346a(Context context, Resources resources, int i, String str, int i2) {
        File m56a = C0027d.m56a(context);
        if (m56a == null) {
            return null;
        }
        try {
            if (C0027d.m82a(m56a, resources, i)) {
                return Typeface.createFromFile(m56a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m56a.delete();
        }
    }

    /* renamed from: a */
    public Typeface mo341a(Context context, CancellationSignal cancellationSignal, C0093b.f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m356a(fVarArr, i).f497a);
            try {
                Typeface m357a = m357a(context, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m357a;
            } catch (IOException unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public Typeface m357a(Context context, InputStream inputStream) {
        File m56a = C0027d.m56a(context);
        if (m56a == null) {
            return null;
        }
        try {
            if (C0027d.m83a(m56a, inputStream)) {
                return Typeface.createFromFile(m56a.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m56a.delete();
        }
    }
}
