package p038c.p042b;

import com.rootify.C0422;
import com.rootify.C0452;
import com.rootify.C0469;
import java.io.ByteArrayOutputStream;

/* renamed from: c.b.ۦۣۖ⁠۠⁠۟ۤ⁤ۥ⁠ۥ⁤⁤ۥ⁤⁤۠⁣ۥ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0392 {

    /* renamed from: ۥ⁠⁠ۖۥۤۖۖۖ⁠ۥۥۥۣ۠⁤ۥ⁠۟ۡ, reason: contains not printable characters */
    public static int f2381 = 79;

    /* renamed from: ۥۨۥ⁤ۥ⁣ۥۨ۬۟ۨ⁤ۢۥۥۣۗ⁤۟ۤ, reason: contains not printable characters */
    public static String m2970(String str) {
        String str2;
        String str3;
        Object[] objArr = {new Integer(1172206), new Integer(-1594922)};
        String str4 = (String) C0469.m1837n(46217);
        String str5 = (String) C0469.m1837n(46217);
        int i = 0;
        while (true) {
            int i2 = i;
            str2 = str4;
            str3 = str5;
            if (i2 >= 15) {
                break;
            }
            str4 = (String) C0452.m1695n(11697, (StringBuffer) C0469.m1839n(17424, (StringBuffer) C0469.m1839n(17424, new StringBuffer(), new Object[]{str2}), new Object[]{(String) C0452.m1695n(56467, null, new Object[]{Integer.valueOf(i2)})}), new Object[0]);
            str5 = (String) C0452.m1695n(11697, (StringBuffer) C0452.m1695n(88837, (StringBuffer) C0469.m1839n(17424, new StringBuffer(), new Object[]{str3}), new Object[]{Integer.valueOf(((int) (((Double) C0452.m1695n(71209, null, new Object[0])).doubleValue() * 10)) ^ i2)}), new Object[0]);
            i = i2 + 1;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((Integer) C0469.m1839n(71261, str, new Object[0])).intValue() / (((Integer) C0469.m1839n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 1172204));
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= ((Integer) C0469.m1839n(71261, str, new Object[0])).intValue()) {
                break;
            }
            C0452.m1695n(84462, byteArrayOutputStream, new Object[]{Integer.valueOf(((Integer) C0452.m1695n(49356, str2, new Object[]{Integer.valueOf(((Character) C0452.m1695n(25075, str, new Object[]{Integer.valueOf(i4 + 1)})).charValue())})).intValue() | (((Integer) C0452.m1695n(49356, str2, new Object[]{Integer.valueOf(((Character) C0452.m1695n(25075, str, new Object[]{Integer.valueOf(i4)})).charValue())})).intValue() << 4))});
            i3 = i4 + 2;
        }
        byte[] bArr = (byte[]) C0469.m1839n(1314, byteArrayOutputStream, new Object[0]);
        int length = bArr.length;
        int intValue = ((Integer) C0469.m1839n(71261, str3, new Object[0])).intValue();
        while (length > 0) {
            bArr[1594921 ^ ((Integer) C0469.m1839n(62256, (Integer) objArr[1], new Object[0])).intValue()] = (byte) (((Character) C0452.m1695n(25075, str3, new Object[]{Integer.valueOf(r9 % intValue)})).charValue() ^ bArr[r9]);
        }
        for (int i5 = 0; i5 < bArr.length; i5 = ((Integer) C0469.m1839n(71261, (String) C0469.m1837n(46217), new Object[0])).intValue() + 1) {
        }
        return new String(bArr);
    }

    /* renamed from: ۥ⁣ۦ۠⁤ۨۢ⁠ۣ⁤ۣ⁠۟⁤⁤ۗ⁠⁠ۧۜ, reason: contains not printable characters */
    public static int m2971() {
        return ((Integer) C0452.m1695n(61915, null, new Object[]{(String) C0422.m1432n(4157)})).intValue() ^ 1753624;
    }

    /* renamed from: ۥ⁤ۣۨ⁤ۖۤ⁤⁤⁤ۖ⁠⁤ۖۖ⁤⁤ۣ۟⁤, reason: contains not printable characters */
    public static String m2972(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }
}
