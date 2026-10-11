package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import p036b.p037a.AbstractC0332a;
import p036b.p037a.C0333b;
import p036b.p037a.InterfaceC0334c;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0331a();

    /* renamed from: b */
    public final InterfaceC0334c f1992b;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C0331a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        C0333b c0333b = new C0333b(parcel, parcel.dataPosition(), parcel.dataSize(), "");
        String readString = c0333b.f1994b.readString();
        InterfaceC0334c interfaceC0334c = null;
        if (readString != null) {
            try {
                interfaceC0334c = (InterfaceC0334c) Class.forName(readString, true, AbstractC0332a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0332a.class).invoke(null, c0333b.mo1127b());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        }
        this.f1992b = interfaceC0334c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C0333b c0333b = new C0333b(parcel, parcel.dataPosition(), parcel.dataSize(), "");
        InterfaceC0334c interfaceC0334c = this.f1992b;
        if (interfaceC0334c == null) {
            c0333b.f1994b.writeString(null);
            return;
        }
        try {
            c0333b.f1994b.writeString(AbstractC0332a.m1122a((Class<? extends InterfaceC0334c>) interfaceC0334c.getClass()).getName());
            AbstractC0332a mo1127b = c0333b.mo1127b();
            try {
                AbstractC0332a.m1122a((Class<? extends InterfaceC0334c>) interfaceC0334c.getClass()).getDeclaredMethod("write", interfaceC0334c.getClass(), AbstractC0332a.class).invoke(null, interfaceC0334c, mo1127b);
                mo1127b.mo1125a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC0334c.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
