package p000a.p006b.p010c.p012b.p013c;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: a.b.c.b.c.a */
/* loaded from: classes.dex */
public final class C0069a {

    /* renamed from: a */
    public final Shader f431a;

    /* renamed from: b */
    public final ColorStateList f432b;

    /* renamed from: c */
    public int f433c;

    public C0069a(Shader shader, ColorStateList colorStateList, int i) {
        this.f431a = shader;
        this.f432b = colorStateList;
        this.f433c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p006b.p010c.p012b.p013c.C0069a m321a(android.content.res.Resources r26, int r27, android.content.res.Resources.Theme r28) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p012b.p013c.C0069a.m321a(android.content.res.Resources, int, android.content.res.Resources$Theme):a.b.c.b.c.a");
    }

    /* renamed from: a */
    public Shader m322a() {
        return this.f431a;
    }

    /* renamed from: a */
    public boolean m323a(int[] iArr) {
        if (m325c()) {
            ColorStateList colorStateList = this.f432b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f433c) {
                this.f433c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m324b() {
        return this.f431a != null;
    }

    /* renamed from: c */
    public boolean m325c() {
        ColorStateList colorStateList;
        return this.f431a == null && (colorStateList = this.f432b) != null && colorStateList.isStateful();
    }

    /* renamed from: d */
    public boolean m326d() {
        return m324b() || this.f433c != 0;
    }
}
