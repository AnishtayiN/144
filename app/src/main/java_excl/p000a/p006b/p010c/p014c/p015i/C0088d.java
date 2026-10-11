package p000a.p006b.p010c.p014c.p015i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p000a.p006b.p010c.p014c.p015i.C0087c;

/* renamed from: a.b.c.c.i.d */
/* loaded from: classes.dex */
public class C0088d extends C0087c {

    /* renamed from: i */
    public static Method f476i;

    /* renamed from: a.b.c.c.i.d$a */
    public static class a extends C0087c.a {
        public a(C0087c.a aVar, Resources resources) {
            super(aVar);
        }

        @Override // p000a.p006b.p010c.p014c.p015i.C0087c.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0088d(this, resources);
        }
    }

    public C0088d(C0087c.a aVar, Resources resources) {
        super(aVar, resources);
        m362c();
    }

    public C0088d(Drawable drawable) {
        super(drawable);
        m362c();
    }

    @Override // p000a.p006b.p010c.p014c.p015i.C0087c
    /* renamed from: a */
    public boolean mo359a() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f471g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // p000a.p006b.p010c.p014c.p015i.C0087c
    /* renamed from: b */
    public C0087c.a mo361b() {
        return new a(this.f469e, null);
    }

    /* renamed from: c */
    public final void m362c() {
        if (f476i == null) {
            try {
                f476i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f471g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f471g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f471g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f471g.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p000a.p006b.p010c.p014c.p015i.C0087c, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p000a.p006b.p010c.p014c.p015i.C0087c, android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTint(int i) {
        if (mo359a()) {
            super.setTint(i);
        } else {
            this.f471g.setTint(i);
        }
    }

    @Override // p000a.p006b.p010c.p014c.p015i.C0087c, android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTintList(ColorStateList colorStateList) {
        if (!mo359a()) {
            this.f471g.setTintList(colorStateList);
        } else {
            this.f469e.f474c = colorStateList;
            m360a(getState());
        }
    }

    @Override // p000a.p006b.p010c.p014c.p015i.C0087c, android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTintMode(PorterDuff.Mode mode) {
        if (!mo359a()) {
            this.f471g.setTintMode(mode);
        } else {
            this.f469e.f475d = mode;
            m360a(getState());
        }
    }
}
