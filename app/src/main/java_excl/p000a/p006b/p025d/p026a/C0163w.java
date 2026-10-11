package p000a.p006b.p025d.p026a;

/* renamed from: a.b.d.a.w */
/* loaded from: classes.dex */
public class C0163w {

    /* renamed from: d */
    public static C0163w f799d;

    /* renamed from: a */
    public long f800a;

    /* renamed from: b */
    public long f801b;

    /* renamed from: c */
    public int f802c;

    /* renamed from: a */
    public void m593a(long j, double d, double d2) {
        float f = (j - 946728000000L) / 8.64E7f;
        double d3 = (0.01720197f * f) + 6.24006f;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        double sin2 = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + sin + d3 + 1.796593063d + 3.141592653589793d;
        Double.isNaN(f - 9.0E-4f);
        double round = Math.round(r11 - r9) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = (Math.sin(2.0d * sin2) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + round + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin2));
        double d4 = 0.01745329238474369d * d;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin4 >= 1.0d) {
            this.f802c = 1;
            this.f800a = -1L;
            this.f801b = -1L;
            return;
        }
        if (sin4 <= -1.0d) {
            this.f802c = 0;
            this.f800a = -1L;
            this.f801b = -1L;
            return;
        }
        double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
        Double.isNaN(acos);
        this.f800a = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
        Double.isNaN(acos);
        this.f801b = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
        if (this.f801b >= j || this.f800a <= j) {
            this.f802c = 1;
        } else {
            this.f802c = 0;
        }
    }
}
