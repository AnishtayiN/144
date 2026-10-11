package p038c.p042b;

import android.widget.TextView;
import com.rootify.C0413;
import com.rootify.C0452;
import com.rootify.C0462;
import com.rootify.C0469;
import com.rootify.C0475;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.b */
/* loaded from: classes.dex */
public class RunnableC0337b implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2362short;

    /* renamed from: b */
    public final /* synthetic */ TextView f2008b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(2882803)}[0], new Object[0])).intValue() ^ 2882785];
        sArr[0] = 1546;
        sArr[1] = 1622;
        sArr[2] = 1628;
        sArr[3] = 1622;
        sArr[4] = 1617;
        sArr[5] = 1600;
        sArr[6] = 1608;
        sArr[7] = 1546;
        sArr[8] = 1607;
        sArr[9] = 1616;
        sArr[10] = 1612;
        sArr[11] = 1609;
        sArr[12] = 1601;
        sArr[13] = 1547;
        sArr[14] = 1621;
        sArr[15] = 1623;
        sArr[16] = 1610;
        sArr[17] = 1621;
        f2362short = sArr;
    }

    public RunnableC0337b(MainActivity.AsyncTaskC0380v asyncTaskC0380v, TextView textView) {
        this.f2008b = textView;
        if (((Integer) C0469.m1839n(8569, null, new Object[0])).intValue() <= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Float) C0462.m1785n(7496, null, new Object[]{(String) C0452.m1695n(2816, null, new Object[]{(String) C0413.m1351n(89294)})})});
        }
    }

    /* renamed from: ۥۥ⁤ۤۖ⁠ۤۥ⁤ۧۖ⁠⁣ۖ⁠⁤⁣۠⁠⁤, reason: contains not printable characters */
    public static String m2151(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1695n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥ⁤۟⁤ۣ⁤⁤⁣⁠ۖ⁤⁠⁠ۖۥۣ⁤⁠ۜۨ, reason: contains not printable characters */
    public static int m2152(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۦ⁤⁠⁤ۥ۟ۥ۬⁠ۖ۠ۢۢ⁤۟⁤ۥۖۖۤ, reason: contains not printable characters */
    public static short[] m2153() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (short[]) C0413.m1351n(68244);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        TextView textView = (TextView) C0413.m1353n(27880, null, new Object[]{this});
        if (textView != null) {
            C0475.m1884n(43249, null, new Object[]{textView, (String) C0475.m1884n(12792, null, new Object[]{(String) C0413.m1353n(40018, null, new Object[]{(short[]) C0413.m1353n(56819, null, new Object[0]), Integer.valueOf(((Integer) C0413.m1353n(38398, null, new Object[]{(String) C0413.m1353n(25638, null, new Object[0])})).intValue() ^ 56354), Integer.valueOf(((Integer) C0413.m1353n(38398, null, new Object[]{(String) C0413.m1353n(21540, null, new Object[0])})).intValue() ^ 1754674), Integer.valueOf(1752065 ^ ((Integer) C0413.m1353n(38398, null, new Object[]{(String) C0413.m1353n(64779, null, new Object[0])})).intValue())})})});
        }
        if (((Integer) C0469.m1839n(8569, null, new Object[0])).intValue() <= 0) {
            C0413.m1353n(47446, (PrintStream) C0469.m1837n(12888), new Object[]{Long.valueOf(((Long) C0413.m1353n(90189, null, new Object[]{(String) C0452.m1695n(2816, null, new Object[]{(String) C0413.m1351n(39605)})})).longValue())});
        }
    }
}
