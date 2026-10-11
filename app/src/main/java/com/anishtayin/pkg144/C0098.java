package com.anishtayin.pkg144;

import java.io.ByteArrayOutputStream;

/* renamed from: com.anishtayin.pkg144.ۥ⁤⁠۬ۢ⁤⁤⁤ۧ⁤ۖ۠۟۟ۥ⁤⁠ۥ⁣ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0098 {

    /* renamed from: ۥۖۗ⁤⁤⁣⁤⁤⁤ۣۖۖۗ⁣ۖ⁤ۖۖ⁤ۖ, reason: contains not printable characters */
    public static boolean f53;

    /* renamed from: ۥۖۤ⁤⁠ۗ۟⁤ۦۖۗ⁠⁤۠۠ۖ⁣ۖۖۥ, reason: contains not printable characters */
    public static int m1213(Object obj) {
        return ((Integer) C0043.n(20097, obj, new Object[0])).intValue();
    }

    /* renamed from: ۥۖۤ⁤⁠ۗ۟⁤ۦۖۗ⁠⁤۠۠ۖ⁣ۖۖۥ, reason: contains not printable characters */
    public static Class<?> m1214(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* renamed from: ۥۖۤ⁤⁠ۗ۟⁤ۦۖۗ⁠⁤۠۠ۖ⁣ۖۖۥ, reason: contains not printable characters */
    public static String m1215(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۥ۠ۥۖۖ⁠۟⁤ۥۥ⁣⁤⁤ۖ⁤۟۠ۖ⁣۟, reason: contains not printable characters */
    public static String m1216(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۥ۬ۧۖ⁣۬⁣ۖۖۖ⁣ۦۥۗۖ⁣۟ۥ⁤⁠, reason: contains not printable characters */
    public static int m1217() {
        return ((Integer) C0087.n(61915, null, new Object[]{(String) C0039.n(85738)})).intValue() ^ (-1748671);
    }

    /* renamed from: ۥ⁠ۢۥ⁤ۤ⁣ۖ⁤⁤⁤⁠ۥ⁣⁤⁤ۖ⁤⁠⁣, reason: contains not printable characters */
    public static String m1218(String str) {
        String str2;
        String str3;
        Object[] objArr = {new Integer(4892133), new Integer(-4441427), new Integer(-3650005)};
        String str4 = (String) C0104.n(46217);
        String str5 = (String) C0104.n(46217);
        int i = 0;
        while (true) {
            int i2 = i;
            str2 = str5;
            str3 = str4;
            if (i2 >= 15) {
                break;
            }
            str4 = (String) C0087.n(11697, (StringBuffer) C0104.n(17424, (StringBuffer) C0104.n(17424, new StringBuffer(), new Object[]{str3}), new Object[]{(String) C0087.n(56467, null, new Object[]{Integer.valueOf(i2)})}), new Object[0]);
            str5 = (String) C0087.n(11697, (StringBuffer) C0087.n(88837, (StringBuffer) C0104.n(17424, new StringBuffer(), new Object[]{str2}), new Object[]{Integer.valueOf(((int) (((Double) C0087.n(71209, null, new Object[0])).doubleValue() * 10)) ^ i2)}), new Object[0]);
            i = i2 + 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((Integer) C0104.n(71261, str, new Object[0])).intValue() / (((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 4892135));
        while (((Integer) C0104.n(71261, str, new Object[0])).intValue() > 0) {
            C0087.n(84462, byteArrayOutputStream, new Object[]{Integer.valueOf(((Integer) C0087.n(49356, str3, new Object[]{Integer.valueOf(((Character) C0087.n(25075, str, new Object[]{Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 4441426)})).charValue())})).intValue() | (((Integer) C0087.n(49356, str3, new Object[]{Integer.valueOf(((Character) C0087.n(25075, str, new Object[]{Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[2], new Object[0])).intValue() ^ 3650005)})).charValue())})).intValue() << 4))});
        }
        byte[] bArr = (byte[]) C0104.n(1314, byteArrayOutputStream, new Object[0]);
        int length = bArr.length;
        int intValue = ((Integer) C0104.n(71261, str2, new Object[0])).intValue();
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = (byte) (((Character) C0087.n(25075, str2, new Object[]{Integer.valueOf(i3 % intValue)})).charValue() ^ bArr[i3]);
        }
        return new String(bArr);
    }
}
