package p000a.p006b.p025d.p035g;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p006b.p010c.p021h.C0119n;

/* renamed from: a.b.d.g.i1 */
/* loaded from: classes.dex */
public class C0242i1 {

    /* renamed from: a */
    public static Method f1316a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f1316a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                if (f1316a.isAccessible()) {
                    return;
                }
                f1316a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static void m836a(View view, Rect rect, Rect rect2) {
        Method method = f1316a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m837a(View view) {
        return C0119n.m468c(view) == 1;
    }

    /* renamed from: b */
    public static void m838b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e2) {
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
            }
        }
    }
}
