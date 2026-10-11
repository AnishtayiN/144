package p000a.p006b.p025d.p035g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p006b.p010c.p014c.C0077a;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.x0 */
/* loaded from: classes.dex */
public class C0273x0 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f1545a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f1546b = {-16842910};

    /* renamed from: c */
    public static final int[] f1547c = {R.attr.state_focused};

    /* renamed from: d */
    public static final int[] f1548d;

    /* renamed from: e */
    public static final int[] f1549e;

    /* renamed from: f */
    public static final int[] f1550f;

    /* renamed from: g */
    public static final int[] f1551g;

    static {
        new int[1][0] = 16843518;
        f1548d = new int[]{R.attr.state_pressed};
        f1549e = new int[]{R.attr.state_checked};
        new int[1][0] = 16842913;
        f1550f = new int[0];
        f1551g = new int[1];
    }

    /* renamed from: a */
    public static int m940a(Context context, int i) {
        ColorStateList m942c = m942c(context, i);
        if (m942c != null && m942c.isStateful()) {
            return m942c.getColorForState(f1546b, m942c.getDefaultColor());
        }
        TypedValue typedValue = f1545a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f1545a.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return C0077a.m334b(m941b(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* renamed from: b */
    public static int m941b(Context context, int i) {
        int[] iArr = f1551g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: c */
    public static ColorStateList m942c(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1551g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C0181a.m617b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
