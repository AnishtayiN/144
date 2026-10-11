package p000a.p006b.p025d.p035g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.SeekBar;
import java.lang.reflect.Method;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0175j;

/* renamed from: a.b.d.g.u */
/* loaded from: classes.dex */
public class C0266u extends C0258q {

    /* renamed from: d */
    public final SeekBar f1459d;

    /* renamed from: e */
    public Drawable f1460e;

    /* renamed from: f */
    public ColorStateList f1461f;

    /* renamed from: g */
    public PorterDuff.Mode f1462g;

    /* renamed from: h */
    public boolean f1463h;

    /* renamed from: i */
    public boolean f1464i;

    public C0266u(SeekBar seekBar) {
        super(seekBar);
        this.f1461f = null;
        this.f1462g = null;
        this.f1463h = false;
        this.f1464i = false;
        this.f1459d = seekBar;
    }

    /* renamed from: a */
    public final void m904a() {
        if (this.f1460e != null) {
            if (this.f1463h || this.f1464i) {
                this.f1460e = C0027d.m91b(this.f1460e.mutate());
                if (this.f1463h) {
                    C0027d.m65a(this.f1460e, this.f1461f);
                }
                if (this.f1464i) {
                    C0027d.m66a(this.f1460e, this.f1462g);
                }
                if (this.f1460e.isStateful()) {
                    this.f1460e.setState(this.f1459d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: a */
    public void m905a(Canvas canvas) {
        if (this.f1460e != null) {
            int max = this.f1459d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1460e.getIntrinsicWidth();
                int intrinsicHeight = this.f1460e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1460e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1459d.getWidth() - this.f1459d.getPaddingLeft()) - this.f1459d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1459d.getPaddingLeft(), this.f1459d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1460e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // p000a.p006b.p025d.p035g.C0258q
    /* renamed from: a */
    public void mo894a(AttributeSet attributeSet, int i) {
        super.mo894a(attributeSet, i);
        C0224c1 m775a = C0224c1.m775a(this.f1459d.getContext(), attributeSet, C0175j.AppCompatSeekBar, i, 0);
        Drawable m783c = m775a.m783c(C0175j.AppCompatSeekBar_android_thumb);
        if (m783c != null) {
            this.f1459d.setThumb(m783c);
        }
        Drawable m781b = m775a.m781b(C0175j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f1460e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1460e = m781b;
        if (m781b != null) {
            m781b.setCallback(this.f1459d);
            int m468c = C0119n.m468c(this.f1459d);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                m781b.setLayoutDirection(m468c);
            } else if (i2 >= 17) {
                if (!C0027d.f63b) {
                    try {
                        C0027d.f62a = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                        C0027d.f62a.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                    }
                    C0027d.f63b = true;
                }
                Method method = C0027d.f62a;
                if (method != null) {
                    try {
                        method.invoke(m781b, Integer.valueOf(m468c));
                    } catch (Exception e2) {
                        Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                        C0027d.f62a = null;
                    }
                }
            }
            if (m781b.isStateful()) {
                m781b.setState(this.f1459d.getDrawableState());
            }
            m904a();
        }
        this.f1459d.invalidate();
        if (m775a.m787e(C0175j.AppCompatSeekBar_tickMarkTintMode)) {
            this.f1462g = C0238h0.m826a(m775a.m784d(C0175j.AppCompatSeekBar_tickMarkTintMode, -1), this.f1462g);
            this.f1464i = true;
        }
        if (m775a.m787e(C0175j.AppCompatSeekBar_tickMarkTint)) {
            this.f1461f = m775a.m777a(C0175j.AppCompatSeekBar_tickMarkTint);
            this.f1463h = true;
        }
        m775a.f1236b.recycle();
        m904a();
    }
}
