package p038c.p042b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.rootify.C0400;
import com.rootify.C0405;
import com.rootify.C0408;
import com.rootify.C0409;
import com.rootify.C0433;
import com.rootify.C0452;
import com.rootify.C0462;
import com.rootify.C0469;
import com.rootify.C0471;
import com.rootify.MainActivity;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import p038c.p042b.RunnableC0349n;

/* renamed from: c.b.ۥۖۧۖۖ۬ۖۖ⁤⁠⁠ۢۥۥۣۖ۟ۤ⁣⁤, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0388 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2373short;

    /* renamed from: ۦۤۥۖۥۖۖۧۖ⁤ۥۖ⁣⁤⁤ۖ⁤⁤ۥ⁣, reason: contains not printable characters */
    public static int f2374 = 97;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(2097604)}[0], new Object[0])).intValue() ^ 2097606];
        sArr[0] = 1630;
        sArr[1] = 1055;
        f2373short = sArr;
    }

    /* renamed from: ۥۖۖۖ۠ۖۧۨ⁤ۣۖۖ۬ۗۧۦ⁤ۖۢۧ, reason: contains not printable characters */
    public static AlertDialog.Builder m2189(Object obj, Object obj2, Object obj3) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (AlertDialog.Builder) C0433.m1524n(17711, (AlertDialog.Builder) obj, new Object[]{(CharSequence) obj2, (DialogInterface.OnClickListener) obj3});
        }
        return null;
    }

    /* renamed from: ۥۖۖۖۨ⁤⁤ۣۗۖۗۖ۬⁤۬ۗ⁤⁣ۥ⁤, reason: contains not printable characters */
    public static void m2190(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            C0433.m1524n(55092, (Exception) obj, new Object[0]);
        }
    }

    /* renamed from: ۥۖۖۗۥۖ۬⁣⁤۟⁤⁤⁤ۧ⁤⁣⁠ۥۖۖ, reason: contains not printable characters */
    public static String m2191() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(15111);
        }
        return null;
    }

    /* renamed from: ۥۖۖ۟ۡ۟ۨ⁠⁤ۧ⁤ۖۥۖ⁤ۥ⁣ۜ⁤ۥ, reason: contains not printable characters */
    public static String m2192() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0433.m1522n(97816);
        }
        return null;
    }

    /* renamed from: ۥۖۖ۟ۥ⁤۟ۖۥ⁤ۖ⁤ۥۣۢ۠ۨۖ⁤⁤, reason: contains not printable characters */
    public static String m2193() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(41884);
        }
        return null;
    }

    /* renamed from: ۥۖۖۢ۟ۗۧ۬ۖۜ⁤ۣ⁤⁠ۥ۬ۢ⁠⁤⁠, reason: contains not printable characters */
    public static AsyncTask m2194(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (AsyncTask) C0433.m1524n(93387, (AsyncTask) obj, new Object[]{(Object[]) obj2});
        }
        return null;
    }

    /* renamed from: ۥۖۖۥۖ۟ۥۥۖۖ⁠ۤۥۣۤۤ⁤⁣ۖ⁤, reason: contains not printable characters */
    public static void m2195(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            C0433.m1524n(36128, (ProgressDialog) obj, new Object[0]);
        }
    }

    /* renamed from: ۥۖۖۥ۟⁤⁣ۖۥۖۥ⁠⁠ۖۥۥۡۗۡ⁣, reason: contains not printable characters */
    public static String m2196() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0433.m1522n(23874);
        }
        return null;
    }

    /* renamed from: ۥۖۖ۬ۡ⁤۬⁠⁠⁠ۥۧ⁣⁤⁤۠⁣ۖ⁤ۥ, reason: contains not printable characters */
    public static String m2197() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(98252);
        }
        return null;
    }

    /* renamed from: ۥۖۖ⁠⁠ۖ۠⁤ۤۥۣۖ⁤⁠⁣ۢۥۣۖ⁠, reason: contains not printable characters */
    public static String m2198() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(68177);
        }
        return null;
    }

    /* renamed from: ۥۖۖ⁠⁣ۢۥ⁤ۖ۠⁤ۣۥۥ⁤ۤ۬ۥۗ۟, reason: contains not printable characters */
    public static String m2199() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0433.m1522n(86649);
        }
        return null;
    }

    /* renamed from: ۥۖۖ⁣ۖ۟ۤ⁣⁠ۢۗۥ⁤⁤ۥۖۥۥۖ⁣, reason: contains not printable characters */
    public static String m2200() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(72519);
        }
        return null;
    }

    /* renamed from: ۥۖۖ⁣⁤⁠ۜۖ⁠ۖۦۖۨۖ⁤⁤ۜۨۖۢ, reason: contains not printable characters */
    public static String m2201() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(81685);
        }
        return null;
    }

    /* renamed from: ۥۖۖ⁤ۥ⁠⁠۟⁣⁤ۥ⁣ۗ⁣۠ۥۥۖ⁤ۧ, reason: contains not printable characters */
    public static String m2202() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(80405);
        }
        return null;
    }

    /* renamed from: ۥۖۗۧۥۨۨۖۧۜۤ⁠⁤⁠ۖۖ۬⁤۟ۥ, reason: contains not printable characters */
    public static String m2203() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0433.m1522n(79563);
        }
        return null;
    }

    /* renamed from: ۥۖۜ۬ۗۖۤۖ⁤ۣۤۢ۟ۨۖۧۖۖۥ⁠, reason: contains not printable characters */
    public static String m2204() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(8110);
        }
        return null;
    }

    /* renamed from: ۥۖ۟۬ۖ⁠⁣ۣۖۖ⁤⁠ۦ⁤۟۠⁠ۣۧۖ, reason: contains not printable characters */
    public static String m2205() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0433.m1522n(31164);
        }
        return null;
    }

    /* renamed from: ۥۖ۠ۥۤۨ⁠ۨ⁤ۥ⁤ۥۖۢۧۖ⁤ۣۖۥ, reason: contains not printable characters */
    public static String m2206() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0433.m1522n(91847);
        }
        return null;
    }

    /* renamed from: ۥۖ۠⁤⁠ۥ⁠ۣۣ۟ۖۧۖۖۖ⁤⁣⁣⁣⁠, reason: contains not printable characters */
    public static String m2207() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0433.m1522n(22756);
        }
        return null;
    }

    /* renamed from: ۥۖۡۥ⁣ۥ⁠⁠ۥ⁤ۥۥ⁤ۤ⁤ۢۖۢ⁤۟, reason: contains not printable characters */
    public static String m2208() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0433.m1522n(82288);
        }
        return null;
    }

    /* renamed from: ۥۣۖۖ⁤ۣۖ⁤⁤⁤ۤ⁤ۢۥۥۥۨ⁣ۗۧ, reason: contains not printable characters */
    public static String m2209() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0433.m1522n(81619);
        }
        return null;
    }

    /* renamed from: ۥۖۤ۬ۥ⁠ۣۖۖ⁤⁠ۖ⁤⁤ۥ⁣ۤ⁠⁠ۧ, reason: contains not printable characters */
    public static String m2210(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۥۖۤ⁤⁠ۗ۟⁤ۦۖۗ⁠⁤۠۠ۖ⁣ۖۖۥ, reason: contains not printable characters */
    public static String m2211() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0433.m1522n(83137);
        }
        return null;
    }

    /* renamed from: ۥۖۥۖ۬⁤⁠ۦۖۜ۟۬ۥۧۢ⁤⁤⁤ۥ⁣, reason: contains not printable characters */
    public static MainActivity m2212(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (MainActivity) C0433.m1523n(84137, (MainActivity.RunnableC0373o) obj);
        }
        return null;
    }

    /* renamed from: ۥۖۥۖ⁤⁤ۖ⁠⁤ۢ⁤ۖ⁤ۥۗ۟ۢۥۖ⁣, reason: contains not printable characters */
    public static void m2213(Object obj, int i) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0433.m1524n(50939, (MainActivity) obj, new Object[]{Integer.valueOf(i)});
        }
    }

    /* renamed from: ۥۖۥۥۥ۟ۖ⁠ۗ⁤⁣ۥ⁤ۢۥ⁤ۜ۬ۨۗ, reason: contains not printable characters */
    public static String m2214() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(87794);
        }
        return null;
    }

    /* renamed from: ۥۖۥۣ۬ۧ⁤ۖ۬ۗ⁤⁠ۤ⁠⁤ۖۥ⁣ۣۢ, reason: contains not printable characters */
    public static String m2215() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(97675);
        }
        return null;
    }

    /* renamed from: ۥۖۥ⁤ۣۢۢۖۧۢ⁠ۥۖۖ⁤ۥۤ⁣ۧۗ, reason: contains not printable characters */
    public static String m2216() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(42391);
        }
        return null;
    }

    /* renamed from: ۥۖۧۥۥ⁤⁠ۖ۠⁤⁣ۖۗ⁤⁠۬⁣ۨ⁤ۖ, reason: contains not printable characters */
    public static String m2217() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(27388);
        }
        return null;
    }

    /* renamed from: ۥۖۧ⁣⁣ۧ۬ۗۖۥۢۥۜ۟⁤⁠⁤⁠⁠ۣ, reason: contains not printable characters */
    public static TextView m2218(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (TextView) C0400.m1235n(52264, (RunnableC0336a) obj);
        }
        return null;
    }

    /* renamed from: ۥۖۧ⁤ۣۤۧۨۜ⁣⁤ۦۖ⁣۬⁠ۧ⁤ۥ⁠, reason: contains not printable characters */
    public static String m2219() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(13763);
        }
        return null;
    }

    /* renamed from: ۥۖۨ۟⁠۟⁤ۣۖۖۥ⁤ۥ⁤۬ۥۤۥ۠ۦ, reason: contains not printable characters */
    public static Object m2220(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return C0400.m1236n(27774, (AdapterView) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۖۨۥ⁠ۣۧۤۖۖۥۨۢ⁤⁣ۥۖۖۥ⁤, reason: contains not printable characters */
    public static TextView m2221(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (TextView) C0400.m1235n(96031, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۖۨ⁣ۥۖۖۨۥۣ⁤۟ۢ⁤ۣۖ⁠۬⁤⁠, reason: contains not printable characters */
    public static MainActivity m2222(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (MainActivity) C0400.m1235n(2938, (MainActivity.AsyncTaskC0363f0) obj);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠ۖۖۥۥ⁣۬ۥ⁤ۤۥ⁤ۣۖۖ۟ۖ⁤, reason: contains not printable characters */
    public static String m2223() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(56381);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠ۖۖ⁠ۖۦ⁤ۤۖ⁤⁣⁤ۥ۟ۖ⁣⁤ۖ, reason: contains not printable characters */
    public static String m2224() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(98216);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠ۖۖ⁤ۤ⁤ۖۢۖۢ⁤ۖ⁤⁤⁣⁠ۨ⁤, reason: contains not printable characters */
    public static String m2225() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(12538);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠ۥۦ⁠ۖ۬۬ۖ⁤⁤ۖ⁠ۖۜ۟ۖۗ۠, reason: contains not printable characters */
    public static String m2226() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(97668);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠ۥ⁤ۖ۠ۖۖۖ⁠⁤ۨ⁤ۖۖۥ۠ۧ⁤, reason: contains not printable characters */
    public static String m2227() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(68034);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠⁤ۖ۟ۖ⁤ۗۥ۠⁤ۢ⁣ۤ⁤⁤⁣ۤۜ, reason: contains not printable characters */
    public static String m2228() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(7245);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠⁤⁠ۥۥۥ⁤ۖ⁤ۗ⁠⁠ۗۧ۠⁤ۢۨ, reason: contains not printable characters */
    public static File m2229(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (File) C0400.m1235n(98347, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۖ⁣ۣ⁤⁠ۡۥۢۥ⁤⁠ۣۜۖۤۧ⁠⁣⁤, reason: contains not printable characters */
    public static String m2230() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(96332);
        }
        return null;
    }

    /* renamed from: ۥۖ⁣ۦۖ⁠ۥ⁤⁠⁠⁤ۣ⁤ۤۥۖ⁤ۣ⁤⁣, reason: contains not printable characters */
    public static String m2231() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(49803);
        }
        return null;
    }

    /* renamed from: ۥۖ⁣⁤ۢۖۗۗۧ⁠⁣ۣۣۗۢۧ۟⁣⁣ۗ, reason: contains not printable characters */
    public static MainActivity m2232(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (MainActivity) C0400.m1235n(10665, (MainActivity.AsyncTaskC0383y) obj);
        }
        return null;
    }

    /* renamed from: ۥۖ⁣⁤⁠⁤ۥۣ۟ۖ⁤⁠ۖ۟⁤ۣۣۨۖۡ, reason: contains not printable characters */
    public static DataInputStream m2233() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (DataInputStream) C0400.m1234n(73076);
        }
        return null;
    }

    /* renamed from: ۥۖ⁣⁤⁤⁤ۧۖ۟⁠ۤ⁤⁠ۖۖ⁠ۖ۬⁤ۣ, reason: contains not printable characters */
    public static String m2234() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(90986);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۖۖۖ۟۬ۖ⁣⁤⁤ۖۥ⁠⁤ۢ۟⁠ۣ, reason: contains not printable characters */
    public static String m2235() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(23177);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۖۗۖۖۗ⁤⁤⁠ۗۖ۠ۖۤۥۖ⁤ۢ, reason: contains not printable characters */
    public static String m2236() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(23017);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۗۗۨ⁠ۖۥ۠⁤ۜۖ⁤ۖۖ۟⁤ۣ۟, reason: contains not printable characters */
    public static String m2237() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(45631);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۣۤ⁠⁠ۖۗۤۖ⁠ۤ⁣ۣ⁤⁠ۖ⁣ۤ, reason: contains not printable characters */
    public static String m2238() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(37029);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۥۜۤۧ⁤⁠ۗۥ۬ۥۖ⁤۬ۢۥۨۧ, reason: contains not printable characters */
    public static String m2239() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(63253);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۥۤ⁠⁠⁣⁤⁣⁣⁤ۥۖۥ⁤ۤۖۖۖ, reason: contains not printable characters */
    public static String m2240() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(62433);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤⁠⁣⁤ۤۖۥ⁠ۢۧۗۤۥۣۖۖۖۖ, reason: contains not printable characters */
    public static void m2241(Object obj, int i, int i2, int i3, int i4) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            C0400.m1236n(42383, (LinearLayout.LayoutParams) obj, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        if (((Integer) C0462.m1785n(33252, null, new Object[0])).intValue() <= 0) {
            C0408.m1308n(19859, (PrintStream) C0469.m1837n(12888), new Object[]{Integer.valueOf(((Integer) C0408.m1308n(46321, null, new Object[]{(String) C0462.m1785n(68315, null, new Object[]{(String) C0400.m1234n(39821)})})).intValue())});
        }
    }

    /* renamed from: ۥۖ⁤⁠⁤ۣ⁠⁤ۥۖۤ۠۟⁣ۨۖ⁣ۥۣۜ, reason: contains not printable characters */
    public static String m2242() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(57292);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤⁣⁤⁤ۖ⁤⁤ۣ⁠⁤۟⁤ۧ۠ۤۖ۬ۖ, reason: contains not printable characters */
    public static void m2243() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            C0400.m1236n(47253, null, new Object[0]);
        }
    }

    /* renamed from: ۥۖ⁤⁤⁤⁠ۖۥ۠ۗۖ⁠ۤ⁠ۨۥۥ⁤ۖ۟, reason: contains not printable characters */
    public static String m2244() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(27890);
        }
        return null;
    }

    /* renamed from: ۥۗۖۢ⁠⁤ۨۗۢۖۖ⁤ۤ⁤⁠ۣۣۖۡۥ, reason: contains not printable characters */
    public static String m2245() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(91228);
        }
        return null;
    }

    /* renamed from: ۥۗ۠ۗۢ۟⁤ۖ⁣⁤ۖۖۢۥۣ۟ۖۧۦ⁤, reason: contains not printable characters */
    public static long m2246(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return ((Long) C0400.m1235n(78037, (ActivityManager.MemoryInfo) obj)).longValue();
        }
        return 0L;
    }

    /* renamed from: ۥۗۤۧۥ⁣⁤۟ۖۨۖۡ⁤⁠ۥ⁣⁤ۖۨ⁤, reason: contains not printable characters */
    public static String m2247() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(52500);
        }
        return null;
    }

    /* renamed from: ۥۜۖ۟⁠ۧ⁠ۥۥۖۖۖۖۥۥۖۖۖۖ۠, reason: contains not printable characters */
    public static String m2248(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1235n(98868, (MainActivity.RunnableC0358d) obj);
        }
        return null;
    }

    /* renamed from: ۥۜ⁠ۧۖۗۜ⁤ۧۢۢۨ⁠ۧۧۥ۟⁤⁤⁠, reason: contains not printable characters */
    public static void m2249(Object obj, Object obj2, int i, int i2) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0400.m1236n(61330, null, new Object[]{(MainActivity) obj, (Integer[]) obj2, Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    /* renamed from: ۥۜ⁠⁤ۖۖ⁤⁤⁠ۖۥۖ۬ۤ⁣ۥ⁠ۥۥۤ, reason: contains not printable characters */
    public static String m2250() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(62253);
        }
        return null;
    }

    /* renamed from: ۥ۟ۖۖۖ⁣⁤ۖۢ⁤ۖ۠⁣⁠ۧۖ⁤⁤۬⁤, reason: contains not printable characters */
    public static String m2251() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(48775);
        }
        return null;
    }

    /* renamed from: ۥ۟ۖ۟ۖۖۖ⁣ۧ⁤ۧ⁣⁤⁠۠⁤ۢ۬⁤ۖ, reason: contains not printable characters */
    public static void m2252(Object obj, int i) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0400.m1236n(24628, (ProgressBar) obj, new Object[]{Integer.valueOf(i)});
        }
        if (((Integer) C0469.m1839n(62495, null, new Object[0])).intValue() >= 0) {
            C0409.m1317n(51197, (PrintStream) C0469.m1837n(12888), new Object[]{Double.valueOf(((Double) C0409.m1317n(33161, null, new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0400.m1234n(30048)})})).doubleValue())});
        }
    }

    /* renamed from: ۥۣ۟ۖۖ⁤ۣۗۨ۟ۖۖ⁣۬⁠⁠ۦۖۖۗ, reason: contains not printable characters */
    public static String m2253() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(19304);
        }
        return null;
    }

    /* renamed from: ۥ۟ۖۧ⁤⁣۠ۢ⁠ۖۖۖ۬ۖ⁠ۖ⁤ۧ۟⁤, reason: contains not printable characters */
    public static String m2254() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(32977);
        }
        return null;
    }

    /* renamed from: ۥ۟ۤۖ⁤ۤۖۗ۟⁣⁣ۥۖ⁤ۢ⁠⁤⁤⁤ۥ, reason: contains not printable characters */
    public static String m2255() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(16774);
        }
        return null;
    }

    /* renamed from: ۥ۟⁤ۦ۟ۖ⁠ۖ⁠ۥ۟۟۟ۖۖ⁣ۖ⁤ۖ⁤, reason: contains not printable characters */
    public static String m2256() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(58374);
        }
        return null;
    }

    /* renamed from: ۥ۠ۖۥ۟ۗ⁣⁠ۖ⁤ۖۥ⁤⁤⁠⁤ۣۖۖۖ, reason: contains not printable characters */
    public static String m2257() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(9160);
        }
        return null;
    }

    /* renamed from: ۥ۠ۖ⁣ۥۖۥۖۢۧۖۖ۠ۡ⁤ۥ⁠⁤⁤ۜ, reason: contains not printable characters */
    public static String m2258() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(5702);
        }
        return null;
    }

    /* renamed from: ۥ۠ۗ⁤⁤ۨ⁤ۤ۠⁠⁣⁤⁣ۖۨۖۧۖ⁤⁤, reason: contains not printable characters */
    public static String m2259() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(2745);
        }
        return null;
    }

    /* renamed from: ۥ۠⁠ۖۥ⁤ۣ۬ۤۢۖ⁤ۖ۬⁠ۤۖ⁤ۖ⁤, reason: contains not printable characters */
    public static File m2260(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (File) C0400.m1236n(83208, (Activity) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۣۡۦۣ⁠۟ۖۗۖۖۢ⁤⁤ۖۖۖۦۤۧ, reason: contains not printable characters */
    public static String m2261() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(46421);
        }
        return null;
    }

    /* renamed from: ۥۢۖۖ⁤ۣ⁠۟۬⁣ۣ⁠⁠ۖۖۢۖۤۥۖ, reason: contains not printable characters */
    public static void m2262(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            C0400.m1236n(43668, (SharedPreferences.Editor) obj, new Object[0]);
        }
    }

    /* renamed from: ۥۢۖ⁤ۗۧۤۖۖۥ⁤⁣⁤ۥ⁠⁠⁤⁤⁤ۥ, reason: contains not printable characters */
    public static StringBuilder m2263(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (StringBuilder) C0400.m1235n(68393, (MainActivity.AsyncTaskC0359d0) obj);
        }
        return null;
    }

    /* renamed from: ۥۢۖ⁤ۥۡۖ⁤⁤ۗۧ⁠⁠ۥ⁤⁤ۖۨ⁤ۢ, reason: contains not printable characters */
    public static String m2264() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(6312);
        }
        return null;
    }

    /* renamed from: ۥۢۤۖۥۣۤۨ۠۟ۗ⁠⁤⁤⁤ۢۨ⁠ۗ۬, reason: contains not printable characters */
    public static String m2265() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(47271);
        }
        return null;
    }

    /* renamed from: ۥۢۥۣ⁠ۖ⁤⁣⁤۟ۥۣۖۧۖۤ⁤ۖ۠ۖ, reason: contains not printable characters */
    public static String m2266(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1236n(91627, null, new Object[]{(MainActivity) obj, (String) obj2});
        }
        return null;
    }

    /* renamed from: ۥۢ⁠ۖ۬ۗۤۜۖ⁠ۥۣ۟ۥۢ⁤ۢۥۣۖ, reason: contains not printable characters */
    public static String m2267() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(46450);
        }
        return null;
    }

    /* renamed from: ۥۢ⁠⁤ۣۡۖ⁤ۣ۬۬ۗ⁣⁤ۜۖ⁣۬ۥ۟, reason: contains not printable characters */
    public static int m2268() {
        return ((Integer) C0452.m1695n(65372, null, new Object[]{(String) C0433.m1522n(97816)})).intValue() ^ 1752591;
    }

    /* renamed from: ۥۢ⁤ۦۨ⁠⁠⁠ۨۢ⁠⁤⁠⁣⁣⁤⁠ۖ⁤ۖ, reason: contains not printable characters */
    public static String m2269() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(49907);
        }
        return null;
    }

    /* renamed from: ۥۣۗۢۖۖۖ⁠ۖ⁤⁤⁤ۗۧ⁤ۣۖۖ⁤ۖ, reason: contains not printable characters */
    public static String m2270() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(16185);
        }
        return null;
    }

    /* renamed from: ۥۣ۟ۥ⁣⁠ۥۣ۟ۥ⁣ۖ⁤ۥۖ⁤ۣ۟ۖۡ, reason: contains not printable characters */
    public static String m2271(Object obj, Object obj2, Object obj3) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1236n(78162, (String) obj, new Object[]{(String) obj2, (String) obj3});
        }
        return null;
    }

    /* renamed from: ۥۣ۟⁤ۖ⁤⁠⁤⁣۬ۖۥۖۖۖۖۤۖ⁤ۨ, reason: contains not printable characters */
    public static String m2272() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(88560);
        }
        return null;
    }

    /* renamed from: ۥۣ۠⁤⁤ۖۥ⁤⁤⁤ۤۢ۟ۖ۟⁤ۤۖۗ⁠, reason: contains not printable characters */
    public static int m2273(int i, int i2) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return ((Integer) C0400.m1236n(76954, null, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۣۢ۬ۢۥ⁤⁣ۥ⁤⁤⁠⁤ۢ⁤ۥ۠ۖۥۨ, reason: contains not printable characters */
    public static void m2274(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            C0400.m1236n(36986, (Spinner) obj, new Object[]{(SpinnerAdapter) obj2});
        }
        if (((Integer) C0462.m1785n(33252, null, new Object[0])).intValue() <= 0) {
            C0408.m1308n(80863, (PrintStream) C0469.m1837n(12888), new Object[]{(String) C0469.m1839n(11011, null, new Object[]{(String) C0400.m1234n(69491)})});
        }
    }

    /* renamed from: ۥۣۣۤ⁠ۖۥۥۥ⁤ۖۡ۟⁠۟⁤ۖۦۥ⁠, reason: contains not printable characters */
    public static void m2275(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            C0400.m1236n(35240, (ActivityManager) obj, new Object[]{(ActivityManager.MemoryInfo) obj2});
        }
    }

    /* renamed from: ۥۣ⁠۠ۖ⁤۠۬ۖ⁤ۤۗ⁣⁤۟ۗ⁤⁠ۥۣ, reason: contains not printable characters */
    public static File m2276() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (File) C0400.m1236n(12268, null, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۣ⁤⁤۠ۖۤۥۖۖۥۢۤ⁣⁣⁠ۨۨۖۥ, reason: contains not printable characters */
    public static String m2277(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1695n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥۤۖۗۢۖ⁣۟۟ۢ⁤ۥ⁤ۗ⁤⁤ۗۖۦ⁤, reason: contains not printable characters */
    public static String m2278() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(39259);
        }
        return null;
    }

    /* renamed from: ۥۤۖ⁤ۣۨۖ⁣ۣۖ⁤⁤⁣ۣ۟⁠ۥۜ⁤⁤, reason: contains not printable characters */
    public static String m2279() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(8856);
        }
        return null;
    }

    /* renamed from: ۥۤۖ⁤⁤⁤ۢ⁤ۖۨۖۥ۟ۥ⁤ۥ⁣ۧۥۢ, reason: contains not printable characters */
    public static String m2280() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(86529);
        }
        return null;
    }

    /* renamed from: ۥۤۤ⁣⁤ۣۥ⁤ۢۤ⁤⁣⁤ۦ⁤⁣⁠ۖۖ⁤, reason: contains not printable characters */
    public static String m2281() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(61242);
        }
        return null;
    }

    /* renamed from: ۥۤۥۖ⁠ۜ⁤⁤⁤ۖۢ⁠ۥۖۧۢ⁠ۖ۬⁤, reason: contains not printable characters */
    public static String m2282() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(76798);
        }
        return null;
    }

    /* renamed from: ۥۤ⁣ۣۨۗۖ⁣ۗ⁤ۥۖۖ⁤ۤ⁤⁤ۗ۬⁠, reason: contains not printable characters */
    public static String m2283() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(56835);
        }
        return null;
    }

    /* renamed from: ۥۤ⁣⁤⁤ۨۥ⁤ۣ⁤⁠۟۬⁤ۖۖ⁤ۖۖۖ, reason: contains not printable characters */
    public static String m2284() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(87010);
        }
        return null;
    }

    /* renamed from: ۥۥۖۖۖۖ⁤⁤ۖ⁤⁣⁤ۥ۟ۖۢۢۢۖۢ, reason: contains not printable characters */
    public static String m2285() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(98988);
        }
        return null;
    }

    /* renamed from: ۥۥۖۖ⁠ۖ⁠⁤ۣۣۖۨ۬ۧ⁤⁤⁠⁣ۣۨ, reason: contains not printable characters */
    public static String m2286() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(66353);
        }
        return null;
    }

    /* renamed from: ۥۥۖ۟ۖۖۤۥۣۖ⁤ۖ⁠ۗ⁤⁠۠⁣ۖ⁣, reason: contains not printable characters */
    public static long m2287(Object obj, long j) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return ((Long) C0400.m1236n(7653, (InputStream) obj, new Object[]{Long.valueOf(j)})).longValue();
        }
        return 0L;
    }

    /* renamed from: ۥۥۖۥۣۖۥ⁣⁠⁤ۗ⁣⁣⁠⁠ۧ⁤⁤ۖۜ, reason: contains not printable characters */
    public static void m2288(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0400.m1236n(69576, (MainActivity) obj, new Object[0]);
        }
    }

    /* renamed from: ۥۥۖۥۢ⁤⁠ۥۥ۟⁤ۥۖۖۖ۟۟⁤ۣۗ, reason: contains not printable characters */
    public static String m2289() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(56763);
        }
        return null;
    }

    /* renamed from: ۥۥۖ⁤ۖۖ⁠ۥ۟ۧ⁤۟ۖۜۢ۬ۜۨۦۗ, reason: contains not printable characters */
    public static String m2290() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(60366);
        }
        return null;
    }

    /* renamed from: ۥۥۖ⁤ۥۢۨ⁤ۢ⁠⁤ۡ⁤ۜۧ⁠ۦۖ⁤⁤, reason: contains not printable characters */
    public static MainActivity.AsyncTaskC0365g0 m2291(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (MainActivity.AsyncTaskC0365g0) C0400.m1235n(58459, (RunnableC0349n) obj);
        }
        return null;
    }

    /* renamed from: ۥۥۗۥۖۧ⁠ۥ⁠ۖ⁤ۖۤ⁣ۨۤ⁤ۣ⁤⁠, reason: contains not printable characters */
    public static String m2292() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(85907);
        }
        return null;
    }

    /* renamed from: ۥۥ۟ۧ۬ۧ⁤⁠ۖۢۥۣۖۖ۠ۖۥۢۗ⁣, reason: contains not printable characters */
    public static String m2293(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1236n(41418, (String) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۥ۠⁠ۖ⁠⁤ۨ۟ۢ⁣ۖ۟⁠ۜۤۥ⁤ۖ۬, reason: contains not printable characters */
    public static String m2294() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(30972);
        }
        return null;
    }

    /* renamed from: ۥۥ۠⁠ۥۥۗ⁠⁣ۥۖۖۖ⁣۟۠⁤⁠⁤ۗ, reason: contains not printable characters */
    public static String m2295() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(51395);
        }
        return null;
    }

    /* renamed from: ۥۥ۠⁤ۜۢۥ⁤⁤۟ۗ۟ۢۖ⁠ۖۧۖۖ⁤, reason: contains not printable characters */
    public static String m2296() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(62389);
        }
        return null;
    }

    /* renamed from: ۥۥۣۖ۬⁠⁤⁤ۥۧ⁠⁠⁤ۥ۟ۤۧۤ⁤ۥ, reason: contains not printable characters */
    public static String m2297() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(95861);
        }
        return null;
    }

    /* renamed from: ۥۥۣۤۖ⁣ۣ⁤ۥۗ⁠ۖ⁠⁤ۤ⁠ۖ⁣⁤ۣ, reason: contains not printable characters */
    public static String m2298() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(10861);
        }
        return null;
    }

    /* renamed from: ۥۥۤ۟⁤ۣۥ⁠ۖ⁠ۥ۟ۖۥۥۖ⁤۬ۤ۟, reason: contains not printable characters */
    public static String m2299() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(82131);
        }
        return null;
    }

    /* renamed from: ۥۥۥ⁤ۖۥ⁤⁤ۡۨ⁤⁤⁤ۖۥ⁤ۖ⁤ۡۥ, reason: contains not printable characters */
    public static MainActivity m2300(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (MainActivity) C0400.m1235n(66957, (MainActivity.RunnableC0352a) obj);
        }
        return null;
    }

    /* renamed from: ۥۥۦۥۥۢ⁤ۢۖۨۦۣ⁠ۢ⁣⁤ۥ⁠⁠ۥ, reason: contains not printable characters */
    public static String m2301() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(65167);
        }
        return null;
    }

    /* renamed from: ۥۥۧۜ۟ۥ⁤۠⁠ۣ۬⁤ۣۥۤۖ⁤ۢ⁠⁣, reason: contains not printable characters */
    public static String m2302() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(62811);
        }
        return null;
    }

    /* renamed from: ۥۥۨ۟ۖ⁤ۖۖ⁤⁤⁤ۖۥۥۖۖ۬ۗۨۖ, reason: contains not printable characters */
    public static String m2303() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(87834);
        }
        return null;
    }

    /* renamed from: ۥۥۨ⁣ۥۥۤۧ۟⁤⁠ۣۖۖۖۖ⁤⁤ۖ⁣, reason: contains not printable characters */
    public static String m2304() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(1818);
        }
        return null;
    }

    /* renamed from: ۥۥ⁠ۖ۠ۖ⁤ۖۨۖ⁤⁠⁣ۥ⁤⁤⁤ۖ⁤ۤ, reason: contains not printable characters */
    public static String m2305() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(46302);
        }
        return null;
    }

    /* renamed from: ۥۥ⁠ۖ⁠ۤۥۖۧ۬۬ۧ⁠۠ۤۥۥ⁠ۖ۠, reason: contains not printable characters */
    public static String m2306() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(71085);
        }
        return null;
    }

    /* renamed from: ۥۥ⁠⁣ۨۤ⁤⁣ۣۤ⁤ۖ۠ۖۤۦ⁤۟ۢ۟, reason: contains not printable characters */
    public static String m2307() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(65465);
        }
        return null;
    }

    /* renamed from: ۥۥ⁤ۨ۟⁤ۣۖۖۖ⁤⁤ۗ⁠⁤ۣۥ⁤⁤ۖ, reason: contains not printable characters */
    public static ScrollView m2308(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (ScrollView) C0400.m1235n(80453, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۥ⁤⁤⁤ۥ⁤ۖۥ⁠⁣⁣ۖۖ⁠ۨ⁣۟⁣⁤, reason: contains not printable characters */
    public static short[] m2309() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (short[]) C0400.m1234n(27988);
        }
        return null;
    }

    /* renamed from: ۥۦۨ⁠ۖۗ⁤⁤⁠⁤⁠⁠۠⁣⁠ۖ⁤ۨۥ⁤, reason: contains not printable characters */
    public static String m2310() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(32056);
        }
        return null;
    }

    /* renamed from: ۥۦ⁤⁤⁤⁠ۨ⁣ۣۗۤۖۖۖۥ⁤ۨ⁠ۗ⁤, reason: contains not printable characters */
    public static String m2311() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(16907);
        }
        return null;
    }

    /* renamed from: ۥۧۖ۠ۖۢ⁤ۥۥۣۖ۠⁤ۣۣ⁤ۣ۟ۖۖ, reason: contains not printable characters */
    public static Spinner m2312(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (Spinner) C0400.m1235n(39047, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۧۖۢ۟⁤ۖ⁠ۖ⁤⁤⁠⁠ۗ۟ۨۖۖۧۥ, reason: contains not printable characters */
    public static String m2313() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(31198);
        }
        return null;
    }

    /* renamed from: ۥۧ۟ۥۥۖۗ⁣ۥ⁠⁤⁣ۖ۬⁤۬ۖۜۥۧ, reason: contains not printable characters */
    public static String m2314() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(58613);
        }
        return null;
    }

    /* renamed from: ۥۣۧۧ۟ۤۖ⁤ۖ⁤۠⁤⁠⁠⁤ۣ⁤⁣ۖۖ, reason: contains not printable characters */
    public static LinearLayout.LayoutParams m2315(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (LinearLayout.LayoutParams) C0400.m1235n(85583, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۧ۬ۖۖۥ۬⁤ۥۖ⁠⁣ۢ۟ۗ⁤ۤۨ⁠⁣, reason: contains not printable characters */
    public static String m2316() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(26494);
        }
        return null;
    }

    /* renamed from: ۥۧ⁣⁤ۧ۟ۖ⁤ۣۢۖۖ⁤۬ۖۗ⁠۟⁤۬, reason: contains not printable characters */
    public static String m2317() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(6422);
        }
        return null;
    }

    /* renamed from: ۥۨۖۖ⁤⁤⁣⁣⁤ۦ⁠⁠⁠⁤⁠ۣۖ⁤ۖۖ, reason: contains not printable characters */
    public static boolean m2318(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return ((Boolean) C0400.m1236n(80862, (String) obj, new Object[]{obj2})).booleanValue();
        }
        return false;
    }

    /* renamed from: ۥۨۗ⁣ۨۤ۬⁤ۤ⁣ۖۥۖۖۖۜ⁤۟ۗۧ, reason: contains not printable characters */
    public static String m2319() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(52275);
        }
        return null;
    }

    /* renamed from: ۥۨۡ⁠ۢۥۤ⁣ۥۖ⁣⁤⁤۟ۖۗۖۥۥ⁤, reason: contains not printable characters */
    public static String m2320() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(35148);
        }
        return null;
    }

    /* renamed from: ۥۨ⁣ۥ⁠⁤⁠⁠ۖ⁣ۢۖ⁣ۤۗۥ۟ۖ⁠ۗ, reason: contains not printable characters */
    public static String m2321() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(28602);
        }
        return null;
    }

    /* renamed from: ۥۨ⁤ۖۜ⁤ۖۥ۬ۖۦۖۥۤۥۖۜۜ⁠ۖ, reason: contains not printable characters */
    public static String m2322() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(80862);
        }
        return null;
    }

    /* renamed from: ۥۨ⁤⁠⁤⁤⁤۟⁤⁠⁤ۤۨ⁤ۖ⁣⁣⁤ۖۖ, reason: contains not printable characters */
    public static Runtime m2323() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (Runtime) C0400.m1234n(94792);
        }
        return null;
    }

    /* renamed from: ۥ۬ۖ۬۟⁤⁠ۢۗۖ⁠⁣ۖۖۥ۠۟⁠ۦۥ, reason: contains not printable characters */
    public static String m2324() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(52786);
        }
        return null;
    }

    /* renamed from: ۥۣ۬⁤ۥۥۖۜۖۖ⁤ۥ⁠⁤ۗ۟⁣ۖ⁠⁤, reason: contains not printable characters */
    public static String m2325() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(44935);
        }
        return null;
    }

    /* renamed from: ۥ۬ۥ⁠⁤⁤ۖۤۤۥ۬ۥۥۥ⁤ۖۥ۟⁠ۖ, reason: contains not printable characters */
    public static String m2326() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(10991);
        }
        return null;
    }

    /* renamed from: ۥ۬ۧۖ⁣۬⁣ۖۖۖ⁣ۦۥۗۖ⁣۟ۥ⁤⁠, reason: contains not printable characters */
    public static String m2327(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1236n(77365, null, new Object[]{(String) obj});
        }
        return null;
    }

    /* renamed from: ۥ۬⁠⁤ۖۨۦۖۥۥۥ⁤ۥ⁤ۧ⁤ۖۢۖ⁠, reason: contains not printable characters */
    public static String m2328() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(16733);
        }
        return null;
    }

    /* renamed from: ۥ۬⁠⁤⁠⁠⁣ۤ⁤۬ۖۖۖ۠⁤⁣⁤ۖۢ⁠, reason: contains not printable characters */
    public static String m2329() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(18567);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖۖۖ۠۟ۥۜۥ⁤ۣ⁤ۢۢ⁠⁠⁤ۢ⁤, reason: contains not printable characters */
    public static String m2330() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(3122);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖۖ⁤⁤ۤ۬⁤ۥ⁤ۣۖۖۥۧۖۖۗ⁣, reason: contains not printable characters */
    public static String m2331() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(36765);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖۢ⁠ۨۤ⁤ۥۢ⁤ۥۤ⁤ۢۖۗ⁤⁠ۖ, reason: contains not printable characters */
    public static void m2332(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            C0400.m1236n(94507, (LinearLayout) obj, new Object[]{(ViewGroup.LayoutParams) obj2});
        }
    }

    /* renamed from: ۥ⁠ۖۥۤ⁣ۖۥ۬⁠⁤ۥ⁣ۥ۠ۖۜۖۖۥ, reason: contains not printable characters */
    public static String m2333(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1236n(21891, null, new Object[]{(String) obj});
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖۧۖ۟⁤ۗۧ⁤ۤ⁤ۤ⁣ۥۣۧۤ⁤ۣ, reason: contains not printable characters */
    public static String m2334() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(58508);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖ⁣⁠⁤ۣۣۖۧ⁣ۣۖۗ⁠ۖۤۥۖۗ, reason: contains not printable characters */
    public static MainActivity m2335(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (MainActivity) C0400.m1235n(12252, (MainActivity.C0368j) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۣۗ⁠⁤ۥ⁣ۣ⁤⁤ۖ۟ۢۧ⁤ۥ۠ۖۢ, reason: contains not printable characters */
    public static String m2336() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(93131);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۗ⁤⁣ۢۖۖۖۖ۬۬ۥۣۥ۟⁠⁤⁤ۜ, reason: contains not printable characters */
    public static String m2337() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(94707);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۜ⁠ۣ⁠ۣ۠ۢ۟۟ۤ⁤ۡۨۥۖ⁠⁤ۧ, reason: contains not printable characters */
    public static int m2338(Object obj, int i) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return ((Integer) C0452.m1695n(49356, (String) obj, new Object[]{Integer.valueOf(i)})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥ⁠۟⁤ۨ۟ۖۤ⁠ۤۥ⁤ۧ⁣ۣ⁤⁣ۥ۟ۖ, reason: contains not printable characters */
    public static String m2339() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(53085);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۣ⁠ۖ⁤ۣۖ۟ۖ⁠۟ۖۧ۬ۥ⁠۟ۖ۟, reason: contains not printable characters */
    public static NamedNodeMap m2340(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (NamedNodeMap) C0400.m1236n(61659, (Node) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۤۤ۠ۢ⁤ۥۥ⁣۟ۦۖ⁤۠۟⁣ۖ⁠⁤, reason: contains not printable characters */
    public static String m2341() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(25466);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۤۤۢۖۤۖۖۤ⁠⁤⁤⁠ۥ۬⁠ۗۗۤ, reason: contains not printable characters */
    public static String m2342() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(27846);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۤ⁠⁣ۖۨ⁤ۨۥۤ⁠ۖ⁤⁤ۦ⁤ۥ⁣ۖ, reason: contains not printable characters */
    public static String m2343() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(17819);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۥۢۖۥ۠⁤۟ۖۖ⁤ۣۖ۟۟⁤ۥۢۥ, reason: contains not printable characters */
    public static String m2344() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(12501);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۥۣۢۥ⁣ۣۥ⁤ۥۢۤ⁣⁣۟ۖ۟ۥۣ, reason: contains not printable characters */
    public static String m2345() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(50168);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۥ⁤۬۬⁣⁤ۖۖ⁤ۖ۠ۖۖ⁣ۥۥ⁠ۨ, reason: contains not printable characters */
    public static String m2346() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(32554);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۨۥ⁠⁣ۖۥۣ۠۬⁤⁣۠⁤ۖۖ⁤ۥۨ, reason: contains not printable characters */
    public static String m2347() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(95617);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۨ⁠⁠⁠ۣۦۣۧۥۖ۠⁣ۣۖۖ⁣ۥ۟, reason: contains not printable characters */
    public static String m2348() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(74712);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۨ⁤⁠ۥ⁤ۜۦۖۨ⁠۬ۥۗۨۖ⁤ۣۖ, reason: contains not printable characters */
    public static String m2349() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(80508);
        }
        return null;
    }

    /* renamed from: ۥ⁠۬⁠ۥۖ⁠⁤ۖ⁠⁠ۢ⁤ۖۥۖ⁠ۖ⁠⁤, reason: contains not printable characters */
    public static CheckBox m2350(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (CheckBox) C0400.m1235n(42656, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁠ۣ⁠۟۠ۢ⁤ۖۖۧۥۤۥ⁤ۖ⁣⁣ۣ, reason: contains not printable characters */
    public static String m2351() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(86297);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁠ۥۖ⁤ۧ⁠⁤۬۠⁤ۥۤ⁠۬ۤ⁣ۣۖ, reason: contains not printable characters */
    public static String m2352() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(80232);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁠ۧۖ⁤⁣ۖ⁣ۣۜ⁤⁤⁠⁤⁤⁤⁠ۡ⁣, reason: contains not printable characters */
    public static String m2353() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(56148);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁠⁣ۧ⁤۬ۤ۟ۥ۟ۖۗۥۖۧۖ۬⁤ۜ, reason: contains not printable characters */
    public static String m2354() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0400.m1234n(25000);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁤ۖۖۨۖ⁠⁤ۥۣۗۖ⁠ۖۤ⁤⁤ۗ⁠, reason: contains not printable characters */
    public static String m2355() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(65761);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁤ۖۥۗۥۖۖۧۥۥۢ⁤ۥۣۖ⁣۬⁤, reason: contains not printable characters */
    public static String m2356() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0400.m1234n(68232);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁤ۣۢ⁣ۥ⁤⁠⁠ۧ⁤ۣ⁠⁠ۤ⁤۬⁤ۖ, reason: contains not printable characters */
    public static String m2357() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0400.m1234n(81553);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁤۬ۥۤ⁤⁤ۖ۟ۗۖۖۢ⁤ۖۤ⁠ۖۧ, reason: contains not printable characters */
    public static String m2358() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0400.m1234n(53134);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁤⁤⁣ۤ۬⁤ۨۖۦ⁤ۖۖۖ⁤ۥ⁣ۖۗ, reason: contains not printable characters */
    public static String m2359(String str) {
        String str2;
        String str3;
        String str4;
        Integer num = new Integer(9084987);
        String str5 = (String) C0462.m1785n(93145, null, new Object[0]);
        String str6 = (String) C0462.m1785n(93145, null, new Object[0]);
        int i = 0;
        while (true) {
            str2 = str6;
            str3 = str5;
            if (i >= 15) {
                break;
            }
            str5 = (String) C0471.m1857n(61514, null, new Object[]{(StringBuffer) C0471.m1857n(94056, null, new Object[]{(StringBuffer) C0471.m1857n(94056, null, new Object[]{new StringBuffer(), str3}), (String) C0471.m1857n(56845, null, new Object[]{Integer.valueOf(i)})})});
            str6 = (String) C0471.m1857n(61514, null, new Object[]{(StringBuffer) C0471.m1857n(4425, null, new Object[]{(StringBuffer) C0471.m1857n(94056, null, new Object[]{new StringBuffer(), str2}), Integer.valueOf(((int) (((Double) C0471.m1857n(22788, null, new Object[0])).doubleValue() * 10)) ^ i)})});
            i++;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((Integer) C0462.m1785n(8451, null, new Object[]{str})).intValue() / (((Integer) C0469.m1839n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 9084985));
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= ((Integer) C0462.m1785n(8451, null, new Object[]{str})).intValue()) {
                break;
            }
            C0471.m1857n(5520, null, new Object[]{byteArrayOutputStream, Integer.valueOf(((Integer) C0471.m1857n(75124, null, new Object[]{str3, Integer.valueOf(((Character) C0471.m1857n(5326, null, new Object[]{str, Integer.valueOf(i3 + 1)})).charValue())})).intValue() | (((Integer) C0471.m1857n(75124, null, new Object[]{str3, Integer.valueOf(((Character) C0471.m1857n(5326, null, new Object[]{str, Integer.valueOf(i3)})).charValue())})).intValue() << 4))});
            i2 = i3 + 2;
        }
        byte[] bArr = (byte[]) C0462.m1785n(66721, null, new Object[]{byteArrayOutputStream});
        String str7 = (String) C0400.m1236n(72290, null, new Object[]{(short[]) C0400.m1236n(59428, null, new Object[0]), Integer.valueOf(((Integer) C0400.m1236n(65965, null, new Object[]{(String) C0409.m1317n(18279, null, new Object[0])})).intValue() ^ 1752456), Integer.valueOf(((Integer) C0400.m1236n(65965, null, new Object[]{(String) C0400.m1236n(12212, null, new Object[0])})).intValue() ^ 1747689), Integer.valueOf(((Integer) C0400.m1236n(65965, null, new Object[]{(String) C0400.m1236n(56414, null, new Object[0])})).intValue() ^ 1753944)});
        while (true) {
            str4 = str7;
            if (((Integer) C0462.m1785n(8451, null, new Object[]{str4})).intValue() <= 0) {
                break;
            }
            str7 = (String) C0462.m1785n(93145, null, new Object[0]);
            if (((Integer) C0462.m1785n(8451, null, new Object[]{str7})).intValue() == 0) {
                str7 = (String) C0405.m1281n(79889, null, new Object[]{(short[]) C0400.m1236n(59428, null, new Object[0]), Integer.valueOf(((Integer) C0400.m1236n(65965, null, new Object[]{(String) C0400.m1236n(71758, null, new Object[0])})).intValue() ^ 1751562), Integer.valueOf(((Integer) C0400.m1236n(65965, null, new Object[]{(String) C0405.m1281n(52647, null, new Object[0])})).intValue() ^ 1747650), Integer.valueOf(((Integer) C0400.m1236n(65965, null, new Object[]{(String) C0400.m1236n(12720, null, new Object[0])})).intValue() ^ 1750691)});
            }
        }
        int intValue = ((Integer) C0462.m1785n(8451, null, new Object[]{str4})).intValue();
        int intValue2 = ((Integer) C0462.m1785n(8451, null, new Object[]{str2})).intValue();
        for (int i4 = 0; i4 < intValue; i4++) {
            bArr[i4] = (byte) (((Character) C0471.m1857n(5326, null, new Object[]{str2, Integer.valueOf(i4 % intValue2)})).charValue() ^ bArr[i4]);
        }
        for (int i5 = 0; i5 < bArr.length; i5 = ((Integer) C0462.m1785n(8451, null, new Object[]{(String) C0462.m1785n(93145, null, new Object[0])})).intValue() + 1) {
        }
        return new String(bArr);
    }

    /* renamed from: ۥ⁣ۖ⁣ۖ⁤ۖۜ⁤⁤⁤⁠ۥ۠⁣ۥ⁣⁤۠ۥ, reason: contains not printable characters */
    public static String m2360() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(90309);
        }
        return null;
    }

    /* renamed from: ۥ⁣۟ۖ۬ۗ⁠⁠ۗۖ⁤ۣۖۨۥ⁠⁤۟ۧ⁣, reason: contains not printable characters */
    public static String m2361() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(78792);
        }
        return null;
    }

    /* renamed from: ۥ⁣۟⁠۬۠⁠⁠ۤ۟⁣ۣۤ⁤ۥ⁠⁤⁤⁤۟, reason: contains not printable characters */
    public static String m2362() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(31539);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۣۖ⁤⁤ۖ۠⁤ۗ⁤ۗ⁤⁤ۧۧۤ⁣⁤ۥ, reason: contains not printable characters */
    public static String m2363() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(8621);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۣۥۦۣ⁤ۤۥ۟ۖۨۥ⁤ۤۥۨۥ⁤ۨ, reason: contains not printable characters */
    public static String m2364() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(93555);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۥۖۖۤ⁤⁤ۖ⁤ۖ۟۠ۥۥۣۣ⁣ۥ⁠, reason: contains not printable characters */
    public static MainActivity m2365(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (MainActivity) C0405.m1280n(4458, (MainActivity.C0370l) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۥۣۣۧۖ⁠ۧۜ⁣⁤ۖۥۧ⁠ۖ⁤⁤ۖ, reason: contains not printable characters */
    public static Spinner m2366(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (Spinner) C0405.m1280n(45141, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۥ⁤ۖ⁠⁤۬ۖۖۨ⁤ۗۥ⁤⁠ۥ۟ۖ⁣, reason: contains not printable characters */
    public static boolean m2367(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return ((Boolean) C0405.m1281n(14011, (File) obj, new Object[0])).booleanValue();
        }
        return false;
    }

    /* renamed from: ۥ⁣ۨۗۨ⁤⁣⁠۬ۖ۟ۧ⁠ۖ⁠⁣ۨ⁣ۖۥ, reason: contains not printable characters */
    public static MainActivity.AsyncTaskC0353a0 m2368(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (MainActivity.AsyncTaskC0353a0) C0405.m1280n(53038, (RunnableC0342g) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۣۨ۟ۖ۬ۗۢ⁤ۖۥۖۖۖ⁣⁤۟⁤ۧ, reason: contains not printable characters */
    public static String m2369(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1281n(16670, (BufferedReader) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁣⁠ۖ⁠⁤ۖۖۥ⁤⁤⁤ۖۧۢ⁠ۖ⁤ۜ⁤, reason: contains not printable characters */
    public static String m2370() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(87393);
        }
        return null;
    }

    /* renamed from: ۥ⁣⁠ۖ⁠⁤۟ۥ⁤⁣ۣۨ⁣⁤⁤ۤۧۥۧۖ, reason: contains not printable characters */
    public static String m2371() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(65369);
        }
        return null;
    }

    /* renamed from: ۥ⁣⁣۠⁠ۥۣ⁤⁠ۜ⁣ۥ⁤⁤ۖ⁤۠⁤ۖ⁠, reason: contains not printable characters */
    public static void m2372(Object obj, Object obj2, int i) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            C0405.m1281n(59562, (MainActivity) obj, new Object[]{(View) obj2, Integer.valueOf(i)});
        }
        if (((Integer) C0469.m1839n(62495, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Integer) C0469.m1839n(17735, null, new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0405.m1279n(75793)})})});
        }
    }

    /* renamed from: ۥ⁣⁣⁠⁠ۖۖ⁤ۣ۬⁤⁠⁣⁤ۥ⁣⁣ۖۤۖ, reason: contains not printable characters */
    public static String m2373() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(64220);
        }
        return null;
    }

    /* renamed from: ۥ⁣⁤ۗۥ⁠ۖۖ⁠ۢۜ⁤⁠ۧ⁠ۖۥ۬⁤⁤, reason: contains not printable characters */
    public static String m2374() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0405.m1279n(55320);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۖۢ⁠⁠ۜ۟۠ۢ⁠⁠ۖ⁠ۧ۟ۜ⁤⁣, reason: contains not printable characters */
    public static MainActivity m2375(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (MainActivity) C0405.m1280n(90736, (MainActivity.RunnableC0372n) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۖۧ⁤ۥ⁤⁠⁤۬⁤ۖ⁠ۧ⁠ۣۨ⁤ۖ, reason: contains not printable characters */
    public static StringBuilder m2376(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (StringBuilder) C0405.m1281n(62580, (StringBuilder) obj, new Object[]{obj2});
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۖ۬⁤۬ۢۖ⁤۠ۖ۠⁠⁠ۖۖ⁤ۥ⁤, reason: contains not printable characters */
    public static Object m2377(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return C0405.m1281n(22766, (Activity) obj, new Object[]{(String) obj2});
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۜۦ⁤ۗ⁠⁤ۣ⁤⁣ۥۣ۬⁣⁤ۖ⁠ۖ, reason: contains not printable characters */
    public static String m2378() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(28917);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۜ⁤ۥۥۗ⁣ۖ⁠ۥ۟⁤⁤⁠⁣ۧۗ۠, reason: contains not printable characters */
    public static String m2379() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(39107);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ۟⁤ۥۤۥ⁤⁠۟ۗ⁤⁣⁣ۢ⁤ۖۥۢ, reason: contains not printable characters */
    public static String m2380() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(38642);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۤ۟ۖ⁠⁤⁤⁠ۧ⁤⁤ۖۖ⁤ۥ⁤ۣ۟, reason: contains not printable characters */
    public static String m2381(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1281n(28484, (File) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۥ۟⁤ۜۖ۬ۖ۟ۢ⁤ۖۖۦۥۖۖ⁤, reason: contains not printable characters */
    public static String m2382() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0405.m1279n(44837);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۧ⁠ۖ⁠⁣ۧ⁤ۥ۬⁠ۖ⁠⁤۟ۥ۠ۖ, reason: contains not printable characters */
    public static String m2383() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0405.m1279n(5997);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۧ⁤ۣۧۤ⁤ۖ⁠⁣⁣ۖۥ⁤⁠⁣⁤ۖ, reason: contains not printable characters */
    public static String m2384() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(28671);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ⁠ۤۥۖ۬⁠ۖ⁤ۥ⁣⁠ۖ⁠ۖ⁣⁤۠, reason: contains not printable characters */
    public static String m2385() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(32918);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ⁠⁤ۤ⁠۠⁤⁣۟⁣⁤⁠ۨ⁠۠ۨ⁤ۤ, reason: contains not printable characters */
    public static MainActivity m2386(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (MainActivity) C0405.m1280n(75992, (MainActivity.AsyncTaskC0353a0) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ⁠⁤۬⁤⁤ۥ۟ۖۖۢ⁤ۢ⁤⁠ۖۖ⁤, reason: contains not printable characters */
    public static String m2387() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(80442);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ⁠⁤⁤ۥ⁣⁤ۗۖ⁤⁣⁤⁠⁣ۤ⁤⁣۟, reason: contains not printable characters */
    public static ViewGroup.LayoutParams m2388(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (ViewGroup.LayoutParams) C0405.m1281n(67699, (LinearLayout) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ⁤ۣۖۖ⁤⁠⁣ۥ⁤ۥۜ⁤⁠ۤ۟⁤⁠, reason: contains not printable characters */
    public static MainActivity m2389(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (MainActivity) C0405.m1280n(76322, (MainActivity.RunnableC0362f) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ⁤ۥۖ۬۠ۖۨ⁣ۖ⁣ۖ⁠ۣۤۖ۟ۥ, reason: contains not printable characters */
    public static String m2390() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(67600);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۗ⁤ۗۢ⁠ۤ⁣ۖۥ⁠ۗۥ۟⁣⁤⁤ۢ۟, reason: contains not printable characters */
    public static String m2391() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(87652);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۗ⁤ۧ⁠ۖ⁤ۥۢۥ⁠ۥ⁤⁤⁤ۧۗ⁤⁤, reason: contains not printable characters */
    public static String m2392(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1281n(43327, (String) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۜۖۗۖۥ⁠ۥۦ⁤ۢ⁤⁤⁤ۥۢۖ⁤ۗ, reason: contains not printable characters */
    public static String m2393() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(36233);
        }
        return null;
    }

    /* renamed from: ۥ⁤۟ۡۤ⁤⁠⁤۠ۥۖ۬⁤ۖ⁤⁤ۖۢۖۥ, reason: contains not printable characters */
    public static MainActivity m2394(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (MainActivity) C0405.m1280n(73473, (MainActivity.C0367i) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣ۟ۢ⁤۬۠ۖ۟⁤ۡۢۖ⁣⁤ۣۣۥ۠, reason: contains not printable characters */
    public static String m2395() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(38240);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣ۟⁤⁠۬⁤ۤ⁤⁠ۖۥ⁠⁣ۜۖۖ۠ۖ, reason: contains not printable characters */
    public static String m2396() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(68818);
        }
        return null;
    }

    /* renamed from: ۥ⁤۟⁤⁤ۖ⁤۟⁤۟ۥ⁠ۨۜ⁣۬⁤⁤⁠ۥ, reason: contains not printable characters */
    public static String m2397() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(94219);
        }
        return null;
    }

    /* renamed from: ۥ⁤۠ۖۢۡ⁠⁣ۥۖۖۨ⁣ۨ⁣⁤ۥۖۥ⁠, reason: contains not printable characters */
    public static String m2398() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(6108);
        }
        return null;
    }

    /* renamed from: ۥ⁤۠ۖۥۥ⁣۟ۗۖۖ۠ۗۖۨ⁤ۜۨۧۤ, reason: contains not printable characters */
    public static String m2399() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(37796);
        }
        return null;
    }

    /* renamed from: ۥ⁤۠ۢ⁤ۖ۠ۤ۟۠ۥۖ۟ۖ⁣ۣۗۤ⁤⁤, reason: contains not printable characters */
    public static String m2400(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1695n(11697, (StringBuffer) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁤۠⁤⁠ۣۨ⁤⁤۟⁤۟ۧ⁠⁤ۥ⁤ۥ۠⁤, reason: contains not printable characters */
    public static ListAdapter m2401(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (ListAdapter) C0405.m1281n(49464, (ListView) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۢۤۥۧۢۖ⁣⁠ۖۖ۟۬ۜ⁠ۥ⁤ۗ⁣, reason: contains not printable characters */
    public static Node m2402(Object obj, int i) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (Node) C0405.m1281n(74645, (NodeList) obj, new Object[]{Integer.valueOf(i)});
        }
        return null;
    }

    /* renamed from: ۥ⁤ۢ⁣⁣ۣ⁤ۣۗ⁤⁤ۢۖۗ⁣⁤ۥ⁤۬ۖ, reason: contains not printable characters */
    public static CheckBox m2403(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (CheckBox) C0405.m1280n(94562, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۢ⁤ۥ⁠ۖ۟ۖ۬ۖۥۣ⁤ۣۡۡ⁤۟ۤ, reason: contains not printable characters */
    public static String m2404() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(58227);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣۖۖ⁤⁣ۥ⁤ۖۖ⁠ۥۖ⁤ۖۥ⁤⁤ۖ, reason: contains not printable characters */
    public static String m2405() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(19468);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣۖ⁣ۖۖۖۥ⁤ۖۤۥ⁠ۖۖ⁤⁤⁤ۥ, reason: contains not printable characters */
    public static String m2406() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0405.m1279n(12328);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣ⁤ۖ⁤ۤ⁠ۖ⁣ۗۦ⁠ۤ⁤⁠ۖۥۨۖ, reason: contains not printable characters */
    public static String m2407() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(23102);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۤ⁠⁤⁠ۤ⁠ۖۖ۟⁤⁣⁤ۨۥ⁤ۥۖ⁣, reason: contains not printable characters */
    public static String m2408() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(49520);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥۣۖ۬ۖ⁠⁠ۖ⁤ۖۖ⁤ۣۢۖۜ۠⁤, reason: contains not printable characters */
    public static String m2409() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0405.m1279n(47346);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥۨ⁤⁤⁤⁠ۥ⁤ۧۖ۬⁤⁤ۤۥۥۖۤ, reason: contains not printable characters */
    public static String m2410() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(95437);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥ⁤ۗۖۖۨ۟⁣⁤ۣ⁠ۡۨۖۜ⁣⁤⁣, reason: contains not printable characters */
    public static byte[] m2411(Object obj, int i) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (byte[]) C0405.m1281n(89837, null, new Object[]{(String) obj, Integer.valueOf(i)});
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥ⁤۟⁤ۖۖۖۤۥ⁤ۣۖۢۜۗ⁤۠ۖ, reason: contains not printable characters */
    public static String m2412() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(10509);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥ⁤⁤⁤ۖ⁤⁤ۧۧ⁤ۜۤ⁠ۥ⁠⁤ۖ⁤, reason: contains not printable characters */
    public static LinearLayout m2413(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (LinearLayout) C0405.m1280n(64177, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۧۖۥ⁣⁤⁤ۜۖ⁤ۥ⁤⁤ۗ⁠ۡ⁤ۤۢ, reason: contains not printable characters */
    public static InputStream m2414(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (InputStream) C0405.m1281n(5081, (Process) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۧ⁠ۖ⁤⁤⁤⁣ۥ⁣ۖ۬ۖۥۜ⁠ۥۧ⁠, reason: contains not printable characters */
    public static String m2415() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(35680);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣۨ⁤ۖۤ⁤⁤⁤ۖ⁠⁤ۖۖ⁤⁤ۣ۟⁤, reason: contains not printable characters */
    public static String m2416() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(86153);
        }
        return null;
    }

    /* renamed from: ۥ⁤۬ۥ⁠ۗۖ۬ۖ⁤ۖۤ⁤۟⁠ۣۤۜ⁠ۖ, reason: contains not printable characters */
    public static String m2417() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(20763);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁠ۡ⁤⁠ۤ⁤ۨ⁠⁤ۜۖۖۗۗ⁤ۤ⁤ۖ, reason: contains not printable characters */
    public static RunnableC0349n m2418(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (RunnableC0349n) C0405.m1280n(23591, (RunnableC0349n.b) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁠⁤⁠⁤ۖۥۢۖ⁠ۖ⁤ۥۤ⁤ۗۥۖۥ, reason: contains not printable characters */
    public static String m2419() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(13124);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣ۖ⁤ۣۨۖۧۡۥ۟ۗ⁠۬⁤ۥۖ۬⁠, reason: contains not printable characters */
    public static String m2420() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(33937);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣ۗ⁤ۣۥۜۖ⁤ۜۥۖ۟ۖۥۖۥۥۖ, reason: contains not printable characters */
    public static MainActivity.AsyncTaskC0381w m2421(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (MainActivity.AsyncTaskC0381w) C0405.m1280n(63275, (DialogInterfaceOnClickListenerC0338c) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣۟ۤۖ۟ۖۖۖ⁤ۖۖ⁣⁣ۗۜ۟⁤⁣, reason: contains not printable characters */
    public static String m2422() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(27378);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣۟ۥۥ⁠⁠ۧ⁤ۖ⁤⁣ۖ۬ۖۧۥۖ⁤, reason: contains not printable characters */
    public static String m2423(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1308n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣⁠ۢ⁤ۖۥ⁤⁤ۣۨ۬۬ۥ۬⁠ۖ⁠⁠, reason: contains not printable characters */
    public static String m2424() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(73241);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣⁠ۧ⁣ۨ⁣⁤⁤ۖۗۖ⁤ۖ⁤۬⁤⁤ۖ, reason: contains not printable characters */
    public static String m2425() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(73546);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣⁠⁠ۢ⁤ۣۖۖ⁠⁤۟⁠⁤⁤⁤ۖۥ⁣, reason: contains not printable characters */
    public static Element m2426(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (Element) C0405.m1281n(78405, (Document) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣⁤ۤ⁠ۢ۬ۢۖۖۥۖ۠⁠⁤ۣۖ⁤ۖ, reason: contains not printable characters */
    public static char m2427(Object obj, int i) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return ((Character) C0452.m1695n(25075, (String) obj, new Object[]{Integer.valueOf(i)})).charValue();
        }
        return (char) 0;
    }

    /* renamed from: ۥ⁤⁤ۖ۬⁤ۢ۟⁤ۗ⁤ۤۖ۬ۥ⁤⁠۟⁣۠, reason: contains not printable characters */
    public static String m2428() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(32326);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۢ۬ۥۖۗۖۥ⁤ۖۖ⁣ۣ⁠ۢۖ⁣ۖ, reason: contains not printable characters */
    public static String m2429() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0405.m1279n(45148);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۣۣ⁤⁣ۥۨۥۣۥ⁠ۣۖ۟ۖۤۧۨ, reason: contains not printable characters */
    public static String m2430() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(91624);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۥۜۧ⁤⁤ۥ۬ۥۖۥۥ۬ۤۖۤ۟⁠, reason: contains not printable characters */
    public static boolean m2431() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return ((Boolean) C0405.m1281n(86314, null, new Object[0])).booleanValue();
        }
        return false;
    }

    /* renamed from: ۥ⁤⁤ۥ۟⁤ۗۤ⁤ۣۖ۟۟ۖۢ۬ۖۖ⁤ۤ, reason: contains not printable characters */
    public static String m2432() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(55043);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۥ⁣ۢ⁤ۨ۠۟⁤ۥۥۥۢ⁤ۖ⁣ۣ⁤, reason: contains not printable characters */
    public static String m2433() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(66170);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۥ⁤ۖ⁤⁤⁣ۥ⁣⁤ۖۥ⁠۬ۡ⁤ۥ⁤, reason: contains not printable characters */
    public static LinearLayout m2434(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (LinearLayout) C0405.m1280n(15519, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۨۗۥۤۥۜ⁠⁠ۥ۟ۖ⁣⁠ۖ⁤ۣ۬, reason: contains not printable characters */
    public static String m2435() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(61348);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤⁤ۖ⁤⁠۬⁣ۧ⁠ۖ⁣ۣۧۦۖۖۥ⁣, reason: contains not printable characters */
    public static String m2436() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0405.m1279n(39191);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤⁤⁠ۖ⁠۠⁤ۥۗۦ⁤⁤ۥۥۤ⁤⁤⁤, reason: contains not printable characters */
    public static String m2437() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(72134);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤⁤⁤ۤ⁤ۥۖ⁣ۥ⁠ۖۖۖ⁤ۤۗۥۧ, reason: contains not printable characters */
    public static int m2438(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return ((Integer) C0469.m1839n(71261, (String) obj, new Object[0])).intValue();
        }
        return 0;
    }

    /* renamed from: ۦۣۖ⁤⁤ۥۖ⁠⁣ۥ⁤۟⁣⁣ۥۨ⁤⁤ۨۖ, reason: contains not printable characters */
    public static String m2439() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(30253);
        }
        return null;
    }

    /* renamed from: ۦۖۤ⁤ۜ⁠⁤ۡۖۖ⁠⁠۟ۥۧۖۖ⁠ۥ⁣, reason: contains not printable characters */
    public static String m2440() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(44370);
        }
        return null;
    }

    /* renamed from: ۦۖۥۖۗ⁤⁤ۣۣۖ۟⁤۟ۖۥۣۖۗۤۥ, reason: contains not printable characters */
    public static SharedPreferences.Editor m2441(Object obj, Object obj2, boolean z) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (SharedPreferences.Editor) C0405.m1281n(36029, (SharedPreferences.Editor) obj, new Object[]{(String) obj2, Boolean.valueOf(z)});
        }
        return null;
    }

    /* renamed from: ۦۖ⁤ۖۥ⁤ۖ⁠⁤⁤⁠ۤ⁣⁤⁠ۢ۟⁣⁠⁤, reason: contains not printable characters */
    public static String[] m2442(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String[]) C0405.m1281n(60745, (String) obj, new Object[]{(String) obj2});
        }
        return null;
    }

    /* renamed from: ۦۖ⁤ۥ⁤ۢ⁣⁤ۥۨۖ⁤⁤⁤⁤ۥ⁣⁤⁤⁣, reason: contains not printable characters */
    public static String m2443() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(6054);
        }
        return null;
    }

    /* renamed from: ۦ۟⁣⁤⁤ۖۖ⁤⁤⁣⁤⁤ۖ⁤ۣۖۤۖۖ⁠, reason: contains not printable characters */
    public static int m2444(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۦۣ⁤ۖۤۤۖ⁠⁤ۣۖۥ⁠ۖ⁤⁠⁣ۢۖۖ, reason: contains not printable characters */
    public static String m2445() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(34583);
        }
        return null;
    }

    /* renamed from: ۦۥۖ⁤ۣ⁠ۧۖۖۖۧۥ⁣ۥۖۖۖۖ۠ۥ, reason: contains not printable characters */
    public static boolean m2446(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return ((Boolean) C0405.m1281n(53225, (File) obj, new Object[0])).booleanValue();
        }
        return false;
    }

    /* renamed from: ۦۥۜ⁣ۖ⁤⁤ۥ⁠ۖ⁤⁠ۥ⁣ۥۖۥۢ⁠⁣, reason: contains not printable characters */
    public static String m2447() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(84585);
        }
        return null;
    }

    /* renamed from: ۦۧ۟ۖۖۥۧ⁠⁤⁠⁣⁤⁠ۢ⁠ۖۖۥ۟ۜ, reason: contains not printable characters */
    public static String m2448() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(69465);
        }
        return null;
    }

    /* renamed from: ۦۧ⁤ۣۨۖ⁣ۗۗ⁤ۥ⁠⁤⁤ۖ⁤ۖۖۥۥ, reason: contains not printable characters */
    public static String m2449() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(12636);
        }
        return null;
    }

    /* renamed from: ۦۨۥ⁠⁠⁤⁣⁣⁠۟ۤۥ⁠⁠ۧۖۥۖ⁠۟, reason: contains not printable characters */
    public static String m2450() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(20989);
        }
        return null;
    }

    /* renamed from: ۦ⁠ۥۥۢۖۧۖۖ۠ۖۥۖ⁠ۖ۟ۤۥ⁤ۖ, reason: contains not printable characters */
    public static String m2451() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0405.m1279n(72232);
        }
        return null;
    }

    /* renamed from: ۦ⁣ۖۥ۟⁣ۖ⁤⁣⁣⁣۠⁠⁤ۥ⁠⁤⁠⁠ۧ, reason: contains not printable characters */
    public static String m2452() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(63683);
        }
        return null;
    }

    /* renamed from: ۦ⁣ۣ۟ۢ⁤⁤⁠⁤ۢۖۥۖۧ⁠۬⁠ۥ⁤⁠, reason: contains not printable characters */
    public static String m2453() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(86412);
        }
        return null;
    }

    /* renamed from: ۦ⁤ۥۜۖۖ⁣⁤⁣ۣۖ⁣ۖۥۥ۟ۥۥ⁤⁣, reason: contains not printable characters */
    public static Byte m2454(byte b2) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (Byte) C0405.m1281n(25577, null, new Object[]{Byte.valueOf(b2)});
        }
        return null;
    }

    /* renamed from: ۦ⁤ۦ⁤⁤⁣⁤⁤ۖۢ⁤ۧ۟ۖۖ⁠۟ۧ۬ۨ, reason: contains not printable characters */
    public static String m2455() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(98461);
        }
        return null;
    }

    /* renamed from: ۦ⁤ۨ⁣⁤⁤۟⁤ۖۢ⁠ۣ۬ۗ۟ۥ۟⁠ۣۖ, reason: contains not printable characters */
    public static String m2456() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0405.m1279n(25095);
        }
        return null;
    }

    /* renamed from: ۦ⁤⁠ۥۨ⁣ۥ⁤ۨۥۧۥۣۤۤ⁤۟۟۬ۥ, reason: contains not printable characters */
    public static String m2457() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0405.m1279n(65930);
        }
        return null;
    }

    /* renamed from: ۦ⁤⁠⁠ۥۧۖ۬ۤ⁠⁠⁠⁤ۣۖۥۧۖۤۖ, reason: contains not printable characters */
    public static String m2458() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0405.m1279n(58737);
        }
        return null;
    }

    /* renamed from: ۦ⁤⁣⁤⁤۟⁠ۥ⁤ۖ۠ۥ⁠⁠ۣ⁤⁣ۦۖۖ, reason: contains not printable characters */
    public static MainActivity m2459(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (MainActivity) C0405.m1280n(45525, (MainActivity.C0369k) obj);
        }
        return null;
    }
}
