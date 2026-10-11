package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.c1 */
/* loaded from: classes.dex */
public class C0224c1 {

    /* renamed from: a */
    public final Context f1235a;

    /* renamed from: b */
    public final TypedArray f1236b;

    /* renamed from: c */
    public TypedValue f1237c;

    public C0224c1(Context context, TypedArray typedArray) {
        this.f1235a = context;
        this.f1236b = typedArray;
    }

    /* renamed from: a */
    public static C0224c1 m775a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0224c1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public int m776a(int i, int i2) {
        return this.f1236b.getColor(i, i2);
    }

    /* renamed from: a */
    public ColorStateList m777a(int i) {
        int resourceId;
        ColorStateList m617b;
        return (!this.f1236b.hasValue(i) || (resourceId = this.f1236b.getResourceId(i, 0)) == 0 || (m617b = C0181a.m617b(this.f1235a, resourceId)) == null) ? this.f1236b.getColorStateList(i) : m617b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface m778a(int r13, int r14, p000a.p006b.p010c.p012b.p013c.AbstractC0076h r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0224c1.m778a(int, int, a.b.c.b.c.h):android.graphics.Typeface");
    }

    /* renamed from: a */
    public boolean m779a(int i, boolean z) {
        return this.f1236b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m780b(int i, int i2) {
        return this.f1236b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: b */
    public Drawable m781b(int i) {
        int resourceId;
        return (!this.f1236b.hasValue(i) || (resourceId = this.f1236b.getResourceId(i, 0)) == 0) ? this.f1236b.getDrawable(i) : C0181a.m618c(this.f1235a, resourceId);
    }

    /* renamed from: c */
    public int m782c(int i, int i2) {
        return this.f1236b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: c */
    public Drawable m783c(int i) {
        int resourceId;
        if (!this.f1236b.hasValue(i) || (resourceId = this.f1236b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0243j.m839a().m847a(this.f1235a, resourceId, true);
    }

    /* renamed from: d */
    public int m784d(int i, int i2) {
        return this.f1236b.getInt(i, i2);
    }

    /* renamed from: d */
    public CharSequence m785d(int i) {
        return this.f1236b.getText(i);
    }

    /* renamed from: e */
    public int m786e(int i, int i2) {
        return this.f1236b.getLayoutDimension(i, i2);
    }

    /* renamed from: e */
    public boolean m787e(int i) {
        return this.f1236b.hasValue(i);
    }

    /* renamed from: f */
    public int m788f(int i, int i2) {
        return this.f1236b.getResourceId(i, i2);
    }
}
