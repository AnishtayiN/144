package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0413;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0469;
import com.rootify.C0474;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.g */
/* loaded from: classes.dex */
public class RunnableC0342g implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2366short;

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0353a0 f2013b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(8396354)}[0], new Object[0])).intValue() ^ 8396369];
        sArr[0] = 2210;
        sArr[1] = 2232;
        sArr[2] = 2184;
        sArr[3] = 2247;
        sArr[4] = 2298;
        sArr[5] = 2294;
        sArr[6] = 2279;
        sArr[7] = 2288;
        sArr[8] = 2284;
        sArr[9] = 2275;
        sArr[10] = 2286;
        sArr[11] = 2210;
        sArr[12] = 2257;
        sArr[13] = 2294;
        sArr[14] = 2285;
        sArr[15] = 2288;
        sArr[16] = 2275;
        sArr[17] = 2277;
        sArr[18] = 2279;
        f2366short = sArr;
    }

    public RunnableC0342g(MainActivity.AsyncTaskC0353a0 asyncTaskC0353a0) {
        this.f2013b = asyncTaskC0353a0;
        if (((Integer) C0469.m1839n(8569, null, new Object[0])).intValue() <= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Integer) C0413.m1353n(9605, null, new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0474.m1873n(31496)})})});
        }
    }

    /* renamed from: ۥۖۥۥ⁤ۖ⁠ۖۖ⁤ۧ۠ۢ⁤ۥ⁠ۣ⁣⁣⁠, reason: contains not printable characters */
    public static short[] m2163() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (short[]) C0474.m1873n(77616);
        }
        return null;
    }

    /* renamed from: ۥۤ⁣ۡۥ⁠⁤ۖ⁤۟ۦۥ⁤⁠ۧ⁣ۧۡ⁣ۧ, reason: contains not printable characters */
    public static int m2164(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۦۦۖۥۥۥۧۨ⁠ۥ⁠ۖۖۖ⁠⁤ۖۖ⁤ۥ, reason: contains not printable characters */
    public static String m2165(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0447.m1650n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        ProgressDialog progressDialog = (ProgressDialog) C0413.m1353n(96934, null, new Object[]{(MainActivity) C0413.m1353n(59107, null, new Object[]{(MainActivity.AsyncTaskC0353a0) C0474.m1875n(14859, null, new Object[]{this})})});
        StringBuilder sb = new StringBuilder();
        C0456.m1731n(86830, null, new Object[]{progressDialog, (String) C0469.m1839n(48310, null, new Object[]{sb})});
        if (((Integer) C0469.m1839n(62495, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Float) C0474.m1875n(13581, null, new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0474.m1873n(61467)})})});
        }
    }
}
