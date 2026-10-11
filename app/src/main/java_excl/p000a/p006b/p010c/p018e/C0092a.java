package p000a.p006b.p010c.p018e;

import android.util.Base64;
import java.util.List;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.c.e.a */
/* loaded from: classes.dex */
public final class C0092a {

    /* renamed from: a */
    public final String f477a;

    /* renamed from: b */
    public final String f478b;

    /* renamed from: c */
    public final String f479c;

    /* renamed from: d */
    public final List<List<byte[]>> f480d;

    /* renamed from: e */
    public final int f481e;

    /* renamed from: f */
    public final String f482f;

    public C0092a(String str, String str2, String str3, List<List<byte[]>> list) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f477a = str;
        if (str2 == null) {
            throw new NullPointerException();
        }
        this.f478b = str2;
        if (str3 == null) {
            throw new NullPointerException();
        }
        this.f479c = str3;
        if (list == null) {
            throw new NullPointerException();
        }
        this.f480d = list;
        this.f481e = 0;
        this.f482f = this.f477a + "-" + this.f478b + "-" + this.f479c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder m1134a = C0335a.m1134a("FontRequest {mProviderAuthority: ");
        m1134a.append(this.f477a);
        m1134a.append(", mProviderPackage: ");
        m1134a.append(this.f478b);
        m1134a.append(", mQuery: ");
        m1134a.append(this.f479c);
        m1134a.append(", mCertificates:");
        sb.append(m1134a.toString());
        for (int i = 0; i < this.f480d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f480d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f481e);
        return sb.toString();
    }
}
