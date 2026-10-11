package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0408;
import com.rootify.C0413;
import com.rootify.C0425;
import com.rootify.C0428;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0462;
import com.rootify.C0469;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.j */
/* loaded from: classes.dex */
public class RunnableC0345j implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2369short;

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0357c0 f2016b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(2503241)}[0], new Object[0])).intValue() ^ 2503258];
        sArr[0] = 1594;
        sArr[1] = 1568;
        sArr[2] = 1552;
        sArr[3] = 1619;
        sArr[4] = 1652;
        sArr[5] = 1646;
        sArr[6] = 1663;
        sArr[7] = 1640;
        sArr[8] = 1652;
        sArr[9] = 1659;
        sArr[10] = 1654;
        sArr[11] = 1594;
        sArr[12] = 1609;
        sArr[13] = 1646;
        sArr[14] = 1653;
        sArr[15] = 1640;
        sArr[16] = 1659;
        sArr[17] = 1661;
        sArr[18] = 1663;
        f2369short = sArr;
    }

    public RunnableC0345j(MainActivity.AsyncTaskC0357c0 asyncTaskC0357c0) {
        this.f2016b = asyncTaskC0357c0;
        if (((Integer) C0462.m1785n(33252, null, new Object[0])).intValue() <= 0) {
            C0408.m1308n(80863, (PrintStream) C0469.m1837n(12888), new Object[]{(String) C0452.m1695n(2816, null, new Object[]{(String) C0425.m1459n(12896)})});
        }
    }

    /* renamed from: ۥۖۖ⁠⁤ۖ⁠ۖ⁠ۧۗ⁤ۖ⁤⁤⁤ۖ۠ۥۖ, reason: contains not printable characters */
    public static String m2172(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0447.m1650n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥ۬⁣ۖ⁤ۥۧ⁤ۖ۠⁣⁤ۤۥۧ⁣ۖ⁤⁤⁠, reason: contains not printable characters */
    public static int m2173(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥ⁤ۖ⁣⁤⁣ۗ⁠⁤ۥۥۨۧۗ⁠⁠ۖۥۤ⁣, reason: contains not printable characters */
    public static short[] m2174() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (short[]) C0425.m1459n(33276);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        ProgressDialog progressDialog = (ProgressDialog) C0413.m1353n(96934, null, new Object[]{(MainActivity) C0425.m1461n(35541, null, new Object[]{(MainActivity.AsyncTaskC0357c0) C0425.m1461n(57043, null, new Object[]{this})})});
        StringBuilder sb = new StringBuilder();
        C0456.m1731n(86830, null, new Object[]{progressDialog, (String) C0469.m1839n(48310, null, new Object[]{sb})});
        if (((Integer) C0462.m1785n(33252, null, new Object[0])).intValue() <= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Integer) C0413.m1353n(9605, null, new Object[]{(String) C0447.m1650n(59112, null, new Object[]{(String) C0428.m1477n(88246)})})});
        }
    }
}
