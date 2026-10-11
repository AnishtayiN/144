package p000a.p006b.p010c.p014c;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p000a.p006b.p010c.p012b.p013c.C0071c;
import p000a.p006b.p010c.p012b.p013c.C0072d;
import p000a.p006b.p010c.p018e.C0093b;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.c.c.f */
/* loaded from: classes.dex */
public class C0082f extends C0080d {

    /* renamed from: a */
    public final Class f458a;

    /* renamed from: b */
    public final Constructor f459b;

    /* renamed from: c */
    public final Method f460c;

    /* renamed from: d */
    public final Method f461d;

    /* renamed from: e */
    public final Method f462e;

    /* renamed from: f */
    public final Method f463f;

    /* renamed from: g */
    public final Method f464g;

    public C0082f() {
        Class<?> cls;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method3 = m347a((Class) cls);
            method4 = m353b((Class) cls);
            method5 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method2 = mo354c((Class) cls);
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder m1134a = C0335a.m1134a("Unable to collect necessary methods for class ");
            m1134a.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", m1134a.toString(), e);
            cls = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f458a = cls;
        this.f459b = constructor;
        this.f460c = method3;
        this.f461d = method4;
        this.f462e = method5;
        this.f463f = method;
        this.f464g = method2;
    }

    @Override // p000a.p006b.p010c.p014c.C0084h
    /* renamed from: a */
    public Typeface mo345a(Context context, C0071c c0071c, Resources resources, int i) {
        if (!m349a()) {
            return super.mo345a(context, c0071c, resources, i);
        }
        Object m352b = m352b();
        for (C0072d c0072d : c0071c.f434a) {
            if (!m350a(context, m352b, c0072d.f435a, c0072d.f439e, c0072d.f436b, c0072d.f437c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0072d.f438d))) {
                m348a(m352b);
                return null;
            }
        }
        if (m355c(m352b)) {
            return mo351b(m352b);
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p014c.C0084h
    /* renamed from: a */
    public Typeface mo346a(Context context, Resources resources, int i, String str, int i2) {
        if (!m349a()) {
            return super.mo346a(context, resources, i, str, i2);
        }
        Object m352b = m352b();
        if (!m350a(context, m352b, str, 0, -1, -1, null)) {
            m348a(m352b);
            return null;
        }
        if (m355c(m352b)) {
            return mo351b(m352b);
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p014c.C0080d, p000a.p006b.p010c.p014c.C0084h
    /* renamed from: a */
    public Typeface mo341a(Context context, CancellationSignal cancellationSignal, C0093b.f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
        if (m349a()) {
            Map<Uri, ByteBuffer> m368a = C0093b.m368a(context, fVarArr, cancellationSignal);
            Object m352b = m352b();
            boolean z = false;
            for (C0093b.f fVar : fVarArr) {
                ByteBuffer byteBuffer = m368a.get(fVar.f497a);
                if (byteBuffer != null) {
                    try {
                        if (!((Boolean) this.f461d.invoke(m352b, byteBuffer, Integer.valueOf(fVar.f498b), null, Integer.valueOf(fVar.f499c), Integer.valueOf(fVar.f500d ? 1 : 0))).booleanValue()) {
                            m348a(m352b);
                            return null;
                        }
                        z = true;
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if (!z) {
                m348a(m352b);
                return null;
            }
            if (m355c(m352b)) {
                return Typeface.create(mo351b(m352b), i);
            }
            return null;
        }
        C0093b.f m356a = m356a(fVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m356a.f497a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m356a.f499c).setItalic(m356a.f500d).build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Method m347a(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: a */
    public final void m348a(Object obj) {
        try {
            this.f463f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final boolean m349a() {
        if (this.f460c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f460c != null;
    }

    /* renamed from: a */
    public final boolean m350a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f460c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo351b(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f458a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f464g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final Object m352b() {
        try {
            return this.f459b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Method m353b(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: c */
    public Method mo354c(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: c */
    public final boolean m355c(Object obj) {
        try {
            return ((Boolean) this.f462e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
