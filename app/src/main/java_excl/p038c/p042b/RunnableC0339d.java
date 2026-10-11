package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0408;
import com.rootify.C0413;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0469;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.d */
/* loaded from: classes.dex */
public class RunnableC0339d implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2363short;

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0353a0 f2010b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(4806424)}[0], new Object[0])).intValue() ^ 4806411];
        sArr[0] = 1010;
        sArr[1] = 1000;
        sArr[2] = 984;
        sArr[3] = 923;
        sArr[4] = 956;
        sArr[5] = 934;
        sArr[6] = 951;
        sArr[7] = 928;
        sArr[8] = 956;
        sArr[9] = 947;
        sArr[10] = 958;
        sArr[11] = 1010;
        sArr[12] = 897;
        sArr[13] = 934;
        sArr[14] = 957;
        sArr[15] = 928;
        sArr[16] = 947;
        sArr[17] = 949;
        sArr[18] = 951;
        f2363short = sArr;
    }

    public RunnableC0339d(MainActivity.AsyncTaskC0353a0 asyncTaskC0353a0) {
        this.f2010b = asyncTaskC0353a0;
        if (((Integer) C0469.m1839n(62495, null, new Object[0])).intValue() >= 0) {
            C0408.m1308n(80863, (PrintStream) C0469.m1837n(12888), new Object[]{(String) C0469.m1839n(11011, null, new Object[]{(String) C0413.m1351n(73911)})});
        }
    }

    /* renamed from: ۥۣۜۖ⁤ۖۜ۠ۢۗۥ⁣⁤ۧۖۖ⁤ۖ⁤⁠, reason: contains not printable characters */
    public static String m2154(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1695n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥ۟ۥ⁣ۖ⁤۟⁠ۖ⁤ۗۢ⁤⁤ۣۖ⁤⁤⁤⁤, reason: contains not printable characters */
    public static short[] m2155() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (short[]) C0413.m1351n(70009);
        }
        return null;
    }

    /* renamed from: ۦۥۖ۬ۖ⁤⁤⁠ۖۢ⁤ۧ⁤⁤ۗۧۤ⁠⁤⁤, reason: contains not printable characters */
    public static int m2156(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        ProgressDialog progressDialog = (ProgressDialog) C0413.m1353n(96934, null, new Object[]{(MainActivity) C0413.m1353n(59107, null, new Object[]{(MainActivity.AsyncTaskC0353a0) C0413.m1353n(7289, null, new Object[]{this})})});
        StringBuilder sb = new StringBuilder();
        C0456.m1731n(86830, null, new Object[]{progressDialog, (String) C0469.m1839n(48310, null, new Object[]{sb})});
        if (((Integer) C0469.m1839n(62495, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Double) C0469.m1839n(44213, null, new Object[]{(String) C0452.m1695n(2816, null, new Object[]{(String) C0456.m1729n(93261)})})});
        }
    }
}
