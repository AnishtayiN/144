package p038c.p042b;

import android.widget.EditText;
import android.widget.ScrollView;
import com.rootify.C0402;
import com.rootify.C0409;
import com.rootify.C0413;
import com.rootify.C0453;
import com.rootify.C0462;
import com.rootify.C0469;
import com.rootify.MainActivity;
import java.io.PrintStream;

/* renamed from: c.b.o */
/* loaded from: classes.dex */
public class RunnableC0350o implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ MainActivity.AsyncTaskC0365g0 f2023b;

    public RunnableC0350o(MainActivity.AsyncTaskC0365g0 asyncTaskC0365g0) {
        this.f2023b = asyncTaskC0365g0;
        if (((Integer) C0462.m1785n(33252, null, new Object[0])).intValue() <= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Integer) C0413.m1353n(9605, null, new Object[]{(String) C0462.m1785n(68315, null, new Object[]{(String) C0453.m1702n(71825)})})});
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ((Boolean) C0453.m1704n(60490, null, new Object[]{(ScrollView) C0453.m1704n(19013, null, new Object[]{(MainActivity) C0409.m1317n(75294, null, new Object[]{(MainActivity.AsyncTaskC0365g0) C0453.m1704n(40278, null, new Object[]{this})})}), Integer.valueOf(((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(9923823)}[0], new Object[0])).intValue() ^ 9923693)})).booleanValue();
        ((Boolean) C0402.m1254n(94876, null, new Object[]{(EditText) C0453.m1704n(93720, null, new Object[]{(MainActivity) C0409.m1317n(75294, null, new Object[]{(MainActivity.AsyncTaskC0365g0) C0453.m1704n(40278, null, new Object[]{this})})})})).booleanValue();
    }
}
