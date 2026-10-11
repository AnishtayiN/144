package p000a.p006b.p010c.p020g;

import android.util.Log;
import java.io.Writer;

/* renamed from: a.b.c.g.e */
/* loaded from: classes.dex */
public class C0100e extends Writer {

    /* renamed from: b */
    public final String f547b;

    /* renamed from: c */
    public StringBuilder f548c = new StringBuilder(128);

    public C0100e(String str) {
        this.f547b = str;
    }

    /* renamed from: a */
    public final void m400a() {
        if (this.f548c.length() > 0) {
            Log.d(this.f547b, this.f548c.toString());
            StringBuilder sb = this.f548c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m400a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m400a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                m400a();
            } else {
                this.f548c.append(c2);
            }
        }
    }
}
