package p038c.p042b;

import android.app.ProgressDialog;
import com.rootify.C0408;
import com.rootify.C0413;
import com.rootify.C0428;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0456;
import com.rootify.C0469;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.l */
/* loaded from: classes.dex */
public class RunnableC0347l implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0363f0 f2018b;

    public RunnableC0347l(MainActivity.AsyncTaskC0363f0 asyncTaskC0363f0) {
        this.f2018b = asyncTaskC0363f0;
        if (((Integer) C0408.m1308n(78567, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Double) C0469.m1839n(44213, null, new Object[]{(String) C0447.m1650n(59112, null, new Object[]{(String) C0428.m1477n(41598)})})});
        }
    }

    /* renamed from: ۥۖۖ⁤۟⁤⁤ۖۖ⁠ۖۢ⁤ۨۖۖۖ۬ۤۥ, reason: contains not printable characters */
    public static int m2178(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        Integer num = new Integer(1465002);
        MainActivity mainActivity = (MainActivity) C0428.m1479n(64624, null, new Object[]{(MainActivity.AsyncTaskC0363f0) C0428.m1479n(93914, null, new Object[]{this})});
        C0456.m1731n(86830, null, new Object[]{(ProgressDialog) C0413.m1353n(96934, null, new Object[]{mainActivity}), (String) C0469.m1839n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0428.m1479n(50445, null, new Object[]{(String) C0428.m1479n(16643, null, new Object[0])})).intValue() ^ (2131560535 ^ ((Integer) C0428.m1479n(50445, null, new Object[]{(String) C0428.m1479n(45847, null, new Object[0])})).intValue()))})});
        ((Integer[]) C0428.m1479n(87968, null, new Object[]{(MainActivity.AsyncTaskC0363f0) C0428.m1479n(93914, null, new Object[]{this})}))[0] = (Integer) C0428.m1479n(11703, null, new Object[]{Integer.valueOf(((Integer) C0469.m1839n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 1465003)});
    }
}
