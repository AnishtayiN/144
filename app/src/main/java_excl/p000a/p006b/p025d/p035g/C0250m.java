package p000a.p006b.p025d.p035g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p006b.p010c.p024i.InterfaceC0140i;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.m */
/* loaded from: classes.dex */
public class C0250m {

    /* renamed from: a */
    public final ImageView f1364a;

    /* renamed from: b */
    public C0218a1 f1365b;

    /* renamed from: c */
    public C0218a1 f1366c;

    /* renamed from: d */
    public C0218a1 f1367d;

    public C0250m(ImageView imageView) {
        this.f1364a = imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m879a() {
        PorterDuff.Mode supportImageTintMode;
        Drawable drawable = this.f1364a.getDrawable();
        if (drawable != null) {
            C0238h0.m828b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f1365b != null) {
                if (this.f1367d == null) {
                    this.f1367d = new C0218a1();
                }
                C0218a1 c0218a1 = this.f1367d;
                c0218a1.m748a();
                ImageView imageView = this.f1364a;
                ColorStateList imageTintList = Build.VERSION.SDK_INT >= 21 ? imageView.getImageTintList() : imageView instanceof InterfaceC0140i ? ((InterfaceC0140i) imageView).getSupportImageTintList() : null;
                if (imageTintList != null) {
                    c0218a1.f1201d = true;
                    c0218a1.f1198a = imageTintList;
                }
                ImageView imageView2 = this.f1364a;
                if (Build.VERSION.SDK_INT >= 21) {
                    supportImageTintMode = imageView2.getImageTintMode();
                } else {
                    supportImageTintMode = imageView2 instanceof InterfaceC0140i ? ((InterfaceC0140i) imageView2).getSupportImageTintMode() : null;
                }
                if (supportImageTintMode != null) {
                    c0218a1.f1200c = true;
                    c0218a1.f1199b = supportImageTintMode;
                }
                if (c0218a1.f1201d || c0218a1.f1200c) {
                    C0243j.m842a(drawable, c0218a1, this.f1364a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0218a1 c0218a12 = this.f1366c;
            if (c0218a12 != null) {
                C0243j.m842a(drawable, c0218a12, this.f1364a.getDrawableState());
                return;
            }
            C0218a1 c0218a13 = this.f1365b;
            if (c0218a13 != null) {
                C0243j.m842a(drawable, c0218a13, this.f1364a.getDrawableState());
            }
        }
    }

    /* renamed from: a */
    public void m880a(int i) {
        if (i != 0) {
            Drawable m618c = C0181a.m618c(this.f1364a.getContext(), i);
            if (m618c != null) {
                C0238h0.m828b(m618c);
            }
            this.f1364a.setImageDrawable(m618c);
        } else {
            this.f1364a.setImageDrawable(null);
        }
        m879a();
    }

    /* renamed from: a */
    public void m881a(ColorStateList colorStateList) {
        if (this.f1366c == null) {
            this.f1366c = new C0218a1();
        }
        C0218a1 c0218a1 = this.f1366c;
        c0218a1.f1198a = colorStateList;
        c0218a1.f1201d = true;
        m879a();
    }

    /* renamed from: a */
    public void m882a(PorterDuff.Mode mode) {
        if (this.f1366c == null) {
            this.f1366c = new C0218a1();
        }
        C0218a1 c0218a1 = this.f1366c;
        c0218a1.f1199b = mode;
        c0218a1.f1200c = true;
        m879a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m883a(AttributeSet attributeSet, int i) {
        int m788f;
        C0224c1 m775a = C0224c1.m775a(this.f1364a.getContext(), attributeSet, C0175j.AppCompatImageView, i, 0);
        try {
            Drawable drawable = this.f1364a.getDrawable();
            if (drawable == null && (m788f = m775a.m788f(C0175j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = C0181a.m618c(this.f1364a.getContext(), m788f)) != null) {
                this.f1364a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0238h0.m828b(drawable);
            }
            boolean z = true;
            if (m775a.m787e(C0175j.AppCompatImageView_tint)) {
                ImageView imageView = this.f1364a;
                ColorStateList m777a = m775a.m777a(C0175j.AppCompatImageView_tint);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView.setImageTintList(m777a);
                    if (Build.VERSION.SDK_INT == 21) {
                        Drawable drawable2 = imageView.getDrawable();
                        boolean z2 = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                        if (drawable2 != null && z2) {
                            if (drawable2.isStateful()) {
                                drawable2.setState(imageView.getDrawableState());
                            }
                            imageView.setImageDrawable(drawable2);
                        }
                    }
                } else if (imageView instanceof InterfaceC0140i) {
                    ((InterfaceC0140i) imageView).setSupportImageTintList(m777a);
                }
            }
            if (m775a.m787e(C0175j.AppCompatImageView_tintMode)) {
                ImageView imageView2 = this.f1364a;
                PorterDuff.Mode m826a = C0238h0.m826a(m775a.m784d(C0175j.AppCompatImageView_tintMode, -1), null);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView2.setImageTintMode(m826a);
                    if (Build.VERSION.SDK_INT == 21) {
                        Drawable drawable3 = imageView2.getDrawable();
                        if (imageView2.getImageTintList() == null || imageView2.getImageTintMode() == null) {
                            z = false;
                        }
                        if (drawable3 != null && z) {
                            if (drawable3.isStateful()) {
                                drawable3.setState(imageView2.getDrawableState());
                            }
                            imageView2.setImageDrawable(drawable3);
                        }
                    }
                } else if (imageView2 instanceof InterfaceC0140i) {
                    ((InterfaceC0140i) imageView2).setSupportImageTintMode(m826a);
                }
            }
            m775a.f1236b.recycle();
        } catch (Throwable th) {
            m775a.f1236b.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public boolean m884b() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1364a.getBackground() instanceof RippleDrawable);
    }
}
