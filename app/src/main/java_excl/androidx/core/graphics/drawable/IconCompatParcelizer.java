package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.IconCompat;
import p036b.p037a.AbstractC0332a;
import p036b.p037a.C0333b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0332a abstractC0332a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1600a = abstractC0332a.m1123a(iconCompat.f1600a, 1);
        byte[] bArr = iconCompat.f1602c;
        if (abstractC0332a.mo1126a(2)) {
            C0333b c0333b = (C0333b) abstractC0332a;
            int readInt = c0333b.f1994b.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                c0333b.f1994b.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1602c = bArr;
        iconCompat.f1603d = abstractC0332a.m1124a((AbstractC0332a) iconCompat.f1603d, 3);
        iconCompat.f1604e = abstractC0332a.m1123a(iconCompat.f1604e, 4);
        iconCompat.f1605f = abstractC0332a.m1123a(iconCompat.f1605f, 5);
        iconCompat.f1606g = (ColorStateList) abstractC0332a.m1124a((AbstractC0332a) iconCompat.f1606g, 6);
        String str = iconCompat.f1608i;
        if (abstractC0332a.mo1126a(7)) {
            str = abstractC0332a.mo1130c();
        }
        iconCompat.f1608i = str;
        iconCompat.m979c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0332a abstractC0332a) {
        abstractC0332a.m1131d();
        iconCompat.m977a(false);
        abstractC0332a.m1129b(iconCompat.f1600a, 1);
        byte[] bArr = iconCompat.f1602c;
        abstractC0332a.mo1128b(2);
        C0333b c0333b = (C0333b) abstractC0332a;
        if (bArr != null) {
            c0333b.f1994b.writeInt(bArr.length);
            c0333b.f1994b.writeByteArray(bArr);
        } else {
            c0333b.f1994b.writeInt(-1);
        }
        Parcelable parcelable = iconCompat.f1603d;
        abstractC0332a.mo1128b(3);
        c0333b.f1994b.writeParcelable(parcelable, 0);
        abstractC0332a.m1129b(iconCompat.f1604e, 4);
        abstractC0332a.m1129b(iconCompat.f1605f, 5);
        ColorStateList colorStateList = iconCompat.f1606g;
        abstractC0332a.mo1128b(6);
        c0333b.f1994b.writeParcelable(colorStateList, 0);
        String str = iconCompat.f1608i;
        abstractC0332a.mo1128b(7);
        c0333b.f1994b.writeString(str);
    }
}
