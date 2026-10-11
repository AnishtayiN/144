package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0408;
import com.rootify.C0413;
import com.rootify.C0425;
import com.rootify.C0428;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0469;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.k */
/* loaded from: classes.dex */
public class RunnableC0346k implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2370short;

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0357c0 f2017b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(9922952)}[0], new Object[0])).intValue() ^ 9922971];
        sArr[0] = 1339;
        sArr[1] = 1313;
        sArr[2] = 1297;
        sArr[3] = 1374;
        sArr[4] = 1379;
        sArr[5] = 1391;
        sArr[6] = 1406;
        sArr[7] = 1385;
        sArr[8] = 1397;
        sArr[9] = 1402;
        sArr[10] = 1399;
        sArr[11] = 1339;
        sArr[12] = 1352;
        sArr[13] = 1391;
        sArr[14] = 1396;
        sArr[15] = 1385;
        sArr[16] = 1402;
        sArr[17] = 1404;
        sArr[18] = 1406;
        f2370short = sArr;
    }

    public RunnableC0346k(MainActivity.AsyncTaskC0357c0 asyncTaskC0357c0) {
        this.f2017b = asyncTaskC0357c0;
        if (((Integer) C0408.m1308n(78567, null, new Object[0])).intValue() >= 0) {
            C0413.m1353n(47446, (PrintStream) C0469.m1837n(12888), new Object[]{Long.valueOf(((Long) C0413.m1353n(90189, null, new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0428.m1477n(15522)})})).longValue())});
        }
    }

    /* renamed from: ۥۥۖۖۖۗۖ۠⁤⁤ۣۖ⁤⁠⁤ۧ۟ۖۖۢ, reason: contains not printable characters */
    public static int m2175(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۥۣۖ۬⁠⁤⁤ۥ⁤⁣۬ۧ⁠ۧ⁤ۖ⁤⁤ۗ, reason: contains not printable characters */
    public static String m2176(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1308n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥۨ⁣ۣۖۧ۟ۤ۬⁤ۖۨۥۖۨ۟ۥ⁠ۥۖ, reason: contains not printable characters */
    public static short[] m2177() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (short[]) C0428.m1477n(42327);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        ProgressDialog progressDialog = (ProgressDialog) C0413.m1353n(96934, null, new Object[]{(MainActivity) C0425.m1461n(35541, null, new Object[]{(MainActivity.AsyncTaskC0357c0) C0428.m1479n(30253, null, new Object[]{this})})});
        StringBuilder sb = new StringBuilder();
        C0456.m1731n(86830, null, new Object[]{progressDialog, (String) C0469.m1839n(48310, null, new Object[]{sb})});
    }
}
