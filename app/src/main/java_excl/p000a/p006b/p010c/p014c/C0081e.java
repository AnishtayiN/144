package p000a.p006b.p010c.p014c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p012b.p013c.C0071c;
import p000a.p006b.p010c.p012b.p013c.C0072d;
import p000a.p006b.p010c.p018e.C0093b;
import p000a.p006b.p010c.p020g.C0104i;

/* renamed from: a.b.c.c.e */
/* loaded from: classes.dex */
public class C0081e extends C0084h {

    /* renamed from: a */
    public static final Class f454a;

    /* renamed from: b */
    public static final Constructor f455b;

    /* renamed from: c */
    public static final Method f456c;

    /* renamed from: d */
    public static final Method f457d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        f455b = constructor;
        f454a = cls;
        f456c = method2;
        f457d = method;
    }

    /* renamed from: a */
    public static Typeface m342a(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f454a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f457d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static Object m343a() {
        try {
            return f455b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m344a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f456c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p000a.p006b.p010c.p014c.C0084h
    /* renamed from: a */
    public Typeface mo345a(Context context, C0071c c0071c, Resources resources, int i) {
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        Object m343a = m343a();
        for (C0072d c0072d : c0071c.f434a) {
            int i2 = c0072d.f440f;
            File m56a = C0027d.m56a(context);
            if (m56a != null) {
                try {
                    if (C0027d.m82a(m56a, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(m56a);
                        } catch (IOException unused) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !m344a(m343a, mappedByteBuffer, c0072d.f439e, c0072d.f436b, c0072d.f437c)) {
                                return null;
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                } finally {
                    m56a.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return m342a(m343a);
    }

    @Override // p000a.p006b.p010c.p014c.C0084h
    /* renamed from: a */
    public Typeface mo341a(Context context, CancellationSignal cancellationSignal, C0093b.f[] fVarArr, int i) {
        Object m343a = m343a();
        C0104i c0104i = new C0104i();
        for (C0093b.f fVar : fVarArr) {
            Uri uri = fVar.f497a;
            ByteBuffer byteBuffer = (ByteBuffer) c0104i.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C0027d.m59a(context, cancellationSignal, uri);
                c0104i.put(uri, byteBuffer);
            }
            if (!m344a(m343a, byteBuffer, fVar.f498b, fVar.f499c, fVar.f500d)) {
                return null;
            }
        }
        return Typeface.create(m342a(m343a), i);
    }
}
