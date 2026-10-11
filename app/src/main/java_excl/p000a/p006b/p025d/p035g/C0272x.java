package p000a.p006b.p025d.p035g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p012b.p013c.AbstractC0076h;
import p000a.p006b.p010c.p024i.InterfaceC0133b;
import p000a.p006b.p025d.p027b.C0175j;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.d.g.x */
/* loaded from: classes.dex */
public class C0272x {

    /* renamed from: a */
    public final TextView f1532a;

    /* renamed from: b */
    public C0218a1 f1533b;

    /* renamed from: c */
    public C0218a1 f1534c;

    /* renamed from: d */
    public C0218a1 f1535d;

    /* renamed from: e */
    public C0218a1 f1536e;

    /* renamed from: f */
    public C0218a1 f1537f;

    /* renamed from: g */
    public C0218a1 f1538g;

    /* renamed from: h */
    public final C0276z f1539h;

    /* renamed from: i */
    public int f1540i = 0;

    /* renamed from: j */
    public Typeface f1541j;

    /* renamed from: k */
    public boolean f1542k;

    /* renamed from: a.b.d.g.x$a */
    public class a extends AbstractC0076h {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f1543a;

        public a(WeakReference weakReference) {
            this.f1543a = weakReference;
        }

        @Override // p000a.p006b.p010c.p012b.p013c.AbstractC0076h
        /* renamed from: a */
        public void mo328a(int i) {
        }

        @Override // p000a.p006b.p010c.p012b.p013c.AbstractC0076h
        /* renamed from: a */
        public void mo330a(Typeface typeface) {
            C0272x c0272x = C0272x.this;
            WeakReference weakReference = this.f1543a;
            if (c0272x.f1542k) {
                c0272x.f1541j = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, c0272x.f1540i);
                }
            }
        }
    }

    public C0272x(TextView textView) {
        this.f1532a = textView;
        this.f1539h = new C0276z(this.f1532a);
    }

    /* renamed from: a */
    public static C0218a1 m925a(Context context, C0243j c0243j, int i) {
        ColorStateList m855d = c0243j.m855d(context, i);
        if (m855d == null) {
            return null;
        }
        C0218a1 c0218a1 = new C0218a1();
        c0218a1.f1201d = true;
        c0218a1.f1198a = m855d;
        return c0218a1;
    }

    /* renamed from: a */
    public void m926a() {
        if (this.f1533b != null || this.f1534c != null || this.f1535d != null || this.f1536e != null) {
            Drawable[] compoundDrawables = this.f1532a.getCompoundDrawables();
            m931a(compoundDrawables[0], this.f1533b);
            m931a(compoundDrawables[1], this.f1534c);
            m931a(compoundDrawables[2], this.f1535d);
            m931a(compoundDrawables[3], this.f1536e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1537f == null && this.f1538g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1532a.getCompoundDrawablesRelative();
            m931a(compoundDrawablesRelative[0], this.f1537f);
            m931a(compoundDrawablesRelative[2], this.f1538g);
        }
    }

    /* renamed from: a */
    public void m927a(int i) {
        C0276z c0276z = this.f1539h;
        if (c0276z.m952d()) {
            if (i == 0) {
                c0276z.f1557a = 0;
                c0276z.f1560d = -1.0f;
                c0276z.f1561e = -1.0f;
                c0276z.f1559c = -1.0f;
                c0276z.f1562f = new int[0];
                c0276z.f1558b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i);
            }
            DisplayMetrics displayMetrics = c0276z.f1566j.getResources().getDisplayMetrics();
            c0276z.m947a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0276z.m950b()) {
                c0276z.m946a();
            }
        }
    }

    /* renamed from: a */
    public void m928a(int i, int i2, int i3, int i4) {
        C0276z c0276z = this.f1539h;
        if (c0276z.m952d()) {
            DisplayMetrics displayMetrics = c0276z.f1566j.getResources().getDisplayMetrics();
            c0276z.m947a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0276z.m950b()) {
                c0276z.m946a();
            }
        }
    }

    /* renamed from: a */
    public void m929a(Context context, int i) {
        ColorStateList m777a;
        C0224c1 c0224c1 = new C0224c1(context, context.obtainStyledAttributes(i, C0175j.TextAppearance));
        if (c0224c1.m787e(C0175j.TextAppearance_textAllCaps)) {
            this.f1532a.setAllCaps(c0224c1.m779a(C0175j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && c0224c1.m787e(C0175j.TextAppearance_android_textColor) && (m777a = c0224c1.m777a(C0175j.TextAppearance_android_textColor)) != null) {
            this.f1532a.setTextColor(m777a);
        }
        if (c0224c1.m787e(C0175j.TextAppearance_android_textSize) && c0224c1.m782c(C0175j.TextAppearance_android_textSize, -1) == 0) {
            this.f1532a.setTextSize(0, 0.0f);
        }
        m930a(context, c0224c1);
        c0224c1.f1236b.recycle();
        Typeface typeface = this.f1541j;
        if (typeface != null) {
            this.f1532a.setTypeface(typeface, this.f1540i);
        }
    }

    /* renamed from: a */
    public final void m930a(Context context, C0224c1 c0224c1) {
        String string;
        this.f1540i = c0224c1.m784d(C0175j.TextAppearance_android_textStyle, this.f1540i);
        boolean z = true;
        if (c0224c1.m787e(C0175j.TextAppearance_android_fontFamily) || c0224c1.m787e(C0175j.TextAppearance_fontFamily)) {
            this.f1541j = null;
            int i = c0224c1.m787e(C0175j.TextAppearance_fontFamily) ? C0175j.TextAppearance_fontFamily : C0175j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    this.f1541j = c0224c1.m778a(i, this.f1540i, new a(new WeakReference(this.f1532a)));
                    if (this.f1541j != null) {
                        z = false;
                    }
                    this.f1542k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1541j != null || (string = c0224c1.f1236b.getString(i)) == null) {
                return;
            }
            this.f1541j = Typeface.create(string, this.f1540i);
            return;
        }
        if (c0224c1.m787e(C0175j.TextAppearance_android_typeface)) {
            this.f1542k = false;
            int m784d = c0224c1.m784d(C0175j.TextAppearance_android_typeface, 1);
            if (m784d == 1) {
                this.f1541j = Typeface.SANS_SERIF;
            } else if (m784d == 2) {
                this.f1541j = Typeface.SERIF;
            } else {
                if (m784d != 3) {
                    return;
                }
                this.f1541j = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    public final void m931a(Drawable drawable, C0218a1 c0218a1) {
        if (drawable == null || c0218a1 == null) {
            return;
        }
        C0243j.m842a(drawable, c0218a1, this.f1532a.getDrawableState());
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void m932a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        int resourceId;
        Context context = this.f1532a.getContext();
        C0243j m839a = C0243j.m839a();
        C0224c1 m775a = C0224c1.m775a(context, attributeSet, C0175j.AppCompatTextHelper, i, 0);
        int m788f = m775a.m788f(C0175j.AppCompatTextHelper_android_textAppearance, -1);
        if (m775a.m787e(C0175j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1533b = m925a(context, m839a, m775a.m788f(C0175j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (m775a.m787e(C0175j.AppCompatTextHelper_android_drawableTop)) {
            this.f1534c = m925a(context, m839a, m775a.m788f(C0175j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (m775a.m787e(C0175j.AppCompatTextHelper_android_drawableRight)) {
            this.f1535d = m925a(context, m839a, m775a.m788f(C0175j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (m775a.m787e(C0175j.AppCompatTextHelper_android_drawableBottom)) {
            this.f1536e = m925a(context, m839a, m775a.m788f(C0175j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (m775a.m787e(C0175j.AppCompatTextHelper_android_drawableStart)) {
                this.f1537f = m925a(context, m839a, m775a.m788f(C0175j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (m775a.m787e(C0175j.AppCompatTextHelper_android_drawableEnd)) {
                this.f1538g = m925a(context, m839a, m775a.m788f(C0175j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        m775a.f1236b.recycle();
        boolean z3 = this.f1532a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (m788f != -1) {
            C0224c1 c0224c1 = new C0224c1(context, context.obtainStyledAttributes(m788f, C0175j.TextAppearance));
            if (z3 || !c0224c1.m787e(C0175j.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = c0224c1.m779a(C0175j.TextAppearance_textAllCaps, false);
                z = true;
            }
            m930a(context, c0224c1);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList m777a = c0224c1.m787e(C0175j.TextAppearance_android_textColor) ? c0224c1.m777a(C0175j.TextAppearance_android_textColor) : null;
                colorStateList2 = c0224c1.m787e(C0175j.TextAppearance_android_textColorHint) ? c0224c1.m777a(C0175j.TextAppearance_android_textColorHint) : null;
                ColorStateList colorStateList3 = m777a;
                colorStateList = c0224c1.m787e(C0175j.TextAppearance_android_textColorLink) ? c0224c1.m777a(C0175j.TextAppearance_android_textColorLink) : null;
                r9 = colorStateList3;
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            c0224c1.f1236b.recycle();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            z = false;
            z2 = false;
        }
        C0224c1 c0224c12 = new C0224c1(context, context.obtainStyledAttributes(attributeSet, C0175j.TextAppearance, i, 0));
        if (!z3 && c0224c12.m787e(C0175j.TextAppearance_textAllCaps)) {
            z2 = c0224c12.m779a(C0175j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (c0224c12.m787e(C0175j.TextAppearance_android_textColor)) {
                r9 = c0224c12.m777a(C0175j.TextAppearance_android_textColor);
            }
            if (c0224c12.m787e(C0175j.TextAppearance_android_textColorHint)) {
                colorStateList2 = c0224c12.m777a(C0175j.TextAppearance_android_textColorHint);
            }
            if (c0224c12.m787e(C0175j.TextAppearance_android_textColorLink)) {
                colorStateList = c0224c12.m777a(C0175j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && c0224c12.m787e(C0175j.TextAppearance_android_textSize) && c0224c12.m782c(C0175j.TextAppearance_android_textSize, -1) == 0) {
            this.f1532a.setTextSize(0, 0.0f);
        }
        m930a(context, c0224c12);
        c0224c12.f1236b.recycle();
        if (r9 != null) {
            this.f1532a.setTextColor(r9);
        }
        if (colorStateList2 != null) {
            this.f1532a.setHintTextColor(colorStateList2);
        }
        if (colorStateList != null) {
            this.f1532a.setLinkTextColor(colorStateList);
        }
        if (!z3 && z) {
            this.f1532a.setAllCaps(z2);
        }
        Typeface typeface = this.f1541j;
        if (typeface != null) {
            this.f1532a.setTypeface(typeface, this.f1540i);
        }
        C0276z c0276z = this.f1539h;
        TypedArray obtainStyledAttributes = c0276z.f1566j.obtainStyledAttributes(attributeSet, C0175j.AppCompatTextView, i, 0);
        if (obtainStyledAttributes.hasValue(C0175j.AppCompatTextView_autoSizeTextType)) {
            c0276z.f1557a = obtainStyledAttributes.getInt(C0175j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(C0175j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(C0175j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(C0175j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(C0175j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(C0175j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(C0175j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(C0175j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(C0175j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = obtainTypedArray.getDimensionPixelSize(i2, -1);
                }
                c0276z.f1562f = c0276z.m949a(iArr);
                c0276z.m951c();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!c0276z.m952d()) {
            c0276z.f1557a = 0;
        } else if (c0276z.f1557a == 1) {
            if (!c0276z.f1563g) {
                DisplayMetrics displayMetrics = c0276z.f1566j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0276z.m947a(dimension2, dimension3, dimension);
            }
            c0276z.m950b();
        }
        if (InterfaceC0133b.f661a) {
            C0276z c0276z2 = this.f1539h;
            if (c0276z2.f1557a != 0) {
                int[] iArr2 = c0276z2.f1562f;
                if (iArr2.length > 0) {
                    if (this.f1532a.getAutoSizeStepGranularity() != -1.0f) {
                        this.f1532a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f1539h.f1560d), Math.round(this.f1539h.f1561e), Math.round(this.f1539h.f1559c), 0);
                    } else {
                        this.f1532a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0175j.AppCompatTextView);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(C0175j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(C0175j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(C0175j.AppCompatTextView_lineHeight, -1);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
            C0027d.m75a(this.f1532a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            C0027d.m95b(this.f1532a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            C0027d.m99c(this.f1532a, dimensionPixelSize3);
        }
    }

    /* renamed from: a */
    public void m933a(int[] iArr, int i) {
        C0276z c0276z = this.f1539h;
        if (c0276z.m952d()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0276z.f1566j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0276z.f1562f = c0276z.m949a(iArr2);
                if (!c0276z.m951c()) {
                    StringBuilder m1134a = C0335a.m1134a("None of the preset sizes is valid: ");
                    m1134a.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(m1134a.toString());
                }
            } else {
                c0276z.f1563g = false;
            }
            if (c0276z.m950b()) {
                c0276z.m946a();
            }
        }
    }

    /* renamed from: b */
    public int m934b() {
        return Math.round(this.f1539h.f1561e);
    }

    /* renamed from: c */
    public int m935c() {
        return Math.round(this.f1539h.f1560d);
    }

    /* renamed from: d */
    public int m936d() {
        return Math.round(this.f1539h.f1559c);
    }

    /* renamed from: e */
    public int[] m937e() {
        return this.f1539h.f1562f;
    }

    /* renamed from: f */
    public int m938f() {
        return this.f1539h.f1557a;
    }

    /* renamed from: g */
    public boolean m939g() {
        C0276z c0276z = this.f1539h;
        return c0276z.m952d() && c0276z.f1557a != 0;
    }
}
