package p000a.p006b.p010c.p011a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.b.c.a.p */
/* loaded from: classes.dex */
public final class C0056p implements Parcelable {
    public static final Parcelable.Creator<C0056p> CREATOR = new a();

    /* renamed from: b */
    public C0057q[] f357b;

    /* renamed from: c */
    public int[] f358c;

    /* renamed from: d */
    public C0037c[] f359d;

    /* renamed from: e */
    public int f360e;

    /* renamed from: f */
    public int f361f;

    /* renamed from: a.b.c.a.p$a */
    public static class a implements Parcelable.Creator<C0056p> {
        @Override // android.os.Parcelable.Creator
        public C0056p createFromParcel(Parcel parcel) {
            return new C0056p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0056p[] newArray(int i) {
            return new C0056p[i];
        }
    }

    public C0056p() {
        this.f360e = -1;
    }

    public C0056p(Parcel parcel) {
        this.f360e = -1;
        this.f357b = (C0057q[]) parcel.createTypedArray(C0057q.CREATOR);
        this.f358c = parcel.createIntArray();
        this.f359d = (C0037c[]) parcel.createTypedArray(C0037c.CREATOR);
        this.f360e = parcel.readInt();
        this.f361f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f357b, i);
        parcel.writeIntArray(this.f358c);
        parcel.writeTypedArray(this.f359d, i);
        parcel.writeInt(this.f360e);
        parcel.writeInt(this.f361f);
    }
}
