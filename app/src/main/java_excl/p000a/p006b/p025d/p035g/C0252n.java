package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p006b.p010c.p021h.InterfaceC0118m;
import p000a.p006b.p010c.p024i.InterfaceC0140i;

/* renamed from: a.b.d.g.n */
/* loaded from: classes.dex */
public class C0252n extends ImageView implements InterfaceC0118m, InterfaceC0140i {

    /* renamed from: b */
    public final C0228e f1369b;

    /* renamed from: c */
    public final C0250m f1370c;

    public C0252n(Context context) {
        this(context, null, 0);
    }

    public C0252n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0252n(Context context, AttributeSet attributeSet, int i) {
        super(C0277z0.m953a(context), attributeSet, i);
        this.f1369b = new C0228e(this);
        this.f1369b.m793a(attributeSet, i);
        this.f1370c = new C0250m(this);
        this.f1370c.m883a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0228e c0228e = this.f1369b;
        if (c0228e != null) {
            c0228e.m789a();
        }
        C0250m c0250m = this.f1370c;
        if (c0250m != null) {
            c0250m.m879a();
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public ColorStateList getSupportBackgroundTintList() {
        C0228e c0228e = this.f1369b;
        if (c0228e != null) {
            return c0228e.m794b();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228e c0228e = this.f1369b;
        if (c0228e != null) {
            return c0228e.m796c();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p024i.InterfaceC0140i
    public ColorStateList getSupportImageTintList() {
        C0218a1 c0218a1;
        C0250m c0250m = this.f1370c;
        if (c0250m == null || (c0218a1 = c0250m.f1366c) == null) {
            return null;
        }
        return c0218a1.f1198a;
    }

    @Override // p000a.p006b.p010c.p024i.InterfaceC0140i
    public PorterDuff.Mode getSupportImageTintMode() {
        C0218a1 c0218a1;
        C0250m c0250m = this.f1370c;
        if (c0250m == null || (c0218a1 = c0250m.f1366c) == null) {
            return null;
        }
        return c0218a1.f1199b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1370c.m884b() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228e c0228e = this.f1369b;
        if (c0228e != null) {
            c0228e.m797d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228e c0228e = this.f1369b;
        if (c0228e != null) {
            c0228e.m790a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0250m c0250m = this.f1370c;
        if (c0250m != null) {
            c0250m.m879a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0250m c0250m = this.f1370c;
        if (c0250m != null) {
            c0250m.m879a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0250m c0250m = this.f1370c;
        if (c0250m != null) {
            c0250m.m880a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0250m c0250m = this.f1370c;
        if (c0250m != null) {
            c0250m.m879a();
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228e c0228e = this.f1369b;
        if (c0228e != null) {
            c0228e.m795b(colorStateList);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228e c0228e = this.f1369b;
        if (c0228e != null) {
            c0228e.m792a(mode);
        }
    }

    @Override // p000a.p006b.p010c.p024i.InterfaceC0140i
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0250m c0250m = this.f1370c;
        if (c0250m != null) {
            c0250m.m881a(colorStateList);
        }
    }

    @Override // p000a.p006b.p010c.p024i.InterfaceC0140i
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0250m c0250m = this.f1370c;
        if (c0250m != null) {
            c0250m.m882a(mode);
        }
    }
}
