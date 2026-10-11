package p000a.p006b.p008b.p009a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.b.a.g */
/* loaded from: classes.dex */
public class InterpolatorC0030g implements Interpolator {

    /* renamed from: a */
    public float[] f84a;

    /* renamed from: b */
    public float[] f85b;

    public InterpolatorC0030g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m48a = C0027d.m48a(context.getResources(), context.getTheme(), attributeSet, C0024a.f50l);
        if (C0027d.m84a(xmlPullParser, "pathData")) {
            String m58a = C0027d.m58a(m48a, xmlPullParser, "pathData", 4);
            Path m90b = C0027d.m90b(m58a);
            if (m90b == null) {
                throw new InflateException("The path is null, which is created from " + m58a);
            }
            m101a(m90b);
        } else {
            if (!C0027d.m84a(xmlPullParser, "controlX1")) {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }
            if (!C0027d.m84a(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float m32a = C0027d.m32a(m48a, xmlPullParser, "controlX1", 0, 0.0f);
            float m32a2 = C0027d.m32a(m48a, xmlPullParser, "controlY1", 1, 0.0f);
            boolean m84a = C0027d.m84a(xmlPullParser, "controlX2");
            if (m84a != C0027d.m84a(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (m84a) {
                float m32a3 = C0027d.m32a(m48a, xmlPullParser, "controlX2", 2, 0.0f);
                float m32a4 = C0027d.m32a(m48a, xmlPullParser, "controlY2", 3, 0.0f);
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(m32a, m32a2, m32a3, m32a4, 1.0f, 1.0f);
                m101a(path);
            } else {
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.quadTo(m32a, m32a2, 1.0f, 1.0f);
                m101a(path2);
            }
        }
        m48a.recycle();
    }

    /* renamed from: a */
    public final void m101a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f84a = new float[min];
        this.f85b = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f84a[i2] = fArr[0];
            this.f85b[i2] = fArr[1];
        }
        if (Math.abs(this.f84a[0]) <= 1.0E-5d && Math.abs(this.f85b[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f84a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f85b[i3] - 1.0f) <= 1.0E-5d) {
                int i4 = 0;
                float f = 0.0f;
                while (i < min) {
                    float[] fArr2 = this.f84a;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder m1134a = C0335a.m1134a("The Path must start at (0,0) and end at (1,1) start: ");
        m1134a.append(this.f84a[0]);
        m1134a.append(",");
        m1134a.append(this.f85b[0]);
        m1134a.append(" end:");
        int i6 = min - 1;
        m1134a.append(this.f84a[i6]);
        m1134a.append(",");
        m1134a.append(this.f85b[i6]);
        throw new IllegalArgumentException(m1134a.toString());
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f84a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f84a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f84a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f85b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f85b;
        float f4 = fArr2[i];
        return ((fArr2[length] - f4) * f3) + f4;
    }
}
