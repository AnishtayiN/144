package p000a.p006b.p010c.p014c;

import android.graphics.Path;
import android.util.Log;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p025d.p027b.C0175j;

/* renamed from: a.b.c.c.b */
/* loaded from: classes.dex */
public class C0078b {

    /* renamed from: a */
    public char f450a;

    /* renamed from: b */
    public float[] f451b;

    public C0078b(char c2, float[] fArr) {
        this.f450a = c2;
        this.f451b = fArr;
    }

    public C0078b(C0078b c0078b) {
        this.f450a = c0078b.f450a;
        float[] fArr = c0078b.f451b;
        this.f451b = C0027d.m86a(fArr, 0, fArr.length);
    }

    /* renamed from: a */
    public static void m335a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        Double.isNaN(d3);
        double d4 = f2;
        Double.isNaN(d4);
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = f5;
        Double.isNaN(d7);
        double d8 = d5 / d7;
        double d9 = -f;
        Double.isNaN(d9);
        Double.isNaN(d4);
        double d10 = (d4 * cos) + (d9 * sin);
        double d11 = f6;
        Double.isNaN(d11);
        double d12 = d10 / d11;
        double d13 = d4;
        double d14 = f3;
        Double.isNaN(d14);
        double d15 = f4;
        Double.isNaN(d15);
        Double.isNaN(d7);
        double d16 = ((d15 * sin) + (d14 * cos)) / d7;
        double d17 = -f3;
        Double.isNaN(d17);
        Double.isNaN(d15);
        Double.isNaN(d11);
        double d18 = ((d15 * cos) + (d17 * sin)) / d11;
        double d19 = d8 - d16;
        double d20 = d12 - d18;
        double d21 = (d8 + d16) / 2.0d;
        double d22 = (d12 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float sqrt = (float) (Math.sqrt(d23) / 1.99999d);
            m335a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d24);
        double d25 = d19 * sqrt2;
        double d26 = sqrt2 * d20;
        if (z == z2) {
            d = d21 - d26;
            d2 = d22 + d25;
        } else {
            d = d21 + d26;
            d2 = d22 - d25;
        }
        double atan2 = Math.atan2(d12 - d2, d8 - d);
        double atan22 = Math.atan2(d18 - d2, d16 - d) - atan2;
        int i = 0;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        Double.isNaN(d7);
        double d27 = d * d7;
        Double.isNaN(d11);
        double d28 = d2 * d11;
        double d29 = (d27 * cos) - (d28 * sin);
        double d30 = (d28 * cos) + (d27 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        Double.isNaN(d7);
        double d31 = -d7;
        double d32 = d31 * cos2;
        Double.isNaN(d11);
        double d33 = d11 * sin2;
        double d34 = (d32 * sin3) - (d33 * cos3);
        double d35 = d31 * sin2;
        Double.isNaN(d11);
        double d36 = d11 * cos2;
        double d37 = (cos3 * d36) + (sin3 * d35);
        double d38 = ceil;
        Double.isNaN(d38);
        Double.isNaN(d38);
        double d39 = atan22 / d38;
        double d40 = atan2;
        while (i < ceil) {
            double d41 = d40 + d39;
            double sin4 = Math.sin(d41);
            double cos4 = Math.cos(d41);
            Double.isNaN(d7);
            double d42 = d39;
            double d43 = (((d7 * cos2) * cos4) + d29) - (d33 * sin4);
            Double.isNaN(d7);
            double d44 = d29;
            double d45 = (d36 * sin4) + (d7 * sin2 * cos4) + d30;
            double d46 = (d32 * sin4) - (d33 * cos4);
            double d47 = (cos4 * d36) + (sin4 * d35);
            double d48 = d41 - d40;
            double tan = Math.tan(d48 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d48)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d34 * sqrt3) + d6), (float) ((d37 * sqrt3) + d13), (float) (d43 - (sqrt3 * d46)), (float) (d45 - (sqrt3 * d47)), (float) d43, (float) d45);
            i++;
            d36 = d36;
            d35 = d35;
            ceil = ceil;
            cos2 = cos2;
            d40 = d41;
            d7 = d7;
            d37 = d47;
            d34 = d46;
            d6 = d43;
            d13 = d45;
            d39 = d42;
            d29 = d44;
        }
    }

    /* renamed from: a */
    public static void m336a(C0078b[] c0078bArr, Path path) {
        int i;
        int i2;
        float[] fArr;
        char c2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        C0078b[] c0078bArr2 = c0078bArr;
        float[] fArr2 = new float[6];
        char c3 = 'm';
        char c4 = 0;
        char c5 = 'm';
        int i4 = 0;
        while (i4 < c0078bArr2.length) {
            char c6 = c0078bArr2[i4].f450a;
            float[] fArr3 = c0078bArr2[i4].f451b;
            float f17 = fArr2[c4];
            float f18 = fArr2[1];
            float f19 = fArr2[2];
            float f20 = fArr2[3];
            float f21 = fArr2[4];
            float f22 = fArr2[5];
            switch (c6) {
                case C0175j.AppCompatTheme_dropdownListPreferredItemHeight /* 65 */:
                case C0175j.AppCompatTheme_textAppearanceListItem /* 97 */:
                    i = 7;
                    break;
                case C0175j.AppCompatTheme_editTextColor /* 67 */:
                case C0175j.AppCompatTheme_textAppearanceListItemSmall /* 99 */:
                    i = 6;
                    break;
                case C0175j.AppCompatTheme_listDividerAlertDialog /* 72 */:
                case C0175j.AppCompatTheme_ratingBarStyle /* 86 */:
                case C0175j.AppCompatTheme_textColorAlertDialogListItem /* 104 */:
                case C0175j.AppCompatTheme_windowMinWidthMajor /* 118 */:
                    i = 1;
                    break;
                case C0175j.AppCompatTheme_panelMenuListTheme /* 81 */:
                case C0175j.AppCompatTheme_popupMenuStyle /* 83 */:
                case C0175j.AppCompatTheme_windowActionModeOverlay /* 113 */:
                case C0175j.AppCompatTheme_windowFixedHeightMinor /* 115 */:
                    i = 4;
                    break;
                case C0175j.AppCompatTheme_seekBarStyle /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f21, f22);
                    f17 = f21;
                    f19 = f17;
                    f18 = f22;
                    f20 = f18;
                default:
                    i = 2;
                    break;
            }
            float f23 = f21;
            float f24 = f22;
            int i5 = 0;
            float f25 = f18;
            float f26 = f17;
            char c7 = c5;
            float f27 = f20;
            float f28 = f26;
            while (i5 < fArr3.length) {
                if (c6 != 'A') {
                    if (c6 == 'C') {
                        i2 = i5;
                        fArr = fArr3;
                        c2 = c6;
                        i3 = i4;
                        int i6 = i2 + 2;
                        int i7 = i2 + 3;
                        int i8 = i2 + 4;
                        int i9 = i2 + 5;
                        path.cubicTo(fArr[i2 + 0], fArr[i2 + 1], fArr[i6], fArr[i7], fArr[i8], fArr[i9]);
                        f28 = fArr[i8];
                        f25 = fArr[i9];
                        float f29 = fArr[i6];
                        f27 = fArr[i7];
                        f19 = f29;
                    } else if (c6 == 'H') {
                        i2 = i5;
                        fArr = fArr3;
                        c2 = c6;
                        i3 = i4;
                        int i10 = i2 + 0;
                        path.lineTo(fArr[i10], f25);
                        f28 = fArr[i10];
                    } else if (c6 == 'Q') {
                        i2 = i5;
                        fArr = fArr3;
                        c2 = c6;
                        i3 = i4;
                        int i11 = i2 + 0;
                        int i12 = i2 + 1;
                        int i13 = i2 + 2;
                        int i14 = i2 + 3;
                        path.quadTo(fArr[i11], fArr[i12], fArr[i13], fArr[i14]);
                        float f30 = fArr[i11];
                        f27 = fArr[i12];
                        float f31 = fArr[i13];
                        f25 = fArr[i14];
                        f19 = f30;
                        f28 = f31;
                    } else if (c6 == 'V') {
                        i2 = i5;
                        fArr = fArr3;
                        c2 = c6;
                        i3 = i4;
                        int i15 = i2 + 0;
                        path.lineTo(f28, fArr[i15]);
                        f25 = fArr[i15];
                    } else if (c6 != 'a') {
                        if (c6 != 'c') {
                            if (c6 == 'h') {
                                i2 = i5;
                                int i16 = i2 + 0;
                                path.rLineTo(fArr3[i16], 0.0f);
                                f28 += fArr3[i16];
                            } else if (c6 != 'q') {
                                if (c6 == 'v') {
                                    f8 = f28;
                                    f9 = f25;
                                    i2 = i5;
                                    int i17 = i2 + 0;
                                    path.rLineTo(0.0f, fArr3[i17]);
                                    f10 = fArr3[i17];
                                } else if (c6 != 'L') {
                                    if (c6 == 'M') {
                                        i2 = i5;
                                        int i18 = i2 + 0;
                                        float f32 = fArr3[i18];
                                        int i19 = i2 + 1;
                                        f6 = fArr3[i19];
                                        if (i2 > 0) {
                                            path.lineTo(fArr3[i18], fArr3[i19]);
                                            f28 = f32;
                                            f25 = f6;
                                        } else {
                                            path.moveTo(fArr3[i18], fArr3[i19]);
                                            f23 = f32;
                                            f24 = f6;
                                        }
                                    } else if (c6 == 'S') {
                                        float f33 = f28;
                                        float f34 = f25;
                                        i2 = i5;
                                        if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                            f11 = (f33 * 2.0f) - f19;
                                            f12 = (f34 * 2.0f) - f27;
                                        } else {
                                            f12 = f34;
                                            f11 = f33;
                                        }
                                        int i20 = i2 + 0;
                                        int i21 = i2 + 1;
                                        int i22 = i2 + 2;
                                        int i23 = i2 + 3;
                                        path.cubicTo(f11, f12, fArr3[i20], fArr3[i21], fArr3[i22], fArr3[i23]);
                                        float f35 = fArr3[i20];
                                        f27 = fArr3[i21];
                                        f7 = fArr3[i22];
                                        f6 = fArr3[i23];
                                        f19 = f35;
                                        f28 = f7;
                                        f25 = f6;
                                    } else if (c6 == 'T') {
                                        float f36 = f28;
                                        float f37 = f25;
                                        i2 = i5;
                                        if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                            f36 = (f36 * 2.0f) - f19;
                                            f37 = (f37 * 2.0f) - f27;
                                        }
                                        int i24 = i2 + 0;
                                        int i25 = i2 + 1;
                                        path.quadTo(f36, f37, fArr3[i24], fArr3[i25]);
                                        f28 = fArr3[i24];
                                        f25 = fArr3[i25];
                                        f27 = f37;
                                        fArr = fArr3;
                                        c2 = c6;
                                        i3 = i4;
                                        f19 = f36;
                                    } else if (c6 == 'l') {
                                        f9 = f25;
                                        i2 = i5;
                                        int i26 = i2 + 0;
                                        int i27 = i2 + 1;
                                        path.rLineTo(fArr3[i26], fArr3[i27]);
                                        float f38 = f28 + fArr3[i26];
                                        f10 = fArr3[i27];
                                        f8 = f38;
                                    } else if (c6 == c3) {
                                        i2 = i5;
                                        int i28 = i2 + 0;
                                        f28 += fArr3[i28];
                                        int i29 = i2 + 1;
                                        f25 += fArr3[i29];
                                        if (i2 > 0) {
                                            path.rLineTo(fArr3[i28], fArr3[i29]);
                                        } else {
                                            path.rMoveTo(fArr3[i28], fArr3[i29]);
                                            f23 = f28;
                                            f24 = f25;
                                        }
                                    } else if (c6 != 's') {
                                        if (c6 == 't') {
                                            if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                f15 = f28 - f19;
                                                f16 = f25 - f27;
                                            } else {
                                                f16 = 0.0f;
                                                f15 = 0.0f;
                                            }
                                            int i30 = i5 + 0;
                                            int i31 = i5 + 1;
                                            path.rQuadTo(f15, f16, fArr3[i30], fArr3[i31]);
                                            float f39 = f15 + f28;
                                            f27 = f16 + f25;
                                            f28 += fArr3[i30];
                                            f25 += fArr3[i31];
                                            f19 = f39;
                                        }
                                        i2 = i5;
                                    } else {
                                        if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                            f13 = f28 - f19;
                                            f14 = f25 - f27;
                                        } else {
                                            f13 = 0.0f;
                                            f14 = 0.0f;
                                        }
                                        int i32 = i5 + 0;
                                        int i33 = i5 + 1;
                                        int i34 = i5 + 2;
                                        int i35 = i5 + 3;
                                        float f40 = f28;
                                        f = f25;
                                        i2 = i5;
                                        path.rCubicTo(f13, f14, fArr3[i32], fArr3[i33], fArr3[i34], fArr3[i35]);
                                        f2 = fArr3[i32] + f40;
                                        f3 = fArr3[i33] + f;
                                        f4 = f40 + fArr3[i34];
                                        f5 = fArr3[i35];
                                    }
                                    f28 = f23;
                                    f25 = f24;
                                } else {
                                    i2 = i5;
                                    int i36 = i2 + 0;
                                    int i37 = i2 + 1;
                                    path.lineTo(fArr3[i36], fArr3[i37]);
                                    f28 = fArr3[i36];
                                    f25 = fArr3[i37];
                                }
                                f25 = f9 + f10;
                                f28 = f8;
                            } else {
                                float f41 = f28;
                                f = f25;
                                i2 = i5;
                                int i38 = i2 + 0;
                                int i39 = i2 + 1;
                                int i40 = i2 + 2;
                                int i41 = i2 + 3;
                                path.rQuadTo(fArr3[i38], fArr3[i39], fArr3[i40], fArr3[i41]);
                                f2 = fArr3[i38] + f41;
                                f3 = fArr3[i39] + f;
                                f4 = f41 + fArr3[i40];
                                f5 = fArr3[i41];
                            }
                            fArr = fArr3;
                            c2 = c6;
                            i3 = i4;
                        } else {
                            float f42 = f28;
                            f = f25;
                            i2 = i5;
                            int i42 = i2 + 2;
                            int i43 = i2 + 3;
                            int i44 = i2 + 4;
                            int i45 = i2 + 5;
                            path.rCubicTo(fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i42], fArr3[i43], fArr3[i44], fArr3[i45]);
                            f2 = fArr3[i42] + f42;
                            f3 = fArr3[i43] + f;
                            f4 = f42 + fArr3[i44];
                            f5 = fArr3[i45];
                        }
                        f6 = f5 + f;
                        f19 = f2;
                        f27 = f3;
                        f7 = f4;
                        f28 = f7;
                        f25 = f6;
                        fArr = fArr3;
                        c2 = c6;
                        i3 = i4;
                    } else {
                        float f43 = f28;
                        float f44 = f25;
                        i2 = i5;
                        int i46 = i2 + 5;
                        int i47 = i2 + 6;
                        fArr = fArr3;
                        c2 = c6;
                        i3 = i4;
                        m335a(path, f43, f44, fArr3[i46] + f43, fArr3[i47] + f44, fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                        f28 = f43 + fArr[i46];
                        f25 = f44 + fArr[i47];
                    }
                    i5 = i2 + i;
                    c3 = 'm';
                    c7 = c2;
                    c6 = c7;
                    fArr3 = fArr;
                    i4 = i3;
                } else {
                    i2 = i5;
                    fArr = fArr3;
                    c2 = c6;
                    i3 = i4;
                    int i48 = i2 + 5;
                    int i49 = i2 + 6;
                    m335a(path, f28, f25, fArr[i48], fArr[i49], fArr[i2 + 0], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                    f28 = fArr[i48];
                    f25 = fArr[i49];
                }
                f19 = f28;
                f27 = f25;
                i5 = i2 + i;
                c3 = 'm';
                c7 = c2;
                c6 = c7;
                fArr3 = fArr;
                i4 = i3;
            }
            int i50 = i4;
            fArr2[0] = f28;
            fArr2[1] = f25;
            fArr2[2] = f19;
            fArr2[3] = f27;
            fArr2[4] = f23;
            fArr2[5] = f24;
            c5 = c0078bArr[i50].f450a;
            i4 = i50 + 1;
            c3 = 'm';
            c4 = 0;
            c0078bArr2 = c0078bArr;
        }
    }

    /* renamed from: a */
    public void m337a(C0078b c0078b, C0078b c0078b2, float f) {
        int i = 0;
        while (true) {
            float[] fArr = c0078b.f451b;
            if (i >= fArr.length) {
                return;
            }
            this.f451b[i] = (c0078b2.f451b[i] * f) + ((1.0f - f) * fArr[i]);
            i++;
        }
    }
}
