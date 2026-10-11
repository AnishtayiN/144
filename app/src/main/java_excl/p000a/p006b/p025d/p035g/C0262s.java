package p000a.p006b.p025d.p035g;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: a.b.d.g.s */
/* loaded from: classes.dex */
public class C0262s extends RatingBar {

    /* renamed from: b */
    public final C0258q f1428b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0262s(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = p000a.p006b.p025d.p027b.C0166a.ratingBarStyle
            r1.<init>(r2, r3, r0)
            a.b.d.g.q r2 = new a.b.d.g.q
            r2.<init>(r1)
            r1.f1428b = r2
            a.b.d.g.q r2 = r1.f1428b
            r2.mo894a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0262s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f1428b.f1418b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
