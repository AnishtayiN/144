package p000a.p006b.p010c.p011a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.b.c.a.q */
/* loaded from: classes.dex */
public final class C0057q implements Parcelable {
    public static final Parcelable.Creator<C0057q> CREATOR = new a();

    /* renamed from: b */
    public final String f362b;

    /* renamed from: c */
    public final int f363c;

    /* renamed from: d */
    public final boolean f364d;

    /* renamed from: e */
    public final int f365e;

    /* renamed from: f */
    public final int f366f;

    /* renamed from: g */
    public final String f367g;

    /* renamed from: h */
    public final boolean f368h;

    /* renamed from: i */
    public final boolean f369i;

    /* renamed from: j */
    public final Bundle f370j;

    /* renamed from: k */
    public final boolean f371k;

    /* renamed from: l */
    public Bundle f372l;

    /* renamed from: m */
    public ComponentCallbacksC0041e f373m;

    /* renamed from: a.b.c.a.q$a */
    public static class a implements Parcelable.Creator<C0057q> {
        @Override // android.os.Parcelable.Creator
        public C0057q createFromParcel(Parcel parcel) {
            return new C0057q(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0057q[] newArray(int i) {
            return new C0057q[i];
        }
    }

    public C0057q(ComponentCallbacksC0041e componentCallbacksC0041e) {
        this.f362b = componentCallbacksC0041e.getClass().getName();
        this.f363c = componentCallbacksC0041e.f228f;
        this.f364d = componentCallbacksC0041e.f236n;
        this.f365e = componentCallbacksC0041e.f247y;
        this.f366f = componentCallbacksC0041e.f248z;
        this.f367g = componentCallbacksC0041e.f201A;
        this.f368h = componentCallbacksC0041e.f204D;
        this.f369i = componentCallbacksC0041e.f203C;
        this.f370j = componentCallbacksC0041e.f230h;
        this.f371k = componentCallbacksC0041e.f202B;
    }

    public C0057q(Parcel parcel) {
        this.f362b = parcel.readString();
        this.f363c = parcel.readInt();
        this.f364d = parcel.readInt() != 0;
        this.f365e = parcel.readInt();
        this.f366f = parcel.readInt();
        this.f367g = parcel.readString();
        this.f368h = parcel.readInt() != 0;
        this.f369i = parcel.readInt() != 0;
        this.f370j = parcel.readBundle();
        this.f371k = parcel.readInt() != 0;
        this.f372l = parcel.readBundle();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f362b);
        parcel.writeInt(this.f363c);
        parcel.writeInt(this.f364d ? 1 : 0);
        parcel.writeInt(this.f365e);
        parcel.writeInt(this.f366f);
        parcel.writeString(this.f367g);
        parcel.writeInt(this.f368h ? 1 : 0);
        parcel.writeInt(this.f369i ? 1 : 0);
        parcel.writeBundle(this.f370j);
        parcel.writeInt(this.f371k ? 1 : 0);
        parcel.writeBundle(this.f372l);
    }
}
