package p000a.p006b.p010c.p021h;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.b.c.h.a */
/* loaded from: classes.dex */
public abstract class AbstractC0106a implements Parcelable {

    /* renamed from: b */
    public final Parcelable f589b;

    /* renamed from: c */
    public static final AbstractC0106a f588c = new a();
    public static final Parcelable.Creator<AbstractC0106a> CREATOR = new b();

    /* renamed from: a.b.c.h.a$a */
    public static class a extends AbstractC0106a {
        public a() {
            super((a) null);
        }
    }

    /* renamed from: a.b.c.h.a$b */
    public static class b implements Parcelable.ClassLoaderCreator<AbstractC0106a> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbstractC0106a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC0106a.f588c;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new AbstractC0106a[i];
        }
    }

    public /* synthetic */ AbstractC0106a(a aVar) {
        this.f589b = null;
    }

    public AbstractC0106a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f589b = readParcelable == null ? f588c : readParcelable;
    }

    public AbstractC0106a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f589b = parcelable == f588c ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f589b, i);
    }
}
