package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000a.p006b.p025d.p028c.C0176a;
import p000a.p006b.p025d.p028c.C0177b;
import p000a.p006b.p025d.p028c.C0179d;
import p000a.p006b.p025d.p028c.C0180e;
import p000a.p006b.p025d.p035g.C0217a0;
import p000a.p006b.p025d.p035g.C0220b0;
import p000a.p006b.p025d.p035g.C0223c0;
import p000a.p006b.p025d.p035g.InterfaceC0226d0;
import p000a.p006b.p025d.p035g.InterfaceC0229e0;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: i */
    public static final int[] f1844i = {R.attr.colorBackground};

    /* renamed from: j */
    public static final InterfaceC0229e0 f1845j;

    /* renamed from: b */
    public boolean f1846b;

    /* renamed from: c */
    public boolean f1847c;

    /* renamed from: d */
    public int f1848d;

    /* renamed from: e */
    public int f1849e;

    /* renamed from: f */
    public final Rect f1850f;

    /* renamed from: g */
    public final Rect f1851g;

    /* renamed from: h */
    public final InterfaceC0226d0 f1852h;

    /* renamed from: android.support.v7.widget.CardView$a */
    public class C0304a implements InterfaceC0226d0 {

        /* renamed from: a */
        public Drawable f1853a;

        public C0304a() {
        }

        /* renamed from: a */
        public void m1056a(int i, int i2, int i3, int i4) {
            CardView.this.f1851g.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1850f;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: a */
        public boolean m1057a() {
            return CardView.this.getPreventCornerOverlap();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f1845j = new C0220b0();
        } else if (i >= 17) {
            f1845j = new C0217a0();
        } else {
            f1845j = new C0223c0();
        }
        f1845j.mo746a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0176a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        this.f1850f = new Rect();
        this.f1851g = new Rect();
        this.f1852h = new C0304a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0180e.CardView, i, C0179d.CardView);
        if (obtainStyledAttributes.hasValue(C0180e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C0180e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1844i);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(C0177b.cardview_light_background) : getResources().getColor(C0177b.cardview_dark_background));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C0180e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C0180e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C0180e.CardView_cardMaxElevation, 0.0f);
        this.f1846b = obtainStyledAttributes.getBoolean(C0180e.CardView_cardUseCompatPadding, false);
        this.f1847c = obtainStyledAttributes.getBoolean(C0180e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0180e.CardView_contentPadding, 0);
        this.f1850f.left = obtainStyledAttributes.getDimensionPixelSize(C0180e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1850f.top = obtainStyledAttributes.getDimensionPixelSize(C0180e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1850f.right = obtainStyledAttributes.getDimensionPixelSize(C0180e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1850f.bottom = obtainStyledAttributes.getDimensionPixelSize(C0180e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1848d = obtainStyledAttributes.getDimensionPixelSize(C0180e.CardView_android_minWidth, 0);
        this.f1849e = obtainStyledAttributes.getDimensionPixelSize(C0180e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1845j.mo751a(this.f1852h, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1845j.mo761h(this.f1852h);
    }

    public float getCardElevation() {
        return f1845j.mo758e(this.f1852h);
    }

    public int getContentPaddingBottom() {
        return this.f1850f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1850f.left;
    }

    public int getContentPaddingRight() {
        return this.f1850f.right;
    }

    public int getContentPaddingTop() {
        return this.f1850f.top;
    }

    public float getMaxCardElevation() {
        return f1845j.mo760g(this.f1852h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1847c;
    }

    public float getRadius() {
        return f1845j.mo759f(this.f1852h);
    }

    public boolean getUseCompatPadding() {
        return this.f1846b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (f1845j instanceof C0220b0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f1845j.mo753b(this.f1852h)), View.MeasureSpec.getSize(i)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f1845j.mo749a(this.f1852h)), View.MeasureSpec.getSize(i2)), mode2);
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1845j.mo752a(this.f1852h, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1845j.mo752a(this.f1852h, colorStateList);
    }

    public void setCardElevation(float f) {
        f1845j.mo754b(this.f1852h, f);
    }

    public void setMaxCardElevation(float f) {
        f1845j.mo756c(this.f1852h, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f1849e = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f1848d = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1847c) {
            this.f1847c = z;
            f1845j.mo757d(this.f1852h);
        }
    }

    public void setRadius(float f) {
        f1845j.mo750a(this.f1852h, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1846b != z) {
            this.f1846b = z;
            f1845j.mo755c(this.f1852h);
        }
    }
}
