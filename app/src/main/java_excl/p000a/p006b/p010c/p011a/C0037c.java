package p000a.p006b.p010c.p011a;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000a.p006b.p010c.p011a.C0035b;

/* renamed from: a.b.c.a.c */
/* loaded from: classes.dex */
public final class C0037c implements Parcelable {
    public static final Parcelable.Creator<C0037c> CREATOR = new a();

    /* renamed from: b */
    public final int[] f183b;

    /* renamed from: c */
    public final int f184c;

    /* renamed from: d */
    public final int f185d;

    /* renamed from: e */
    public final String f186e;

    /* renamed from: f */
    public final int f187f;

    /* renamed from: g */
    public final int f188g;

    /* renamed from: h */
    public final CharSequence f189h;

    /* renamed from: i */
    public final int f190i;

    /* renamed from: j */
    public final CharSequence f191j;

    /* renamed from: k */
    public final ArrayList<String> f192k;

    /* renamed from: l */
    public final ArrayList<String> f193l;

    /* renamed from: m */
    public final boolean f194m;

    /* renamed from: a.b.c.a.c$a */
    public static class a implements Parcelable.Creator<C0037c> {
        @Override // android.os.Parcelable.Creator
        public C0037c createFromParcel(Parcel parcel) {
            return new C0037c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C0037c[] newArray(int i) {
            return new C0037c[i];
        }
    }

    public C0037c(C0035b c0035b) {
        int size = c0035b.f158b.size();
        this.f183b = new int[size * 6];
        if (!c0035b.f165i) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0035b.a aVar = c0035b.f158b.get(i2);
            int[] iArr = this.f183b;
            int i3 = i + 1;
            iArr[i] = aVar.f177a;
            int i4 = i3 + 1;
            ComponentCallbacksC0041e componentCallbacksC0041e = aVar.f178b;
            iArr[i3] = componentCallbacksC0041e != null ? componentCallbacksC0041e.f228f : -1;
            int[] iArr2 = this.f183b;
            int i5 = i4 + 1;
            iArr2[i4] = aVar.f179c;
            int i6 = i5 + 1;
            iArr2[i5] = aVar.f180d;
            int i7 = i6 + 1;
            iArr2[i6] = aVar.f181e;
            i = i7 + 1;
            iArr2[i7] = aVar.f182f;
        }
        this.f184c = c0035b.f163g;
        this.f185d = c0035b.f164h;
        this.f186e = c0035b.f166j;
        this.f187f = c0035b.f168l;
        this.f188g = c0035b.f169m;
        this.f189h = c0035b.f170n;
        this.f190i = c0035b.f171o;
        this.f191j = c0035b.f172p;
        this.f192k = c0035b.f173q;
        this.f193l = c0035b.f174r;
        this.f194m = c0035b.f175s;
    }

    public C0037c(Parcel parcel) {
        this.f183b = parcel.createIntArray();
        this.f184c = parcel.readInt();
        this.f185d = parcel.readInt();
        this.f186e = parcel.readString();
        this.f187f = parcel.readInt();
        this.f188g = parcel.readInt();
        this.f189h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f190i = parcel.readInt();
        this.f191j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f192k = parcel.createStringArrayList();
        this.f193l = parcel.createStringArrayList();
        this.f194m = parcel.readInt() != 0;
    }

    /* renamed from: a */
    public C0035b m156a(LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k) {
        C0035b c0035b = new C0035b(layoutInflaterFactory2C0051k);
        int i = 0;
        while (i < this.f183b.length) {
            C0035b.a aVar = new C0035b.a();
            int[] iArr = this.f183b;
            int i2 = i + 1;
            aVar.f177a = iArr[i];
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                aVar.f178b = layoutInflaterFactory2C0051k.f304f.get(i4);
            } else {
                aVar.f178b = null;
            }
            int[] iArr2 = this.f183b;
            int i5 = i3 + 1;
            aVar.f179c = iArr2[i3];
            int i6 = i5 + 1;
            aVar.f180d = iArr2[i5];
            int i7 = i6 + 1;
            aVar.f181e = iArr2[i6];
            i = i7 + 1;
            aVar.f182f = iArr2[i7];
            c0035b.f159c = aVar.f179c;
            c0035b.f160d = aVar.f180d;
            c0035b.f161e = aVar.f181e;
            c0035b.f162f = aVar.f182f;
            c0035b.f158b.add(aVar);
            aVar.f179c = c0035b.f159c;
            aVar.f180d = c0035b.f160d;
            aVar.f181e = c0035b.f161e;
            aVar.f182f = c0035b.f162f;
        }
        c0035b.f163g = this.f184c;
        c0035b.f164h = this.f185d;
        c0035b.f166j = this.f186e;
        c0035b.f168l = this.f187f;
        c0035b.f165i = true;
        c0035b.f169m = this.f188g;
        c0035b.f170n = this.f189h;
        c0035b.f171o = this.f190i;
        c0035b.f172p = this.f191j;
        c0035b.f173q = this.f192k;
        c0035b.f174r = this.f193l;
        c0035b.f175s = this.f194m;
        c0035b.m131a(1);
        return c0035b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f183b);
        parcel.writeInt(this.f184c);
        parcel.writeInt(this.f185d);
        parcel.writeString(this.f186e);
        parcel.writeInt(this.f187f);
        parcel.writeInt(this.f188g);
        TextUtils.writeToParcel(this.f189h, parcel, 0);
        parcel.writeInt(this.f190i);
        TextUtils.writeToParcel(this.f191j, parcel, 0);
        parcel.writeStringList(this.f192k);
        parcel.writeStringList(this.f193l);
        parcel.writeInt(this.f194m ? 1 : 0);
    }
}
