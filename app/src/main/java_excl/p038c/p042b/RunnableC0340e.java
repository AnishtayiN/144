package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0413;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0469;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.e */
/* loaded from: classes.dex */
public class RunnableC0340e implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2364short;

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0353a0 f2011b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(4328448)}[0], new Object[0])).intValue() ^ 4328467];
        sArr[0] = 2411;
        sArr[1] = 2417;
        sArr[2] = 2369;
        sArr[3] = 2318;
        sArr[4] = 2355;
        sArr[5] = 2367;
        sArr[6] = 2350;
        sArr[7] = 2361;
        sArr[8] = 2341;
        sArr[9] = 2346;
        sArr[10] = 2343;
        sArr[11] = 2411;
        sArr[12] = 2328;
        sArr[13] = 2367;
        sArr[14] = 2340;
        sArr[15] = 2361;
        sArr[16] = 2346;
        sArr[17] = 2348;
        sArr[18] = 2350;
        f2364short = sArr;
    }

    public RunnableC0340e(MainActivity.AsyncTaskC0353a0 asyncTaskC0353a0) {
        this.f2011b = asyncTaskC0353a0;
        if (((Integer) C0469.m1839n(8569, null, new Object[0])).intValue() <= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Long) C0456.m1731n(85432, null, new Object[]{(String) C0447.m1650n(59112, null, new Object[]{(String) C0456.m1729n(58429)})})});
        }
    }

    /* renamed from: ۥۤۗ⁠ۣۧ⁤⁠۟ۥۣ۟۟⁤⁣⁤ۖۖ⁤ۨ, reason: contains not printable characters */
    public static short[] m2157() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (short[]) C0456.m1729n(60920);
        }
        return null;
    }

    /* renamed from: ۥۤ⁣ۥۖ⁣ۖۧۥۖۤ⁤⁤⁠ۖۖ⁣۠⁣⁤, reason: contains not printable characters */
    public static int m2158(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۧۥ۟⁤ۣۖۖۖ۟ۡۨۤۖ۟ۖ⁣۟⁤ۖ, reason: contains not printable characters */
    public static String m2159(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1695n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        ProgressDialog progressDialog = (ProgressDialog) C0413.m1353n(96934, null, new Object[]{(MainActivity) C0413.m1353n(59107, null, new Object[]{(MainActivity.AsyncTaskC0353a0) C0456.m1731n(96543, null, new Object[]{this})})});
        StringBuilder sb = new StringBuilder();
        C0456.m1731n(86830, null, new Object[]{progressDialog, (String) C0469.m1839n(48310, null, new Object[]{sb})});
    }
}
