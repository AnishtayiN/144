package p000a.p006b.p010c.p014c;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.b.c.c.g */
/* loaded from: classes.dex */
public class C0083g extends C0082f {
    @Override // p000a.p006b.p010c.p014c.C0082f
    /* renamed from: b */
    public Typeface mo351b(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f458a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f464g.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.p006b.p010c.p014c.C0082f
    /* renamed from: c */
    public Method mo354c(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
