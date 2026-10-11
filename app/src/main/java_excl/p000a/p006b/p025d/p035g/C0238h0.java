package p000a.p006b.p025d.p035g;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import p000a.p006b.p010c.p014c.p015i.C0087c;
import p000a.p006b.p010c.p014c.p015i.InterfaceC0086b;
import p000a.p006b.p025d.p031e.p032a.C0184c;

/* renamed from: a.b.d.g.h0 */
/* loaded from: classes.dex */
public class C0238h0 {
    static {
        new Rect();
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static PorterDuff.Mode m826a(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static boolean m827a(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (!(drawable instanceof DrawableContainer)) {
            if (drawable instanceof InterfaceC0086b) {
                return m827a(((C0087c) drawable).f471g);
            }
            if (drawable instanceof C0184c) {
                return m827a(((C0184c) drawable).f919b);
            }
            if (drawable instanceof ScaleDrawable) {
                return m827a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
            return true;
        }
        for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
            if (!m827a(drawable2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m828b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(C0273x0.f1549e);
            } else {
                drawable.setState(C0273x0.f1550f);
            }
            drawable.setState(state);
        }
    }
}
