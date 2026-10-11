package p000a.p006b.p010c.p011a;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import p000a.p001a.p005b.AbstractC0008d;
import p000a.p001a.p005b.C0011g;
import p000a.p001a.p005b.C0014j;
import p000a.p001a.p005b.C0019o;
import p000a.p001a.p005b.InterfaceC0010f;
import p000a.p001a.p005b.InterfaceC0020p;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p011a.ActivityC0043f;
import p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k;
import p000a.p006b.p010c.p020g.C0104i;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.c.a.e */
/* loaded from: classes.dex */
public class ComponentCallbacksC0041e implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0010f, InterfaceC0020p {

    /* renamed from: X */
    public static final C0104i<String, Class<?>> f199X = new C0104i<>();

    /* renamed from: Y */
    public static final Object f200Y = new Object();

    /* renamed from: A */
    public String f201A;

    /* renamed from: B */
    public boolean f202B;

    /* renamed from: C */
    public boolean f203C;

    /* renamed from: D */
    public boolean f204D;

    /* renamed from: E */
    public boolean f205E;

    /* renamed from: F */
    public boolean f206F;

    /* renamed from: H */
    public boolean f208H;

    /* renamed from: I */
    public ViewGroup f209I;

    /* renamed from: J */
    public View f210J;

    /* renamed from: K */
    public View f211K;

    /* renamed from: L */
    public boolean f212L;

    /* renamed from: N */
    public c f214N;

    /* renamed from: O */
    public boolean f215O;

    /* renamed from: P */
    public boolean f216P;

    /* renamed from: Q */
    public float f217Q;

    /* renamed from: R */
    public LayoutInflater f218R;

    /* renamed from: S */
    public boolean f219S;

    /* renamed from: U */
    public C0011g f221U;

    /* renamed from: V */
    public InterfaceC0010f f222V;

    /* renamed from: c */
    public Bundle f225c;

    /* renamed from: d */
    public SparseArray<Parcelable> f226d;

    /* renamed from: e */
    public Boolean f227e;

    /* renamed from: g */
    public String f229g;

    /* renamed from: h */
    public Bundle f230h;

    /* renamed from: i */
    public ComponentCallbacksC0041e f231i;

    /* renamed from: k */
    public int f233k;

    /* renamed from: l */
    public boolean f234l;

    /* renamed from: m */
    public boolean f235m;

    /* renamed from: n */
    public boolean f236n;

    /* renamed from: o */
    public boolean f237o;

    /* renamed from: p */
    public boolean f238p;

    /* renamed from: q */
    public boolean f239q;

    /* renamed from: r */
    public int f240r;

    /* renamed from: s */
    public LayoutInflaterFactory2C0051k f241s;

    /* renamed from: t */
    public AbstractC0049i f242t;

    /* renamed from: u */
    public LayoutInflaterFactory2C0051k f243u;

    /* renamed from: v */
    public C0055o f244v;

    /* renamed from: w */
    public C0019o f245w;

    /* renamed from: x */
    public ComponentCallbacksC0041e f246x;

    /* renamed from: y */
    public int f247y;

    /* renamed from: z */
    public int f248z;

    /* renamed from: b */
    public int f224b = 0;

    /* renamed from: f */
    public int f228f = -1;

    /* renamed from: j */
    public int f232j = -1;

    /* renamed from: G */
    public boolean f207G = true;

    /* renamed from: M */
    public boolean f213M = true;

    /* renamed from: T */
    public C0011g f220T = new C0011g(this);

    /* renamed from: W */
    public C0014j<InterfaceC0010f> f223W = new C0014j<>();

    /* renamed from: a.b.c.a.e$a */
    public class a extends AbstractC0045g {
        public a() {
        }

        @Override // p000a.p006b.p010c.p011a.AbstractC0045g
        /* renamed from: a */
        public ComponentCallbacksC0041e mo203a(Context context, String str, Bundle bundle) {
            return ComponentCallbacksC0041e.this.f242t.mo203a(context, str, bundle);
        }

        @Override // p000a.p006b.p010c.p011a.AbstractC0045g
        /* renamed from: a */
        public View mo204a(int i) {
            View view = ComponentCallbacksC0041e.this.f210J;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment does not have a view");
        }

        @Override // p000a.p006b.p010c.p011a.AbstractC0045g
        /* renamed from: a */
        public boolean mo205a() {
            return ComponentCallbacksC0041e.this.f210J != null;
        }
    }

    /* renamed from: a.b.c.a.e$b */
    public class b implements InterfaceC0010f {
        public b() {
        }

        @Override // p000a.p001a.p005b.InterfaceC0010f
        /* renamed from: a */
        public AbstractC0008d mo14a() {
            ComponentCallbacksC0041e componentCallbacksC0041e = ComponentCallbacksC0041e.this;
            if (componentCallbacksC0041e.f221U == null) {
                componentCallbacksC0041e.f221U = new C0011g(componentCallbacksC0041e.f222V);
            }
            return ComponentCallbacksC0041e.this.f221U;
        }
    }

    /* renamed from: a.b.c.a.e$c */
    public static class c {

        /* renamed from: a */
        public View f251a;

        /* renamed from: b */
        public Animator f252b;

        /* renamed from: c */
        public int f253c;

        /* renamed from: d */
        public int f254d;

        /* renamed from: e */
        public int f255e;

        /* renamed from: f */
        public int f256f;

        /* renamed from: g */
        public Object f257g = null;

        /* renamed from: h */
        public Object f258h;

        /* renamed from: i */
        public Object f259i;

        /* renamed from: j */
        public Object f260j;

        /* renamed from: k */
        public Object f261k;

        /* renamed from: l */
        public Object f262l;

        /* renamed from: m */
        public Boolean f263m;

        /* renamed from: n */
        public Boolean f264n;

        /* renamed from: o */
        public AbstractC0042e0 f265o;

        /* renamed from: p */
        public AbstractC0042e0 f266p;

        /* renamed from: q */
        public boolean f267q;

        /* renamed from: r */
        public e f268r;

        /* renamed from: s */
        public boolean f269s;

        public c() {
            Object obj = ComponentCallbacksC0041e.f200Y;
            this.f258h = obj;
            this.f259i = null;
            this.f260j = obj;
            this.f261k = null;
            this.f262l = obj;
        }
    }

    /* renamed from: a.b.c.a.e$d */
    public static class d extends RuntimeException {
        public d(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: a.b.c.a.e$e */
    public interface e {
    }

    /* renamed from: a */
    public static ComponentCallbacksC0041e m161a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = f199X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f199X.put(str, cls);
            }
            ComponentCallbacksC0041e componentCallbacksC0041e = (ComponentCallbacksC0041e) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(componentCallbacksC0041e.getClass().getClassLoader());
                componentCallbacksC0041e.m185d(bundle);
            }
            return componentCallbacksC0041e;
        } catch (ClassNotFoundException e2) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (IllegalAccessException e3) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new d("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new d("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new d("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    /* renamed from: a */
    public static boolean m162a(Context context, String str) {
        try {
            Class<?> cls = f199X.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                f199X.put(str, cls);
            }
            return ComponentCallbacksC0041e.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // p000a.p001a.p005b.InterfaceC0010f
    /* renamed from: a */
    public AbstractC0008d mo14a() {
        return this.f220T;
    }

    /* renamed from: a */
    public ComponentCallbacksC0041e m163a(String str) {
        if (str.equals(this.f229g)) {
            return this;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        if (layoutInflaterFactory2C0051k != null) {
            return layoutInflaterFactory2C0051k.m232a(str);
        }
        return null;
    }

    /* renamed from: a */
    public LayoutInflater m164a(Bundle bundle) {
        AbstractC0049i abstractC0049i = this.f242t;
        if (abstractC0049i == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        ActivityC0043f.b bVar = (ActivityC0043f.b) abstractC0049i;
        LayoutInflater cloneInContext = ActivityC0043f.this.getLayoutInflater().cloneInContext(ActivityC0043f.this);
        if (this.f243u == null) {
            m197p();
            int i = this.f224b;
            if (i >= 4) {
                this.f243u.m290l();
            } else if (i >= 3) {
                this.f243u.m291m();
            } else if (i >= 2) {
                this.f243u.m280g();
            } else if (i >= 1) {
                this.f243u.m283h();
            }
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        layoutInflaterFactory2C0051k.m294p();
        C0027d.m94b(cloneInContext, layoutInflaterFactory2C0051k);
        this.f218R = cloneInContext;
        return this.f218R;
    }

    /* renamed from: a */
    public void m165a(int i) {
        if (this.f214N == null && i == 0) {
            return;
        }
        m184d().f254d = i;
    }

    /* renamed from: a */
    public final void m166a(int i, ComponentCallbacksC0041e componentCallbacksC0041e) {
        this.f228f = i;
        if (componentCallbacksC0041e == null) {
            StringBuilder m1134a = C0335a.m1134a("android:fragment:");
            m1134a.append(this.f228f);
            this.f229g = m1134a.toString();
        } else {
            this.f229g = componentCallbacksC0041e.f229g + ":" + this.f228f;
        }
    }

    /* renamed from: a */
    public void m167a(e eVar) {
        m184d();
        e eVar2 = this.f214N.f268r;
        if (eVar == eVar2) {
            return;
        }
        if (eVar != null && eVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        c cVar = this.f214N;
        if (cVar.f267q) {
            cVar.f268r = eVar;
        }
        if (eVar != null) {
            ((LayoutInflaterFactory2C0051k.j) eVar).f342c++;
        }
    }

    /* renamed from: a */
    public void m168a(Animator animator) {
        m184d().f252b = animator;
    }

    /* renamed from: a */
    public void m169a(Configuration configuration) {
        this.f208H = true;
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        if (layoutInflaterFactory2C0051k != null) {
            layoutInflaterFactory2C0051k.m246a(configuration);
        }
    }

    /* renamed from: a */
    public void m170a(AttributeSet attributeSet, Bundle bundle) {
        this.f208H = true;
        AbstractC0049i abstractC0049i = this.f242t;
        if ((abstractC0049i == null ? null : abstractC0049i.f288a) != null) {
            this.f208H = false;
            this.f208H = true;
        }
    }

    /* renamed from: a */
    public void m171a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        if (layoutInflaterFactory2C0051k != null) {
            layoutInflaterFactory2C0051k.m295q();
        }
        this.f239q = true;
        this.f222V = new b();
        this.f221U = null;
        this.f210J = null;
        if (this.f210J != null) {
            this.f222V.mo14a();
            this.f223W.mo23a((C0014j<InterfaceC0010f>) this.f222V);
        } else {
            if (this.f221U != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f222V = null;
        }
    }

    /* renamed from: a */
    public void m172a(Menu menu) {
        if (this.f202B) {
            return;
        }
        if (this.f206F) {
            boolean z = this.f207G;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        if (layoutInflaterFactory2C0051k != null) {
            layoutInflaterFactory2C0051k.m248a(menu);
        }
    }

    /* renamed from: a */
    public void m173a(View view) {
        m184d().f251a = view;
    }

    /* renamed from: a */
    public void m174a(boolean z) {
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        if (layoutInflaterFactory2C0051k != null) {
            layoutInflaterFactory2C0051k.m252a(z);
        }
    }

    /* renamed from: a */
    public boolean m175a(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f202B) {
            return false;
        }
        if (this.f206F && this.f207G) {
            z = true;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        return layoutInflaterFactory2C0051k != null ? z | layoutInflaterFactory2C0051k.m253a(menu, menuInflater) : z;
    }

    /* renamed from: a */
    public boolean m176a(MenuItem menuItem) {
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k;
        return (this.f202B || (layoutInflaterFactory2C0051k = this.f243u) == null || !layoutInflaterFactory2C0051k.m254a(menuItem)) ? false : true;
    }

    @Override // p000a.p001a.p005b.InterfaceC0020p
    /* renamed from: b */
    public C0019o mo29b() {
        if (m188g() == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f245w == null) {
            this.f245w = new C0019o();
        }
        return this.f245w;
    }

    /* renamed from: b */
    public void m177b(Bundle bundle) {
        Parcelable m296r;
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        if (layoutInflaterFactory2C0051k == null || (m296r = layoutInflaterFactory2C0051k.m296r()) == null) {
            return;
        }
        bundle.putParcelable("android:support:fragments", m296r);
    }

    /* renamed from: b */
    public void m178b(boolean z) {
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        if (layoutInflaterFactory2C0051k != null) {
            layoutInflaterFactory2C0051k.m260b(z);
        }
    }

    /* renamed from: b */
    public boolean m179b(Menu menu) {
        boolean z = false;
        if (this.f202B) {
            return false;
        }
        if (this.f206F && this.f207G) {
            z = true;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        return layoutInflaterFactory2C0051k != null ? z | layoutInflaterFactory2C0051k.m261b(menu) : z;
    }

    /* renamed from: b */
    public boolean m180b(MenuItem menuItem) {
        if (this.f202B) {
            return false;
        }
        if (this.f206F) {
            boolean z = this.f207G;
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        return layoutInflaterFactory2C0051k != null && layoutInflaterFactory2C0051k.m262b(menuItem);
    }

    /* renamed from: c */
    public void m181c() {
        c cVar = this.f214N;
        Object obj = null;
        if (cVar != null) {
            cVar.f267q = false;
            Object obj2 = cVar.f268r;
            cVar.f268r = null;
            obj = obj2;
        }
        if (obj != null) {
            LayoutInflaterFactory2C0051k.j jVar = (LayoutInflaterFactory2C0051k.j) obj;
            jVar.f342c--;
            if (jVar.f342c != 0) {
                return;
            }
            jVar.f341b.f157a.m298t();
        }
    }

    /* renamed from: c */
    public void m182c(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        if (this.f243u == null) {
            m197p();
        }
        this.f243u.m247a(parcelable, this.f244v);
        this.f244v = null;
        this.f243u.m283h();
    }

    /* renamed from: c */
    public void m183c(boolean z) {
        m184d().f269s = z;
    }

    /* renamed from: d */
    public final c m184d() {
        if (this.f214N == null) {
            this.f214N = new c();
        }
        return this.f214N;
    }

    /* renamed from: d */
    public void m185d(Bundle bundle) {
        if (this.f228f >= 0) {
            LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f241s;
            if (layoutInflaterFactory2C0051k == null ? false : layoutInflaterFactory2C0051k.mo223b()) {
                throw new IllegalStateException("Fragment already active and state has been saved");
            }
        }
        this.f230h = bundle;
    }

    /* renamed from: e */
    public View m186e() {
        c cVar = this.f214N;
        if (cVar == null) {
            return null;
        }
        return cVar.f251a;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public Animator m187f() {
        c cVar = this.f214N;
        if (cVar == null) {
            return null;
        }
        return cVar.f252b;
    }

    /* renamed from: g */
    public Context m188g() {
        AbstractC0049i abstractC0049i = this.f242t;
        if (abstractC0049i == null) {
            return null;
        }
        return abstractC0049i.f289b;
    }

    /* renamed from: h */
    public Object m189h() {
        c cVar = this.f214N;
        if (cVar == null) {
            return null;
        }
        return cVar.f257g;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public void m190i() {
        c cVar = this.f214N;
        if (cVar == null) {
            return;
        }
        AbstractC0042e0 abstractC0042e0 = cVar.f265o;
    }

    /* renamed from: j */
    public Object m191j() {
        c cVar = this.f214N;
        if (cVar == null) {
            return null;
        }
        return cVar.f259i;
    }

    /* renamed from: k */
    public int m192k() {
        c cVar = this.f214N;
        if (cVar == null) {
            return 0;
        }
        return cVar.f254d;
    }

    /* renamed from: l */
    public int m193l() {
        c cVar = this.f214N;
        if (cVar == null) {
            return 0;
        }
        return cVar.f255e;
    }

    /* renamed from: m */
    public int m194m() {
        c cVar = this.f214N;
        if (cVar == null) {
            return 0;
        }
        return cVar.f256f;
    }

    /* renamed from: n */
    public Object m195n() {
        c cVar = this.f214N;
        if (cVar == null) {
            return null;
        }
        return cVar.f261k;
    }

    /* renamed from: o */
    public int m196o() {
        c cVar = this.f214N;
        if (cVar == null) {
            return 0;
        }
        return cVar.f253c;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f208H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AbstractC0049i abstractC0049i = this.f242t;
        (abstractC0049i == null ? null : (ActivityC0043f) abstractC0049i.f288a).onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f208H = true;
    }

    /* renamed from: p */
    public void m197p() {
        if (this.f242t == null) {
            throw new IllegalStateException("Fragment has not been attached yet.");
        }
        this.f243u = new LayoutInflaterFactory2C0051k();
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        AbstractC0049i abstractC0049i = this.f242t;
        a aVar = new a();
        if (layoutInflaterFactory2C0051k.f312n != null) {
            throw new IllegalStateException("Already attached");
        }
        layoutInflaterFactory2C0051k.f312n = abstractC0049i;
        layoutInflaterFactory2C0051k.f313o = aVar;
        layoutInflaterFactory2C0051k.f314p = this;
    }

    /* renamed from: q */
    public boolean m198q() {
        c cVar = this.f214N;
        if (cVar == null) {
            return false;
        }
        return cVar.f269s;
    }

    /* renamed from: r */
    public final boolean m199r() {
        return this.f240r > 0;
    }

    /* renamed from: s */
    public void m200s() {
    }

    /* renamed from: t */
    public AbstractC0050j m201t() {
        return this.f243u;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0027d.m78a((Object) this, sb);
        if (this.f228f >= 0) {
            sb.append(" #");
            sb.append(this.f228f);
        }
        if (this.f247y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f247y));
        }
        if (this.f201A != null) {
            sb.append(" ");
            sb.append(this.f201A);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public void m202u() {
        this.f208H = true;
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f243u;
        if (layoutInflaterFactory2C0051k != null) {
            layoutInflaterFactory2C0051k.m288j();
        }
    }
}
