package p038c.p042b;

import com.rootify.C0405;
import com.rootify.C0422;
import com.rootify.C0452;
import com.rootify.C0461;
import com.rootify.C0462;
import com.rootify.C0469;
import com.rootify.C0471;
import java.io.ByteArrayOutputStream;

/* renamed from: c.b.ۥ⁤⁠⁠ۖۢۥ⁠⁠ۨ⁠۠ۤۥ⁤ۥ⁣ۥۡۗ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0391 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2379short;

    /* renamed from: ۥ⁤ۖ⁣ۤۥ⁠⁠ۖۥ⁣ۖۤ۟ۨۖ⁣ۥ⁣ۢ, reason: contains not printable characters */
    public static boolean f2380;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(8006425)}[0], new Object[0])).intValue() ^ 8006427];
        sArr[0] = 3825;
        sArr[1] = 3830;
        f2379short = sArr;
    }

    /* renamed from: ۥۧۗۥ⁤ۖ⁤ۨ⁣ۢ۬ۖ⁤⁤⁠⁤۟ۖ⁤ۖ, reason: contains not printable characters */
    public static String m2967(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۥ⁤۟⁤⁤⁤⁤⁤⁠ۥۥ⁣ۨ⁠۠ۖۖۖ⁤⁤, reason: contains not printable characters */
    public static int m2968() {
        return ((Integer) C0452.m1695n(65372, null, new Object[]{(String) C0405.m1281n(48035, null, new Object[]{(short[]) C0461.m1774n(72913), Integer.valueOf(((Integer) C0452.m1695n(61915, null, new Object[]{(String) C0461.m1774n(66501)})).intValue() ^ 1748613), Integer.valueOf(((Integer) C0452.m1695n(61915, null, new Object[]{(String) C0422.m1432n(47291)})).intValue() ^ 1753510), Integer.valueOf(((Integer) C0452.m1695n(61915, null, new Object[]{(String) C0461.m1774n(4867)})).intValue() ^ 1751702)})})).intValue() ^ (-56448);
    }

    /* renamed from: ۥ⁤⁤ۖ⁠⁣⁤ۖۡ⁤ۜ⁤ۣۖۖۖۤۖۢۖ, reason: contains not printable characters */
    public static String m2969(String str) {
        String str2;
        String str3;
        Integer num = new Integer(1805857);
        String str4 = (String) C0462.m1785n(93145, null, new Object[0]);
        String str5 = (String) C0462.m1785n(93145, null, new Object[0]);
        int i = 0;
        while (true) {
            str2 = str5;
            str3 = str4;
            if (i >= 15) {
                break;
            }
            str4 = (String) C0471.m1857n(61514, null, new Object[]{(StringBuffer) C0471.m1857n(94056, null, new Object[]{(StringBuffer) C0471.m1857n(94056, null, new Object[]{new StringBuffer(), str3}), (String) C0471.m1857n(56845, null, new Object[]{Integer.valueOf(i)})})});
            str5 = (String) C0471.m1857n(61514, null, new Object[]{(StringBuffer) C0471.m1857n(4425, null, new Object[]{(StringBuffer) C0471.m1857n(94056, null, new Object[]{new StringBuffer(), str2}), Integer.valueOf(((int) (((Double) C0471.m1857n(22788, null, new Object[0])).doubleValue() * 10)) ^ i)})});
            i++;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((Integer) C0462.m1785n(8451, null, new Object[]{str})).intValue() / (((Integer) C0469.m1839n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 1805859));
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= ((Integer) C0462.m1785n(8451, null, new Object[]{str})).intValue()) {
                break;
            }
            C0471.m1857n(5520, null, new Object[]{byteArrayOutputStream, Integer.valueOf(((Integer) C0471.m1857n(75124, null, new Object[]{str3, Integer.valueOf(((Character) C0471.m1857n(5326, null, new Object[]{str, Integer.valueOf(i3 + 1)})).charValue())})).intValue() | (((Integer) C0471.m1857n(75124, null, new Object[]{str3, Integer.valueOf(((Character) C0471.m1857n(5326, null, new Object[]{str, Integer.valueOf(i3)})).charValue())})).intValue() << 4))});
            i2 = i3 + 2;
        }
        byte[] bArr = (byte[]) C0462.m1785n(66721, null, new Object[]{byteArrayOutputStream});
        int length = bArr.length;
        int intValue = ((Integer) C0462.m1785n(8451, null, new Object[]{str2})).intValue();
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = (byte) (((Character) C0471.m1857n(5326, null, new Object[]{str2, Integer.valueOf(i4 % intValue)})).charValue() ^ bArr[i4]);
        }
        for (int i5 = 0; i5 < bArr.length; i5 = ((Integer) C0462.m1785n(8451, null, new Object[]{(String) C0462.m1785n(93145, null, new Object[0])})).intValue() + 1) {
        }
        return new String(bArr);
    }
}
