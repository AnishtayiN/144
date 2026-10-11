package p000a.p006b.p008b.p009a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p006b.p010c.p020g.C0096a;

/* renamed from: a.b.b.a.c */
/* loaded from: classes.dex */
public class C0026c extends AbstractC0031h implements InterfaceC0025b {

    /* renamed from: c */
    public b f51c;

    /* renamed from: d */
    public Context f52d;

    /* renamed from: e */
    public ArgbEvaluator f53e;

    /* renamed from: f */
    public final Drawable.Callback f54f;

    /* renamed from: a.b.b.a.c$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C0026c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C0026c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C0026c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: a.b.b.a.c$b */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f56a;

        /* renamed from: b */
        public C0032i f57b;

        /* renamed from: c */
        public AnimatorSet f58c;

        /* renamed from: d */
        public ArrayList<Animator> f59d;

        /* renamed from: e */
        public C0096a<Animator, String> f60e;

        public b(b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f56a = bVar.f56a;
                C0032i c0032i = bVar.f57b;
                if (c0032i != null) {
                    Drawable.ConstantState constantState = c0032i.getConstantState();
                    if (resources != null) {
                        this.f57b = (C0032i) constantState.newDrawable(resources);
                    } else {
                        this.f57b = (C0032i) constantState.newDrawable();
                    }
                    C0032i c0032i2 = this.f57b;
                    c0032i2.mutate();
                    this.f57b = c0032i2;
                    this.f57b.setCallback(callback);
                    this.f57b.setBounds(bVar.f57b.getBounds());
                    this.f57b.f92g = false;
                }
                ArrayList<Animator> arrayList = bVar.f59d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f59d = new ArrayList<>(size);
                    this.f60e = new C0096a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f59d.get(i);
                        Animator clone = animator.clone();
                        String str = bVar.f60e.get(animator);
                        clone.setTarget(this.f57b.f88c.f143b.f141p.get(str));
                        this.f59d.add(clone);
                        this.f60e.put(clone, str);
                    }
                    if (this.f58c == null) {
                        this.f58c = new AnimatorSet();
                    }
                    this.f58c.playTogether(this.f59d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f56a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: a.b.b.a.c$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f61a;

        public c(Drawable.ConstantState constantState) {
            this.f61a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f61a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f61a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0026c c0026c = new C0026c(null, null, null);
            c0026c.f86b = this.f61a.newDrawable();
            c0026c.f86b.setCallback(c0026c.f54f);
            return c0026c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0026c c0026c = new C0026c(null, null, null);
            c0026c.f86b = this.f61a.newDrawable(resources);
            c0026c.f86b.setCallback(c0026c.f54f);
            return c0026c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0026c c0026c = new C0026c(null, null, null);
            c0026c.f86b = this.f61a.newDrawable(resources, theme);
            c0026c.f86b.setCallback(c0026c.f54f);
            return c0026c;
        }
    }

    public C0026c() {
        this(null, null, null);
    }

    public C0026c(Context context, b bVar, Resources resources) {
        this.f53e = null;
        this.f54f = new a();
        this.f52d = context;
        if (bVar != null) {
            this.f51c = bVar;
        } else {
            this.f51c = new b(bVar, this.f54f, resources);
        }
    }

    /* renamed from: a */
    public static C0026c m30a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0026c c0026c = new C0026c(context, null, null);
        c0026c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0026c;
    }

    /* renamed from: a */
    public final void m31a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m31a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f53e == null) {
                    this.f53e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f53e);
            }
        }
    }

    @Override // p000a.p006b.p008b.p009a.AbstractC0031h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f86b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        drawable.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f86b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return drawable.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f51c.f57b.draw(canvas);
        if (this.f51c.f58c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f86b;
        if (drawable == null) {
            return this.f51c.f57b.getAlpha();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f51c.f56a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f86b;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(drawable.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f51c.f57b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f51c.f57b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.getOpacity() : this.f51c.f57b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String str;
        XmlResourceParser animation;
        Animator m41a;
        Drawable drawable = this.f86b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                XmlResourceParser xmlResourceParser = null;
                if ("animated-vector".equals(name)) {
                    TypedArray m48a = C0027d.m48a(resources, theme, attributeSet, C0024a.f43e);
                    int resourceId = m48a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0032i m103a = C0032i.m103a(resources, resourceId, theme);
                        m103a.f92g = false;
                        m103a.setCallback(this.f54f);
                        C0032i c0032i = this.f51c.f57b;
                        if (c0032i != null) {
                            c0032i.setCallback(null);
                        }
                        this.f51c.f57b = m103a;
                    }
                    m48a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0024a.f44f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f52d;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            m41a = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                    str = "Can't load animation resource ID #0x";
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e) {
                                e = e;
                                str = "Can't load animation resource ID #0x";
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                str = "Can't load animation resource ID #0x";
                            }
                            try {
                                m41a = C0027d.m41a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                animation.close();
                            } catch (IOException e3) {
                                e = e3;
                                Resources.NotFoundException notFoundException = new Resources.NotFoundException(str + Integer.toHexString(resourceId2));
                                notFoundException.initCause(e);
                                throw notFoundException;
                            } catch (XmlPullParserException e4) {
                                e = e4;
                                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(str + Integer.toHexString(resourceId2));
                                notFoundException2.initCause(e);
                                throw notFoundException2;
                            }
                        }
                        m41a.setTarget(this.f51c.f57b.f88c.f143b.f141p.get(string));
                        if (Build.VERSION.SDK_INT < 21) {
                            m31a(m41a);
                        }
                        b bVar = this.f51c;
                        if (bVar.f59d == null) {
                            bVar.f59d = new ArrayList<>();
                            this.f51c.f60e = new C0096a<>();
                        }
                        this.f51c.f59d.add(m41a);
                        this.f51c.f60e.put(m41a, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        b bVar2 = this.f51c;
        if (bVar2.f58c == null) {
            bVar2.f58c = new AnimatorSet();
        }
        bVar2.f58c.playTogether(bVar2.f59d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f86b;
        return drawable != null ? C0027d.m80a(drawable) : this.f51c.f57b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f86b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f51c.f58c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.isStateful() : this.f51c.f57b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f51c.f57b.setBounds(rect);
        }
    }

    @Override // p000a.p006b.p008b.p009a.AbstractC0031h, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.setLevel(i) : this.f51c.f57b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f86b;
        return drawable != null ? drawable.setState(iArr) : this.f51c.f57b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f51c.f57b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            C0027d.m67a(drawable, z);
            return;
        }
        C0032i c0032i = this.f51c.f57b;
        Drawable drawable2 = c0032i.f86b;
        if (drawable2 != null) {
            C0027d.m67a(drawable2, z);
        } else {
            c0032i.f88c.f146e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        C0032i c0032i = this.f51c.f57b;
        Drawable drawable2 = c0032i.f86b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        } else {
            c0032i.f90e = colorFilter;
            c0032i.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTint(int i) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            C0027d.m63a(drawable, i);
        } else {
            this.f51c.f57b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            C0027d.m65a(drawable, colorStateList);
        } else {
            this.f51c.f57b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, p000a.p006b.p010c.p014c.p015i.InterfaceC0085a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            C0027d.m66a(drawable, mode);
        } else {
            this.f51c.f57b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f51c.f57b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f51c.f58c.isStarted()) {
                return;
            }
            this.f51c.f58c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f86b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f51c.f58c.end();
        }
    }
}
