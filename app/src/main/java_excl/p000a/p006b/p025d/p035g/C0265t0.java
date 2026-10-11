package p000a.p006b.p025d.p035g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p000a.p006b.p025d.p028c.C0177b;
import p000a.p006b.p025d.p028c.C0178c;

/* renamed from: a.b.d.g.t0 */
/* loaded from: classes.dex */
public class C0265t0 extends Drawable {

    /* renamed from: q */
    public static final double f1441q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    public static a f1442r;

    /* renamed from: a */
    public final int f1443a;

    /* renamed from: c */
    public Paint f1445c;

    /* renamed from: d */
    public Paint f1446d;

    /* renamed from: e */
    public final RectF f1447e;

    /* renamed from: f */
    public float f1448f;

    /* renamed from: g */
    public Path f1449g;

    /* renamed from: h */
    public float f1450h;

    /* renamed from: i */
    public float f1451i;

    /* renamed from: j */
    public float f1452j;

    /* renamed from: k */
    public ColorStateList f1453k;

    /* renamed from: m */
    public final int f1455m;

    /* renamed from: n */
    public final int f1456n;

    /* renamed from: l */
    public boolean f1454l = true;

    /* renamed from: o */
    public boolean f1457o = true;

    /* renamed from: p */
    public boolean f1458p = false;

    /* renamed from: b */
    public Paint f1444b = new Paint(5);

    /* renamed from: a.b.d.g.t0$a */
    public interface a {
        /* renamed from: a */
        void mo747a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public C0265t0(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1455m = resources.getColor(C0177b.cardview_shadow_start_color);
        this.f1456n = resources.getColor(C0177b.cardview_shadow_end_color);
        this.f1443a = resources.getDimensionPixelSize(C0178c.cardview_compat_inset_shadow);
        m903a(colorStateList);
        this.f1445c = new Paint(5);
        this.f1445c.setStyle(Paint.Style.FILL);
        this.f1448f = (int) (f + 0.5f);
        this.f1447e = new RectF();
        this.f1446d = new Paint(this.f1445c);
        this.f1446d.setAntiAlias(false);
        m902a(f2, f3);
    }

    /* renamed from: a */
    public static float m899a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        double d = f;
        double d2 = 1.0d - f1441q;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) ((d2 * d3) + d);
    }

    /* renamed from: b */
    public static float m900b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        double d = f * 1.5f;
        double d2 = 1.0d - f1441q;
        double d3 = f2;
        Double.isNaN(d3);
        Double.isNaN(d);
        return (float) ((d2 * d3) + d);
    }

    /* renamed from: a */
    public void m901a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (this.f1448f == f2) {
            return;
        }
        this.f1448f = f2;
        this.f1454l = true;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m902a(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            i--;
        }
        float f3 = i;
        int i2 = (int) (f2 + 0.5f);
        if (i2 % 2 == 1) {
            i2--;
        }
        float f4 = i2;
        if (f3 > f4) {
            if (!this.f1458p) {
                this.f1458p = true;
            }
            f3 = f4;
        }
        if (this.f1452j == f3 && this.f1450h == f4) {
            return;
        }
        this.f1452j = f3;
        this.f1450h = f4;
        this.f1451i = (int) ((f3 * 1.5f) + this.f1443a + 0.5f);
        this.f1454l = true;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void m903a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1453k = colorStateList;
        this.f1444b.setColor(this.f1453k.getColorForState(getState(), this.f1453k.getDefaultColor()));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        if (this.f1454l) {
            Rect bounds = getBounds();
            float f = this.f1450h;
            float f2 = 1.5f * f;
            this.f1447e.set(bounds.left + f, bounds.top + f2, bounds.right - f, bounds.bottom - f2);
            float f3 = this.f1448f;
            float f4 = -f3;
            RectF rectF = new RectF(f4, f4, f3, f3);
            RectF rectF2 = new RectF(rectF);
            float f5 = -this.f1451i;
            rectF2.inset(f5, f5);
            Path path = this.f1449g;
            if (path == null) {
                this.f1449g = new Path();
            } else {
                path.reset();
            }
            this.f1449g.setFillType(Path.FillType.EVEN_ODD);
            this.f1449g.moveTo(-this.f1448f, 0.0f);
            this.f1449g.rLineTo(-this.f1451i, 0.0f);
            this.f1449g.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f1449g.arcTo(rectF, 270.0f, -90.0f, false);
            this.f1449g.close();
            float f6 = this.f1448f;
            float f7 = f6 + this.f1451i;
            Paint paint = this.f1445c;
            int i2 = this.f1455m;
            paint.setShader(new RadialGradient(0.0f, 0.0f, f7, new int[]{i2, i2, this.f1456n}, new float[]{0.0f, f6 / f7, 1.0f}, Shader.TileMode.CLAMP));
            Paint paint2 = this.f1446d;
            float f8 = -this.f1448f;
            float f9 = this.f1451i;
            float f10 = f8 + f9;
            float f11 = f8 - f9;
            int i3 = this.f1455m;
            paint2.setShader(new LinearGradient(0.0f, f10, 0.0f, f11, new int[]{i3, i3, this.f1456n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            this.f1446d.setAntiAlias(false);
            this.f1454l = false;
        }
        canvas.translate(0.0f, this.f1452j / 2.0f);
        float f12 = this.f1448f;
        float f13 = (-f12) - this.f1451i;
        float f14 = (this.f1452j / 2.0f) + f12 + this.f1443a;
        float f15 = f14 * 2.0f;
        boolean z = this.f1447e.width() - f15 > 0.0f;
        boolean z2 = this.f1447e.height() - f15 > 0.0f;
        int save = canvas.save();
        RectF rectF3 = this.f1447e;
        canvas.translate(rectF3.left + f14, rectF3.top + f14);
        canvas.drawPath(this.f1449g, this.f1445c);
        if (z) {
            i = save;
            canvas.drawRect(0.0f, f13, this.f1447e.width() - f15, -this.f1448f, this.f1446d);
        } else {
            i = save;
        }
        canvas.restoreToCount(i);
        int save2 = canvas.save();
        RectF rectF4 = this.f1447e;
        canvas.translate(rectF4.right - f14, rectF4.bottom - f14);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1449g, this.f1445c);
        if (z) {
            canvas.drawRect(0.0f, f13, this.f1447e.width() - f15, (-this.f1448f) + this.f1451i, this.f1446d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF5 = this.f1447e;
        canvas.translate(rectF5.left + f14, rectF5.bottom - f14);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1449g, this.f1445c);
        if (z2) {
            canvas.drawRect(0.0f, f13, this.f1447e.height() - f15, -this.f1448f, this.f1446d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF6 = this.f1447e;
        canvas.translate(rectF6.right - f14, rectF6.top + f14);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1449g, this.f1445c);
        if (z2) {
            canvas.drawRect(0.0f, f13, this.f1447e.height() - f15, -this.f1448f, this.f1446d);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, (-this.f1452j) / 2.0f);
        f1442r.mo747a(canvas, this.f1447e, this.f1448f, this.f1444b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(m900b(this.f1450h, this.f1448f, this.f1457o));
        int ceil2 = (int) Math.ceil(m899a(this.f1450h, this.f1448f, this.f1457o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1453k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1454l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1453k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1444b.getColor() == colorForState) {
            return false;
        }
        this.f1444b.setColor(colorForState);
        this.f1454l = true;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f1444b.setAlpha(i);
        this.f1445c.setAlpha(i);
        this.f1446d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1444b.setColorFilter(colorFilter);
    }
}
