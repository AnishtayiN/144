package p000a.p006b.p010c.p021h.p023v;

import android.view.animation.Interpolator;

/* renamed from: a.b.c.h.v.d */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0131d implements Interpolator {

    /* renamed from: a */
    public final float[] f629a;

    /* renamed from: b */
    public final float f630b;

    public AbstractInterpolatorC0131d(float[] fArr) {
        this.f629a = fArr;
        this.f630b = 1.0f / (this.f629a.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f629a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f630b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f629a;
        return ((fArr2[min + 1] - fArr2[min]) * f3) + fArr2[min];
    }
}
