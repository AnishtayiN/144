package p000a.p006b.p010c.p011a;

import java.io.PrintWriter;
import java.util.ArrayList;
import p000a.p006b.p010c.p011a.AbstractC0050j;
import p000a.p006b.p010c.p011a.ComponentCallbacksC0041e;
import p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.c.a.b */
/* loaded from: classes.dex */
public final class C0035b extends AbstractC0058r implements AbstractC0050j.a, LayoutInflaterFactory2C0051k.i {

    /* renamed from: a */
    public final LayoutInflaterFactory2C0051k f157a;

    /* renamed from: c */
    public int f159c;

    /* renamed from: d */
    public int f160d;

    /* renamed from: e */
    public int f161e;

    /* renamed from: f */
    public int f162f;

    /* renamed from: g */
    public int f163g;

    /* renamed from: h */
    public int f164h;

    /* renamed from: i */
    public boolean f165i;

    /* renamed from: j */
    public String f166j;

    /* renamed from: k */
    public boolean f167k;

    /* renamed from: m */
    public int f169m;

    /* renamed from: n */
    public CharSequence f170n;

    /* renamed from: o */
    public int f171o;

    /* renamed from: p */
    public CharSequence f172p;

    /* renamed from: q */
    public ArrayList<String> f173q;

    /* renamed from: r */
    public ArrayList<String> f174r;

    /* renamed from: t */
    public ArrayList<Runnable> f176t;

    /* renamed from: b */
    public ArrayList<a> f158b = new ArrayList<>();

    /* renamed from: l */
    public int f168l = -1;

    /* renamed from: s */
    public boolean f175s = false;

    /* renamed from: a.b.c.a.b$a */
    public static final class a {

        /* renamed from: a */
        public int f177a;

        /* renamed from: b */
        public ComponentCallbacksC0041e f178b;

        /* renamed from: c */
        public int f179c;

        /* renamed from: d */
        public int f180d;

        /* renamed from: e */
        public int f181e;

        /* renamed from: f */
        public int f182f;

        public a() {
        }

        public a(int i, ComponentCallbacksC0041e componentCallbacksC0041e) {
            this.f177a = i;
            this.f178b = componentCallbacksC0041e;
        }
    }

    public C0035b(LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k) {
        this.f157a = layoutInflaterFactory2C0051k;
    }

    /* renamed from: a */
    public static boolean m129a(a aVar) {
        ComponentCallbacksC0041e componentCallbacksC0041e = aVar.f178b;
        if (componentCallbacksC0041e == null || !componentCallbacksC0041e.f234l || componentCallbacksC0041e.f210J == null || componentCallbacksC0041e.f203C || componentCallbacksC0041e.f202B) {
            return false;
        }
        ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
        return cVar == null ? false : cVar.f267q;
    }

    /* renamed from: a */
    public void m130a() {
        int size = this.f158b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f158b.get(i);
            ComponentCallbacksC0041e componentCallbacksC0041e = aVar.f178b;
            if (componentCallbacksC0041e != null) {
                int i2 = this.f163g;
                int i3 = this.f164h;
                if (componentCallbacksC0041e.f214N != null || i2 != 0 || i3 != 0) {
                    componentCallbacksC0041e.m184d();
                    ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
                    cVar.f255e = i2;
                    cVar.f256f = i3;
                }
            }
            switch (aVar.f177a) {
                case 1:
                    componentCallbacksC0041e.m165a(aVar.f179c);
                    this.f157a.m243a(componentCallbacksC0041e, false);
                    break;
                case 2:
                default:
                    StringBuilder m1134a = C0335a.m1134a("Unknown cmd: ");
                    m1134a.append(aVar.f177a);
                    throw new IllegalArgumentException(m1134a.toString());
                case 3:
                    componentCallbacksC0041e.m165a(aVar.f180d);
                    this.f157a.m278f(componentCallbacksC0041e);
                    break;
                case 4:
                    componentCallbacksC0041e.m165a(aVar.f180d);
                    this.f157a.m265c(componentCallbacksC0041e);
                    break;
                case 5:
                    componentCallbacksC0041e.m165a(aVar.f179c);
                    this.f157a.m287i(componentCallbacksC0041e);
                    break;
                case 6:
                    componentCallbacksC0041e.m165a(aVar.f180d);
                    this.f157a.m256b(componentCallbacksC0041e);
                    break;
                case 7:
                    componentCallbacksC0041e.m165a(aVar.f179c);
                    this.f157a.m238a(componentCallbacksC0041e);
                    break;
                case 8:
                    this.f157a.m284h(componentCallbacksC0041e);
                    break;
                case 9:
                    this.f157a.m284h(null);
                    break;
            }
            if (!this.f175s && aVar.f177a != 1 && componentCallbacksC0041e != null) {
                this.f157a.m275e(componentCallbacksC0041e);
            }
        }
        if (this.f175s) {
            return;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f157a;
        layoutInflaterFactory2C0051k.m236a(layoutInflaterFactory2C0051k.f311m, true);
    }

    /* renamed from: a */
    public void m131a(int i) {
        if (this.f165i) {
            int size = this.f158b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ComponentCallbacksC0041e componentCallbacksC0041e = this.f158b.get(i2).f178b;
                if (componentCallbacksC0041e != null) {
                    componentCallbacksC0041e.f240r += i;
                }
            }
        }
    }

    /* renamed from: a */
    public void m132a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f166j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f168l);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f167k);
            if (this.f163g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f163g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f164h));
            }
            if (this.f159c != 0 || this.f160d != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f159c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f160d));
            }
            if (this.f161e != 0 || this.f162f != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f161e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f162f));
            }
            if (this.f169m != 0 || this.f170n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f169m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f170n);
            }
            if (this.f171o != 0 || this.f172p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f171o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f172p);
            }
        }
        if (this.f158b.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        String str3 = str + "    ";
        int size = this.f158b.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f158b.get(i);
            switch (aVar.f177a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                default:
                    StringBuilder m1134a = C0335a.m1134a("cmd=");
                    m1134a.append(aVar.f177a);
                    str2 = m1134a.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f178b);
            if (z) {
                if (aVar.f179c != 0 || aVar.f180d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f179c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f180d));
                }
                if (aVar.f181e != 0 || aVar.f182f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f181e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f182f));
                }
            }
        }
    }

    /* renamed from: a */
    public void m133a(boolean z) {
        for (int size = this.f158b.size() - 1; size >= 0; size--) {
            a aVar = this.f158b.get(size);
            ComponentCallbacksC0041e componentCallbacksC0041e = aVar.f178b;
            if (componentCallbacksC0041e != null) {
                int m231d = LayoutInflaterFactory2C0051k.m231d(this.f163g);
                int i = this.f164h;
                if (componentCallbacksC0041e.f214N != null || m231d != 0 || i != 0) {
                    componentCallbacksC0041e.m184d();
                    ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
                    cVar.f255e = m231d;
                    cVar.f256f = i;
                }
            }
            switch (aVar.f177a) {
                case 1:
                    componentCallbacksC0041e.m165a(aVar.f182f);
                    this.f157a.m278f(componentCallbacksC0041e);
                    break;
                case 2:
                default:
                    StringBuilder m1134a = C0335a.m1134a("Unknown cmd: ");
                    m1134a.append(aVar.f177a);
                    throw new IllegalArgumentException(m1134a.toString());
                case 3:
                    componentCallbacksC0041e.m165a(aVar.f181e);
                    this.f157a.m243a(componentCallbacksC0041e, false);
                    break;
                case 4:
                    componentCallbacksC0041e.m165a(aVar.f181e);
                    this.f157a.m287i(componentCallbacksC0041e);
                    break;
                case 5:
                    componentCallbacksC0041e.m165a(aVar.f182f);
                    this.f157a.m265c(componentCallbacksC0041e);
                    break;
                case 6:
                    componentCallbacksC0041e.m165a(aVar.f181e);
                    this.f157a.m238a(componentCallbacksC0041e);
                    break;
                case 7:
                    componentCallbacksC0041e.m165a(aVar.f182f);
                    this.f157a.m256b(componentCallbacksC0041e);
                    break;
                case 8:
                    this.f157a.m284h(null);
                    break;
                case 9:
                    this.f157a.m284h(componentCallbacksC0041e);
                    break;
            }
            if (!this.f175s && aVar.f177a != 3 && componentCallbacksC0041e != null) {
                this.f157a.m275e(componentCallbacksC0041e);
            }
        }
        if (this.f175s || !z) {
            return;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f157a;
        layoutInflaterFactory2C0051k.m236a(layoutInflaterFactory2C0051k.f311m, true);
    }

    /* renamed from: a */
    public boolean m134a(ArrayList<C0035b> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f158b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f158b.get(i4).f178b;
            int i5 = componentCallbacksC0041e != null ? componentCallbacksC0041e.f248z : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0035b c0035b = arrayList.get(i6);
                    int size2 = c0035b.f158b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        ComponentCallbacksC0041e componentCallbacksC0041e2 = c0035b.f158b.get(i7).f178b;
                        if ((componentCallbacksC0041e2 != null ? componentCallbacksC0041e2.f248z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m135a(ArrayList<C0035b> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f165i) {
            return true;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f157a;
        if (layoutInflaterFactory2C0051k.f305g == null) {
            layoutInflaterFactory2C0051k.f305g = new ArrayList<>();
        }
        layoutInflaterFactory2C0051k.f305g.add(this);
        return true;
    }

    /* renamed from: b */
    public boolean m136b(int i) {
        int size = this.f158b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ComponentCallbacksC0041e componentCallbacksC0041e = this.f158b.get(i2).f178b;
            int i3 = componentCallbacksC0041e != null ? componentCallbacksC0041e.f248z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f168l >= 0) {
            sb.append(" #");
            sb.append(this.f168l);
        }
        if (this.f166j != null) {
            sb.append(" ");
            sb.append(this.f166j);
        }
        sb.append("}");
        return sb.toString();
    }
}
