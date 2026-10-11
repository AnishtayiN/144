package com.rootify;

import abx.b.d.b.j;

/* renamed from: com.rootify.⁣⁣⁣⁣⁣⁠⁣⁤⁠⁠⁠⁣⁣⁣⁣⁣⁤, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0113 {

    /* renamed from: ⁣⁤⁠⁠⁠⁤⁠⁤⁠⁠⁣⁣, reason: not valid java name and contains not printable characters */
    public static boolean f58 = true;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        return r3;
     */
    /* renamed from: ⁣⁣⁣⁣⁣⁠⁠⁠⁠⁣⁣⁠, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1268() {
        /*
            r1 = 0
            java.lang.String r0 = "۬ۛۤ"
            r2 = r1
            r3 = r1
            r4 = r1
        L6:
            int r0 = com.rootify.C0111.m1248(r0)
            switch(r0) {
                case 1738407: goto L2e;
                case 1743640: goto L26;
                case 1744167: goto L33;
                case 1751547: goto L12;
                case 1754663: goto L20;
                case 1759061: goto L17;
                default: goto Ld;
            }
        Ld:
            r3 = r1 | r2
            java.lang.String r0 = "ۜ۫ۖ"
            goto L6
        L12:
            r1 = r3 & r4
            java.lang.String r0 = "۬ۗۚ"
            goto L6
        L17:
            java.lang.String r0 = "ۚۨۙ"
            int r4 = com.rootify.C0111.m1248(r0)
            java.lang.String r0 = "ۖ۫ۜ"
            goto L6
        L20:
            r3 = 1742091(0x1a950b, float:2.44119E-39)
            java.lang.String r0 = "ۤۡۘ"
            goto L6
        L26:
            r0 = -1742092(0xffffffffffe56af4, float:NaN)
            r2 = r3 & r0
            java.lang.String r0 = "ۧۨۨ"
            goto L6
        L2e:
            r3 = r4 ^ (-1)
            java.lang.String r0 = "ۜۚۖ"
            goto L6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rootify.C0113.m1268():int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000a. Please report as an issue. */
    /* renamed from: ⁣⁣⁣⁣⁣⁠⁣⁤⁣⁠⁣⁤⁠⁠⁠⁠⁣⁣⁣, reason: not valid java name and contains not printable characters */
    public static String m1269(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            short s = sArr[i - (0 - i4)];
            cArr[i4] = (char) ((s & (i3 ^ (-1))) | ((s ^ (-1)) & i3));
        }
        return new String(cArr);
    }
}
