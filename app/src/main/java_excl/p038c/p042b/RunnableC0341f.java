package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0408;
import com.rootify.C0413;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0469;
import com.rootify.C0474;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.f */
/* loaded from: classes.dex */
public class RunnableC0341f implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2365short;

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0353a0 f2012b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(2550470)}[0], new Object[0])).intValue() ^ 2550485];
        sArr[0] = 2649;
        sArr[1] = 2627;
        sArr[2] = 2675;
        sArr[3] = 2608;
        sArr[4] = 2583;
        sArr[5] = 2573;
        sArr[6] = 2588;
        sArr[7] = 2571;
        sArr[8] = 2583;
        sArr[9] = 2584;
        sArr[10] = 2581;
        sArr[11] = 2649;
        sArr[12] = 2602;
        sArr[13] = 2573;
        sArr[14] = 2582;
        sArr[15] = 2571;
        sArr[16] = 2584;
        sArr[17] = 2590;
        sArr[18] = 2588;
        f2365short = sArr;
    }

    public RunnableC0341f(MainActivity.AsyncTaskC0353a0 asyncTaskC0353a0) {
        this.f2012b = asyncTaskC0353a0;
        if (((Integer) C0408.m1308n(78567, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Double) C0469.m1839n(44213, null, new Object[]{(String) C0469.m1839n(11011, null, new Object[]{(String) C0456.m1729n(52730)})})});
        }
    }

    /* renamed from: ۥۖ⁤ۖۗ⁠ۣۖۖ⁠ۗۖۖۖ⁠ۣۖۗۖ⁤, reason: contains not printable characters */
    public static short[] m2160() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (short[]) C0456.m1729n(69347);
        }
        return null;
    }

    /* renamed from: ۥۗۥ⁠⁤ۣۤ⁤⁤⁤⁣ۖۥۨ۬⁤⁤ۖۢ۬, reason: contains not printable characters */
    public static int m2161(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۢۥۖ۠⁤ۖ⁤⁤ۥ⁠ۢۖۤۖ⁤ۥۨ⁣ۥ, reason: contains not printable characters */
    public static String m2162(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0447.m1650n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        ProgressDialog progressDialog = (ProgressDialog) C0413.m1353n(96934, null, new Object[]{(MainActivity) C0413.m1353n(59107, null, new Object[]{(MainActivity.AsyncTaskC0353a0) C0456.m1731n(75611, null, new Object[]{this})})});
        StringBuilder sb = new StringBuilder();
        C0456.m1731n(86830, null, new Object[]{progressDialog, (String) C0469.m1839n(48310, null, new Object[]{sb})});
        if (((Integer) C0469.m1839n(62495, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Integer) C0413.m1353n(9605, null, new Object[]{(String) C0447.m1650n(59112, null, new Object[]{(String) C0474.m1873n(44157)})})});
        }
    }
}
