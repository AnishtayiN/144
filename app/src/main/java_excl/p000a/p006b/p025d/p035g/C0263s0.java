package p000a.p006b.p025d.p035g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: a.b.d.g.s0 */
/* loaded from: classes.dex */
public class C0263s0 extends Drawable {

    /* renamed from: a */
    public float f1429a;

    /* renamed from: c */
    public final RectF f1431c;

    /* renamed from: d */
    public final Rect f1432d;

    /* renamed from: e */
    public float f1433e;

    /* renamed from: h */
    public ColorStateList f1436h;

    /* renamed from: i */
    public PorterDuffColorFilter f1437i;

    /* renamed from: j */
    public ColorStateList f1438j;

    /* renamed from: f */
    public boolean f1434f = false;

    /* renamed from: g */
    public boolean f1435g = true;

    /* renamed from: k */
    public PorterDuff.Mode f1439k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f1430b = new Paint(5);

    public C0263s0(ColorStateList colorStateList, float f) {
        this.f1429a = f;
        m897a(colorStateList);
        this.f1431c = new RectF();
        this.f1432d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m896a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    public final void m897a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1436h = colorStateList;
        this.f1430b.setColor(this.f1436h.getColorForState(getState(), this.f1436h.getDefaultColor()));
    }

    /* renamed from: a */
    public final void m898a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1431c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1432d.set(rect);
        if (this.f1434f) {
            this.f1432d.inset((int) Math.ceil(C0265t0.m899a(this.f1433e, this.f1429a, this.f1435g)), (int) Math.ceil(C0265t0.m900b(this.f1433e, this.f1429a, this.f1435g)));
            this.f1431c.set(this.f1432d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1430b;
        if (this.f1437i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1437i);
            z = true;
        }
        RectF rectF = this.f1431c;
        float f = this.f1429a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1432d, this.f1429a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1438j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1436h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m898a(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1436h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1430b.getColor();
        if (z) {
            this.f1430b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1438j;
        if (colorStateList2 == null || (mode = this.f1439k) == null) {
            return z;
        }
        this.f1437i = m896a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1430b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1430b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1438j = colorStateList;
        this.f1437i = m896a(this.f1438j, this.f1439k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1439k = mode;
        this.f1437i = m896a(this.f1438j, this.f1439k);
        invalidateSelf();
    }
}
