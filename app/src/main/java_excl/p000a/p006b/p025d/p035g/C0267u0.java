package p000a.p006b.p025d.p035g;

/* renamed from: a.b.d.g.u0 */
/* loaded from: classes.dex */
public class C0267u0 {

    /* renamed from: a */
    public int f1465a = 0;

    /* renamed from: b */
    public int f1466b = 0;

    /* renamed from: c */
    public int f1467c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1468d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1469e = 0;

    /* renamed from: f */
    public int f1470f = 0;

    /* renamed from: g */
    public boolean f1471g = false;

    /* renamed from: h */
    public boolean f1472h = false;

    /* renamed from: a */
    public void m906a(int i, int i2) {
        this.f1467c = i;
        this.f1468d = i2;
        this.f1472h = true;
        if (this.f1471g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1465a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1466b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1465a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1466b = i2;
        }
    }
}
