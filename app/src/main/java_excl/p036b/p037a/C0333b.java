package p036b.p037a;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: b.a.b */
/* loaded from: classes.dex */
public class C0333b extends AbstractC0332a {

    /* renamed from: b */
    public final Parcel f1994b;

    /* renamed from: c */
    public final int f1995c;

    /* renamed from: d */
    public final int f1996d;

    /* renamed from: e */
    public final String f1997e;

    /* renamed from: g */
    public int f1999g;

    /* renamed from: a */
    public final SparseIntArray f1993a = new SparseIntArray();

    /* renamed from: f */
    public int f1998f = -1;

    public C0333b(Parcel parcel, int i, int i2, String str) {
        this.f1999g = 0;
        this.f1994b = parcel;
        this.f1995c = i;
        this.f1996d = i2;
        this.f1999g = this.f1995c;
        this.f1997e = str;
    }

    @Override // p036b.p037a.AbstractC0332a
    /* renamed from: a */
    public void mo1125a() {
        int i = this.f1998f;
        if (i >= 0) {
            int i2 = this.f1993a.get(i);
            int dataPosition = this.f1994b.dataPosition();
            this.f1994b.setDataPosition(i2);
            this.f1994b.writeInt(dataPosition - i2);
            this.f1994b.setDataPosition(dataPosition);
        }
    }

    @Override // p036b.p037a.AbstractC0332a
    /* renamed from: a */
    public boolean mo1126a(int i) {
        int i2;
        while (true) {
            int i3 = this.f1999g;
            if (i3 >= this.f1996d) {
                i2 = -1;
                break;
            }
            this.f1994b.setDataPosition(i3);
            int readInt = this.f1994b.readInt();
            int readInt2 = this.f1994b.readInt();
            this.f1999g += readInt;
            if (readInt2 == i) {
                i2 = this.f1994b.dataPosition();
                break;
            }
        }
        if (i2 == -1) {
            return false;
        }
        this.f1994b.setDataPosition(i2);
        return true;
    }

    @Override // p036b.p037a.AbstractC0332a
    /* renamed from: b */
    public AbstractC0332a mo1127b() {
        Parcel parcel = this.f1994b;
        int dataPosition = parcel.dataPosition();
        int i = this.f1999g;
        if (i == this.f1995c) {
            i = this.f1996d;
        }
        return new C0333b(parcel, dataPosition, i, this.f1997e + "  ");
    }

    @Override // p036b.p037a.AbstractC0332a
    /* renamed from: b */
    public void mo1128b(int i) {
        mo1125a();
        this.f1998f = i;
        this.f1993a.put(i, this.f1994b.dataPosition());
        this.f1994b.writeInt(0);
        this.f1994b.writeInt(i);
    }

    @Override // p036b.p037a.AbstractC0332a
    /* renamed from: c */
    public String mo1130c() {
        return this.f1994b.readString();
    }
}
