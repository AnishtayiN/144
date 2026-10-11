package p038c.p039a.p040a.p041a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.rootify.C0408;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0462;
import com.rootify.C0469;
import com.rootify.C0471;
import com.rootify.MainActivity;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import p038c.p042b.RunnableC0336a;
import p038c.p042b.RunnableC0339d;
import p038c.p042b.RunnableC0340e;

/* renamed from: c.a.a.a.ۦ⁤⁤ۖ⁣ۣ⁤ۥ⁤⁤ۥۖۥۥ⁠⁣⁣ۖ۟⁠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0387 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2359short;

    /* renamed from: ۥۤ⁤۟ۥۖۖۗۧۖۨ⁠ۗ۠ۦۖۥ⁣⁣⁤, reason: contains not printable characters */
    public static boolean f2360 = true;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(3700153)}[0], new Object[0])).intValue() ^ 3700155];
        sArr[0] = 2401;
        sArr[1] = 398;
        f2359short = sArr;
    }

    /* renamed from: ۥۖۖۖۖۥۖۥۢ⁤۟⁤ۖۖۖ⁤ۥ⁤ۢۖ, reason: contains not printable characters */
    public static String m1896() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0452.m1693n(59947);
        }
        return null;
    }

    /* renamed from: ۥۖۖ۟ۥ⁤۟ۖۥ⁤ۖ⁤ۥۣۢ۠ۨۖ⁤⁤, reason: contains not printable characters */
    public static String m1897() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0452.m1693n(2171);
        }
        return null;
    }

    /* renamed from: ۥۣۖۖ⁠⁣ۢ⁤⁤⁠۠۠ۥۥۥ⁤ۨ⁤⁠ۥ, reason: contains not printable characters */
    public static Integer m1898(int i) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (Integer) C0452.m1695n(82697, null, new Object[]{Integer.valueOf(i)});
        }
        return null;
    }

    /* renamed from: ۥۖۖۤ⁤ۥۣۖۖ⁠ۖۖۤۖ⁠ۖ⁤ۥۥۖ, reason: contains not printable characters */
    public static String m1899() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0452.m1693n(42729);
        }
        return null;
    }

    /* renamed from: ۥۖۖ⁤ۨۤ⁠⁤ۣۖۨ⁠⁣⁤۟⁠ۧۥ⁠ۤ, reason: contains not printable characters */
    public static TextView m1900(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (TextView) C0452.m1694n(99398, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۖۖ⁤⁤ۖۖ⁠ۥ⁣ۨ⁣ۥ⁤⁤⁤⁣⁤ۧۥ, reason: contains not printable characters */
    public static String m1901() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1693n(41261);
        }
        return null;
    }

    /* renamed from: ۥۖۗۖۜ⁤⁠⁠ۥ⁤ۖۥۥۧۖۧۖ⁤⁤ۖ, reason: contains not printable characters */
    public static LinearLayout m1902(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (LinearLayout) C0452.m1694n(48313, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۣۖۗۖ⁠ۖۖۥۖۖ⁤ۢ⁤ۤ⁣⁣⁤ۖۖ, reason: contains not printable characters */
    public static String m1903() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1693n(80009);
        }
        return null;
    }

    /* renamed from: ۥۖ۠۬ۖۥۖۖۖ⁤ۗ⁤⁤⁠۬ۖۗ⁤⁤ۖ, reason: contains not printable characters */
    public static void m1904(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            C0452.m1695n(63804, (BufferedReader) obj, new Object[0]);
        }
    }

    /* renamed from: ۥۖۢۖۖۤۖ⁠⁤۠⁤⁤ۢۥۣۖۗ⁤ۥ⁣, reason: contains not printable characters */
    public static String m1905() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0452.m1693n(78840);
        }
        return null;
    }

    /* renamed from: ۥۖۢ⁣۟⁤۬۟ۖۢۥ⁤ۥۨۗۖۨۤۥ⁠, reason: contains not printable characters */
    public static String m1906() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0452.m1693n(79700);
        }
        return null;
    }

    /* renamed from: ۥۣۖۥ⁠⁤ۜ⁤ۖ۬ۨ⁤ۨۥ⁣ۥۥ⁤ۖ⁤, reason: contains not printable characters */
    public static String m1907() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1693n(80376);
        }
        return null;
    }

    /* renamed from: ۥۣۖۥ⁤ۖۥ⁤⁤۬⁤ۤۤ⁤⁤ۗ⁤ۖ⁤ۗ, reason: contains not printable characters */
    public static String m1908() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1693n(27978);
        }
        return null;
    }

    /* renamed from: ۥۣۖ⁤⁣⁤⁠⁤ۧ⁤ۖۖ⁠ۨ⁠ۥۡۖ⁤⁤, reason: contains not printable characters */
    public static String m1909(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1695n(27410, (Node) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۖۤۖۧ⁤⁤ۥۜ۟⁤ۖۧۧ⁣ۢ۟ۖ⁤۠, reason: contains not printable characters */
    public static void m1910(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            C0452.m1695n(74062, (Element) obj, new Object[0]);
        }
    }

    /* renamed from: ۥۖۤۖ۬ۢ⁤ۜ۟ۡ⁤ۗۨ⁠⁤⁤۠ۥ⁤ۖ, reason: contains not printable characters */
    public static String m1911() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1693n(18263);
        }
        return null;
    }

    /* renamed from: ۥۖۤۥۣۣۖۤۗۖ۟⁤ۣ⁤ۧۧ⁠ۤۢ⁤, reason: contains not printable characters */
    public static byte[] m1912(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (byte[]) C0452.m1695n(90689, (String) obj, new Object[]{(Charset) obj2});
        }
        return null;
    }

    /* renamed from: ۥۖۤۥ۠ۖ⁣⁤ۖۖ⁠⁤ۣۖ⁤ۖۢۖ⁠⁠, reason: contains not printable characters */
    public static StringBuilder m1913(Object obj, char c2) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (StringBuilder) C0452.m1695n(68677, (StringBuilder) obj, new Object[]{Character.valueOf(c2)});
        }
        return null;
    }

    /* renamed from: ۥۖۥ۟ۖۥ⁤۟ۥ⁣⁤ۣۖۤۥ⁠ۢۢ⁤⁤, reason: contains not printable characters */
    public static String m1914() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0452.m1693n(40662);
        }
        return null;
    }

    /* renamed from: ۥۖۥۣۢۢۖۖ⁤⁤ۥۖ۟ۦۣۖ⁤⁤⁤⁣, reason: contains not printable characters */
    public static String m1915() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0452.m1693n(76558);
        }
        return null;
    }

    /* renamed from: ۥۖۥۥ⁤ۖ⁠ۖۖ⁤ۧ۠ۢ⁤ۥ⁠ۣ⁣⁣⁠, reason: contains not printable characters */
    public static String m1916() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1693n(73212);
        }
        return null;
    }

    /* renamed from: ۥۖۥ⁠ۥۥۥۥۣۖ⁠۟ۥۤۢ⁣⁤ۖۗ⁤, reason: contains not printable characters */
    public static String m1917() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1693n(93914);
        }
        return null;
    }

    /* renamed from: ۥۖۥ⁤ۖۥ⁤ۣۖۗ⁤⁠⁤⁠ۣ۬⁤⁣ۥ⁣, reason: contains not printable characters */
    public static String m1918() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0452.m1693n(99304);
        }
        return null;
    }

    /* renamed from: ۥۖۥ⁤ۢۧ۟ۖ۟⁣ۣۥۖۢ⁠⁤ۥۥ⁠ۢ, reason: contains not printable characters */
    public static ViewGroup.LayoutParams m1919(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (ViewGroup.LayoutParams) C0452.m1694n(9950, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۖۥ⁤ۣۤ۠⁤ۧۖۥۥ⁠ۥ⁠ۧۖ⁤ۥۖ, reason: contains not printable characters */
    public static String m1920() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0452.m1693n(90216);
        }
        return null;
    }

    /* renamed from: ۥۖۥ⁤ۨۖۖۜۨۥ⁣ۗۖۨۢ⁣ۗ⁠ۨۨ, reason: contains not printable characters */
    public static StringBuilder m1921(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (StringBuilder) C0452.m1695n(44575, (StringBuilder) obj, new Object[]{(String) obj2});
        }
        return null;
    }

    /* renamed from: ۥۖۦۖ⁤⁣ۥ⁤⁠ۣۖ⁤⁠ۖۖۨۖ⁤ۜ⁤, reason: contains not printable characters */
    public static String m1922(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0452.m1695n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥۖۧ⁠⁤ۖۥۥۖۖۥ۟ۥۖ⁠ۖۥۣ۬ۧ, reason: contains not printable characters */
    public static String m1923() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1693n(15158);
        }
        return null;
    }

    /* renamed from: ۥۖۨۖ⁤⁤⁤ۥۢۗۧۗۨ⁤ۥ⁠ۜۨۥۧ, reason: contains not printable characters */
    public static AlertDialog m1924(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (AlertDialog) C0452.m1695n(64269, (AlertDialog.Builder) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۖۨ⁣⁠۟⁤⁠⁤⁤ۥۧ⁠⁠⁤⁤⁠⁤⁠ۖ, reason: contains not printable characters */
    public static String m1925() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0452.m1693n(98558);
        }
        return null;
    }

    /* renamed from: ۥۖۨ⁤⁤ۣ⁤ۥۥۥ⁠ۖ⁠⁠ۥۤۥ⁠⁠۬, reason: contains not printable characters */
    public static String m1926() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1693n(66748);
        }
        return null;
    }

    /* renamed from: ۥۖ۬ۡ⁤ۗۧ⁠⁤ۜۖۥ⁤ۧۨ⁠ۖ⁤ۥۖ, reason: contains not printable characters */
    public static TextView m1927(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (TextView) C0452.m1694n(33199, (RunnableC0336a) obj);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠ۤ⁤⁠⁣⁤ۥۣ۬ۖۨۖ⁣ۤۖۖۥ⁤, reason: contains not printable characters */
    public static String m1928() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0452.m1693n(43585);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠⁣ۖۖۖۥۡۧۖ⁠ۥۖۖ۟⁤ۖۤۥ, reason: contains not printable characters */
    public static String m1929() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1693n(29145);
        }
        return null;
    }

    /* renamed from: ۥۖ⁠⁤⁠ۥۥۥ⁤ۖ⁤ۗ⁠⁠ۗۧ۠⁤ۢۨ, reason: contains not printable characters */
    public static void m1930() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            C0452.m1695n(48717, null, new Object[0]);
        }
        if (((Integer) C0452.m1695n(75251, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Double) C0452.m1695n(71232, null, new Object[]{(String) C0452.m1695n(2816, null, new Object[]{(String) C0452.m1693n(39428)})})});
        }
    }

    /* renamed from: ۥۖ⁣ۧۤۖ۠⁠⁤⁤ۗ⁠⁣⁣ۖ⁣ۧۢ⁠ۖ, reason: contains not printable characters */
    public static String m1931() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1693n(39011);
        }
        return null;
    }

    /* renamed from: ۥۖ⁣⁤۬⁤⁤ۣۖۢۧۖ۟ۖۥۤۜۖۥ⁤, reason: contains not printable characters */
    public static boolean m1932(double d) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return ((Boolean) C0452.m1695n(64932, null, new Object[]{Double.valueOf(d)})).booleanValue();
        }
        return false;
    }

    /* renamed from: ۥۖ⁤ۢ۟ۖ⁠⁣⁠ۨ۬ۤۖ⁣⁤⁣۬⁤⁤ۥ, reason: contains not printable characters */
    public static String m1933() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0452.m1693n(77933);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۥۖۖ⁠۟⁤⁤⁤⁣ۖ⁠⁤⁤ۗ⁠ۢۤ, reason: contains not printable characters */
    public static String m1934() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1693n(92563);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۥۦ⁤ۖۖ⁠ۖ⁠ۖ۟ۖ⁤ۖۤ۟۬۠, reason: contains not printable characters */
    public static DocumentBuilder m1935(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (DocumentBuilder) C0452.m1695n(98034, (DocumentBuilderFactory) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۨ⁠ۧۥ⁠⁤⁤ۜۤۢۖ⁤ۥۥۨ⁣ۥ, reason: contains not printable characters */
    public static int m1936(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۖ⁤ۨ⁣⁤ۤۢ⁣⁤۠ۖۢۥۖۖۖۖۖۥ, reason: contains not printable characters */
    public static String m1937() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(22157);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤⁠ۣ۠ۖ⁤⁤ۜۢ⁤⁣ۧ۟ۖ⁤ۥۢۖ, reason: contains not printable characters */
    public static CharSequence m1938(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (CharSequence) C0408.m1308n(55027, (ToggleButton) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤⁠⁠⁤⁤⁤ۦ⁤⁤۬ۖ⁤ۖۧ⁤۟ۗۖ, reason: contains not printable characters */
    public static String m1939() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(86058);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤⁤ۖ⁠۟ۢ⁠ۤۥۣۖۖ⁤ۥ⁠⁤ۖۥ, reason: contains not printable characters */
    public static String m1940() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(41060);
        }
        return null;
    }

    /* renamed from: ۥۖ⁤⁤۟⁤⁤ۥ۟⁤⁣ۖۢۧ⁠⁤⁣ۜ⁠⁤, reason: contains not printable characters */
    public static String m1941() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(15766);
        }
        return null;
    }

    /* renamed from: ۥۗۖ⁣ۡۨ⁠⁣⁣۟⁣ۗ⁠ۣ۬ۖۥ۬⁤ۤ, reason: contains not printable characters */
    public static String m1942(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1308n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥۗۖ⁤⁣⁤⁤⁤ۣۣۜۤۜ۬⁤⁣ۖ⁤ۥۨ, reason: contains not printable characters */
    public static String m1943() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(23407);
        }
        return null;
    }

    /* renamed from: ۥۗۧۖۖۖ⁤ۧۖۖۤۖ⁤⁠ۖۖۖۖۖ⁣, reason: contains not printable characters */
    public static String m1944() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(89265);
        }
        return null;
    }

    /* renamed from: ۥۜۖ⁤ۥۗۤۥۣ⁣⁣ۤ⁤ۤ⁤۟⁠ۖ⁠ۢ, reason: contains not printable characters */
    public static DataOutputStream m1945() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (DataOutputStream) C0408.m1306n(2126);
        }
        return null;
    }

    /* renamed from: ۥۜۤ۟⁤ۗۖ⁣⁣۬ۖۥۥ⁤ۖ⁣۬⁠⁤ۖ, reason: contains not printable characters */
    public static String m1946(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1307n(26842, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۜۥۖ⁣ۥ۬ۖۗۖ⁠۟⁤⁤⁤ۖ۟⁣ۦۖ, reason: contains not printable characters */
    public static LinearLayout m1947(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (LinearLayout) C0408.m1307n(31762, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥۜ⁠⁠⁤ۢۢۥۖۢۨ⁣⁤ۣۗ⁤ۖۨ⁤ۤ, reason: contains not printable characters */
    public static String m1948() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(86114);
        }
        return null;
    }

    /* renamed from: ۥۜ⁤۬ۤۥۣۨ⁤ۖۢ⁤⁤⁤ۖۢ⁤⁤⁣۬, reason: contains not printable characters */
    public static String m1949() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(29442);
        }
        return null;
    }

    /* renamed from: ۥۜ⁤⁤ۥۖۧۖۖ⁤ۖۨۖۤ۬۠⁤ۨۤۖ, reason: contains not printable characters */
    public static DocumentBuilderFactory m1950() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (DocumentBuilderFactory) C0408.m1308n(28466, null, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ۟ۖۧۥ⁤⁤⁠ۖ⁤ۣۖۢۖۡۥ⁤ۣۖ⁤, reason: contains not printable characters */
    public static int m1951(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return ((Integer) C0408.m1308n(19121, (DataInputStream) obj, new Object[0])).intValue();
        }
        return 0;
    }

    /* renamed from: ۥ۟ۡ⁤⁤۬ۥۖۖۖۜۤ⁣ۤۖۢ⁤ۧ⁤⁠, reason: contains not printable characters */
    public static String m1952() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(26871);
        }
        return null;
    }

    /* renamed from: ۥ۟ۤۖ⁤ۥۥۗ⁤⁤ۗۖ⁤ۖ۠ۥۖۖۜۨ, reason: contains not printable characters */
    public static String m1953() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(62131);
        }
        return null;
    }

    /* renamed from: ۥ۟ۤ۟⁤ۖ⁠⁣ۖ⁤⁣⁣⁤ۧ۟ۖ۬ۖۥۖ, reason: contains not printable characters */
    public static String m1954() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(71155);
        }
        return null;
    }

    /* renamed from: ۥ۟ۥۧۖ⁠ۖۥۖ⁠⁠ۖۖ⁠ۥۥۖ⁤ۤ⁤, reason: contains not printable characters */
    public static String m1955() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(89164);
        }
        return null;
    }

    /* renamed from: ۥ۟ۥۧۥ⁣⁣ۤۧۤۖ⁤ۧۖۤ⁤⁤⁤ۨۖ, reason: contains not printable characters */
    public static String m1956() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(71401);
        }
        return null;
    }

    /* renamed from: ۥ۟⁣ۖ⁤ۖ⁣⁠⁤ۣ⁠⁠ۥ⁤۠⁤⁤ۣۖۖ, reason: contains not printable characters */
    public static String m1957() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(75283);
        }
        return null;
    }

    /* renamed from: ۥ۟⁣⁤ۧ⁤ۢ۠⁤ۗۧ⁤⁤⁤⁠⁤⁤⁤ۖ⁣, reason: contains not printable characters */
    public static SharedPreferences m1958(Object obj, Object obj2, int i) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (SharedPreferences) C0408.m1308n(80697, (Activity) obj, new Object[]{(String) obj2, Integer.valueOf(i)});
        }
        return null;
    }

    /* renamed from: ۥ۟⁤ۜۥ⁣ۢ⁤⁠ۖ⁤⁤ۤۨ⁤ۣ۬ۨ⁣ۧ, reason: contains not printable characters */
    public static long m1959(Object obj, long j) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return ((Long) C0408.m1308n(30131, (DataInputStream) obj, new Object[]{Long.valueOf(j)})).longValue();
        }
        return 0L;
    }

    /* renamed from: ۥ۟⁤ۢۥۤۥۖۨ۟ۥ⁣⁤ۖ⁠⁤ۥ⁠⁤⁤, reason: contains not printable characters */
    public static String m1960() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(15133);
        }
        return null;
    }

    /* renamed from: ۥ۟⁤⁣ۖۖۖۖۤۥۥ۠ۖۥ۠ۖۢۖ⁤⁤, reason: contains not printable characters */
    public static String m1961() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(93605);
        }
        return null;
    }

    /* renamed from: ۥ۟⁤⁣⁠⁣⁣ۤۤ⁠⁤⁣ۢۧۖ⁤⁣ۖ۠ۢ, reason: contains not printable characters */
    public static void m1962(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0408.m1308n(89697, (MainActivity) obj, new Object[0]);
        }
    }

    /* renamed from: ۥ۟⁤⁤ۥۧۥۨۖ⁣⁠ۖۖۖ⁠⁤⁤ۤۨ⁤, reason: contains not printable characters */
    public static String m1963() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(5762);
        }
        return null;
    }

    /* renamed from: ۥ۠ۖ⁠⁠ۖۗ⁣ۥ⁣⁤⁤⁣ۨ⁤⁠ۖۖ⁠⁣, reason: contains not printable characters */
    public static ArrayList m1964(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (ArrayList) C0408.m1307n(5120, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ۠ۖ⁣ۥۖۥۖۢۧۖۖ۠ۡ⁤ۥ⁠⁤⁤ۜ, reason: contains not printable characters */
    public static String m1965() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(66638);
        }
        return null;
    }

    /* renamed from: ۥۡۥۧۖ⁤⁤⁤ۧۖ⁤⁤⁣⁣۟⁣۠ۥ⁠ۖ, reason: contains not printable characters */
    public static String m1966() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(78066);
        }
        return null;
    }

    /* renamed from: ۥۢۖۖ۟⁤⁠⁤ۦۖ⁠ۖۖ⁤⁤ۧۜۗۖ⁠, reason: contains not printable characters */
    public static String m1967() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(8265);
        }
        return null;
    }

    /* renamed from: ۥۣۢ۟۟⁤⁠ۖۥ⁠⁠ۢۖ⁣ۦۤۥۖۗ⁣, reason: contains not printable characters */
    public static PackageManager m1968(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (PackageManager) C0408.m1308n(55845, (Activity) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۢۥۖۤۖ۟ۥۣۣۖ⁤ۖ⁤⁣ۥۧۖ⁤ۜ, reason: contains not printable characters */
    public static String m1969() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(58308);
        }
        return null;
    }

    /* renamed from: ۥۢۨۥۨ⁣⁤⁤۟ۤۤ⁠⁠ۢ⁠⁠ۖ⁤⁤ۣ, reason: contains not printable characters */
    public static String m1970(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۥۢ⁠ۣۣۖۖ⁠⁤⁤ۖ⁤ۦ⁤ۥۣ⁣ۖۖۤ, reason: contains not printable characters */
    public static void m1971(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            C0408.m1308n(78603, (ProgressDialog) obj, new Object[0]);
        }
        if (((Integer) C0452.m1695n(75251, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Integer) C0469.m1839n(17735, null, new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0408.m1306n(53105)})})});
        }
    }

    /* renamed from: ۥۢ⁤ۖ۬ۨۖۨۖۖۖۖۖ⁤۬⁤⁤۬⁣ۥ, reason: contains not printable characters */
    public static void m1972(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            C0408.m1308n(31144, (InterruptedException) obj, new Object[0]);
        }
    }

    /* renamed from: ۥۢ⁤ۢ⁠⁤⁤⁤ۣ⁤ۥۖ⁣ۗ۬⁤⁣ۤ⁠⁤, reason: contains not printable characters */
    public static String m1973() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(67197);
        }
        return null;
    }

    /* renamed from: ۥۢ⁤⁠ۥۤۖۖۥۖۗ۠⁤⁠ۢ⁤ۨۜ⁤ۖ, reason: contains not printable characters */
    public static String m1974() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(18215);
        }
        return null;
    }

    /* renamed from: ۥۣۥ⁠⁤۠ۖۖ⁤ۣۤۖۤ⁤ۣۣ۟۟ۢۗ, reason: contains not printable characters */
    public static String m1975() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(69157);
        }
        return null;
    }

    /* renamed from: ۥۣۧۖ⁤۟ۥ⁤۠⁤ۖۧ۟ۤ⁠ۧۖۖ⁤ۥ, reason: contains not printable characters */
    public static String m1976() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(10255);
        }
        return null;
    }

    /* renamed from: ۥۣۨ⁠ۖ⁠۬ۥۥۥۥۤ⁤ۗۜ⁤ۖ⁠ۖ۟, reason: contains not printable characters */
    public static String m1977() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(55049);
        }
        return null;
    }

    /* renamed from: ۥۣ⁤ۖۥۧ⁤ۥ۬⁤ۖۡ⁣ۖ⁣ۥ⁤⁤ۢ۠, reason: contains not printable characters */
    public static String m1978() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(45121);
        }
        return null;
    }

    /* renamed from: ۥۣ⁤ۤ⁤ۗ⁣ۣۥۖ⁤ۥۥ۬ۗۤ۟ۖ⁣ۢ, reason: contains not printable characters */
    public static int m1979(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return ((Integer) C0408.m1307n(55216, (MainActivity) obj)).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۤۖۖۤ⁣⁤ۢۖۖۖ⁠ۖ۟ۖۤۥ⁣۟⁣, reason: contains not printable characters */
    public static void m1980(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            C0408.m1308n(69702, (TextView) obj, new Object[]{(CharSequence) obj2});
        }
    }

    /* renamed from: ۥۤۖ⁠ۖۢ⁠⁤ۖۖ⁤ۤ⁣⁤⁤⁣⁠⁠ۨ⁤, reason: contains not printable characters */
    public static String m1981() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(73465);
        }
        return null;
    }

    /* renamed from: ۥۤۖ⁤ۖۨ⁤⁣⁤⁤ۣۖۡۖۥ⁠ۖۤۖۥ, reason: contains not printable characters */
    public static String m1982() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(93824);
        }
        return null;
    }

    /* renamed from: ۥۣۤۗ۠ۖۖۖۖۨۤ۠ۨ۟ۧ⁤ۖۥ⁠ۥ, reason: contains not printable characters */
    public static String m1983() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(81096);
        }
        return null;
    }

    /* renamed from: ۥۤۗ⁤⁣ۥۖ⁤۟⁣⁤ۤۖۖۡ⁤ۖۤ۬ۖ, reason: contains not printable characters */
    public static String m1984() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(84429);
        }
        return null;
    }

    /* renamed from: ۥۤ۟۠⁤⁠⁤۬ۗۥۡۡ۠ۗۖ⁠ۖۖۖۨ, reason: contains not printable characters */
    public static String m1985() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(48873);
        }
        return null;
    }

    /* renamed from: ۥۣۣۤۖۖۖۥ⁣ۤ⁠ۖ۟ۥۖۥۣۖ⁤⁣, reason: contains not printable characters */
    public static String m1986() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(18621);
        }
        return null;
    }

    /* renamed from: ۥۣۣۤۤۖ۬ۖ⁠ۖۥۖۤ⁤ۧ⁠۬۟ۖ⁠, reason: contains not printable characters */
    public static String m1987() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(57822);
        }
        return null;
    }

    /* renamed from: ۥۤۥۖ⁤ۖۖۤۢ۬⁠ۥ۟ۧ۠۟⁣⁤ۥۖ, reason: contains not printable characters */
    public static String m1988() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(56599);
        }
        return null;
    }

    /* renamed from: ۥۤۥۜ⁤ۗ⁤⁣⁠۬۟⁤ۥۥۦۥۧۖۖۥ, reason: contains not printable characters */
    public static String m1989() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(13041);
        }
        return null;
    }

    /* renamed from: ۥۤۥ۟ۖ⁤ۥۥ۠⁣۬ۖۖ⁤ۖۖۜ⁠۠⁤, reason: contains not printable characters */
    public static void m1990(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            C0408.m1308n(80792, (MainActivity) obj, new Object[0]);
        }
    }

    /* renamed from: ۥۤۧۖ⁣ۖۤ⁣ۥ⁠ۥۖۧ⁠ۥ⁠⁣۟⁣ۖ, reason: contains not printable characters */
    public static short[] m1991() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (short[]) C0408.m1306n(94751);
        }
        return null;
    }

    /* renamed from: ۥۤ⁠⁤ۣۥ۬⁤ۖ⁣⁠ۖۨۦۢۨۥۗۖۥ, reason: contains not printable characters */
    public static StringBuilder[] m1992(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (StringBuilder[]) C0408.m1307n(71690, (MainActivity.RunnableC0366h) obj);
        }
        return null;
    }

    /* renamed from: ۥۥۖۖۨ⁤۟⁣ۥ⁤⁠ۖ⁣ۖ⁠ۖۖۥۨ⁣, reason: contains not printable characters */
    public static ProgressBar m1993(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (ProgressBar) C0408.m1307n(5705, (MainActivity.RunnableC0362f) obj);
        }
        return null;
    }

    /* renamed from: ۥۥۖۗ⁤ۖ۠ۤ⁤⁠ۖ۟⁤⁤⁠ۨۨۤۤ⁣, reason: contains not printable characters */
    public static void m1994(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0408.m1308n(64954, (TextView) obj, new Object[]{(CharSequence) obj2});
        }
    }

    /* renamed from: ۥۥۖ۠ۤۖ⁠⁠⁠ۥ۟ۥۖۖ⁠ۥ⁤⁠ۢ⁠, reason: contains not printable characters */
    public static Object m1995(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return C0408.m1308n(4807, (Iterator) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۥۖۤ۟ۡۖ⁤ۖ⁤⁤⁠۟ۡۡۥۡۗۖۜ, reason: contains not printable characters */
    public static String m1996() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(50663);
        }
        return null;
    }

    /* renamed from: ۥۥۖۥۣۖۖ⁣⁣⁠⁤⁠⁠۬⁣ۤۖۧ⁠ۥ, reason: contains not printable characters */
    public static MainActivity.AsyncTaskC0353a0 m1997(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (MainActivity.AsyncTaskC0353a0) C0408.m1307n(76675, (RunnableC0339d) obj);
        }
        return null;
    }

    /* renamed from: ۥۥۖۥۖ⁣۬ۖۖۥۢ⁤ۣ⁠ۖۖ⁤ۥۖ⁤, reason: contains not printable characters */
    public static String m1998() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(48182);
        }
        return null;
    }

    /* renamed from: ۥۥۖ⁤ۜ⁣ۣۜۗۥۤۖ⁤ۤۥ⁤⁠ۨ⁤⁤, reason: contains not printable characters */
    public static String m1999() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(79273);
        }
        return null;
    }

    /* renamed from: ۥۥۣۗۖۧ⁠ۥ⁠۟⁤ۥ⁤ۥۢ⁤ۗۥ⁤⁤, reason: contains not printable characters */
    public static SharedPreferences.Editor m2000(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (SharedPreferences.Editor) C0408.m1308n(62726, (SharedPreferences) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۥۣ۟ۥ⁠⁤⁠ۖ⁣ۡۧ⁤ۥۥ۟ۨۖۖ⁤, reason: contains not printable characters */
    public static String m2001(Object obj, Object obj2, Object obj3) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1308n(38738, (SharedPreferences) obj, new Object[]{(String) obj2, (String) obj3});
        }
        return null;
    }

    /* renamed from: ۥۥۣ⁠ۖ۬⁤ۦۥۗۥۖۖ⁤ۧۖ⁠ۥۗۤ, reason: contains not printable characters */
    public static String m2002() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(13268);
        }
        return null;
    }

    /* renamed from: ۥۥۥۖ⁤ۥۧ⁤⁠ۖ⁠ۖۜ⁤⁤ۥۤۖۖ⁤, reason: contains not printable characters */
    public static String m2003() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(56384);
        }
        return null;
    }

    /* renamed from: ۥۥۥ⁤ۖۥ⁤⁤ۡۨ⁤⁤⁤ۖۥ⁤ۖ⁤ۡۥ, reason: contains not printable characters */
    public static String m2004() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(82301);
        }
        return null;
    }

    /* renamed from: ۥۥۥ⁤ۧۥ⁣ۢ⁠⁠ۖ۬⁠⁠ۣۢۨۖۖ⁤, reason: contains not printable characters */
    public static String m2005() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(55490);
        }
        return null;
    }

    /* renamed from: ۥۥۦۖۗۧۢۖۧۖۥۖۧ⁤ۤ⁠ۦۖ۟⁣, reason: contains not printable characters */
    public static String m2006() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(61732);
        }
        return null;
    }

    /* renamed from: ۥۥۦ⁠⁤⁤⁤ۖ⁠ۥۦۨ⁤⁣ۖۗۖ⁣ۧۖ, reason: contains not printable characters */
    public static void m2007(Object obj, boolean z) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            C0408.m1308n(97969, (ToggleButton) obj, new Object[]{Boolean.valueOf(z)});
        }
        if (((Integer) C0408.m1308n(78567, null, new Object[0])).intValue() >= 0) {
            C0408.m1308n(80863, (PrintStream) C0469.m1837n(12888), new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0408.m1306n(53658)})});
        }
    }

    /* renamed from: ۥۥۧۖۥ⁤ۖ۬⁣ۣ⁤ۖۗۥۖ⁤ۖۖۖۥ, reason: contains not printable characters */
    public static void m2008(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            C0408.m1308n(86576, null, new Object[]{(String) obj});
        }
    }

    /* renamed from: ۥۥۧۥ۬⁤ۥۗ⁤ۖۖۗۖ⁣⁣ۖ⁠ۥ⁤ۦ, reason: contains not printable characters */
    public static String m2009() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(2222);
        }
        return null;
    }

    /* renamed from: ۥۥ۬ۤ⁠ۖۖ⁠۟ۥۥ⁠⁣ۥ⁠ۧ⁤ۖۖ۬, reason: contains not printable characters */
    public static String m2010() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(97328);
        }
        return null;
    }

    /* renamed from: ۥۥ۬⁣ۖۤۥ⁤ۖۡۖۨۤ⁣ۣ⁤⁤⁣ۥۗ, reason: contains not printable characters */
    public static String m2011() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0408.m1306n(98156);
        }
        return null;
    }

    /* renamed from: ۥۥ⁣ۣۖۤ⁣ۖۜۖۗۤ⁤⁤ۖۥ⁠ۣ⁤ۖ, reason: contains not printable characters */
    public static int m2012(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return ((Integer) C0408.m1308n(97232, (ArrayList) obj, new Object[]{obj2})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۥ⁤ۖ۟⁣⁤ۖ⁠ۖ⁤ۥۖ⁤ۣ۬ۖ⁠ۗ⁤, reason: contains not printable characters */
    public static String m2013() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(98445);
        }
        return null;
    }

    /* renamed from: ۥۥ⁤ۧۧ⁠⁠ۖۦۖۨ⁤ۣۗۤ⁣ۖ⁠ۖۖ, reason: contains not printable characters */
    public static String m2014() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(83714);
        }
        return null;
    }

    /* renamed from: ۥۥ⁤⁤ۢۖ⁤ۣۖ⁠ۣ⁠ۣۧۖۖ⁤ۥ⁠ۧ, reason: contains not printable characters */
    public static boolean m2015(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return ((Boolean) C0408.m1308n(7098, (String) obj, new Object[]{(CharSequence) obj2})).booleanValue();
        }
        return false;
    }

    /* renamed from: ۥۦ⁠ۧ⁤⁤⁣ۤ۟ۥۖۥۖۧۥۤ⁠ۧ۟ۗ, reason: contains not printable characters */
    public static String m2016(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1308n(85711, (MainActivity) obj, new Object[]{(String) obj2});
        }
        return null;
    }

    /* renamed from: ۥۧ۟ۤۖۥۢۥ⁤ۖۖۧۥۥ⁠⁤ۤۜۖۥ, reason: contains not printable characters */
    public static String m2017() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(27327);
        }
        return null;
    }

    /* renamed from: ۥۣۧ۠ۤ⁣⁤⁠ۖۜ۟ۖ۬⁣⁤⁠⁤۠۟⁠, reason: contains not printable characters */
    public static void m2018(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            C0408.m1308n(55445, (ProgressBar) obj, new Object[]{(ViewGroup.LayoutParams) obj2});
        }
        if (((Integer) C0408.m1308n(78567, null, new Object[0])).intValue() >= 0) {
            C0408.m1308n(19859, (PrintStream) C0469.m1837n(12888), new Object[]{Integer.valueOf(((Integer) C0408.m1308n(46321, null, new Object[]{(String) C0452.m1695n(2816, null, new Object[]{(String) C0408.m1306n(65680)})})).intValue())});
        }
    }

    /* renamed from: ۥۧۤۖۖۥۧۖ⁤ۥۥۖ⁤⁠⁣⁤ۡۥ⁤⁣, reason: contains not printable characters */
    public static String m2019() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(21275);
        }
        return null;
    }

    /* renamed from: ۥۧ⁠⁤⁠ۖ⁤⁣⁤۟ۖ⁤۟ۥۖ⁣ۣ۬ۖۖ, reason: contains not printable characters */
    public static Class m2020(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (Class) C0408.m1308n(63304, obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥۧ⁣۠ۖۧۨۖۖۥ⁤⁠ۖ⁤ۨ⁤۠ۖۜ⁠, reason: contains not printable characters */
    public static int m2021(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return ((Integer) C0408.m1307n(58789, (MainActivity) obj)).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۧ⁣⁣ۜۖۜ⁤ۥۖ۟ۨ⁤ۗۖ⁠⁣⁤⁤ۖ, reason: contains not printable characters */
    public static String m2022() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(1725);
        }
        return null;
    }

    /* renamed from: ۥۨۖۥ⁤ۢ⁠⁤ۖ⁣ۥۖ⁠۟ۖۜۤۖ⁣۠, reason: contains not printable characters */
    public static boolean m2023(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return ((Boolean) C0408.m1308n(18321, (String) obj, new Object[]{(String) obj2})).booleanValue();
        }
        return false;
    }

    /* renamed from: ۥۨۢ⁣⁠ۖ⁣⁣ۤۥ⁠⁠ۧ⁤⁤⁠ۥ⁠⁤ۥ, reason: contains not printable characters */
    public static String m2024() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0408.m1306n(94848);
        }
        return null;
    }

    /* renamed from: ۥۨۤۢۤۧۤۥۖ⁤ۣۖۖۖ⁤ۣۖ۟⁠ۣ, reason: contains not printable characters */
    public static String m2025() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(31421);
        }
        return null;
    }

    /* renamed from: ۥۨۥۣۤ۟ۢۡۤۜۥۢۧۤ⁣ۥ⁠ۖۤۥ, reason: contains not printable characters */
    public static String m2026() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0408.m1306n(83855);
        }
        return null;
    }

    /* renamed from: ۥۨۦ⁠⁣⁤⁤ۗ⁤ۧۧۖ⁣⁤ۖ۟ۖۗۗۖ, reason: contains not printable characters */
    public static String m2027() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1306n(17041);
        }
        return null;
    }

    /* renamed from: ۥۨ۬ۥ⁤⁤⁣ۥ۬ۖۥ⁠ۣ⁤⁣ۖۤۖۨۧ, reason: contains not printable characters */
    public static NodeList m2028(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (NodeList) C0408.m1308n(28438, (Document) obj, new Object[]{(String) obj2});
        }
        return null;
    }

    /* renamed from: ۥۨ⁤ۢ⁤۟ۖۥۤۖ۟⁣۟⁤⁠۟ۡۗۢۥ, reason: contains not printable characters */
    public static int m2029(Object obj) {
        return ((Integer) C0408.m1308n(20097, obj, new Object[0])).intValue();
    }

    /* renamed from: ۥۨ⁤ۢ⁤۟ۖۥۤۖ۟⁣۟⁤⁠۟ۡۗۢۥ, reason: contains not printable characters */
    public static Class<?> m2030(String str) throws ClassNotFoundException {
        return (Class) C0408.m1308n(10066, null, new Object[]{str});
    }

    /* renamed from: ۥۨ⁤ۢ⁤۟ۖۥۤۖ۟⁣۟⁤⁠۟ۡۗۢۥ, reason: contains not printable characters */
    public static String m2031(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۥ۬ۖۜۖ⁠⁣⁣ۥ⁤ۢۖۢ⁤⁣۠ۗۦ⁤ۨ, reason: contains not printable characters */
    public static String m2032() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(16019);
        }
        return null;
    }

    /* renamed from: ۥ۬ۖ⁣⁤ۗ۟ۨۖ⁣ۖ⁤⁤ۤۥۢ۬⁣⁣⁠, reason: contains not printable characters */
    public static byte m2033(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return ((Byte) C0462.m1785n(41516, (Byte) obj, new Object[0])).byteValue();
        }
        return (byte) 0;
    }

    /* renamed from: ۥ۬ۖ⁤⁠ۥ۟ۗۥ⁣ۣۥ⁤⁠ۣۧۤ⁤⁣⁣, reason: contains not printable characters */
    public static String m2034() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(46158);
        }
        return null;
    }

    /* renamed from: ۥ۬ۜۖ⁠⁤ۜۦ۟⁠۬ۥ⁤ۗۖۧۗ۠۟⁠, reason: contains not printable characters */
    public static AlertDialog.Builder m2035(Object obj, Object obj2, Object obj3) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (AlertDialog.Builder) C0462.m1785n(73913, (AlertDialog.Builder) obj, new Object[]{(CharSequence) obj2, (DialogInterface.OnClickListener) obj3});
        }
        return null;
    }

    /* renamed from: ۥ۬ۤۖ⁠ۣۖۖۖ⁣⁤ۖۤ۠ۥۗ⁠⁣⁠ۢ, reason: contains not printable characters */
    public static String m2036() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(22166);
        }
        return null;
    }

    /* renamed from: ۥ۬ۧ⁣ۥ⁤ۣۣ⁠⁣⁠⁠⁤ۧ⁤⁣⁠⁠⁠⁣, reason: contains not printable characters */
    public static String m2037() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(35300);
        }
        return null;
    }

    /* renamed from: ۥ۬ۨۤۖ⁣۟⁣ۖۖ⁤ۤۖ⁤⁠⁣ۣ⁠ۖۥ, reason: contains not printable characters */
    public static String m2038() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(90208);
        }
        return null;
    }

    /* renamed from: ۥ۬۬ۖۖۖ⁤ۖ⁣ۗۢ۟⁣⁠⁠ۥۖ۟ۖۥ, reason: contains not printable characters */
    public static String m2039() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(4226);
        }
        return null;
    }

    /* renamed from: ۥ۬⁠ۣۖۖ⁠ۖۖۥ۬ۤۖ⁠ۦ⁠⁠ۖ⁤۟, reason: contains not printable characters */
    public static String m2040() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(54699);
        }
        return null;
    }

    /* renamed from: ۥ۬⁠ۤ⁣ۗۖۢ⁤⁤⁠⁤⁠ۖ⁠ۣ⁠۬ۧۧ, reason: contains not printable characters */
    public static String m2041() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(92799);
        }
        return null;
    }

    /* renamed from: ۥ۬⁣ۖ⁠⁠ۧۥۨۖ۟⁤⁠ۖۥۖ۟⁠۟ۧ, reason: contains not printable characters */
    public static String m2042() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(5642);
        }
        return null;
    }

    /* renamed from: ۥ۬⁣ۥۖ⁤ۢ⁤ۖۖۖ⁤ۖ⁣⁠ۖ⁤ۖ⁣⁤, reason: contains not printable characters */
    public static int m2043() {
        return ((Integer) C0452.m1695n(65372, null, new Object[]{(String) C0462.m1783n(6283)})).intValue() ^ (-1754405);
    }

    /* renamed from: ۥ۬⁤ۖۦۗ⁣ۖ⁠ۧۥۣۣۖۧۖۖۖۖۨ, reason: contains not printable characters */
    public static String m2044() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(70664);
        }
        return null;
    }

    /* renamed from: ۥ۬⁤ۖۧۖۥ۠⁠⁤ۖۖ⁤۬ۖۧۖۧۗۥ, reason: contains not printable characters */
    public static String m2045() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(83524);
        }
        return null;
    }

    /* renamed from: ۥ۬⁤ۖۧ۬ۧ⁠ۗۥۖۖ⁤۬ۖ۬⁠⁤ۧ⁤, reason: contains not printable characters */
    public static RunnableC0336a m2046(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (RunnableC0336a) C0462.m1784n(73635, (RunnableC0336a.a) obj);
        }
        return null;
    }

    /* renamed from: ۥ۬⁤⁤⁤ۖۧ۟⁤ۤ۟ۤ⁣ۣۣۥۖ⁤ۥ⁤, reason: contains not printable characters */
    public static String m2047() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(32157);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖۖۥۖۖۤۖ۬ۤۗۜ۟⁠⁣ۤۥ⁤ۖ, reason: contains not printable characters */
    public static void m2048(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            C0462.m1785n(98338, (MainActivity) obj, new Object[0]);
        }
    }

    /* renamed from: ۥ⁠ۖۗ⁠⁤ۢۢ⁤ۤۗ⁠ۖ۟⁠ۖۤۥۖ⁣, reason: contains not printable characters */
    public static String m2049() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(44553);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖۤ⁤⁤ۣۣ۠ۖۖۢۜ⁤⁤۬⁤ۖ۬⁤, reason: contains not printable characters */
    public static int m2050(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return ((Integer) C0462.m1785n(58168, (AdapterView) obj, new Object[0])).intValue();
        }
        return 0;
    }

    /* renamed from: ۥ⁠ۖۥۥ⁣⁠ۣ⁠ۢ⁠ۤۖۤۤۧۧۖ⁠⁤, reason: contains not printable characters */
    public static String m2051() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(86420);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖۥ⁠⁤۟⁤ۥۖۜۡۖۗ⁤۬ۤ⁤⁤ۧ, reason: contains not printable characters */
    public static String m2052() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(59427);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۖ⁤⁠ۖ⁣ۗ۬ۖ⁣ۖۤ⁠ۖ⁠⁠ۥۥۦ, reason: contains not printable characters */
    public static String m2053() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(49347);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۗۧ⁤ۢ⁤⁤ۖۖۥ⁤ۥۖۖۥۖۤ⁠۬, reason: contains not printable characters */
    public static String m2054() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(71218);
        }
        return null;
    }

    /* renamed from: ۥ⁠۠⁤ۣۖۨۖ⁤۠⁣⁣ۖ⁠⁠ۥۖۖۖ⁣, reason: contains not printable characters */
    public static String m2055(int i) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0452.m1695n(56467, null, new Object[]{Integer.valueOf(i)});
        }
        return null;
    }

    /* renamed from: ۥ⁠ۣۗۤ⁤ۧ⁣ۦۖ⁤⁣ۥ⁤⁤ۖ⁠⁤ۥۖ, reason: contains not printable characters */
    public static String m2056() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(12402);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۣ⁠⁤⁠ۗ⁤ۤ⁠ۧ⁠⁠ۖۥ⁤ۧۥ۠۟, reason: contains not printable characters */
    public static ListView m2057(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (ListView) C0462.m1784n(34629, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۤۜۥۣ⁤⁤⁤⁤⁣⁤ۨ۬ۜ⁠⁤ۥ۬ۥ, reason: contains not printable characters */
    public static String m2058() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(8530);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۧۖ⁠ۖ۬⁠⁠⁣ۥ۬⁤ۥ⁣ۖۖ⁠⁣⁠, reason: contains not printable characters */
    public static String m2059() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(33722);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۨ۟ۨۖ⁠⁤ۣۗۖ۟⁤ۗ⁤⁤۠ۨ⁣ۖ, reason: contains not printable characters */
    public static String m2060() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(68048);
        }
        return null;
    }

    /* renamed from: ۥ⁠ۨ۬ۤ۟ۧ⁤⁤⁤⁠⁠ۤۤۥۢۨۥ⁤⁣, reason: contains not printable characters */
    public static String m2061() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(99889);
        }
        return null;
    }

    /* renamed from: ۥ⁠⁠ۣۤۥۦۖۥۖ⁤ۧ۬⁤ۥۖۥۥ۬⁤, reason: contains not printable characters */
    public static void m2062(int i) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0462.m1785n(31992, null, new Object[]{Integer.valueOf(i)});
        }
        if (((Integer) C0469.m1839n(62495, null, new Object[0])).intValue() >= 0) {
            C0408.m1308n(80863, (PrintStream) C0469.m1837n(12888), new Object[]{(String) C0452.m1695n(2816, null, new Object[]{(String) C0462.m1783n(87509)})});
        }
    }

    /* renamed from: ۥ⁠⁠ۥ⁠ۢۖۖ۟⁣ۗۢۖۖۖ⁤ۤۥ⁣ۢ, reason: contains not printable characters */
    public static void m2063(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0462.m1785n(35740, (LinearLayout) obj, new Object[0]);
        }
    }

    /* renamed from: ۥ⁠⁤ۖۢۥۖۤۢ⁣ۖ⁠⁣۟ۥ⁤ۥ⁠⁤⁤, reason: contains not printable characters */
    public static void m2064(Object obj, int i) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            C0452.m1695n(84462, (ByteArrayOutputStream) obj, new Object[]{Integer.valueOf(i)});
        }
        if (((Integer) C0469.m1839n(62495, null, new Object[0])).intValue() >= 0) {
            C0408.m1308n(19859, (PrintStream) C0469.m1837n(12888), new Object[]{Integer.valueOf(((Integer) C0408.m1308n(46321, null, new Object[]{(String) C0462.m1785n(68315, null, new Object[]{(String) C0462.m1783n(2042)})})).intValue())});
        }
    }

    /* renamed from: ۥ⁠⁤⁤ۡ⁣ۖۥۖۖۖ۬ۤۖۜ⁤⁠ۤۤ⁤, reason: contains not printable characters */
    public static TextView m2065(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (TextView) C0462.m1784n(96104, (RunnableC0336a) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۖۗۖۗۖ۬ۖۡ۟ۖ⁤⁠ۖ⁤۟۟⁤۠, reason: contains not printable characters */
    public static String m2066() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(81799);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۖ⁤ۣۖۖۤ⁠ۣۖۖ⁤ۖ⁣⁤ۖ⁤⁤۟, reason: contains not printable characters */
    public static String m2067() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(22509);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۢۤ⁤⁤⁤⁠۟ۖ۬ۥ⁠ۖۖ⁤ۖ⁣⁠⁤, reason: contains not printable characters */
    public static String m2068() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(17311);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۥۢ⁤ۣۖۜ⁠ۜ⁠ۖۦ⁠⁠ۖۖۥۖۥ, reason: contains not printable characters */
    public static String m2069() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(8503);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۦ۠⁤ۨۢ⁠ۣ⁤ۣ⁠۟⁤⁤ۗ⁠⁠ۧۜ, reason: contains not printable characters */
    public static void m2070(Object obj, Object obj2) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            C0462.m1785n(74919, (DataOutputStream) obj, new Object[]{(byte[]) obj2});
        }
        if (((Integer) C0408.m1308n(78567, null, new Object[0])).intValue() >= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Float) C0462.m1785n(7496, null, new Object[]{(String) C0469.m1839n(59573, null, new Object[]{(String) C0462.m1783n(94657)})})});
        }
    }

    /* renamed from: ۥ⁣ۧۢۤۤۥ⁤ۧ⁤⁠⁤ۢۖۥ۬⁤ۥ⁤⁤, reason: contains not printable characters */
    public static String m2071() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(95831);
        }
        return null;
    }

    /* renamed from: ۥ⁣۬ۢۖۤۗۖ۠۬ۨۖ۟⁤۟⁤ۡ⁤⁠⁤, reason: contains not printable characters */
    public static String m2072() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(18531);
        }
        return null;
    }

    /* renamed from: ۥ⁣⁤ۖ۬ۖ⁠⁤⁠ۥۖۖ⁤⁤⁤۬ۖۖ۟ۖ, reason: contains not printable characters */
    public static String m2073() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(56407);
        }
        return null;
    }

    /* renamed from: ۥ⁣⁤ۖ⁣ۧۖۥ⁠⁤⁤ۖ⁠ۖ⁤ۣۖۖۨۡ, reason: contains not printable characters */
    public static ViewGroup.LayoutParams m2074(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (ViewGroup.LayoutParams) C0462.m1784n(44210, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۖۥۨ⁠⁣ۣۗ⁠ۧۧۖ⁤⁤⁠ۖۥۥ, reason: contains not printable characters */
    public static String m2075() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(20475);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۗ۟ۖ⁠ۖۥ⁣⁤⁠⁤ۤۖ۠۟ۥۖ⁣, reason: contains not printable characters */
    public static String m2076() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(49420);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣۖ۠ۜۢ⁤ۖ⁠ۤۧ۬ۥ⁤ۣۣۧۜۖ, reason: contains not printable characters */
    public static String m2077() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(2664);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۤ۬⁤ۜ⁠ۖ⁤ۖ⁣ۥ⁠⁠⁤⁤ۧۢ⁤, reason: contains not printable characters */
    public static LinearLayout m2078(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (LinearLayout) C0462.m1784n(31255, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖۧ⁤ۜ⁤ۖ⁤⁠⁠۠ۤ⁤⁤ۥۖۧ⁠ۥ, reason: contains not printable characters */
    public static String m2079() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(32176);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ⁠ۣ⁠ۢۢ⁤ۨ⁤ۖ⁣ۤۧ⁠ۣۢۧ⁤, reason: contains not printable characters */
    public static String m2080() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(18114);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۖ⁤ۖۖ⁤ۖۥۖۤۥ⁤ۥۣ۬ۡۖۢۧ, reason: contains not printable characters */
    public static String m2081() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(34489);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۗ۟ۥۖۥۤ⁤⁠⁤⁤ۖ۠ۢۥ⁤⁤⁤ۢ, reason: contains not printable characters */
    public static String m2082() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(24400);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۗ۠⁤⁤۬⁣ۖ⁣⁤ۥۖ۟⁤ۢ⁤ۥۖۥ, reason: contains not printable characters */
    public static ViewGroup.LayoutParams m2083(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (ViewGroup.LayoutParams) C0462.m1784n(14427, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۗ⁣ۡ⁠ۥ⁤⁣⁠⁤ۥ⁤⁠ۖۢۜ⁤ۥۖ, reason: contains not printable characters */
    public static String m2084() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(47442);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۗ⁤⁠ۨ⁠ۖۖ⁤۠ۥۖۥ⁤۬ۨۥ⁤ۤ, reason: contains not printable characters */
    public static String m2085() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(84733);
        }
        return null;
    }

    /* renamed from: ۥ⁤۟ۖ⁤⁤⁠ۨ⁤۟ۗ۬⁠⁤۬ۖۨ⁤⁤ۖ, reason: contains not printable characters */
    public static String m2086() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(93199);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣ۟ۢۢ۟⁠ۖ⁣⁠⁠ۣ۟⁤ۨۥۨۥۖ, reason: contains not printable characters */
    public static String m2087() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(34341);
        }
        return null;
    }

    /* renamed from: ۥ⁤۟⁠⁤⁠ۥ⁤ۥۖۦ⁤ۖۖ⁤۟⁠ۣۖۤ, reason: contains not printable characters */
    public static String m2088() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(32747);
        }
        return null;
    }

    /* renamed from: ۥ⁤۠⁠ۡ۬⁤ۖ⁤ۥۖ۟ۜۖ⁤⁤⁤ۖۖ⁤, reason: contains not printable characters */
    public static String m2089() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(24516);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۤۖ⁤۠⁣ۖۗ⁤⁣ۥ⁣⁤⁤ۖ۟⁤ۖۥ, reason: contains not printable characters */
    public static String m2090() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(67735);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۤ⁤ۣ۬ۖ⁤ۣ⁤۠⁣ۖ۟⁤۠⁤ۖ⁤ۜ, reason: contains not printable characters */
    public static String m2091() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(27188);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥۖ⁣ۖ⁣ۖۥۜۥۖۥۗ⁣ۧ⁤⁠⁤ۢ, reason: contains not printable characters */
    public static int m2092(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return ((Integer) C0462.m1785n(84056, (NodeList) obj, new Object[0])).intValue();
        }
        return 0;
    }

    /* renamed from: ۥ⁤ۥ⁠ۖۢۜۥۥ⁤ۗ۬ۖۖ⁤⁤ۢۤ⁣ۖ, reason: contains not printable characters */
    public static String m2093() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(21163);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥ⁠ۖ⁠ۖ⁤ۢۥۖۦۣ⁤ۖ⁤ۤۖۖۥ, reason: contains not printable characters */
    public static void m2094(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            C0462.m1785n(56122, (MainActivity) obj, new Object[0]);
        }
        if (((Integer) C0462.m1785n(33252, null, new Object[0])).intValue() <= 0) {
            C0469.m1839n(86877, (PrintStream) C0469.m1837n(12888), new Object[]{(Double) C0469.m1839n(44213, null, new Object[]{(String) C0469.m1839n(11011, null, new Object[]{(String) C0462.m1783n(73888)})})});
        }
    }

    /* renamed from: ۥ⁤ۥ⁠ۨۖۨ⁠ۢۜ⁠⁤⁣⁤⁣ۢ⁤ۨ۬ۡ, reason: contains not printable characters */
    public static String m2095() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(1458);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥ⁠⁣ۖۥ⁠⁤⁤⁠ۗۥ⁤⁠ۨۖ⁤ۥۢ, reason: contains not printable characters */
    public static ViewGroup.LayoutParams m2096(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (ViewGroup.LayoutParams) C0462.m1784n(7691, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥ⁤ۣۖۖ⁠⁠⁤ۣۥۖۤ⁤⁠۟ۥۥۥ, reason: contains not printable characters */
    public static MainActivity m2097(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (MainActivity) C0462.m1784n(74985, (MainActivity.RunnableC0366h) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥ⁤⁠ۥ⁤۬⁠ۗ⁠ۜۥۖۗۥۣۖۧۗ, reason: contains not printable characters */
    public static String m2098() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(88395);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۥ⁤⁠⁤ۖۥۥ۬ۨۗ⁤ۖ⁠ۖۜۖ۟۟, reason: contains not printable characters */
    public static String m2099() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(32363);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۧ⁣ۢۜۧ⁠⁠⁣ۢۢۖۥۖ⁣⁤⁠ۥ⁠, reason: contains not printable characters */
    public static String m2100() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(58394);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۨۖ⁠⁤ۢ⁣⁤⁤⁣⁤⁤ۧۧۥۧ⁠۟۬, reason: contains not printable characters */
    public static String m2101() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(36398);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۨۧ⁠ۜۜۗۖۗۢۥ⁣⁣⁣ۣۤ۟ۖۖ, reason: contains not printable characters */
    public static MainActivity m2102(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (MainActivity) C0462.m1784n(29002, (MainActivity.AsyncTaskC0355b0) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤ۣ۬ۖۤ۬ۤۖۖۤ⁣۬ۤ۟ۨۗۦ۠۟, reason: contains not printable characters */
    public static void m2103(Object obj, int i, int i2) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            C0462.m1785n(94730, (ScrollView) obj, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    /* renamed from: ۥ⁤۬⁠⁤⁠⁠⁤ۖ⁤ۣۖ⁣ۖۜ⁣ۖ⁣ۖۡ, reason: contains not printable characters */
    public static String m2104() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(8396);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁠ۥۖ⁠⁤۬ۖۥ۬⁣ۖۗ⁠⁠ۢۧۤۖ, reason: contains not printable characters */
    public static String m2105() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(86568);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁠⁠ۣۤ⁤ۥ⁤ۣۖ⁤⁤⁤ۖۥۖۖۨ⁤, reason: contains not printable characters */
    public static String m2106() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(81178);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁠⁣ۖۧۖ⁤⁣ۖ⁣ۧۥۤۖۖ۟ۖ۠⁤, reason: contains not printable characters */
    public static String m2107() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(57351);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁠⁤ۥۡۖۥ۬ۖۖۥ⁣⁤⁤ۖۢ⁤ۤۖ, reason: contains not printable characters */
    public static String m2108() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(67925);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣⁣ۥ⁣⁤⁣ۢ۟⁣⁤⁤۠⁣ۢ⁠ۣۤۖ, reason: contains not printable characters */
    public static Node m2109(Object obj, int i) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (Node) C0462.m1785n(84906, (NamedNodeMap) obj, new Object[]{Integer.valueOf(i)});
        }
        return null;
    }

    /* renamed from: ۥ⁤⁣⁣⁤ۦۥۜۖ⁤⁠۟ۥ⁤ۣۖۖۤۖۤ, reason: contains not printable characters */
    public static String m2110() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(21949);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۖۖۖۥۥ⁤۬⁠⁤ۤ⁤⁠ۖۢۜ⁤⁠, reason: contains not printable characters */
    public static String m2111() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(55850);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۖۖۖۥ⁣⁤⁤ۥ⁤⁤ۣۗ⁤⁤⁠ۖۥ, reason: contains not printable characters */
    public static int m2112(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return ((Integer) C0462.m1784n(70795, (MainActivity.RunnableC0358d) obj)).intValue();
        }
        return 0;
    }

    /* renamed from: ۥ⁤⁤ۖۖۢۜۥۧۖۨۤۗۥۖۨۖ۟ۖۖ, reason: contains not printable characters */
    public static String m2113() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(8217);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۖۖ۬ۖۗۗ⁤⁣⁤⁠ۖ۟ۤۖۖ⁤⁤, reason: contains not printable characters */
    public static String m2114() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0462.m1783n(19535);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۖۢ۬۟ۥۣۖۢۗۥ۠⁣⁠⁤ۖۤ⁤, reason: contains not printable characters */
    public static String m2115() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(86168);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۖۥ⁤⁤⁤⁣ۥۥۣ⁠⁤⁤ۣۖۤۥۥ, reason: contains not printable characters */
    public static void m2116(Object obj, Object obj2, int i) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            C0462.m1785n(50863, (Activity) obj, new Object[]{(String[]) obj2, Integer.valueOf(i)});
        }
    }

    /* renamed from: ۥ⁤⁤ۖ⁤ۜۨۥ⁣ۡۖۖ۟۬⁤ۥۧۤ⁣ۥ, reason: contains not printable characters */
    public static MenuItem m2117(Object obj, boolean z) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return (MenuItem) C0462.m1785n(27429, (MenuItem) obj, new Object[]{Boolean.valueOf(z)});
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤۟⁤ۖ⁠ۖۖۖۖ⁠⁤⁤⁠⁤ۖ⁣ۥ⁠, reason: contains not printable characters */
    public static String m2118() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0462.m1783n(24051);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۡۖ⁤ۖۖۥۣ۟⁤⁤ۖ⁠ۖ⁣۬⁤ۣ, reason: contains not printable characters */
    public static MainActivity.AsyncTaskC0353a0 m2119(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (MainActivity.AsyncTaskC0353a0) C0462.m1784n(39877, (RunnableC0340e) obj);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۢۖۖ⁣ۨ⁤ۣۤۖۥ⁤⁤ۖ⁠⁠ۨ⁣, reason: contains not printable characters */
    public static String m2120() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0462.m1783n(95410);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۢۖۖ⁤⁠ۧۖۧۖۨ⁠۠ۖ⁠ۗۦ⁠, reason: contains not printable characters */
    public static String m2121() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0462.m1783n(34519);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۢۗ⁤ۥۧۥۥۖ⁤ۖ⁣ۤ⁣ۥۤۥۖ, reason: contains not printable characters */
    public static AlertDialog.Builder m2122(Object obj, boolean z) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (AlertDialog.Builder) C0462.m1785n(75989, (AlertDialog.Builder) obj, new Object[]{Boolean.valueOf(z)});
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۤۥۤ⁤⁠ۗۖۥۣۥۖۥ⁠⁤⁠ۨۢ, reason: contains not printable characters */
    public static String m2123(String str) {
        String str2;
        String str3;
        String str4;
        Integer num = new Integer(9758617);
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
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((Integer) C0462.m1785n(8451, null, new Object[]{str})).intValue() / (((Integer) C0469.m1839n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 9758619));
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
        String str7 = (String) C0471.m1857n(53538, null, new Object[]{(short[]) C0462.m1785n(40947, null, new Object[0]), Integer.valueOf(((Integer) C0462.m1785n(76044, null, new Object[]{(String) C0462.m1785n(23873, null, new Object[0])})).intValue() ^ 1753421), Integer.valueOf(((Integer) C0462.m1785n(76044, null, new Object[]{(String) C0462.m1785n(69207, null, new Object[0])})).intValue() ^ 1752523), Integer.valueOf(((Integer) C0462.m1785n(76044, null, new Object[]{(String) C0462.m1785n(92223, null, new Object[0])})).intValue() ^ 1750180)});
        while (true) {
            str4 = str7;
            if (((Integer) C0462.m1785n(8451, null, new Object[]{str4})).intValue() <= 0) {
                break;
            }
            str7 = (String) C0462.m1785n(93145, null, new Object[0]);
            if (((Integer) C0462.m1785n(8451, null, new Object[]{str7})).intValue() == 0) {
                str7 = (String) C0471.m1857n(41863, null, new Object[]{(short[]) C0462.m1785n(40947, null, new Object[0]), Integer.valueOf(((Integer) C0462.m1785n(76044, null, new Object[]{(String) C0471.m1857n(26155, null, new Object[0])})).intValue() ^ 1751710), Integer.valueOf(((Integer) C0462.m1785n(76044, null, new Object[]{(String) C0471.m1857n(2317, null, new Object[0])})).intValue() ^ 56329), Integer.valueOf(((Integer) C0462.m1785n(76044, null, new Object[]{(String) C0471.m1857n(37658, null, new Object[0])})).intValue() ^ 1752104)});
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

    /* renamed from: ۥ⁤⁤ۥ⁠ۖ⁤ۥ⁤ۖ⁤ۖ۬⁠ۦ⁠۟ۖۨ⁤, reason: contains not printable characters */
    public static CharSequence m2124(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (CharSequence) C0471.m1857n(47898, (TextView) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۧ⁣ۣ۟⁠⁤ۖۢ⁠⁣ۖۜ⁤ۣۥۜ۠, reason: contains not printable characters */
    public static String m2125() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0471.m1855n(24300);
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤⁠⁠۬ۢۖ⁤⁤ۨۖۥ⁤⁤ۖ⁤ۖ⁤ۢ, reason: contains not printable characters */
    public static AlertDialog.Builder m2126(Object obj, Object obj2, Object obj3) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (AlertDialog.Builder) C0471.m1857n(76296, (AlertDialog.Builder) obj, new Object[]{(CharSequence) obj2, (DialogInterface.OnClickListener) obj3});
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤⁣⁠ۖۖۥۤ⁣ۤۖ⁤⁤⁣ۥۣۨ⁠ۜ, reason: contains not printable characters */
    public static MainActivity m2127(Object obj) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (MainActivity) C0471.m1856n(99218, (MainActivity.AsyncTaskC0380v) obj);
        }
        return null;
    }

    /* renamed from: ۦۣۖ۟ۢۗ۠ۜ⁣⁠ۢۥۜۥ⁣۠⁤⁤ۖ۟, reason: contains not printable characters */
    public static String m2128() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0471.m1855n(47830);
        }
        return null;
    }

    /* renamed from: ۦۖۧۖۖ⁤۬⁤ۖ⁤⁤⁤ۖۗ⁤⁤ۖۥ⁤ۖ, reason: contains not printable characters */
    public static String m2129() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0471.m1855n(91358);
        }
        return null;
    }

    /* renamed from: ۦۗ⁤ۣۤۗۖ⁤ۖۖ⁤⁠ۣۖ۠ۦۖ⁤⁤ۥ, reason: contains not printable characters */
    public static String m2130(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0471.m1857n(50081, (File) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۦ۠ۧۤ⁤ۖۤ⁠ۥ⁤ۖۥۖ⁠ۖ۟⁠ۖ۬⁠, reason: contains not printable characters */
    public static String m2131() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0471.m1855n(63208);
        }
        return null;
    }

    /* renamed from: ۦۢۖۥ۟ۖ⁤ۣۖۖۖ۟ۥۧۢۗ⁠⁠⁣ۥ, reason: contains not printable characters */
    public static String m2132(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0471.m1857n(15618, (CharSequence) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۦۥۖ۬⁤۟ۥ۟ۥ⁠ۖ⁤⁣ۖۖۖۤ⁤ۥ۬, reason: contains not printable characters */
    public static String m2133() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0447.m1648n(9089);
        }
        return null;
    }

    /* renamed from: ۦۥۜ۬⁠⁠ۥۖ⁤ۥۖ⁤ۖۤ⁣ۖ⁠⁠ۖۧ, reason: contains not printable characters */
    public static boolean m2134(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() <= 0) {
            return ((Boolean) C0447.m1650n(77000, (CheckBox) obj, new Object[0])).booleanValue();
        }
        return false;
    }

    /* renamed from: ۦۥۣۖۜۖۥۥ⁤ۥۖ⁠⁠۬ۖ⁠ۥ⁤⁤ۖ, reason: contains not printable characters */
    public static String m2135() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0447.m1648n(84148);
        }
        return null;
    }

    /* renamed from: ۦۥ۬⁤⁤ۖۖۗ۟ۜ۬۬⁤ۣۖۥ⁣⁠ۥۖ, reason: contains not printable characters */
    public static String m2136() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0447.m1648n(90227);
        }
        return null;
    }

    /* renamed from: ۦۥ⁤ۥ⁤⁣ۢۖۥۣۨ۟⁤ۜ⁣⁤⁤ۖۥ⁤, reason: contains not printable characters */
    public static String m2137() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0447.m1648n(33378);
        }
        return null;
    }

    /* renamed from: ۦۧ⁤ۥۖۥۖ⁠ۣۖ۬⁤ۢ⁠۬⁣ۖ۟⁠⁤, reason: contains not printable characters */
    public static String m2138() {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return (String) C0447.m1648n(44489);
        }
        return null;
    }

    /* renamed from: ۦ⁠ۖۥۣۥ⁠ۗ⁠ۤۗ⁤⁤⁤⁠ۥ⁤⁤⁤ۖ, reason: contains not printable characters */
    public static String m2139() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0447.m1648n(20739);
        }
        return null;
    }

    /* renamed from: ۦ⁠ۖ⁠۠⁣⁤ۣۖۖۖ⁣⁠ۗ⁣ۣ⁤ۥ⁣ۤ, reason: contains not printable characters */
    public static int m2140(Object obj) {
        if (((Integer) C0452.m1695n(57336, null, new Object[0])).intValue() < 0) {
            return ((Integer) C0447.m1650n(35180, (Spinner) obj, new Object[0])).intValue();
        }
        return 0;
    }

    /* renamed from: ۦ⁠ۖ⁠⁣ۥ⁤ۤۧ⁤ۨۨ⁤ۗۖ⁠۟ۖ⁤۟, reason: contains not printable characters */
    public static String m2141() {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0469.m1837n(46217);
        }
        return null;
    }

    /* renamed from: ۦ⁠ۢ۟ۥۖۥۧۡ⁤ۥۤۥۖ⁤ۖ⁤ۖ⁠ۥ, reason: contains not printable characters */
    public static Spinner m2142(Object obj) {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() > 0) {
            return (Spinner) C0447.m1649n(30001, (MainActivity) obj);
        }
        return null;
    }

    /* renamed from: ۦ⁣ۖۥ۟⁣ۖ⁤⁣⁣⁣۠⁠⁤ۥ⁠⁤⁠⁠ۧ, reason: contains not printable characters */
    public static String m2143() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (String) C0447.m1648n(82025);
        }
        return null;
    }

    /* renamed from: ۦ⁤ۣۣ۬ۥ⁠⁣⁤⁤⁠⁠ۖۤ⁣ۖۖۖ⁤⁠, reason: contains not printable characters */
    public static String m2144() {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0447.m1648n(82739);
        }
        return null;
    }

    /* renamed from: ۦ⁤⁤۟ۨ⁤ۧ⁤⁤ۥ⁠⁠⁠⁠⁠⁠⁤⁤⁤⁤, reason: contains not printable characters */
    public static String[] m2145(Object obj, int i) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String[]) C0447.m1650n(33973, (Resources) obj, new Object[]{Integer.valueOf(i)});
        }
        return null;
    }
}
