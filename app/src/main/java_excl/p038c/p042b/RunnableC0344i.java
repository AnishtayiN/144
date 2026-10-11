package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0413;
import com.rootify.C0425;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0462;
import com.rootify.C0469;
import com.rootify.C0474;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.i */
/* loaded from: classes.dex */
public class RunnableC0344i implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2368short;

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0355b0 f2015b;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(9417438)}[0], new Object[0])).intValue() ^ 9417421];
        sArr[0] = 2916;
        sArr[1] = 2942;
        sArr[2] = 2894;
        sArr[3] = 2817;
        sArr[4] = 2876;
        sArr[5] = 2864;
        sArr[6] = 2849;
        sArr[7] = 2870;
        sArr[8] = 2858;
        sArr[9] = 2853;
        sArr[10] = 2856;
        sArr[11] = 2916;
        sArr[12] = 2839;
        sArr[13] = 2864;
        sArr[14] = 2859;
        sArr[15] = 2870;
        sArr[16] = 2853;
        sArr[17] = 2851;
        sArr[18] = 2849;
        f2368short = sArr;
    }

    public RunnableC0344i(MainActivity.AsyncTaskC0355b0 asyncTaskC0355b0) {
        this.f2015b = asyncTaskC0355b0;
        if (((Integer) C0469.m1839n(8569, null, new Object[0])).intValue() <= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Long) C0447.m1650n(77284, null, new Object[]{(String) C0462.m1785n(68315, null, new Object[]{(String) C0425.m1459n(48190)})})});
        }
    }

    /* renamed from: ۥ۟ۜۤ۠ۡۤ⁣۬⁤⁠ۣۤۨۥ⁤ۢۥ۟ۖ, reason: contains not printable characters */
    public static String m2169(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1695n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥۣ⁤ۖ⁣ۖۖ⁤ۗۖ⁠ۣۜۖۥۖۜۤۖ⁤, reason: contains not printable characters */
    public static short[] m2170() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (short[]) C0425.m1459n(11403);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۢ⁤⁤⁤ۥۣۣۜۨ⁤ۖۧ⁤⁤ۖ⁤⁣⁤, reason: contains not printable characters */
    public static int m2171(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        ProgressDialog progressDialog = (ProgressDialog) C0413.m1353n(96934, null, new Object[]{(MainActivity) C0474.m1875n(3248, null, new Object[]{(MainActivity.AsyncTaskC0355b0) C0425.m1461n(5686, null, new Object[]{this})})});
        StringBuilder sb = new StringBuilder();
        C0456.m1731n(86830, null, new Object[]{progressDialog, (String) C0469.m1839n(48310, null, new Object[]{sb})});
    }
}
