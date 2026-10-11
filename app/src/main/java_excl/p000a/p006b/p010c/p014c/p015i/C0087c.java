package p000a.p006b.p010c.p014c.p015i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: a.b.c.c.i.c */
/* loaded from: classes.dex */
public class C0087c extends Drawable implements Drawable.Callback, InterfaceC0086b, InterfaceC0085a {

    /* renamed from: h */
    public static final PorterDuff.Mode f465h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f466b;

    /* renamed from: c */
    public PorterDuff.Mode f467c;

    /* renamed from: d */
    public boolean f468d;

    /* renamed from: e */
    public a f469e;

    /* renamed from: f */
    public boolean f470f;

    /* renamed from: g */
    public Drawable f471g;

    /* renamed from: a.b.c.c.i.c$a */
    public static abstract class a extends Drawable.ConstantState {

        /* renamed from: a */
        public int f472a;

        /* renamed from: b */
        public Drawable.ConstantState f473b;

        /* renamed from: c */
        public ColorStateList f474c;

        /* renamed from: d */
        public PorterDuff.Mode f475d;

        public a(a aVar) {
            this.f474c = null;
            this.f475d = C0087c.f465h;
            if (aVar != null) {
                this.f472a = aVar.f472a;
                this.f473b = aVar.f473b;
                this.f474c = aVar.f474c;
                this.f475d = aVar.f475d;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = this.f472a;
            Drawable.ConstantState constantState = this.f473b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);
    }

    /* renamed from: a.b.c.c.i.c$b */
    public static class b extends a {
        public b(a aVar, Resources resources) {
            super(aVar);
        }

        @Override // p000a.p006b.p010c.p014c.p015i.C0087c.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0087c(this, resources);
        }
    }

    public C0087c(a aVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f469e = aVar;
        a aVar2 = this.f469e;
        if (aVar2 == null || (constantState = aVar2.f473b) == null) {
            return;
        }
        m358a(constantState.newDrawable(resources));
    }

    public C0087c(Drawable drawable) {
        this.f469e = mo361b();
        m358a(drawable);
    }

    /* renamed from: a */
    public final void m358a(Drawable drawable) {
        Drawable drawable2 = this.f471g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f471g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            a aVar = this.f469e;
            if (aVar != null) {
                aVar.f473b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public boolean mo359a() {
        return true;
    }

    /* renamed from: a */
    public final boolean m360a(int[] iArr) {
        if (!mo359a()) {
            return false;
        }
        a aVar = this.f469e;
        ColorStateList colorStateList = aVar.f474c;
        PorterDuff.Mode mode = aVar.f475d;
        if (colorStateList == null || mode == null) {
            this.f468d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f468d || colorForState != this.f466b || mode != this.f467c) {
                setColorFilter(colorForState, mode);
                this.f466b = colorForState;
                this.f467c = mode;
                this.f468d = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public a mo361b() {
        return new b(this.f469e, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f471g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.f469e;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f471g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        a aVar = this.f469e;
        if (aVar == null) {
            return null;
        }
        if (!(aVar.f473b != null)) {
            return null;
        }
        this.f469e.f472a = getChangingConfigurations();
        return this.f469e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f471g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f471g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f471g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f471g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f471g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f471g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f471g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f471g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f471g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f471g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        a aVar;
        ColorStateList colorStateList = (!mo359a() || (aVar = this.f469e) == null) ? null : aVar.f474c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f471g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f471g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f470f && super.mutate() == this) {
            this.f469e = mo361b();
            Drawable drawable = this.f471g;
            if (drawable != null) {
                drawable.mutate();
            }
            a aVar = this.f469e;
            if (aVar != null) {
                Drawable drawable2 = this.f471g;
                aVar.f473b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f470f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f471g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f471g.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f471g.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f471g.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f471g.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f471g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f471g.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f471g.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m360a(iArr) || this.f471g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTintList(ColorStateList colorStateList) {
        this.f469e.f474c = colorStateList;
        m360a(getState());
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f469e.f475d = mode;
        m360a(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f471g.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
