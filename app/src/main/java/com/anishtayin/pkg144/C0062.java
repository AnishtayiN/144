package com.anishtayin.pkg144;

import java.io.ByteArrayOutputStream;

/* renamed from: com.anishtayin.pkg144.ۥۤ۬ۥ⁤⁠ۥ⁠⁣ۖ۬ۖۢ۬ۖۖ⁠⁠⁤ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0062 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f51short;

    /* renamed from: ۥ⁤⁣⁤ۖۥ⁤ۤۦۥ⁠⁠ۖ۬ۨ⁤ۧ⁤ۥ⁣, reason: contains not printable characters */
    public static int f52 = -71;

    static {
        short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(6567453)}[0], new Object[0])).intValue() ^ 6567455];
        sArr[0] = 2542;
        sArr[1] = 446;
        f51short = sArr;
    }

    /* renamed from: ۥۖۖۖ۠ۖۧۨ⁤ۣۖۖ۬ۗۧۦ⁤ۖۢۧ, reason: contains not printable characters */
    public static String m1210(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۥۣۖۢۖ⁠⁤⁤۟ۖ۟⁣⁤ۧ⁤ۧ⁠ۖ⁤ۥ, reason: contains not printable characters */
    public static int m1211() {
        return ((Integer) C0087.n(61915, null, new Object[]{(String) C0087.n(93914)})).intValue() ^ 56409;
    }

    /* renamed from: ۥ⁤⁤۟⁠⁠⁤ۖۥۥۖ⁤⁤ۖۥۖ⁣ۥ⁤ۖ, reason: contains not printable characters */
    public static String m1212(String str) {
        String str2;
        String str3;
        String str4;
        Integer num = new Integer(9893539);
        String str5 = (String) C0104.n(46217);
        String str6 = (String) C0104.n(46217);
        int i = 0;
        while (true) {
            int i2 = i;
            str2 = str6;
            str3 = str5;
            if (i2 >= 15) {
                break;
            }
            str5 = (String) C0087.n(11697, (StringBuffer) C0104.n(17424, (StringBuffer) C0104.n(17424, new StringBuffer(), new Object[]{str3}), new Object[]{(String) C0087.n(56467, null, new Object[]{Integer.valueOf(i2)})}), new Object[0]);
            str6 = (String) C0087.n(11697, (StringBuffer) C0087.n(88837, (StringBuffer) C0104.n(17424, new StringBuffer(), new Object[]{str2}), new Object[]{Integer.valueOf(((int) (((Double) C0087.n(71209, null, new Object[0])).doubleValue() * 10)) ^ i2)}), new Object[0]);
            i = i2 + 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((Integer) C0104.n(71261, str, new Object[0])).intValue() / (((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 9893537));
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= ((Integer) C0104.n(71261, str, new Object[0])).intValue()) {
                break;
            }
            C0087.n(84462, byteArrayOutputStream, new Object[]{Integer.valueOf(((Integer) C0087.n(49356, str3, new Object[]{Integer.valueOf(((Character) C0087.n(25075, str, new Object[]{Integer.valueOf(i4 + 1)})).charValue())})).intValue() | (((Integer) C0087.n(49356, str3, new Object[]{Integer.valueOf(((Character) C0087.n(25075, str, new Object[]{Integer.valueOf(i4)})).charValue())})).intValue() << 4))});
            i3 = i4 + 2;
        }
        byte[] bArr = (byte[]) C0104.n(1314, byteArrayOutputStream, new Object[0]);
        String str7 = (String) C0040.n(43786, null, new Object[]{(short[]) C0064.n(82351), Integer.valueOf(((Integer) C0087.n(61915, null, new Object[]{(String) C0064.n(3922)})).intValue() ^ 1753603), Integer.valueOf(((Integer) C0087.n(61915, null, new Object[]{(String) C0039.n(73915)})).intValue() ^ 1747654), Integer.valueOf(((Integer) C0087.n(61915, null, new Object[]{(String) C0087.n(80009)})).intValue() ^ 1753097)});
        while (true) {
            str4 = str7;
            if (((Integer) C0104.n(71261, str4, new Object[0])).intValue() <= 0) {
                break;
            }
            str7 = (String) C0104.n(46217);
            if (((Integer) C0104.n(71261, str7, new Object[0])).intValue() == 0) {
                str7 = (String) C0040.n(48035, null, new Object[]{(short[]) C0064.n(82351), Integer.valueOf(((Integer) C0087.n(61915, null, new Object[]{(String) C0040.n(70992)})).intValue() ^ 56539), Integer.valueOf(((Integer) C0087.n(61915, null, new Object[]{(String) C0064.n(92274)})).intValue() ^ 1746752), Integer.valueOf(((Integer) C0087.n(61915, null, new Object[]{(String) C0039.n(30687)})).intValue() ^ 1750747)});
            }
        }
        int intValue = ((Integer) C0104.n(71261, str4, new Object[0])).intValue();
        int intValue2 = ((Integer) C0104.n(71261, str2, new Object[0])).intValue();
        for (int i5 = 0; i5 < intValue; i5++) {
            bArr[i5] = (byte) (((Character) C0087.n(25075, str2, new Object[]{Integer.valueOf(i5 % intValue2)})).charValue() ^ bArr[i5]);
        }
        for (int i6 = 0; i6 < bArr.length; i6 = ((Integer) C0104.n(71261, (String) C0104.n(46217), new Object[0])).intValue() + 1) {
        }
        return new String(bArr);
    }
}
