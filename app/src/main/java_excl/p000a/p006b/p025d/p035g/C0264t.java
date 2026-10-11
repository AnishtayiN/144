package p000a.p006b.p025d.p035g;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

/* renamed from: a.b.d.g.t */
/* loaded from: classes.dex */
public class C0264t extends SeekBar {

    /* renamed from: b */
    public final C0266u f1440b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0264t(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = p000a.p006b.p025d.p027b.C0166a.seekBarStyle
            r1.<init>(r2, r3, r0)
            a.b.d.g.u r2 = new a.b.d.g.u
            r2.<init>(r1)
            r1.f1440b = r2
            a.b.d.g.u r2 = r1.f1440b
            r2.mo894a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0264t.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0266u c0266u = this.f1440b;
        Drawable drawable = c0266u.f1460e;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0266u.f1459d.getDrawableState())) {
            c0266u.f1459d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1440b.f1460e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1440b.m905a(canvas);
    }
}
