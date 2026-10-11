package p038c.p042b;

import com.rootify.C0402;
import com.rootify.C0408;
import com.rootify.C0419;
import com.rootify.C0425;
import com.rootify.C0431;
import com.rootify.C0433;
import com.rootify.C0443;
import com.rootify.C0446;
import com.rootify.C0447;
import com.rootify.C0452;
import com.rootify.C0453;
import com.rootify.C0456;
import com.rootify.C0462;
import com.rootify.C0464;
import com.rootify.C0466;
import com.rootify.C0469;
import com.rootify.C0474;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: c.b.p */
/* loaded from: classes.dex */
public final class C0351p {

    /* renamed from: a */
    public static boolean f2024a;

    /* renamed from: b */
    public static Runtime f2025b;

    /* renamed from: c */
    public static Process f2026c;

    /* renamed from: d */
    public static DataOutputStream f2027d;

    /* renamed from: e */
    public static InputStream f2028e;

    /* renamed from: f */
    public static DataInputStream f2029f;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f2372short;

    static {
        short[] sArr = new short[((Integer) C0469.m1839n(62256, (Integer) new Object[]{new Integer(2038310)}[0], new Object[0])).intValue() ^ 2037760];
        sArr[0] = 1011;
        sArr[1] = 2388;
        sArr[2] = 2327;
        sArr[3] = 2325;
        sArr[4] = 2304;
        sArr[5] = 2388;
        sArr[6] = 2387;
        sArr[7] = 2982;
        sArr[8] = 2977;
        sArr[9] = 3007;
        sArr[10] = 2983;
        sArr[11] = 2992;
        sArr[12] = 256;
        sArr[13] = 262;
        sArr[14] = 1195;
        sArr[15] = 1197;
        sArr[16] = 1190;
        sArr[17] = 1185;
        sArr[18] = 1262;
        sArr[19] = 1257;
        sArr[20] = 1166;
        sArr[21] = 1261;
        sArr[22] = 1166;
        sArr[23] = 1252;
        sArr[24] = 1252;
        sArr[25] = 1252;
        sArr[26] = 1197;
        sArr[27] = 1187;
        sArr[28] = 1194;
        sArr[29] = 1163;
        sArr[30] = 1184;
        sArr[31] = 1194;
        sArr[32] = 1213;
        sArr[33] = 1180;
        sArr[34] = 1185;
        sArr[35] = 1185;
        sArr[36] = 1210;
        sArr[37] = 1191;
        sArr[38] = 1192;
        sArr[39] = 1207;
        sArr[40] = 1252;
        sArr[41] = 1252;
        sArr[42] = 1252;
        sArr[43] = 1166;
        sArr[44] = 1261;
        sArr[45] = 1166;
        sArr[46] = 1257;
        sArr[47] = 2960;
        sArr[48] = 3059;
        sArr[49] = 2960;
        sArr[50] = 3066;
        sArr[51] = 3066;
        sArr[52] = 3066;
        sArr[53] = 2995;
        sArr[54] = 3005;
        sArr[55] = 2996;
        sArr[56] = 2965;
        sArr[57] = 3006;
        sArr[58] = 2996;
        sArr[59] = 2979;
        sArr[60] = 2946;
        sArr[61] = 3007;
        sArr[62] = 3007;
        sArr[63] = 2980;
        sArr[64] = 3001;
        sArr[65] = 2998;
        sArr[66] = 2985;
        sArr[67] = 3066;
        sArr[68] = 3066;
        sArr[69] = 3066;
        sArr[70] = 2960;
        sArr[71] = 3059;
        sArr[72] = 2960;
        sArr[73] = 535;
        sArr[74] = 512;
        sArr[75] = 512;
        sArr[76] = 541;
        sArr[77] = 512;
        sArr[78] = 616;
        sArr[79] = 626;
        sArr[80] = 564;
        sArr[81] = 571;
        sArr[82] = 574;
        sArr[83] = 567;
        sArr[84] = 626;
        sArr[85] = 624;
        sArr[86] = 867;
        sArr[87] = 865;
        sArr[88] = 805;
        sArr[89] = 814;
        sArr[90] = 804;
        sArr[91] = 818;
        sArr[92] = 865;
        sArr[93] = 815;
        sArr[94] = 814;
        sArr[95] = 821;
        sArr[96] = 865;
        sArr[97] = 804;
        sArr[98] = 825;
        sArr[99] = 808;
        sArr[100] = 818;
        sArr[101] = 821;
        sArr[102] = 865;
        sArr[103] = 814;
        sArr[104] = 819;
        sArr[105] = 865;
        sArr[106] = 817;
        sArr[107] = 804;
        sArr[108] = 819;
        sArr[109] = 812;
        sArr[110] = 808;
        sArr[111] = 818;
        sArr[112] = 818;
        sArr[113] = 808;
        sArr[114] = 814;
        sArr[115] = 815;
        sArr[116] = 865;
        sArr[117] = 805;
        sArr[118] = 804;
        sArr[119] = 815;
        sArr[120] = 808;
        sArr[121] = 804;
        sArr[122] = 805;
        sArr[123] = 879;
        sArr[124] = 582;
        sArr[125] = 593;
        sArr[126] = 593;
        sArr[127] = 588;
        sArr[128] = 593;
        sArr[129] = 569;
        sArr[130] = 547;
        sArr[131] = 613;
        sArr[132] = 618;
        sArr[133] = 623;
        sArr[134] = 614;
        sArr[135] = 547;
        sArr[136] = 545;
        sArr[137] = 1138;
        sArr[138] = 1136;
        sArr[139] = 1076;
        sArr[140] = 1087;
        sArr[141] = 1077;
        sArr[142] = 1059;
        sArr[143] = 1136;
        sArr[144] = 1086;
        sArr[145] = 1087;
        sArr[146] = 1060;
        sArr[147] = 1136;
        sArr[148] = 1077;
        sArr[149] = 1064;
        sArr[150] = 1081;
        sArr[151] = 1059;
        sArr[152] = 1060;
        sArr[153] = 1136;
        sArr[154] = 1087;
        sArr[155] = 1058;
        sArr[156] = 1136;
        sArr[157] = 1056;
        sArr[158] = 1077;
        sArr[159] = 1058;
        sArr[160] = 1085;
        sArr[161] = 1081;
        sArr[162] = 1059;
        sArr[163] = 1059;
        sArr[164] = 1081;
        sArr[165] = 1087;
        sArr[166] = 1086;
        sArr[167] = 1136;
        sArr[168] = 1076;
        sArr[169] = 1077;
        sArr[170] = 1086;
        sArr[171] = 1081;
        sArr[172] = 1077;
        sArr[173] = 1076;
        sArr[174] = 1150;
        sArr[175] = 329;
        sArr[176] = 282;
        sArr[177] = 268;
        sArr[178] = 269;
        sArr[179] = 329;
        sArr[180] = 324;
        sArr[181] = 263;
        sArr[182] = 329;
        sArr[183] = 334;
        sArr[184] = 344;
        sArr[185] = 325;
        sArr[186] = 344;
        sArr[187] = 329;
        sArr[188] = 281;
        sArr[189] = 334;
        sArr[190] = 329;
        sArr[191] = 334;
        sArr[192] = 1972;
        sArr[193] = 2238;
        sArr[194] = 2257;
        sArr[195] = 2263;
        sArr[196] = 2268;
        sArr[197] = 2267;
        sArr[198] = 2196;
        sArr[199] = 2195;
        sArr[200] = 2292;
        sArr[201] = 2199;
        sArr[202] = 2292;
        sArr[203] = 2206;
        sArr[204] = 2206;
        sArr[205] = 2206;
        sArr[206] = 2263;
        sArr[207] = 2265;
        sArr[208] = 2256;
        sArr[209] = 2289;
        sArr[210] = 2266;
        sArr[211] = 2256;
        sArr[212] = 2247;
        sArr[213] = 2278;
        sArr[214] = 2267;
        sArr[215] = 2267;
        sArr[216] = 2240;
        sArr[217] = 2269;
        sArr[218] = 2258;
        sArr[219] = 2253;
        sArr[220] = 2206;
        sArr[221] = 2206;
        sArr[222] = 2206;
        sArr[223] = 2292;
        sArr[224] = 2199;
        sArr[225] = 2292;
        sArr[226] = 2195;
        sArr[227] = 2238;
        sArr[228] = 2257;
        sArr[229] = 2263;
        sArr[230] = 2268;
        sArr[231] = 2267;
        sArr[232] = 2196;
        sArr[233] = 2195;
        sArr[234] = 2292;
        sArr[235] = 2199;
        sArr[236] = 2292;
        sArr[237] = 2206;
        sArr[238] = 2206;
        sArr[239] = 2206;
        sArr[240] = 2263;
        sArr[241] = 2265;
        sArr[242] = 2256;
        sArr[243] = 2289;
        sArr[244] = 2266;
        sArr[245] = 2256;
        sArr[246] = 2247;
        sArr[247] = 2278;
        sArr[248] = 2267;
        sArr[249] = 2267;
        sArr[250] = 2240;
        sArr[251] = 2269;
        sArr[252] = 2258;
        sArr[253] = 2253;
        sArr[254] = 2206;
        sArr[255] = 2206;
        sArr[256] = 2206;
        sArr[257] = 2292;
        sArr[258] = 2199;
        sArr[259] = 2292;
        sArr[260] = 2195;
        sArr[261] = 2196;
        sArr[262] = 2186;
        sArr[263] = 2194;
        sArr[264] = 2182;
        sArr[265] = 2238;
        sArr[266] = 2481;
        sArr[267] = 2514;
        sArr[268] = 2481;
        sArr[269] = 2523;
        sArr[270] = 2523;
        sArr[271] = 2523;
        sArr[272] = 2450;
        sArr[273] = 2460;
        sArr[274] = 2453;
        sArr[275] = 2484;
        sArr[276] = 2463;
        sArr[277] = 2453;
        sArr[278] = 2434;
        sArr[279] = 2467;
        sArr[280] = 2462;
        sArr[281] = 2462;
        sArr[282] = 2437;
        sArr[283] = 2456;
        sArr[284] = 2455;
        sArr[285] = 2440;
        sArr[286] = 2523;
        sArr[287] = 2523;
        sArr[288] = 2523;
        sArr[289] = 2481;
        sArr[290] = 2514;
        sArr[291] = 2481;
        sArr[292] = 1774;
        sArr[293] = 1778;
        sArr[294] = 2588;
        sArr[295] = 2560;
        sArr[296] = 1722;
        sArr[297] = 1749;
        sArr[298] = 1747;
        sArr[299] = 1752;
        sArr[300] = 1759;
        sArr[301] = 1680;
        sArr[302] = 1687;
        sArr[303] = 1776;
        sArr[304] = 1683;
        sArr[305] = 1776;
        sArr[306] = 1690;
        sArr[307] = 1690;
        sArr[308] = 1690;
        sArr[309] = 1747;
        sArr[310] = 1757;
        sArr[311] = 1748;
        sArr[312] = 1781;
        sArr[313] = 1758;
        sArr[314] = 1748;
        sArr[315] = 1731;
        sArr[316] = 1762;
        sArr[317] = 1759;
        sArr[318] = 1759;
        sArr[319] = 1732;
        sArr[320] = 1753;
        sArr[321] = 1750;
        sArr[322] = 1737;
        sArr[323] = 1690;
        sArr[324] = 1690;
        sArr[325] = 1690;
        sArr[326] = 1776;
        sArr[327] = 1683;
        sArr[328] = 1776;
        sArr[329] = 1687;
        sArr[330] = 1722;
        sArr[331] = 1749;
        sArr[332] = 1747;
        sArr[333] = 1752;
        sArr[334] = 1759;
        sArr[335] = 1680;
        sArr[336] = 1687;
        sArr[337] = 1776;
        sArr[338] = 1683;
        sArr[339] = 1776;
        sArr[340] = 1690;
        sArr[341] = 1690;
        sArr[342] = 1690;
        sArr[343] = 1747;
        sArr[344] = 1757;
        sArr[345] = 1748;
        sArr[346] = 1781;
        sArr[347] = 1758;
        sArr[348] = 1748;
        sArr[349] = 1731;
        sArr[350] = 1762;
        sArr[351] = 1759;
        sArr[352] = 1759;
        sArr[353] = 1732;
        sArr[354] = 1753;
        sArr[355] = 1750;
        sArr[356] = 1737;
        sArr[357] = 1690;
        sArr[358] = 1690;
        sArr[359] = 1690;
        sArr[360] = 1776;
        sArr[361] = 1683;
        sArr[362] = 1776;
        sArr[363] = 1687;
        sArr[364] = 1680;
        sArr[365] = 1678;
        sArr[366] = 1686;
        sArr[367] = 1666;
        sArr[368] = 1722;
        sArr[369] = 3146;
        sArr[370] = 3113;
        sArr[371] = 3146;
        sArr[372] = 3104;
        sArr[373] = 3104;
        sArr[374] = 3104;
        sArr[375] = 3177;
        sArr[376] = 3175;
        sArr[377] = 3182;
        sArr[378] = 3151;
        sArr[379] = 3172;
        sArr[380] = 3182;
        sArr[381] = 3193;
        sArr[382] = 3160;
        sArr[383] = 3173;
        sArr[384] = 3173;
        sArr[385] = 3198;
        sArr[386] = 3171;
        sArr[387] = 3180;
        sArr[388] = 3187;
        sArr[389] = 3104;
        sArr[390] = 3104;
        sArr[391] = 3104;
        sArr[392] = 3146;
        sArr[393] = 3113;
        sArr[394] = 3146;
        sArr[395] = 1136;
        sArr[396] = 1043;
        sArr[397] = 1136;
        sArr[398] = 1050;
        sArr[399] = 1050;
        sArr[400] = 1050;
        sArr[401] = 1107;
        sArr[402] = 1117;
        sArr[403] = 1108;
        sArr[404] = 1141;
        sArr[405] = 1118;
        sArr[406] = 1108;
        sArr[407] = 1091;
        sArr[408] = 1122;
        sArr[409] = 1119;
        sArr[410] = 1119;
        sArr[411] = 1092;
        sArr[412] = 1113;
        sArr[413] = 1110;
        sArr[414] = 1097;
        sArr[415] = 1050;
        sArr[416] = 1050;
        sArr[417] = 1050;
        sArr[418] = 1136;
        sArr[419] = 1043;
        sArr[420] = 1136;
        sArr[421] = 3196;
        sArr[422] = 3091;
        sArr[423] = 3093;
        sArr[424] = 3102;
        sArr[425] = 3097;
        sArr[426] = 3158;
        sArr[427] = 3153;
        sArr[428] = 3126;
        sArr[429] = 3157;
        sArr[430] = 3126;
        sArr[431] = 3164;
        sArr[432] = 3164;
        sArr[433] = 3164;
        sArr[434] = 3093;
        sArr[435] = 3099;
        sArr[436] = 3090;
        sArr[437] = 3123;
        sArr[438] = 3096;
        sArr[439] = 3090;
        sArr[440] = 3077;
        sArr[441] = 3108;
        sArr[442] = 3097;
        sArr[443] = 3097;
        sArr[444] = 3074;
        sArr[445] = 3103;
        sArr[446] = 3088;
        sArr[447] = 3087;
        sArr[448] = 3164;
        sArr[449] = 3164;
        sArr[450] = 3164;
        sArr[451] = 3126;
        sArr[452] = 3157;
        sArr[453] = 3126;
        sArr[454] = 3153;
        sArr[455] = 3196;
        sArr[456] = 3091;
        sArr[457] = 3093;
        sArr[458] = 3102;
        sArr[459] = 3097;
        sArr[460] = 3158;
        sArr[461] = 3153;
        sArr[462] = 3126;
        sArr[463] = 3157;
        sArr[464] = 3126;
        sArr[465] = 3164;
        sArr[466] = 3164;
        sArr[467] = 3164;
        sArr[468] = 3093;
        sArr[469] = 3099;
        sArr[470] = 3090;
        sArr[471] = 3123;
        sArr[472] = 3096;
        sArr[473] = 3090;
        sArr[474] = 3077;
        sArr[475] = 3108;
        sArr[476] = 3097;
        sArr[477] = 3097;
        sArr[478] = 3074;
        sArr[479] = 3103;
        sArr[480] = 3088;
        sArr[481] = 3087;
        sArr[482] = 3164;
        sArr[483] = 3164;
        sArr[484] = 3164;
        sArr[485] = 3126;
        sArr[486] = 3157;
        sArr[487] = 3126;
        sArr[488] = 3153;
        sArr[489] = 3158;
        sArr[490] = 3144;
        sArr[491] = 3152;
        sArr[492] = 3140;
        sArr[493] = 3196;
        sArr[494] = 890;
        sArr[495] = 2752;
        sArr[496] = 2723;
        sArr[497] = 2752;
        sArr[498] = 2730;
        sArr[499] = 2730;
        sArr[500] = 2730;
        sArr[501] = 2787;
        sArr[502] = 2797;
        sArr[503] = 2788;
        sArr[504] = 2757;
        sArr[505] = 2798;
        sArr[506] = 2788;
        sArr[507] = 2803;
        sArr[508] = 2770;
        sArr[509] = 2799;
        sArr[510] = 2799;
        sArr[511] = 2804;
        sArr[512] = 2793;
        sArr[513] = 2790;
        sArr[514] = 2809;
        sArr[515] = 2730;
        sArr[516] = 2730;
        sArr[517] = 2730;
        sArr[518] = 2752;
        sArr[519] = 2723;
        sArr[520] = 2752;
        sArr[521] = 2479;
        sArr[522] = 1844;
        sArr[523] = 2010;
        sArr[524] = 1977;
        sArr[525] = 2010;
        sArr[526] = 1968;
        sArr[527] = 1968;
        sArr[528] = 1968;
        sArr[529] = 2041;
        sArr[530] = 2039;
        sArr[531] = 2046;
        sArr[532] = 2015;
        sArr[533] = 2036;
        sArr[534] = 2046;
        sArr[535] = 2025;
        sArr[536] = 1992;
        sArr[537] = 2037;
        sArr[538] = 2037;
        sArr[539] = 2030;
        sArr[540] = 2035;
        sArr[541] = 2044;
        sArr[542] = 2019;
        sArr[543] = 1968;
        sArr[544] = 1968;
        sArr[545] = 1968;
        sArr[546] = 2010;
        sArr[547] = 1977;
        sArr[548] = 2010;
        sArr[549] = 789;
        f2372short = sArr;
        f2025b = (Runtime) C0402.m1254n(34424, null, new Object[0]);
        f2026c = null;
        f2027d = null;
        f2028e = null;
        f2029f = null;
    }

    /* renamed from: a */
    public static String m1137a(String str) {
        String str2;
        synchronized (C0351p.class) {
            try {
                File file = new File(str);
                StringBuilder sb = new StringBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        String str3 = (String) C0402.m1254n(52143, null, new Object[]{bufferedReader});
                        if (str3 == null) {
                            break;
                        }
                    }
                    C0402.m1254n(24215, null, new Object[]{bufferedReader});
                } catch (IOException e) {
                    C0402.m1254n(15892, null, new Object[]{e});
                    C0402.m1254n(33732, null, new Object[]{sb, 0});
                }
                if (((Integer) C0402.m1254n(42079, null, new Object[]{sb})).intValue() == 0 || ((Boolean) C0402.m1254n(73611, null, new Object[]{(String) C0466.m1812n(13801, null, new Object[]{(String) C0469.m1839n(48310, null, new Object[]{sb})}), (String) C0462.m1785n(93145, null, new Object[0])})).booleanValue()) {
                    StringBuilder sb2 = new StringBuilder();
                    str2 = (String) C0466.m1812n(13801, null, new Object[]{(String) C0469.m1839n(48310, null, new Object[]{((StringBuilder[]) C0443.m1614n(35629, null, new Object[]{(String) C0469.m1839n(48310, null, new Object[]{sb2})}))[0]})});
                } else {
                    str2 = (String) C0466.m1812n(13801, null, new Object[]{(String) C0469.m1839n(48310, null, new Object[]{sb})});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static boolean m1138a() {
        Long l = new Long(5713576L);
        synchronized (C0351p.class) {
            try {
                f2024a = false;
                try {
                    f2026c = (Process) C0443.m1614n(78370, null, new Object[]{(Runtime) C0443.m1614n(19917, null, new Object[0]), (String) C0443.m1614n(2880, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0443.m1614n(99899, null, new Object[0])})).intValue() ^ 1747722), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0443.m1614n(34768, null, new Object[0])})).intValue() ^ 1748766), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0443.m1614n(15366, null, new Object[0])})).intValue() ^ 1936)})});
                    C0443.m1614n(56248, null, new Object[0]);
                    for (int i = 0; i < 5 && (((Process) C0443.m1614n(10625, null, new Object[0])) == null || ((InputStream) C0443.m1614n(38964, null, new Object[0])) == null || ((DataOutputStream) C0443.m1614n(58815, null, new Object[0])) == null || ((DataInputStream) C0443.m1614n(26040, null, new Object[0])) == null); i++) {
                        C0443.m1614n(42025, null, new Object[]{Long.valueOf(((Long) C0443.m1614n(19087, (Long) new Object[]{l}[0], new Object[0])).longValue() ^ 5713504)});
                    }
                    if (((Boolean) C0402.m1254n(73611, null, new Object[]{(String) C0469.m1839n(48310, null, new Object[]{((StringBuilder[]) C0443.m1614n(35629, null, new Object[]{(String) C0443.m1614n(25707, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0474.m1875n(40809, null, new Object[0])})).intValue() ^ 1750704), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0431.m1506n(27243, null, new Object[0])})).intValue() ^ 1752740), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0431.m1506n(87502, null, new Object[0])})).intValue() ^ 1748975)})}))[0]}), (String) C0443.m1614n(2880, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0431.m1506n(75953, null, new Object[0])})).intValue() ^ 1752518), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0431.m1506n(90021, null, new Object[0])})).intValue() ^ 1750629), Integer.valueOf(1745010 ^ ((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0431.m1506n(69678, null, new Object[0])})).intValue())})})).booleanValue()) {
                        f2024a = true;
                    } else if (((Boolean) C0431.m1506n(63620, null, new Object[0])).booleanValue() && ((Process) C0443.m1614n(10625, null, new Object[0])) != null && ((InputStream) C0443.m1614n(38964, null, new Object[0])) != null && ((DataOutputStream) C0443.m1614n(58815, null, new Object[0])) != null && ((DataInputStream) C0443.m1614n(26040, null, new Object[0])) != null) {
                        f2024a = true;
                    }
                } catch (Exception e) {
                    C0431.m1506n(62866, null, new Object[]{e});
                }
                ((Boolean) C0466.m1812n(92794, null, new Object[0])).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m1139b(String str) {
        String str2;
        synchronized (C0351p.class) {
            try {
                File file = new File(str);
                if (((Boolean) C0431.m1506n(48385, null, new Object[]{file})).booleanValue()) {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    String str3 = (String) C0402.m1254n(52143, null, new Object[]{bufferedReader});
                    C0402.m1254n(24215, null, new Object[]{bufferedReader});
                    str2 = (String) C0466.m1812n(13801, null, new Object[]{str3});
                } else {
                    StringBuilder sb = new StringBuilder();
                    str2 = (String) C0469.m1839n(48310, null, new Object[]{sb});
                }
            } catch (IOException e) {
                C0402.m1254n(15892, null, new Object[]{e});
                str2 = (String) C0466.m1812n(13801, null, new Object[]{(String) C0431.m1506n(83831, null, new Object[]{str})});
            } finally {
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static void m1140b() {
        synchronized (C0351p.class) {
            try {
                C0431.m1506n(45399, null, new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public static String m1141c(String str) {
        String str2;
        Integer num = new Integer(1212573);
        synchronized (C0351p.class) {
            try {
                if (((Boolean) C0431.m1506n(48385, null, new Object[]{new File(str)})).booleanValue()) {
                    try {
                        DataOutputStream dataOutputStream = (DataOutputStream) C0443.m1614n(58815, null, new Object[0]);
                        StringBuilder sb = new StringBuilder();
                        C0419.m1407n(3443, null, new Object[]{dataOutputStream, (byte[]) C0419.m1407n(88740, null, new Object[]{(String) C0469.m1839n(48310, null, new Object[]{sb})})});
                        C0419.m1407n(98187, null, new Object[]{(DataOutputStream) C0443.m1614n(58815, null, new Object[0])});
                        byte[] bArr = new byte[((Integer) C0469.m1839n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 1216669];
                        str2 = ((Boolean) C0464.m1794n(64527, null, new Object[]{new String(bArr, 0, ((Integer) C0419.m1407n(95011, null, new Object[]{(InputStream) C0443.m1614n(38964, null, new Object[0]), bArr})).intValue()), (String) C0443.m1614n(2880, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0464.m1794n(28863, null, new Object[0])})).intValue() ^ 1749890), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0464.m1794n(90728, null, new Object[0])})).intValue() ^ 1753533), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0419.m1407n(2651, null, new Object[0])})).intValue() ^ 1753406)})})).booleanValue() ? (String) C0402.m1254n(87775, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0464.m1794n(63229, null, new Object[0])})).intValue() ^ 1749510), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0464.m1794n(26096, null, new Object[0])})).intValue() ^ 56504), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0464.m1794n(34746, null, new Object[0])})).intValue() ^ 55970)}) : new String(bArr);
                    } catch (IOException e) {
                        C0402.m1254n(15892, null, new Object[]{e});
                        str2 = (String) C0402.m1254n(87775, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0466.m1812n(64173, null, new Object[0])})).intValue() ^ 1750534), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0464.m1794n(63849, null, new Object[0])})).intValue() ^ 1752609), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0464.m1794n(4726, null, new Object[0])})).intValue() ^ 3280)});
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    str2 = (String) C0469.m1839n(48310, null, new Object[]{sb2});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* renamed from: c */
    public static void m1142c() {
        synchronized (C0351p.class) {
            try {
                ((Boolean) C0466.m1812n(92794, null, new Object[0])).booleanValue();
                if (((Boolean) C0431.m1506n(63620, null, new Object[0])).booleanValue()) {
                    try {
                        C0419.m1407n(98187, null, new Object[]{(DataOutputStream) C0443.m1614n(58815, null, new Object[0])});
                        ((Long) C0464.m1794n(41249, null, new Object[]{(InputStream) C0443.m1614n(38964, null, new Object[0]), Long.valueOf(((Integer) C0464.m1794n(63193, null, new Object[]{(InputStream) C0443.m1614n(38964, null, new Object[0])})).intValue())})).longValue();
                        ((Long) C0464.m1794n(88443, null, new Object[]{(DataInputStream) C0443.m1614n(26040, null, new Object[0]), Long.valueOf(((Integer) C0464.m1794n(42397, null, new Object[]{(DataInputStream) C0443.m1614n(26040, null, new Object[0])})).intValue())})).longValue();
                    } catch (IOException e) {
                        C0402.m1254n(15892, null, new Object[]{e});
                    }
                    return;
                }
                ((Boolean) C0464.m1794n(16658, null, new Object[0])).booleanValue();
                if (((Integer) C0408.m1308n(78567, null, new Object[0])).intValue() >= 0) {
                    C0408.m1308n(80863, (PrintStream) C0469.m1837n(12888), new Object[]{(String) C0447.m1650n(59112, null, new Object[]{(String) C0464.m1792n(72934)})});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static void m1143d() {
        synchronized (C0351p.class) {
            try {
                if (((InputStream) C0443.m1614n(38964, null, new Object[0])) == null) {
                    f2028e = (InputStream) C0464.m1794n(10039, null, new Object[]{(Process) C0443.m1614n(10625, null, new Object[0])});
                }
                if (((DataOutputStream) C0443.m1614n(58815, null, new Object[0])) == null) {
                    f2027d = new DataOutputStream((OutputStream) C0464.m1794n(51093, null, new Object[]{(Process) C0443.m1614n(10625, null, new Object[0])}));
                }
                if (((DataInputStream) C0443.m1614n(26040, null, new Object[0])) == null) {
                    f2029f = new DataInputStream((InputStream) C0464.m1794n(93742, null, new Object[]{(Process) C0443.m1614n(10625, null, new Object[0])}));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public static void m1144d(String str) {
        Integer num = new Integer(7967160);
        synchronized (C0351p.class) {
            try {
                C0446.m1641n(83279, null, new Object[0]);
                try {
                    C0419.m1407n(3443, null, new Object[]{(DataOutputStream) C0443.m1614n(58815, null, new Object[0]), (byte[]) C0419.m1407n(88740, null, new Object[]{str})});
                    C0446.m1641n(93727, null, new Object[]{(DataOutputStream) C0443.m1614n(58815, null, new Object[0]), (String) C0431.m1506n(75041, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(14168, null, new Object[0])})).intValue() ^ 1753965), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(12407, null, new Object[0])})).intValue() ^ 1747625), Integer.valueOf(1751190 ^ ((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(36793, null, new Object[0])})).intValue())})});
                    C0419.m1407n(98187, null, new Object[]{(DataOutputStream) C0443.m1614n(58815, null, new Object[0])});
                    byte[] bArr = new byte[((Integer) C0469.m1839n(62256, (Integer) new Object[]{num}[0], new Object[0])).intValue() ^ 7963064];
                    while (!((Boolean) C0464.m1794n(64527, null, new Object[]{new String(bArr, 0, ((Integer) C0419.m1407n(95011, null, new Object[]{(InputStream) C0443.m1614n(38964, null, new Object[0]), bArr})).intValue()), (String) C0443.m1614n(25707, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(42209, null, new Object[0])})).intValue() ^ 1746485), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0456.m1731n(37374, null, new Object[0])})).intValue() ^ 56411), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0453.m1704n(13143, null, new Object[0])})).intValue() ^ 1746732)})})).booleanValue()) {
                    }
                    do {
                    } while (!((Boolean) C0464.m1794n(64527, null, new Object[]{new String(bArr, 0, ((Integer) C0446.m1641n(56846, null, new Object[]{(DataInputStream) C0443.m1614n(26040, null, new Object[0]), bArr})).intValue()), (String) C0402.m1254n(87775, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(26947, null, new Object[0])})).intValue() ^ 55915), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(77218, null, new Object[0])})).intValue() ^ 1747679), Integer.valueOf(55406 ^ ((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(61674, null, new Object[0])})).intValue())})})).booleanValue());
                } catch (Exception e) {
                    if (((Boolean) C0431.m1506n(63620, null, new Object[0])).booleanValue() && ((Process) C0443.m1614n(10625, null, new Object[0])) != null) {
                        C0443.m1614n(56248, null, new Object[0]);
                    }
                    C0431.m1506n(62866, null, new Object[]{e});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public static boolean m1145e() {
        synchronized (C0351p.class) {
            try {
                ((Integer) C0446.m1641n(71678, null, new Object[]{(Process) C0443.m1614n(10625, null, new Object[0])})).intValue();
            } catch (NullPointerException e) {
                return false;
            } catch (Exception e2) {
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static StringBuilder[] m1146e(String str) {
        StringBuilder[] sbArr;
        Object[] objArr = {new Integer(6121792), new Integer(9278798), new Integer(9676888), new Integer(9219903)};
        synchronized (C0351p.class) {
            try {
                C0446.m1641n(83279, null, new Object[0]);
                sbArr = new StringBuilder[((Integer) C0469.m1839n(62256, (Integer) objArr[0], new Object[0])).intValue() ^ 6121795];
                sbArr[0] = new StringBuilder();
                StringBuilder sb = new StringBuilder();
                int intValue = ((Integer) C0469.m1839n(62256, (Integer) objArr[2], new Object[0])).intValue() ^ 9676889;
                sbArr[intValue] = sb;
                StringBuilder sb2 = new StringBuilder();
                int intValue2 = ((Integer) C0469.m1839n(62256, (Integer) objArr[1], new Object[0])).intValue() ^ 9278796;
                sbArr[intValue2] = sb2;
                try {
                    C0419.m1407n(3443, null, new Object[]{(DataOutputStream) C0443.m1614n(58815, null, new Object[0]), (byte[]) C0419.m1407n(88740, null, new Object[]{str})});
                    C0446.m1641n(93727, null, new Object[]{(DataOutputStream) C0443.m1614n(58815, null, new Object[0]), (String) C0443.m1614n(2880, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(27411, null, new Object[0])})).intValue() ^ 1750947), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(67325, null, new Object[0])})).intValue() ^ 1749736), Integer.valueOf(1750741 ^ ((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0456.m1731n(78376, null, new Object[0])})).intValue())})});
                    C0419.m1407n(98187, null, new Object[]{(DataOutputStream) C0443.m1614n(58815, null, new Object[0])});
                    byte[] bArr = new byte[((Integer) C0469.m1839n(62256, (Integer) objArr[3], new Object[0])).intValue() ^ 9223999];
                    loop0: while (true) {
                        int intValue3 = ((Integer) C0419.m1407n(95011, null, new Object[]{(InputStream) C0443.m1614n(38964, null, new Object[0]), bArr})).intValue();
                        if (intValue3 <= 0) {
                            break;
                        }
                        for (String str2 : (String[]) C0446.m1641n(26018, null, new Object[]{new String(bArr, 0, intValue3), (String) C0443.m1614n(2880, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(53649, null, new Object[0])})).intValue() ^ 1747691), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(55082, null, new Object[0])})).intValue() ^ 1748732), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0446.m1641n(64425, null, new Object[0])})).intValue() ^ 1750323)})})) {
                            if (((Boolean) C0402.m1254n(73611, null, new Object[]{str2, (String) C0443.m1614n(2880, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0433.m1524n(18646, null, new Object[0])})).intValue() ^ 1750866), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0433.m1524n(94368, null, new Object[0])})).intValue() ^ 1746820), Integer.valueOf(1750884 ^ ((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0425.m1461n(71359, null, new Object[0])})).intValue())})})).booleanValue()) {
                                break loop0;
                            }
                            StringBuilder sb3 = sbArr[0];
                        }
                    }
                    loop2: while (true) {
                        int intValue4 = ((Integer) C0446.m1641n(56846, null, new Object[]{(DataInputStream) C0443.m1614n(26040, null, new Object[0]), bArr})).intValue();
                        if (intValue4 <= 0) {
                            break;
                        }
                        for (String str3 : (String[]) C0446.m1641n(26018, null, new Object[]{new String(bArr, 0, intValue4), (String) C0443.m1614n(2880, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0433.m1524n(42450, null, new Object[0])})).intValue() ^ 1746223), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0433.m1524n(5423, null, new Object[0])})).intValue() ^ 1749851), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0433.m1524n(57417, null, new Object[0])})).intValue() ^ 1753650)})})) {
                            if (((Boolean) C0402.m1254n(73611, null, new Object[]{str3, (String) C0443.m1614n(25707, null, new Object[]{(short[]) C0402.m1254n(28220, null, new Object[0]), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0433.m1524n(1385, null, new Object[0])})).intValue() ^ 1753990), Integer.valueOf(((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0433.m1524n(40888, null, new Object[0])})).intValue() ^ 1754461), Integer.valueOf(1751449 ^ ((Integer) C0402.m1254n(93668, null, new Object[]{(String) C0433.m1524n(59817, null, new Object[0])})).intValue())})})).booleanValue()) {
                                break loop2;
                            }
                            StringBuilder sb4 = sbArr[intValue];
                        }
                    }
                } catch (Exception e) {
                    if (((Boolean) C0431.m1506n(63620, null, new Object[0])).booleanValue() && ((Process) C0443.m1614n(10625, null, new Object[0])) != null) {
                        C0443.m1614n(56248, null, new Object[0]);
                    }
                    C0431.m1506n(62866, null, new Object[]{e});
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sbArr;
    }

    /* renamed from: ۥۣۖۥۨۥ⁤⁠۠⁠⁠ۣۜ۠ۧ⁤ۜۧ⁤ۗ, reason: contains not printable characters */
    public static String m2183(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return (String) C0452.m1695n(30190, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥۖ⁤ۣ۟⁤۟ۧۖ⁤⁠⁣⁤⁠⁤⁤ۣ⁠ۖۥ, reason: contains not printable characters */
    public static String m2184(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() > 0) {
            return (String) C0447.m1650n(29801, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥۤ⁣ۖۥۖ⁤⁣ۖ۠ۖ⁤ۗ۟ۖۗ⁤⁤ۣۣ, reason: contains not printable characters */
    public static int m2185(Object obj) {
        if (((Integer) C0452.m1695n(62526, null, new Object[0])).intValue() >= 0) {
            return ((Integer) C0452.m1695n(65372, null, new Object[]{obj})).intValue();
        }
        return 0;
    }

    /* renamed from: ۥۥۖۡ⁤ۣۖ⁤⁤⁠ۗ۟ۖۥ⁣ۤۧۖ⁤ۣ, reason: contains not printable characters */
    public static String m2186(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() < 0) {
            return (String) C0447.m1650n(4374, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }

    /* renamed from: ۥ⁤⁤⁠⁠۬ۖۖۖۜۥۥ⁣ۣ⁤⁣ۖ۬ۧ⁤, reason: contains not printable characters */
    public static short[] m2187() {
        if (((Integer) C0452.m1695n(33764, null, new Object[0])).intValue() >= 0) {
            return (short[]) C0433.m1522n(85454);
        }
        return null;
    }

    /* renamed from: ۦۧ⁠ۖۜۗۥ⁤ۤۧۖۗ⁣ۧ⁠ۖ⁠ۣۗۖ, reason: contains not printable characters */
    public static String m2188(Object obj, int i, int i2, int i3) {
        if (((Integer) C0452.m1695n(37112, null, new Object[0])).intValue() <= 0) {
            return (String) C0408.m1308n(43977, null, new Object[]{(short[]) obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return null;
    }
}
