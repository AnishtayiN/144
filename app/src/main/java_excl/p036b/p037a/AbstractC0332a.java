package p036b.p037a;

import android.os.Parcelable;

/* renamed from: b.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0332a {
    /* renamed from: a */
    public static Class m1122a(Class<? extends InterfaceC0334c> cls) {
        return Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
    }

    /* renamed from: a */
    public int m1123a(int i, int i2) {
        return !mo1126a(i2) ? i : ((C0333b) this).f1994b.readInt();
    }

    /* renamed from: a */
    public <T extends Parcelable> T m1124a(T t, int i) {
        return !mo1126a(i) ? t : (T) ((C0333b) this).f1994b.readParcelable(C0333b.class.getClassLoader());
    }

    /* renamed from: a */
    public abstract void mo1125a();

    /* renamed from: a */
    public abstract boolean mo1126a(int i);

    /* renamed from: b */
    public abstract AbstractC0332a mo1127b();

    /* renamed from: b */
    public abstract void mo1128b(int i);

    /* renamed from: b */
    public void m1129b(int i, int i2) {
        mo1128b(i2);
        ((C0333b) this).f1994b.writeInt(i);
    }

    /* renamed from: c */
    public abstract String mo1130c();

    /* renamed from: d */
    public void m1131d() {
    }
}
