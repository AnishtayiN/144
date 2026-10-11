package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0408;
import com.rootify.C0413;
import com.rootify.C0425;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0469;
import com.rootify.C0474;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.h */
/* loaded from: classes.dex */
public class RunnableC0343h implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2367short;

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0355b0 f2014b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(4268633)}[0], new Object[0])).intValue() ^ 4268618];
        sArr[0] = 1079;
        sArr[1] = 1069;
        sArr[2] = 1053;
        sArr[3] = 1118;
        sArr[4] = 1145;
        sArr[5] = 1123;
        sArr[6] = 1138;
        sArr[7] = 1125;
        sArr[8] = 1145;
        sArr[9] = 1142;
        sArr[10] = 1147;
        sArr[11] = 1079;
        sArr[12] = 1092;
        sArr[13] = 1123;
        sArr[14] = 1144;
        sArr[15] = 1125;
        sArr[16] = 1142;
        sArr[17] = 1136;
        sArr[18] = 1138;
        f2367short = sArr;
    }

    public RunnableC0343h(MainActivity.AsyncTaskC0355b0 asyncTaskC0355b0) {
        this.f2014b = asyncTaskC0355b0;
        if (((Integer) C0408.m1308n(78567, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Float) C0474.m1875n(13581, null, new Object[]{(String) C0447.m1650n(59112, null, new Object[]{(String) C0474.m1873n(11842)})})});
        }
    }

    /* renamed from: ۥۨۖۦۖۖۖ⁤ۖ⁤ۢۥۖۖ۟⁤۬ۤۖۥ, reason: contains not printable characters */
    public static short[] m2166() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (short[]) C0474.m1873n(23743);
        }
        return null;
    }

    /* renamed from: ۥۨ⁣⁤ۤۖۖ⁠ۥۖۧ⁤ۥ⁠⁠ۣ۟ۖ⁤ۥ, reason: contains not printable characters */
    public static String m2167(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0452.m1695n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥ⁣۬⁤⁤ۣ⁠ۖ⁤۬⁤ۣۖ⁣۟⁤ۖۖۥۣ, reason: contains not printable characters */
    public static int m2168(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        ProgressDialog progressDialog = (ProgressDialog) C0413.m1353n(96934, null, new Object[]{(MainActivity) C0474.m1875n(3248, null, new Object[]{(MainActivity.AsyncTaskC0355b0) C0474.m1875n(28487, null, new Object[]{this})})});
        StringBuilder sb = new StringBuilder();
        C0456.m1731n(86830, null, new Object[]{progressDialog, (String) C0469.m1839n(48310, null, new Object[]{sb})});
        if (((Integer) C0469.m1839n(8569, null, new Object[0])).intValue() <= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Float) C0474.m1875n(13581, null, new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0425.m1459n(97945)})})});
        }
    }
}
