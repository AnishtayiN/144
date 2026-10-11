package p000a.p006b.p010c.p012b;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

/* renamed from: a.b.c.b.a */
/* loaded from: classes.dex */
public class C0067a {

    /* renamed from: a */
    public static final Object f429a = new Object();

    /* renamed from: b */
    public static TypedValue f430b;

    /* renamed from: a */
    public static ColorStateList m318a(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: a */
    public static boolean m319a(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    /* renamed from: b */
    public static Drawable m320b(Context context, int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return context.getDrawable(i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f429a) {
            if (f430b == null) {
                f430b = new TypedValue();
            }
            context.getResources().getValue(i, f430b, true);
            i2 = f430b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }
}
