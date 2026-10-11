package p000a.p006b.p025d.p035g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.InterfaceC0118m;
import p000a.p006b.p025d.p027b.C0175j;

/* renamed from: a.b.d.g.e */
/* loaded from: classes.dex */
public class C0228e {

    /* renamed from: a */
    public final View f1243a;

    /* renamed from: d */
    public C0218a1 f1246d;

    /* renamed from: e */
    public C0218a1 f1247e;

    /* renamed from: f */
    public C0218a1 f1248f;

    /* renamed from: c */
    public int f1245c = -1;

    /* renamed from: b */
    public final C0243j f1244b = C0243j.m839a();

    public C0228e(View view) {
        this.f1243a = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m789a() {
        Drawable background = this.f1243a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f1246d != null) {
                if (this.f1248f == null) {
                    this.f1248f = new C0218a1();
                }
                C0218a1 c0218a1 = this.f1248f;
                c0218a1.m748a();
                ColorStateList m466b = C0119n.m466b(this.f1243a);
                if (m466b != null) {
                    c0218a1.f1201d = true;
                    c0218a1.f1198a = m466b;
                }
                View view = this.f1243a;
                PorterDuff.Mode backgroundTintMode = Build.VERSION.SDK_INT >= 21 ? view.getBackgroundTintMode() : view instanceof InterfaceC0118m ? ((InterfaceC0118m) view).getSupportBackgroundTintMode() : null;
                if (backgroundTintMode != null) {
                    c0218a1.f1200c = true;
                    c0218a1.f1199b = backgroundTintMode;
                }
                if (c0218a1.f1201d || c0218a1.f1200c) {
                    C0243j.m842a(background, c0218a1, this.f1243a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0218a1 c0218a12 = this.f1247e;
            if (c0218a12 != null) {
                C0243j.m842a(background, c0218a12, this.f1243a.getDrawableState());
                return;
            }
            C0218a1 c0218a13 = this.f1246d;
            if (c0218a13 != null) {
                C0243j.m842a(background, c0218a13, this.f1243a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public void m790a(int i) {
        this.f1245c = i;
        C0243j c0243j = this.f1244b;
        m791a(c0243j != null ? c0243j.m855d(this.f1243a.getContext(), i) : null);
        m789a();
    }

    /* renamed from: a */
    public void m791a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1246d == null) {
                this.f1246d = new C0218a1();
            }
            C0218a1 c0218a1 = this.f1246d;
            c0218a1.f1198a = colorStateList;
            c0218a1.f1201d = true;
        } else {
            this.f1246d = null;
        }
        m789a();
    }

    /* renamed from: a */
    public void m792a(PorterDuff.Mode mode) {
        if (this.f1247e == null) {
            this.f1247e = new C0218a1();
        }
        C0218a1 c0218a1 = this.f1247e;
        c0218a1.f1199b = mode;
        c0218a1.f1200c = true;
        m789a();
    }

    /* renamed from: a */
    public void m793a(AttributeSet attributeSet, int i) {
        C0224c1 m775a = C0224c1.m775a(this.f1243a.getContext(), attributeSet, C0175j.ViewBackgroundHelper, i, 0);
        try {
            if (m775a.m787e(C0175j.ViewBackgroundHelper_android_background)) {
                this.f1245c = m775a.m788f(C0175j.ViewBackgroundHelper_android_background, -1);
                ColorStateList m855d = this.f1244b.m855d(this.f1243a.getContext(), this.f1245c);
                if (m855d != null) {
                    m791a(m855d);
                }
            }
            if (m775a.m787e(C0175j.ViewBackgroundHelper_backgroundTint)) {
                C0119n.m459a(this.f1243a, m775a.m777a(C0175j.ViewBackgroundHelper_backgroundTint));
            }
            if (m775a.m787e(C0175j.ViewBackgroundHelper_backgroundTintMode)) {
                C0119n.m460a(this.f1243a, C0238h0.m826a(m775a.m784d(C0175j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            m775a.f1236b.recycle();
        }
    }

    /* renamed from: b */
    public ColorStateList m794b() {
        C0218a1 c0218a1 = this.f1247e;
        if (c0218a1 != null) {
            return c0218a1.f1198a;
        }
        return null;
    }

    /* renamed from: b */
    public void m795b(ColorStateList colorStateList) {
        if (this.f1247e == null) {
            this.f1247e = new C0218a1();
        }
        C0218a1 c0218a1 = this.f1247e;
        c0218a1.f1198a = colorStateList;
        c0218a1.f1201d = true;
        m789a();
    }

    /* renamed from: c */
    public PorterDuff.Mode m796c() {
        C0218a1 c0218a1 = this.f1247e;
        if (c0218a1 != null) {
            return c0218a1.f1199b;
        }
        return null;
    }

    /* renamed from: d */
    public void m797d() {
        this.f1245c = -1;
        m791a((ColorStateList) null);
        m789a();
    }
}
