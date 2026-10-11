package com.anishtayin.pkg144;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes.dex */
public class MainActivity extends abx.b.d.a.l {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f24short;
    public Spinner A;
    public Spinner B;
    public ToggleButton[] C;
    public CheckBox D;
    public int E;
    public ArrayList<String> F;
    public String[] G;
    public ArrayList<String> H;
    public ListView I;
    public CheckBox J;
    public TextView K;
    public int L;
    public int M;
    public int N;
    public LinearLayout O;
    public LinearLayout P;
    public LinearLayout Q;
    public LinearLayout Rvar;
    public LinearLayout S;
    public LinearLayout T;
    public ViewGroup.LayoutParams U;
    public ViewGroup.LayoutParams V;
    public ViewGroup.LayoutParams W;
    public ViewGroup.LayoutParams X;
    public ViewGroup.LayoutParams Y;
    public ViewGroup.LayoutParams Z;
    public LinearLayout.LayoutParams a0;
    public ScrollView b0;
    public String c0;
    public SharedPreferences d0;
    public boolean p;
    public ProgressDialog q;
    public EditText r;
    public TextView s;
    public String t;
    public double u;
    public File v;
    public File w;
    public CheckBox x;
    public CheckBox y;
    public Spinner z;

    public static class a implements Runnable {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f25short;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f752b;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(8482993)}[0], new Object[0])).intValue() ^ 8482994];
            sArr[0] = 1466;
            sArr[1] = 1440;
            sArr[2] = 1424;
            f25short = sArr;
        }

        public a(File file) {
            this.f752b = file;
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0109.n(13581, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0055.n(72795)})})});
            }
        }

        /* renamed from: ۥۖ⁤۟⁤⁣⁤⁤ۖۦۖۨۧۥ⁠⁣⁠⁤⁤⁤, reason: contains not printable characters */
        public static int m1091(Object obj) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ⁠⁤ۣۡ۟ۥۗۜۢ۟ۥ۬۠ۤۖۨۥ⁠۟, reason: contains not printable characters */
        public static String m1092(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤⁤⁤ۥۖۖ⁣⁣ۖ۬⁣⁤ۥۖ۠ۥۖۥ⁤, reason: contains not printable characters */
        public static short[] m1093() {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (short[]) C0055.n(30905);
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            ProgressDialog progressDialog = (ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0055.n(32796, null, new Object[]{this})});
            StringBuilder sb = new StringBuilder();
            C0091.n(86830, null, new Object[]{progressDialog, (String) C0104.n(48310, null, new Object[]{sb})});
        }
    }

    public static class a0 extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f26short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(8037698)}[0], new Object[0])).intValue() ^ 8037672];
            sArr[0] = 677;
            sArr[1] = 739;
            sArr[2] = 748;
            sArr[3] = 747;
            sArr[4] = 737;
            sArr[5] = 677;
            sArr[6] = 682;
            sArr[7] = 758;
            sArr[8] = 737;
            sArr[9] = 742;
            sArr[10] = 740;
            sArr[11] = 759;
            sArr[12] = 737;
            sArr[13] = 682;
            sArr[14] = 677;
            sArr[15] = 680;
            sArr[16] = 753;
            sArr[17] = 764;
            sArr[18] = 757;
            sArr[19] = 736;
            sArr[20] = 677;
            sArr[21] = 737;
            sArr[22] = 677;
            sArr[23] = 761;
            sArr[24] = 677;
            sArr[25] = 1078;
            sArr[26] = 1125;
            sArr[27] = 1145;
            sArr[28] = 1124;
            sArr[29] = 1122;
            sArr[30] = 1078;
            sArr[31] = 1083;
            sArr[32] = 1124;
            sArr[33] = 1078;
            sArr[34] = 1130;
            sArr[35] = 1078;
            sArr[36] = 1121;
            sArr[37] = 1150;
            sArr[38] = 1151;
            sArr[39] = 1146;
            sArr[40] = 1139;
            sArr[41] = 1078;
            sArr[42] = 1124;
            sArr[43] = 1139;
            sArr[44] = 1143;
            sArr[45] = 1138;
            sArr[46] = 1078;
            sArr[47] = 1146;
            sArr[48] = 1144;
            sArr[49] = 1078;
            sArr[50] = 1069;
            sArr[51] = 1078;
            sArr[52] = 1138;
            sArr[53] = 1145;
            sArr[54] = 1078;
            sArr[55] = 1460;
            sArr[56] = 1510;
            sArr[57] = 1529;
            sArr[58] = 1520;
            sArr[59] = 1533;
            sArr[60] = 1510;
            sArr[61] = 1460;
            sArr[62] = 1462;
            sArr[63] = 1456;
            sArr[64] = 1528;
            sArr[65] = 1530;
            sArr[66] = 1462;
            sArr[67] = 1460;
            sArr[68] = 1446;
            sArr[69] = 1450;
            sArr[70] = 1460;
            sArr[71] = 1467;
            sArr[72] = 1520;
            sArr[73] = 1521;
            sArr[74] = 1506;
            sArr[75] = 1467;
            sArr[76] = 1530;
            sArr[77] = 1505;
            sArr[78] = 1528;
            sArr[79] = 1528;
            sArr[80] = 1460;
            sArr[81] = 1455;
            sArr[82] = 1460;
            sArr[83] = 1520;
            sArr[84] = 1531;
            sArr[85] = 1530;
            sArr[86] = 1521;
            sArr[87] = 783;
            sArr[88] = 841;
            sArr[89] = 838;
            sArr[90] = 833;
            sArr[91] = 843;
            sArr[92] = 783;
            sArr[93] = 781;
            sArr[94] = 322;
            sArr[95] = 320;
            sArr[96] = 333;
            sArr[97] = 276;
            sArr[98] = 281;
            sArr[99] = 272;
            sArr[100] = 261;
            sArr[101] = 320;
            sArr[102] = 260;
            sArr[103] = 320;
            sArr[104] = 284;
            sArr[105] = 320;
            f26short = sArr;
        }

        public /* synthetic */ a0(i iVar) {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0043.n(80863, (PrintStream) C0104.n(12888), new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0096.n(76800)})});
            }
        }

        /* renamed from: ۥۜۥۖ⁠⁠⁤⁣ۥۖۖ⁠ۥ⁣⁤ۥ⁤۟ۢ۠, reason: contains not printable characters */
        public static String m1094(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۜ⁤۠ۥ⁠⁠⁤ۖ⁠⁣ۢ⁤ۧ⁠ۥۧۤ⁤ۣ, reason: contains not printable characters */
        public static short[] m1095() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (short[]) C0096.n(24579);
            }
            return null;
        }

        /* renamed from: ۥ⁠ۤۖۖ⁣⁤ۖ۠⁤⁠ۧ۠ۥۗۥ⁠ۨ۠۬, reason: contains not printable characters */
        public static String m1096(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤۟⁠ۤ⁤ۖۖۖۤ⁣ۖ⁠⁤۟ۥۖۤ⁤ۜ, reason: contains not printable characters */
        public static int m1097(Object obj) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            if (!((Boolean) C0096.n(25289, null, new Object[]{(CheckBox) C0096.n(45379, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this})})})).booleanValue()) {
                C0101.n(46515, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this}), new cbx.f(this)});
                MainActivity mainActivity = (MainActivity) C0048.n(59107, null, new Object[]{this});
                C0083.n(2697, null, new Object[]{mainActivity, (File) C0083.n(47254, null, new Object[]{mainActivity})});
                if (((File[]) C0083.n(22591, null, new Object[]{(File) C0083.n(52096, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this})})})) == null) {
                    return null;
                }
                C0101.n(46515, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this}), new cbx.g(this)});
                MainActivity mainActivity2 = (MainActivity) C0048.n(59107, null, new Object[]{this});
                C0083.n(2697, null, new Object[]{mainActivity2, (File) C0083.n(52096, null, new Object[]{mainActivity2})});
                return null;
            }
            C0101.n(46515, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this}), new cbx.d(this)});
            StringBuilder sb = new StringBuilder();
            String str = (String) C0083.n(64568, null, new Object[]{(short[]) C0096.n(82189, null, new Object[0]), Integer.valueOf(((Integer) C0096.n(64006, null, new Object[]{(String) C0083.n(54011, null, new Object[0])})).intValue() ^ 1747748), Integer.valueOf(((Integer) C0096.n(64006, null, new Object[]{(String) C0099.n(4726, null, new Object[0])})).intValue() ^ 1791), Integer.valueOf(((Integer) C0096.n(64006, null, new Object[]{(String) C0083.n(84815, null, new Object[0])})).intValue() ^ 1745902)});
            String str2 = (String) C0096.n(48052, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this})});
            String str3 = (String) C0083.n(64568, null, new Object[]{(short[]) C0096.n(82189, null, new Object[0]), Integer.valueOf(((Integer) C0096.n(64006, null, new Object[]{(String) C0091.n(52230, null, new Object[0])})).intValue() ^ 1746698), Integer.valueOf(((Integer) C0096.n(64006, null, new Object[]{(String) C0083.n(76430, null, new Object[0])})).intValue() ^ 1747967), Integer.valueOf(((Integer) C0096.n(64006, null, new Object[]{(String) C0083.n(31648, null, new Object[0])})).intValue() ^ 1745579)});
            C0083.n(39709, null, new Object[]{sb, str2, str3});
            C0101.n(46515, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this}), new cbx.e(this)});
            StringBuilder sb2 = new StringBuilder();
            C0083.n(39709, null, new Object[]{sb2, (String) C0096.n(48052, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this})}), str3});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(5308343), new Integer(2138357158)};
            MainActivity mainActivity = (MainActivity) C0048.n(59107, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0048.n(59107, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 7978421), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 5308342)});
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0104.n(17735, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0055.n(18696)})})});
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0048.n(59107, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0096.n(64006, null, new Object[]{(String) C0055.n(77339, null, new Object[0])})).intValue() ^ (2131590962 ^ ((Integer) C0096.n(64006, null, new Object[]{(String) C0055.n(10405, null, new Object[0])})).intValue()))})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0048.n(59107, null, new Object[]{this})})});
        }
    }

    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f755b;

        public b(int i) {
            this.f755b = i;
            if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0104.n(17735, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0058.n(41631)})})});
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity mainActivity = (MainActivity) C0058.n(29796, null, new Object[]{this});
            C0058.n(6247, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{mainActivity}))[((Integer) C0058.n(70090, null, new Object[]{this})).intValue()], (LinearLayout.LayoutParams) C0082.n(97623, null, new Object[]{mainActivity})});
        }
    }

    public static class b0 extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f27short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(1207561)}[0], new Object[0])).intValue() ^ 1207673];
            sArr[0] = 1190;
            sArr[1] = 1248;
            sArr[2] = 1263;
            sArr[3] = 1256;
            sArr[4] = 1250;
            sArr[5] = 1190;
            sArr[6] = 1193;
            sArr[7] = 1269;
            sArr[8] = 1250;
            sArr[9] = 1253;
            sArr[10] = 1255;
            sArr[11] = 1268;
            sArr[12] = 1250;
            sArr[13] = 1193;
            sArr[14] = 1190;
            sArr[15] = 1195;
            sArr[16] = 1256;
            sArr[17] = 1255;
            sArr[18] = 1259;
            sArr[19] = 1251;
            sArr[20] = 1190;
            sArr[21] = 1185;
            sArr[22] = 1192;
            sArr[23] = 1256;
            sArr[24] = 1257;
            sArr[25] = 1259;
            sArr[26] = 1251;
            sArr[27] = 1250;
            sArr[28] = 1263;
            sArr[29] = 1255;
            sArr[30] = 1185;
            sArr[31] = 1190;
            sArr[32] = 1195;
            sArr[33] = 1266;
            sArr[34] = 1279;
            sArr[35] = 1270;
            sArr[36] = 1251;
            sArr[37] = 1190;
            sArr[38] = 1248;
            sArr[39] = 1190;
            sArr[40] = 1195;
            sArr[41] = 1250;
            sArr[42] = 1251;
            sArr[43] = 1258;
            sArr[44] = 1251;
            sArr[45] = 1266;
            sArr[46] = 1251;
            sArr[47] = 1190;
            sArr[48] = 1204;
            sArr[49] = 1208;
            sArr[50] = 1190;
            sArr[51] = 1193;
            sArr[52] = 1250;
            sArr[53] = 1251;
            sArr[54] = 1264;
            sArr[55] = 1193;
            sArr[56] = 1256;
            sArr[57] = 1267;
            sArr[58] = 1258;
            sArr[59] = 1258;
            sArr[60] = 677;
            sArr[61] = 739;
            sArr[62] = 748;
            sArr[63] = 747;
            sArr[64] = 737;
            sArr[65] = 677;
            sArr[66] = 923;
            sArr[67] = 918;
            sArr[68] = 981;
            sArr[69] = 986;
            sArr[70] = 982;
            sArr[71] = 990;
            sArr[72] = 923;
            sArr[73] = 924;
            sArr[74] = 917;
            sArr[75] = 981;
            sArr[76] = 980;
            sArr[77] = 982;
            sArr[78] = 990;
            sArr[79] = 991;
            sArr[80] = 978;
            sArr[81] = 986;
            sArr[82] = 924;
            sArr[83] = 923;
            sArr[84] = 918;
            sArr[85] = 975;
            sArr[86] = 962;
            sArr[87] = 971;
            sArr[88] = 990;
            sArr[89] = 923;
            sArr[90] = 989;
            sArr[91] = 923;
            sArr[92] = 918;
            sArr[93] = 991;
            sArr[94] = 990;
            sArr[95] = 983;
            sArr[96] = 990;
            sArr[97] = 975;
            sArr[98] = 990;
            sArr[99] = 923;
            sArr[100] = 905;
            sArr[101] = 901;
            sArr[102] = 923;
            sArr[103] = 916;
            sArr[104] = 991;
            sArr[105] = 990;
            sArr[106] = 973;
            sArr[107] = 916;
            sArr[108] = 981;
            sArr[109] = 974;
            sArr[110] = 983;
            sArr[111] = 983;
            f27short = sArr;
        }

        public /* synthetic */ b0(i iVar) {
            if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0091.n(85432, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0055.n(72999)})})});
            }
        }

        /* renamed from: ۥۖ⁤⁤ۧ⁤⁣۟⁣ۖ⁤ۣ⁣ۢ۬⁣⁣ۧ⁤⁤, reason: contains not printable characters */
        public static String m1098(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۣ۟⁣⁤⁠ۖۥ⁤۟ۖ⁠⁤ۜ⁠ۧ⁣⁤⁤ۖ, reason: contains not printable characters */
        public static short[] m1099() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return (short[]) C0055.n(19976);
            }
            return null;
        }

        /* renamed from: ۥۢ⁠ۣۣۖۖ⁠⁤⁤ۖ⁤ۦ⁤ۥۣ⁣ۖۖۤ, reason: contains not printable characters */
        public static String m1100(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۥۡ⁠ۥ⁤ۤ۟⁣ۦ⁤⁣ۖ⁤⁣⁣⁠⁣ۥۥ, reason: contains not printable characters */
        public static int m1101(Object obj) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ⁣⁤ۣۥۨ⁣⁤ۤ⁣⁤ۖ⁠۟ۖ⁣⁠ۣۥۖ, reason: contains not printable characters */
        public static String m1102(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            C0101.n(46515, null, new Object[]{(MainActivity) C0109.n(3248, null, new Object[]{this}), new cbx.h(this)});
            C0083.n(39709, null, new Object[]{new StringBuilder(), (String) C0096.n(48052, null, new Object[]{(MainActivity) C0109.n(3248, null, new Object[]{this})}), (String) C0058.n(74177, null, new Object[]{(short[]) C0055.n(60006, null, new Object[0]), Integer.valueOf(((Integer) C0058.n(71085, null, new Object[]{(String) C0058.n(64207, null, new Object[0])})).intValue() ^ 1751682), Integer.valueOf(((Integer) C0058.n(71085, null, new Object[]{(String) C0058.n(76964, null, new Object[0])})).intValue() ^ 1749660), Integer.valueOf(1750723 ^ ((Integer) C0058.n(71085, null, new Object[]{(String) C0055.n(20436, null, new Object[0])})).intValue())})});
            C0101.n(46515, null, new Object[]{(MainActivity) C0109.n(3248, null, new Object[]{this}), new cbx.i(this)});
            StringBuilder sb = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(2131526710), new Integer(3397989)};
            MainActivity mainActivity = (MainActivity) C0109.n(3248, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0109.n(3248, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 99386), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 3397988)});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0109.n(3248, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0058.n(71085, null, new Object[]{(String) C0058.n(60564, null, new Object[0])})).intValue() ^ 2132259434)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0109.n(3248, null, new Object[]{this})})});
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0058.n(64298)})})});
            }
        }
    }

    public static class c implements Runnable {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f28short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(480849)}[0], new Object[0])).intValue() ^ 480815];
            sArr[0] = 1688;
            sArr[1] = 573;
            sArr[2] = 609;
            sArr[3] = 619;
            sArr[4] = 609;
            sArr[5] = 573;
            sArr[6] = 630;
            sArr[7] = 631;
            sArr[8] = 612;
            sArr[9] = 635;
            sArr[10] = 625;
            sArr[11] = 631;
            sArr[12] = 609;
            sArr[13] = 573;
            sArr[14] = 609;
            sArr[15] = 619;
            sArr[16] = 609;
            sArr[17] = 614;
            sArr[18] = 631;
            sArr[19] = 639;
            sArr[20] = 573;
            sArr[21] = 625;
            sArr[22] = 610;
            sArr[23] = 615;
            sArr[24] = 573;
            sArr[25] = 625;
            sArr[26] = 610;
            sArr[27] = 615;
            sArr[28] = 3145;
            sArr[29] = 3081;
            sArr[30] = 3080;
            sArr[31] = 3082;
            sArr[32] = 3087;
            sArr[33] = 3080;
            sArr[34] = 3075;
            sArr[35] = 1515;
            sArr[36] = 1516;
            sArr[37] = 1529;
            sArr[38] = 1516;
            sArr[39] = 1464;
            sArr[40] = 1463;
            sArr[41] = 1515;
            sArr[42] = 1505;
            sArr[43] = 1515;
            sArr[44] = 1463;
            sArr[45] = 1532;
            sArr[46] = 1533;
            sArr[47] = 1518;
            sArr[48] = 1521;
            sArr[49] = 1531;
            sArr[50] = 1533;
            sArr[51] = 1515;
            sArr[52] = 1463;
            sArr[53] = 1515;
            sArr[54] = 1505;
            sArr[55] = 1515;
            sArr[56] = 1516;
            sArr[57] = 1533;
            sArr[58] = 1525;
            sArr[59] = 1463;
            sArr[60] = 1531;
            sArr[61] = 1512;
            sArr[62] = 1517;
            sArr[63] = 1463;
            sArr[64] = 1531;
            sArr[65] = 1512;
            sArr[66] = 1517;
            sArr[67] = 510;
            sArr[68] = 446;
            sArr[69] = 447;
            sArr[70] = 445;
            sArr[71] = 440;
            sArr[72] = 447;
            sArr[73] = 436;
            sArr[74] = 497;
            sArr[75] = 508;
            sArr[76] = 434;
            sArr[77] = 497;
            sArr[78] = 499;
            sArr[79] = 500;
            sArr[80] = 432;
            sArr[81] = 497;
            sArr[82] = 500;
            sArr[83] = 447;
            sArr[84] = 499;
            sArr[85] = 2543;
            sArr[86] = 2543;
            sArr[87] = 2543;
            sArr[88] = 2191;
            sArr[89] = 2252;
            sArr[90] = 2247;
            sArr[91] = 2242;
            sArr[92] = 2240;
            sArr[93] = 2251;
            sArr[94] = 2191;
            sArr[95] = 2201;
            sArr[96] = 2203;
            sArr[97] = 2203;
            sArr[98] = 2191;
            sArr[99] = 2176;
            sArr[100] = 2268;
            sArr[101] = 2262;
            sArr[102] = 2268;
            sArr[103] = 2176;
            sArr[104] = 2251;
            sArr[105] = 2250;
            sArr[106] = 2265;
            sArr[107] = 2246;
            sArr[108] = 2252;
            sArr[109] = 2250;
            sArr[110] = 2268;
            sArr[111] = 2176;
            sArr[112] = 2268;
            sArr[113] = 2262;
            sArr[114] = 2268;
            sArr[115] = 2267;
            sArr[116] = 2250;
            sArr[117] = 2242;
            sArr[118] = 2176;
            sArr[119] = 2252;
            sArr[120] = 2271;
            sArr[121] = 2266;
            sArr[122] = 2176;
            sArr[123] = 2252;
            sArr[124] = 2271;
            sArr[125] = 2266;
            f28short = sArr;
        }

        public c() {
            if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
                C0052.n(84044, (PrintStream) C0104.n(12888), new Object[]{Float.valueOf(((Float) C0052.n(71646, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0052.n(2583)})})).floatValue())});
            }
        }

        /* renamed from: ۥۣۗ⁤⁠⁤ۥۖ⁠ۣۗۧۖۨۥ⁤ۖ⁤ۦۖ, reason: contains not printable characters */
        public static short[] m1103() {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (short[]) C0052.n(17038);
            }
            return null;
        }

        /* renamed from: ۥۥ۟⁠⁠⁠ۤۖ⁠⁠ۖۢ⁤ۣۡۖۨۥۖۢ, reason: contains not printable characters */
        public static String m1104(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۥۥۗۨ⁤ۧۢۢۗۥ⁤⁤ۣۢۖۗ۟ۖ⁠, reason: contains not printable characters */
        public static String m1105(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ۬⁤ۗ⁣ۖ⁠⁤ۥ⁣⁠⁤۬ۖۡۗ⁤⁤⁠⁤, reason: contains not printable characters */
        public static String m1106(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁠⁤ۤ⁤ۣۧۥۖۧۖۖۧۨۥ⁠ۖۗۥۣ, reason: contains not printable characters */
        public static String m1107(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁣ۥۥۖ⁤⁤ۖۖۢ⁤ۗ⁤ۖ⁤⁤ۖ⁣ۥ⁣, reason: contains not printable characters */
        public static int m1108(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ⁤⁤ۥ۬ۤ۟ۖۨ⁠⁤ۜۢ⁣ۖۥۖ۟⁠ۣ, reason: contains not printable characters */
        public static Resources m1109(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return (Resources) C0052.n(48685, (abx.b.d.a.l) obj, new Object[0]);
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            Object[] objArr = {new Integer(2138993762), new Integer(2133119939)};
            int i = 0;
            while (true) {
                int i2 = i;
                int intValue = ((Integer) C0042.n(79139, null, new Object[]{(MainActivity) C0052.n(85028, null, new Object[]{this})})).intValue();
                str = (String) C0042.n(78785, null, new Object[]{(short[]) C0042.n(41668, null, new Object[0]), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0042.n(17863, null, new Object[0])})).intValue() ^ 1752583), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0042.n(17847, null, new Object[0])})).intValue() ^ 1752548), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0042.n(2763, null, new Object[0])})).intValue() ^ 1749165)});
                str2 = (String) C0042.n(95002, null, new Object[]{(short[]) C0042.n(41668, null, new Object[0]), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0042.n(44845, null, new Object[0])})).intValue() ^ 1754411), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0083.n(93744, null, new Object[0])})).intValue() ^ 1751569), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0054.n(25154, null, new Object[0])})).intValue() ^ 1749072)});
                str3 = (String) C0042.n(39192, null, new Object[]{(short[]) C0042.n(41668, null, new Object[0]), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0042.n(15662, null, new Object[0])})).intValue() ^ 1750686), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0042.n(35653, null, new Object[0])})).intValue() ^ 1749703), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0042.n(58848, null, new Object[0])})).intValue() ^ 1752932)});
                if (i2 >= intValue) {
                    break;
                }
                StringBuilder sb = new StringBuilder();
                if (((Boolean) C0066.n(48385, null, new Object[]{new File((String) C0104.n(48310, null, new Object[]{sb}))})).booleanValue()) {
                    StringBuilder sb2 = new StringBuilder();
                    if (((Boolean) C0076.n(33096, null, new Object[]{(String) C0101.n(13801, null, new Object[]{(String) C0104.n(48310, null, new Object[]{((StringBuilder[]) C0078.n(35629, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb2})}))[0]})}), (String) C0076.n(8498, null, new Object[]{(short[]) C0042.n(41668, null, new Object[0]), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0076.n(73503, null, new Object[0])})).intValue() ^ 1751795), Integer.valueOf(((Integer) C0042.n(31500, null, new Object[]{(String) C0088.n(78033, null, new Object[0])})).intValue() ^ 1754660), Integer.valueOf(1746776 ^ ((Integer) C0042.n(31500, null, new Object[]{(String) C0076.n(61244, null, new Object[0])})).intValue())})})).booleanValue()) {
                        StringBuilder sb3 = new StringBuilder();
                        if (((Boolean) C0099.n(64527, null, new Object[]{(String) C0076.n(86703, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb3})}), str})).booleanValue()) {
                            C0076.n(20289, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{(MainActivity) C0052.n(85028, null, new Object[]{this})}))[i2], false});
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb4})});
                            C0076.n(20289, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{(MainActivity) C0052.n(85028, null, new Object[]{this})}))[i2], true});
                        }
                    } else {
                        C0076.n(20289, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{(MainActivity) C0052.n(85028, null, new Object[]{this})}))[i2], true});
                    }
                } else {
                    C0076.n(20289, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{(MainActivity) C0052.n(85028, null, new Object[]{this})}))[i2], false});
                }
                i = i2 + 1;
            }
            int i3 = 0;
            while (true) {
                MainActivity mainActivity = (MainActivity) C0052.n(85028, null, new Object[]{this});
                if (i3 >= ((Integer) C0042.n(79139, null, new Object[]{mainActivity})).intValue()) {
                    break;
                }
                if (((Boolean) C0076.n(53605, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{mainActivity}))[i3]})).booleanValue()) {
                    StringBuilder sb5 = new StringBuilder();
                    if (((Boolean) C0099.n(64527, null, new Object[]{(String) C0076.n(86703, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb5})}), str})).booleanValue()) {
                        MainActivity mainActivity2 = (MainActivity) C0052.n(85028, null, new Object[]{this});
                        C0076.n(90352, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{mainActivity2}))[i3], ((String[]) C0076.n(27156, null, new Object[]{(Resources) C0076.n(85500, null, new Object[]{mainActivity2}), Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 2544578)}))[i3]});
                    } else {
                        MainActivity mainActivity3 = (MainActivity) C0052.n(85028, null, new Object[]{this});
                        C0076.n(90352, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{mainActivity3}))[i3], ((String[]) C0076.n(27156, null, new Object[]{(Resources) C0076.n(85500, null, new Object[]{mainActivity3}), Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 8156256)}))[i3]});
                    }
                }
                i3++;
            }
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0048.n(47446, (PrintStream) C0104.n(12888), new Object[]{Long.valueOf(((Long) C0048.n(90189, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0076.n(15420)})})).longValue())});
            }
        }
    }

    public static class c0 extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f29short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(2825848)}[0], new Object[0])).intValue() ^ 2825766];
            sArr[0] = 1928;
            sArr[1] = 1998;
            sArr[2] = 1985;
            sArr[3] = 1990;
            sArr[4] = 1996;
            sArr[5] = 1928;
            sArr[6] = 1927;
            sArr[7] = 2011;
            sArr[8] = 1996;
            sArr[9] = 1995;
            sArr[10] = 1993;
            sArr[11] = 2010;
            sArr[12] = 1996;
            sArr[13] = 1927;
            sArr[14] = 1928;
            sArr[15] = 1925;
            sArr[16] = 2012;
            sArr[17] = 2001;
            sArr[18] = 2008;
            sArr[19] = 1997;
            sArr[20] = 1928;
            sArr[21] = 1998;
            sArr[22] = 1928;
            sArr[23] = 1925;
            sArr[24] = 2011;
            sArr[25] = 1985;
            sArr[26] = 2002;
            sArr[27] = 1997;
            sArr[28] = 1928;
            sArr[29] = 1944;
            sArr[30] = 1928;
            sArr[31] = 1925;
            sArr[32] = 1996;
            sArr[33] = 1997;
            sArr[34] = 1988;
            sArr[35] = 1997;
            sArr[36] = 2012;
            sArr[37] = 1997;
            sArr[38] = 1928;
            sArr[39] = 1946;
            sArr[40] = 1942;
            sArr[41] = 1928;
            sArr[42] = 1927;
            sArr[43] = 1996;
            sArr[44] = 1997;
            sArr[45] = 2014;
            sArr[46] = 1927;
            sArr[47] = 1990;
            sArr[48] = 2013;
            sArr[49] = 1988;
            sArr[50] = 1988;
            sArr[51] = 338;
            sArr[52] = 276;
            sArr[53] = 283;
            sArr[54] = 284;
            sArr[55] = 278;
            sArr[56] = 338;
            sArr[57] = 888;
            sArr[58] = 885;
            sArr[59] = 812;
            sArr[60] = 801;
            sArr[61] = 808;
            sArr[62] = 829;
            sArr[63] = 888;
            sArr[64] = 830;
            sArr[65] = 888;
            sArr[66] = 885;
            sArr[67] = 811;
            sArr[68] = 817;
            sArr[69] = 802;
            sArr[70] = 829;
            sArr[71] = 888;
            sArr[72] = 872;
            sArr[73] = 888;
            sArr[74] = 885;
            sArr[75] = 828;
            sArr[76] = 829;
            sArr[77] = 820;
            sArr[78] = 829;
            sArr[79] = 812;
            sArr[80] = 829;
            sArr[81] = 888;
            sArr[82] = 874;
            sArr[83] = 870;
            sArr[84] = 888;
            sArr[85] = 887;
            sArr[86] = 828;
            sArr[87] = 829;
            sArr[88] = 814;
            sArr[89] = 887;
            sArr[90] = 822;
            sArr[91] = 813;
            sArr[92] = 820;
            sArr[93] = 820;
            f29short = sArr;
        }

        public /* synthetic */ c0(i iVar) {
            if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0104.n(17735, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0052.n(36339)})})});
            }
        }

        /* renamed from: ۥ۟⁣ۥۜ⁤⁠⁣۠⁤⁠⁤⁤۬ۥۣۖۖ۟ۖ, reason: contains not printable characters */
        public static String m1110(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۣ۠ۖۖۥۥۣ⁠ۗ⁠۟⁤۬⁤۬⁣⁣⁤ۥ, reason: contains not printable characters */
        public static short[] m1111() {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return (short[]) C0052.n(26966);
            }
            return null;
        }

        /* renamed from: ۥۢ⁤⁠⁤⁣ۢ⁤⁤ۖۖۖۥۣ۬ۢۗۖ⁣ۖ, reason: contains not printable characters */
        public static String m1112(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۣۣۨۖۥ⁠ۨۖۥ⁤ۣ۟ۤۨ۟ۖۜ۬ۢ, reason: contains not printable characters */
        public static int m1113(Object obj) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ⁤ۤ⁤ۣ۬ۖ⁤ۣ⁤۠⁣ۖ۟⁤۠⁤ۖ⁤ۜ, reason: contains not printable characters */
        public static String m1114(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            C0101.n(46515, null, new Object[]{(MainActivity) C0060.n(35541, null, new Object[]{this}), new cbx.j(this)});
            C0083.n(39709, null, new Object[]{new StringBuilder(), (String) C0096.n(48052, null, new Object[]{(MainActivity) C0060.n(35541, null, new Object[]{this})}), (String) C0052.n(15059, null, new Object[]{(short[]) C0052.n(98524, null, new Object[0]), Integer.valueOf(((Integer) C0052.n(75500, null, new Object[]{(String) C0052.n(11417, null, new Object[0])})).intValue() ^ 1753481), Integer.valueOf(((Integer) C0052.n(75500, null, new Object[]{(String) C0052.n(79804, null, new Object[0])})).intValue() ^ 56273), Integer.valueOf(1748288 ^ ((Integer) C0052.n(75500, null, new Object[]{(String) C0035.n(12212, null, new Object[0])})).intValue())})});
            C0101.n(46515, null, new Object[]{(MainActivity) C0060.n(35541, null, new Object[]{this}), new cbx.k(this)});
            StringBuilder sb = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(2135068542), new Integer(5783644)};
            MainActivity mainActivity = (MainActivity) C0060.n(35541, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0060.n(35541, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 5214064), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 5783645)});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0060.n(35541, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0052.n(75500, null, new Object[]{(String) C0052.n(86040, null, new Object[0])})).intValue() ^ (2131561218 ^ ((Integer) C0052.n(75500, null, new Object[]{(String) C0052.n(48814, null, new Object[0])})).intValue()))})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0060.n(35541, null, new Object[]{this})})});
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0052.n(59175)})})});
            }
        }
    }

    public static class d implements Runnable {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f30short;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f760b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f761c;
        public final /* synthetic */ int d;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(7576057)}[0], new Object[0])).intValue() ^ 7576061];
            sArr[0] = 2134;
            sArr[1] = 2107;
            sArr[2] = 2110;
            sArr[3] = 2060;
            f30short = sArr;
        }

        public d(String str, int i, int i2) {
            this.f760b = str;
            this.f761c = i;
            this.d = i2;
            if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0091.n(85432, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0067.n(71498)})})});
            }
        }

        /* renamed from: ۥۖ⁠ۧ۟⁠⁣⁤⁣ۖۖۖۖۢۗ⁤ۨ⁤ۥۖ, reason: contains not printable characters */
        public static int m1115(Object obj) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥۡ⁤ۧۖۥۖ⁤ۨۥۖ۟⁤⁤ۖۖۤ⁤⁠ۥ, reason: contains not printable characters */
        public static String m1116(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۥ⁤⁠ۡۗۗۖ⁣ۥ⁣ۥ⁤ۖ⁤ۣۖۖۤۖ, reason: contains not printable characters */
        public static short[] m1117() {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (short[]) C0067.n(1223);
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity mainActivity = (MainActivity) C0067.n(55237, null, new Object[]{this});
            C0067.n(52929, null, new Object[]{(Spinner) C0067.n(59250, null, new Object[]{mainActivity}), Integer.valueOf(((Integer) C0067.n(95118, null, new Object[]{(ArrayList) C0067.n(29356, null, new Object[]{mainActivity}), (String) C0067.n(82615, null, new Object[]{this})})).intValue())});
            MainActivity mainActivity2 = (MainActivity) C0067.n(55237, null, new Object[]{this});
            Spinner spinner = (Spinner) C0067.n(96491, null, new Object[]{mainActivity2});
            ArrayList arrayList = (ArrayList) C0067.n(94321, null, new Object[]{mainActivity2});
            StringBuilder sb = new StringBuilder();
            String str = (String) C0051.n(34792, null, new Object[]{(short[]) C0067.n(42225, null, new Object[0]), Integer.valueOf(((Integer) C0051.n(69585, null, new Object[]{(String) C0051.n(72828, null, new Object[0])})).intValue() ^ 1747807), Integer.valueOf(((Integer) C0051.n(69585, null, new Object[]{(String) C0051.n(39326, null, new Object[0])})).intValue() ^ 1749785), Integer.valueOf(((Integer) C0051.n(69585, null, new Object[]{(String) C0067.n(68973, null, new Object[0])})).intValue() ^ 1748855)});
            C0067.n(52929, null, new Object[]{spinner, Integer.valueOf(((Integer) C0067.n(95118, null, new Object[]{arrayList, (String) C0104.n(48310, null, new Object[]{sb})})).intValue())});
            MainActivity mainActivity3 = (MainActivity) C0067.n(55237, null, new Object[]{this});
            Spinner spinner2 = (Spinner) C0051.n(6058, null, new Object[]{mainActivity3});
            ArrayList arrayList2 = (ArrayList) C0067.n(94321, null, new Object[]{mainActivity3});
            StringBuilder sb2 = new StringBuilder();
            C0067.n(52929, null, new Object[]{spinner2, Integer.valueOf(((Integer) C0067.n(95118, null, new Object[]{arrayList2, (String) C0104.n(48310, null, new Object[]{sb2})})).intValue())});
        }
    }

    public static class d0 extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f31short;

        /* renamed from: a, reason: collision with root package name */
        public StringBuilder f762a;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(5518272)}[0], new Object[0])).intValue() ^ 5517998];
            sArr[0] = 2355;
            sArr[1] = 2430;
            sArr[2] = 2428;
            sArr[3] = 2406;
            sArr[4] = 2429;
            sArr[5] = 2407;
            sArr[6] = 2355;
            sArr[7] = 2366;
            sArr[8] = 2428;
            sArr[9] = 2355;
            sArr[10] = 2401;
            sArr[11] = 2422;
            sArr[12] = 2430;
            sArr[13] = 2428;
            sArr[14] = 2406;
            sArr[15] = 2429;
            sArr[16] = 2407;
            sArr[17] = 2367;
            sArr[18] = 2401;
            sArr[19] = 2404;
            sArr[20] = 2355;
            sArr[21] = 2401;
            sArr[22] = 2428;
            sArr[23] = 2428;
            sArr[24] = 2407;
            sArr[25] = 2421;
            sArr[26] = 2400;
            sArr[27] = 2355;
            sArr[28] = 2364;
            sArr[29] = 2355;
            sArr[30] = 2344;
            sArr[31] = 2355;
            sArr[32] = 591;
            sArr[33] = 514;
            sArr[34] = 512;
            sArr[35] = 538;
            sArr[36] = 513;
            sArr[37] = 539;
            sArr[38] = 591;
            sArr[39] = 578;
            sArr[40] = 512;
            sArr[41] = 591;
            sArr[42] = 541;
            sArr[43] = 522;
            sArr[44] = 514;
            sArr[45] = 512;
            sArr[46] = 538;
            sArr[47] = 513;
            sArr[48] = 539;
            sArr[49] = 579;
            sArr[50] = 541;
            sArr[51] = 536;
            sArr[52] = 591;
            sArr[53] = 576;
            sArr[54] = 524;
            sArr[55] = 526;
            sArr[56] = 524;
            sArr[57] = 519;
            sArr[58] = 522;
            sArr[59] = 591;
            sArr[60] = 596;
            sArr[61] = 591;
            sArr[62] = 3050;
            sArr[63] = 2983;
            sArr[64] = 2981;
            sArr[65] = 3007;
            sArr[66] = 2980;
            sArr[67] = 3006;
            sArr[68] = 3050;
            sArr[69] = 3047;
            sArr[70] = 2981;
            sArr[71] = 3050;
            sArr[72] = 3000;
            sArr[73] = 2991;
            sArr[74] = 2983;
            sArr[75] = 2981;
            sArr[76] = 3007;
            sArr[77] = 2980;
            sArr[78] = 3006;
            sArr[79] = 3046;
            sArr[80] = 3000;
            sArr[81] = 3005;
            sArr[82] = 3050;
            sArr[83] = 3045;
            sArr[84] = 2990;
            sArr[85] = 2987;
            sArr[86] = 3006;
            sArr[87] = 2987;
            sArr[88] = 3050;
            sArr[89] = 3057;
            sArr[90] = 3050;
            sArr[91] = 763;
            sArr[92] = 694;
            sArr[93] = 692;
            sArr[94] = 686;
            sArr[95] = 693;
            sArr[96] = 687;
            sArr[97] = 763;
            sArr[98] = 758;
            sArr[99] = 692;
            sArr[100] = 763;
            sArr[101] = 681;
            sArr[102] = 702;
            sArr[103] = 694;
            sArr[104] = 692;
            sArr[105] = 686;
            sArr[106] = 693;
            sArr[107] = 687;
            sArr[108] = 759;
            sArr[109] = 681;
            sArr[110] = 684;
            sArr[111] = 763;
            sArr[112] = 756;
            sArr[113] = 703;
            sArr[114] = 702;
            sArr[115] = 685;
            sArr[116] = 763;
            sArr[117] = 736;
            sArr[118] = 763;
            sArr[119] = 1106;
            sArr[120] = 1055;
            sArr[121] = 1053;
            sArr[122] = 1031;
            sArr[123] = 1052;
            sArr[124] = 1030;
            sArr[125] = 1106;
            sArr[126] = 1119;
            sArr[127] = 1053;
            sArr[128] = 1106;
            sArr[129] = 1024;
            sArr[130] = 1047;
            sArr[131] = 1055;
            sArr[132] = 1053;
            sArr[133] = 1031;
            sArr[134] = 1052;
            sArr[135] = 1030;
            sArr[136] = 1118;
            sArr[137] = 1024;
            sArr[138] = 1029;
            sArr[139] = 1106;
            sArr[140] = 1117;
            sArr[141] = 1046;
            sArr[142] = 1047;
            sArr[143] = 1028;
            sArr[144] = 1117;
            sArr[145] = 1040;
            sArr[146] = 1054;
            sArr[147] = 1053;
            sArr[148] = 1041;
            sArr[149] = 1049;
            sArr[150] = 1117;
            sArr[151] = 1026;
            sArr[152] = 1054;
            sArr[153] = 1043;
            sArr[154] = 1030;
            sArr[155] = 1044;
            sArr[156] = 1053;
            sArr[157] = 1024;
            sArr[158] = 1055;
            sArr[159] = 1117;
            sArr[160] = 1055;
            sArr[161] = 1025;
            sArr[162] = 1055;
            sArr[163] = 1069;
            sArr[164] = 1025;
            sArr[165] = 1046;
            sArr[166] = 1041;
            sArr[167] = 1041;
            sArr[168] = 1116;
            sArr[169] = 1091;
            sArr[170] = 1117;
            sArr[171] = 1040;
            sArr[172] = 1035;
            sArr[173] = 1119;
            sArr[174] = 1052;
            sArr[175] = 1043;
            sArr[176] = 1055;
            sArr[177] = 1047;
            sArr[178] = 1117;
            sArr[179] = 1044;
            sArr[180] = 1025;
            sArr[181] = 1045;
            sArr[182] = 1106;
            sArr[183] = 1117;
            sArr[184] = 1044;
            sArr[185] = 1025;
            sArr[186] = 1045;
            sArr[187] = 1106;
            sArr[188] = 1097;
            sArr[189] = 1106;
            sArr[190] = 1900;
            sArr[191] = 1825;
            sArr[192] = 1827;
            sArr[193] = 1849;
            sArr[194] = 1826;
            sArr[195] = 1848;
            sArr[196] = 1900;
            sArr[197] = 1889;
            sArr[198] = 1827;
            sArr[199] = 1900;
            sArr[200] = 1854;
            sArr[201] = 1833;
            sArr[202] = 1825;
            sArr[203] = 1827;
            sArr[204] = 1849;
            sArr[205] = 1826;
            sArr[206] = 1848;
            sArr[207] = 1888;
            sArr[208] = 1854;
            sArr[209] = 1851;
            sArr[210] = 1900;
            sArr[211] = 1891;
            sArr[212] = 1832;
            sArr[213] = 1833;
            sArr[214] = 1850;
            sArr[215] = 1891;
            sArr[216] = 1838;
            sArr[217] = 1824;
            sArr[218] = 1827;
            sArr[219] = 1839;
            sArr[220] = 1831;
            sArr[221] = 1891;
            sArr[222] = 1852;
            sArr[223] = 1824;
            sArr[224] = 1837;
            sArr[225] = 1848;
            sArr[226] = 1834;
            sArr[227] = 1827;
            sArr[228] = 1854;
            sArr[229] = 1825;
            sArr[230] = 1891;
            sArr[231] = 1825;
            sArr[232] = 1855;
            sArr[233] = 1825;
            sArr[234] = 1811;
            sArr[235] = 1855;
            sArr[236] = 1832;
            sArr[237] = 1839;
            sArr[238] = 1839;
            sArr[239] = 1890;
            sArr[240] = 1917;
            sArr[241] = 1891;
            sArr[242] = 1838;
            sArr[243] = 1845;
            sArr[244] = 1889;
            sArr[245] = 1826;
            sArr[246] = 1837;
            sArr[247] = 1825;
            sArr[248] = 1833;
            sArr[249] = 1891;
            sArr[250] = 1855;
            sArr[251] = 1845;
            sArr[252] = 1855;
            sArr[253] = 1848;
            sArr[254] = 1833;
            sArr[255] = 1825;
            sArr[256] = 1900;
            sArr[257] = 1891;
            sArr[258] = 1855;
            sArr[259] = 1845;
            sArr[260] = 1855;
            sArr[261] = 1848;
            sArr[262] = 1833;
            sArr[263] = 1825;
            sArr[264] = 1900;
            sArr[265] = 1911;
            sArr[266] = 1900;
            sArr[267] = 983;
            sArr[268] = 922;
            sArr[269] = 920;
            sArr[270] = 898;
            sArr[271] = 921;
            sArr[272] = 899;
            sArr[273] = 983;
            sArr[274] = 986;
            sArr[275] = 920;
            sArr[276] = 983;
            sArr[277] = 901;
            sArr[278] = 914;
            sArr[279] = 922;
            sArr[280] = 920;
            sArr[281] = 898;
            sArr[282] = 921;
            sArr[283] = 899;
            sArr[284] = 987;
            sArr[285] = 901;
            sArr[286] = 896;
            sArr[287] = 983;
            sArr[288] = 984;
            sArr[289] = 900;
            sArr[290] = 910;
            sArr[291] = 900;
            sArr[292] = 899;
            sArr[293] = 914;
            sArr[294] = 922;
            sArr[295] = 983;
            sArr[296] = 972;
            sArr[297] = 983;
            sArr[298] = 1651;
            sArr[299] = 1599;
            sArr[300] = 1568;
            sArr[301] = 1651;
            sArr[302] = 1651;
            sArr[303] = 1660;
            sArr[304] = 1651;
            sArr[305] = 1583;
            sArr[306] = 1651;
            sArr[307] = 1572;
            sArr[308] = 1595;
            sArr[309] = 1594;
            sArr[310] = 1599;
            sArr[311] = 1590;
            sArr[312] = 1651;
            sArr[313] = 1569;
            sArr[314] = 1590;
            sArr[315] = 1586;
            sArr[316] = 1591;
            sArr[317] = 1651;
            sArr[318] = 1599;
            sArr[319] = 1597;
            sArr[320] = 1651;
            sArr[321] = 1640;
            sArr[322] = 1651;
            sArr[323] = 1591;
            sArr[324] = 1596;
            sArr[325] = 1651;
            sArr[326] = 615;
            sArr[327] = 545;
            sArr[328] = 564;
            sArr[329] = 563;
            sArr[330] = 565;
            sArr[331] = 558;
            sArr[332] = 554;
            sArr[333] = 615;
            sArr[334] = 618;
            sArr[335] = 561;
            sArr[336] = 615;
            sArr[337] = 616;
            sArr[338] = 611;
            sArr[339] = 555;
            sArr[340] = 553;
            sArr[341] = 615;
            sArr[342] = 636;
            sArr[343] = 615;
            sArr[344] = 547;
            sArr[345] = 552;
            sArr[346] = 553;
            sArr[347] = 546;
            sArr[348] = 368;
            sArr[349] = 609;
            sArr[350] = 635;
            sArr[351] = 619;
            sArr[352] = 635;
            sArr[353] = 569;
            sArr[354] = 546;
            sArr[355] = 559;
            sArr[356] = 574;
            sArr[357] = 552;
            sArr[358] = 635;
            sArr[359] = 559;
            sArr[360] = 553;
            sArr[361] = 562;
            sArr[362] = 566;
            sArr[363] = 566;
            sArr[364] = 574;
            sArr[365] = 575;
            f31short = sArr;
        }

        public /* synthetic */ d0(i iVar) {
            if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0048.n(9605, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0076.n(72280)})})});
            }
        }

        /* renamed from: ۥۖ⁤⁣⁠۟⁤⁣ۖ⁤ۖ⁤ۣۖۥۖۖۗ⁠ۖ, reason: contains not printable characters */
        public static String m1118(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ۟ۥۥ⁠⁤ۥۗ⁠ۣۣۖۤ⁠⁤ۗ⁣ۣۨ۬, reason: contains not printable characters */
        public static short[] m1119() {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (short[]) C0076.n(48038);
            }
            return null;
        }

        /* renamed from: ۥ۠⁣⁣⁣ۖۥ⁤⁤ۖ۟⁣ۖۖۥۥۥۖۡۖ, reason: contains not printable characters */
        public static String m1120(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁠ۜۥۤ⁤۟⁣ۖۥ⁠۟⁣ۥ⁤⁤۬⁠ۥ⁤, reason: contains not printable characters */
        public static String m1121(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁠۟⁤⁤ۖ⁤ۨۡ۠⁠ۥۣ⁠ۣۨۖۗۖ⁤, reason: contains not printable characters */
        public static int m1122(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ⁠ۢۥ⁠ۢ۬ۦۖ۟۠۬⁤ۥۥ۟⁤⁤⁤ۣ, reason: contains not printable characters */
        public static String m1123(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            StringBuilder sb = new StringBuilder();
            this.f762a = ((StringBuilder[]) C0078.n(35629, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})}))[0];
            C0038.n(89720, null, new Object[]{(PrintStream) C0038.n(32739, null, new Object[0]), (StringBuilder) C0038.n(57683, null, new Object[]{this})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r28) {
            Integer num = new Integer(2139172608);
            StringBuilder sb = new StringBuilder();
            String str = (String) C0104.n(48310, null, new Object[]{(StringBuilder) C0038.n(57683, null, new Object[]{this})});
            String str2 = (String) C0079.n(15706, null, new Object[]{(short[]) C0076.n(2106, null, new Object[0]), Integer.valueOf(((Integer) C0079.n(68916, null, new Object[]{(String) C0038.n(18169, null, new Object[0])})).intValue() ^ 1751896), Integer.valueOf(((Integer) C0079.n(68916, null, new Object[]{(String) C0038.n(8957, null, new Object[0])})).intValue() ^ 1749761), Integer.valueOf(((Integer) C0079.n(68916, null, new Object[]{(String) C0038.n(95162, null, new Object[0])})).intValue() ^ 1754269)});
            for (String str3 : (String[]) C0081.n(26018, null, new Object[]{str, str2})) {
                if (!((Boolean) C0067.n(86879, null, new Object[]{str3, (String) C0079.n(15706, null, new Object[]{(short[]) C0076.n(2106, null, new Object[0]), Integer.valueOf(((Integer) C0079.n(68916, null, new Object[]{(String) C0038.n(83116, null, new Object[0])})).intValue() ^ 1749507), Integer.valueOf(((Integer) C0079.n(68916, null, new Object[]{(String) C0067.n(34579, null, new Object[0])})).intValue() ^ 1748635), Integer.valueOf(((Integer) C0079.n(68916, null, new Object[]{(String) C0038.n(31953, null, new Object[0])})).intValue() ^ 1747268)})})).booleanValue()) {
                }
            }
            boolean z = ((Integer) C0097.n(8451, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})})).intValue() == 0;
            MainActivity mainActivity = (MainActivity) C0076.n(64135, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            if (z) {
                MainActivity mainActivity2 = (MainActivity) C0076.n(64135, null, new Object[]{this});
                C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 9187093), mainActivity2, 1});
                return;
            }
            MainActivity mainActivity3 = (MainActivity) C0076.n(64135, null, new Object[]{this});
            StringBuilder sb2 = new StringBuilder();
            C0104.n(41715, null, new Object[]{(Toast) C0104.n(80514, null, new Object[]{mainActivity3, (String) C0101.n(13801, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb2})}), 1})});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0076.n(64135, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0079.n(68916, null, new Object[]{(String) C0067.n(90712, null, new Object[0])})).intValue() ^ 2132263375)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0076.n(64135, null, new Object[]{this})})});
        }
    }

    public static class e implements DialogInterface.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f764b;

        public e(int i) {
            this.f764b = i;
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0087.n(71232, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0051.n(72153)})})});
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0048.n(4039, null, new Object[]{(MainActivity) C0051.n(82362, null, new Object[]{this}), Integer.valueOf(((Integer) C0051.n(9151, null, new Object[]{this})).intValue())});
        }
    }

    public static class e0 extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f32short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(1884116)}[0], new Object[0])).intValue() ^ 1884103];
            sArr[0] = 3298;
            sArr[1] = 3310;
            sArr[2] = 3235;
            sArr[3] = 3306;
            sArr[4] = 3303;
            sArr[5] = 3311;
            sArr[6] = 3302;
            sArr[7] = 3246;
            sArr[8] = 3310;
            sArr[9] = 3298;
            sArr[10] = 3306;
            sArr[11] = 3309;
            sArr[12] = 3319;
            sArr[13] = 3302;
            sArr[14] = 3309;
            sArr[15] = 3298;
            sArr[16] = 3309;
            sArr[17] = 3296;
            sArr[18] = 3302;
            f32short = sArr;
        }

        public /* synthetic */ e0(i iVar) {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0043.n(19859, (PrintStream) C0104.n(12888), new Object[]{Integer.valueOf(((Integer) C0043.n(46321, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0051.n(69784)})})).intValue())});
            }
        }

        /* renamed from: ۥۗ۬⁤⁠ۣۤۖ۠⁤ۥۤ⁤⁤۬ۤۖۜ۬⁣, reason: contains not printable characters */
        public static String m1124(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁠⁤⁤ۥۤۥ⁠⁤⁣ۥ⁤ۥۧ⁤ۥ۟⁠ۖ⁠, reason: contains not printable characters */
        public static int m1125(Object obj) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۦ⁠⁣⁠ۥ⁤ۥ⁤⁠⁠ۣۥ۬۬⁤⁠ۢۢ⁠ۖ, reason: contains not printable characters */
        public static short[] m1126() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return (short[]) C0051.n(11850);
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            C0104.n(73601, null, new Object[]{(String) C0051.n(33134, null, new Object[]{(short[]) C0051.n(16170, null, new Object[0]), Integer.valueOf(((Integer) C0051.n(32924, null, new Object[]{(String) C0051.n(55561, null, new Object[0])})).intValue() ^ 1752739), Integer.valueOf(((Integer) C0051.n(32924, null, new Object[]{(String) C0051.n(26359, null, new Object[0])})).intValue() ^ 1750797), Integer.valueOf(((Integer) C0051.n(32924, null, new Object[]{(String) C0051.n(63980, null, new Object[0])})).intValue() ^ 1750725)})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(9021988), new Integer(2131224672)};
            MainActivity mainActivity = (MainActivity) C0051.n(7807, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0051.n(7807, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 714876), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 9021989)});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0051.n(7807, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0051.n(32924, null, new Object[]{(String) C0051.n(67960, null, new Object[0])})).intValue() ^ 2132264482)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0051.n(7807, null, new Object[]{this})})});
        }
    }

    public static class f implements Runnable {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f33short;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProgressBar f767b;

        public class a implements Runnable {
            public a() {
                if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                    C0048.n(47446, (PrintStream) C0104.n(12888), new Object[]{Long.valueOf(((Long) C0048.n(90189, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0051.n(64403)})})).longValue())});
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                MainActivity mainActivity = (MainActivity) C0050.n(51889, null, new Object[]{(f) C0051.n(50698, null, new Object[]{this})});
                C0110.n(43249, null, new Object[]{(TextView) C0050.n(20291, null, new Object[]{mainActivity}), (String) C0050.n(89428, null, new Object[]{mainActivity})});
                f fVar = (f) C0051.n(50698, null, new Object[]{this});
                ProgressBar progressBar = (ProgressBar) C0050.n(65083, null, new Object[]{fVar});
                if (progressBar != null) {
                    C0050.n(26148, null, new Object[]{progressBar, Integer.valueOf((int) ((Double) C0050.n(2568, null, new Object[]{(MainActivity) C0050.n(51889, null, new Object[]{fVar})})).doubleValue())});
                }
            }
        }

        public class b implements Runnable {
            public b() {
                if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                    C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0104.n(17735, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0050.n(78538)})})});
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                MainActivity mainActivity = (MainActivity) C0050.n(51889, null, new Object[]{(f) C0050.n(18574, null, new Object[]{this})});
                C0082.n(19324, null, new Object[]{(TextView) C0050.n(20291, null, new Object[]{mainActivity}), (LinearLayout.LayoutParams) C0082.n(97623, null, new Object[]{mainActivity})});
                f fVar = (f) C0050.n(18574, null, new Object[]{this});
                ProgressBar progressBar = (ProgressBar) C0050.n(65083, null, new Object[]{fVar});
                if (progressBar != null) {
                    C0050.n(17514, null, new Object[]{progressBar, (LinearLayout.LayoutParams) C0082.n(97623, null, new Object[]{(MainActivity) C0050.n(51889, null, new Object[]{fVar})})});
                }
            }
        }

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(9240857)}[0], new Object[0])).intValue() ^ 9240847];
            sArr[0] = 890;
            sArr[1] = 888;
            sArr[2] = 879;
            sArr[3] = 882;
            sArr[4] = 877;
            sArr[5] = 882;
            sArr[6] = 879;
            sArr[7] = 866;
            sArr[8] = 1176;
            sArr[9] = 1791;
            sArr[10] = 396;
            sArr[11] = 425;
            sArr[12] = 445;
            sArr[13] = 440;
            sArr[14] = 429;
            sArr[15] = 432;
            sArr[16] = 439;
            sArr[17] = 446;
            sArr[18] = 505;
            sArr[19] = 395;
            sArr[20] = 408;
            sArr[21] = 404;
            f33short = sArr;
        }

        public f(ProgressBar progressBar) {
            this.f767b = progressBar;
            if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0073.n(71608)})})});
            }
        }

        /* renamed from: ۥۤۖ⁤⁣⁠ۖ⁤ۣۥ⁤⁠⁤ۥ⁤ۥۤۧۧ⁣, reason: contains not printable characters */
        public static int m1127(Object obj) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥۥ⁠⁤⁤⁠ۧۖ⁤ۖۖ۬۟ۧۖۖ⁣⁠ۖ۟, reason: contains not printable characters */
        public static String m1128(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۨۡ⁠ۢۥۤ⁣ۥۖ⁣⁤⁤۟ۖۗۖۥۥ⁤, reason: contains not printable characters */
        public static String m1129(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁠ۣۨ⁤ۖۨۤۥۥ⁠ۣۤۖۖ⁤⁤۬⁤ۤ, reason: contains not printable characters */
        public static String m1130(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁠⁠ۣۖ⁠ۤ⁤⁤ۣ۠ۨ⁤⁣ۢۥۤۖۢ۟, reason: contains not printable characters */
        public static short[] m1131() {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (short[]) C0073.n(31853);
            }
            return null;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"WrongConstant"})
        public void run() {
            Object[] objArr = {new Double(1024.0d), new Long(5080348L), new Double(1000.0d), new Double(1024.0d), new Double(100.0d), new Double(1024.0d), new Long(4466499L)};
            String str = (String) C0073.n(40409, null, new Object[]{(short[]) C0073.n(74666, null, new Object[0]), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0038.n(7737, null, new Object[0])})).intValue() ^ 1749731), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0073.n(52944, null, new Object[0])})).intValue() ^ 1750665), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0073.n(77763, null, new Object[0])})).intValue() ^ 1753758)});
            String str2 = (String) C0073.n(40409, null, new Object[]{(short[]) C0073.n(74666, null, new Object[0]), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0073.n(30089, null, new Object[0])})).intValue() ^ 1753444), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0068.n(39901, null, new Object[0])})).intValue() ^ 1751620), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0073.n(93386, null, new Object[0])})).intValue() ^ 1745737)});
            String str3 = (String) C0073.n(42831, null, new Object[]{(short[]) C0073.n(74666, null, new Object[0]), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0073.n(33493, null, new Object[0])})).intValue() ^ 56498), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0073.n(3467, null, new Object[0])})).intValue() ^ 1746754), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0073.n(91019, null, new Object[0])})).intValue() ^ 1750102)});
            if (((Integer) C0101.n(67592, null, new Object[0])).intValue() < 19) {
                C0101.n(46515, null, new Object[]{(MainActivity) C0050.n(51889, null, new Object[]{this}), new b()});
                if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                    C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0048.n(9605, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0034.n(60397)})})});
                    return;
                }
                return;
            }
            while (true) {
                MainActivity mainActivity = (MainActivity) C0050.n(51889, null, new Object[]{this});
                if (!((Boolean) C0073.n(74425, null, new Object[]{mainActivity})).booleanValue() && ((Integer) C0073.n(58832, null, new Object[]{mainActivity})).intValue() == 1) {
                    C0050.n(77119, null, new Object[]{(PrintStream) C0069.n(16882, null, new Object[0]), (String) C0069.n(58116, null, new Object[]{(short[]) C0073.n(74666, null, new Object[0]), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0069.n(79701, null, new Object[0])})).intValue() ^ 1751526), Integer.valueOf(((Integer) C0073.n(55025, null, new Object[]{(String) C0069.n(75967, null, new Object[0])})).intValue() ^ 1750767), Integer.valueOf(1749634 ^ ((Integer) C0073.n(55025, null, new Object[]{(String) C0069.n(69278, null, new Object[0])})).intValue())})});
                    try {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        if (C0069.n(57808, null, new Object[]{(MainActivity) C0050.n(51889, null, new Object[]{this}), str}) != null) {
                            Object n = C0069.n(57808, null, new Object[]{(MainActivity) C0050.n(51889, null, new Object[]{this}), str});
                            C0069.n(7131, null, new Object[]{(ActivityManager) n, memoryInfo});
                        }
                        long longValue = ((Long) C0069.n(40760, null, new Object[]{memoryInfo})).longValue();
                        long longValue2 = ((Long) C0078.n(19087, (Long) objArr[6], new Object[0])).longValue() ^ 4465475;
                        double d = ((int) (longValue / longValue2)) / 1024;
                        ((MainActivity) C0050.n(51889, null, new Object[]{this})).t = (String) C0097.n(93145, null, new Object[0]);
                        double longValue3 = ((int) (((Long) C0069.n(73378, null, new Object[]{memoryInfo})).longValue() / longValue2)) / 1024;
                        ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue3)})).booleanValue();
                        ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(d)})).booleanValue();
                        ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue3)})).booleanValue();
                        ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(d)})).booleanValue();
                        double d2 = longValue3 - d;
                        MainActivity mainActivity2 = (MainActivity) C0050.n(51889, null, new Object[]{this});
                        double doubleValue = ((Double) C0039.n(67350, (Double) objArr[4], new Object[0])).doubleValue();
                        ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue3)})).booleanValue();
                        ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue3)})).booleanValue();
                        mainActivity2.u = (doubleValue * d2) / longValue3;
                        StringBuilder sb = new StringBuilder();
                        MainActivity mainActivity3 = (MainActivity) C0050.n(51889, null, new Object[]{this});
                        mainActivity3.t = (String) C0104.n(48310, null, new Object[]{sb});
                        double doubleValue2 = ((Double) C0039.n(67350, (Double) objArr[2], new Object[0])).doubleValue();
                        double doubleValue3 = ((Double) C0039.n(67350, (Double) objArr[3], new Object[0])).doubleValue();
                        if (d2 > doubleValue3) {
                            Double d3 = (Double) C0069.n(75787, null, new Object[]{Double.valueOf(d2 / doubleValue3)});
                            StringBuilder sb2 = new StringBuilder();
                            MainActivity mainActivity4 = (MainActivity) C0050.n(51889, null, new Object[]{this});
                            double longValue4 = ((Long) C0069.n(35303, null, new Object[]{Double.valueOf(((Double) C0069.n(5755, null, new Object[]{d3})).doubleValue() * doubleValue2)})).longValue();
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue4)})).booleanValue();
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue4)})).booleanValue();
                            mainActivity4.t = (String) C0104.n(48310, null, new Object[]{sb2});
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            MainActivity mainActivity5 = (MainActivity) C0050.n(51889, null, new Object[]{this});
                            mainActivity5.t = (String) C0104.n(48310, null, new Object[]{sb3});
                        }
                        double doubleValue4 = ((Double) C0039.n(67350, (Double) objArr[5], new Object[0])).doubleValue();
                        if (d > doubleValue4) {
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(d)})).booleanValue();
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(d)})).booleanValue();
                            Double d4 = (Double) C0069.n(75787, null, new Object[]{Double.valueOf(d / doubleValue4)});
                            StringBuilder sb4 = new StringBuilder();
                            MainActivity mainActivity6 = (MainActivity) C0050.n(51889, null, new Object[]{this});
                            double longValue5 = ((Long) C0069.n(35303, null, new Object[]{Double.valueOf(((Double) C0069.n(5755, null, new Object[]{d4})).doubleValue() * doubleValue2)})).longValue();
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue5)})).booleanValue();
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue5)})).booleanValue();
                            mainActivity6.t = (String) C0104.n(48310, null, new Object[]{sb4});
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            MainActivity mainActivity7 = (MainActivity) C0050.n(51889, null, new Object[]{this});
                            mainActivity7.t = (String) C0104.n(48310, null, new Object[]{sb5});
                        }
                        double doubleValue5 = ((Double) C0039.n(67350, (Double) objArr[0], new Object[0])).doubleValue();
                        if (longValue3 > doubleValue5) {
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue3)})).booleanValue();
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue3)})).booleanValue();
                            Double d5 = (Double) C0069.n(75787, null, new Object[]{Double.valueOf(longValue3 / doubleValue5)});
                            StringBuilder sb6 = new StringBuilder();
                            MainActivity mainActivity8 = (MainActivity) C0050.n(51889, null, new Object[]{this});
                            double longValue6 = ((Long) C0069.n(35303, null, new Object[]{Double.valueOf(((Double) C0069.n(5755, null, new Object[]{d5})).doubleValue() * doubleValue2)})).longValue();
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue6)})).booleanValue();
                            ((Boolean) C0069.n(45196, null, new Object[]{Double.valueOf(longValue6)})).booleanValue();
                            mainActivity8.t = (String) C0104.n(48310, null, new Object[]{sb6});
                        } else {
                            StringBuilder sb7 = new StringBuilder();
                            MainActivity mainActivity9 = (MainActivity) C0050.n(51889, null, new Object[]{this});
                            mainActivity9.t = (String) C0104.n(48310, null, new Object[]{sb7});
                        }
                        C0101.n(46515, null, new Object[]{(MainActivity) C0050.n(51889, null, new Object[]{this}), new a()});
                    } catch (Exception e) {
                        C0066.n(62866, null, new Object[]{e});
                    }
                }
                try {
                    C0078.n(42025, null, new Object[]{Long.valueOf(((Long) C0078.n(19087, (Long) objArr[1], new Object[0])).longValue() ^ 5079232)});
                } catch (RuntimeException e2) {
                    C0034.n(42910, null, new Object[]{e2});
                }
            }
        }
    }

    public static class f0 extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f34short;

        /* renamed from: a, reason: collision with root package name */
        public final Integer[] f771a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MainActivity f772b;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(3889838)}[0], new Object[0])).intValue() ^ 3889791];
            sArr[0] = 1057;
            sArr[1] = 1027;
            sArr[2] = 1038;
            sArr[3] = 1038;
            sArr[4] = 1090;
            sArr[5] = 1029;
            sArr[6] = 1031;
            sArr[7] = 1046;
            sArr[8] = 1073;
            sArr[9] = 1046;
            sArr[10] = 1037;
            sArr[11] = 1040;
            sArr[12] = 1027;
            sArr[13] = 1029;
            sArr[14] = 1031;
            sArr[15] = 1074;
            sArr[16] = 1027;
            sArr[17] = 1046;
            sArr[18] = 1034;
            sArr[19] = 1098;
            sArr[20] = 1099;
            sArr[21] = 3064;
            sArr[22] = 3034;
            sArr[23] = 3031;
            sArr[24] = 3031;
            sArr[25] = 2971;
            sArr[26] = 3028;
            sArr[27] = 3029;
            sArr[28] = 3048;
            sArr[29] = 3023;
            sArr[30] = 3034;
            sArr[31] = 3017;
            sArr[32] = 3023;
            sArr[33] = 3062;
            sArr[34] = 3038;
            sArr[35] = 3023;
            sArr[36] = 3027;
            sArr[37] = 3028;
            sArr[38] = 3039;
            sArr[39] = 2963;
            sArr[40] = 2962;
            sArr[41] = 557;
            sArr[42] = 522;
            sArr[43] = 543;
            sArr[44] = 524;
            sArr[45] = 522;
            sArr[46] = 535;
            sArr[47] = 528;
            sArr[48] = 537;
            sArr[49] = 606;
            sArr[50] = 556;
            sArr[51] = 575;
            sArr[52] = 563;
            sArr[53] = 606;
            sArr[54] = 543;
            sArr[55] = 528;
            sArr[56] = 538;
            sArr[57] = 606;
            sArr[58] = 573;
            sArr[59] = 558;
            sArr[60] = 555;
            sArr[61] = 606;
            sArr[62] = 522;
            sArr[63] = 534;
            sArr[64] = 524;
            sArr[65] = 539;
            sArr[66] = 543;
            sArr[67] = 538;
            sArr[68] = 525;
            sArr[69] = 597;
            sArr[70] = 584;
            sArr[71] = 584;
            sArr[72] = 595;
            sArr[73] = 551;
            sArr[74] = 629;
            sArr[75] = 610;
            sArr[76] = 630;
            sArr[77] = 626;
            sArr[78] = 622;
            sArr[79] = 629;
            sArr[80] = 610;
            sArr[81] = 611;
            sArr[82] = 1054;
            sArr[83] = 1058;
            sArr[84] = 1071;
            sArr[85] = 1130;
            sArr[86] = 1067;
            sArr[87] = 1082;
            sArr[88] = 1082;
            sArr[89] = 1062;
            sArr[90] = 1059;
            sArr[91] = 1065;
            sArr[92] = 1067;
            sArr[93] = 1086;
            sArr[94] = 1059;
            sArr[95] = 1061;
            sArr[96] = 1060;
            sArr[97] = 1130;
            sArr[98] = 1065;
            sArr[99] = 1067;
            sArr[100] = 1060;
            sArr[101] = 1130;
            sArr[102] = 1060;
            sArr[103] = 1061;
            sArr[104] = 1086;
            sArr[105] = 1130;
            sArr[106] = 1085;
            sArr[107] = 1061;
            sArr[108] = 1080;
            sArr[109] = 1057;
            sArr[110] = 1130;
            sArr[111] = 1085;
            sArr[112] = 1059;
            sArr[113] = 1086;
            sArr[114] = 1058;
            sArr[115] = 1061;
            sArr[116] = 1087;
            sArr[117] = 1086;
            sArr[118] = 1130;
            sArr[119] = 1080;
            sArr[120] = 1061;
            sArr[121] = 1061;
            sArr[122] = 1086;
            sArr[123] = 1130;
            sArr[124] = 1067;
            sArr[125] = 1065;
            sArr[126] = 1065;
            sArr[127] = 1071;
            sArr[128] = 1081;
            sArr[129] = 1081;
            sArr[130] = 1124;
            sArr[131] = 1130;
            sArr[132] = 1050;
            sArr[133] = 1062;
            sArr[134] = 1071;
            sArr[135] = 1067;
            sArr[136] = 1081;
            sArr[137] = 1071;
            sArr[138] = 1130;
            sArr[139] = 1071;
            sArr[140] = 1060;
            sArr[141] = 1081;
            sArr[142] = 1087;
            sArr[143] = 1080;
            sArr[144] = 1071;
            sArr[145] = 1130;
            sArr[146] = 1086;
            sArr[147] = 1058;
            sArr[148] = 1067;
            sArr[149] = 1086;
            sArr[150] = 1130;
            sArr[151] = 1086;
            sArr[152] = 1058;
            sArr[153] = 1071;
            sArr[154] = 1130;
            sArr[155] = 1070;
            sArr[156] = 1071;
            sArr[157] = 1084;
            sArr[158] = 1059;
            sArr[159] = 1065;
            sArr[160] = 1071;
            sArr[161] = 1130;
            sArr[162] = 1059;
            sArr[163] = 1081;
            sArr[164] = 1130;
            sArr[165] = 1080;
            sArr[166] = 1061;
            sArr[167] = 1061;
            sArr[168] = 1086;
            sArr[169] = 1071;
            sArr[170] = 1070;
            sArr[171] = 1130;
            sArr[172] = 1067;
            sArr[173] = 1060;
            sArr[174] = 1070;
            sArr[175] = 1130;
            sArr[176] = 1069;
            sArr[177] = 1080;
            sArr[178] = 1067;
            sArr[179] = 1060;
            sArr[180] = 1086;
            sArr[181] = 1130;
            sArr[182] = 1080;
            sArr[183] = 1061;
            sArr[184] = 1061;
            sArr[185] = 1086;
            sArr[186] = 1130;
            sArr[187] = 1082;
            sArr[188] = 1080;
            sArr[189] = 1059;
            sArr[190] = 1084;
            sArr[191] = 1059;
            sArr[192] = 1062;
            sArr[193] = 1071;
            sArr[194] = 1069;
            sArr[195] = 1071;
            sArr[196] = 1081;
            sArr[197] = 1130;
            sArr[198] = 1086;
            sArr[199] = 1061;
            sArr[200] = 1130;
            sArr[201] = 1048;
            sArr[202] = 1061;
            sArr[203] = 1061;
            sArr[204] = 1086;
            sArr[205] = 1059;
            sArr[206] = 1068;
            sArr[207] = 1075;
            sArr[208] = 1124;
            f34short = sArr;
        }

        public /* synthetic */ f0(MainActivity mainActivity, i iVar) {
            Integer num = new Integer(1895272);
            this.f772b = mainActivity;
            Integer[] numArr = new Integer[((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 1895273];
            numArr[0] = (Integer) C0063.n(11703, null, new Object[]{0});
            this.f771a = numArr;
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0082.n(77284, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0050.n(16698)})})});
            }
        }

        /* renamed from: ۥۖ⁤ۖ⁠ۥ۬ۧۖ۬ۖۜۖۤۖۗۖ⁤ۥۖ, reason: contains not printable characters */
        public static int m1132(Object obj) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ۟۟ۖۧۖۖۖ⁠ۧ⁠⁣⁤⁤ۥۢ⁤⁣⁤⁤, reason: contains not printable characters */
        public static String m1133(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۧۗۖ⁠⁤⁠ۖۖۥۗۥ⁠⁣⁠⁣ۗ⁤⁠ۖ, reason: contains not printable characters */
        public static short[] m1134() {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return (short[]) C0050.n(27852);
            }
            return null;
        }

        /* renamed from: ۥ⁠⁠ۣۖ⁠ۤ⁤⁤ۣ۠ۨ⁤⁣ۢۥۤۖۢ۟, reason: contains not printable characters */
        public static String m1135(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤ۧۥۖ⁤ۖۖۖ۠ۧ⁠ۖۢۗ⁤⁣ۧۧۤ, reason: contains not printable characters */
        public static String m1136(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            ((Boolean) C0099.n(16658, null, new Object[0])).booleanValue();
            ((Boolean) C0101.n(92794, null, new Object[0])).booleanValue();
            ((Integer[]) C0063.n(87968, null, new Object[]{this}))[0] = (Integer) C0063.n(11703, null, new Object[]{0});
            C0101.n(46515, null, new Object[]{(MainActivity) C0063.n(64624, null, new Object[]{this}), new cbx.l(this)});
            C0050.n(4636, null, new Object[]{(MainActivity) C0063.n(64624, null, new Object[]{this}), (Integer[]) C0063.n(87968, null, new Object[]{this}), 0, 0});
            C0050.n(77119, null, new Object[]{(PrintStream) C0038.n(32739, null, new Object[0]), (String) C0050.n(63956, null, new Object[]{(short[]) C0050.n(79007, null, new Object[0]), Integer.valueOf(((Integer) C0050.n(17592, null, new Object[]{(String) C0050.n(90465, null, new Object[0])})).intValue() ^ 1747929), Integer.valueOf(((Integer) C0050.n(17592, null, new Object[]{(String) C0050.n(99161, null, new Object[0])})).intValue() ^ 1753652), Integer.valueOf(55426 ^ ((Integer) C0050.n(17592, null, new Object[]{(String) C0050.n(74808, null, new Object[0])})).intValue())})});
            C0053.n(10984, null, new Object[]{(MainActivity) C0063.n(64624, null, new Object[]{this})});
            C0050.n(77119, null, new Object[]{(PrintStream) C0038.n(32739, null, new Object[0]), (String) C0050.n(63956, null, new Object[]{(short[]) C0050.n(79007, null, new Object[0]), Integer.valueOf(((Integer) C0050.n(17592, null, new Object[]{(String) C0053.n(29953, null, new Object[0])})).intValue() ^ 1746868), Integer.valueOf(((Integer) C0050.n(17592, null, new Object[]{(String) C0053.n(7917, null, new Object[0])})).intValue() ^ 1753567), Integer.valueOf(55258 ^ ((Integer) C0050.n(17592, null, new Object[]{(String) C0099.n(34746, null, new Object[0])})).intValue())})});
            C0053.n(44262, null, new Object[]{(MainActivity) C0063.n(64624, null, new Object[]{this})});
            C0050.n(77119, null, new Object[]{(PrintStream) C0038.n(32739, null, new Object[0]), (String) C0053.n(45868, null, new Object[]{(short[]) C0050.n(79007, null, new Object[0]), Integer.valueOf(((Integer) C0050.n(17592, null, new Object[]{(String) C0053.n(8378, null, new Object[0])})).intValue() ^ 1751567), Integer.valueOf(((Integer) C0050.n(17592, null, new Object[]{(String) C0053.n(66618, null, new Object[0])})).intValue() ^ 1751672), Integer.valueOf(1754201 ^ ((Integer) C0050.n(17592, null, new Object[]{(String) C0088.n(78033, null, new Object[0])})).intValue())})});
            C0053.n(37442, null, new Object[]{(MainActivity) C0063.n(64624, null, new Object[]{this})});
            C0053.n(41815, null, new Object[]{(MainActivity) C0063.n(64624, null, new Object[]{this})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r9) {
            new Integer(19104419);
            ((Boolean) C0101.n(92794, null, new Object[0])).booleanValue();
            MainActivity mainActivity = (MainActivity) C0063.n(64624, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0063.n(64624, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0050.n(17592, null, new Object[]{(String) C0073.n(76790, null, new Object[0])})).intValue() ^ (2131558595 ^ ((Integer) C0050.n(17592, null, new Object[]{(String) C0073.n(17429, null, new Object[0])})).intValue()))})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0063.n(64624, null, new Object[]{this})})});
        }
    }

    public static class g implements Runnable {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f35short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(597411)}[0], new Object[0])).intValue() ^ 597431];
            sArr[0] = 3172;
            sArr[1] = 3137;
            sArr[2] = 3157;
            sArr[3] = 3152;
            sArr[4] = 3141;
            sArr[5] = 3160;
            sArr[6] = 3167;
            sArr[7] = 3158;
            sArr[8] = 3089;
            sArr[9] = 3186;
            sArr[10] = 3169;
            sArr[11] = 3172;
            sArr[12] = 3089;
            sArr[13] = 3138;
            sArr[14] = 3137;
            sArr[15] = 3160;
            sArr[16] = 3167;
            sArr[17] = 3167;
            sArr[18] = 3156;
            sArr[19] = 3139;
            f35short = sArr;
        }

        public g() {
            if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0086.n(75402)})})});
            }
        }

        /* renamed from: ۥ⁠ۣۧ⁣ۣۧۢۖۤۢ۬⁠⁤ۖۖ⁤۬ۤۢ, reason: contains not printable characters */
        public static String m1137(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁣ۖ⁠⁤۟⁣⁤ۣ۟ۤۖۥۖۢۖ⁠ۖۤ⁣, reason: contains not printable characters */
        public static short[] m1138() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (short[]) C0086.n(41281);
            }
            return null;
        }

        /* renamed from: ۥ⁤⁣ۖۖۗۥۖ⁤۟⁤⁣ۖ⁠⁣⁠ۤ⁤ۖۖ, reason: contains not printable characters */
        public static int m1139(Object obj) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Long l = new Long(5530477L);
            while (true) {
                MainActivity mainActivity = (MainActivity) C0086.n(78363, null, new Object[]{this});
                boolean booleanValue = ((Boolean) C0073.n(74425, null, new Object[]{mainActivity})).booleanValue();
                long longValue = ((Long) C0078.n(19087, (Long) new Object[]{l}[0], new Object[0])).longValue() ^ 5529733;
                if (!booleanValue && ((Integer) C0073.n(58832, null, new Object[]{mainActivity})).intValue() == 2) {
                    try {
                        C0078.n(42025, null, new Object[]{Long.valueOf(longValue)});
                    } catch (RuntimeException e) {
                        C0034.n(42910, null, new Object[]{e});
                    }
                    C0050.n(77119, null, new Object[]{(PrintStream) C0069.n(16882, null, new Object[0]), (String) C0086.n(47286, null, new Object[]{(short[]) C0086.n(31024, null, new Object[0]), Integer.valueOf(((Integer) C0086.n(82624, null, new Object[]{(String) C0086.n(51218, null, new Object[0])})).intValue() ^ 1752706), Integer.valueOf(((Integer) C0086.n(82624, null, new Object[]{(String) C0086.n(21637, null, new Object[0])})).intValue() ^ 1751754), Integer.valueOf(1749524 ^ ((Integer) C0086.n(82624, null, new Object[]{(String) C0086.n(35621, null, new Object[0])})).intValue())})});
                    C0086.n(7208, null, new Object[]{(MainActivity) C0086.n(78363, null, new Object[]{this})});
                    C0086.n(14410, null, new Object[]{(MainActivity) C0086.n(78363, null, new Object[]{this})});
                }
                try {
                    C0078.n(42025, null, new Object[]{Long.valueOf(longValue)});
                } catch (RuntimeException e2) {
                    C0034.n(42910, null, new Object[]{e2});
                }
            }
        }
    }

    public static class g0 extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f36short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(6850102)}[0], new Object[0])).intValue() ^ 6850098];
            sArr[0] = 2204;
            sArr[1] = 2177;
            sArr[2] = 2192;
            sArr[3] = 2189;
            f36short = sArr;
        }

        public /* synthetic */ g0(i iVar) {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0048.n(47446, (PrintStream) C0104.n(12888), new Object[]{Long.valueOf(((Long) C0048.n(90189, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0034.n(43724)})})).longValue())});
            }
        }

        /* renamed from: ۥۥۖۜ۟ۥۥ⁠⁤۠⁠⁤⁤ۗۖۧۥۨ⁠ۖ, reason: contains not printable characters */
        public static String m1140(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁣ۥۧۧ⁤۟⁤ۤ⁤⁠⁤⁠ۥ⁤ۗۖ⁠ۗ۟, reason: contains not printable characters */
        public static short[] m1141() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return (short[]) C0034.n(12331);
            }
            return null;
        }

        /* renamed from: ۦۖۖۖ⁠ۖ⁤ۖ⁤ۥ⁣⁤ۥۥ⁤⁤⁤۟ۤۗ, reason: contains not printable characters */
        public static int m1142(Object obj) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            Object[] objArr = {new Integer(680769), new Long(5382856L)};
            String str = (String) C0101.n(13801, null, new Object[]{(String) C0034.n(40951, null, new Object[]{(Editable) C0034.n(2393, null, new Object[]{(EditText) C0088.n(93720, null, new Object[]{(MainActivity) C0044.n(75294, null, new Object[]{this})})})})});
            if (!((Boolean) C0099.n(64527, null, new Object[]{(String) C0034.n(27109, null, new Object[]{str}), (String) C0034.n(7530, null, new Object[]{(short[]) C0034.n(95109, null, new Object[0]), Integer.valueOf(((Integer) C0034.n(92533, null, new Object[]{(String) C0034.n(97892, null, new Object[0])})).intValue() ^ 1751653), Integer.valueOf(((Integer) C0034.n(92533, null, new Object[]{(String) C0051.n(72828, null, new Object[0])})).intValue() ^ 1747803), Integer.valueOf(1745763 ^ ((Integer) C0034.n(92533, null, new Object[]{(String) C0034.n(3923, null, new Object[0])})).intValue())})})).booleanValue()) {
                C0034.n(56086, null, new Object[]{(MainActivity) C0044.n(75294, null, new Object[]{this}), str});
                return null;
            }
            Byte[] bArr = new Byte[((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 680768];
            bArr[0] = (Byte) C0044.n(64595, null, new Object[]{(byte) 0});
            C0101.n(46515, null, new Object[]{(MainActivity) C0044.n(75294, null, new Object[]{this}), new cbx.n(this, bArr)});
            while (((Byte) C0034.n(34599, null, new Object[]{bArr[0]})).byteValue() == 0) {
                try {
                    C0078.n(42025, null, new Object[]{Long.valueOf(((Long) C0078.n(19087, (Long) objArr[1], new Object[0])).longValue() ^ 5382906)});
                } catch (RuntimeException e) {
                    C0034.n(42910, null, new Object[]{e});
                }
            }
            if (((Byte) C0034.n(34599, null, new Object[]{bArr[0]})).byteValue() != 2) {
                return null;
            }
            C0034.n(56086, null, new Object[]{(MainActivity) C0044.n(75294, null, new Object[]{this}), str});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r11) {
            MainActivity mainActivity = (MainActivity) C0044.n(75294, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            ((Boolean) C0034.n(29854, null, new Object[]{(ScrollView) C0088.n(19013, null, new Object[]{(MainActivity) C0044.n(75294, null, new Object[]{this})}), new cbx.o(this)})).booleanValue();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0044.n(75294, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0034.n(92533, null, new Object[]{(String) C0086.n(94246, null, new Object[0])})).intValue() ^ (2132244285 ^ ((Integer) C0034.n(92533, null, new Object[]{(String) C0034.n(95044, null, new Object[0])})).intValue()))})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0044.n(75294, null, new Object[]{this})})});
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0048.n(9605, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0086.n(41894)})})});
            }
        }
    }

    public static class h implements Runnable {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f37short;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder[] f775b;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(9405780)}[0], new Object[0])).intValue() ^ 9405811];
            sArr[0] = 2206;
            sArr[1] = 2233;
            sArr[2] = 2233;
            sArr[3] = 2233;
            sArr[4] = 2233;
            sArr[5] = 2233;
            sArr[6] = 2233;
            sArr[7] = 2233;
            sArr[8] = 2233;
            sArr[9] = 2233;
            sArr[10] = 2206;
            sArr[11] = 2263;
            sArr[12] = 2267;
            sArr[13] = 2265;
            sArr[14] = 2265;
            sArr[15] = 2261;
            sArr[16] = 2266;
            sArr[17] = 2256;
            sArr[18] = 2222;
            sArr[19] = 2206;
            sArr[20] = 645;
            sArr[21] = 645;
            sArr[22] = 704;
            sArr[23] = 730;
            sArr[24] = 731;
            sArr[25] = 735;
            sArr[26] = 730;
            sArr[27] = 731;
            sArr[28] = 693;
            sArr[29] = 645;
            sArr[30] = 2003;
            sArr[31] = 2003;
            sArr[32] = 1948;
            sArr[33] = 1931;
            sArr[34] = 1931;
            sArr[35] = 1942;
            sArr[36] = 1931;
            sArr[37] = 2019;
            sArr[38] = 2003;
            f37short = sArr;
        }

        public h(StringBuilder[] sbArr) {
            this.f775b = sbArr;
            if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0086.n(69881)})})});
            }
        }

        /* renamed from: ۥۜ⁤⁣⁤ۖ⁤ۥ⁣⁤ۖ⁤ۖۖ⁠ۜۖ⁤ۢ⁤, reason: contains not printable characters */
        public static short[] m1143() {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (short[]) C0086.n(58384);
            }
            return null;
        }

        /* renamed from: ۥۤۖ۬⁤⁣ۣۖ⁤ۖ⁣ۖ⁣ۥ⁤⁣۬⁠ۖ⁠, reason: contains not printable characters */
        public static String m1144(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ۬⁣ۥۥۥ⁣⁤⁤ۥۖ⁤⁠⁣ۖ⁤⁤ۖ⁤⁣, reason: contains not printable characters */
        public static String m1145(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤⁤۠ۜ⁤⁣ۖ⁤ۥۗۖ⁤⁣ۧ⁠ۣۖ⁤⁠, reason: contains not printable characters */
        public static int m1146(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Integer num = new Integer(2478632);
            TextView textView = (TextView) C0086.n(10512, null, new Object[]{(MainActivity) C0086.n(9484, null, new Object[]{this})});
            StringBuilder sb = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0086.n(57758, null, new Object[]{(short[]) C0086.n(26856, null, new Object[0]), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0109.n(34879, null, new Object[0])})).intValue() ^ 1747687), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0086.n(72602, null, new Object[0])})).intValue() ^ 1753618), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0086.n(31300, null, new Object[0])})).intValue() ^ 1752752)})});
            C0071.n(81635, null, new Object[]{textView, (String) C0104.n(48310, null, new Object[]{sb})});
            StringBuilder[] sbArr = (StringBuilder[]) C0071.n(7430, null, new Object[]{this});
            StringBuilder sb2 = sbArr[0];
            String str = (String) C0097.n(93145, null, new Object[0]);
            if (sb2 != null && !((Boolean) C0037.n(73611, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sbArr[0]}), str})).booleanValue()) {
                TextView textView2 = (TextView) C0086.n(10512, null, new Object[]{(MainActivity) C0086.n(9484, null, new Object[]{this})});
                StringBuilder sb3 = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0071.n(27307, null, new Object[]{(short[]) C0086.n(26856, null, new Object[0]), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0071.n(23466, null, new Object[0])})).intValue() ^ 1753674), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0071.n(34455, null, new Object[0])})).intValue() ^ 1749717), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0083.n(37090, null, new Object[0])})).intValue() ^ 1750026)})});
                C0071.n(81635, null, new Object[]{textView2, (String) C0104.n(48310, null, new Object[]{sb3})});
            }
            StringBuilder[] sbArr2 = (StringBuilder[]) C0071.n(7430, null, new Object[]{this});
            int intValue = 2478633 ^ ((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue();
            if (sbArr2[intValue] != null && !((Boolean) C0037.n(73611, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sbArr2[intValue]}), str})).booleanValue()) {
                TextView textView3 = (TextView) C0086.n(10512, null, new Object[]{(MainActivity) C0086.n(9484, null, new Object[]{this})});
                StringBuilder sb4 = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0086.n(57758, null, new Object[]{(short[]) C0086.n(26856, null, new Object[0]), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0071.n(46106, null, new Object[0])})).intValue() ^ 1747680), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0055.n(62151, null, new Object[0])})).intValue() ^ 56434), Integer.valueOf(((Integer) C0086.n(56370, null, new Object[]{(String) C0053.n(29953, null, new Object[0])})).intValue() ^ 1745016)})});
                C0071.n(81635, null, new Object[]{textView3, (String) C0104.n(48310, null, new Object[]{sb4})});
            }
            if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
                C0043.n(19859, (PrintStream) C0104.n(12888), new Object[]{Integer.valueOf(((Integer) C0043.n(46321, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0071.n(37860)})})).intValue())});
            }
        }
    }

    public static class i implements AdapterView.OnItemClickListener {
        public i() {
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0052.n(84044, (PrintStream) C0104.n(12888), new Object[]{Float.valueOf(((Float) C0052.n(71646, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0071.n(70565)})})).floatValue())});
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (((Boolean) C0096.n(25289, null, new Object[]{(CheckBox) C0071.n(9764, null, new Object[]{(MainActivity) C0071.n(51485, null, new Object[]{this})})})).booleanValue()) {
                C0071.n(51970, null, new Object[]{(MainActivity) C0071.n(51485, null, new Object[]{this}), view, Integer.valueOf(i)});
            } else {
                C0048.n(4039, null, new Object[]{(MainActivity) C0071.n(51485, null, new Object[]{this}), Integer.valueOf(i)});
            }
        }
    }

    public static class j implements AdapterView.OnItemSelectedListener {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f38short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(9587874)}[0], new Object[0])).intValue() ^ 9587746];
            sArr[0] = 1691;
            sArr[1] = 1752;
            sArr[2] = 1747;
            sArr[3] = 1750;
            sArr[4] = 1748;
            sArr[5] = 1759;
            sArr[6] = 1691;
            sArr[7] = 1677;
            sArr[8] = 1677;
            sArr[9] = 1679;
            sArr[10] = 1691;
            sArr[11] = 1684;
            sArr[12] = 1736;
            sArr[13] = 1730;
            sArr[14] = 1736;
            sArr[15] = 1684;
            sArr[16] = 1759;
            sArr[17] = 1758;
            sArr[18] = 1741;
            sArr[19] = 1746;
            sArr[20] = 1752;
            sArr[21] = 1758;
            sArr[22] = 1736;
            sArr[23] = 1684;
            sArr[24] = 1736;
            sArr[25] = 1730;
            sArr[26] = 1736;
            sArr[27] = 1743;
            sArr[28] = 1758;
            sArr[29] = 1750;
            sArr[30] = 1684;
            sArr[31] = 1752;
            sArr[32] = 1739;
            sArr[33] = 1742;
            sArr[34] = 1684;
            sArr[35] = 1752;
            sArr[36] = 1739;
            sArr[37] = 1742;
            sArr[38] = 1754;
            sArr[39] = 1686;
            sArr[40] = 1669;
            sArr[41] = 1664;
            sArr[42] = 1683;
            sArr[43] = 1671;
            sArr[44] = 1680;
            sArr[45] = 1668;
            sArr[46] = 1754;
            sArr[47] = 1670;
            sArr[48] = 1686;
            sArr[49] = 1684;
            sArr[50] = 1689;
            sArr[51] = 1692;
            sArr[52] = 1691;
            sArr[53] = 1682;
            sArr[54] = 1706;
            sArr[55] = 1682;
            sArr[56] = 1690;
            sArr[57] = 1667;
            sArr[58] = 1680;
            sArr[59] = 1671;
            sArr[60] = 1691;
            sArr[61] = 1690;
            sArr[62] = 1671;
            sArr[63] = 1749;
            sArr[64] = 1747;
            sArr[65] = 1747;
            sArr[66] = 1749;
            sArr[67] = 2827;
            sArr[68] = 2894;
            sArr[69] = 2888;
            sArr[70] = 2883;
            sArr[71] = 2884;
            sArr[72] = 2827;
            sArr[73] = 1490;
            sArr[74] = 1484;
            sArr[75] = 1490;
            sArr[76] = 1501;
            sArr[77] = 1409;
            sArr[78] = 1419;
            sArr[79] = 1409;
            sArr[80] = 1501;
            sArr[81] = 1430;
            sArr[82] = 1431;
            sArr[83] = 1412;
            sArr[84] = 1435;
            sArr[85] = 1425;
            sArr[86] = 1431;
            sArr[87] = 1409;
            sArr[88] = 1501;
            sArr[89] = 1409;
            sArr[90] = 1419;
            sArr[91] = 1409;
            sArr[92] = 1414;
            sArr[93] = 1431;
            sArr[94] = 1439;
            sArr[95] = 1501;
            sArr[96] = 1425;
            sArr[97] = 1410;
            sArr[98] = 1415;
            sArr[99] = 1501;
            sArr[100] = 1425;
            sArr[101] = 1410;
            sArr[102] = 1415;
            sArr[103] = 874;
            sArr[104] = 806;
            sArr[105] = 821;
            sArr[106] = 816;
            sArr[107] = 803;
            sArr[108] = 823;
            sArr[109] = 800;
            sArr[110] = 820;
            sArr[111] = 874;
            sArr[112] = 822;
            sArr[113] = 806;
            sArr[114] = 804;
            sArr[115] = 809;
            sArr[116] = 812;
            sArr[117] = 811;
            sArr[118] = 802;
            sArr[119] = 794;
            sArr[120] = 802;
            sArr[121] = 810;
            sArr[122] = 819;
            sArr[123] = 800;
            sArr[124] = 823;
            sArr[125] = 811;
            sArr[126] = 810;
            sArr[127] = 823;
            f38short = sArr;
        }

        public j() {
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0071.n(39238)})})});
            }
        }

        /* renamed from: ۥۖۥ⁠⁠ۜ⁤⁣⁣۟⁤⁠ۜ⁤⁤ۖ⁠ۣۡۖ, reason: contains not printable characters */
        public static String m1147(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۗۥ⁠ۖۧۤ۬ۖ⁠⁠ۣ۠ۖۥۖۤۖۤۖ, reason: contains not printable characters */
        public static short[] m1148() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return (short[]) C0071.n(94041);
            }
            return null;
        }

        /* renamed from: ۥ⁣⁤⁤۬ۨۖ⁣⁠ۥ⁣⁠۬⁤ۥۖ⁣ۨ⁤ۢ, reason: contains not printable characters */
        public static String m1149(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤۟ۖ⁤⁤⁠ۨ⁤۟ۗ۬⁠⁤۬ۖۨ⁤⁤ۖ, reason: contains not printable characters */
        public static String m1150(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۦ⁣ۨۖ⁣⁠⁣ۖ⁤⁤⁣ۖۥۥۖ⁠ۖۥ⁠⁤, reason: contains not printable characters */
        public static int m1151(Object obj) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= ((Integer) C0042.n(79139, null, new Object[]{(MainActivity) C0071.n(67998, null, new Object[]{this})})).intValue()) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
                i2 = i3 + 1;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0091.n(85432, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0093.n(51508)})})});
            }
        }
    }

    public static class k implements AdapterView.OnItemSelectedListener {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f39short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(9453726)}[0], new Object[0])).intValue() ^ 9453607];
            sArr[0] = 1761;
            sArr[1] = 1791;
            sArr[2] = 1761;
            sArr[3] = 1763;
            sArr[4] = 1774;
            sArr[5] = 1714;
            sArr[6] = 1720;
            sArr[7] = 1714;
            sArr[8] = 1774;
            sArr[9] = 1701;
            sArr[10] = 1700;
            sArr[11] = 1719;
            sArr[12] = 1704;
            sArr[13] = 1698;
            sArr[14] = 1700;
            sArr[15] = 1714;
            sArr[16] = 1774;
            sArr[17] = 1714;
            sArr[18] = 1720;
            sArr[19] = 1714;
            sArr[20] = 1717;
            sArr[21] = 1700;
            sArr[22] = 1708;
            sArr[23] = 1774;
            sArr[24] = 1698;
            sArr[25] = 1713;
            sArr[26] = 1716;
            sArr[27] = 1774;
            sArr[28] = 1698;
            sArr[29] = 1713;
            sArr[30] = 1716;
            sArr[31] = 1246;
            sArr[32] = 1179;
            sArr[33] = 1181;
            sArr[34] = 1174;
            sArr[35] = 1169;
            sArr[36] = 1246;
            sArr[37] = 2538;
            sArr[38] = 2473;
            sArr[39] = 2466;
            sArr[40] = 2471;
            sArr[41] = 2469;
            sArr[42] = 2478;
            sArr[43] = 2538;
            sArr[44] = 2556;
            sArr[45] = 2556;
            sArr[46] = 2558;
            sArr[47] = 2538;
            sArr[48] = 2533;
            sArr[49] = 2489;
            sArr[50] = 2483;
            sArr[51] = 2489;
            sArr[52] = 2533;
            sArr[53] = 2478;
            sArr[54] = 2479;
            sArr[55] = 2492;
            sArr[56] = 2467;
            sArr[57] = 2473;
            sArr[58] = 2479;
            sArr[59] = 2489;
            sArr[60] = 2533;
            sArr[61] = 2489;
            sArr[62] = 2483;
            sArr[63] = 2489;
            sArr[64] = 2494;
            sArr[65] = 2479;
            sArr[66] = 2471;
            sArr[67] = 2533;
            sArr[68] = 2473;
            sArr[69] = 2490;
            sArr[70] = 2495;
            sArr[71] = 2533;
            sArr[72] = 2473;
            sArr[73] = 2490;
            sArr[74] = 2495;
            sArr[75] = 2266;
            sArr[76] = 2198;
            sArr[77] = 2181;
            sArr[78] = 2176;
            sArr[79] = 2195;
            sArr[80] = 2183;
            sArr[81] = 2192;
            sArr[82] = 2180;
            sArr[83] = 2266;
            sArr[84] = 2182;
            sArr[85] = 2198;
            sArr[86] = 2196;
            sArr[87] = 2201;
            sArr[88] = 2204;
            sArr[89] = 2203;
            sArr[90] = 2194;
            sArr[91] = 2218;
            sArr[92] = 2200;
            sArr[93] = 2204;
            sArr[94] = 2203;
            sArr[95] = 2218;
            sArr[96] = 2195;
            sArr[97] = 2183;
            sArr[98] = 2192;
            sArr[99] = 2180;
            sArr[100] = 2261;
            sArr[101] = 2259;
            sArr[102] = 2259;
            sArr[103] = 2261;
            sArr[104] = 2964;
            sArr[105] = 3032;
            sArr[106] = 3019;
            sArr[107] = 3022;
            sArr[108] = 3037;
            sArr[109] = 3017;
            sArr[110] = 3038;
            sArr[111] = 3018;
            sArr[112] = 2964;
            sArr[113] = 3016;
            sArr[114] = 3032;
            sArr[115] = 3034;
            sArr[116] = 3031;
            sArr[117] = 3026;
            sArr[118] = 3029;
            sArr[119] = 3036;
            sArr[120] = 3044;
            sArr[121] = 3030;
            sArr[122] = 3026;
            sArr[123] = 3029;
            sArr[124] = 3044;
            sArr[125] = 3037;
            sArr[126] = 3017;
            sArr[127] = 3038;
            sArr[128] = 3018;
            sArr[129] = 2969;
            sArr[130] = 790;
            sArr[131] = 858;
            sArr[132] = 841;
            sArr[133] = 844;
            sArr[134] = 863;
            sArr[135] = 843;
            sArr[136] = 860;
            sArr[137] = 840;
            sArr[138] = 790;
            sArr[139] = 842;
            sArr[140] = 858;
            sArr[141] = 856;
            sArr[142] = 853;
            sArr[143] = 848;
            sArr[144] = 855;
            sArr[145] = 862;
            sArr[146] = 870;
            sArr[147] = 852;
            sArr[148] = 856;
            sArr[149] = 833;
            sArr[150] = 870;
            sArr[151] = 863;
            sArr[152] = 843;
            sArr[153] = 860;
            sArr[154] = 840;
            sArr[155] = 793;
            sArr[156] = 799;
            sArr[157] = 799;
            sArr[158] = 793;
            sArr[159] = 2631;
            sArr[160] = 2571;
            sArr[161] = 2584;
            sArr[162] = 2589;
            sArr[163] = 2574;
            sArr[164] = 2586;
            sArr[165] = 2573;
            sArr[166] = 2585;
            sArr[167] = 2631;
            sArr[168] = 2587;
            sArr[169] = 2571;
            sArr[170] = 2569;
            sArr[171] = 2564;
            sArr[172] = 2561;
            sArr[173] = 2566;
            sArr[174] = 2575;
            sArr[175] = 2615;
            sArr[176] = 2565;
            sArr[177] = 2569;
            sArr[178] = 2576;
            sArr[179] = 2615;
            sArr[180] = 2574;
            sArr[181] = 2586;
            sArr[182] = 2573;
            sArr[183] = 2585;
            sArr[184] = 2634;
            f39short = sArr;
        }

        public k() {
            if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0093.n(92949)})})});
            }
        }

        /* renamed from: ۥۤ⁤ۗۖ⁤۬ۧۖۗۖۖۖۖ⁠۬۠⁤⁣ۖ, reason: contains not printable characters */
        public static String m1152(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ۬ۢۖۖ⁤ۢ⁣ۥۨ⁤ۖ⁤⁣۟ۧۤۤۖۖ, reason: contains not printable characters */
        public static short[] m1153() {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (short[]) C0093.n(67455);
            }
            return null;
        }

        /* renamed from: ۥ⁣⁣ۖۤ⁣⁤⁤ۖ⁤⁣ۜ⁣ۢۧۗۤ⁣ۢۖ, reason: contains not printable characters */
        public static String m1154(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤⁣⁤ۧۖ۟⁤⁠⁤ۨۖۖۖۖ⁤ۤ⁣۬⁤, reason: contains not printable characters */
        public static String m1155(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۦۢۢ⁤⁤ۖۖۥ⁠⁤ۥۖ⁣⁣ۖ⁤ۥ⁠⁤ۗ, reason: contains not printable characters */
        public static String m1156(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۦۥۖ۬ۨۖ۬⁤ۢۖۖ۬ۡ۬ۥۣۖۖۧۖ, reason: contains not printable characters */
        public static int m1157(Object obj) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int intValue = ((Integer) C0093.n(47786, null, new Object[]{adapterView})).intValue();
            int intValue2 = ((Integer) C0033.n(61251, null, new Object[]{((String[]) C0093.n(20059, null, new Object[]{(MainActivity) C0093.n(81231, null, new Object[]{this})}))[((Integer) C0093.n(57111, null, new Object[]{(Spinner) C0051.n(6058, null, new Object[]{(MainActivity) C0093.n(81231, null, new Object[]{this})})})).intValue()]})).intValue();
            int intValue3 = ((Integer) C0033.n(61251, null, new Object[]{((String[]) C0093.n(20059, null, new Object[]{(MainActivity) C0093.n(81231, null, new Object[]{this})}))[intValue]})).intValue();
            String str = (String) C0033.n(50483, null, new Object[]{(short[]) C0033.n(33197, null, new Object[0]), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0033.n(98384, null, new Object[0])})).intValue() ^ 1752735), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0033.n(32204, null, new Object[0])})).intValue() ^ 1751710), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0079.n(40819, null, new Object[0])})).intValue() ^ 1749468)});
            String str2 = (String) C0033.n(61999, null, new Object[]{(short[]) C0033.n(33197, null, new Object[0]), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0033.n(9613, null, new Object[0])})).intValue() ^ 1751742), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0033.n(43756, null, new Object[0])})).intValue() ^ 1752456), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0033.n(96706, null, new Object[0])})).intValue() ^ 1752342)});
            String str3 = (String) C0033.n(22467, null, new Object[]{(short[]) C0033.n(33197, null, new Object[0]), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0033.n(44257, null, new Object[0])})).intValue() ^ 1750823), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0083.n(28515, null, new Object[0])})).intValue() ^ 56452), Integer.valueOf(((Integer) C0033.n(71834, null, new Object[]{(String) C0076.n(94754, null, new Object[0])})).intValue() ^ 1749891)});
            if (intValue2 > intValue3) {
                C0067.n(52929, null, new Object[]{(Spinner) C0051.n(6058, null, new Object[]{(MainActivity) C0093.n(81231, null, new Object[]{this})}), Integer.valueOf(intValue)});
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= ((Integer) C0033.n(67089, null, new Object[]{4, Integer.valueOf(((Integer) C0042.n(79139, null, new Object[]{(MainActivity) C0093.n(81231, null, new Object[]{this})})).intValue())})).intValue()) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
                    i2 = i3 + 1;
                }
            }
            for (int i4 = 0; i4 < ((Integer) C0033.n(67089, null, new Object[]{4, Integer.valueOf(((Integer) C0042.n(79139, null, new Object[]{(MainActivity) C0093.n(81231, null, new Object[]{this})})).intValue())})).intValue(); i4++) {
                StringBuilder sb2 = new StringBuilder();
                C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb2})});
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public static class l implements AdapterView.OnItemSelectedListener {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f40short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(5011139)}[0], new Object[0])).intValue() ^ 5011070];
            sArr[0] = 1690;
            sArr[1] = 1668;
            sArr[2] = 1690;
            sArr[3] = 1685;
            sArr[4] = 1737;
            sArr[5] = 1731;
            sArr[6] = 1737;
            sArr[7] = 1685;
            sArr[8] = 1758;
            sArr[9] = 1759;
            sArr[10] = 1740;
            sArr[11] = 1747;
            sArr[12] = 1753;
            sArr[13] = 1759;
            sArr[14] = 1737;
            sArr[15] = 1685;
            sArr[16] = 1737;
            sArr[17] = 1731;
            sArr[18] = 1737;
            sArr[19] = 1742;
            sArr[20] = 1759;
            sArr[21] = 1751;
            sArr[22] = 1685;
            sArr[23] = 1753;
            sArr[24] = 1738;
            sArr[25] = 1743;
            sArr[26] = 1685;
            sArr[27] = 1753;
            sArr[28] = 1738;
            sArr[29] = 1743;
            sArr[30] = 3213;
            sArr[31] = 3272;
            sArr[32] = 3278;
            sArr[33] = 3269;
            sArr[34] = 3266;
            sArr[35] = 3213;
            sArr[36] = 1094;
            sArr[37] = 1029;
            sArr[38] = 1038;
            sArr[39] = 1035;
            sArr[40] = 1033;
            sArr[41] = 1026;
            sArr[42] = 1094;
            sArr[43] = 1104;
            sArr[44] = 1104;
            sArr[45] = 1106;
            sArr[46] = 1094;
            sArr[47] = 1097;
            sArr[48] = 1045;
            sArr[49] = 1055;
            sArr[50] = 1045;
            sArr[51] = 1097;
            sArr[52] = 1026;
            sArr[53] = 1027;
            sArr[54] = 1040;
            sArr[55] = 1039;
            sArr[56] = 1029;
            sArr[57] = 1027;
            sArr[58] = 1045;
            sArr[59] = 1097;
            sArr[60] = 1045;
            sArr[61] = 1055;
            sArr[62] = 1045;
            sArr[63] = 1042;
            sArr[64] = 1027;
            sArr[65] = 1035;
            sArr[66] = 1097;
            sArr[67] = 1029;
            sArr[68] = 1046;
            sArr[69] = 1043;
            sArr[70] = 1097;
            sArr[71] = 1029;
            sArr[72] = 1046;
            sArr[73] = 1043;
            sArr[74] = 3127;
            sArr[75] = 3195;
            sArr[76] = 3176;
            sArr[77] = 3181;
            sArr[78] = 3198;
            sArr[79] = 3178;
            sArr[80] = 3197;
            sArr[81] = 3177;
            sArr[82] = 3127;
            sArr[83] = 3179;
            sArr[84] = 3195;
            sArr[85] = 3193;
            sArr[86] = 3188;
            sArr[87] = 3185;
            sArr[88] = 3190;
            sArr[89] = 3199;
            sArr[90] = 3143;
            sArr[91] = 3189;
            sArr[92] = 3193;
            sArr[93] = 3168;
            sArr[94] = 3143;
            sArr[95] = 3198;
            sArr[96] = 3178;
            sArr[97] = 3197;
            sArr[98] = 3177;
            sArr[99] = 3128;
            sArr[100] = 3134;
            sArr[101] = 3134;
            sArr[102] = 3128;
            sArr[103] = 1420;
            sArr[104] = 1472;
            sArr[105] = 1491;
            sArr[106] = 1494;
            sArr[107] = 1477;
            sArr[108] = 1489;
            sArr[109] = 1478;
            sArr[110] = 1490;
            sArr[111] = 1420;
            sArr[112] = 1488;
            sArr[113] = 1472;
            sArr[114] = 1474;
            sArr[115] = 1487;
            sArr[116] = 1482;
            sArr[117] = 1485;
            sArr[118] = 1476;
            sArr[119] = 1532;
            sArr[120] = 1486;
            sArr[121] = 1474;
            sArr[122] = 1499;
            sArr[123] = 1532;
            sArr[124] = 1477;
            sArr[125] = 1489;
            sArr[126] = 1478;
            sArr[127] = 1490;
            sArr[128] = 1714;
            sArr[129] = 1718;
            sArr[130] = 1713;
            sArr[131] = 1689;
            sArr[132] = 1709;
            sArr[133] = 1722;
            sArr[134] = 1710;
            sArr[135] = 2642;
            sArr[136] = 2590;
            sArr[137] = 2573;
            sArr[138] = 2568;
            sArr[139] = 2587;
            sArr[140] = 2575;
            sArr[141] = 2584;
            sArr[142] = 2572;
            sArr[143] = 2642;
            sArr[144] = 2574;
            sArr[145] = 2590;
            sArr[146] = 2588;
            sArr[147] = 2577;
            sArr[148] = 2580;
            sArr[149] = 2579;
            sArr[150] = 2586;
            sArr[151] = 2594;
            sArr[152] = 2576;
            sArr[153] = 2580;
            sArr[154] = 2579;
            sArr[155] = 2594;
            sArr[156] = 2587;
            sArr[157] = 2575;
            sArr[158] = 2584;
            sArr[159] = 2572;
            sArr[160] = 2653;
            sArr[161] = 2651;
            sArr[162] = 2651;
            sArr[163] = 2653;
            sArr[164] = 2160;
            sArr[165] = 2108;
            sArr[166] = 2095;
            sArr[167] = 2090;
            sArr[168] = 2105;
            sArr[169] = 2093;
            sArr[170] = 2106;
            sArr[171] = 2094;
            sArr[172] = 2160;
            sArr[173] = 2092;
            sArr[174] = 2108;
            sArr[175] = 2110;
            sArr[176] = 2099;
            sArr[177] = 2102;
            sArr[178] = 2097;
            sArr[179] = 2104;
            sArr[180] = 2048;
            sArr[181] = 2098;
            sArr[182] = 2102;
            sArr[183] = 2097;
            sArr[184] = 2048;
            sArr[185] = 2105;
            sArr[186] = 2093;
            sArr[187] = 2106;
            sArr[188] = 2094;
            f40short = sArr;
        }

        public l() {
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0070.n(86880)})})});
            }
        }

        /* renamed from: ۥۖۖۖۗ⁤ۣ⁤ۖ⁤۠ۥۥ⁤⁤ۖ⁠ۥۖۖ, reason: contains not printable characters */
        public static short[] m1158() {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (short[]) C0070.n(86864);
            }
            return null;
        }

        /* renamed from: ۥۖۖۥ⁣۠ۧ۟ۖۥ⁤ۧۖ⁤⁣ۣۗ⁤ۥۗ, reason: contains not printable characters */
        public static String m1159(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۧۡ۟ۖۥۣ⁠ۥۥۣۖ۬ۡ⁤ۖۖۖ⁤۬, reason: contains not printable characters */
        public static String m1160(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤⁤ۖۖ⁤ۣ⁠⁤⁠ۢۢ⁤ۣۖ۬ۗۨۖۖ, reason: contains not printable characters */
        public static String m1161(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۦۖۥۖۢ۬ۖ⁠ۖۗ⁠ۥۥ⁠⁠ۢ⁤ۧ⁠۬, reason: contains not printable characters */
        public static int m1162(Object obj) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int intValue = ((Integer) C0093.n(57111, null, new Object[]{(Spinner) C0067.n(96491, null, new Object[]{(MainActivity) C0070.n(57934, null, new Object[]{this})})})).intValue();
            int intValue2 = ((Integer) C0093.n(47786, null, new Object[]{adapterView})).intValue();
            int intValue3 = ((Integer) C0033.n(61251, null, new Object[]{((String[]) C0093.n(20059, null, new Object[]{(MainActivity) C0070.n(57934, null, new Object[]{this})}))[intValue]})).intValue();
            int intValue4 = ((Integer) C0033.n(61251, null, new Object[]{((String[]) C0093.n(20059, null, new Object[]{(MainActivity) C0070.n(57934, null, new Object[]{this})}))[intValue2]})).intValue();
            String str = (String) C0070.n(94059, null, new Object[]{(short[]) C0070.n(55374, null, new Object[0]), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0070.n(3501, null, new Object[0])})).intValue() ^ 1749604), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0070.n(13476, null, new Object[0])})).intValue() ^ 1747878), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0070.n(51251, null, new Object[0])})).intValue() ^ 1756946)});
            String str2 = (String) C0070.n(94059, null, new Object[]{(short[]) C0070.n(55374, null, new Object[0]), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0070.n(41712, null, new Object[0])})).intValue() ^ 1747742), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0070.n(70581, null, new Object[0])})).intValue() ^ 1752459), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0091.n(23128, null, new Object[0])})).intValue() ^ 1756651)});
            String str3 = (String) C0070.n(94059, null, new Object[]{(short[]) C0070.n(55374, null, new Object[0]), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0110.n(39889, null, new Object[0])})).intValue() ^ 1752678), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0070.n(17288, null, new Object[0])})).intValue() ^ 1746790), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0079.n(32913, null, new Object[0])})).intValue() ^ 1754409)});
            if (intValue3 < intValue4) {
                C0067.n(52929, null, new Object[]{(Spinner) C0067.n(96491, null, new Object[]{(MainActivity) C0070.n(57934, null, new Object[]{this})}), Integer.valueOf(intValue2)});
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= ((Integer) C0033.n(67089, null, new Object[]{4, Integer.valueOf(((Integer) C0042.n(79139, null, new Object[]{(MainActivity) C0070.n(57934, null, new Object[]{this})})).intValue())})).intValue()) {
                        break;
                    }
                    StringBuilder sb = new StringBuilder();
                    C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
                    i2 = i3 + 1;
                }
            }
            for (int i4 = 0; i4 < ((Integer) C0033.n(67089, null, new Object[]{4, Integer.valueOf(((Integer) C0042.n(79139, null, new Object[]{(MainActivity) C0070.n(57934, null, new Object[]{this})})).intValue())})).intValue(); i4++) {
                PrintStream printStream = (PrintStream) C0069.n(16882, null, new Object[0]);
                StringBuilder sb2 = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0084.n(62823, null, new Object[]{(short[]) C0070.n(55374, null, new Object[0]), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0084.n(50319, null, new Object[0])})).intValue() ^ 1749738), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0084.n(78185, null, new Object[0])})).intValue() ^ 1747812), Integer.valueOf(((Integer) C0070.n(55803, null, new Object[]{(String) C0084.n(7516, null, new Object[0])})).intValue() ^ 1757017)})});
                C0050.n(77119, null, new Object[]{printStream, (String) C0104.n(48310, null, new Object[]{sb2})});
                StringBuilder sb3 = new StringBuilder();
                C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb3})});
            }
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0043.n(19859, (PrintStream) C0104.n(12888), new Object[]{Integer.valueOf(((Integer) C0043.n(46321, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0084.n(10322)})})).intValue())});
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
                C0043.n(80863, (PrintStream) C0104.n(12888), new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0084.n(47479)})});
            }
        }
    }

    public static class m implements Runnable {
        public m() {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0091.n(85432, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0084.n(77098)})})});
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C0084.n(64874, null, new Object[]{(CheckBox) C0084.n(53530, null, new Object[]{(MainActivity) C0084.n(55751, null, new Object[]{this})}), true});
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0044.n(51197, (PrintStream) C0104.n(12888), new Object[]{Double.valueOf(((Double) C0044.n(33161, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0065.n(39678)})})).doubleValue())});
            }
        }
    }

    public static class n implements Runnable {
        public n() {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0048.n(9605, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0065.n(42763)})})});
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C0084.n(64874, null, new Object[]{(CheckBox) C0084.n(53530, null, new Object[]{(MainActivity) C0065.n(20183, null, new Object[]{this})}), false});
        }
    }

    public static class o implements Runnable {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f41short;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup.LayoutParams f783b;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(6457717)}[0], new Object[0])).intValue() ^ 6457690];
            sArr[0] = 2149;
            sArr[1] = 2105;
            sArr[2] = 2099;
            sArr[3] = 2105;
            sArr[4] = 2149;
            sArr[5] = 2094;
            sArr[6] = 2095;
            sArr[7] = 2108;
            sArr[8] = 2083;
            sArr[9] = 2089;
            sArr[10] = 2095;
            sArr[11] = 2105;
            sArr[12] = 2149;
            sArr[13] = 2105;
            sArr[14] = 2099;
            sArr[15] = 2105;
            sArr[16] = 2110;
            sArr[17] = 2095;
            sArr[18] = 2087;
            sArr[19] = 2149;
            sArr[20] = 2089;
            sArr[21] = 2106;
            sArr[22] = 2111;
            sArr[23] = 2149;
            sArr[24] = 2105;
            sArr[25] = 2089;
            sArr[26] = 2082;
            sArr[27] = 2095;
            sArr[28] = 2094;
            sArr[29] = 2069;
            sArr[30] = 2087;
            sArr[31] = 2089;
            sArr[32] = 2069;
            sArr[33] = 2106;
            sArr[34] = 2085;
            sArr[35] = 2109;
            sArr[36] = 2095;
            sArr[37] = 2104;
            sArr[38] = 2069;
            sArr[39] = 2105;
            sArr[40] = 2091;
            sArr[41] = 2108;
            sArr[42] = 2083;
            sArr[43] = 2084;
            sArr[44] = 2093;
            sArr[45] = 2105;
            sArr[46] = 1923;
            f41short = sArr;
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            this.f783b = layoutParams;
            if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                C0043.n(19859, (PrintStream) C0104.n(12888), new Object[]{Integer.valueOf(((Integer) C0043.n(46321, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0065.n(2919)})})).intValue())});
            }
        }

        /* renamed from: ۥۖۗ⁤۬⁤ۖۤ⁤ۖۥ⁤ۖۖ⁤ۣۖۥ⁤ۖ, reason: contains not printable characters */
        public static String m1163(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۖۡ⁣⁠⁤ۥ۬ۨ⁤⁤⁤ۖۖ⁠⁠⁠⁠ۥۧ, reason: contains not printable characters */
        public static short[] m1164() {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (short[]) C0065.n(36092);
            }
            return null;
        }

        /* renamed from: ۥۖ⁤ۥۤ⁠⁠⁣⁤⁣⁣⁤ۥۖۥ⁤ۤۖۖۖ, reason: contains not printable characters */
        public static String m1165(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۦۥ⁤ۨۖ⁣ۖۖ⁤ۣۗۖۥ⁤ۧۗۧ⁣⁤ۡ, reason: contains not printable characters */
        public static int m1166(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Integer num = new Integer(2139605102);
            C0065.n(51507, null, new Object[]{(ListView) C0065.n(84015, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})}), (ViewGroup.LayoutParams) C0065.n(45764, null, new Object[]{this})});
            C0065.n(23826, null, new Object[]{(ListView) C0065.n(84015, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})})});
            try {
                MainActivity mainActivity = (MainActivity) C0065.n(83241, null, new Object[]{this});
                ArrayList arrayList = (ArrayList) C0067.n(29356, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})});
                int intValue = ((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 9291889;
                ArrayAdapter arrayAdapter = new ArrayAdapter(mainActivity, intValue, arrayList);
                ArrayAdapter arrayAdapter2 = new ArrayAdapter((MainActivity) C0065.n(83241, null, new Object[]{this}), intValue, (ArrayList) C0067.n(94321, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})}));
                C0065.n(1539, null, new Object[]{(Spinner) C0067.n(59250, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})}), arrayAdapter});
                C0065.n(1539, null, new Object[]{(Spinner) C0067.n(96491, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})}), arrayAdapter2});
                C0065.n(1539, null, new Object[]{(Spinner) C0051.n(6058, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})}), arrayAdapter2});
            } catch (Exception e) {
                C0066.n(62866, null, new Object[]{e});
            }
            try {
                C0086.n(14410, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})});
            } catch (Exception e2) {
                C0066.n(62866, null, new Object[]{e2});
            }
            try {
                C0086.n(7208, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})});
            } catch (Exception e3) {
                C0066.n(62866, null, new Object[]{e3});
            }
            String str = (String) C0065.n(84735, null, new Object[]{(short[]) C0065.n(7131, null, new Object[0]), Integer.valueOf(((Integer) C0065.n(43691, null, new Object[]{(String) C0052.n(11417, null, new Object[0])})).intValue() ^ 1753481), Integer.valueOf(((Integer) C0065.n(43691, null, new Object[]{(String) C0065.n(24272, null, new Object[0])})).intValue() ^ 1751663), Integer.valueOf(((Integer) C0065.n(43691, null, new Object[]{(String) C0068.n(94368, null, new Object[0])})).intValue() ^ 1748948)});
            if (!((Boolean) C0065.n(85590, null, new Object[]{new File(str)})).booleanValue() || ((Boolean) C0099.n(64527, null, new Object[]{(String) C0076.n(86703, null, new Object[]{str}), (String) C0065.n(19496, null, new Object[]{(short[]) C0065.n(7131, null, new Object[0]), Integer.valueOf(((Integer) C0065.n(43691, null, new Object[]{(String) C0065.n(60906, null, new Object[0])})).intValue() ^ 1746866), Integer.valueOf(((Integer) C0065.n(43691, null, new Object[]{(String) C0065.n(62622, null, new Object[0])})).intValue() ^ 1749639), Integer.valueOf(1756795 ^ ((Integer) C0065.n(43691, null, new Object[]{(String) C0065.n(1924, null, new Object[0])})).intValue())})})).booleanValue()) {
                C0084.n(64874, null, new Object[]{(CheckBox) C0084.n(53530, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})}), false});
            } else {
                C0084.n(64874, null, new Object[]{(CheckBox) C0084.n(53530, null, new Object[]{(MainActivity) C0065.n(83241, null, new Object[]{this})}), true});
            }
        }
    }

    public static class p implements DialogInterface.OnClickListener {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f42short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(9240909)}[0], new Object[0])).intValue() ^ 9240932];
            sArr[0] = 2706;
            sArr[1] = 2717;
            sArr[2] = 2711;
            sArr[3] = 2689;
            sArr[4] = 2716;
            sArr[5] = 2714;
            sArr[6] = 2711;
            sArr[7] = 2781;
            sArr[8] = 2691;
            sArr[9] = 2710;
            sArr[10] = 2689;
            sArr[11] = 2718;
            sArr[12] = 2714;
            sArr[13] = 2688;
            sArr[14] = 2688;
            sArr[15] = 2714;
            sArr[16] = 2716;
            sArr[17] = 2717;
            sArr[18] = 2781;
            sArr[19] = 2724;
            sArr[20] = 2721;
            sArr[21] = 2746;
            sArr[22] = 2727;
            sArr[23] = 2742;
            sArr[24] = 2732;
            sArr[25] = 2742;
            sArr[26] = 2731;
            sArr[27] = 2727;
            sArr[28] = 2742;
            sArr[29] = 2721;
            sArr[30] = 2749;
            sArr[31] = 2738;
            sArr[32] = 2751;
            sArr[33] = 2732;
            sArr[34] = 2720;
            sArr[35] = 2727;
            sArr[36] = 2748;
            sArr[37] = 2721;
            sArr[38] = 2738;
            sArr[39] = 2740;
            sArr[40] = 2742;
            f42short = sArr;
        }

        public p() {
            if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                C0052.n(84044, (PrintStream) C0104.n(12888), new Object[]{Float.valueOf(((Float) C0052.n(71646, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0072.n(47027)})})).floatValue())});
            }
        }

        /* renamed from: ۥۗ⁠ۣۖ۬ۧ⁣ۨ⁤ۖ⁤ۖۥ⁠⁤ۜۧۖۖ, reason: contains not printable characters */
        public static int m1167(Object obj) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥۦ⁤⁣ۗۖۧ⁤ۥۖۤ⁤ۜ⁠۬ۢ⁠۬⁤⁤, reason: contains not printable characters */
        public static String m1168(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤⁣⁠⁤⁤⁤ۢ⁠⁤ۡ⁤⁠ۥۖ⁠ۢۖۧ⁤, reason: contains not printable characters */
        public static short[] m1169() {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (short[]) C0072.n(42700);
            }
            return null;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Integer num = new Integer(2396375);
            MainActivity mainActivity = (MainActivity) C0072.n(78401, null, new Object[]{this});
            int intValue = ((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 2396374;
            String[] strArr = new String[intValue];
            strArr[0] = (String) C0072.n(29091, null, new Object[]{(short[]) C0072.n(28303, null, new Object[0]), Integer.valueOf(((Integer) C0072.n(49777, null, new Object[]{(String) C0072.n(62985, null, new Object[0])})).intValue() ^ 56445), Integer.valueOf(((Integer) C0072.n(49777, null, new Object[]{(String) C0072.n(56184, null, new Object[0])})).intValue() ^ 1753615), Integer.valueOf(((Integer) C0072.n(49777, null, new Object[]{(String) C0072.n(86563, null, new Object[0])})).intValue() ^ 1749015)});
            C0072.n(39652, null, new Object[]{mainActivity, strArr, Integer.valueOf(intValue)});
            MainActivity mainActivity2 = (MainActivity) C0072.n(78401, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity2, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity2})});
            if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
                C0043.n(80863, (PrintStream) C0104.n(12888), new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0072.n(42263)})});
            }
        }
    }

    public static class q implements DialogInterface.OnClickListener {
        public q() {
            if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0087.n(71232, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0072.n(37722)})})});
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ((Boolean) C0072.n(30432, null, new Object[]{(CheckBox) C0096.n(45379, null, new Object[]{(MainActivity) C0072.n(83978, null, new Object[]{this})})})).booleanValue();
            ((Boolean) C0072.n(30432, null, new Object[]{(CheckBox) C0072.n(53127, null, new Object[]{(MainActivity) C0072.n(83978, null, new Object[]{this})})})).booleanValue();
        }
    }

    public static class r extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f43short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(9343902)}[0], new Object[0])).intValue() ^ 9342990];
            sArr[0] = 857;
            sArr[1] = 788;
            sArr[2] = 790;
            sArr[3] = 780;
            sArr[4] = 791;
            sArr[5] = 781;
            sArr[6] = 857;
            sArr[7] = 852;
            sArr[8] = 790;
            sArr[9] = 857;
            sArr[10] = 779;
            sArr[11] = 796;
            sArr[12] = 788;
            sArr[13] = 790;
            sArr[14] = 780;
            sArr[15] = 791;
            sArr[16] = 781;
            sArr[17] = 853;
            sArr[18] = 779;
            sArr[19] = 782;
            sArr[20] = 857;
            sArr[21] = 779;
            sArr[22] = 790;
            sArr[23] = 790;
            sArr[24] = 781;
            sArr[25] = 799;
            sArr[26] = 778;
            sArr[27] = 857;
            sArr[28] = 854;
            sArr[29] = 857;
            sArr[30] = 834;
            sArr[31] = 857;
            sArr[32] = 1815;
            sArr[33] = 1882;
            sArr[34] = 1880;
            sArr[35] = 1858;
            sArr[36] = 1881;
            sArr[37] = 1859;
            sArr[38] = 1815;
            sArr[39] = 1818;
            sArr[40] = 1880;
            sArr[41] = 1815;
            sArr[42] = 1861;
            sArr[43] = 1874;
            sArr[44] = 1882;
            sArr[45] = 1880;
            sArr[46] = 1858;
            sArr[47] = 1881;
            sArr[48] = 1859;
            sArr[49] = 1819;
            sArr[50] = 1861;
            sArr[51] = 1856;
            sArr[52] = 1815;
            sArr[53] = 1816;
            sArr[54] = 1876;
            sArr[55] = 1878;
            sArr[56] = 1876;
            sArr[57] = 1887;
            sArr[58] = 1874;
            sArr[59] = 1815;
            sArr[60] = 1804;
            sArr[61] = 1815;
            sArr[62] = 2201;
            sArr[63] = 2260;
            sArr[64] = 2262;
            sArr[65] = 2252;
            sArr[66] = 2263;
            sArr[67] = 2253;
            sArr[68] = 2201;
            sArr[69] = 2196;
            sArr[70] = 2262;
            sArr[71] = 2201;
            sArr[72] = 2251;
            sArr[73] = 2268;
            sArr[74] = 2260;
            sArr[75] = 2262;
            sArr[76] = 2252;
            sArr[77] = 2263;
            sArr[78] = 2253;
            sArr[79] = 2197;
            sArr[80] = 2251;
            sArr[81] = 2254;
            sArr[82] = 2201;
            sArr[83] = 2198;
            sArr[84] = 2269;
            sArr[85] = 2264;
            sArr[86] = 2253;
            sArr[87] = 2264;
            sArr[88] = 2201;
            sArr[89] = 2178;
            sArr[90] = 2201;
            sArr[91] = 2330;
            sArr[92] = 2391;
            sArr[93] = 2389;
            sArr[94] = 2383;
            sArr[95] = 2388;
            sArr[96] = 2382;
            sArr[97] = 2330;
            sArr[98] = 2327;
            sArr[99] = 2389;
            sArr[100] = 2330;
            sArr[101] = 2376;
            sArr[102] = 2399;
            sArr[103] = 2391;
            sArr[104] = 2389;
            sArr[105] = 2383;
            sArr[106] = 2388;
            sArr[107] = 2382;
            sArr[108] = 2326;
            sArr[109] = 2376;
            sArr[110] = 2381;
            sArr[111] = 2330;
            sArr[112] = 2325;
            sArr[113] = 2398;
            sArr[114] = 2399;
            sArr[115] = 2380;
            sArr[116] = 2330;
            sArr[117] = 2305;
            sArr[118] = 2330;
            sArr[119] = 1951;
            sArr[120] = 2002;
            sArr[121] = 2000;
            sArr[122] = 1994;
            sArr[123] = 2001;
            sArr[124] = 1995;
            sArr[125] = 1951;
            sArr[126] = 1938;
            sArr[127] = 2000;
            sArr[128] = 1951;
            sArr[129] = 1997;
            sArr[130] = 2010;
            sArr[131] = 2002;
            sArr[132] = 2000;
            sArr[133] = 1994;
            sArr[134] = 2001;
            sArr[135] = 1995;
            sArr[136] = 1939;
            sArr[137] = 1997;
            sArr[138] = 1992;
            sArr[139] = 1951;
            sArr[140] = 1936;
            sArr[141] = 2011;
            sArr[142] = 2010;
            sArr[143] = 1993;
            sArr[144] = 1936;
            sArr[145] = 2013;
            sArr[146] = 2003;
            sArr[147] = 2000;
            sArr[148] = 2012;
            sArr[149] = 2004;
            sArr[150] = 1936;
            sArr[151] = 1999;
            sArr[152] = 2003;
            sArr[153] = 2014;
            sArr[154] = 1995;
            sArr[155] = 2009;
            sArr[156] = 2000;
            sArr[157] = 1997;
            sArr[158] = 2002;
            sArr[159] = 1936;
            sArr[160] = 2002;
            sArr[161] = 1996;
            sArr[162] = 2002;
            sArr[163] = 2016;
            sArr[164] = 1996;
            sArr[165] = 2011;
            sArr[166] = 2012;
            sArr[167] = 2012;
            sArr[168] = 1937;
            sArr[169] = 1934;
            sArr[170] = 1936;
            sArr[171] = 2013;
            sArr[172] = 1990;
            sArr[173] = 1938;
            sArr[174] = 2001;
            sArr[175] = 2014;
            sArr[176] = 2002;
            sArr[177] = 2010;
            sArr[178] = 1936;
            sArr[179] = 2009;
            sArr[180] = 1996;
            sArr[181] = 2008;
            sArr[182] = 1951;
            sArr[183] = 1936;
            sArr[184] = 2009;
            sArr[185] = 1996;
            sArr[186] = 2008;
            sArr[187] = 1951;
            sArr[188] = 1924;
            sArr[189] = 1951;
            sArr[190] = 3215;
            sArr[191] = 3266;
            sArr[192] = 3264;
            sArr[193] = 3290;
            sArr[194] = 3265;
            sArr[195] = 3291;
            sArr[196] = 3215;
            sArr[197] = 3202;
            sArr[198] = 3264;
            sArr[199] = 3215;
            sArr[200] = 3293;
            sArr[201] = 3274;
            sArr[202] = 3266;
            sArr[203] = 3264;
            sArr[204] = 3290;
            sArr[205] = 3265;
            sArr[206] = 3291;
            sArr[207] = 3203;
            sArr[208] = 3293;
            sArr[209] = 3288;
            sArr[210] = 3215;
            sArr[211] = 3200;
            sArr[212] = 3275;
            sArr[213] = 3274;
            sArr[214] = 3289;
            sArr[215] = 3200;
            sArr[216] = 3277;
            sArr[217] = 3267;
            sArr[218] = 3264;
            sArr[219] = 3276;
            sArr[220] = 3268;
            sArr[221] = 3200;
            sArr[222] = 3295;
            sArr[223] = 3267;
            sArr[224] = 3278;
            sArr[225] = 3291;
            sArr[226] = 3273;
            sArr[227] = 3264;
            sArr[228] = 3293;
            sArr[229] = 3266;
            sArr[230] = 3200;
            sArr[231] = 3266;
            sArr[232] = 3292;
            sArr[233] = 3266;
            sArr[234] = 3312;
            sArr[235] = 3292;
            sArr[236] = 3275;
            sArr[237] = 3276;
            sArr[238] = 3276;
            sArr[239] = 3201;
            sArr[240] = 3230;
            sArr[241] = 3200;
            sArr[242] = 3277;
            sArr[243] = 3286;
            sArr[244] = 3202;
            sArr[245] = 3265;
            sArr[246] = 3278;
            sArr[247] = 3266;
            sArr[248] = 3274;
            sArr[249] = 3200;
            sArr[250] = 3292;
            sArr[251] = 3286;
            sArr[252] = 3292;
            sArr[253] = 3291;
            sArr[254] = 3274;
            sArr[255] = 3266;
            sArr[256] = 3215;
            sArr[257] = 3200;
            sArr[258] = 3292;
            sArr[259] = 3286;
            sArr[260] = 3292;
            sArr[261] = 3291;
            sArr[262] = 3274;
            sArr[263] = 3266;
            sArr[264] = 3215;
            sArr[265] = 3220;
            sArr[266] = 3215;
            sArr[267] = 1232;
            sArr[268] = 1181;
            sArr[269] = 1183;
            sArr[270] = 1157;
            sArr[271] = 1182;
            sArr[272] = 1156;
            sArr[273] = 1232;
            sArr[274] = 1245;
            sArr[275] = 1183;
            sArr[276] = 1232;
            sArr[277] = 1154;
            sArr[278] = 1173;
            sArr[279] = 1181;
            sArr[280] = 1183;
            sArr[281] = 1157;
            sArr[282] = 1182;
            sArr[283] = 1156;
            sArr[284] = 1244;
            sArr[285] = 1154;
            sArr[286] = 1159;
            sArr[287] = 1232;
            sArr[288] = 1247;
            sArr[289] = 1155;
            sArr[290] = 1161;
            sArr[291] = 1155;
            sArr[292] = 1156;
            sArr[293] = 1173;
            sArr[294] = 1181;
            sArr[295] = 1232;
            sArr[296] = 1227;
            sArr[297] = 1232;
            sArr[298] = 501;
            sArr[299] = 423;
            sArr[300] = 440;
            sArr[301] = 501;
            sArr[302] = 504;
            sArr[303] = 423;
            sArr[304] = 435;
            sArr[305] = 501;
            sArr[306] = 506;
            sArr[307] = 438;
            sArr[308] = 436;
            sArr[309] = 438;
            sArr[310] = 445;
            sArr[311] = 432;
            sArr[312] = 506;
            sArr[313] = 511;
            sArr[314] = 507;
            sArr[315] = 436;
            sArr[316] = 421;
            sArr[317] = 446;
            sArr[318] = 501;
            sArr[319] = 494;
            sArr[320] = 501;
            sArr[321] = 1055;
            sArr[322] = 1101;
            sArr[323] = 1106;
            sArr[324] = 1055;
            sArr[325] = 1042;
            sArr[326] = 1101;
            sArr[327] = 1113;
            sArr[328] = 1055;
            sArr[329] = 1040;
            sArr[330] = 1116;
            sArr[331] = 1118;
            sArr[332] = 1116;
            sArr[333] = 1111;
            sArr[334] = 1114;
            sArr[335] = 1040;
            sArr[336] = 1045;
            sArr[337] = 1041;
            sArr[338] = 1107;
            sArr[339] = 1104;
            sArr[340] = 1112;
            sArr[341] = 1055;
            sArr[342] = 1028;
            sArr[343] = 1055;
            sArr[344] = 924;
            sArr[345] = 974;
            sArr[346] = 977;
            sArr[347] = 924;
            sArr[348] = 913;
            sArr[349] = 974;
            sArr[350] = 986;
            sArr[351] = 924;
            sArr[352] = 915;
            sArr[353] = 991;
            sArr[354] = 989;
            sArr[355] = 991;
            sArr[356] = 980;
            sArr[357] = 985;
            sArr[358] = 915;
            sArr[359] = 918;
            sArr[360] = 914;
            sArr[361] = 968;
            sArr[362] = 977;
            sArr[363] = 972;
            sArr[364] = 924;
            sArr[365] = 903;
            sArr[366] = 924;
            sArr[367] = 901;
            sArr[368] = 983;
            sArr[369] = 968;
            sArr[370] = 901;
            sArr[371] = 904;
            sArr[372] = 983;
            sArr[373] = 963;
            sArr[374] = 901;
            sArr[375] = 906;
            sArr[376] = 961;
            sArr[377] = 964;
            sArr[378] = 977;
            sArr[379] = 964;
            sArr[380] = 906;
            sArr[381] = 911;
            sArr[382] = 907;
            sArr[383] = 969;
            sArr[384] = 970;
            sArr[385] = 962;
            sArr[386] = 901;
            sArr[387] = 926;
            sArr[388] = 901;
            sArr[389] = 3251;
            sArr[390] = 3297;
            sArr[391] = 3326;
            sArr[392] = 3251;
            sArr[393] = 3262;
            sArr[394] = 3297;
            sArr[395] = 3317;
            sArr[396] = 3251;
            sArr[397] = 3260;
            sArr[398] = 3319;
            sArr[399] = 3314;
            sArr[400] = 3303;
            sArr[401] = 3314;
            sArr[402] = 3260;
            sArr[403] = 3314;
            sArr[404] = 3325;
            sArr[405] = 3297;
            sArr[406] = 3260;
            sArr[407] = 3257;
            sArr[408] = 3251;
            sArr[409] = 3240;
            sArr[410] = 3251;
            sArr[411] = 2731;
            sArr[412] = 2809;
            sArr[413] = 2790;
            sArr[414] = 2731;
            sArr[415] = 2726;
            sArr[416] = 2809;
            sArr[417] = 2797;
            sArr[418] = 2731;
            sArr[419] = 2724;
            sArr[420] = 2799;
            sArr[421] = 2794;
            sArr[422] = 2815;
            sArr[423] = 2794;
            sArr[424] = 2724;
            sArr[425] = 2793;
            sArr[426] = 2794;
            sArr[427] = 2792;
            sArr[428] = 2784;
            sArr[429] = 2814;
            sArr[430] = 2811;
            sArr[431] = 2724;
            sArr[432] = 2811;
            sArr[433] = 2798;
            sArr[434] = 2789;
            sArr[435] = 2799;
            sArr[436] = 2786;
            sArr[437] = 2789;
            sArr[438] = 2796;
            sArr[439] = 2724;
            sArr[440] = 2721;
            sArr[441] = 2725;
            sArr[442] = 2815;
            sArr[443] = 2790;
            sArr[444] = 2811;
            sArr[445] = 2731;
            sArr[446] = 2736;
            sArr[447] = 2731;
            sArr[448] = 1537;
            sArr[449] = 1619;
            sArr[450] = 1612;
            sArr[451] = 1537;
            sArr[452] = 1548;
            sArr[453] = 1619;
            sArr[454] = 1607;
            sArr[455] = 1537;
            sArr[456] = 1550;
            sArr[457] = 1605;
            sArr[458] = 1600;
            sArr[459] = 1621;
            sArr[460] = 1600;
            sArr[461] = 1550;
            sArr[462] = 1602;
            sArr[463] = 1600;
            sArr[464] = 1602;
            sArr[465] = 1609;
            sArr[466] = 1604;
            sArr[467] = 1550;
            sArr[468] = 1547;
            sArr[469] = 1551;
            sArr[470] = 1547;
            sArr[471] = 1537;
            sArr[472] = 1562;
            sArr[473] = 1537;
            sArr[474] = 606;
            sArr[475] = 524;
            sArr[476] = 531;
            sArr[477] = 606;
            sArr[478] = 595;
            sArr[479] = 524;
            sArr[480] = 536;
            sArr[481] = 606;
            sArr[482] = 593;
            sArr[483] = 538;
            sArr[484] = 543;
            sArr[485] = 522;
            sArr[486] = 543;
            sArr[487] = 593;
            sArr[488] = 541;
            sArr[489] = 530;
            sArr[490] = 535;
            sArr[491] = 526;
            sArr[492] = 540;
            sArr[493] = 529;
            sArr[494] = 543;
            sArr[495] = 524;
            sArr[496] = 538;
            sArr[497] = 593;
            sArr[498] = 596;
            sArr[499] = 606;
            sArr[500] = 581;
            sArr[501] = 606;
            sArr[502] = 886;
            sArr[503] = 804;
            sArr[504] = 827;
            sArr[505] = 886;
            sArr[506] = 891;
            sArr[507] = 804;
            sArr[508] = 816;
            sArr[509] = 886;
            sArr[510] = 889;
            sArr[511] = 818;
            sArr[512] = 823;
            sArr[513] = 802;
            sArr[514] = 823;
            sArr[515] = 889;
            sArr[516] = 818;
            sArr[517] = 823;
            sArr[518] = 826;
            sArr[519] = 800;
            sArr[520] = 831;
            sArr[521] = 829;
            sArr[522] = 891;
            sArr[523] = 821;
            sArr[524] = 823;
            sArr[525] = 821;
            sArr[526] = 830;
            sArr[527] = 819;
            sArr[528] = 889;
            sArr[529] = 892;
            sArr[530] = 888;
            sArr[531] = 823;
            sArr[532] = 806;
            sArr[533] = 829;
            sArr[534] = 886;
            sArr[535] = 877;
            sArr[536] = 886;
            sArr[537] = 2365;
            sArr[538] = 2415;
            sArr[539] = 2416;
            sArr[540] = 2365;
            sArr[541] = 2352;
            sArr[542] = 2415;
            sArr[543] = 2427;
            sArr[544] = 2365;
            sArr[545] = 2354;
            sArr[546] = 2425;
            sArr[547] = 2428;
            sArr[548] = 2409;
            sArr[549] = 2428;
            sArr[550] = 2354;
            sArr[551] = 2425;
            sArr[552] = 2428;
            sArr[553] = 2417;
            sArr[554] = 2411;
            sArr[555] = 2420;
            sArr[556] = 2422;
            sArr[557] = 2352;
            sArr[558] = 2430;
            sArr[559] = 2428;
            sArr[560] = 2430;
            sArr[561] = 2421;
            sArr[562] = 2424;
            sArr[563] = 2354;
            sArr[564] = 2359;
            sArr[565] = 2355;
            sArr[566] = 2409;
            sArr[567] = 2416;
            sArr[568] = 2413;
            sArr[569] = 2365;
            sArr[570] = 2342;
            sArr[571] = 2365;
            sArr[572] = 1399;
            sArr[573] = 1317;
            sArr[574] = 1338;
            sArr[575] = 1399;
            sArr[576] = 1402;
            sArr[577] = 1317;
            sArr[578] = 1329;
            sArr[579] = 1399;
            sArr[580] = 1400;
            sArr[581] = 1331;
            sArr[582] = 1334;
            sArr[583] = 1315;
            sArr[584] = 1334;
            sArr[585] = 1400;
            sArr[586] = 1331;
            sArr[587] = 1336;
            sArr[588] = 1337;
            sArr[589] = 1315;
            sArr[590] = 1319;
            sArr[591] = 1334;
            sArr[592] = 1337;
            sArr[593] = 1342;
            sArr[594] = 1332;
            sArr[595] = 1400;
            sArr[596] = 1405;
            sArr[597] = 1401;
            sArr[598] = 1315;
            sArr[599] = 1338;
            sArr[600] = 1319;
            sArr[601] = 1399;
            sArr[602] = 1388;
            sArr[603] = 1399;
            sArr[604] = 2304;
            sArr[605] = 2386;
            sArr[606] = 2381;
            sArr[607] = 2304;
            sArr[608] = 2317;
            sArr[609] = 2386;
            sArr[610] = 2374;
            sArr[611] = 2304;
            sArr[612] = 2319;
            sArr[613] = 2372;
            sArr[614] = 2369;
            sArr[615] = 2388;
            sArr[616] = 2369;
            sArr[617] = 2319;
            sArr[618] = 2379;
            sArr[619] = 2373;
            sArr[620] = 2386;
            sArr[621] = 2382;
            sArr[622] = 2373;
            sArr[623] = 2380;
            sArr[624] = 2384;
            sArr[625] = 2369;
            sArr[626] = 2382;
            sArr[627] = 2377;
            sArr[628] = 2371;
            sArr[629] = 2387;
            sArr[630] = 2319;
            sArr[631] = 2314;
            sArr[632] = 2318;
            sArr[633] = 2388;
            sArr[634] = 2381;
            sArr[635] = 2384;
            sArr[636] = 2304;
            sArr[637] = 2331;
            sArr[638] = 2304;
            sArr[639] = 2386;
            sArr[640] = 2304;
            sArr[641] = 2335;
            sArr[642] = 2386;
            sArr[643] = 2399;
            sArr[644] = 2304;
            sArr[645] = 2324;
            sArr[646] = 2386;
            sArr[647] = 2397;
            sArr[648] = 2326;
            sArr[649] = 2323;
            sArr[650] = 2310;
            sArr[651] = 2323;
            sArr[652] = 2397;
            sArr[653] = 2334;
            sArr[654] = 2323;
            sArr[655] = 2305;
            sArr[656] = 2310;
            sArr[657] = 2349;
            sArr[658] = 2323;
            sArr[659] = 2334;
            sArr[660] = 2333;
            sArr[661] = 2325;
            sArr[662] = 2386;
            sArr[663] = 2377;
            sArr[664] = 2386;
            sArr[665] = 2804;
            sArr[666] = 2726;
            sArr[667] = 2745;
            sArr[668] = 2804;
            sArr[669] = 2809;
            sArr[670] = 2726;
            sArr[671] = 2738;
            sArr[672] = 2804;
            sArr[673] = 2811;
            sArr[674] = 2736;
            sArr[675] = 2741;
            sArr[676] = 2720;
            sArr[677] = 2741;
            sArr[678] = 2811;
            sArr[679] = 2744;
            sArr[680] = 2741;
            sArr[681] = 2727;
            sArr[682] = 2720;
            sArr[683] = 2699;
            sArr[684] = 2751;
            sArr[685] = 2745;
            sArr[686] = 2727;
            sArr[687] = 2739;
            sArr[688] = 2804;
            sArr[689] = 2799;
            sArr[690] = 2804;
            sArr[691] = 2451;
            sArr[692] = 2497;
            sArr[693] = 2526;
            sArr[694] = 2451;
            sArr[695] = 2462;
            sArr[696] = 2497;
            sArr[697] = 2517;
            sArr[698] = 2451;
            sArr[699] = 2460;
            sArr[700] = 2519;
            sArr[701] = 2514;
            sArr[702] = 2503;
            sArr[703] = 2514;
            sArr[704] = 2460;
            sArr[705] = 2527;
            sArr[706] = 2524;
            sArr[707] = 2512;
            sArr[708] = 2514;
            sArr[709] = 2527;
            sArr[710] = 2460;
            sArr[711] = 2503;
            sArr[712] = 2526;
            sArr[713] = 2499;
            sArr[714] = 2460;
            sArr[715] = 2457;
            sArr[716] = 2451;
            sArr[717] = 2440;
            sArr[718] = 2451;
            sArr[719] = 3159;
            sArr[720] = 3077;
            sArr[721] = 3098;
            sArr[722] = 3159;
            sArr[723] = 3162;
            sArr[724] = 3077;
            sArr[725] = 3089;
            sArr[726] = 3159;
            sArr[727] = 3160;
            sArr[728] = 3091;
            sArr[729] = 3094;
            sArr[730] = 3075;
            sArr[731] = 3094;
            sArr[732] = 3160;
            sArr[733] = 3099;
            sArr[734] = 3096;
            sArr[735] = 3088;
            sArr[736] = 3160;
            sArr[737] = 3165;
            sArr[738] = 3159;
            sArr[739] = 3148;
            sArr[740] = 3159;
            sArr[741] = 1744;
            sArr[742] = 1666;
            sArr[743] = 1693;
            sArr[744] = 1744;
            sArr[745] = 1757;
            sArr[746] = 1666;
            sArr[747] = 1686;
            sArr[748] = 1744;
            sArr[749] = 1759;
            sArr[750] = 1684;
            sArr[751] = 1681;
            sArr[752] = 1668;
            sArr[753] = 1681;
            sArr[754] = 1759;
            sArr[755] = 1693;
            sArr[756] = 1692;
            sArr[757] = 1695;
            sArr[758] = 1687;
            sArr[759] = 1759;
            sArr[760] = 1754;
            sArr[761] = 1744;
            sArr[762] = 1739;
            sArr[763] = 1744;
            sArr[764] = 3022;
            sArr[765] = 2972;
            sArr[766] = 2947;
            sArr[767] = 3022;
            sArr[768] = 3011;
            sArr[769] = 2972;
            sArr[770] = 2952;
            sArr[771] = 3022;
            sArr[772] = 3009;
            sArr[773] = 2954;
            sArr[774] = 2959;
            sArr[775] = 2970;
            sArr[776] = 2959;
            sArr[777] = 3009;
            sArr[778] = 2973;
            sArr[779] = 2967;
            sArr[780] = 2973;
            sArr[781] = 2970;
            sArr[782] = 2955;
            sArr[783] = 2947;
            sArr[784] = 3009;
            sArr[785] = 2954;
            sArr[786] = 2972;
            sArr[787] = 2945;
            sArr[788] = 2974;
            sArr[789] = 2956;
            sArr[790] = 2945;
            sArr[791] = 2966;
            sArr[792] = 3009;
            sArr[793] = 3012;
            sArr[794] = 3022;
            sArr[795] = 3029;
            sArr[796] = 3022;
            sArr[797] = 1171;
            sArr[798] = 1217;
            sArr[799] = 1246;
            sArr[800] = 1171;
            sArr[801] = 1182;
            sArr[802] = 1217;
            sArr[803] = 1237;
            sArr[804] = 1171;
            sArr[805] = 1180;
            sArr[806] = 1239;
            sArr[807] = 1234;
            sArr[808] = 1223;
            sArr[809] = 1234;
            sArr[810] = 1180;
            sArr[811] = 1216;
            sArr[812] = 1226;
            sArr[813] = 1216;
            sArr[814] = 1223;
            sArr[815] = 1238;
            sArr[816] = 1246;
            sArr[817] = 1180;
            sArr[818] = 1222;
            sArr[819] = 1216;
            sArr[820] = 1234;
            sArr[821] = 1236;
            sArr[822] = 1238;
            sArr[823] = 1216;
            sArr[824] = 1223;
            sArr[825] = 1234;
            sArr[826] = 1223;
            sArr[827] = 1216;
            sArr[828] = 1180;
            sArr[829] = 1177;
            sArr[830] = 1171;
            sArr[831] = 1160;
            sArr[832] = 1171;
            sArr[833] = 1106;
            sArr[834] = 1024;
            sArr[835] = 1055;
            sArr[836] = 1106;
            sArr[837] = 1119;
            sArr[838] = 1024;
            sArr[839] = 1044;
            sArr[840] = 1106;
            sArr[841] = 1117;
            sArr[842] = 1046;
            sArr[843] = 1043;
            sArr[844] = 1030;
            sArr[845] = 1043;
            sArr[846] = 1117;
            sArr[847] = 1030;
            sArr[848] = 1053;
            sArr[849] = 1055;
            sArr[850] = 1040;
            sArr[851] = 1025;
            sArr[852] = 1030;
            sArr[853] = 1053;
            sArr[854] = 1052;
            sArr[855] = 1047;
            sArr[856] = 1025;
            sArr[857] = 1117;
            sArr[858] = 1112;
            sArr[859] = 1106;
            sArr[860] = 1097;
            sArr[861] = 1106;
            sArr[862] = 1867;
            sArr[863] = 1817;
            sArr[864] = 1798;
            sArr[865] = 1867;
            sArr[866] = 1862;
            sArr[867] = 1817;
            sArr[868] = 1805;
            sArr[869] = 1867;
            sArr[870] = 1860;
            sArr[871] = 1816;
            sArr[872] = 1807;
            sArr[873] = 1800;
            sArr[874] = 1802;
            sArr[875] = 1817;
            sArr[876] = 1807;
            sArr[877] = 1860;
            sArr[878] = 1831;
            sArr[879] = 1828;
            sArr[880] = 1848;
            sArr[881] = 1855;
            sArr[882] = 1861;
            sArr[883] = 1839;
            sArr[884] = 1826;
            sArr[885] = 1849;
            sArr[886] = 1860;
            sArr[887] = 1857;
            sArr[888] = 1867;
            sArr[889] = 1872;
            sArr[890] = 1867;
            sArr[891] = 2829;
            sArr[892] = 2911;
            sArr[893] = 2880;
            sArr[894] = 2829;
            sArr[895] = 2816;
            sArr[896] = 2911;
            sArr[897] = 2891;
            sArr[898] = 2829;
            sArr[899] = 2071;
            sArr[900] = 2164;
            sArr[901] = 2167;
            sArr[902] = 2155;
            sArr[903] = 2156;
            sArr[904] = 2070;
            sArr[905] = 2172;
            sArr[906] = 2161;
            sArr[907] = 2154;
            sArr[908] = 2071;
            sArr[909] = 2066;
            sArr[910] = 2072;
            sArr[911] = 2051;
            f43short = sArr;
        }

        public /* synthetic */ r(i iVar) {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0109.n(13581, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0072.n(70993)})})});
            }
        }

        /* renamed from: ۥۖ⁤ۥ⁤ۖۖ⁤⁠⁤ۥۣ⁣⁠ۖۧۖۥۖۥ, reason: contains not printable characters */
        public static short[] m1170() {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return (short[]) C0072.n(25180);
            }
            return null;
        }

        /* renamed from: ۥۦ⁣۠ۖ⁠ۤ⁤ۖۖۥۖ⁤⁤ۤ⁣ۧۖ۠⁣, reason: contains not printable characters */
        public static String m1171(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۧ⁤ۖ۠ۤۖۖۖ⁤ۢۥ⁠⁤ۨ⁠⁤⁣ۧۤ, reason: contains not printable characters */
        public static String m1172(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۨ⁣⁤ۥۢ⁤⁤⁤ۖ⁠ۥۥ⁤ۖۥۖ⁠⁤⁤, reason: contains not printable characters */
        public static String m1173(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤ۖ⁤ۤۖۜ⁣ۖۖ۬⁤ۤۜۖۖ⁤⁣۬ۖ, reason: contains not printable characters */
        public static String m1174(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤ۤ⁠ۗ⁠ۣۥۥ⁤⁤ۗۢۖۖ⁤⁤ۖ⁤⁠, reason: contains not printable characters */
        public static int m1175(Object obj) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            StringBuilder sb = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(2138401435), new Integer(5945035)};
            MainActivity mainActivity = (MainActivity) C0072.n(19804, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0072.n(19804, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 7891606), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 5945034)});
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0043.n(19859, (PrintStream) C0104.n(12888), new Object[]{Integer.valueOf(((Integer) C0043.n(46321, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0095.n(59608)})})).intValue())});
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0072.n(19804, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0072.n(66282, null, new Object[]{(String) C0095.n(14610, null, new Object[0])})).intValue() ^ 2132260366)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0072.n(19804, null, new Object[]{this})})});
        }
    }

    public static class s extends AsyncTask<Integer, Void, Void> {
        public /* synthetic */ s(i iVar) {
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0095.n(99121)})})});
            }
        }

        /* renamed from: ۥ⁤⁤ۥۖۖ⁤ۖۖ۟⁠⁤ۖۤۧ⁠ۢ۬⁠ۖ, reason: contains not printable characters */
        public static int m1176(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Integer[] numArr) {
            Integer[] numArr2 = numArr;
            if (((Boolean) C0076.n(53605, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{(MainActivity) C0095.n(54881, null, new Object[]{this})}))[((Integer) C0095.n(36900, null, new Object[]{numArr2[0]})).intValue()]})).booleanValue()) {
                C0095.n(72426, null, new Object[]{(MainActivity) C0095.n(54881, null, new Object[]{this}), Integer.valueOf(((Integer) C0095.n(36900, null, new Object[]{numArr2[0]})).intValue())});
            } else {
                C0095.n(85696, null, new Object[]{(MainActivity) C0095.n(54881, null, new Object[]{this}), Integer.valueOf(((Integer) C0095.n(36900, null, new Object[]{numArr2[0]})).intValue())});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r9) {
            MainActivity mainActivity = (MainActivity) C0095.n(54881, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0095.n(54881, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0095.n(48004, null, new Object[]{(String) C0109.n(59476, null, new Object[0])})).intValue() ^ (2131564830 ^ ((Integer) C0095.n(48004, null, new Object[]{(String) C0095.n(38492, null, new Object[0])})).intValue()))})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0095.n(54881, null, new Object[]{this})})});
            if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                C0052.n(84044, (PrintStream) C0104.n(12888), new Object[]{Float.valueOf(((Float) C0052.n(71646, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0095.n(13436)})})).floatValue())});
            }
        }
    }

    public static class t extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f44short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(1806136)}[0], new Object[0])).intValue() ^ 1806013];
            sArr[0] = 1005;
            sArr[1] = 928;
            sArr[2] = 930;
            sArr[3] = 952;
            sArr[4] = 931;
            sArr[5] = 953;
            sArr[6] = 1005;
            sArr[7] = 992;
            sArr[8] = 930;
            sArr[9] = 1005;
            sArr[10] = 959;
            sArr[11] = 936;
            sArr[12] = 928;
            sArr[13] = 930;
            sArr[14] = 952;
            sArr[15] = 931;
            sArr[16] = 953;
            sArr[17] = 993;
            sArr[18] = 959;
            sArr[19] = 954;
            sArr[20] = 1005;
            sArr[21] = 959;
            sArr[22] = 930;
            sArr[23] = 930;
            sArr[24] = 953;
            sArr[25] = 939;
            sArr[26] = 958;
            sArr[27] = 1005;
            sArr[28] = 994;
            sArr[29] = 1005;
            sArr[30] = 1014;
            sArr[31] = 1005;
            sArr[32] = 1978;
            sArr[33] = 2039;
            sArr[34] = 2037;
            sArr[35] = 2031;
            sArr[36] = 2036;
            sArr[37] = 2030;
            sArr[38] = 1978;
            sArr[39] = 1975;
            sArr[40] = 2037;
            sArr[41] = 1978;
            sArr[42] = 2024;
            sArr[43] = 2047;
            sArr[44] = 2039;
            sArr[45] = 2037;
            sArr[46] = 2031;
            sArr[47] = 2036;
            sArr[48] = 2030;
            sArr[49] = 1974;
            sArr[50] = 2024;
            sArr[51] = 2029;
            sArr[52] = 1978;
            sArr[53] = 1973;
            sArr[54] = 2041;
            sArr[55] = 2043;
            sArr[56] = 2041;
            sArr[57] = 2034;
            sArr[58] = 2047;
            sArr[59] = 1978;
            sArr[60] = 1953;
            sArr[61] = 1978;
            sArr[62] = 1663;
            sArr[63] = 1586;
            sArr[64] = 1584;
            sArr[65] = 1578;
            sArr[66] = 1585;
            sArr[67] = 1579;
            sArr[68] = 1663;
            sArr[69] = 1650;
            sArr[70] = 1584;
            sArr[71] = 1663;
            sArr[72] = 1581;
            sArr[73] = 1594;
            sArr[74] = 1586;
            sArr[75] = 1584;
            sArr[76] = 1578;
            sArr[77] = 1585;
            sArr[78] = 1579;
            sArr[79] = 1651;
            sArr[80] = 1581;
            sArr[81] = 1576;
            sArr[82] = 1663;
            sArr[83] = 1648;
            sArr[84] = 1595;
            sArr[85] = 1598;
            sArr[86] = 1579;
            sArr[87] = 1598;
            sArr[88] = 1663;
            sArr[89] = 1636;
            sArr[90] = 1663;
            sArr[91] = 507;
            sArr[92] = 438;
            sArr[93] = 436;
            sArr[94] = 430;
            sArr[95] = 437;
            sArr[96] = 431;
            sArr[97] = 507;
            sArr[98] = 502;
            sArr[99] = 436;
            sArr[100] = 507;
            sArr[101] = 425;
            sArr[102] = 446;
            sArr[103] = 438;
            sArr[104] = 436;
            sArr[105] = 430;
            sArr[106] = 437;
            sArr[107] = 431;
            sArr[108] = 503;
            sArr[109] = 425;
            sArr[110] = 428;
            sArr[111] = 507;
            sArr[112] = 500;
            sArr[113] = 447;
            sArr[114] = 446;
            sArr[115] = 429;
            sArr[116] = 507;
            sArr[117] = 480;
            sArr[118] = 507;
            sArr[119] = 1151;
            sArr[120] = 1074;
            sArr[121] = 1072;
            sArr[122] = 1066;
            sArr[123] = 1073;
            sArr[124] = 1067;
            sArr[125] = 1151;
            sArr[126] = 1138;
            sArr[127] = 1072;
            sArr[128] = 1151;
            sArr[129] = 1069;
            sArr[130] = 1082;
            sArr[131] = 1074;
            sArr[132] = 1072;
            sArr[133] = 1066;
            sArr[134] = 1073;
            sArr[135] = 1067;
            sArr[136] = 1139;
            sArr[137] = 1069;
            sArr[138] = 1064;
            sArr[139] = 1151;
            sArr[140] = 1136;
            sArr[141] = 1083;
            sArr[142] = 1082;
            sArr[143] = 1065;
            sArr[144] = 1136;
            sArr[145] = 1085;
            sArr[146] = 1075;
            sArr[147] = 1072;
            sArr[148] = 1084;
            sArr[149] = 1076;
            sArr[150] = 1136;
            sArr[151] = 1071;
            sArr[152] = 1075;
            sArr[153] = 1086;
            sArr[154] = 1067;
            sArr[155] = 1081;
            sArr[156] = 1072;
            sArr[157] = 1069;
            sArr[158] = 1074;
            sArr[159] = 1136;
            sArr[160] = 1074;
            sArr[161] = 1068;
            sArr[162] = 1074;
            sArr[163] = 1024;
            sArr[164] = 1068;
            sArr[165] = 1083;
            sArr[166] = 1084;
            sArr[167] = 1084;
            sArr[168] = 1137;
            sArr[169] = 1134;
            sArr[170] = 1136;
            sArr[171] = 1085;
            sArr[172] = 1062;
            sArr[173] = 1138;
            sArr[174] = 1073;
            sArr[175] = 1086;
            sArr[176] = 1074;
            sArr[177] = 1082;
            sArr[178] = 1136;
            sArr[179] = 1081;
            sArr[180] = 1068;
            sArr[181] = 1080;
            sArr[182] = 1151;
            sArr[183] = 1136;
            sArr[184] = 1081;
            sArr[185] = 1068;
            sArr[186] = 1080;
            sArr[187] = 1151;
            sArr[188] = 1124;
            sArr[189] = 1151;
            sArr[190] = 3228;
            sArr[191] = 3281;
            sArr[192] = 3283;
            sArr[193] = 3273;
            sArr[194] = 3282;
            sArr[195] = 3272;
            sArr[196] = 3228;
            sArr[197] = 3217;
            sArr[198] = 3283;
            sArr[199] = 3228;
            sArr[200] = 3278;
            sArr[201] = 3289;
            sArr[202] = 3281;
            sArr[203] = 3283;
            sArr[204] = 3273;
            sArr[205] = 3282;
            sArr[206] = 3272;
            sArr[207] = 3216;
            sArr[208] = 3278;
            sArr[209] = 3275;
            sArr[210] = 3228;
            sArr[211] = 3219;
            sArr[212] = 3288;
            sArr[213] = 3289;
            sArr[214] = 3274;
            sArr[215] = 3219;
            sArr[216] = 3294;
            sArr[217] = 3280;
            sArr[218] = 3283;
            sArr[219] = 3295;
            sArr[220] = 3287;
            sArr[221] = 3219;
            sArr[222] = 3276;
            sArr[223] = 3280;
            sArr[224] = 3293;
            sArr[225] = 3272;
            sArr[226] = 3290;
            sArr[227] = 3283;
            sArr[228] = 3278;
            sArr[229] = 3281;
            sArr[230] = 3219;
            sArr[231] = 3281;
            sArr[232] = 3279;
            sArr[233] = 3281;
            sArr[234] = 3299;
            sArr[235] = 3279;
            sArr[236] = 3288;
            sArr[237] = 3295;
            sArr[238] = 3295;
            sArr[239] = 3218;
            sArr[240] = 3213;
            sArr[241] = 3219;
            sArr[242] = 3294;
            sArr[243] = 3269;
            sArr[244] = 3217;
            sArr[245] = 3282;
            sArr[246] = 3293;
            sArr[247] = 3281;
            sArr[248] = 3289;
            sArr[249] = 3219;
            sArr[250] = 3279;
            sArr[251] = 3269;
            sArr[252] = 3279;
            sArr[253] = 3272;
            sArr[254] = 3289;
            sArr[255] = 3281;
            sArr[256] = 3228;
            sArr[257] = 3219;
            sArr[258] = 3279;
            sArr[259] = 3269;
            sArr[260] = 3279;
            sArr[261] = 3272;
            sArr[262] = 3289;
            sArr[263] = 3281;
            sArr[264] = 3228;
            sArr[265] = 3207;
            sArr[266] = 3228;
            sArr[267] = 1496;
            sArr[268] = 1429;
            sArr[269] = 1431;
            sArr[270] = 1421;
            sArr[271] = 1430;
            sArr[272] = 1420;
            sArr[273] = 1496;
            sArr[274] = 1493;
            sArr[275] = 1431;
            sArr[276] = 1496;
            sArr[277] = 1418;
            sArr[278] = 1437;
            sArr[279] = 1429;
            sArr[280] = 1431;
            sArr[281] = 1421;
            sArr[282] = 1430;
            sArr[283] = 1420;
            sArr[284] = 1492;
            sArr[285] = 1418;
            sArr[286] = 1423;
            sArr[287] = 1496;
            sArr[288] = 1495;
            sArr[289] = 1419;
            sArr[290] = 1409;
            sArr[291] = 1419;
            sArr[292] = 1420;
            sArr[293] = 1437;
            sArr[294] = 1429;
            sArr[295] = 1496;
            sArr[296] = 1475;
            sArr[297] = 1496;
            sArr[298] = 2238;
            sArr[299] = 2284;
            sArr[300] = 2291;
            sArr[301] = 2238;
            sArr[302] = 2227;
            sArr[303] = 2284;
            sArr[304] = 2296;
            sArr[305] = 2238;
            sArr[306] = 2225;
            sArr[307] = 2301;
            sArr[308] = 2303;
            sArr[309] = 2301;
            sArr[310] = 2294;
            sArr[311] = 2299;
            sArr[312] = 2225;
            sArr[313] = 2228;
            sArr[314] = 2224;
            sArr[315] = 2290;
            sArr[316] = 2289;
            sArr[317] = 2297;
            sArr[318] = 2238;
            sArr[319] = 2213;
            sArr[320] = 2238;
            sArr[321] = 1517;
            sArr[322] = 1471;
            sArr[323] = 1440;
            sArr[324] = 1517;
            sArr[325] = 1504;
            sArr[326] = 1471;
            sArr[327] = 1451;
            sArr[328] = 1517;
            sArr[329] = 1506;
            sArr[330] = 1449;
            sArr[331] = 1452;
            sArr[332] = 1465;
            sArr[333] = 1452;
            sArr[334] = 1506;
            sArr[335] = 1511;
            sArr[336] = 1507;
            sArr[337] = 1441;
            sArr[338] = 1442;
            sArr[339] = 1450;
            sArr[340] = 1517;
            sArr[341] = 1526;
            sArr[342] = 1517;
            sArr[343] = 1531;
            sArr[344] = 1449;
            sArr[345] = 1462;
            sArr[346] = 1531;
            sArr[347] = 1526;
            sArr[348] = 1449;
            sArr[349] = 1469;
            sArr[350] = 1531;
            sArr[351] = 1524;
            sArr[352] = 1471;
            sArr[353] = 1466;
            sArr[354] = 1455;
            sArr[355] = 1466;
            sArr[356] = 1524;
            sArr[357] = 1463;
            sArr[358] = 1460;
            sArr[359] = 1468;
            sArr[360] = 1524;
            sArr[361] = 1521;
            sArr[362] = 1531;
            sArr[363] = 1504;
            sArr[364] = 1531;
            sArr[365] = 2644;
            sArr[366] = 2566;
            sArr[367] = 2585;
            sArr[368] = 2644;
            sArr[369] = 2649;
            sArr[370] = 2578;
            sArr[371] = 2644;
            sArr[372] = 2651;
            sArr[373] = 2576;
            sArr[374] = 2577;
            sArr[375] = 2562;
            sArr[376] = 2651;
            sArr[377] = 2567;
            sArr[378] = 2587;
            sArr[379] = 2583;
            sArr[380] = 2591;
            sArr[381] = 2577;
            sArr[382] = 2560;
            sArr[383] = 2651;
            sArr[384] = 2584;
            sArr[385] = 2587;
            sArr[386] = 2579;
            sArr[387] = 2576;
            sArr[388] = 2654;
            f44short = sArr;
        }

        public /* synthetic */ t(i iVar) {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0043.n(80863, (PrintStream) C0104.n(12888), new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0095.n(72307)})});
            }
        }

        /* renamed from: ۥۣ⁤⁤۠ۖۤۥۖۖۥۢۤ⁣⁣⁠ۨۨۖۥ, reason: contains not printable characters */
        public static String m1177(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۥۖ⁤⁠۬ۦ⁣ۖ⁣ۥۣ۬۟۠⁤ۗۖ⁣۠, reason: contains not printable characters */
        public static String m1178(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۥۗ⁠۟ۖۢۥۥ⁤⁤ۥۖۥۖۨۖۖۖ⁠, reason: contains not printable characters */
        public static short[] m1179() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (short[]) C0095.n(5084);
            }
            return null;
        }

        /* renamed from: ۥۥۥ⁤⁠ۖۖ⁣۟ۢ۟⁣ۗۥۗ⁤ۣۣ⁤⁣, reason: contains not printable characters */
        public static String m1180(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤ۖ⁣ۤۥ⁠⁠ۖۥ⁣ۖۤ۟ۨۖ⁣ۥ⁣ۢ, reason: contains not printable characters */
        public static int m1181(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ⁤⁠ۣۖۨ⁤۟⁤⁠۠ۖۥۖ۠⁣ۥۖۖ۠, reason: contains not printable characters */
        public static String m1182(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            StringBuilder sb = new StringBuilder();
            C0083.n(39709, null, new Object[]{sb, (String) C0096.n(48052, null, new Object[]{(MainActivity) C0095.n(59675, null, new Object[]{this})}), (String) C0056.n(25480, null, new Object[]{(short[]) C0095.n(65382, null, new Object[0]), Integer.valueOf(((Integer) C0095.n(94627, null, new Object[]{(String) C0089.n(84630, null, new Object[0])})).intValue() ^ 1753039), Integer.valueOf(((Integer) C0095.n(94627, null, new Object[]{(String) C0101.n(64173, null, new Object[0])})).intValue() ^ 1750840), Integer.valueOf(1752235 ^ ((Integer) C0095.n(94627, null, new Object[]{(String) C0089.n(51338, null, new Object[0])})).intValue())})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(9029527), new Integer(2137104279)};
            MainActivity mainActivity = (MainActivity) C0095.n(59675, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0095.n(59675, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 7118748), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 9029526)});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0095.n(59675, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0095.n(94627, null, new Object[]{(String) C0089.n(47227, null, new Object[0])})).intValue() ^ 2132258616)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0095.n(59675, null, new Object[]{this})})});
            if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                C0044.n(51197, (PrintStream) C0104.n(12888), new Object[]{Double.valueOf(((Double) C0044.n(33161, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0089.n(90167)})})).doubleValue())});
            }
        }
    }

    public static class u extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f45short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(9785736)}[0], new Object[0])).intValue() ^ 9786845];
            sArr[0] = 2275;
            sArr[1] = 2214;
            sArr[2] = 2208;
            sArr[3] = 2219;
            sArr[4] = 2220;
            sArr[5] = 2275;
            sArr[6] = 2176;
            sArr[7] = 2220;
            sArr[8] = 2222;
            sArr[9] = 2227;
            sArr[10] = 2210;
            sArr[11] = 2221;
            sArr[12] = 2234;
            sArr[13] = 2275;
            sArr[14] = 2297;
            sArr[15] = 2275;
            sArr[16] = 2211;
            sArr[17] = 2212;
            sArr[18] = 2214;
            sArr[19] = 2231;
            sArr[20] = 2227;
            sArr[21] = 2225;
            sArr[22] = 2220;
            sArr[23] = 2227;
            sArr[24] = 2275;
            sArr[25] = 2225;
            sArr[26] = 2220;
            sArr[27] = 2285;
            sArr[28] = 2227;
            sArr[29] = 2225;
            sArr[30] = 2220;
            sArr[31] = 2215;
            sArr[32] = 2230;
            sArr[33] = 2208;
            sArr[34] = 2231;
            sArr[35] = 2285;
            sArr[36] = 2209;
            sArr[37] = 2225;
            sArr[38] = 2210;
            sArr[39] = 2221;
            sArr[40] = 2215;
            sArr[41] = 2211;
            sArr[42] = 2275;
            sArr[43] = 2301;
            sArr[44] = 2275;
            sArr[45] = 3023;
            sArr[46] = 2948;
            sArr[47] = 2949;
            sArr[48] = 2964;
            sArr[49] = 2945;
            sArr[50] = 2953;
            sArr[51] = 2956;
            sArr[52] = 2963;
            sArr[53] = 3022;
            sArr[54] = 2964;
            sArr[55] = 2968;
            sArr[56] = 2964;
            sArr[57] = 2082;
            sArr[58] = 2151;
            sArr[59] = 2145;
            sArr[60] = 2154;
            sArr[61] = 2157;
            sArr[62] = 2082;
            sArr[63] = 2127;
            sArr[64] = 2147;
            sArr[65] = 2156;
            sArr[66] = 2167;
            sArr[67] = 2148;
            sArr[68] = 2147;
            sArr[69] = 2145;
            sArr[70] = 2166;
            sArr[71] = 2167;
            sArr[72] = 2160;
            sArr[73] = 2151;
            sArr[74] = 2160;
            sArr[75] = 2082;
            sArr[76] = 2104;
            sArr[77] = 2082;
            sArr[78] = 2146;
            sArr[79] = 2149;
            sArr[80] = 2151;
            sArr[81] = 2166;
            sArr[82] = 2162;
            sArr[83] = 2160;
            sArr[84] = 2157;
            sArr[85] = 2162;
            sArr[86] = 2082;
            sArr[87] = 2160;
            sArr[88] = 2157;
            sArr[89] = 2092;
            sArr[90] = 2162;
            sArr[91] = 2160;
            sArr[92] = 2157;
            sArr[93] = 2150;
            sArr[94] = 2167;
            sArr[95] = 2145;
            sArr[96] = 2166;
            sArr[97] = 2092;
            sArr[98] = 2159;
            sArr[99] = 2147;
            sArr[100] = 2156;
            sArr[101] = 2167;
            sArr[102] = 2148;
            sArr[103] = 2147;
            sArr[104] = 2145;
            sArr[105] = 2166;
            sArr[106] = 2167;
            sArr[107] = 2160;
            sArr[108] = 2151;
            sArr[109] = 2160;
            sArr[110] = 2146;
            sArr[111] = 2082;
            sArr[112] = 2108;
            sArr[113] = 2108;
            sArr[114] = 2082;
            sArr[115] = 458;
            sArr[116] = 399;
            sArr[117] = 393;
            sArr[118] = 386;
            sArr[119] = 389;
            sArr[120] = 458;
            sArr[121] = 423;
            sArr[122] = 389;
            sArr[123] = 398;
            sArr[124] = 399;
            sArr[125] = 390;
            sArr[126] = 458;
            sArr[127] = 464;
            sArr[128] = 458;
            sArr[129] = 394;
            sArr[130] = 397;
            sArr[131] = 399;
            sArr[132] = 414;
            sArr[133] = 410;
            sArr[134] = 408;
            sArr[135] = 389;
            sArr[136] = 410;
            sArr[137] = 458;
            sArr[138] = 408;
            sArr[139] = 389;
            sArr[140] = 452;
            sArr[141] = 410;
            sArr[142] = 408;
            sArr[143] = 389;
            sArr[144] = 398;
            sArr[145] = 415;
            sArr[146] = 393;
            sArr[147] = 414;
            sArr[148] = 452;
            sArr[149] = 391;
            sArr[150] = 389;
            sArr[151] = 398;
            sArr[152] = 399;
            sArr[153] = 390;
            sArr[154] = 394;
            sArr[155] = 458;
            sArr[156] = 468;
            sArr[157] = 468;
            sArr[158] = 458;
            sArr[159] = 2419;
            sArr[160] = 2360;
            sArr[161] = 2361;
            sArr[162] = 2344;
            sArr[163] = 2365;
            sArr[164] = 2357;
            sArr[165] = 2352;
            sArr[166] = 2351;
            sArr[167] = 2418;
            sArr[168] = 2344;
            sArr[169] = 2340;
            sArr[170] = 2344;
            sArr[171] = 2428;
            sArr[172] = 2407;
            sArr[173] = 2428;
            sArr[174] = 2365;
            sArr[175] = 2401;
            sArr[176] = 2364;
            sArr[177] = 2363;
            sArr[178] = 2361;
            sArr[179] = 2344;
            sArr[180] = 2348;
            sArr[181] = 2350;
            sArr[182] = 2355;
            sArr[183] = 2348;
            sArr[184] = 2428;
            sArr[185] = 2350;
            sArr[186] = 2355;
            sArr[187] = 2418;
            sArr[188] = 2351;
            sArr[189] = 2361;
            sArr[190] = 2350;
            sArr[191] = 2357;
            sArr[192] = 2365;
            sArr[193] = 2352;
            sArr[194] = 2354;
            sArr[195] = 2355;
            sArr[196] = 2364;
            sArr[197] = 586;
            sArr[198] = 527;
            sArr[199] = 521;
            sArr[200] = 514;
            sArr[201] = 517;
            sArr[202] = 586;
            sArr[203] = 569;
            sArr[204] = 527;
            sArr[205] = 536;
            sArr[206] = 515;
            sArr[207] = 523;
            sArr[208] = 518;
            sArr[209] = 586;
            sArr[210] = 548;
            sArr[211] = 543;
            sArr[212] = 519;
            sArr[213] = 520;
            sArr[214] = 527;
            sArr[215] = 536;
            sArr[216] = 586;
            sArr[217] = 592;
            sArr[218] = 586;
            sArr[219] = 590;
            sArr[220] = 523;
            sArr[221] = 586;
            sArr[222] = 596;
            sArr[223] = 596;
            sArr[224] = 586;
            sArr[225] = 617;
            sArr[226] = 556;
            sArr[227] = 554;
            sArr[228] = 545;
            sArr[229] = 550;
            sArr[230] = 617;
            sArr[231] = 539;
            sArr[232] = 518;
            sArr[233] = 516;
            sArr[234] = 617;
            sArr[235] = 627;
            sArr[236] = 617;
            sArr[237] = 553;
            sArr[238] = 558;
            sArr[239] = 556;
            sArr[240] = 573;
            sArr[241] = 569;
            sArr[242] = 571;
            sArr[243] = 550;
            sArr[244] = 569;
            sArr[245] = 617;
            sArr[246] = 571;
            sArr[247] = 550;
            sArr[248] = 615;
            sArr[249] = 555;
            sArr[250] = 572;
            sArr[251] = 544;
            sArr[252] = 549;
            sArr[253] = 557;
            sArr[254] = 615;
            sArr[255] = 557;
            sArr[256] = 544;
            sArr[257] = 570;
            sArr[258] = 569;
            sArr[259] = 549;
            sArr[260] = 552;
            sArr[261] = 560;
            sArr[262] = 615;
            sArr[263] = 544;
            sArr[264] = 557;
            sArr[265] = 553;
            sArr[266] = 617;
            sArr[267] = 631;
            sArr[268] = 631;
            sArr[269] = 617;
            sArr[270] = 813;
            sArr[271] = 872;
            sArr[272] = 878;
            sArr[273] = 869;
            sArr[274] = 866;
            sArr[275] = 813;
            sArr[276] = 844;
            sArr[277] = 867;
            sArr[278] = 873;
            sArr[279] = 895;
            sArr[280] = 866;
            sArr[281] = 868;
            sArr[282] = 873;
            sArr[283] = 813;
            sArr[284] = 859;
            sArr[285] = 872;
            sArr[286] = 895;
            sArr[287] = 894;
            sArr[288] = 868;
            sArr[289] = 866;
            sArr[290] = 867;
            sArr[291] = 813;
            sArr[292] = 823;
            sArr[293] = 813;
            sArr[294] = 877;
            sArr[295] = 874;
            sArr[296] = 872;
            sArr[297] = 889;
            sArr[298] = 893;
            sArr[299] = 895;
            sArr[300] = 866;
            sArr[301] = 893;
            sArr[302] = 813;
            sArr[303] = 895;
            sArr[304] = 866;
            sArr[305] = 803;
            sArr[306] = 879;
            sArr[307] = 888;
            sArr[308] = 868;
            sArr[309] = 865;
            sArr[310] = 873;
            sArr[311] = 803;
            sArr[312] = 891;
            sArr[313] = 872;
            sArr[314] = 895;
            sArr[315] = 894;
            sArr[316] = 868;
            sArr[317] = 866;
            sArr[318] = 867;
            sArr[319] = 803;
            sArr[320] = 895;
            sArr[321] = 872;
            sArr[322] = 865;
            sArr[323] = 872;
            sArr[324] = 876;
            sArr[325] = 894;
            sArr[326] = 872;
            sArr[327] = 877;
            sArr[328] = 813;
            sArr[329] = 819;
            sArr[330] = 819;
            sArr[331] = 813;
            sArr[332] = 1808;
            sArr[333] = 1877;
            sArr[334] = 1875;
            sArr[335] = 1880;
            sArr[336] = 1887;
            sArr[337] = 1808;
            sArr[338] = 1891;
            sArr[339] = 1908;
            sArr[340] = 1915;
            sArr[341] = 1808;
            sArr[342] = 1802;
            sArr[343] = 1808;
            sArr[344] = 1872;
            sArr[345] = 1879;
            sArr[346] = 1877;
            sArr[347] = 1860;
            sArr[348] = 1856;
            sArr[349] = 1858;
            sArr[350] = 1887;
            sArr[351] = 1856;
            sArr[352] = 1808;
            sArr[353] = 1858;
            sArr[354] = 1887;
            sArr[355] = 1822;
            sArr[356] = 1874;
            sArr[357] = 1861;
            sArr[358] = 1881;
            sArr[359] = 1884;
            sArr[360] = 1876;
            sArr[361] = 1822;
            sArr[362] = 1862;
            sArr[363] = 1877;
            sArr[364] = 1858;
            sArr[365] = 1859;
            sArr[366] = 1881;
            sArr[367] = 1887;
            sArr[368] = 1886;
            sArr[369] = 1822;
            sArr[370] = 1859;
            sArr[371] = 1876;
            sArr[372] = 1883;
            sArr[373] = 1872;
            sArr[374] = 1808;
            sArr[375] = 1806;
            sArr[376] = 1806;
            sArr[377] = 1808;
            sArr[378] = 2268;
            sArr[379] = 2201;
            sArr[380] = 2207;
            sArr[381] = 2196;
            sArr[382] = 2195;
            sArr[383] = 2268;
            sArr[384] = 2231;
            sArr[385] = 2201;
            sArr[386] = 2190;
            sArr[387] = 2194;
            sArr[388] = 2201;
            sArr[389] = 2192;
            sArr[390] = 2268;
            sArr[391] = 2246;
            sArr[392] = 2268;
            sArr[393] = 2204;
            sArr[394] = 2185;
            sArr[395] = 2194;
            sArr[396] = 2205;
            sArr[397] = 2193;
            sArr[398] = 2201;
            sArr[399] = 2268;
            sArr[400] = 2257;
            sArr[401] = 2190;
            sArr[402] = 2204;
            sArr[403] = 2268;
            sArr[404] = 2242;
            sArr[405] = 2242;
            sArr[406] = 2268;
            sArr[407] = 1068;
            sArr[408] = 1129;
            sArr[409] = 1135;
            sArr[410] = 1124;
            sArr[411] = 1123;
            sArr[412] = 1068;
            sArr[413] = 1116;
            sArr[414] = 1150;
            sArr[415] = 1123;
            sArr[416] = 1135;
            sArr[417] = 1129;
            sArr[418] = 1151;
            sArr[419] = 1151;
            sArr[420] = 1123;
            sArr[421] = 1150;
            sArr[422] = 1068;
            sArr[423] = 1078;
            sArr[424] = 1068;
            sArr[425] = 1132;
            sArr[426] = 1145;
            sArr[427] = 1122;
            sArr[428] = 1133;
            sArr[429] = 1121;
            sArr[430] = 1129;
            sArr[431] = 1068;
            sArr[432] = 1057;
            sArr[433] = 1121;
            sArr[434] = 1132;
            sArr[435] = 1068;
            sArr[436] = 1074;
            sArr[437] = 1074;
            sArr[438] = 1068;
            sArr[439] = 2627;
            sArr[440] = 2591;
            sArr[441] = 2581;
            sArr[442] = 2591;
            sArr[443] = 2627;
            sArr[444] = 2568;
            sArr[445] = 2569;
            sArr[446] = 2586;
            sArr[447] = 2565;
            sArr[448] = 2575;
            sArr[449] = 2569;
            sArr[450] = 2591;
            sArr[451] = 2627;
            sArr[452] = 2591;
            sArr[453] = 2581;
            sArr[454] = 2591;
            sArr[455] = 2584;
            sArr[456] = 2569;
            sArr[457] = 2561;
            sArr[458] = 2627;
            sArr[459] = 2575;
            sArr[460] = 2588;
            sArr[461] = 2585;
            sArr[462] = 2627;
            sArr[463] = 2575;
            sArr[464] = 2588;
            sArr[465] = 2585;
            sArr[466] = 2328;
            sArr[467] = 2388;
            sArr[468] = 2375;
            sArr[469] = 2370;
            sArr[470] = 2385;
            sArr[471] = 2373;
            sArr[472] = 2386;
            sArr[473] = 2374;
            sArr[474] = 2328;
            sArr[475] = 2372;
            sArr[476] = 2388;
            sArr[477] = 2390;
            sArr[478] = 2395;
            sArr[479] = 2398;
            sArr[480] = 2393;
            sArr[481] = 2384;
            sArr[482] = 2408;
            sArr[483] = 2390;
            sArr[484] = 2369;
            sArr[485] = 2390;
            sArr[486] = 2398;
            sArr[487] = 2395;
            sArr[488] = 2390;
            sArr[489] = 2389;
            sArr[490] = 2395;
            sArr[491] = 2386;
            sArr[492] = 2408;
            sArr[493] = 2385;
            sArr[494] = 2373;
            sArr[495] = 2386;
            sArr[496] = 2374;
            sArr[497] = 2370;
            sArr[498] = 2386;
            sArr[499] = 2393;
            sArr[500] = 2388;
            sArr[501] = 2398;
            sArr[502] = 2386;
            sArr[503] = 2372;
            sArr[504] = 1124;
            sArr[505] = 1057;
            sArr[506] = 1148;
            sArr[507] = 3135;
            sArr[508] = 3196;
            sArr[509] = 3198;
            sArr[510] = 3179;
            sArr[511] = 3135;
            sArr[512] = 3120;
            sArr[513] = 3180;
            sArr[514] = 3174;
            sArr[515] = 3180;
            sArr[516] = 3120;
            sArr[517] = 3195;
            sArr[518] = 3194;
            sArr[519] = 3177;
            sArr[520] = 3190;
            sArr[521] = 3196;
            sArr[522] = 3194;
            sArr[523] = 3180;
            sArr[524] = 3120;
            sArr[525] = 3180;
            sArr[526] = 3174;
            sArr[527] = 3180;
            sArr[528] = 3179;
            sArr[529] = 3194;
            sArr[530] = 3186;
            sArr[531] = 3120;
            sArr[532] = 3196;
            sArr[533] = 3183;
            sArr[534] = 3178;
            sArr[535] = 3120;
            sArr[536] = 3196;
            sArr[537] = 3183;
            sArr[538] = 3178;
            sArr[539] = 437;
            sArr[540] = 505;
            sArr[541] = 490;
            sArr[542] = 495;
            sArr[543] = 508;
            sArr[544] = 488;
            sArr[545] = 511;
            sArr[546] = 491;
            sArr[547] = 437;
            sArr[548] = 489;
            sArr[549] = 505;
            sArr[550] = 507;
            sArr[551] = 502;
            sArr[552] = 499;
            sArr[553] = 500;
            sArr[554] = 509;
            sArr[555] = 453;
            sArr[556] = 507;
            sArr[557] = 492;
            sArr[558] = 507;
            sArr[559] = 499;
            sArr[560] = 502;
            sArr[561] = 507;
            sArr[562] = 504;
            sArr[563] = 502;
            sArr[564] = 511;
            sArr[565] = 453;
            sArr[566] = 508;
            sArr[567] = 488;
            sArr[568] = 511;
            sArr[569] = 491;
            sArr[570] = 495;
            sArr[571] = 511;
            sArr[572] = 500;
            sArr[573] = 505;
            sArr[574] = 499;
            sArr[575] = 511;
            sArr[576] = 489;
            sArr[577] = 442;
            sArr[578] = 486;
            sArr[579] = 442;
            sArr[580] = 2742;
            sArr[581] = 2785;
            sArr[582] = 2805;
            sArr[583] = 2742;
            sArr[584] = 2747;
            sArr[585] = 2785;
            sArr[586] = 2806;
            sArr[587] = 2742;
            sArr[588] = 2733;
            sArr[589] = 2742;
            sArr[590] = 2799;
            sArr[591] = 2731;
            sArr[592] = 2806;
            sArr[593] = 1768;
            sArr[594] = 1705;
            sArr[595] = 1727;
            sArr[596] = 1699;
            sArr[597] = 1768;
            sArr[598] = 1775;
            sArr[599] = 1715;
            sArr[600] = 1720;
            sArr[601] = 1722;
            sArr[602] = 1697;
            sArr[603] = 1702;
            sArr[604] = 1724;
            sArr[605] = 1768;
            sArr[606] = 1772;
            sArr[607] = 1775;
            sArr[608] = 1772;
            sArr[609] = 1712;
            sArr[610] = 1775;
            sArr[611] = 1717;
            sArr[612] = 1775;
            sArr[613] = 1704;
            sArr[614] = 1768;
            sArr[615] = 1779;
            sArr[616] = 1768;
            sArr[617] = 1714;
            sArr[618] = 1781;
            sArr[619] = 1704;
            sArr[620] = 2431;
            sArr[621] = 2366;
            sArr[622] = 2344;
            sArr[623] = 2356;
            sArr[624] = 2431;
            sArr[625] = 2424;
            sArr[626] = 2340;
            sArr[627] = 2351;
            sArr[628] = 2349;
            sArr[629] = 2358;
            sArr[630] = 2353;
            sArr[631] = 2347;
            sArr[632] = 2431;
            sArr[633] = 2427;
            sArr[634] = 2414;
            sArr[635] = 2338;
            sArr[636] = 2424;
            sArr[637] = 2367;
            sArr[638] = 2431;
            sArr[639] = 2404;
            sArr[640] = 2431;
            sArr[641] = 374;
            sArr[642] = 307;
            sArr[643] = 309;
            sArr[644] = 318;
            sArr[645] = 313;
            sArr[646] = 374;
            sArr[647] = 277;
            sArr[648] = 262;
            sArr[649] = 259;
            sArr[650] = 374;
            sArr[651] = 1762;
            sArr[652] = 1668;
            sArr[653] = 1712;
            sArr[654] = 1703;
            sArr[655] = 1715;
            sArr[656] = 1719;
            sArr[657] = 1703;
            sArr[658] = 1708;
            sArr[659] = 1697;
            sArr[660] = 1723;
            sArr[661] = 1762;
            sArr[662] = 1784;
            sArr[663] = 1762;
            sArr[664] = 1766;
            sArr[665] = 1770;
            sArr[666] = 1770;
            sArr[667] = 1766;
            sArr[668] = 1723;
            sArr[669] = 1773;
            sArr[670] = 1779;
            sArr[671] = 1778;
            sArr[672] = 1778;
            sArr[673] = 1778;
            sArr[674] = 1771;
            sArr[675] = 1771;
            sArr[676] = 1762;
            sArr[677] = 1679;
            sArr[678] = 1674;
            sArr[679] = 1720;
            sArr[680] = 1762;
            sArr[681] = 1773;
            sArr[682] = 1762;
            sArr[683] = 1766;
            sArr[684] = 1770;
            sArr[685] = 1770;
            sArr[686] = 1766;
            sArr[687] = 1720;
            sArr[688] = 1773;
            sArr[689] = 1779;
            sArr[690] = 1778;
            sArr[691] = 1778;
            sArr[692] = 1778;
            sArr[693] = 1771;
            sArr[694] = 1771;
            sArr[695] = 1762;
            sArr[696] = 1679;
            sArr[697] = 1674;
            sArr[698] = 1720;
            sArr[699] = 1762;
            sArr[700] = 1788;
            sArr[701] = 1788;
            sArr[702] = 1762;
            sArr[703] = 2262;
            sArr[704] = 2256;
            sArr[705] = 2267;
            sArr[706] = 2268;
            sArr[707] = 2195;
            sArr[708] = 2288;
            sArr[709] = 2275;
            sArr[710] = 2278;
            sArr[711] = 2195;
            sArr[712] = 2342;
            sArr[713] = 2364;
            sArr[714] = 2342;
            sArr[715] = 2409;
            sArr[716] = 2400;
            sArr[717] = 2400;
            sArr[718] = 2342;
            sArr[719] = 2360;
            sArr[720] = 2360;
            sArr[721] = 2342;
            sArr[722] = 2532;
            sArr[723] = 2465;
            sArr[724] = 2471;
            sArr[725] = 2476;
            sArr[726] = 2475;
            sArr[727] = 2532;
            sArr[728] = 2438;
            sArr[729] = 2481;
            sArr[730] = 2487;
            sArr[731] = 2493;
            sArr[732] = 2470;
            sArr[733] = 2475;
            sArr[734] = 2492;
            sArr[735] = 2532;
            sArr[736] = 2450;
            sArr[737] = 2465;
            sArr[738] = 2486;
            sArr[739] = 2487;
            sArr[740] = 2477;
            sArr[741] = 2475;
            sArr[742] = 2474;
            sArr[743] = 2532;
            sArr[744] = 2558;
            sArr[745] = 2532;
            sArr[746] = 2468;
            sArr[747] = 2470;
            sArr[748] = 2481;
            sArr[749] = 2487;
            sArr[750] = 2493;
            sArr[751] = 2470;
            sArr[752] = 2475;
            sArr[753] = 2492;
            sArr[754] = 2532;
            sArr[755] = 2488;
            sArr[756] = 2532;
            sArr[757] = 820;
            sArr[758] = 885;
            sArr[759] = 867;
            sArr[760] = 895;
            sArr[761] = 820;
            sArr[762] = 819;
            sArr[763] = 858;
            sArr[764] = 838;
            sArr[765] = 809;
            sArr[766] = 809;
            sArr[767] = 805;
            sArr[768] = 879;
            sArr[769] = 868;
            sArr[770] = 870;
            sArr[771] = 893;
            sArr[772] = 890;
            sArr[773] = 864;
            sArr[774] = 820;
            sArr[775] = 816;
            sArr[776] = 806;
            sArr[777] = 873;
            sArr[778] = 819;
            sArr[779] = 884;
            sArr[780] = 820;
            sArr[781] = 810;
            sArr[782] = 810;
            sArr[783] = 820;
            sArr[784] = 1380;
            sArr[785] = 1387;
            sArr[786] = 1325;
            sArr[787] = 1366;
            sArr[788] = 1325;
            sArr[789] = 1312;
            sArr[790] = 1384;
            sArr[791] = 1325;
            sArr[792] = 1314;
            sArr[793] = 1406;
            sArr[794] = 1396;
            sArr[795] = 1406;
            sArr[796] = 1401;
            sArr[797] = 1384;
            sArr[798] = 1376;
            sArr[799] = 1314;
            sArr[800] = 1384;
            sArr[801] = 1401;
            sArr[802] = 1390;
            sArr[803] = 1314;
            sArr[804] = 1380;
            sArr[805] = 1379;
            sArr[806] = 1380;
            sArr[807] = 1401;
            sArr[808] = 1315;
            sArr[809] = 1385;
            sArr[810] = 1325;
            sArr[811] = 1360;
            sArr[812] = 1334;
            sArr[813] = 1325;
            sArr[814] = 1401;
            sArr[815] = 1381;
            sArr[816] = 1384;
            sArr[817] = 1379;
            sArr[818] = 1325;
            sArr[819] = 669;
            sArr[820] = 728;
            sArr[821] = 734;
            sArr[822] = 725;
            sArr[823] = 722;
            sArr[824] = 669;
            sArr[825] = 750;
            sArr[826] = 712;
            sArr[827] = 717;
            sArr[828] = 717;
            sArr[829] = 722;
            sArr[830] = 719;
            sArr[831] = 713;
            sArr[832] = 669;
            sArr[833] = 756;
            sArr[834] = 723;
            sArr[835] = 724;
            sArr[836] = 713;
            sArr[837] = 659;
            sArr[838] = 729;
            sArr[839] = 669;
            sArr[840] = 763;
            sArr[841] = 722;
            sArr[842] = 712;
            sArr[843] = 723;
            sArr[844] = 729;
            sArr[845] = 669;
            sArr[846] = 643;
            sArr[847] = 643;
            sArr[848] = 669;
            sArr[849] = 461;
            sArr[850] = 390;
            sArr[851] = 391;
            sArr[852] = 406;
            sArr[853] = 387;
            sArr[854] = 395;
            sArr[855] = 398;
            sArr[856] = 401;
            sArr[857] = 460;
            sArr[858] = 406;
            sArr[859] = 410;
            sArr[860] = 406;
            sArr[861] = 450;
            sArr[862] = 473;
            sArr[863] = 450;
            sArr[864] = 391;
            sArr[865] = 398;
            sArr[866] = 401;
            sArr[867] = 391;
            sArr[868] = 450;
            sArr[869] = 3303;
            sArr[870] = 3234;
            sArr[871] = 3236;
            sArr[872] = 3247;
            sArr[873] = 3240;
            sArr[874] = 3303;
            sArr[875] = 3220;
            sArr[876] = 3250;
            sArr[877] = 3255;
            sArr[878] = 3255;
            sArr[879] = 3240;
            sArr[880] = 3253;
            sArr[881] = 3251;
            sArr[882] = 3303;
            sArr[883] = 3214;
            sArr[884] = 3241;
            sArr[885] = 3246;
            sArr[886] = 3251;
            sArr[887] = 3305;
            sArr[888] = 3235;
            sArr[889] = 3303;
            sArr[890] = 3209;
            sArr[891] = 3240;
            sArr[892] = 3251;
            sArr[893] = 3303;
            sArr[894] = 3201;
            sArr[895] = 3240;
            sArr[896] = 3250;
            sArr[897] = 3241;
            sArr[898] = 3235;
            sArr[899] = 3303;
            sArr[900] = 3321;
            sArr[901] = 3321;
            sArr[902] = 3303;
            sArr[903] = 842;
            sArr[904] = 769;
            sArr[905] = 768;
            sArr[906] = 785;
            sArr[907] = 772;
            sArr[908] = 780;
            sArr[909] = 777;
            sArr[910] = 790;
            sArr[911] = 843;
            sArr[912] = 785;
            sArr[913] = 797;
            sArr[914] = 785;
            sArr[915] = 837;
            sArr[916] = 862;
            sArr[917] = 837;
            sArr[918] = 771;
            sArr[919] = 780;
            sArr[920] = 1733;
            sArr[921] = 1670;
            sArr[922] = 1677;
            sArr[923] = 1672;
            sArr[924] = 1674;
            sArr[925] = 1665;
            sArr[926] = 1733;
            sArr[927] = 1747;
            sArr[928] = 1745;
            sArr[929] = 1745;
            sArr[930] = 1733;
            sArr[931] = 3230;
            sArr[932] = 3285;
            sArr[933] = 3284;
            sArr[934] = 3269;
            sArr[935] = 3280;
            sArr[936] = 3288;
            sArr[937] = 3293;
            sArr[938] = 3266;
            sArr[939] = 3231;
            sArr[940] = 3269;
            sArr[941] = 3273;
            sArr[942] = 3269;
            sArr[943] = 3217;
            sArr[944] = 3210;
            sArr[945] = 3217;
            sArr[946] = 2717;
            sArr[947] = 2782;
            sArr[948] = 2773;
            sArr[949] = 2768;
            sArr[950] = 2770;
            sArr[951] = 2777;
            sArr[952] = 2717;
            sArr[953] = 2760;
            sArr[954] = 2778;
            sArr[955] = 2770;
            sArr[956] = 2710;
            sArr[957] = 2767;
            sArr[958] = 2717;
            sArr[959] = 2706;
            sArr[960] = 2765;
            sArr[961] = 2767;
            sArr[962] = 2770;
            sArr[963] = 2782;
            sArr[964] = 2706;
            sArr[965] = 2763;
            sArr[966] = 2776;
            sArr[967] = 2767;
            sArr[968] = 2766;
            sArr[969] = 2772;
            sArr[970] = 2770;
            sArr[971] = 2771;
            sArr[972] = 2717;
            sArr[973] = 2694;
            sArr[974] = 2717;
            sArr[975] = 2012;
            sArr[976] = 1951;
            sArr[977] = 1940;
            sArr[978] = 1937;
            sArr[979] = 1939;
            sArr[980] = 1944;
            sArr[981] = 2012;
            sArr[982] = 1929;
            sArr[983] = 1947;
            sArr[984] = 1939;
            sArr[985] = 2007;
            sArr[986] = 1934;
            sArr[987] = 2012;
            sArr[988] = 2003;
            sArr[989] = 1932;
            sArr[990] = 1934;
            sArr[991] = 1939;
            sArr[992] = 1951;
            sArr[993] = 2003;
            sArr[994] = 1951;
            sArr[995] = 1932;
            sArr[996] = 1929;
            sArr[997] = 1941;
            sArr[998] = 1938;
            sArr[999] = 1946;
            sArr[1000] = 1939;
            sArr[1001] = 2012;
            sArr[1002] = 1991;
            sArr[1003] = 2012;
            sArr[1004] = 1644;
            sArr[1005] = 1583;
            sArr[1006] = 1572;
            sArr[1007] = 1569;
            sArr[1008] = 1571;
            sArr[1009] = 1576;
            sArr[1010] = 1644;
            sArr[1011] = 1593;
            sArr[1012] = 1579;
            sArr[1013] = 1571;
            sArr[1014] = 1639;
            sArr[1015] = 1598;
            sArr[1016] = 1644;
            sArr[1017] = 1635;
            sArr[1018] = 1596;
            sArr[1019] = 1598;
            sArr[1020] = 1571;
            sArr[1021] = 1583;
            sArr[1022] = 1635;
            sArr[1023] = 1569;
            sArr[1024] = 1577;
            sArr[1025] = 1569;
            sArr[1026] = 1573;
            sArr[1027] = 1570;
            sArr[1028] = 1578;
            sArr[1029] = 1571;
            sArr[1030] = 1644;
            sArr[1031] = 1655;
            sArr[1032] = 1644;
            sArr[1033] = 2706;
            sArr[1034] = 2769;
            sArr[1035] = 2778;
            sArr[1036] = 2783;
            sArr[1037] = 2781;
            sArr[1038] = 2774;
            sArr[1039] = 2706;
            sArr[1040] = 2759;
            sArr[1041] = 2773;
            sArr[1042] = 2781;
            sArr[1043] = 2713;
            sArr[1044] = 2752;
            sArr[1045] = 2706;
            sArr[1046] = 2717;
            sArr[1047] = 2774;
            sArr[1048] = 2771;
            sArr[1049] = 2758;
            sArr[1050] = 2771;
            sArr[1051] = 2717;
            sArr[1052] = 2783;
            sArr[1053] = 2779;
            sArr[1054] = 2753;
            sArr[1055] = 2769;
            sArr[1056] = 2717;
            sArr[1057] = 2757;
            sArr[1058] = 2779;
            sArr[1059] = 2772;
            sArr[1060] = 2779;
            sArr[1061] = 2717;
            sArr[1062] = 2757;
            sArr[1063] = 2754;
            sArr[1064] = 2771;
            sArr[1065] = 2797;
            sArr[1066] = 2753;
            sArr[1067] = 2759;
            sArr[1068] = 2754;
            sArr[1069] = 2754;
            sArr[1070] = 2782;
            sArr[1071] = 2779;
            sArr[1072] = 2769;
            sArr[1073] = 2771;
            sArr[1074] = 2780;
            sArr[1075] = 2758;
            sArr[1076] = 2716;
            sArr[1077] = 2769;
            sArr[1078] = 2781;
            sArr[1079] = 2780;
            sArr[1080] = 2772;
            sArr[1081] = 2706;
            sArr[1082] = 2697;
            sArr[1083] = 2706;
            sArr[1084] = 3216;
            sArr[1085] = 3283;
            sArr[1086] = 3288;
            sArr[1087] = 3293;
            sArr[1088] = 3295;
            sArr[1089] = 3284;
            sArr[1090] = 3216;
            sArr[1091] = 3269;
            sArr[1092] = 3287;
            sArr[1093] = 3295;
            sArr[1094] = 3227;
            sArr[1095] = 3266;
            sArr[1096] = 3216;
            sArr[1097] = 3231;
            sArr[1098] = 3264;
            sArr[1099] = 3266;
            sArr[1100] = 3295;
            sArr[1101] = 3283;
            sArr[1102] = 3231;
            sArr[1103] = 3270;
            sArr[1104] = 3293;
            sArr[1105] = 3267;
            sArr[1106] = 3268;
            sArr[1107] = 3281;
            sArr[1108] = 3268;
            f45short = sArr;
        }

        public /* synthetic */ u(i iVar) {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0043.n(80863, (PrintStream) C0104.n(12888), new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0089.n(61812)})});
            }
        }

        /* renamed from: ۥۖۖ⁤⁤ۖۖ⁠ۥ⁣ۨ⁣ۥ⁤⁤⁤⁣⁤ۧۥ, reason: contains not printable characters */
        public static short[] m1183() {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (short[]) C0089.n(95095);
            }
            return null;
        }

        /* renamed from: ۥ⁠ۖۗۨ⁤ۖ⁣⁠ۥۖۖ۟ۥ⁤ۥۣۖۖ⁠, reason: contains not printable characters */
        public static String m1184(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁠ۖۡ⁤ۥۖ⁤ۖۡ۠ۢۥ⁤⁣۬⁤⁤⁣ۖ, reason: contains not printable characters */
        public static String m1185(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤ۖۥۖۗۥ۟ۢۢ⁠ۢۥۣ۟ۖ⁤⁤⁤⁤, reason: contains not printable characters */
        public static View m1186(Object obj, int i) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (View) C0089.n(14007, (abx.b.d.a.l) obj, new Object[]{Integer.valueOf(i)});
            }
            return null;
        }

        /* renamed from: ۥ⁤ۣ۟ۥ⁤ۥ⁠⁤ۖ⁤ۖۖ⁤⁣ۖۖ⁤⁣ۥ, reason: contains not printable characters */
        public static String m1187(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤⁤ۖۢ⁤ۖ⁤ۥ⁠⁤ۖۥ⁤ۖۧ⁣ۖ⁤⁠, reason: contains not printable characters */
        public static String m1188(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۦۥۣۖۜۖۥۥ⁤ۥۖ⁠⁠۬ۖ⁠ۥ⁤⁤ۖ, reason: contains not printable characters */
        public static int m1189(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            StringBuilder sb = new StringBuilder();
            String str = (String) C0089.n(44809, null, new Object[]{(short[]) C0089.n(8035, null, new Object[0]), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0089.n(12287, null, new Object[0])})).intValue() ^ 56489), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0106.n(37658, null, new Object[0])})).intValue() ^ 1752523), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0093.n(2586, null, new Object[0])})).intValue() ^ 1747991)});
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
            StringBuilder sb2 = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb2})});
            StringBuilder sb3 = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb3})});
            StringBuilder sb4 = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb4})});
            StringBuilder sb5 = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb5})});
            StringBuilder sb6 = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb6})});
            StringBuilder sb7 = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb7})});
            StringBuilder sb8 = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb8})});
            StringBuilder sb9 = new StringBuilder();
            C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb9})});
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= ((Integer) C0042.n(79139, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this})})).intValue()) {
                    StringBuilder sb10 = new StringBuilder();
                    C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb10})});
                    StringBuilder sb11 = new StringBuilder();
                    C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb11})});
                    StringBuilder sb12 = new StringBuilder();
                    C0083.n(39709, null, new Object[]{sb12, (String) C0096.n(48052, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this})}), (String) C0085.n(43026, null, new Object[]{(short[]) C0089.n(8035, null, new Object[0]), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0103.n(17374, null, new Object[0])})).intValue() ^ 1750686), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0068.n(96324, null, new Object[0])})).intValue() ^ 1754620), Integer.valueOf(1746796 ^ ((Integer) C0089.n(62193, null, new Object[]{(String) C0103.n(51725, null, new Object[0])})).intValue())})});
                    TextView textView = (TextView) ((View) C0103.n(73471, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this}), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0056.n(69262, null, new Object[0])})).intValue() ^ 2131928895)}));
                    TextView textView2 = (TextView) ((View) C0103.n(73471, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this}), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0103.n(54391, null, new Object[0])})).intValue() ^ 2131932821)}));
                    TextView textView3 = (TextView) ((View) C0103.n(73471, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this}), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0103.n(45820, null, new Object[0])})).intValue() ^ (2131236220 ^ ((Integer) C0089.n(62193, null, new Object[]{(String) C0088.n(13143, null, new Object[0])})).intValue()))}));
                    TextView textView4 = (TextView) ((View) C0103.n(73471, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this}), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0055.n(62151, null, new Object[0])})).intValue() ^ 2131287077)}));
                    TextView textView5 = (TextView) ((View) C0103.n(73471, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this}), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0084.n(78185, null, new Object[0])})).intValue() ^ 2131930063)}));
                    TextView textView6 = (TextView) ((View) C0103.n(73471, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this}), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0103.n(90477, null, new Object[0])})).intValue() ^ (2131893932 ^ ((Integer) C0089.n(62193, null, new Object[]{(String) C0103.n(55430, null, new Object[0])})).intValue()))}));
                    MainActivity mainActivity = (MainActivity) C0082.n(60564, null, new Object[]{this});
                    mainActivity.M = 0;
                    C0101.n(46515, null, new Object[]{mainActivity, new cbx.a(this, textView, textView2, textView3, textView4, textView5, textView6)});
                    return null;
                }
                StringBuilder sb13 = new StringBuilder();
                if (((Boolean) C0066.n(48385, null, new Object[]{new File((String) C0104.n(48310, null, new Object[]{sb13}))})).booleanValue()) {
                    StringBuilder sb14 = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0089.n(44809, null, new Object[]{(short[]) C0089.n(8035, null, new Object[0]), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0031.n(26081, null, new Object[0])})).intValue() ^ 1749884), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0031.n(75708, null, new Object[0])})).intValue() ^ 1753412), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0031.n(14457, null, new Object[0])})).intValue() ^ 1751605)})});
                    String str2 = (String) C0089.n(56568, null, new Object[]{(short[]) C0089.n(8035, null, new Object[0]), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0091.n(23128, null, new Object[0])})).intValue() ^ 1753277), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0031.n(85138, null, new Object[0])})).intValue() ^ 1749636), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0060.n(66693, null, new Object[0])})).intValue() ^ 1745599)});
                    String str3 = (String) C0089.n(44809, null, new Object[]{(short[]) C0089.n(8035, null, new Object[0]), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0031.n(62868, null, new Object[0])})).intValue() ^ 1749213), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0099.n(90728, null, new Object[0])})).intValue() ^ 1753486), Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0086.n(51218, null, new Object[0])})).intValue() ^ 1752856)});
                    C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb14})});
                } else {
                    StringBuilder sb15 = new StringBuilder();
                    C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb15})});
                }
                i = i2 + 1;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r9) {
            MainActivity mainActivity = (MainActivity) C0082.n(60564, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0082.n(60564, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0089.n(62193, null, new Object[]{(String) C0058.n(46073, null, new Object[0])})).intValue() ^ 2132261496)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0082.n(60564, null, new Object[]{this})})});
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0082.n(77284, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0103.n(97057)})})});
            }
        }
    }

    public static class v extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f46short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(5419775)}[0], new Object[0])).intValue() ^ 5419744];
            sArr[0] = 2344;
            sArr[1] = 2411;
            sArr[2] = 2400;
            sArr[3] = 2405;
            sArr[4] = 2407;
            sArr[5] = 2412;
            sArr[6] = 2344;
            sArr[7] = 2429;
            sArr[8] = 2415;
            sArr[9] = 2407;
            sArr[10] = 2339;
            sArr[11] = 2426;
            sArr[12] = 2344;
            sArr[13] = 2343;
            sArr[14] = 2427;
            sArr[15] = 2417;
            sArr[16] = 2427;
            sArr[17] = 2428;
            sArr[18] = 2413;
            sArr[19] = 2405;
            sArr[20] = 2343;
            sArr[21] = 2410;
            sArr[22] = 2429;
            sArr[23] = 2401;
            sArr[24] = 2404;
            sArr[25] = 2412;
            sArr[26] = 2342;
            sArr[27] = 2424;
            sArr[28] = 2426;
            sArr[29] = 2407;
            sArr[30] = 2424;
            f46short = sArr;
        }

        public /* synthetic */ v(i iVar) {
            if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0103.n(47428)})})});
            }
        }

        /* renamed from: ۥۣۖۜ⁤ۤۖ⁤۬ۡ⁠ۤ⁣⁠ۖ⁤ۖ⁤ۖۖ, reason: contains not printable characters */
        public static View m1190(Object obj, int i) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (View) C0089.n(14007, (abx.b.d.a.l) obj, new Object[]{Integer.valueOf(i)});
            }
            return null;
        }

        /* renamed from: ۥ⁤ۣ⁤۟⁠⁤⁤ۧۥ⁤⁠ۗ⁠⁣⁤⁤ۜ⁤⁤, reason: contains not printable characters */
        public static int m1191(Object obj) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۦۥۥ⁣⁠⁤ۤ۟ۧ⁤۟ۖ⁤۬۟⁠⁣ۧ⁤ۨ, reason: contains not printable characters */
        public static short[] m1192() {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (short[]) C0103.n(48276);
            }
            return null;
        }

        /* renamed from: ۦ⁣ۥ⁣⁣ۗ⁤ۤۥۖۖ⁤ۢۥ⁤⁤⁤ۜ⁣ۜ, reason: contains not printable characters */
        public static String m1193(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            C0083.n(39709, null, new Object[]{new StringBuilder(), (String) C0096.n(48052, null, new Object[]{(MainActivity) C0103.n(93737, null, new Object[]{this})}), (String) C0041.n(90079, null, new Object[]{(short[]) C0103.n(82394, null, new Object[0]), Integer.valueOf(((Integer) C0103.n(13167, null, new Object[]{(String) C0041.n(32680, null, new Object[0])})).intValue() ^ 1751558), Integer.valueOf(((Integer) C0103.n(13167, null, new Object[]{(String) C0041.n(7051, null, new Object[0])})).intValue() ^ 1755375), Integer.valueOf(1755245 ^ ((Integer) C0103.n(13167, null, new Object[]{(String) C0103.n(84874, null, new Object[0])})).intValue())})});
            TextView textView = (TextView) ((View) C0041.n(90260, null, new Object[]{(MainActivity) C0103.n(93737, null, new Object[]{this}), Integer.valueOf(((Integer) C0103.n(13167, null, new Object[]{(String) C0041.n(93744, null, new Object[0])})).intValue() ^ 2131930106)}));
            MainActivity mainActivity = (MainActivity) C0103.n(93737, null, new Object[]{this});
            mainActivity.N = 0;
            C0101.n(46515, null, new Object[]{mainActivity, new cbx.b(this, textView)});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r9) {
            MainActivity mainActivity = (MainActivity) C0103.n(93737, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0103.n(93737, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0103.n(13167, null, new Object[]{(String) C0041.n(23822, null, new Object[0])})).intValue() ^ 2132262290)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0103.n(93737, null, new Object[]{this})})});
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0052.n(84044, (PrintStream) C0104.n(12888), new Object[]{Float.valueOf(((Float) C0052.n(71646, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0041.n(78498)})})).floatValue())});
            }
        }
    }

    public static class w extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f47short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(9044887)}[0], new Object[0])).intValue() ^ 9044760];
            sArr[0] = 1859;
            sArr[1] = 1806;
            sArr[2] = 1804;
            sArr[3] = 1814;
            sArr[4] = 1805;
            sArr[5] = 1815;
            sArr[6] = 1859;
            sArr[7] = 1870;
            sArr[8] = 1804;
            sArr[9] = 1859;
            sArr[10] = 1809;
            sArr[11] = 1812;
            sArr[12] = 1871;
            sArr[13] = 1809;
            sArr[14] = 1798;
            sArr[15] = 1806;
            sArr[16] = 1804;
            sArr[17] = 1814;
            sArr[18] = 1805;
            sArr[19] = 1815;
            sArr[20] = 1859;
            sArr[21] = 1868;
            sArr[22] = 1799;
            sArr[23] = 1794;
            sArr[24] = 1815;
            sArr[25] = 1794;
            sArr[26] = 1859;
            sArr[27] = 1880;
            sArr[28] = 1859;
            sArr[29] = 1881;
            sArr[30] = 1803;
            sArr[31] = 1812;
            sArr[32] = 1881;
            sArr[33] = 1876;
            sArr[34] = 1823;
            sArr[35] = 1881;
            sArr[36] = 1878;
            sArr[37] = 1821;
            sArr[38] = 1816;
            sArr[39] = 1805;
            sArr[40] = 1816;
            sArr[41] = 1878;
            sArr[42] = 1802;
            sArr[43] = 1792;
            sArr[44] = 1802;
            sArr[45] = 1805;
            sArr[46] = 1820;
            sArr[47] = 1812;
            sArr[48] = 1878;
            sArr[49] = 1819;
            sArr[50] = 1816;
            sArr[51] = 1805;
            sArr[52] = 1805;
            sArr[53] = 1820;
            sArr[54] = 1803;
            sArr[55] = 1792;
            sArr[56] = 1802;
            sArr[57] = 1805;
            sArr[58] = 1816;
            sArr[59] = 1805;
            sArr[60] = 1802;
            sArr[61] = 1879;
            sArr[62] = 1819;
            sArr[63] = 1808;
            sArr[64] = 1815;
            sArr[65] = 1881;
            sArr[66] = 1858;
            sArr[67] = 403;
            sArr[68] = 393;
            sArr[69] = 403;
            sArr[70] = 481;
            sArr[71] = 470;
            sArr[72] = 448;
            sArr[73] = 455;
            sArr[74] = 466;
            sArr[75] = 449;
            sArr[76] = 455;
            sArr[77] = 2033;
            sArr[78] = 1996;
            sArr[79] = 1944;
            sArr[80] = 2001;
            sArr[81] = 1995;
            sArr[82] = 1944;
            sArr[83] = 1994;
            sArr[84] = 2013;
            sArr[85] = 2011;
            sArr[86] = 2007;
            sArr[87] = 2005;
            sArr[88] = 2005;
            sArr[89] = 2013;
            sArr[90] = 2006;
            sArr[91] = 2012;
            sArr[92] = 2013;
            sArr[93] = 2012;
            sArr[94] = 1944;
            sArr[95] = 1996;
            sArr[96] = 2007;
            sArr[97] = 1944;
            sArr[98] = 1994;
            sArr[99] = 2013;
            sArr[100] = 1995;
            sArr[101] = 1996;
            sArr[102] = 2009;
            sArr[103] = 1994;
            sArr[104] = 1996;
            sArr[105] = 1944;
            sArr[106] = 1996;
            sArr[107] = 2000;
            sArr[108] = 2013;
            sArr[109] = 1944;
            sArr[110] = 2012;
            sArr[111] = 2013;
            sArr[112] = 1998;
            sArr[113] = 2001;
            sArr[114] = 2011;
            sArr[115] = 2013;
            sArr[116] = 1944;
            sArr[117] = 2009;
            sArr[118] = 2014;
            sArr[119] = 1996;
            sArr[120] = 2013;
            sArr[121] = 1994;
            sArr[122] = 1944;
            sArr[123] = 2010;
            sArr[124] = 2009;
            sArr[125] = 1996;
            sArr[126] = 1996;
            sArr[127] = 2013;
            sArr[128] = 1994;
            sArr[129] = 1985;
            sArr[130] = 1944;
            sArr[131] = 2011;
            sArr[132] = 2009;
            sArr[133] = 2004;
            sArr[134] = 2001;
            sArr[135] = 2010;
            sArr[136] = 1994;
            sArr[137] = 2009;
            sArr[138] = 1996;
            sArr[139] = 2001;
            sArr[140] = 2007;
            sArr[141] = 2006;
            sArr[142] = 1942;
            f47short = sArr;
        }

        public /* synthetic */ w(i iVar) {
            if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0041.n(2358)})})});
            }
        }

        /* renamed from: ۥۣۖۖۨ⁤⁤⁤ۢۥۖۜ۟ۥۥ۟ۢۖ⁤ۖ, reason: contains not printable characters */
        public static String m1194(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۖ⁠ۥ⁤ۖۤ⁤ۥۥۖۖۥ⁤ۖۖۥۥۖۖ, reason: contains not printable characters */
        public static int m1195(Object obj) {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() <= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ⁠⁤ۖۖۜ⁠ۣ۬ۥ⁠ۖۥ۠ۤۖ⁤ۣ⁣ۖ, reason: contains not printable characters */
        public static String m1196(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥ⁤ۧۧۖۖ⁠⁠ۖۥ⁤⁠ۜ⁤۟⁤۠⁤⁣⁤, reason: contains not printable characters */
        public static short[] m1197() {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (short[]) C0041.n(2189);
            }
            return null;
        }

        /* renamed from: ۦ⁤⁤⁤⁤ۢۗۧۖۥۥ⁠⁤۟ۖ۠ۖۖ⁠⁤, reason: contains not printable characters */
        public static String m1198(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            StringBuilder sb = new StringBuilder();
            C0083.n(39709, null, new Object[]{sb, (String) C0096.n(48052, null, new Object[]{(MainActivity) C0048.n(6089, null, new Object[]{this})}), (String) C0041.n(88189, null, new Object[]{(short[]) C0041.n(49301, null, new Object[0]), Integer.valueOf(((Integer) C0041.n(19324, null, new Object[]{(String) C0041.n(69998, null, new Object[0])})).intValue() ^ 1755377), Integer.valueOf(((Integer) C0041.n(19324, null, new Object[]{(String) C0041.n(22733, null, new Object[0])})).intValue() ^ 1746784), Integer.valueOf(1756859 ^ ((Integer) C0041.n(19324, null, new Object[]{(String) C0041.n(85488, null, new Object[0])})).intValue())})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r32) {
            Object[] objArr = {new Integer(3528446), new Integer(20733117)};
            MainActivity mainActivity = (MainActivity) C0048.n(6089, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0048.n(6089, null, new Object[]{this});
            C0104.n(41715, null, new Object[]{(Toast) C0104.n(80514, null, new Object[]{mainActivity2, (String) C0104.n(18661, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0041.n(19324, null, new Object[]{(String) C0038.n(24982, null, new Object[0])})).intValue() ^ 2132262336)}), Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 3528447)})});
            AlertDialog.Builder builder = (AlertDialog.Builder) C0044.n(54142, null, new Object[]{new AlertDialog.Builder((MainActivity) C0048.n(6089, null, new Object[]{this})), Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 3431578)});
            StringBuilder sb = new StringBuilder();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0048.n(6089, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0041.n(19324, null, new Object[]{(String) C0047.n(98547, null, new Object[0])})).intValue() ^ (2131561560 ^ ((Integer) C0041.n(19324, null, new Object[]{(String) C0041.n(70823, null, new Object[0])})).intValue()))})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0048.n(6089, null, new Object[]{this})})});
        }
    }

    public static class x extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f48short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(8088908)}[0], new Object[0])).intValue() ^ 8088917];
            sArr[0] = 1090;
            sArr[1] = 1119;
            sArr[2] = 1042;
            sArr[3] = 1094;
            sArr[4] = 1088;
            sArr[5] = 1115;
            sArr[6] = 1119;
            sArr[7] = 1055;
            sArr[8] = 1105;
            sArr[9] = 1107;
            sArr[10] = 1105;
            sArr[11] = 1114;
            sArr[12] = 1111;
            sArr[13] = 1089;
            sArr[14] = 1042;
            sArr[15] = 1027;
            sArr[16] = 1026;
            sArr[17] = 1024;
            sArr[18] = 1030;
            sArr[19] = 1026;
            sArr[20] = 1026;
            sArr[21] = 1026;
            sArr[22] = 1141;
            sArr[23] = 1042;
            sArr[24] = 1044;
            f48short = sArr;
        }

        public /* synthetic */ x(i iVar) {
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0052.n(84044, (PrintStream) C0104.n(12888), new Object[]{Float.valueOf(((Float) C0052.n(71646, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0100.n(19071)})})).floatValue())});
            }
        }

        /* renamed from: ۥۗ⁤۠۠⁤ۧۢۖ⁤ۖ⁠۠ۢۨ⁣⁣ۖۢ⁣, reason: contains not printable characters */
        public static int m1199(Object obj) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥۣ۟ۖۢۨ۟ۤۖۧۤ⁣⁤۟۠ۡ⁤۟⁤⁤, reason: contains not printable characters */
        public static short[] m1200() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
                return (short[]) C0100.n(36706);
            }
            return null;
        }

        /* renamed from: ۥۨۖۢ⁣ۖ⁣ۢۥۗ⁣ۣ۟ۥۜ⁠ۥۥ⁤⁤, reason: contains not printable characters */
        public static String m1201(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            C0104.n(73601, null, new Object[]{(String) C0100.n(8860, null, new Object[]{(short[]) C0100.n(3369, null, new Object[0]), Integer.valueOf(((Integer) C0100.n(46793, null, new Object[]{(String) C0100.n(79051, null, new Object[0])})).intValue() ^ 1754534), Integer.valueOf(((Integer) C0100.n(46793, null, new Object[]{(String) C0084.n(78185, null, new Object[0])})).intValue() ^ 1747834), Integer.valueOf(((Integer) C0100.n(46793, null, new Object[]{(String) C0068.n(26273, null, new Object[0])})).intValue() ^ 1747789)})});
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(2133911543), new Integer(8033533)};
            MainActivity mainActivity = (MainActivity) C0100.n(30915, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0100.n(30915, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 4057076), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 8033532)});
            if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                C0052.n(84044, (PrintStream) C0104.n(12888), new Object[]{Float.valueOf(((Float) C0052.n(71646, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0100.n(64888)})})).floatValue())});
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0100.n(30915, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0100.n(46793, null, new Object[]{(String) C0053.n(29953, null, new Object[0])})).intValue() ^ 2132256686)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0100.n(30915, null, new Object[]{this})})});
            if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
                C0052.n(84044, (PrintStream) C0104.n(12888), new Object[]{Float.valueOf(((Float) C0052.n(71646, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0100.n(74285)})})).floatValue())});
            }
        }
    }

    public static class y extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f49short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(7409050)}[0], new Object[0])).intValue() ^ 7409042];
            sArr[0] = 1934;
            sArr[1] = 1932;
            sArr[2] = 1947;
            sArr[3] = 1926;
            sArr[4] = 1945;
            sArr[5] = 1926;
            sArr[6] = 1947;
            sArr[7] = 1942;
            f49short = sArr;
        }

        public /* synthetic */ y(i iVar) {
            if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0087.n(71232, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0100.n(57371)})})});
            }
        }

        /* renamed from: ۥۢ⁣ۥ۬۠⁠⁠۠ۖۥۥۢۥ⁤⁣⁣⁠۟⁤, reason: contains not printable characters */
        public static short[] m1202() {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (short[]) C0100.n(87376);
            }
            return null;
        }

        /* renamed from: ۥ⁠ۣۥ⁠۟ۥۥۖۖ⁠⁤⁠⁤۟ۖۖۖ⁠ۖ, reason: contains not printable characters */
        public static int m1203(Object obj) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() >= 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥ⁣⁤⁤ۥۖ⁤ۖ⁠⁤⁠⁣⁤ۢ۟⁤ۗ⁠⁣⁤, reason: contains not printable characters */
        public static String m1204(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            Integer num = new Integer(8261154);
            ActivityManager activityManager = (ActivityManager) C0069.n(57808, null, new Object[]{(MainActivity) C0100.n(10099, null, new Object[]{this}), (String) C0029.n(4660, null, new Object[]{(short[]) C0100.n(28252, null, new Object[0]), Integer.valueOf(((Integer) C0100.n(86900, null, new Object[]{(String) C0029.n(86060, null, new Object[0])})).intValue() ^ 1751716), Integer.valueOf(((Integer) C0100.n(86900, null, new Object[]{(String) C0029.n(5049, null, new Object[0])})).intValue() ^ 1746696), Integer.valueOf(1749198 ^ ((Integer) C0100.n(86900, null, new Object[]{(String) C0100.n(16063, null, new Object[0])})).intValue())})});
            if (activityManager == null) {
                return null;
            }
            Iterator it = (Iterator) C0029.n(32165, null, new Object[]{(List) C0029.n(97875, null, new Object[]{(PackageManager) C0029.n(8112, null, new Object[]{(MainActivity) C0100.n(10099, null, new Object[]{this})}), Integer.valueOf(((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 8261282)})});
            while (((Boolean) C0029.n(57387, null, new Object[]{it})).booleanValue()) {
                C0029.n(97693, null, new Object[]{activityManager, (String) C0029.n(56489, null, new Object[]{(ApplicationInfo) C0029.n(73276, null, new Object[]{it})})});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(2137381007), new Integer(4743287)};
            MainActivity mainActivity = (MainActivity) C0100.n(10099, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0100.n(10099, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 6871212), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 4743286)});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0100.n(10099, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0100.n(86900, null, new Object[]{(String) C0071.n(34455, null, new Object[0])})).intValue() ^ (R.string.abc_prepend_shortcut_label ^ ((Integer) C0100.n(86900, null, new Object[]{(String) C0058.n(76964, null, new Object[0])})).intValue()))})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0100.n(10099, null, new Object[]{this})})});
        }
    }

    public static class z extends AsyncTask<Void, Void, Void> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f50short;

        static {
            short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(3464098)}[0], new Object[0])).intValue() ^ 3463945];
            sArr[0] = 1639;
            sArr[1] = 1643;
            sArr[2] = 1574;
            sArr[3] = 1645;
            sArr[4] = 1647;
            sArr[5] = 1642;
            sArr[6] = 1642;
            sArr[7] = 1579;
            sArr[8] = 1639;
            sArr[9] = 1642;
            sArr[10] = 1642;
            sArr[11] = 1574;
            sArr[12] = 1597;
            sArr[13] = 1574;
            sArr[14] = 1654;
            sArr[15] = 1643;
            sArr[16] = 1574;
            sArr[17] = 1642;
            sArr[18] = 1647;
            sArr[19] = 1653;
            sArr[20] = 1650;
            sArr[21] = 1574;
            sArr[22] = 1654;
            sArr[23] = 1639;
            sArr[24] = 1637;
            sArr[25] = 1645;
            sArr[26] = 1639;
            sArr[27] = 1633;
            sArr[28] = 1635;
            sArr[29] = 1653;
            sArr[30] = 1574;
            sArr[31] = 1658;
            sArr[32] = 1574;
            sArr[33] = 1442;
            sArr[34] = 1509;
            sArr[35] = 1520;
            sArr[36] = 1511;
            sArr[37] = 1522;
            sArr[38] = 1442;
            sArr[39] = 1455;
            sArr[40] = 1524;
            sArr[41] = 1442;
            sArr[42] = 1505;
            sArr[43] = 1517;
            sArr[44] = 1519;
            sArr[45] = 1452;
            sArr[46] = 1520;
            sArr[47] = 1517;
            sArr[48] = 1517;
            sArr[49] = 1526;
            sArr[50] = 1515;
            sArr[51] = 1508;
            sArr[52] = 1531;
            sArr[53] = 1442;
            sArr[54] = 1534;
            sArr[55] = 1442;
            sArr[56] = 1766;
            sArr[57] = 1697;
            sArr[58] = 1716;
            sArr[59] = 1699;
            sArr[60] = 1718;
            sArr[61] = 1766;
            sArr[62] = 1771;
            sArr[63] = 1712;
            sArr[64] = 1766;
            sArr[65] = 1701;
            sArr[66] = 1705;
            sArr[67] = 1707;
            sArr[68] = 1768;
            sArr[69] = 1703;
            sArr[70] = 1704;
            sArr[71] = 1698;
            sArr[72] = 1716;
            sArr[73] = 1705;
            sArr[74] = 1711;
            sArr[75] = 1698;
            sArr[76] = 1768;
            sArr[77] = 1717;
            sArr[78] = 1727;
            sArr[79] = 1717;
            sArr[80] = 1714;
            sArr[81] = 1699;
            sArr[82] = 1707;
            sArr[83] = 1715;
            sArr[84] = 1711;
            sArr[85] = 1766;
            sArr[86] = 1722;
            sArr[87] = 1766;
            sArr[88] = 2744;
            sArr[89] = 2809;
            sArr[90] = 2799;
            sArr[91] = 2803;
            sArr[92] = 2744;
            sArr[93] = 2741;
            sArr[94] = 2782;
            sArr[95] = 2722;
            sArr[96] = 2744;
            sArr[97] = 2751;
            sArr[98] = 2787;
            sArr[99] = 2792;
            sArr[100] = 2794;
            sArr[101] = 2801;
            sArr[102] = 2806;
            sArr[103] = 2796;
            sArr[104] = 2744;
            sArr[105] = 2748;
            sArr[106] = 2730;
            sArr[107] = 2789;
            sArr[108] = 2751;
            sArr[109] = 2744;
            sArr[110] = 2788;
            sArr[111] = 2744;
            sArr[112] = 2799;
            sArr[113] = 2800;
            sArr[114] = 2801;
            sArr[115] = 2804;
            sArr[116] = 2813;
            sArr[117] = 2744;
            sArr[118] = 2794;
            sArr[119] = 2813;
            sArr[120] = 2809;
            sArr[121] = 2812;
            sArr[122] = 2744;
            sArr[123] = 2804;
            sArr[124] = 2806;
            sArr[125] = 2744;
            sArr[126] = 2723;
            sArr[127] = 2744;
            sArr[128] = 2812;
            sArr[129] = 2807;
            sArr[130] = 2744;
            sArr[131] = 782;
            sArr[132] = 837;
            sArr[133] = 839;
            sArr[134] = 834;
            sArr[135] = 834;
            sArr[136] = 847;
            sArr[137] = 834;
            sArr[138] = 834;
            sArr[139] = 782;
            sArr[140] = 778;
            sArr[141] = 834;
            sArr[142] = 832;
            sArr[143] = 782;
            sArr[144] = 796;
            sArr[145] = 784;
            sArr[146] = 782;
            sArr[147] = 769;
            sArr[148] = 842;
            sArr[149] = 843;
            sArr[150] = 856;
            sArr[151] = 769;
            sArr[152] = 832;
            sArr[153] = 859;
            sArr[154] = 834;
            sArr[155] = 834;
            sArr[156] = 782;
            sArr[157] = 789;
            sArr[158] = 782;
            sArr[159] = 842;
            sArr[160] = 833;
            sArr[161] = 832;
            sArr[162] = 843;
            sArr[163] = 1015;
            sArr[164] = 1013;
            sArr[165] = 994;
            sArr[166] = 1023;
            sArr[167] = 992;
            sArr[168] = 1023;
            sArr[169] = 994;
            sArr[170] = 1007;
            f50short = sArr;
        }

        public /* synthetic */ z(i iVar) {
            if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
                C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0029.n(62295)})})});
            }
        }

        /* renamed from: ۥۖۖۖۖ⁠ۥ⁣ۣ۬ۗۢ⁤⁠ۖۥ⁤⁠ۖۗ, reason: contains not printable characters */
        public static short[] m1205() {
            if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
                return (short[]) C0029.n(30218);
            }
            return null;
        }

        /* renamed from: ۥۖۜۖ⁣ۢ⁤ۣۖۧۖۥۗ⁣ۖۖ⁤ۖ⁤ۖ, reason: contains not printable characters */
        public static String m1206(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
                return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۜۧ⁠ۖ⁤⁤ۡ⁠۟ۢ⁤ۖ⁤ۥ⁤⁣⁤⁣ۖ, reason: contains not printable characters */
        public static String m1207(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        /* renamed from: ۥۣۣۤ۬ۥۣۖۖ۟ۜۧۤۢۖۖ⁣⁠⁤⁤, reason: contains not printable characters */
        public static int m1208(Object obj) {
            if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
                return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
            }
            return 0;
        }

        /* renamed from: ۥۥۧۖۖۥ⁤ۥ⁠⁤⁠⁤ۖۤۧ⁤ۥۣۖۨ, reason: contains not printable characters */
        public static String m1209(Object obj, int i, int i2, int i3) {
            if (((Integer) C0087.n(62526, null, new Object[0])).intValue() >= 0) {
                return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void[] voidArr) {
            Integer num = new Integer(1051144);
            StringBuilder sb = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0029.n(53742, null, new Object[]{(short[]) C0029.n(66891, null, new Object[0]), Integer.valueOf(((Integer) C0029.n(73115, null, new Object[]{(String) C0089.n(81584, null, new Object[0])})).intValue() ^ 1749757), Integer.valueOf(((Integer) C0029.n(73115, null, new Object[]{(String) C0033.n(34619, null, new Object[0])})).intValue() ^ 1749759), Integer.valueOf(((Integer) C0029.n(73115, null, new Object[]{(String) C0102.n(48192, null, new Object[0])})).intValue() ^ 55877)})});
            C0083.n(39709, null, new Object[]{sb, (String) C0096.n(48052, null, new Object[]{(MainActivity) C0029.n(54837, null, new Object[]{this})}), (String) C0049.n(50163, null, new Object[]{(short[]) C0029.n(66891, null, new Object[0]), Integer.valueOf(((Integer) C0029.n(73115, null, new Object[]{(String) C0051.n(26359, null, new Object[0])})).intValue() ^ 1750941), Integer.valueOf(((Integer) C0029.n(73115, null, new Object[]{(String) C0049.n(35490, null, new Object[0])})).intValue() ^ 1753515), Integer.valueOf(1748147 ^ ((Integer) C0029.n(73115, null, new Object[]{(String) C0049.n(93264, null, new Object[0])})).intValue())})});
            ActivityManager activityManager = (ActivityManager) C0069.n(57808, null, new Object[]{(MainActivity) C0029.n(54837, null, new Object[]{this}), (String) C0049.n(50163, null, new Object[]{(short[]) C0029.n(66891, null, new Object[0]), Integer.valueOf(((Integer) C0029.n(73115, null, new Object[]{(String) C0049.n(12745, null, new Object[0])})).intValue() ^ 1748491), Integer.valueOf(((Integer) C0029.n(73115, null, new Object[]{(String) C0049.n(49746, null, new Object[0])})).intValue() ^ 1748712), Integer.valueOf(1746152 ^ ((Integer) C0029.n(73115, null, new Object[]{(String) C0049.n(90676, null, new Object[0])})).intValue())})});
            if (activityManager == null) {
                return null;
            }
            Iterator it = (Iterator) C0029.n(32165, null, new Object[]{(List) C0029.n(97875, null, new Object[]{(PackageManager) C0029.n(8112, null, new Object[]{(MainActivity) C0029.n(54837, null, new Object[]{this})}), Integer.valueOf(((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 1051272)})});
            while (((Boolean) C0029.n(57387, null, new Object[]{it})).booleanValue()) {
                C0029.n(97693, null, new Object[]{activityManager, (String) C0029.n(56489, null, new Object[]{(ApplicationInfo) C0029.n(73276, null, new Object[]{it})})});
            }
            return null;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Void r12) {
            Object[] objArr = {new Integer(2138530045), new Integer(4395555)};
            MainActivity mainActivity = (MainActivity) C0029.n(54837, null, new Object[]{this});
            C0055.n(69313, null, new Object[]{mainActivity, (ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity})});
            MainActivity mainActivity2 = (MainActivity) C0029.n(54837, null, new Object[]{this});
            C0055.n(35870, null, new Object[]{mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 8020190), mainActivity2, Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 4395554)});
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            MainActivity mainActivity = (MainActivity) C0029.n(54837, null, new Object[]{this});
            C0091.n(86830, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{mainActivity}), (String) C0104.n(18661, null, new Object[]{mainActivity, Integer.valueOf(((Integer) C0029.n(73115, null, new Object[]{(String) C0049.n(77767, null, new Object[0])})).intValue() ^ 2132260442)})});
            C0055.n(24819, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{(MainActivity) C0029.n(54837, null, new Object[]{this})})});
        }
    }

    static {
        short[] sArr = new short[((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(3412994)}[0], new Object[0])).intValue() ^ 3412887];
        sArr[0] = 2431;
        sArr[1] = 2750;
        sArr[2] = 2741;
        sArr[3] = 2724;
        sArr[4] = 2727;
        sArr[5] = 2751;
        sArr[6] = 2722;
        sArr[7] = 2747;
        sArr[8] = 2797;
        sArr[9] = 2731;
        sArr[10] = 2039;
        sArr[11] = 640;
        sArr[12] = 640;
        sArr[13] = 666;
        sArr[14] = 663;
        sArr[15] = 718;
        sArr[16] = 699;
        sArr[17] = 699;
        sArr[18] = 673;
        sArr[19] = 684;
        sArr[20] = 1848;
        sArr[21] = 1815;
        sArr[22] = 1819;
        sArr[23] = 1811;
        sArr[24] = 2917;
        sArr[25] = 2918;
        sArr[26] = 2942;
        sArr[27] = 2856;
        sArr[28] = 2133;
        sArr[29] = 2134;
        sArr[30] = 2126;
        sArr[31] = 655;
        sArr[32] = 702;
        sArr[33] = 684;
        sArr[34] = 684;
        sArr[35] = 680;
        sArr[36] = 688;
        sArr[37] = 685;
        sArr[38] = 699;
        sArr[39] = 1864;
        sArr[40] = 1862;
        sArr[41] = 1882;
        sArr[42] = 1916;
        sArr[43] = 1870;
        sArr[44] = 1860;
        sArr[45] = 1870;
        sArr[46] = 1879;
        sArr[47] = 1822;
        sArr[48] = 2424;
        sArr[49] = 2422;
        sArr[50] = 2410;
        sArr[51] = 2380;
        sArr[52] = 2430;
        sArr[53] = 2420;
        sArr[54] = 2430;
        sArr[55] = 2407;
        sArr[56] = 1426;
        sArr[57] = 1465;
        sArr[58] = 1460;
        sArr[59] = 1445;
        sArr[60] = 1454;
        sArr[61] = 1447;
        sArr[62] = 1443;
        sArr[63] = 1470;
        sArr[64] = 1464;
        sArr[65] = 1465;
        sArr[66] = 1517;
        sArr[67] = 1473;
        sArr[68] = 1472;
        sArr[69] = 1480;
        sArr[70] = 1479;
        sArr[71] = 1481;
        sArr[72] = 1509;
        sArr[73] = 1483;
        sArr[74] = 1495;
        sArr[75] = 3062;
        sArr[76] = 3057;
        sArr[77] = 3040;
        sArr[78] = 3070;
        sArr[79] = 3057;
        sArr[80] = 3058;
        sArr[81] = 3050;
        sArr[82] = 2509;
        sArr[83] = 2509;
        sArr[84] = 2519;
        sArr[85] = 2522;
        sArr[86] = 1239;
        sArr[87] = 1171;
        sArr[88] = 1212;
        sArr[89] = 1200;
        sArr[90] = 1208;
        sArr[91] = 1277;
        sArr[92] = 1248;
        sArr[93] = 1277;
        sArr[94] = 2212;
        sArr[95] = 2297;
        sArr[96] = 2248;
        sArr[97] = 2266;
        sArr[98] = 2266;
        sArr[99] = 2270;
        sArr[100] = 2246;
        sArr[101] = 2267;
        sArr[102] = 2253;
        sArr[103] = 2185;
        sArr[104] = 2196;
        sArr[105] = 2185;
        sArr[106] = 2279;
        sArr[107] = 2278;
        sArr[108] = 2279;
        sArr[109] = 2284;
        sArr[110] = 3164;
        sArr[111] = 3198;
        sArr[112] = 3177;
        sArr[113] = 3167;
        sArr[114] = 3172;
        sArr[115] = 3181;
        sArr[116] = 3198;
        sArr[117] = 3177;
        sArr[118] = 3176;
        sArr[119] = 3143;
        sArr[120] = 3177;
        sArr[121] = 3189;
        sArr[122] = 801;
        sArr[123] = 784;
        sArr[124] = 770;
        sArr[125] = 770;
        sArr[126] = 774;
        sArr[127] = 798;
        sArr[128] = 771;
        sArr[129] = 789;
        sArr[130] = 849;
        sArr[131] = 844;
        sArr[132] = 849;
        sArr[133] = 1484;
        sArr[134] = 1494;
        sArr[135] = 1484;
        sArr[136] = 2241;
        sArr[137] = 2270;
        sArr[138] = 2263;
        sArr[139] = 2266;
        sArr[140] = 2241;
        sArr[141] = 2195;
        sArr[142] = 2196;
        sArr[143] = 1147;
        sArr[144] = 1021;
        sArr[145] = 1020;
        sArr[146] = 1006;
        sArr[147] = 901;
        sArr[148] = 912;
        sArr[149] = 2687;
        sArr[150] = 2625;
        sArr[151] = 2638;
        sArr[152] = 2625;
        sArr[153] = 2667;
        sArr[154] = 2631;
        sArr[155] = 2630;
        sArr[156] = 2638;
        sArr[157] = 2625;
        sArr[158] = 2639;
        sArr[159] = 2653;
        sArr[160] = 2650;
        sArr[161] = 2633;
        sArr[162] = 2652;
        sArr[163] = 2625;
        sArr[164] = 2631;
        sArr[165] = 2630;
        sArr[166] = 2140;
        sArr[167] = 2138;
        sArr[168] = 2082;
        sArr[169] = 2104;
        sArr[170] = 2166;
        sArr[171] = 2127;
        sArr[172] = 2161;
        sArr[173] = 2174;
        sArr[174] = 2161;
        sArr[175] = 2139;
        sArr[176] = 2167;
        sArr[177] = 2166;
        sArr[178] = 2174;
        sArr[179] = 2161;
        sArr[180] = 2175;
        sArr[181] = 2104;
        sArr[182] = 2164;
        sArr[183] = 2173;
        sArr[184] = 2166;
        sArr[185] = 2175;
        sArr[186] = 2156;
        sArr[187] = 2160;
        sArr[188] = 2104;
        sArr[189] = 2085;
        sArr[190] = 2104;
        sArr[191] = 851;
        sArr[192] = 849;
        sArr[193] = 852;
        sArr[194] = 852;
        sArr[195] = 857;
        sArr[196] = 852;
        sArr[197] = 852;
        sArr[198] = 792;
        sArr[199] = 843;
        sArr[200] = 833;
        sArr[201] = 843;
        sArr[202] = 844;
        sArr[203] = 861;
        sArr[204] = 853;
        sArr[205] = 871;
        sArr[206] = 843;
        sArr[207] = 861;
        sArr[208] = 842;
        sArr[209] = 846;
        sArr[210] = 861;
        sArr[211] = 842;
        sArr[212] = 792;
        sArr[213] = 798;
        sArr[214] = 2304;
        sArr[215] = 2327;
        sArr[216] = 2320;
        sArr[217] = 2333;
        sArr[218] = 2333;
        sArr[219] = 2310;
        sArr[220] = 2386;
        sArr[221] = 2304;
        sArr[222] = 2327;
        sArr[223] = 2321;
        sArr[224] = 2333;
        sArr[225] = 2308;
        sArr[226] = 2327;
        sArr[227] = 2304;
        sArr[228] = 2315;
        sArr[229] = 2386;
        sArr[230] = 2388;
        sArr[231] = 2760;
        sArr[232] = 2783;
        sArr[233] = 2776;
        sArr[234] = 2773;
        sArr[235] = 2773;
        sArr[236] = 2766;
        sArr[237] = 2714;
        sArr[238] = 2776;
        sArr[239] = 2773;
        sArr[240] = 2773;
        sArr[241] = 2766;
        sArr[242] = 2774;
        sArr[243] = 2773;
        sArr[244] = 2779;
        sArr[245] = 2782;
        sArr[246] = 2783;
        sArr[247] = 2760;
        sArr[248] = 2714;
        sArr[249] = 2716;
        sArr[250] = 1561;
        sArr[251] = 1551;
        sArr[252] = 1566;
        sArr[253] = 1562;
        sArr[254] = 1560;
        sArr[255] = 1541;
        sArr[256] = 1562;
        sArr[257] = 1610;
        sArr[258] = 1562;
        sArr[259] = 1551;
        sArr[260] = 1560;
        sArr[261] = 1561;
        sArr[262] = 1539;
        sArr[263] = 1561;
        sArr[264] = 1566;
        sArr[265] = 1604;
        sArr[266] = 1561;
        sArr[267] = 1555;
        sArr[268] = 1561;
        sArr[269] = 1604;
        sArr[270] = 1561;
        sArr[271] = 1547;
        sArr[272] = 1548;
        sArr[273] = 1551;
        sArr[274] = 1543;
        sArr[275] = 1541;
        sArr[276] = 1550;
        sArr[277] = 1551;
        sArr[278] = 1610;
        sArr[279] = 1627;
        sArr[280] = 1610;
        sArr[281] = 1558;
        sArr[282] = 1610;
        sArr[283] = 1560;
        sArr[284] = 1551;
        sArr[285] = 1544;
        sArr[286] = 1541;
        sArr[287] = 1541;
        sArr[288] = 1566;
        sArr[289] = 1610;
        sArr[290] = 1612;
        sArr[291] = 712;
        sArr[292] = 735;
        sArr[293] = 728;
        sArr[294] = 725;
        sArr[295] = 725;
        sArr[296] = 718;
        sArr[297] = 666;
        sArr[298] = 668;
        sArr[299] = 1356;
        sArr[300] = 1371;
        sArr[301] = 1372;
        sArr[302] = 1361;
        sArr[303] = 1361;
        sArr[304] = 1354;
        sArr[305] = 1310;
        sArr[306] = 1299;
        sArr[307] = 1358;
        sArr[308] = 1310;
        sArr[309] = 1304;
        sArr[310] = 1665;
        sArr[311] = 1670;
        sArr[312] = 1693;
        sArr[313] = 1666;
        sArr[314] = 1746;
        sArr[315] = 1695;
        sArr[316] = 1666;
        sArr[317] = 1686;
        sArr[318] = 1687;
        sArr[319] = 1681;
        sArr[320] = 1691;
        sArr[321] = 1665;
        sArr[322] = 1691;
        sArr[323] = 1693;
        sArr[324] = 1692;
        sArr[325] = 1746;
        sArr[326] = 1737;
        sArr[327] = 1746;
        sArr[328] = 642;
        sArr[329] = 705;
        sArr[330] = 714;
        sArr[331] = 719;
        sArr[332] = 717;
        sArr[333] = 710;
        sArr[334] = 642;
        sArr[335] = 660;
        sArr[336] = 660;
        sArr[337] = 662;
        sArr[338] = 642;
        sArr[339] = 653;
        sArr[340] = 721;
        sArr[341] = 731;
        sArr[342] = 721;
        sArr[343] = 653;
        sArr[344] = 710;
        sArr[345] = 711;
        sArr[346] = 724;
        sArr[347] = 715;
        sArr[348] = 705;
        sArr[349] = 711;
        sArr[350] = 721;
        sArr[351] = 653;
        sArr[352] = 721;
        sArr[353] = 731;
        sArr[354] = 721;
        sArr[355] = 726;
        sArr[356] = 711;
        sArr[357] = 719;
        sArr[358] = 653;
        sArr[359] = 705;
        sArr[360] = 722;
        sArr[361] = 727;
        sArr[362] = 653;
        sArr[363] = 705;
        sArr[364] = 722;
        sArr[365] = 727;
        sArr[366] = 3244;
        sArr[367] = 3308;
        sArr[368] = 3309;
        sArr[369] = 3311;
        sArr[370] = 3306;
        sArr[371] = 3309;
        sArr[372] = 3302;
        sArr[373] = 3235;
        sArr[374] = 3256;
        sArr[375] = 3235;
        sArr[376] = 450;
        sArr[377] = 391;
        sArr[378] = 385;
        sArr[379] = 394;
        sArr[380] = 397;
        sArr[381] = 450;
        sArr[382] = 467;
        sArr[383] = 450;
        sArr[384] = 476;
        sArr[385] = 450;
        sArr[386] = 461;
        sArr[387] = 401;
        sArr[388] = 411;
        sArr[389] = 401;
        sArr[390] = 461;
        sArr[391] = 390;
        sArr[392] = 391;
        sArr[393] = 404;
        sArr[394] = 395;
        sArr[395] = 385;
        sArr[396] = 391;
        sArr[397] = 401;
        sArr[398] = 461;
        sArr[399] = 401;
        sArr[400] = 411;
        sArr[401] = 401;
        sArr[402] = 406;
        sArr[403] = 391;
        sArr[404] = 399;
        sArr[405] = 461;
        sArr[406] = 385;
        sArr[407] = 402;
        sArr[408] = 407;
        sArr[409] = 461;
        sArr[410] = 385;
        sArr[411] = 402;
        sArr[412] = 407;
        sArr[413] = 654;
        sArr[414] = 718;
        sArr[415] = 719;
        sArr[416] = 717;
        sArr[417] = 712;
        sArr[418] = 719;
        sArr[419] = 708;
        sArr[420] = 641;
        sArr[421] = 666;
        sArr[422] = 641;
        sArr[423] = 722;
        sArr[424] = 725;
        sArr[425] = 704;
        sArr[426] = 723;
        sArr[427] = 725;
        sArr[428] = 641;
        sArr[429] = 716;
        sArr[430] = 721;
        sArr[431] = 709;
        sArr[432] = 708;
        sArr[433] = 706;
        sArr[434] = 712;
        sArr[435] = 722;
        sArr[436] = 712;
        sArr[437] = 718;
        sArr[438] = 719;
        sArr[439] = 641;
        sArr[440] = 666;
        sArr[441] = 1331;
        sArr[442] = 1321;
        sArr[443] = 1320;
        sArr[444] = 1324;
        sArr[445] = 1321;
        sArr[446] = 1320;
        sArr[447] = 1398;
        sArr[448] = 2150;
        sArr[449] = 2145;
        sArr[450] = 2170;
        sArr[451] = 2149;
        sArr[452] = 2101;
        sArr[453] = 2168;
        sArr[454] = 2149;
        sArr[455] = 2161;
        sArr[456] = 2160;
        sArr[457] = 2166;
        sArr[458] = 2172;
        sArr[459] = 2150;
        sArr[460] = 2172;
        sArr[461] = 2170;
        sArr[462] = 2171;
        sArr[463] = 2101;
        sArr[464] = 2094;
        sArr[465] = 2101;
        sArr[466] = 2400;
        sArr[467] = 2339;
        sArr[468] = 2344;
        sArr[469] = 2349;
        sArr[470] = 2351;
        sArr[471] = 2340;
        sArr[472] = 2400;
        sArr[473] = 2422;
        sArr[474] = 2422;
        sArr[475] = 2420;
        sArr[476] = 2400;
        sArr[477] = 2415;
        sArr[478] = 2355;
        sArr[479] = 2361;
        sArr[480] = 2355;
        sArr[481] = 2415;
        sArr[482] = 2340;
        sArr[483] = 2341;
        sArr[484] = 2358;
        sArr[485] = 2345;
        sArr[486] = 2339;
        sArr[487] = 2341;
        sArr[488] = 2355;
        sArr[489] = 2415;
        sArr[490] = 2355;
        sArr[491] = 2361;
        sArr[492] = 2355;
        sArr[493] = 2356;
        sArr[494] = 2341;
        sArr[495] = 2349;
        sArr[496] = 2415;
        sArr[497] = 2339;
        sArr[498] = 2352;
        sArr[499] = 2357;
        sArr[500] = 2415;
        sArr[501] = 2339;
        sArr[502] = 2352;
        sArr[503] = 2357;
        sArr[504] = 1798;
        sArr[505] = 1862;
        sArr[506] = 1863;
        sArr[507] = 1861;
        sArr[508] = 1856;
        sArr[509] = 1863;
        sArr[510] = 1868;
        sArr[511] = 1801;
        sArr[512] = 1810;
        sArr[513] = 1801;
        sArr[514] = 2723;
        sArr[515] = 2790;
        sArr[516] = 2784;
        sArr[517] = 2795;
        sArr[518] = 2796;
        sArr[519] = 2723;
        sArr[520] = 2739;
        sArr[521] = 2723;
        sArr[522] = 2749;
        sArr[523] = 2723;
        sArr[524] = 2732;
        sArr[525] = 2800;
        sArr[526] = 2810;
        sArr[527] = 2800;
        sArr[528] = 2732;
        sArr[529] = 2791;
        sArr[530] = 2790;
        sArr[531] = 2805;
        sArr[532] = 2794;
        sArr[533] = 2784;
        sArr[534] = 2790;
        sArr[535] = 2800;
        sArr[536] = 2732;
        sArr[537] = 2800;
        sArr[538] = 2810;
        sArr[539] = 2800;
        sArr[540] = 2807;
        sArr[541] = 2790;
        sArr[542] = 2798;
        sArr[543] = 2732;
        sArr[544] = 2784;
        sArr[545] = 2803;
        sArr[546] = 2806;
        sArr[547] = 2732;
        sArr[548] = 2784;
        sArr[549] = 2803;
        sArr[550] = 2806;
        sArr[551] = 1235;
        sArr[552] = 1168;
        sArr[553] = 1179;
        sArr[554] = 1182;
        sArr[555] = 1180;
        sArr[556] = 1175;
        sArr[557] = 1235;
        sArr[558] = 1223;
        sArr[559] = 1223;
        sArr[560] = 1223;
        sArr[561] = 1235;
        sArr[562] = 1244;
        sArr[563] = 1152;
        sArr[564] = 1162;
        sArr[565] = 1152;
        sArr[566] = 1244;
        sArr[567] = 1175;
        sArr[568] = 1174;
        sArr[569] = 1157;
        sArr[570] = 1178;
        sArr[571] = 1168;
        sArr[572] = 1174;
        sArr[573] = 1152;
        sArr[574] = 1244;
        sArr[575] = 1152;
        sArr[576] = 1162;
        sArr[577] = 1152;
        sArr[578] = 1159;
        sArr[579] = 1174;
        sArr[580] = 1182;
        sArr[581] = 1244;
        sArr[582] = 1168;
        sArr[583] = 1155;
        sArr[584] = 1158;
        sArr[585] = 1244;
        sArr[586] = 1168;
        sArr[587] = 1155;
        sArr[588] = 1158;
        sArr[589] = 1345;
        sArr[590] = 1281;
        sArr[591] = 1280;
        sArr[592] = 1282;
        sArr[593] = 1287;
        sArr[594] = 1280;
        sArr[595] = 1291;
        sArr[596] = 1358;
        sArr[597] = 1365;
        sArr[598] = 1358;
        sArr[599] = 1309;
        sArr[600] = 1306;
        sArr[601] = 1295;
        sArr[602] = 1308;
        sArr[603] = 1306;
        sArr[604] = 1358;
        sArr[605] = 1283;
        sArr[606] = 1310;
        sArr[607] = 1290;
        sArr[608] = 1291;
        sArr[609] = 1293;
        sArr[610] = 1287;
        sArr[611] = 1309;
        sArr[612] = 1287;
        sArr[613] = 1281;
        sArr[614] = 1280;
        sArr[615] = 1358;
        sArr[616] = 1365;
        sArr[617] = 983;
        sArr[618] = 984;
        sArr[619] = 978;
        sArr[620] = 964;
        sArr[621] = 985;
        sArr[622] = 991;
        sArr[623] = 978;
        sArr[624] = 920;
        sArr[625] = 966;
        sArr[626] = 979;
        sArr[627] = 964;
        sArr[628] = 987;
        sArr[629] = 991;
        sArr[630] = 965;
        sArr[631] = 965;
        sArr[632] = 991;
        sArr[633] = 985;
        sArr[634] = 984;
        sArr[635] = 920;
        sArr[636] = 993;
        sArr[637] = 996;
        sArr[638] = 1023;
        sArr[639] = 994;
        sArr[640] = 1011;
        sArr[641] = 1001;
        sArr[642] = 1011;
        sArr[643] = 1006;
        sArr[644] = 994;
        sArr[645] = 1011;
        sArr[646] = 996;
        sArr[647] = 1016;
        sArr[648] = 1015;
        sArr[649] = 1018;
        sArr[650] = 1001;
        sArr[651] = 997;
        sArr[652] = 994;
        sArr[653] = 1017;
        sArr[654] = 996;
        sArr[655] = 1015;
        sArr[656] = 1009;
        sArr[657] = 1011;
        sArr[658] = 1412;
        sArr[659] = 1443;
        sArr[660] = 1464;
        sArr[661] = 1445;
        sArr[662] = 1462;
        sArr[663] = 1456;
        sArr[664] = 1458;
        sArr[665] = 1527;
        sArr[666] = 1447;
        sArr[667] = 1458;
        sArr[668] = 1445;
        sArr[669] = 1466;
        sArr[670] = 1470;
        sArr[671] = 1444;
        sArr[672] = 1444;
        sArr[673] = 1470;
        sArr[674] = 1464;
        sArr[675] = 1465;
        sArr[676] = 2938;
        sArr[677] = 2886;
        sArr[678] = 2895;
        sArr[679] = 2891;
        sArr[680] = 2905;
        sArr[681] = 2895;
        sArr[682] = 2826;
        sArr[683] = 2893;
        sArr[684] = 2904;
        sArr[685] = 2891;
        sArr[686] = 2884;
        sArr[687] = 2910;
        sArr[688] = 2826;
        sArr[689] = 2905;
        sArr[690] = 2910;
        sArr[691] = 2885;
        sArr[692] = 2904;
        sArr[693] = 2891;
        sArr[694] = 2893;
        sArr[695] = 2895;
        sArr[696] = 2826;
        sArr[697] = 2891;
        sArr[698] = 2889;
        sArr[699] = 2889;
        sArr[700] = 2895;
        sArr[701] = 2905;
        sArr[702] = 2905;
        sArr[703] = 2826;
        sArr[704] = 2910;
        sArr[705] = 2885;
        sArr[706] = 2826;
        sArr[707] = 2936;
        sArr[708] = 2885;
        sArr[709] = 2885;
        sArr[710] = 2910;
        sArr[711] = 2883;
        sArr[712] = 2892;
        sArr[713] = 2899;
        sArr[714] = 2826;
        sArr[715] = 2910;
        sArr[716] = 2885;
        sArr[717] = 2826;
        sArr[718] = 2894;
        sArr[719] = 2895;
        sArr[720] = 2886;
        sArr[721] = 2895;
        sArr[722] = 2910;
        sArr[723] = 2895;
        sArr[724] = 2826;
        sArr[725] = 2895;
        sArr[726] = 2887;
        sArr[727] = 2906;
        sArr[728] = 2910;
        sArr[729] = 2899;
        sArr[730] = 2826;
        sArr[731] = 2892;
        sArr[732] = 2885;
        sArr[733] = 2886;
        sArr[734] = 2894;
        sArr[735] = 2895;
        sArr[736] = 2904;
        sArr[737] = 2905;
        sArr[738] = 2826;
        sArr[739] = 2895;
        sArr[740] = 2886;
        sArr[741] = 2905;
        sArr[742] = 2895;
        sArr[743] = 2826;
        sArr[744] = 2905;
        sArr[745] = 2895;
        sArr[746] = 2886;
        sArr[747] = 2895;
        sArr[748] = 2889;
        sArr[749] = 2910;
        sArr[750] = 2826;
        sArr[751] = 2891;
        sArr[752] = 2886;
        sArr[753] = 2910;
        sArr[754] = 2895;
        sArr[755] = 2904;
        sArr[756] = 2884;
        sArr[757] = 2891;
        sArr[758] = 2910;
        sArr[759] = 2883;
        sArr[760] = 2908;
        sArr[761] = 2895;
        sArr[762] = 2826;
        sArr[763] = 2910;
        sArr[764] = 2885;
        sArr[765] = 2826;
        sArr[766] = 2894;
        sArr[767] = 2895;
        sArr[768] = 2886;
        sArr[769] = 2895;
        sArr[770] = 2910;
        sArr[771] = 2895;
        sArr[772] = 2826;
        sArr[773] = 2895;
        sArr[774] = 2887;
        sArr[775] = 2906;
        sArr[776] = 2910;
        sArr[777] = 2899;
        sArr[778] = 2826;
        sArr[779] = 2892;
        sArr[780] = 2885;
        sArr[781] = 2886;
        sArr[782] = 2894;
        sArr[783] = 2895;
        sArr[784] = 2904;
        sArr[785] = 2905;
        sArr[786] = 2826;
        sArr[787] = 2909;
        sArr[788] = 2883;
        sArr[789] = 2910;
        sArr[790] = 2882;
        sArr[791] = 2826;
        sArr[792] = 2919;
        sArr[793] = 2885;
        sArr[794] = 2894;
        sArr[795] = 2895;
        sArr[796] = 2826;
        sArr[797] = 2843;
        sArr[798] = 2820;
        sArr[799] = 821;
        sArr[800] = 792;
        sArr[801] = 768;
        sArr[802] = 785;
        sArr[803] = 774;
        sArr[804] = 794;
        sArr[805] = 789;
        sArr[806] = 768;
        sArr[807] = 797;
        sArr[808] = 770;
        sArr[809] = 785;
        sArr[810] = 3013;
        sArr[811] = 3056;
        sArr[812] = 3043;
        sArr[813] = 3052;
        sArr[814] = 3062;
        sArr[815] = 1794;
        sArr[816] = 1857;
        sArr[817] = 1866;
        sArr[818] = 1871;
        sArr[819] = 1869;
        sArr[820] = 1862;
        sArr[821] = 1794;
        sArr[822] = 1814;
        sArr[823] = 1814;
        sArr[824] = 1814;
        sArr[825] = 1794;
        sArr[826] = 1805;
        sArr[827] = 1873;
        sArr[828] = 1883;
        sArr[829] = 1873;
        sArr[830] = 1805;
        sArr[831] = 1862;
        sArr[832] = 1863;
        sArr[833] = 1876;
        sArr[834] = 1867;
        sArr[835] = 1857;
        sArr[836] = 1863;
        sArr[837] = 1873;
        sArr[838] = 1805;
        sArr[839] = 1873;
        sArr[840] = 1883;
        sArr[841] = 1873;
        sArr[842] = 1878;
        sArr[843] = 1863;
        sArr[844] = 1871;
        sArr[845] = 1805;
        sArr[846] = 1857;
        sArr[847] = 1874;
        sArr[848] = 1879;
        sArr[849] = 1805;
        sArr[850] = 1873;
        sArr[851] = 1857;
        sArr[852] = 1866;
        sArr[853] = 1863;
        sArr[854] = 1862;
        sArr[855] = 1917;
        sArr[856] = 1871;
        sArr[857] = 1857;
        sArr[858] = 1917;
        sArr[859] = 1874;
        sArr[860] = 1869;
        sArr[861] = 1877;
        sArr[862] = 1863;
        sArr[863] = 1872;
        sArr[864] = 1917;
        sArr[865] = 1873;
        sArr[866] = 1859;
        sArr[867] = 1876;
        sArr[868] = 1867;
        sArr[869] = 1868;
        sArr[870] = 1861;
        sArr[871] = 1873;
        sArr[872] = 2071;
        sArr[873] = 2132;
        sArr[874] = 2143;
        sArr[875] = 2138;
        sArr[876] = 2136;
        sArr[877] = 2131;
        sArr[878] = 2071;
        sArr[879] = 2049;
        sArr[880] = 2051;
        sArr[881] = 2051;
        sArr[882] = 2071;
        sArr[883] = 2072;
        sArr[884] = 2116;
        sArr[885] = 2126;
        sArr[886] = 2116;
        sArr[887] = 2072;
        sArr[888] = 2131;
        sArr[889] = 2130;
        sArr[890] = 2113;
        sArr[891] = 2142;
        sArr[892] = 2132;
        sArr[893] = 2130;
        sArr[894] = 2116;
        sArr[895] = 2072;
        sArr[896] = 2116;
        sArr[897] = 2126;
        sArr[898] = 2116;
        sArr[899] = 2115;
        sArr[900] = 2130;
        sArr[901] = 2138;
        sArr[902] = 2072;
        sArr[903] = 2132;
        sArr[904] = 2119;
        sArr[905] = 2114;
        sArr[906] = 2072;
        sArr[907] = 2116;
        sArr[908] = 2132;
        sArr[909] = 2143;
        sArr[910] = 2130;
        sArr[911] = 2131;
        sArr[912] = 2152;
        sArr[913] = 2138;
        sArr[914] = 2132;
        sArr[915] = 2152;
        sArr[916] = 2119;
        sArr[917] = 2136;
        sArr[918] = 2112;
        sArr[919] = 2130;
        sArr[920] = 2117;
        sArr[921] = 2152;
        sArr[922] = 2116;
        sArr[923] = 2134;
        sArr[924] = 2113;
        sArr[925] = 2142;
        sArr[926] = 2137;
        sArr[927] = 2128;
        sArr[928] = 2116;
        sArr[929] = 2071;
        sArr[930] = 2060;
        sArr[931] = 2071;
        sArr[932] = 1792;
        sArr[933] = 1861;
        sArr[934] = 1859;
        sArr[935] = 1864;
        sArr[936] = 1871;
        sArr[937] = 1792;
        sArr[938] = 1810;
        sArr[939] = 1792;
        sArr[940] = 1822;
        sArr[941] = 1792;
        sArr[942] = 1807;
        sArr[943] = 1875;
        sArr[944] = 1881;
        sArr[945] = 1875;
        sArr[946] = 1807;
        sArr[947] = 1860;
        sArr[948] = 1861;
        sArr[949] = 1878;
        sArr[950] = 1865;
        sArr[951] = 1859;
        sArr[952] = 1861;
        sArr[953] = 1875;
        sArr[954] = 1807;
        sArr[955] = 1875;
        sArr[956] = 1881;
        sArr[957] = 1875;
        sArr[958] = 1876;
        sArr[959] = 1861;
        sArr[960] = 1869;
        sArr[961] = 1807;
        sArr[962] = 1859;
        sArr[963] = 1872;
        sArr[964] = 1877;
        sArr[965] = 1807;
        sArr[966] = 1875;
        sArr[967] = 1859;
        sArr[968] = 1864;
        sArr[969] = 1861;
        sArr[970] = 1860;
        sArr[971] = 1919;
        sArr[972] = 1869;
        sArr[973] = 1859;
        sArr[974] = 1919;
        sArr[975] = 1872;
        sArr[976] = 1871;
        sArr[977] = 1879;
        sArr[978] = 1861;
        sArr[979] = 1874;
        sArr[980] = 1919;
        sArr[981] = 1875;
        sArr[982] = 1857;
        sArr[983] = 1878;
        sArr[984] = 1865;
        sArr[985] = 1870;
        sArr[986] = 1863;
        sArr[987] = 1875;
        sArr[988] = 1792;
        sArr[989] = 1819;
        sArr[990] = 1792;
        sArr[991] = 1883;
        sArr[992] = 1822;
        sArr[993] = 1816;
        sArr[994] = 1811;
        sArr[995] = 1812;
        sArr[996] = 1883;
        sArr[997] = 1867;
        sArr[998] = 1883;
        sArr[999] = 1861;
        sArr[1000] = 1883;
        sArr[1001] = 1876;
        sArr[1002] = 1800;
        sArr[1003] = 1794;
        sArr[1004] = 1800;
        sArr[1005] = 1876;
        sArr[1006] = 1823;
        sArr[1007] = 1822;
        sArr[1008] = 1805;
        sArr[1009] = 1810;
        sArr[1010] = 1816;
        sArr[1011] = 1822;
        sArr[1012] = 1800;
        sArr[1013] = 1876;
        sArr[1014] = 1800;
        sArr[1015] = 1794;
        sArr[1016] = 1800;
        sArr[1017] = 1807;
        sArr[1018] = 1822;
        sArr[1019] = 1814;
        sArr[1020] = 1876;
        sArr[1021] = 1816;
        sArr[1022] = 1803;
        sArr[1023] = 1806;
        sArr[1024] = 1876;
        sArr[1025] = 1800;
        sArr[1026] = 1816;
        sArr[1027] = 1811;
        sArr[1028] = 1822;
        sArr[1029] = 1823;
        sArr[1030] = 1828;
        sArr[1031] = 1814;
        sArr[1032] = 1816;
        sArr[1033] = 1828;
        sArr[1034] = 1803;
        sArr[1035] = 1812;
        sArr[1036] = 1804;
        sArr[1037] = 1822;
        sArr[1038] = 1801;
        sArr[1039] = 1828;
        sArr[1040] = 1800;
        sArr[1041] = 1818;
        sArr[1042] = 1805;
        sArr[1043] = 1810;
        sArr[1044] = 1813;
        sArr[1045] = 1820;
        sArr[1046] = 1800;
        sArr[1047] = 1883;
        sArr[1048] = 1856;
        sArr[1049] = 1883;
        sArr[1050] = 917;
        sArr[1051] = 969;
        sArr[1052] = 963;
        sArr[1053] = 969;
        sArr[1054] = 917;
        sArr[1055] = 990;
        sArr[1056] = 991;
        sArr[1057] = 972;
        sArr[1058] = 979;
        sArr[1059] = 985;
        sArr[1060] = 991;
        sArr[1061] = 969;
        sArr[1062] = 917;
        sArr[1063] = 969;
        sArr[1064] = 963;
        sArr[1065] = 969;
        sArr[1066] = 974;
        sArr[1067] = 991;
        sArr[1068] = 983;
        sArr[1069] = 917;
        sArr[1070] = 985;
        sArr[1071] = 970;
        sArr[1072] = 975;
        sArr[1073] = 917;
        sArr[1074] = 985;
        sArr[1075] = 970;
        sArr[1076] = 975;
        sArr[1077] = 2559;
        sArr[1078] = 2187;
        sArr[1079] = 2187;
        sArr[1080] = 2187;
        sArr[1081] = 2187;
        sArr[1082] = 2187;
        sArr[1083] = 2184;
        sArr[1084] = 2277;
        sArr[1085] = 2247;
        sArr[1086] = 2266;
        sArr[1087] = 2253;
        sArr[1088] = 2184;
        sArr[1089] = 2268;
        sArr[1090] = 2240;
        sArr[1091] = 2249;
        sArr[1092] = 2246;
        sArr[1093] = 2184;
        sArr[1094] = 2201;
        sArr[1095] = 2200;
        sArr[1096] = 2184;
        sArr[1097] = 2283;
        sArr[1098] = 2296;
        sArr[1099] = 2301;
        sArr[1100] = 2184;
        sArr[1101] = 2251;
        sArr[1102] = 2247;
        sArr[1103] = 2266;
        sArr[1104] = 2253;
        sArr[1105] = 2180;
        sArr[1106] = 2184;
        sArr[1107] = 2246;
        sArr[1108] = 2253;
        sArr[1109] = 2271;
        sArr[1110] = 2184;
        sArr[1111] = 2283;
        sArr[1112] = 2281;
        sArr[1113] = 2299;
        sArr[1114] = 2285;
        sArr[1115] = 2184;
        sArr[1116] = 2187;
        sArr[1117] = 2187;
        sArr[1118] = 2187;
        sArr[1119] = 2187;
        sArr[1120] = 2187;
        sArr[1121] = 3222;
        sArr[1122] = 3200;
        sArr[1123] = 3206;
        sArr[1124] = 3210;
        sArr[1125] = 3211;
        sArr[1126] = 3201;
        sArr[1127] = 3204;
        sArr[1128] = 3223;
        sArr[1129] = 3228;
        sArr[1130] = 3226;
        sArr[1131] = 3222;
        sArr[1132] = 3217;
        sArr[1133] = 3210;
        sArr[1134] = 3223;
        sArr[1135] = 3204;
        sArr[1136] = 3202;
        sArr[1137] = 3200;
        sArr[1138] = 397;
        sArr[1139] = 1761;
        sArr[1140] = 1699;
        sArr[1141] = 1707;
        sArr[1142] = 1699;
        sArr[1143] = 1697;
        sArr[1144] = 1724;
        sArr[1145] = 1719;
        sArr[1146] = 1681;
        sArr[1147] = 1709;
        sArr[1148] = 1711;
        sArr[1149] = 1724;
        sArr[1150] = 1706;
        sArr[1151] = 1681;
        sArr[1152] = 1696;
        sArr[1153] = 1697;
        sArr[1154] = 1722;
        sArr[1155] = 1681;
        sArr[1156] = 1704;
        sArr[1157] = 1697;
        sArr[1158] = 1723;
        sArr[1159] = 1696;
        sArr[1160] = 1706;
        sArr[1161] = 2438;
        sArr[1162] = 2536;
        sArr[1163] = 2503;
        sArr[1164] = 2509;
        sArr[1165] = 2523;
        sArr[1166] = 2502;
        sArr[1167] = 2496;
        sArr[1168] = 2509;
        sArr[1169] = 622;
        sArr[1170] = 540;
        sArr[1171] = 612;
        sArr[1172] = 516;
        sArr[1173] = 551;
        sArr[1174] = 544;
        sArr[1175] = 533;
        sArr[1176] = 562;
        sArr[1177] = 573;
        sArr[1178] = 550;
        sArr[1179] = 518;
        sArr[1180] = 545;
        sArr[1181] = 568;
        sArr[1182] = 524;
        sArr[1183] = 541;
        sArr[1184] = 529;
        sArr[1185] = 622;
        sArr[1186] = 540;
        sArr[1187] = 612;
        sArr[1188] = 517;
        sArr[1189] = 574;
        sArr[1190] = 560;
        sArr[1191] = 533;
        sArr[1192] = 562;
        sArr[1193] = 573;
        sArr[1194] = 569;
        sArr[1195] = 548;
        sArr[1196] = 545;
        sArr[1197] = 568;
        sArr[1198] = 524;
        sArr[1199] = 541;
        sArr[1200] = 512;
        sArr[1201] = 622;
        sArr[1202] = 540;
        sArr[1203] = 612;
        sArr[1204] = 517;
        sArr[1205] = 570;
        sArr[1206] = 533;
        sArr[1207] = 530;
        sArr[1208] = 545;
        sArr[1209] = 568;
        sArr[1210] = 524;
        sArr[1211] = 529;
        sArr[1212] = 556;
        sArr[1213] = 622;
        sArr[1214] = 540;
        sArr[1215] = 612;
        sArr[1216] = 517;
        sArr[1217] = 573;
        sArr[1218] = 518;
        sArr[1219] = 533;
        sArr[1220] = 562;
        sArr[1221] = 573;
        sArr[1222] = 550;
        sArr[1223] = 560;
        sArr[1224] = 545;
        sArr[1225] = 568;
        sArr[1226] = 524;
        sArr[1227] = 541;
        sArr[1228] = 529;
        sArr[1229] = 622;
        sArr[1230] = 540;
        sArr[1231] = 612;
        sArr[1232] = 516;
        sArr[1233] = 551;
        sArr[1234] = 633;
        sArr[1235] = 533;
        sArr[1236] = 562;
        sArr[1237] = 573;
        sArr[1238] = 550;
        sArr[1239] = 530;
        sArr[1240] = 545;
        sArr[1241] = 568;
        sArr[1242] = 524;
        sArr[1243] = 529;
        sArr[1244] = 556;
        sArr[1245] = 622;
        sArr[1246] = 540;
        sArr[1247] = 612;
        sArr[1248] = 517;
        sArr[1249] = 573;
        sArr[1250] = 518;
        sArr[1251] = 533;
        sArr[1252] = 562;
        sArr[1253] = 573;
        sArr[1254] = 550;
        sArr[1255] = 560;
        sArr[1256] = 545;
        sArr[1257] = 568;
        sArr[1258] = 524;
        sArr[1259] = 541;
        sArr[1260] = 529;
        sArr[1261] = 1614;
        sArr[1262] = 2834;
        sArr[1263] = 2910;
        sArr[1264] = 2893;
        sArr[1265] = 2888;
        sArr[1266] = 2907;
        sArr[1267] = 2895;
        sArr[1268] = 2904;
        sArr[1269] = 2892;
        sArr[1270] = 2834;
        sArr[1271] = 2894;
        sArr[1272] = 2910;
        sArr[1273] = 2908;
        sArr[1274] = 2897;
        sArr[1275] = 2900;
        sArr[1276] = 2899;
        sArr[1277] = 2906;
        sArr[1278] = 2914;
        sArr[1279] = 2908;
        sArr[1280] = 2891;
        sArr[1281] = 2908;
        sArr[1282] = 2900;
        sArr[1283] = 2897;
        sArr[1284] = 2908;
        sArr[1285] = 2911;
        sArr[1286] = 2897;
        sArr[1287] = 2904;
        sArr[1288] = 2914;
        sArr[1289] = 2906;
        sArr[1290] = 2898;
        sArr[1291] = 2891;
        sArr[1292] = 2904;
        sArr[1293] = 2895;
        sArr[1294] = 2899;
        sArr[1295] = 2898;
        sArr[1296] = 2895;
        sArr[1297] = 2894;
        sArr[1298] = 2948;
        sArr[1299] = 3032;
        sArr[1300] = 3026;
        sArr[1301] = 3032;
        sArr[1302] = 2948;
        sArr[1303] = 3023;
        sArr[1304] = 3022;
        sArr[1305] = 3037;
        sArr[1306] = 3010;
        sArr[1307] = 3016;
        sArr[1308] = 3022;
        sArr[1309] = 3032;
        sArr[1310] = 2948;
        sArr[1311] = 3032;
        sArr[1312] = 3026;
        sArr[1313] = 3032;
        sArr[1314] = 3039;
        sArr[1315] = 3022;
        sArr[1316] = 3014;
        sArr[1317] = 2948;
        sArr[1318] = 3016;
        sArr[1319] = 3035;
        sArr[1320] = 3038;
        sArr[1321] = 2948;
        sArr[1322] = 3016;
        sArr[1323] = 3035;
        sArr[1324] = 3038;
        sArr[1325] = 1269;
        sArr[1326] = 1271;
        sArr[1327] = 1248;
        sArr[1328] = 1251;
        sArr[1329] = 1270;
        sArr[1330] = 2953;
        sArr[1331] = 2952;
        sArr[1332] = 2959;
        sArr[1333] = 2968;
        sArr[1334] = 2954;
        sArr[1335] = 3063;
        sArr[1336] = 3053;
        sArr[1337] = 2958;
        sArr[1338] = 2973;
        sArr[1339] = 2968;
        sArr[1340] = 3053;
        sArr[1341] = 2990;
        sArr[1342] = 2978;
        sArr[1343] = 3000;
        sArr[1344] = 2979;
        sArr[1345] = 3001;
        sArr[1346] = 3053;
        sArr[1347] = 3056;
        sArr[1348] = 3053;
        sArr[1349] = 2588;
        sArr[1350] = 2589;
        sArr[1351] = 2586;
        sArr[1352] = 2573;
        sArr[1353] = 2591;
        sArr[1354] = 2658;
        sArr[1355] = 2680;
        sArr[1356] = 2602;
        sArr[1357] = 2621;
        sArr[1358] = 2617;
        sArr[1359] = 2620;
        sArr[1360] = 2609;
        sArr[1361] = 2614;
        sArr[1362] = 2623;
        sArr[1363] = 2680;
        sArr[1364] = 2587;
        sArr[1365] = 2568;
        sArr[1366] = 2573;
        sArr[1367] = 2680;
        sArr[1368] = 2677;
        sArr[1369] = 2680;
        sArr[1370] = 1191;
        sArr[1371] = 1259;
        sArr[1372] = 1272;
        sArr[1373] = 1277;
        sArr[1374] = 1262;
        sArr[1375] = 1274;
        sArr[1376] = 1261;
        sArr[1377] = 1273;
        sArr[1378] = 1191;
        sArr[1379] = 1275;
        sArr[1380] = 1259;
        sArr[1381] = 1257;
        sArr[1382] = 1252;
        sArr[1383] = 1249;
        sArr[1384] = 1254;
        sArr[1385] = 1263;
        sArr[1386] = 1239;
        sArr[1387] = 1257;
        sArr[1388] = 1278;
        sArr[1389] = 1257;
        sArr[1390] = 1249;
        sArr[1391] = 1252;
        sArr[1392] = 1257;
        sArr[1393] = 1258;
        sArr[1394] = 1252;
        sArr[1395] = 1261;
        sArr[1396] = 1239;
        sArr[1397] = 1262;
        sArr[1398] = 1274;
        sArr[1399] = 1261;
        sArr[1400] = 1273;
        sArr[1401] = 1277;
        sArr[1402] = 1261;
        sArr[1403] = 1254;
        sArr[1404] = 1259;
        sArr[1405] = 1249;
        sArr[1406] = 1261;
        sArr[1407] = 1275;
        sArr[1408] = 2911;
        sArr[1409] = 2866;
        sArr[1410] = 2871;
        sArr[1411] = 2821;
        sArr[1412] = 1389;
        sArr[1413] = 1329;
        sArr[1414] = 1339;
        sArr[1415] = 1329;
        sArr[1416] = 1389;
        sArr[1417] = 1318;
        sArr[1418] = 1319;
        sArr[1419] = 1332;
        sArr[1420] = 1323;
        sArr[1421] = 1313;
        sArr[1422] = 1319;
        sArr[1423] = 1329;
        sArr[1424] = 1389;
        sArr[1425] = 1329;
        sArr[1426] = 1339;
        sArr[1427] = 1329;
        sArr[1428] = 1334;
        sArr[1429] = 1319;
        sArr[1430] = 1327;
        sArr[1431] = 1389;
        sArr[1432] = 1313;
        sArr[1433] = 1330;
        sArr[1434] = 1335;
        sArr[1435] = 1389;
        sArr[1436] = 1313;
        sArr[1437] = 1330;
        sArr[1438] = 1335;
        sArr[1439] = 2371;
        sArr[1440] = 2319;
        sArr[1441] = 2332;
        sArr[1442] = 2329;
        sArr[1443] = 2314;
        sArr[1444] = 2334;
        sArr[1445] = 2313;
        sArr[1446] = 2333;
        sArr[1447] = 1193;
        sArr[1448] = 1253;
        sArr[1449] = 1270;
        sArr[1450] = 1267;
        sArr[1451] = 1248;
        sArr[1452] = 1268;
        sArr[1453] = 1251;
        sArr[1454] = 1271;
        sArr[1455] = 1193;
        sArr[1456] = 1269;
        sArr[1457] = 1253;
        sArr[1458] = 1255;
        sArr[1459] = 1258;
        sArr[1460] = 1263;
        sArr[1461] = 1256;
        sArr[1462] = 1249;
        sArr[1463] = 1241;
        sArr[1464] = 1249;
        sArr[1465] = 1257;
        sArr[1466] = 1264;
        sArr[1467] = 1251;
        sArr[1468] = 1268;
        sArr[1469] = 1256;
        sArr[1470] = 1257;
        sArr[1471] = 1268;
        sArr[1472] = 2860;
        sArr[1473] = 2912;
        sArr[1474] = 2931;
        sArr[1475] = 2934;
        sArr[1476] = 2917;
        sArr[1477] = 2929;
        sArr[1478] = 2918;
        sArr[1479] = 2930;
        sArr[1480] = 2860;
        sArr[1481] = 2928;
        sArr[1482] = 2912;
        sArr[1483] = 2914;
        sArr[1484] = 2927;
        sArr[1485] = 2922;
        sArr[1486] = 2925;
        sArr[1487] = 2916;
        sArr[1488] = 2908;
        sArr[1489] = 2926;
        sArr[1490] = 2922;
        sArr[1491] = 2925;
        sArr[1492] = 2908;
        sArr[1493] = 2917;
        sArr[1494] = 2929;
        sArr[1495] = 2918;
        sArr[1496] = 2930;
        sArr[1497] = 1823;
        sArr[1498] = 1875;
        sArr[1499] = 1856;
        sArr[1500] = 1861;
        sArr[1501] = 1878;
        sArr[1502] = 1858;
        sArr[1503] = 1877;
        sArr[1504] = 1857;
        sArr[1505] = 1823;
        sArr[1506] = 1859;
        sArr[1507] = 1875;
        sArr[1508] = 1873;
        sArr[1509] = 1884;
        sArr[1510] = 1881;
        sArr[1511] = 1886;
        sArr[1512] = 1879;
        sArr[1513] = 1903;
        sArr[1514] = 1885;
        sArr[1515] = 1873;
        sArr[1516] = 1864;
        sArr[1517] = 1903;
        sArr[1518] = 1878;
        sArr[1519] = 1858;
        sArr[1520] = 1877;
        sArr[1521] = 1857;
        sArr[1522] = 2851;
        sArr[1523] = 2868;
        sArr[1524] = 2871;
        sArr[1525] = 2851;
        sArr[1526] = 2868;
        sArr[1527] = 2850;
        sArr[1528] = 2873;
        sArr[1529] = 2818;
        sArr[1530] = 2849;
        sArr[1531] = 2872;
        sArr[1532] = 2879;
        sArr[1533] = 2879;
        sArr[1534] = 2868;
        sArr[1535] = 2851;
        sArr[1536] = 2941;
        sArr[1537] = 2929;
        sArr[1538] = 2870;
        sArr[1539] = 2878;
        sArr[1540] = 2855;
        sArr[1541] = 2868;
        sArr[1542] = 2851;
        sArr[1543] = 2879;
        sArr[1544] = 2878;
        sArr[1545] = 2851;
        sArr[1546] = 2929;
        sArr[1547] = 2924;
        sArr[1548] = 2929;
        sArr[1549] = 1471;
        sArr[1550] = 1448;
        sArr[1551] = 1451;
        sArr[1552] = 1471;
        sArr[1553] = 1448;
        sArr[1554] = 1470;
        sArr[1555] = 1445;
        sArr[1556] = 1438;
        sArr[1557] = 1469;
        sArr[1558] = 1444;
        sArr[1559] = 1443;
        sArr[1560] = 1443;
        sArr[1561] = 1448;
        sArr[1562] = 1471;
        sArr[1563] = 1505;
        sArr[1564] = 1517;
        sArr[1565] = 1440;
        sArr[1566] = 1444;
        sArr[1567] = 1443;
        sArr[1568] = 1419;
        sArr[1569] = 1471;
        sArr[1570] = 1448;
        sArr[1571] = 1468;
        sArr[1572] = 1435;
        sArr[1573] = 1452;
        sArr[1574] = 1441;
        sArr[1575] = 1464;
        sArr[1576] = 1448;
        sArr[1577] = 1517;
        sArr[1578] = 1520;
        sArr[1579] = 1517;
        sArr[1580] = 2825;
        sArr[1581] = 2846;
        sArr[1582] = 2845;
        sArr[1583] = 2825;
        sArr[1584] = 2846;
        sArr[1585] = 2824;
        sArr[1586] = 2835;
        sArr[1587] = 2856;
        sArr[1588] = 2827;
        sArr[1589] = 2834;
        sArr[1590] = 2837;
        sArr[1591] = 2837;
        sArr[1592] = 2846;
        sArr[1593] = 2825;
        sArr[1594] = 2903;
        sArr[1595] = 2907;
        sArr[1596] = 2838;
        sArr[1597] = 2842;
        sArr[1598] = 2819;
        sArr[1599] = 2877;
        sArr[1600] = 2825;
        sArr[1601] = 2846;
        sArr[1602] = 2826;
        sArr[1603] = 2861;
        sArr[1604] = 2842;
        sArr[1605] = 2839;
        sArr[1606] = 2830;
        sArr[1607] = 2846;
        sArr[1608] = 2907;
        sArr[1609] = 2886;
        sArr[1610] = 2907;
        sArr[1611] = 3316;
        sArr[1612] = 3305;
        sArr[1613] = 3305;
        sArr[1614] = 3314;
        sArr[1615] = 3206;
        sArr[1616] = 3286;
        sArr[1617] = 3267;
        sArr[1618] = 3284;
        sArr[1619] = 3275;
        sArr[1620] = 3279;
        sArr[1621] = 3285;
        sArr[1622] = 3285;
        sArr[1623] = 3279;
        sArr[1624] = 3273;
        sArr[1625] = 3272;
        sArr[1626] = 3206;
        sArr[1627] = 3284;
        sArr[1628] = 3267;
        sArr[1629] = 3211;
        sArr[1630] = 3284;
        sArr[1631] = 3267;
        sArr[1632] = 3287;
        sArr[1633] = 3283;
        sArr[1634] = 3267;
        sArr[1635] = 3285;
        sArr[1636] = 3282;
        sArr[1637] = 630;
        sArr[1638] = 554;
        sArr[1639] = 544;
        sArr[1640] = 554;
        sArr[1641] = 630;
        sArr[1642] = 573;
        sArr[1643] = 572;
        sArr[1644] = 559;
        sArr[1645] = 560;
        sArr[1646] = 570;
        sArr[1647] = 572;
        sArr[1648] = 554;
        sArr[1649] = 630;
        sArr[1650] = 554;
        sArr[1651] = 544;
        sArr[1652] = 554;
        sArr[1653] = 557;
        sArr[1654] = 572;
        sArr[1655] = 564;
        sArr[1656] = 630;
        sArr[1657] = 570;
        sArr[1658] = 553;
        sArr[1659] = 556;
        sArr[1660] = 630;
        sArr[1661] = 554;
        sArr[1662] = 570;
        sArr[1663] = 561;
        sArr[1664] = 572;
        sArr[1665] = 573;
        sArr[1666] = 518;
        sArr[1667] = 564;
        sArr[1668] = 570;
        sArr[1669] = 518;
        sArr[1670] = 553;
        sArr[1671] = 566;
        sArr[1672] = 558;
        sArr[1673] = 572;
        sArr[1674] = 555;
        sArr[1675] = 518;
        sArr[1676] = 554;
        sArr[1677] = 568;
        sArr[1678] = 559;
        sArr[1679] = 560;
        sArr[1680] = 567;
        sArr[1681] = 574;
        sArr[1682] = 554;
        sArr[1683] = 943;
        sArr[1684] = 388;
        sArr[1685] = 403;
        sArr[1686] = 405;
        sArr[1687] = 415;
        sArr[1688] = 388;
        sArr[1689] = 393;
        sArr[1690] = 414;
        sArr[1691] = 2049;
        sArr[1692] = 2048;
        sArr[1693] = 2051;
        sArr[1694] = 2074;
        sArr[1695] = 2088;
        sArr[1696] = 2090;
        sArr[1697] = 2081;
        sArr[1698] = 2080;
        sArr[1699] = 2058;
        sArr[1700] = 2091;
        sArr[1701] = 2080;
        sArr[1702] = 2763;
        sArr[1703] = 2762;
        sArr[1704] = 2761;
        sArr[1705] = 2768;
        sArr[1706] = 2786;
        sArr[1707] = 2784;
        sArr[1708] = 2795;
        sArr[1709] = 2794;
        sArr[1710] = 2779;
        sArr[1711] = 2808;
        sArr[1712] = 2784;
        sArr[1713] = 1877;
        sArr[1714] = 1864;
        sArr[1715] = 1882;
        sArr[1716] = 1894;
        sArr[1717] = 1898;
        sArr[1718] = 1899;
        sArr[1719] = 1891;
        sArr[1720] = 1900;
        sArr[1721] = 1911;
        sArr[1722] = 1896;
        sArr[1723] = 1892;
        sArr[1724] = 1905;
        sArr[1725] = 1900;
        sArr[1726] = 1898;
        sArr[1727] = 1899;
        sArr[1728] = 470;
        sArr[1729] = 400;
        sArr[1730] = 415;
        sArr[1731] = 408;
        sArr[1732] = 402;
        sArr[1733] = 470;
        sArr[1734] = 2410;
        sArr[1735] = 2336;
        sArr[1736] = 2352;
        sArr[1737] = 2411;
        sArr[1738] = 2342;
        sArr[1739] = 2349;
        sArr[1740] = 2340;
        sArr[1741] = 2348;
        sArr[1742] = 2347;
        sArr[1743] = 2339;
        sArr[1744] = 2348;
        sArr[1745] = 2359;
        sArr[1746] = 2336;
        sArr[1747] = 2411;
        sArr[1748] = 2358;
        sArr[1749] = 2352;
        sArr[1750] = 2357;
        sArr[1751] = 2336;
        sArr[1752] = 2359;
        sArr[1753] = 2358;
        sArr[1754] = 2352;
        sArr[1755] = 2410;
        sArr[1756] = 2345;
        sArr[1757] = 2346;
        sArr[1758] = 2338;
        sArr[1759] = 2358;
        sArr[1760] = 2410;
        sArr[1761] = 2405;
        sArr[1762] = 2408;
        sArr[1763] = 2347;
        sArr[1764] = 2340;
        sArr[1765] = 2344;
        sArr[1766] = 2336;
        sArr[1767] = 2405;
        sArr[1768] = 2402;
        sArr[1769] = 2415;
        sArr[1770] = 2342;
        sArr[1771] = 2346;
        sArr[1772] = 2344;
        sArr[1773] = 2411;
        sArr[1774] = 2359;
        sArr[1775] = 2346;
        sArr[1776] = 2346;
        sArr[1777] = 2353;
        sArr[1778] = 2348;
        sArr[1779] = 2339;
        sArr[1780] = 2364;
        sArr[1781] = 2415;
        sArr[1782] = 2402;
        sArr[1783] = 2405;
        sArr[1784] = 2408;
        sArr[1785] = 2337;
        sArr[1786] = 2336;
        sArr[1787] = 2345;
        sArr[1788] = 2336;
        sArr[1789] = 2353;
        sArr[1790] = 2336;
        sArr[1791] = 997;
        sArr[1792] = 964;
        sArr[1793] = 963;
        sArr[1794] = 980;
        sArr[1795] = 966;
        sArr[1796] = 923;
        sArr[1797] = 897;
        sArr[1798] = 962;
        sArr[1799] = 977;
        sArr[1800] = 980;
        sArr[1801] = 897;
        sArr[1802] = 981;
        sArr[1803] = 974;
        sArr[1804] = 966;
        sArr[1805] = 966;
        sArr[1806] = 973;
        sArr[1807] = 964;
        sArr[1808] = 909;
        sArr[1809] = 897;
        sArr[1810] = 962;
        sArr[1811] = 974;
        sArr[1812] = 979;
        sArr[1813] = 964;
        sArr[1814] = 923;
        sArr[1815] = 897;
        sArr[1816] = 899;
        sArr[1817] = 2007;
        sArr[1818] = 2491;
        sArr[1819] = 2454;
        sArr[1820] = 2463;
        sArr[1821] = 2440;
        sArr[1822] = 2446;
        sArr[1823] = 901;
        sArr[1824] = 938;
        sArr[1825] = 996;
        sArr[1826] = 929;
        sArr[1827] = 950;
        sArr[1828] = 950;
        sArr[1829] = 939;
        sArr[1830] = 950;
        sArr[1831] = 996;
        sArr[1832] = 939;
        sArr[1833] = 935;
        sArr[1834] = 935;
        sArr[1835] = 945;
        sArr[1836] = 950;
        sArr[1837] = 950;
        sArr[1838] = 929;
        sArr[1839] = 928;
        sArr[1840] = 996;
        sArr[1841] = 947;
        sArr[1842] = 940;
        sArr[1843] = 941;
        sArr[1844] = 936;
        sArr[1845] = 929;
        sArr[1846] = 996;
        sArr[1847] = 944;
        sArr[1848] = 939;
        sArr[1849] = 931;
        sArr[1850] = 931;
        sArr[1851] = 936;
        sArr[1852] = 941;
        sArr[1853] = 938;
        sArr[1854] = 931;
        sArr[1855] = 996;
        sArr[1856] = 944;
        sArr[1857] = 940;
        sArr[1858] = 929;
        sArr[1859] = 996;
        sArr[1860] = 903;
        sArr[1861] = 916;
        sArr[1862] = 913;
        sArr[1863] = 996;
        sArr[1864] = 935;
        sArr[1865] = 939;
        sArr[1866] = 950;
        sArr[1867] = 929;
        sArr[1868] = 1002;
        sArr[1869] = 996;
        sArr[1870] = 916;
        sArr[1871] = 936;
        sArr[1872] = 929;
        sArr[1873] = 933;
        sArr[1874] = 951;
        sArr[1875] = 929;
        sArr[1876] = 996;
        sArr[1877] = 944;
        sArr[1878] = 933;
        sArr[1879] = 943;
        sArr[1880] = 929;
        sArr[1881] = 996;
        sArr[1882] = 933;
        sArr[1883] = 996;
        sArr[1884] = 951;
        sArr[1885] = 935;
        sArr[1886] = 950;
        sArr[1887] = 929;
        sArr[1888] = 929;
        sArr[1889] = 938;
        sArr[1890] = 951;
        sArr[1891] = 940;
        sArr[1892] = 939;
        sArr[1893] = 944;
        sArr[1894] = 996;
        sArr[1895] = 933;
        sArr[1896] = 938;
        sArr[1897] = 928;
        sArr[1898] = 996;
        sArr[1899] = 950;
        sArr[1900] = 929;
        sArr[1901] = 948;
        sArr[1902] = 939;
        sArr[1903] = 950;
        sArr[1904] = 944;
        sArr[1905] = 996;
        sArr[1906] = 941;
        sArr[1907] = 944;
        sArr[1908] = 996;
        sArr[1909] = 944;
        sArr[1910] = 939;
        sArr[1911] = 996;
        sArr[1912] = 944;
        sArr[1913] = 940;
        sArr[1914] = 929;
        sArr[1915] = 996;
        sArr[1916] = 928;
        sArr[1917] = 929;
        sArr[1918] = 946;
        sArr[1919] = 929;
        sArr[1920] = 936;
        sArr[1921] = 939;
        sArr[1922] = 948;
        sArr[1923] = 929;
        sArr[1924] = 950;
        sArr[1925] = 1002;
        sArr[1926] = 996;
        sArr[1927] = 912;
        sArr[1928] = 940;
        sArr[1929] = 933;
        sArr[1930] = 938;
        sArr[1931] = 943;
        sArr[1932] = 996;
        sArr[1933] = 957;
        sArr[1934] = 939;
        sArr[1935] = 945;
        sArr[1936] = 996;
        sArr[1937] = 1022;
        sArr[1938] = 1005;
        sArr[1939] = 974;
        sArr[1940] = 974;
        f24short = sArr;
    }

    public MainActivity() {
        Integer num = new Integer(6376332);
        this.p = false;
        this.C = new ToggleButton[((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 6376326];
        this.E = 1;
        this.L = 1;
        this.M = 1;
        this.N = 1;
        this.c0 = (String) C0097.n(93145, null, new Object[0]);
        if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
            C0048.n(47446, (PrintStream) C0104.n(12888), new Object[]{Long.valueOf(((Long) C0048.n(90189, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0049.n(63955)})})).longValue())});
        }
    }

    public static /* synthetic */ String a(MainActivity mainActivity, String str) {
        return (String) C0049.n(16366, null, new Object[]{mainActivity, str});
    }

    public static /* synthetic */ String b(MainActivity mainActivity, String str) {
        return (String) C0049.n(73894, null, new Object[]{mainActivity, str});
    }

    /* renamed from: ۥۗ۟⁤⁣ۢۖ⁠ۥ⁠۟۬ۖۖ⁤ۧۥ⁣⁤ۖ, reason: contains not printable characters */
    public static void m1082(Object obj, int i2) {
        if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
            C0049.n(77143, (abx.b.d.a.l) obj, new Object[]{Integer.valueOf(i2)});
        }
        if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0049.n(90737)})})});
        }
    }

    /* renamed from: ۥۗ۟⁤⁤ۗ۟ۗۖۢۤۤۥۥۤۦۗۖ⁤⁠, reason: contains not printable characters */
    public static View m1083(Object obj, int i2) {
        if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
            return (View) C0089.n(14007, (abx.b.d.a.l) obj, new Object[]{Integer.valueOf(i2)});
        }
        return null;
    }

    /* renamed from: ۥ۬ۥ۟۟ۥۨ⁤ۖۧ⁤ۖۖ⁠ۖۨ۬ۖۤۖ, reason: contains not printable characters */
    public static String m1084(Object obj, int i2, int i3, int i4) {
        if (((Integer) C0087.n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0043.n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return null;
    }

    /* renamed from: ۥ⁠ۣ⁣⁠⁠ۖۖ⁤ۥ۟ۖ⁤ۧ⁤۬ۖۜۜ⁠, reason: contains not printable characters */
    public static String m1085(Object obj, int i2, int i3, int i4) {
        if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
            return (String) C0082.n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return null;
    }

    /* renamed from: ۥ⁠⁤⁠⁤ۦۖۗ⁠⁤ۣ⁣⁤ۧ⁤ۥۥ⁠۠⁣, reason: contains not printable characters */
    public static short[] m1086() {
        if (((Integer) C0087.n(57336, null, new Object[0])).intValue() < 0) {
            return (short[]) C0049.n(66642);
        }
        return null;
    }

    /* renamed from: ۥ⁣ۥۤ⁤ۖ⁤ۨۧ⁤⁤⁠ۢ⁠ۣ۬⁤ۥ⁤⁤, reason: contains not printable characters */
    public static MenuInflater m1087(Object obj) {
        if (((Integer) C0087.n(37112, null, new Object[0])).intValue() <= 0) {
            return (MenuInflater) C0049.n(22291, (abx.b.d.a.l) obj, new Object[0]);
        }
        return null;
    }

    /* renamed from: ۥ⁣⁤⁠ۖۤ⁤۟⁤ۨ⁠ۖۖۗۖ۠⁤ۗۥۖ, reason: contains not printable characters */
    public static int m1088(Object obj) {
        if (((Integer) C0087.n(33764, null, new Object[0])).intValue() > 0) {
            return ((Integer) C0087.n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥ⁤⁠⁠⁠۬ۤۤۥ⁣۠ۥ⁤⁠ۨۖۖۖۖ⁤, reason: contains not printable characters */
    public static String m1089(Object obj, int i2, int i3, int i4) {
        if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0087.n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤ۣ⁤ۖ⁤⁠⁤ۣۤ۟ۨ۟⁣ۗۤۜ⁠⁤, reason: contains not printable characters */
    public static String m1090(Object obj, int i2, int i3, int i4) {
        if (((Integer) C0087.n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0082.n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return null;
    }

    public final String a(String str) {
        int i2;
        String str2;
        int i3 = 0;
        String[] strArr = (String[]) C0081.n(26018, null, new Object[]{(String) C0110.n(12792, null, new Object[]{str}), (String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0085.n(71173, null, new Object[0])})).intValue() ^ 1754662), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(49752, null, new Object[0])})).intValue() ^ 1753667), Integer.valueOf(54699 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0049.n(97398, null, new Object[0])})).intValue())})});
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (true) {
            i2 = i4;
            int length = strArr.length;
            str2 = (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0079.n(43387, null, new Object[0])})).intValue() ^ 1755558), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(43330, null, new Object[0])})).intValue() ^ 1746802), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0037.n(36312, null, new Object[0])})).intValue() ^ 1750225)});
            if (i2 >= length || ((Boolean) C0076.n(33096, null, new Object[]{(String) C0034.n(27109, null, new Object[]{(String) C0101.n(13801, null, new Object[]{strArr[i2]})}), str2})).booleanValue()) {
                break;
            }
            i4 = i2 + 1;
        }
        while (i2 < strArr.length) {
            if (((Boolean) C0076.n(33096, null, new Object[]{(String) C0034.n(27109, null, new Object[]{(String) C0101.n(13801, null, new Object[]{strArr[i2]})}), str2})).booleanValue()) {
                while (i3 < strArr.length + 1) {
                    i3 = i2 + 1;
                    String str3 = (String) C0034.n(27109, null, new Object[]{(String) C0101.n(13801, null, new Object[]{strArr[i3]})});
                    if (((Boolean) C0037.n(73611, null, new Object[]{str3, (String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0071.n(23466, null, new Object[0])})).intValue() ^ 1753684), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(17607, null, new Object[0])})).intValue() ^ 1753452), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(89506, null, new Object[0])})).intValue() ^ 1749258)})})).booleanValue()) {
                        break;
                    }
                    if (((Boolean) C0076.n(33096, null, new Object[]{str3, (String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0086.n(51218, null, new Object[0])})).intValue() ^ 1752713), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0049.n(77767, null, new Object[0])})).intValue() ^ 1750605), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(3433, null, new Object[0])})).intValue() ^ 1748430)})})).booleanValue()) {
                        i2 = i3;
                    } else if (((Boolean) C0076.n(33096, null, new Object[]{str3, (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(82449, null, new Object[0])})).intValue() ^ 1746944), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(4857, null, new Object[0])})).intValue() ^ 1748826), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0058.n(61524, null, new Object[0])})).intValue() ^ 55266)})})).booleanValue()) {
                        i2 = i3;
                    } else if (((Boolean) C0076.n(33096, null, new Object[]{str3, (String) C0080.n(30516, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0102.n(48192, null, new Object[0])})).intValue() ^ 56420), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(72160, null, new Object[0])})).intValue() ^ 1753506), Integer.valueOf(1753828 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0073.n(43084, null, new Object[0])})).intValue())})})).booleanValue()) {
                        i2 = i3;
                    } else {
                        i2 = i3;
                    }
                }
            } else {
                i3 = i2;
            }
            i2 = i3 + 1;
        }
        return (String) C0101.n(13801, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
    }

    public final String a(NodeList nodeList) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= ((Integer) C0036.n(79186, null, new Object[]{nodeList})).intValue()) {
                return (String) C0101.n(13801, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
            }
            NodeList nodeList2 = (NodeList) C0036.n(11761, null, new Object[]{(Node) C0036.n(43293, null, new Object[]{nodeList, Integer.valueOf(i3)})});
            int i4 = 0;
            boolean z2 = false;
            while (i4 < Integer.MAX_VALUE) {
                boolean z3 = z2;
                int i5 = i4;
                if (i5 < ((Integer) C0036.n(79186, null, new Object[]{nodeList2})).intValue()) {
                    try {
                        Node node = (Node) C0036.n(43293, null, new Object[]{nodeList2, Integer.valueOf(i5)});
                        String str = (String) C0036.n(21372, null, new Object[]{(Node) C0036.n(13241, null, new Object[]{(NamedNodeMap) C0036.n(88723, null, new Object[]{node}), 0})});
                        String str2 = (String) C0036.n(21372, null, new Object[]{(Node) C0036.n(83203, null, new Object[]{node})});
                        if (((Boolean) C0037.n(73611, null, new Object[]{str, (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0036.n(28017, null, new Object[0])})).intValue() ^ 1749884), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0036.n(38086, null, new Object[0])})).intValue() ^ 1748695), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0036.n(13831, null, new Object[0])})).intValue() ^ 1753217)})})).booleanValue() && ((Boolean) C0067.n(86879, null, new Object[]{str2, (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0036.n(60861, null, new Object[0])})).intValue() ^ 1746868), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0110.n(18378, null, new Object[0])})).intValue() ^ 1755350), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0079.n(20985, null, new Object[0])})).intValue() ^ 1749379)})})).booleanValue()) {
                            z3 = true;
                        }
                        if (((Boolean) C0037.n(73611, null, new Object[]{str, (String) C0080.n(30516, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0054.n(77909, null, new Object[0])})).intValue() ^ 1752542), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0030.n(78141, null, new Object[0])})).intValue() ^ 1753658), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0047.n(30473, null, new Object[0])})).intValue() ^ 1746433)})})).booleanValue()) {
                            if (!z3) {
                            }
                        }
                        if (((Boolean) C0037.n(73611, null, new Object[]{str, (String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0030.n(35859, null, new Object[0])})).intValue() ^ 1750702), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0079.n(32913, null, new Object[0])})).intValue() ^ 1753411), Integer.valueOf(1752851 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0030.n(7944, null, new Object[0])})).intValue())})})).booleanValue()) {
                        }
                    } catch (Exception e2) {
                    }
                    z2 = z3;
                    i4 = i5 + 1;
                }
            }
            if (java.lang.System.nanoTime() >= 0) { i2 = i3 + 1; }
        }
    }

    public void a(ProgressDialog progressDialog) {
        try {
            C0030.n(39975, null, new Object[]{progressDialog});
        } catch (IllegalArgumentException e2) {
        } catch (Exception e3) {
        }
    }

    public void a(View view, int i2) {
        AlertDialog.Builder builder = (AlertDialog.Builder) C0044.n(54142, null, new Object[]{new AlertDialog.Builder(this), Integer.valueOf(((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(25154744)}[0], new Object[0])).intValue() ^ 7853215)});
        StringBuilder sb = new StringBuilder();
        if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0030.n(64952)})})});
        }
    }

    public void a(File file) {
        File[] fileArr = (File[]) C0083.n(22591, null, new Object[]{file});
        if (fileArr != null) {
            for (File file2 : fileArr) {
                if (((Boolean) C0030.n(68527, null, new Object[]{file2})).booleanValue()) {
                    C0101.n(46515, null, new Object[]{this, new a(file2)});
                    C0083.n(2697, null, new Object[]{this, file2});
                    File[] fileArr2 = (File[]) C0083.n(22591, null, new Object[]{file2});
                    if (fileArr2 != null && fileArr2.length == 0) {
                        StringBuilder sb = new StringBuilder();
                        C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
                    }
                }
            }
        }
    }

    public final void a(Integer[] numArr, int i2, int i3) {
        Long l2 = new Long(4269911L);
        synchronized (this) {
            while (((Integer) C0095.n(36900, null, new Object[]{numArr[i2]})).intValue() == i3) {
                try {
                    C0078.n(42025, null, new Object[]{Long.valueOf(((Long) C0078.n(19087, (Long) new Object[]{l2}[0], new Object[0])).longValue() ^ 4269925)});
                } catch (RuntimeException e2) {
                    C0034.n(42910, null, new Object[]{e2});
                }
            }
        }
        if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0074.n(47090)})})});
        }
    }

    public final String b(String str) {
        try {
            Document document = (Document) C0074.n(33389, null, new Object[]{(DocumentBuilder) C0074.n(28876, null, new Object[]{(DocumentBuilderFactory) C0074.n(44567, null, new Object[0])}), new ByteArrayInputStream((byte[]) C0074.n(80707, null, new Object[]{(String) C0110.n(12792, null, new Object[]{str}), (Charset) C0074.n(65378, null, new Object[]{(String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0074.n(18554, null, new Object[0])})).intValue() ^ 1755643), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0074.n(83723, null, new Object[0])})).intValue() ^ 1753580), Integer.valueOf(1752328 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0055.n(10437, null, new Object[0])})).intValue())})})}))});
            C0074.n(67043, null, new Object[]{(Element) C0074.n(21703, null, new Object[]{document})});
            NodeList nodeList = (NodeList) C0074.n(42626, null, new Object[]{document, (String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0056.n(68680, null, new Object[0])})).intValue() ^ 1751796), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0074.n(4682, null, new Object[0])})).intValue() ^ 1755515), Integer.valueOf(54867 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0055.n(62151, null, new Object[0])})).intValue())})});
            PrintStream printStream = (PrintStream) C0038.n(32739, null, new Object[0]);
            StringBuilder sb = new StringBuilder();
            C0050.n(77119, null, new Object[]{printStream, (String) C0104.n(48310, null, new Object[]{sb})});
            return (String) C0077.n(71970, null, new Object[]{this, nodeList});
        } catch (Exception e2) {
            C0066.n(62866, null, new Object[]{e2});
            return (String) C0097.n(93145, null, new Object[0]);
        }
    }

    public void b(int i2) {
        if (i2 == 0) {
            C0104.n(73601, null, new Object[]{(String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(64218, null, new Object[0])})).intValue() ^ 1754146), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0058.n(88257, null, new Object[0])})).intValue() ^ 1755595), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0067.n(68973, null, new Object[0])})).intValue() ^ 1745471)})});
        } else if (i2 == 1) {
            C0104.n(73601, null, new Object[]{(String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0049.n(89875, null, new Object[0])})).intValue() ^ 1754223), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0033.n(9613, null, new Object[0])})).intValue() ^ 1751721), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0050.n(99161, null, new Object[0])})).intValue() ^ 1753243)})});
        } else if (i2 == 2) {
            C0104.n(73601, null, new Object[]{(String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(30439, null, new Object[0])})).intValue() ^ 1749563), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0042.n(2763, null, new Object[0])})).intValue() ^ 1750572), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0034.n(95044, null, new Object[0])})).intValue() ^ 1748279)})});
        } else if (i2 == 3) {
            C0104.n(73601, null, new Object[]{(String) C0080.n(30516, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(77946, null, new Object[0])})).intValue() ^ 1751329), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(81841, null, new Object[0])})).intValue() ^ 1748776), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0089.n(47227, null, new Object[0])})).intValue() ^ 1746309)})});
        } else if (i2 == 4) {
            C0104.n(73601, null, new Object[]{(String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(13970, null, new Object[0])})).intValue() ^ 1746928), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0091.n(52978, null, new Object[0])})).intValue() ^ 1753624), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(60246, null, new Object[0])})).intValue() ^ 1750902)})});
        } else if (i2 == 5) {
            C0104.n(73601, null, new Object[]{(String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(3556, null, new Object[0])})).intValue() ^ 1748896), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0042.n(22947, null, new Object[0])})).intValue() ^ 1749585), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0085.n(42304, null, new Object[0])})).intValue() ^ 1747064)})});
        }
        if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0077.n(3919)})})});
        }
    }

    public void c(int i2) {
        StringBuilder sb = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(18433, null, new Object[0])})).intValue() ^ 1747924), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(18481, null, new Object[0])})).intValue() ^ 1754394), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0085.n(43885, null, new Object[0])})).intValue() ^ 1750513)})});
        C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
    }

    public final void c(String str) {
        synchronized (this) {
            C0101.n(46515, null, new Object[]{this, new h((StringBuilder[]) C0078.n(35629, null, new Object[]{str}))});
        }
    }

    public void calibrateBattery_method(View view) {
    }

    public void clearCache_method(View view) {
    }

    public void clearRam_method(View view) {
    }

    public void clearSystemTrash_method(View view) {
        if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0077.n(94635)})})});
        }
    }

    public void clearText_method(View view) {
        C0110.n(43249, null, new Object[]{(TextView) C0086.n(10512, null, new Object[]{this}), (String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0031.n(70909, null, new Object[0])})).intValue() ^ 1746458), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(94375, null, new Object[0])})).intValue() ^ 1752707), Integer.valueOf(1745432 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0049.n(38081, null, new Object[0])})).intValue())})});
    }

    public void confirmationCheckBoxClickMethod(View view) {
        ((Boolean) C0072.n(30432, null, new Object[]{(CheckBox) C0071.n(9764, null, new Object[]{this})})).booleanValue();
    }

    public void d(int i2) {
        StringBuilder sb = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0080.n(30516, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0073.n(43084, null, new Object[0])})).intValue() ^ 1754119), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(60246, null, new Object[0])})).intValue() ^ 1752598), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0077.n(51405, null, new Object[0])})).intValue() ^ 1755763)})});
        String str = (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0048.n(67013, null, new Object[0])})).intValue() ^ 1753048), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0045.n(83532, null, new Object[0])})).intValue() ^ 1754471), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0028.n(81261, null, new Object[0])})).intValue() ^ 1747438)});
        C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
        if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0097.n(7496, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0045.n(1994)})})});
        }
    }

    public void deepClearRam_method(View view) {
    }

    public void defCheckBoxModeOneClickMethod(View view) {
        ((Boolean) C0072.n(30432, null, new Object[]{(CheckBox) C0096.n(45379, null, new Object[]{this})})).booleanValue();
        ((Boolean) C0072.n(30432, null, new Object[]{(CheckBox) C0072.n(53127, null, new Object[]{this})})).booleanValue();
        if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0048.n(9605, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0045.n(74896)})})});
        }
    }

    public void defCheckBoxModeTwoClickMethod(View view) {
        ((Boolean) C0072.n(30432, null, new Object[]{(CheckBox) C0096.n(45379, null, new Object[]{this})})).booleanValue();
        ((Boolean) C0072.n(30432, null, new Object[]{(CheckBox) C0072.n(53127, null, new Object[]{this})})).booleanValue();
    }

    public void deleteEmptyFolders_method(View view) {
        Integer num = new Integer(18217206);
        if (!((Boolean) C0096.n(25289, null, new Object[]{(CheckBox) C0072.n(53127, null, new Object[]{this})})).booleanValue() || ((Integer) C0101.n(67592, null, new Object[0])).intValue() < 23) {
        } else if (((Integer) C0045.n(2147, null, new Object[]{this, (String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0076.n(73503, null, new Object[0])})).intValue() ^ 1751247), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0045.n(94488, null, new Object[0])})).intValue() ^ 1755493), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0045.n(78468, null, new Object[0])})).intValue() ^ 1754779)})})).intValue() == 0) {
        }
        if (((Integer) C0104.n(62495, null, new Object[0])).intValue() >= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0082.n(77284, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0107.n(20812)})})});
        }
    }

    public void deleteLogFiles_method(View view) {
    }

    public void deleteNoMedia_method(View view) {
    }

    public void deleteZeroSizeFiles_method(View view) {
        if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0082.n(77284, null, new Object[]{(String) C0104.n(59573, null, new Object[]{(String) C0107.n(94697)})})});
        }
    }

    public void fstrim_method(View view) {
    }

    public void governorClickMethod(View view) {
        ((Boolean) C0107.n(67949, null, new Object[]{(Spinner) C0067.n(59250, null, new Object[]{this})})).booleanValue();
    }

    public void idleMaintenance_method(View view) {
    }

    public void maxFreqClickMethod(View view) {
        ((Boolean) C0107.n(67949, null, new Object[]{(Spinner) C0067.n(96491, null, new Object[]{this})})).booleanValue();
    }

    public void minFreqClickMethod(View view) {
        ((Boolean) C0107.n(67949, null, new Object[]{(Spinner) C0051.n(6058, null, new Object[]{this})})).booleanValue();
    }

    public void multicorePSClickMethod(View view) {
        ((Boolean) C0072.n(30432, null, new Object[]{(CheckBox) C0084.n(53530, null, new Object[]{this})})).booleanValue();
        if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0104.n(44213, null, new Object[]{(String) C0087.n(2816, null, new Object[]{(String) C0107.n(74618)})})});
        }
    }

    public void multicorePS_method(View view) {
        boolean booleanValue = ((Boolean) C0096.n(25289, null, new Object[]{(CheckBox) C0084.n(53530, null, new Object[]{this})})).booleanValue();
        String str = (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0085.n(95182, null, new Object[0])})).intValue() ^ 1754382), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0107.n(38725, null, new Object[0])})).intValue() ^ 1754523), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0107.n(67174, null, new Object[0])})).intValue() ^ 1751402)});
        String str2 = (String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0085.n(8549, null, new Object[0])})).intValue() ^ 1748019), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0103.n(83864, null, new Object[0])})).intValue() ^ 1755642), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0107.n(82923, null, new Object[0])})).intValue() ^ 1749524)});
        if (booleanValue) {
            StringBuilder sb = new StringBuilder();
            C0083.n(39709, null, new Object[]{sb, (String) C0096.n(48052, null, new Object[]{this}), str});
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        C0083.n(39709, null, new Object[]{sb2, (String) C0096.n(48052, null, new Object[]{this}), str});
    }

    public void n() {
        int i2;
        int i3 = 1;
        while (true) {
            i2 = i3;
            if (i2 > 10) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            if (!((Boolean) C0030.n(68527, null, new Object[]{new File((String) C0104.n(48310, null, new Object[]{sb}))})).booleanValue()) {
                this.E = i2;
                break;
            }
            i3 = i2 + 1;
        }
        if (i2 == 11) {
            C0050.n(77119, null, new Object[]{(PrintStream) C0038.n(32739, null, new Object[0]), (String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0107.n(26032, null, new Object[0])})).intValue() ^ 1747787), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0037.n(68097, null, new Object[0])})).intValue() ^ 1748714), Integer.valueOf(1748788 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0065.n(60906, null, new Object[0])})).intValue())})});
            this.E = 10;
        }
        int intValue = ((Integer) C0042.n(79139, null, new Object[]{this})).intValue();
        while (true) {
            int i4 = intValue;
            if (i4 >= ((ToggleButton[]) C0058.n(39331, null, new Object[]{this})).length) {
                break;
            }
            C0101.n(46515, null, new Object[]{this, new b(i4)});
            intValue = i4 + 1;
        }
        if (((Integer) C0097.n(33252, null, new Object[0])).intValue() <= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Long) C0082.n(77284, null, new Object[]{(String) C0097.n(68315, null, new Object[]{(String) C0107.n(55605)})})});
        }
    }

    public void o() {
        String str;
        String str2;
        File file;
        this.v = (File) C0107.n(58962, null, new Object[0]);
        String str3 = (String) C0107.n(96741, null, new Object[]{(String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0107.n(29481, null, new Object[0])})).intValue() ^ 1750569), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0110.n(52549, null, new Object[0])})).intValue() ^ 1746713), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0107.n(1536, null, new Object[0])})).intValue() ^ 1755619)})});
        String str4 = (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0031.n(34212, null, new Object[0])})).intValue() ^ 1747826), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0091.n(73548, null, new Object[0])})).intValue() ^ 1747813), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0100.n(58048, null, new Object[0])})).intValue() ^ 1749776)});
        String str5 = (String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0052.n(8718, null, new Object[0])})).intValue() ^ 1751597), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(47496, null, new Object[0])})).intValue() ^ 56459), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0079.n(76196, null, new Object[0])})).intValue() ^ 1750189)});
        if (str3 == null) {
            this.w = new File(str5);
        } else {
            this.w = new File(((String[]) C0081.n(26018, null, new Object[]{(String) C0101.n(13801, null, new Object[]{str3}), str4}))[0]);
        }
        if (((Integer) C0101.n(67592, null, new Object[0])).intValue() < 23 || !((Boolean) C0037.n(73611, null, new Object[]{(String) C0095.n(82839, null, new Object[]{(File) C0083.n(52096, null, new Object[]{this})}), str5})).booleanValue()) {
            return;
        }
        File[] fileArr = (File[]) C0059.n(57831, null, new Object[]{this});
        int length = fileArr.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            str = (String) C0097.n(93145, null, new Object[0]);
            if (i3 >= length || (file = fileArr[i3]) == null) {
                break;
            }
            if (((Boolean) C0059.n(92123, null, new Object[]{file})).booleanValue()) {
                StringBuilder sb = (StringBuilder) C0071.n(81489, null, new Object[]{str});
                str2 = (String) C0104.n(48310, null, new Object[]{sb});
                break;
            }
            i2 = i3 + 1;
        }
        str2 = str;
        if (!((Boolean) C0037.n(73611, null, new Object[]{str2, str})).booleanValue()) {
            str5 = str2;
        }
        this.w = new File(((String[]) C0081.n(26018, null, new Object[]{(String) C0101.n(13801, null, new Object[]{str5}), str4}))[0]);
    }

    @Override // abx.b.d.a.l, abx.b.c.a.f, abx.b.c.a.g0, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {new Integer(1755944), new Integer(213584), new Integer(4501342), new Integer(6795632), new Integer(4427968), new Integer(882538), new Integer(5534376), new Integer(2861421), new Integer(9243554), new Integer(5456064)};
        C0104.n(41715, null, new Object[]{(Toast) C0104.n(80514, null, new Object[]{this, new String((byte[]) C0059.n(26186, null, new Object[]{(String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(70919, null, new Object[0])})).intValue() ^ 1753500), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0099.n(63229, null, new Object[0])})).intValue() ^ 1749886), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(66383, null, new Object[0])})).intValue() ^ 1754930)}), 0})), Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[3], new Object[0])).intValue() ^ 6795633)})});
        String str = (String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0055.n(79914, null, new Object[0])})).intValue() ^ 1745907), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0031.n(23172, null, new Object[0])})).intValue() ^ 1755555), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(59461, null, new Object[0])})).intValue() ^ 55986)});
        String str2 = (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(6341, null, new Object[0])})).intValue() ^ 1747828), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0103.n(45820, null, new Object[0])})).intValue() ^ 1752647), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0045.n(91544, null, new Object[0])})).intValue() ^ 1756447)});
        String str3 = (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0066.n(69678, null, new Object[0])})).intValue() ^ 1748656), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(13334, null, new Object[0])})).intValue() ^ 56545), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(64719, null, new Object[0])})).intValue() ^ 1751528)});
        super.onCreate(bundle);
        C0059.n(30146, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(87542, null, new Object[0])})).intValue() ^ (2131364038 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0066.n(90021, null, new Object[0])})).intValue()))});
        this.q = new ProgressDialog(this);
        C0059.n(46713, null, new Object[]{(ProgressDialog) C0048.n(96934, null, new Object[]{this}), false});
        this.r = (EditText) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0093.n(2586, null, new Object[0])})).intValue() ^ 2131928925)}));
        this.s = (TextView) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0081.n(27411, null, new Object[0])})).intValue() ^ (2131260384 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(98551, null, new Object[0])})).intValue()))}));
        this.y = (CheckBox) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(85146, null, new Object[0])})).intValue() ^ 2131934911)}));
        this.x = (CheckBox) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(52107, null, new Object[0])})).intValue() ^ 2131930785)}));
        this.z = (Spinner) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(97244, null, new Object[0])})).intValue() ^ (2131231808 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0068.n(40888, null, new Object[0])})).intValue()))}));
        this.A = (Spinner) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0078.n(75225, null, new Object[0])})).intValue() ^ 2131928894)}));
        this.B = (Spinner) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0091.n(23128, null, new Object[0])})).intValue() ^ 2131935527)}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[0] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(79463, null, new Object[0])})).intValue() ^ (2131261327 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(19863, null, new Object[0])})).intValue()))}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[9], new Object[0])).intValue() ^ 5456065] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0088.n(90665, null, new Object[0])})).intValue() ^ (2131259101 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(17607, null, new Object[0])})).intValue()))}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[4], new Object[0])).intValue() ^ 4427970] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0099.n(90728, null, new Object[0])})).intValue() ^ (2131262527 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(54874, null, new Object[0])})).intValue()))}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[7], new Object[0])).intValue() ^ 2861422] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(98486, null, new Object[0])})).intValue() ^ 2131933904)}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 1755948] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0060.n(12193, null, new Object[0])})).intValue() ^ 2131287089)}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[2], new Object[0])).intValue() ^ 4501339] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(19223, null, new Object[0])})).intValue() ^ 2131937724)}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[6], new Object[0])).intValue() ^ 5534382] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0081.n(42209, null, new Object[0])})).intValue() ^ (2131917621 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(13288, null, new Object[0])})).intValue()))}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[8], new Object[0])).intValue() ^ 9243557] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0038.n(65578, null, new Object[0])})).intValue() ^ (2131230973 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0059.n(70919, null, new Object[0])})).intValue()))}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 213592] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0056.n(9223, null, new Object[0])})).intValue() ^ 2131932020)}));
        ((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[((Integer) C0104.n(62256, (Integer) objArr[5], new Object[0])).intValue() ^ 882531] = (ToggleButton) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(57929, null, new Object[0])})).intValue() ^ 2131937722)}));
        this.D = (CheckBox) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(19863, null, new Object[0])})).intValue() ^ 2131937690)}));
        this.I = (ListView) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(82221, null, new Object[0])})).intValue() ^ (2131235852 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(32001, null, new Object[0])})).intValue()))}));
        this.J = (CheckBox) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(7708, null, new Object[0])})).intValue() ^ (2131260135 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0056.n(9223, null, new Object[0])})).intValue()))}));
        this.d0 = (SharedPreferences) C0090.n(64944, null, new Object[]{this, (String) C0080.n(41324, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(36612, null, new Object[0])})).intValue() ^ 1750000), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0085.n(69646, null, new Object[0])})).intValue() ^ 1749583), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(3180, null, new Object[0])})).intValue() ^ 1748934)}), 0});
        this.O = (LinearLayout) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0090.n(62256, null, new Object[0])})).intValue() ^ (2131915639 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0090.n(81296, null, new Object[0])})).intValue()))}));
        this.P = (LinearLayout) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0049.n(12745, null, new Object[0])})).intValue() ^ (2131257524 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0088.n(78033, null, new Object[0])})).intValue()))}));
        this.Q = (LinearLayout) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0031.n(66516, null, new Object[0])})).intValue() ^ 2131930955)}));
        this.Rvar = (LinearLayout) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0095.n(38492, null, new Object[0])})).intValue() ^ (2131233940 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0090.n(29561, null, new Object[0])})).intValue()))}));
        this.S = (LinearLayout) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0080.n(89506, null, new Object[0])})).intValue() ^ (2131238206 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0090.n(97287, null, new Object[0])})).intValue()))}));
        this.T = (LinearLayout) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0105.n(85146, null, new Object[0])})).intValue() ^ 2131934746)}));
        this.U = (ViewGroup.LayoutParams) C0090.n(38702, null, new Object[]{(LinearLayout) C0090.n(66849, null, new Object[]{this})});
        this.V = (ViewGroup.LayoutParams) C0090.n(38702, null, new Object[]{(LinearLayout) C0090.n(4947, null, new Object[]{this})});
        this.W = (ViewGroup.LayoutParams) C0090.n(38702, null, new Object[]{(LinearLayout) C0090.n(66270, null, new Object[]{this})});
        this.X = (ViewGroup.LayoutParams) C0090.n(38702, null, new Object[]{(LinearLayout) C0090.n(96931, null, new Object[]{this})});
        this.Y = (ViewGroup.LayoutParams) C0090.n(38702, null, new Object[]{(LinearLayout) C0090.n(99692, null, new Object[]{this})});
        this.Z = (ViewGroup.LayoutParams) C0090.n(38702, null, new Object[]{(LinearLayout) C0090.n(5609, null, new Object[]{this})});
        this.b0 = (ScrollView) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0058.n(64207, null, new Object[0])})).intValue() ^ (2131236312 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0090.n(24601, null, new Object[0])})).intValue()))}));
        this.K = (TextView) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0090.n(40112, null, new Object[0])})).intValue() ^ (2131232869 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0090.n(71515, null, new Object[0])})).intValue()))}));
        this.a0 = new LinearLayout.LayoutParams(0, 0);
        C0032.n(37346, null, new Object[]{(LinearLayout.LayoutParams) C0082.n(97623, null, new Object[]{this}), 0, 0, 0, 0});
        try {
            try {
                C0032.n(84967, null, new Object[]{this});
            } catch (Exception e2) {
                C0066.n(62866, null, new Object[]{e2});
            }
            this.F = new ArrayList<>();
            this.H = new ArrayList<>();
            PrintStream printStream = (PrintStream) C0069.n(16882, null, new Object[0]);
            StringBuilder sb = new StringBuilder();
            C0050.n(77119, null, new Object[]{printStream, (String) C0104.n(48310, null, new Object[]{sb})});
            for (int i2 = 0; i2 < ((Integer) C0042.n(79139, null, new Object[]{this})).intValue(); i2++) {
                StringBuilder sb2 = new StringBuilder();
                if (((Boolean) C0066.n(48385, null, new Object[]{new File((String) C0104.n(48310, null, new Object[]{sb2}))})).booleanValue()) {
                    PrintStream printStream2 = (PrintStream) C0069.n(16882, null, new Object[0]);
                    StringBuilder sb3 = new StringBuilder();
                    C0050.n(77119, null, new Object[]{printStream2, (String) C0104.n(48310, null, new Object[]{sb3})});
                    C0032.n(55804, null, new Object[]{(ArrayList) C0067.n(29356, null, new Object[]{this})});
                    C0032.n(55804, null, new Object[]{(ArrayList) C0067.n(94321, null, new Object[]{this})});
                    ArrayList arrayList = (ArrayList) C0067.n(29356, null, new Object[]{this});
                    StringBuilder sb4 = new StringBuilder();
                    ((Boolean) C0032.n(23433, null, new Object[]{arrayList, (String[]) C0081.n(26018, null, new Object[]{(String) C0101.n(13801, null, new Object[]{(String) C0076.n(86703, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb4})})}), str})})).booleanValue();
                    StringBuilder sb5 = new StringBuilder();
                    this.G = (String[]) C0081.n(26018, null, new Object[]{(String) C0101.n(13801, null, new Object[]{(String) C0076.n(86703, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb5})})}), str});
                    if (((String[]) C0093.n(20059, null, new Object[]{this})).length != 0) {
                        try {
                            for (String str4 : (String[]) C0093.n(20059, null, new Object[]{this})) {
                                ArrayList arrayList2 = (ArrayList) C0067.n(94321, null, new Object[]{this});
                                StringBuilder sb6 = new StringBuilder();
                                ((Boolean) C0032.n(12599, null, new Object[]{arrayList2, (String) C0104.n(48310, null, new Object[]{sb6})})).booleanValue();
                            }
                        } catch (NumberFormatException e3) {
                            C0032.n(83193, null, new Object[]{e3});
                        }
                    }
                }
            }
        } catch (Exception e4) {
            C0066.n(62866, null, new Object[]{e4});
        }
        try {
        } catch (Exception e5) {
            C0066.n(62866, null, new Object[]{e5});
        }
        C0032.n(22650, null, new Object[]{(ListView) C0065.n(84015, null, new Object[]{this}), new i()});
        C0032.n(59039, null, new Object[]{(Spinner) C0067.n(59250, null, new Object[]{this}), new j()});
        C0032.n(59039, null, new Object[]{(Spinner) C0067.n(96491, null, new Object[]{this}), new k()});
        C0032.n(59039, null, new Object[]{(Spinner) C0051.n(6058, null, new Object[]{this}), new l()});
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        C0032.n(74168, null, new Object[]{(MenuInflater) C0032.n(88662, null, new Object[]{this}), Integer.valueOf(((Integer) C0104.n(62256, (Integer) new Object[]{new Integer(2131318213)}[0], new Object[0])).intValue() ^ 153029), menu});
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        i iVar = null;
        ScrollView scrollView = (ScrollView) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0032.n(78446, null, new Object[0])})).intValue() ^ 2131933619)}));
        if (scrollView != null) {
            C0092.n(30251, null, new Object[]{scrollView, 0, Integer.valueOf(((Integer) C0092.n(25279, null, new Object[]{scrollView})).intValue())});
        }
        if (((Integer) C0073.n(58832, null, new Object[]{this})).intValue() == 1) {
            ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) C0092.n(19132, null, new Object[]{this});
            layoutParams.height = 0;
            C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(66849, null, new Object[]{this}), layoutParams});
            C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(66849, null, new Object[]{this})});
        }
        if (((Integer) C0073.n(58832, null, new Object[]{this})).intValue() == 2) {
            ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) C0092.n(34704, null, new Object[]{this});
            layoutParams2.height = 0;
            C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(4947, null, new Object[]{this}), layoutParams2});
            C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(4947, null, new Object[]{this})});
        }
        if (((Integer) C0073.n(58832, null, new Object[]{this})).intValue() == 3) {
            ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) C0092.n(3717, null, new Object[]{this});
            layoutParams3.height = 0;
            C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(66270, null, new Object[]{this}), layoutParams3});
            C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(66270, null, new Object[]{this})});
        }
        if (((Integer) C0073.n(58832, null, new Object[]{this})).intValue() == 4) {
            ViewGroup.LayoutParams layoutParams4 = (ViewGroup.LayoutParams) C0092.n(15851, null, new Object[]{this});
            layoutParams4.height = 0;
            C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(96931, null, new Object[]{this}), layoutParams4});
            C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(96931, null, new Object[]{this})});
        }
        if (((Integer) C0073.n(58832, null, new Object[]{this})).intValue() == 5) {
            ViewGroup.LayoutParams layoutParams5 = (ViewGroup.LayoutParams) C0092.n(89786, null, new Object[]{this});
            layoutParams5.height = 0;
            C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(99692, null, new Object[]{this}), layoutParams5});
            C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(99692, null, new Object[]{this})});
        }
        if (((Integer) C0073.n(58832, null, new Object[]{this})).intValue() == 6) {
            ViewGroup.LayoutParams layoutParams6 = (ViewGroup.LayoutParams) C0092.n(43722, null, new Object[]{this});
            layoutParams6.height = 0;
            C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(5609, null, new Object[]{this}), layoutParams6});
            C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(5609, null, new Object[]{this})});
        }
        int intValue = ((Integer) C0092.n(19361, null, new Object[]{menuItem})).intValue();
        switch (intValue) {
            case R.id.buildPropITEM /* 2131230754 */:
                ViewGroup.LayoutParams layoutParams7 = (ViewGroup.LayoutParams) C0092.n(89786, null, new Object[]{this});
                layoutParams7.height = -2;
                C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(99692, null, new Object[]{this}), layoutParams7});
                C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(99692, null, new Object[]{this})});
                this.L = 5;
                if (((Integer) C0092.n(53707, null, new Object[]{this})).intValue() == 1) {
                }
                return true;
            case R.id.cpuITEM /* 2131230778 */:
                ViewGroup.LayoutParams layoutParams8 = (ViewGroup.LayoutParams) C0092.n(34704, null, new Object[]{this});
                layoutParams8.height = -2;
                C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(4947, null, new Object[]{this}), layoutParams8});
                C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(4947, null, new Object[]{this})});
                this.L = 2;
                return true;
            case R.id.performanceITEM /* 2131230826 */:
                ViewGroup.LayoutParams layoutParams9 = (ViewGroup.LayoutParams) C0092.n(19132, null, new Object[]{this});
                layoutParams9.height = -2;
                C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(66849, null, new Object[]{this}), layoutParams9});
                C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(66849, null, new Object[]{this})});
                this.L = 1;
                return true;
            case R.id.powerMenuITEM /* 2131230829 */:
                ViewGroup.LayoutParams layoutParams10 = (ViewGroup.LayoutParams) C0092.n(3717, null, new Object[]{this});
                layoutParams10.height = -2;
                C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(66270, null, new Object[]{this}), layoutParams10});
                C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(66270, null, new Object[]{this})});
                this.L = 3;
                return true;
            case R.id.systemDetailsITEM /* 2131230867 */:
                ViewGroup.LayoutParams layoutParams11 = (ViewGroup.LayoutParams) C0092.n(15851, null, new Object[]{this});
                layoutParams11.height = -2;
                C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(96931, null, new Object[]{this}), layoutParams11});
                C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(96931, null, new Object[]{this})});
                this.L = 4;
                if (((Integer) C0092.n(28921, null, new Object[]{this})).intValue() == 1) {
                }
                return true;
            case R.id.terminalITEM /* 2131230873 */:
                ViewGroup.LayoutParams layoutParams12 = (ViewGroup.LayoutParams) C0092.n(43722, null, new Object[]{this});
                layoutParams12.height = -2;
                C0092.n(5923, null, new Object[]{(LinearLayout) C0090.n(5609, null, new Object[]{this}), layoutParams12});
                C0092.n(67167, null, new Object[]{(LinearLayout) C0090.n(5609, null, new Object[]{this})});
                this.L = 6;
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // abx.b.c.a.f, android.app.Activity
    public void onPause() {
        super.onPause();
        C0094.n(32837, null, new Object[]{this});
        if (((Integer) C0087.n(75251, null, new Object[0])).intValue() >= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Double) C0087.n(71232, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0094.n(24031)})})});
        }
    }

    @Override // abx.b.c.a.f, android.app.Activity
    public void onResume() {
        super.onResume();
        C0094.n(11262, null, new Object[]{this});
        if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Integer) C0048.n(9605, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0094.n(23935)})})});
        }
    }

    public void p() {
        Object[] objArr = {new Integer(2065620), new Integer(-1139878)};
        ListAdapter listAdapter = (ListAdapter) C0094.n(74378, null, new Object[]{(ListView) C0065.n(84015, null, new Object[]{this})});
        int intValue = ((Integer) C0094.n(43537, null, new Object[]{listAdapter})).intValue();
        int i2 = 0;
        for (int i3 = 0; i3 < intValue; i3 = (((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 2065621) + i3) {
            View view = (View) C0094.n(65660, null, new Object[]{listAdapter, Integer.valueOf(i3), null, (ListView) C0065.n(84015, null, new Object[]{this})});
            C0094.n(53138, null, new Object[]{view, 0, 0});
            i2 += ((Integer) C0094.n(62727, null, new Object[]{view})).intValue();
        }
        int intValue2 = ((Integer) C0094.n(97716, null, new Object[]{(ListView) C0065.n(84015, null, new Object[]{this})})).intValue();
        int intValue3 = ((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) C0094.n(38793, null, new Object[]{(ListView) C0065.n(84015, null, new Object[]{this})});
        layoutParams.height = (intValue2 * ((intValue3 ^ 1139877) + intValue)) + i2;
        C0101.n(46515, null, new Object[]{this, new o(layoutParams)});
    }

    public void q() {
        C0101.n(46515, null, new Object[]{this, new c()});
    }

    public void r() {
        String str;
        int i2;
        Long l2 = new Long(4896821L);
        int i3 = 0;
        while (true) {
            int i4 = i3;
            int intValue = ((Integer) C0042.n(79139, null, new Object[]{this})).intValue();
            str = (String) C0080.n(94289, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0093.n(48545, null, new Object[0])})).intValue() ^ 1753190), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0103.n(69017, null, new Object[0])})).intValue() ^ 1753619), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0047.n(37176, null, new Object[0])})).intValue() ^ 1752901)});
            if (i4 >= intValue) {
                i2 = 1;
                break;
            }
            StringBuilder sb = new StringBuilder();
            if (((Boolean) C0030.n(68527, null, new Object[]{new File((String) C0104.n(48310, null, new Object[]{sb}))})).booleanValue()) {
                i2 = i4;
                break;
            }
            i3 = i4 + 1;
        }
        if (i2 == 10) {
            return;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String str2 = (String) C0076.n(86703, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb2})});
            StringBuilder sb3 = new StringBuilder();
            int intValue2 = ((Integer) C0033.n(61251, null, new Object[]{(String) C0076.n(86703, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb3})})})).intValue() / 1000;
            StringBuilder sb4 = new StringBuilder();
            int intValue3 = ((Integer) C0033.n(61251, null, new Object[]{(String) C0076.n(86703, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb4})})})).intValue() / 1000;
            while (true) {
                if (str2 != null && ((ArrayList) C0067.n(29356, null, new Object[]{this})) != null && ((ArrayList) C0067.n(94321, null, new Object[]{this})) != null && intValue2 != 0 && intValue3 != 0) {
                    PrintStream printStream = (PrintStream) C0069.n(16882, null, new Object[0]);
                    StringBuilder sb5 = new StringBuilder();
                    C0050.n(77119, null, new Object[]{printStream, (String) C0104.n(48310, null, new Object[]{sb5})});
                    PrintStream printStream2 = (PrintStream) C0069.n(16882, null, new Object[0]);
                    StringBuilder sb6 = new StringBuilder();
                    C0050.n(77119, null, new Object[]{printStream2, (String) C0104.n(48310, null, new Object[]{sb6})});
                    PrintStream printStream3 = (PrintStream) C0069.n(16882, null, new Object[0]);
                    StringBuilder sb7 = new StringBuilder();
                    C0050.n(77119, null, new Object[]{printStream3, (String) C0104.n(48310, null, new Object[]{sb7})});
                    C0101.n(46515, null, new Object[]{this, new d(str2, intValue3, intValue2)});
                    return;
                }
                try {
                    C0078.n(42025, null, new Object[]{Long.valueOf(((Long) C0078.n(19087, (Long) new Object[]{l2}[0], new Object[0])).longValue() ^ 4896775)});
                } catch (RuntimeException e2) {
                    C0034.n(42910, null, new Object[]{e2});
                }
            }
        } catch (Exception e3) {
            C0066.n(62866, null, new Object[]{e3});
        }
    }

    public void runUserCommand_method(View view) {
    }

    public void s() {
        this.p = false;
        if (!((Boolean) C0066.n(63620, null, new Object[0])).booleanValue()) {
            C0050.n(77119, null, new Object[]{(PrintStream) C0069.n(16882, null, new Object[0]), (String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0045.n(92500, null, new Object[0])})).intValue() ^ 1756942), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0038.n(92034, null, new Object[0])})).intValue() ^ 1753626), Integer.valueOf(1756515 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0075.n(19068, null, new Object[0])})).intValue())})});
            ((Boolean) C0099.n(16658, null, new Object[0])).booleanValue();
        }
        String str = (String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0086.n(35621, null, new Object[0])})).intValue() ^ 1751104), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0061.n(82934, null, new Object[0])})).intValue() ^ 1749707), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0075.n(37188, null, new Object[0])})).intValue() ^ 1751994)});
        if (!((Boolean) C0065.n(85590, null, new Object[]{new File(str)})).booleanValue() || ((Boolean) C0099.n(64527, null, new Object[]{(String) C0076.n(86703, null, new Object[]{str}), (String) C0080.n(30516, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0084.n(78185, null, new Object[0])})).intValue() ^ 1748464), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0106.n(2317, null, new Object[0])})).intValue() ^ 56329), Integer.valueOf(1755894 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0075.n(9526, null, new Object[0])})).intValue())})})).booleanValue()) {
            C0101.n(46515, null, new Object[]{this, new n()});
        } else {
            C0101.n(46515, null, new Object[]{this, new m()});
        }
        ((Boolean) C0101.n(92794, null, new Object[0])).booleanValue();
        this.c0 = (String) C0075.n(95523, null, new Object[]{(SharedPreferences) C0075.n(69391, null, new Object[]{this}), (String) C0080.n(30516, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0109.n(51702, null, new Object[0])})).intValue() ^ 1748406), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0041.n(11902, null, new Object[0])})).intValue() ^ 1751782), Integer.valueOf(1755361 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0061.n(86145, null, new Object[0])})).intValue())}), (String) C0096.n(48052, null, new Object[]{this})});
    }

    public void t() {
        C0075.n(14225, null, new Object[]{new Thread(new g())});
    }

    public void u() {
        C0075.n(14225, null, new Object[]{new Thread(new f((ProgressBar) ((View) C0105.n(48137, null, new Object[]{this, Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0075.n(82477, null, new Object[0])})).intValue() ^ 2131936759)}))))});
        if (((Integer) C0104.n(8569, null, new Object[0])).intValue() <= 0) {
            C0104.n(86877, (PrintStream) C0104.n(12888), new Object[]{(Float) C0109.n(13581, null, new Object[]{(String) C0082.n(59112, null, new Object[]{(String) C0075.n(84970)})})});
        }
    }

    public void v() {
        this.p = true;
        SharedPreferences.Editor editor = (SharedPreferences.Editor) C0075.n(75028, null, new Object[]{(SharedPreferences) C0075.n(69391, null, new Object[]{this})});
        C0046.n(12848, null, new Object[]{editor});
        StringBuilder sb = new StringBuilder();
        C0104.n(73601, null, new Object[]{(String) C0104.n(48310, null, new Object[]{sb})});
    }

    public void xml_method_cpu0Click(View view) {
        Integer num = new Integer(2139911777);
        C0076.n(20289, null, new Object[]{((ToggleButton[]) C0058.n(39331, null, new Object[]{this}))[0], true});
        C0055.n(35870, null, new Object[]{this, Integer.valueOf(((Integer) C0104.n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 8484449), this, 0});
    }

    public void xml_method_toggle_cpu_n(View view) {
        int i2;
        Object[] objArr = {new Integer(9213319), new Integer(8914064), new Integer(21692258), new Integer(7971638)};
        StringBuilder sb = (StringBuilder) C0071.n(81489, null, new Object[]{(String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0101.n(89419, null, new Object[0])})).intValue() ^ 1749023), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0041.n(7051, null, new Object[0])})).intValue() ^ 1755370), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0046.n(40998, null, new Object[0])})).intValue() ^ 1750274)})});
        CharSequence charSequence = (CharSequence) C0046.n(73709, null, new Object[]{(ToggleButton) view});
        int intValue = 8914070 ^ ((Integer) C0104.n(62256, (Integer) objArr[1], new Object[0])).intValue();
        int intValue2 = 9213316 ^ ((Integer) C0104.n(62256, (Integer) objArr[0], new Object[0])).intValue();
        String str = (String) C0104.n(48310, null, new Object[]{sb});
        int intValue3 = 7971639 ^ ((Integer) C0104.n(62256, (Integer) objArr[3], new Object[0])).intValue();
        try {
            i2 = ((Integer) C0033.n(61251, null, new Object[]{(String) C0101.n(13801, null, new Object[]{(String) C0046.n(64597, null, new Object[]{(CharSequence) C0046.n(57376, null, new Object[]{(CharSequence) C0046.n(73709, null, new Object[]{(ToggleButton) view}), Integer.valueOf(intValue2), Integer.valueOf(intValue)})})})})).intValue() - intValue3;
        } catch (NumberFormatException e2) {
            C0032.n(83193, null, new Object[]{e2});
            C0050.n(77119, null, new Object[]{(PrintStream) C0038.n(32739, null, new Object[0]), str});
            i2 = -1;
        }
        if (i2 != -1) {
            s sVar = new s(null);
            Integer[] numArr = new Integer[intValue3];
            numArr[0] = (Integer) C0063.n(11703, null, new Object[]{Integer.valueOf(i2)});
        } else {
            AlertDialog.Builder builder = (AlertDialog.Builder) C0044.n(35951, null, new Object[]{(AlertDialog.Builder) C0044.n(54142, null, new Object[]{new AlertDialog.Builder(this), Integer.valueOf(((Integer) C0104.n(62256, (Integer) objArr[2], new Object[0])).intValue() ^ 4390725)}), (String) C0080.n(26264, null, new Object[]{(short[]) C0049.n(98506, null, new Object[0]), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0093.n(21891, null, new Object[0])})).intValue() ^ 1756793), Integer.valueOf(((Integer) C0080.n(52141, null, new Object[]{(String) C0046.n(48951, null, new Object[0])})).intValue() ^ 1747833), Integer.valueOf(1757177 ^ ((Integer) C0080.n(52141, null, new Object[]{(String) C0046.n(5081, null, new Object[0])})).intValue())})});
            StringBuilder sb2 = new StringBuilder();
        }
        if (((Integer) C0043.n(78567, null, new Object[0])).intValue() >= 0) {
            C0048.n(47446, (PrintStream) C0104.n(12888), new Object[]{Long.valueOf(((Long) C0048.n(90189, null, new Object[]{(String) C0104.n(11011, null, new Object[]{(String) C0064.n(53276)})})).longValue())});
        }
    }
}
