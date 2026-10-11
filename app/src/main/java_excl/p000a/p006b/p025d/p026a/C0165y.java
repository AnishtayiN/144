package p000a.p006b.p025d.p026a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.C0121p;
import p000a.p006b.p010c.p021h.C0123r;
import p000a.p006b.p010c.p021h.InterfaceC0122q;
import p000a.p006b.p010c.p021h.InterfaceC0124s;
import p000a.p006b.p025d.p026a.AbstractC0141a;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0167b;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.AbstractC0186a;
import p000a.p006b.p025d.p033f.C0191f;
import p000a.p006b.p025d.p033f.C0192g;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p035g.C0230e1;
import p000a.p006b.p025d.p035g.C0269v0;
import p000a.p006b.p025d.p035g.InterfaceC0235g0;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.d.a.y */
/* loaded from: classes.dex */
public class C0165y extends AbstractC0141a implements ActionBarOverlayLayout.InterfaceC0297d {

    /* renamed from: B */
    public static final Interpolator f813B = new AccelerateInterpolator();

    /* renamed from: C */
    public static final Interpolator f814C = new DecelerateInterpolator();

    /* renamed from: A */
    public final InterfaceC0124s f815A;

    /* renamed from: a */
    public Context f816a;

    /* renamed from: b */
    public Context f817b;

    /* renamed from: c */
    public ActionBarOverlayLayout f818c;

    /* renamed from: d */
    public ActionBarContainer f819d;

    /* renamed from: e */
    public InterfaceC0235g0 f820e;

    /* renamed from: f */
    public ActionBarContextView f821f;

    /* renamed from: g */
    public View f822g;

    /* renamed from: h */
    public C0269v0 f823h;

    /* renamed from: i */
    public boolean f824i;

    /* renamed from: j */
    public d f825j;

    /* renamed from: k */
    public AbstractC0186a f826k;

    /* renamed from: l */
    public AbstractC0186a.a f827l;

    /* renamed from: m */
    public boolean f828m;

    /* renamed from: n */
    public ArrayList<AbstractC0141a.b> f829n;

    /* renamed from: o */
    public boolean f830o;

    /* renamed from: p */
    public int f831p;

    /* renamed from: q */
    public boolean f832q;

    /* renamed from: r */
    public boolean f833r;

    /* renamed from: s */
    public boolean f834s;

    /* renamed from: t */
    public boolean f835t;

    /* renamed from: u */
    public boolean f836u;

    /* renamed from: v */
    public C0192g f837v;

    /* renamed from: w */
    public boolean f838w;

    /* renamed from: x */
    public boolean f839x;

    /* renamed from: y */
    public final InterfaceC0122q f840y;

    /* renamed from: z */
    public final InterfaceC0122q f841z;

    /* renamed from: a.b.d.a.y$a */
    public class a extends C0123r {
        public a() {
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: a */
        public void mo495a(View view) {
            View view2;
            C0165y c0165y = C0165y.this;
            if (c0165y.f832q && (view2 = c0165y.f822g) != null) {
                view2.setTranslationY(0.0f);
                C0165y.this.f819d.setTranslationY(0.0f);
            }
            C0165y.this.f819d.setVisibility(8);
            C0165y.this.f819d.setTransitioning(false);
            C0165y c0165y2 = C0165y.this;
            c0165y2.f837v = null;
            AbstractC0186a.a aVar = c0165y2.f827l;
            if (aVar != null) {
                aVar.mo581a(c0165y2.f826k);
                c0165y2.f826k = null;
                c0165y2.f827l = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C0165y.this.f818c;
            if (actionBarOverlayLayout != null) {
                C0119n.m477l(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: a.b.d.a.y$b */
    public class b extends C0123r {
        public b() {
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: a */
        public void mo495a(View view) {
            C0165y c0165y = C0165y.this;
            c0165y.f837v = null;
            c0165y.f819d.requestLayout();
        }
    }

    /* renamed from: a.b.d.a.y$c */
    public class c implements InterfaceC0124s {
        public c() {
        }
    }

    /* renamed from: a.b.d.a.y$d */
    public class d extends AbstractC0186a implements C0201h.a {

        /* renamed from: d */
        public final Context f845d;

        /* renamed from: e */
        public final C0201h f846e;

        /* renamed from: f */
        public AbstractC0186a.a f847f;

        /* renamed from: g */
        public WeakReference<View> f848g;

        public d(Context context, AbstractC0186a.a aVar) {
            this.f845d = context;
            this.f847f = aVar;
            C0201h c0201h = new C0201h(context);
            c0201h.f1090l = 1;
            this.f846e = c0201h;
            this.f846e.mo693a(this);
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: a */
        public void mo601a() {
            C0165y c0165y = C0165y.this;
            if (c0165y.f825j != this) {
                return;
            }
            if ((c0165y.f833r || c0165y.f834s) ? false : true) {
                this.f847f.mo581a(this);
            } else {
                C0165y c0165y2 = C0165y.this;
                c0165y2.f826k = this;
                c0165y2.f827l = this.f847f;
            }
            this.f847f = null;
            C0165y.this.m597d(false);
            C0165y.this.f821f.m1026a();
            ((C0230e1) C0165y.this.f820e).f1249a.sendAccessibilityEvent(32);
            C0165y c0165y3 = C0165y.this;
            c0165y3.f818c.setHideOnContentScrollEnabled(c0165y3.f839x);
            C0165y.this.f825j = null;
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: a */
        public void mo602a(int i) {
            mo604a(C0165y.this.f816a.getResources().getString(i));
        }

        @Override // p000a.p006b.p025d.p033f.p034i.C0201h.a
        /* renamed from: a */
        public void mo559a(C0201h c0201h) {
            if (this.f847f == null) {
                return;
            }
            mo613g();
            C0165y.this.f821f.m1031e();
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: a */
        public void mo603a(View view) {
            C0165y.this.f821f.setCustomView(view);
            this.f848g = new WeakReference<>(view);
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: a */
        public void mo604a(CharSequence charSequence) {
            C0165y.this.f821f.setSubtitle(charSequence);
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: a */
        public void mo605a(boolean z) {
            this.f924c = z;
            C0165y.this.f821f.setTitleOptional(z);
        }

        @Override // p000a.p006b.p025d.p033f.p034i.C0201h.a
        /* renamed from: a */
        public boolean mo561a(C0201h c0201h, MenuItem menuItem) {
            AbstractC0186a.a aVar = this.f847f;
            if (aVar != null) {
                return aVar.mo583a(this, menuItem);
            }
            return false;
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: b */
        public View mo606b() {
            WeakReference<View> weakReference = this.f848g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: b */
        public void mo607b(int i) {
            mo608b(C0165y.this.f816a.getResources().getString(i));
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: b */
        public void mo608b(CharSequence charSequence) {
            C0165y.this.f821f.setTitle(charSequence);
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: c */
        public Menu mo609c() {
            return this.f846e;
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: d */
        public MenuInflater mo610d() {
            return new C0191f(this.f845d);
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: e */
        public CharSequence mo611e() {
            return C0165y.this.f821f.getSubtitle();
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: f */
        public CharSequence mo612f() {
            return C0165y.this.f821f.getTitle();
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: g */
        public void mo613g() {
            if (C0165y.this.f825j != this) {
                return;
            }
            this.f846e.m716k();
            try {
                this.f847f.mo582a(this, this.f846e);
            } finally {
                this.f846e.m715j();
            }
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a
        /* renamed from: h */
        public boolean mo614h() {
            return C0165y.this.f821f.m1029c();
        }
    }

    public C0165y(Activity activity, boolean z) {
        new ArrayList();
        this.f829n = new ArrayList<>();
        this.f831p = 0;
        this.f832q = true;
        this.f836u = true;
        this.f840y = new a();
        this.f841z = new b();
        this.f815A = new c();
        View decorView = activity.getWindow().getDecorView();
        m596a(decorView);
        if (z) {
            return;
        }
        this.f822g = decorView.findViewById(R.id.content);
    }

    public C0165y(Dialog dialog) {
        new ArrayList();
        this.f829n = new ArrayList<>();
        this.f831p = 0;
        this.f832q = true;
        this.f836u = true;
        this.f840y = new a();
        this.f841z = new b();
        this.f815A = new c();
        m596a(dialog.getWindow().getDecorView());
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: a */
    public AbstractC0186a mo515a(AbstractC0186a.a aVar) {
        d dVar = this.f825j;
        if (dVar != null) {
            dVar.mo601a();
        }
        this.f818c.setHideOnContentScrollEnabled(false);
        this.f821f.m1030d();
        d dVar2 = new d(this.f821f.getContext(), aVar);
        dVar2.f846e.m716k();
        try {
            if (!dVar2.f847f.mo584b(dVar2, dVar2.f846e)) {
                return null;
            }
            this.f825j = dVar2;
            dVar2.mo613g();
            this.f821f.m1027a(dVar2);
            m597d(true);
            this.f821f.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.f846e.m715j();
        }
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: a */
    public void mo516a(Configuration configuration) {
        m599e(this.f816a.getResources().getBoolean(C0167b.abc_action_bar_embed_tabs));
    }

    /* renamed from: a */
    public final void m596a(View view) {
        InterfaceC0235g0 wrapper;
        this.f818c = (ActionBarOverlayLayout) view.findViewById(C0171f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f818c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(C0171f.action_bar);
        if (findViewById instanceof InterfaceC0235g0) {
            wrapper = (InterfaceC0235g0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                StringBuilder m1134a = C0335a.m1134a("Can't make a decor toolbar out of ");
                m1134a.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(m1134a.toString());
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f820e = wrapper;
        this.f821f = (ActionBarContextView) view.findViewById(C0171f.action_context_bar);
        this.f819d = (ActionBarContainer) view.findViewById(C0171f.action_bar_container);
        InterfaceC0235g0 interfaceC0235g0 = this.f820e;
        if (interfaceC0235g0 == null || this.f821f == null || this.f819d == null) {
            throw new IllegalStateException(C0165y.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f816a = ((C0230e1) interfaceC0235g0).m799a();
        boolean z = (((C0230e1) this.f820e).f1250b & 4) != 0;
        if (z) {
            this.f824i = true;
        }
        Context context = this.f816a;
        ((C0230e1) this.f820e).m804a((context.getApplicationInfo().targetSdkVersion < 14) || z);
        m599e(context.getResources().getBoolean(C0167b.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f816a.obtainStyledAttributes(null, C0175j.ActionBar, C0166a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0175j.ActionBar_hideOnContentScroll, false)) {
            if (!this.f818c.m1036i()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f839x = true;
            this.f818c.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0175j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            C0119n.m455a(this.f819d, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: a */
    public void mo517a(CharSequence charSequence) {
        ((C0230e1) this.f820e).m806b(charSequence);
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: a */
    public void mo518a(boolean z) {
        if (z == this.f828m) {
            return;
        }
        this.f828m = z;
        int size = this.f829n.size();
        for (int i = 0; i < size; i++) {
            this.f829n.get(i).m526a(z);
        }
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: a */
    public boolean mo519a() {
        InterfaceC0235g0 interfaceC0235g0 = this.f820e;
        if (interfaceC0235g0 == null || !((C0230e1) interfaceC0235g0).f1249a.m1115k()) {
            return false;
        }
        ((C0230e1) this.f820e).f1249a.m1105c();
        return true;
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: a */
    public boolean mo520a(int i, KeyEvent keyEvent) {
        C0201h c0201h;
        d dVar = this.f825j;
        if (dVar == null || (c0201h = dVar.f846e) == null) {
            return false;
        }
        c0201h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return c0201h.performShortcut(i, keyEvent, 0);
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: b */
    public int mo521b() {
        return ((C0230e1) this.f820e).f1250b;
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: b */
    public void mo522b(boolean z) {
        if (this.f824i) {
            return;
        }
        int i = z ? 4 : 0;
        C0230e1 c0230e1 = (C0230e1) this.f820e;
        int i2 = c0230e1.f1250b;
        this.f824i = true;
        c0230e1.m800a((i & 4) | (i2 & (-5)));
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: c */
    public Context mo523c() {
        if (this.f817b == null) {
            TypedValue typedValue = new TypedValue();
            this.f816a.getTheme().resolveAttribute(C0166a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f817b = new ContextThemeWrapper(this.f816a, i);
            } else {
                this.f817b = this.f816a;
            }
        }
        return this.f817b;
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0141a
    /* renamed from: c */
    public void mo524c(boolean z) {
        C0192g c0192g;
        this.f838w = z;
        if (z || (c0192g = this.f837v) == null) {
            return;
        }
        c0192g.m654a();
    }

    /* renamed from: d */
    public void m597d(boolean z) {
        C0121p m798a;
        C0121p m745a;
        if (z) {
            if (!this.f835t) {
                this.f835t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f818c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m600f(false);
            }
        } else if (this.f835t) {
            this.f835t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f818c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m600f(false);
        }
        if (!C0119n.m475j(this.f819d)) {
            if (z) {
                ((C0230e1) this.f820e).f1249a.setVisibility(4);
                this.f821f.setVisibility(0);
                return;
            } else {
                ((C0230e1) this.f820e).f1249a.setVisibility(0);
                this.f821f.setVisibility(8);
                return;
            }
        }
        if (z) {
            m745a = ((C0230e1) this.f820e).m798a(4, 100L);
            m798a = this.f821f.m745a(0, 200L);
        } else {
            m798a = ((C0230e1) this.f820e).m798a(0, 200L);
            m745a = this.f821f.m745a(8, 100L);
        }
        C0192g c0192g = new C0192g();
        c0192g.f983a.add(m745a);
        View view = m745a.f613a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = m798a.f613a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        c0192g.f983a.add(m798a);
        c0192g.m655b();
    }

    /* renamed from: e */
    public void m598e() {
    }

    /* renamed from: e */
    public final void m599e(boolean z) {
        this.f830o = z;
        if (this.f830o) {
            this.f819d.setTabContainer(null);
            ((C0230e1) this.f820e).m801a(this.f823h);
        } else {
            ((C0230e1) this.f820e).m801a((C0269v0) null);
            this.f819d.setTabContainer(this.f823h);
        }
        boolean z2 = ((C0230e1) this.f820e).f1263o == 2;
        C0269v0 c0269v0 = this.f823h;
        if (c0269v0 != null) {
            if (z2) {
                c0269v0.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f818c;
                if (actionBarOverlayLayout != null) {
                    C0119n.m477l(actionBarOverlayLayout);
                }
            } else {
                c0269v0.setVisibility(8);
            }
        }
        ((C0230e1) this.f820e).f1249a.setCollapsible(!this.f830o && z2);
        this.f818c.setHasNonEmbeddedTabs(!this.f830o && z2);
    }

    /* renamed from: f */
    public final void m600f(boolean z) {
        View view;
        View view2;
        View view3;
        if (!(this.f835t || !(this.f833r || this.f834s))) {
            if (this.f836u) {
                this.f836u = false;
                C0192g c0192g = this.f837v;
                if (c0192g != null) {
                    c0192g.m654a();
                }
                if (this.f831p != 0 || (!this.f838w && !z)) {
                    this.f840y.mo495a(null);
                    return;
                }
                this.f819d.setAlpha(1.0f);
                this.f819d.setTransitioning(true);
                C0192g c0192g2 = new C0192g();
                float f = -this.f819d.getHeight();
                if (z) {
                    this.f819d.getLocationInWindow(new int[]{0, 0});
                    f -= r9[1];
                }
                C0121p m453a = C0119n.m453a(this.f819d);
                m453a.m494b(f);
                m453a.m491a(this.f815A);
                if (!c0192g2.f987e) {
                    c0192g2.f983a.add(m453a);
                }
                if (this.f832q && (view = this.f822g) != null) {
                    C0121p m453a2 = C0119n.m453a(view);
                    m453a2.m494b(f);
                    if (!c0192g2.f987e) {
                        c0192g2.f983a.add(m453a2);
                    }
                }
                Interpolator interpolator = f813B;
                if (!c0192g2.f987e) {
                    c0192g2.f985c = interpolator;
                }
                if (!c0192g2.f987e) {
                    c0192g2.f984b = 250L;
                }
                InterfaceC0122q interfaceC0122q = this.f840y;
                if (!c0192g2.f987e) {
                    c0192g2.f986d = interfaceC0122q;
                }
                this.f837v = c0192g2;
                c0192g2.m655b();
                return;
            }
            return;
        }
        if (this.f836u) {
            return;
        }
        this.f836u = true;
        C0192g c0192g3 = this.f837v;
        if (c0192g3 != null) {
            c0192g3.m654a();
        }
        this.f819d.setVisibility(0);
        if (this.f831p == 0 && (this.f838w || z)) {
            this.f819d.setTranslationY(0.0f);
            float f2 = -this.f819d.getHeight();
            if (z) {
                this.f819d.getLocationInWindow(new int[]{0, 0});
                f2 -= r9[1];
            }
            this.f819d.setTranslationY(f2);
            C0192g c0192g4 = new C0192g();
            C0121p m453a3 = C0119n.m453a(this.f819d);
            m453a3.m494b(0.0f);
            m453a3.m491a(this.f815A);
            if (!c0192g4.f987e) {
                c0192g4.f983a.add(m453a3);
            }
            if (this.f832q && (view3 = this.f822g) != null) {
                view3.setTranslationY(f2);
                C0121p m453a4 = C0119n.m453a(this.f822g);
                m453a4.m494b(0.0f);
                if (!c0192g4.f987e) {
                    c0192g4.f983a.add(m453a4);
                }
            }
            Interpolator interpolator2 = f814C;
            if (!c0192g4.f987e) {
                c0192g4.f985c = interpolator2;
            }
            if (!c0192g4.f987e) {
                c0192g4.f984b = 250L;
            }
            InterfaceC0122q interfaceC0122q2 = this.f841z;
            if (!c0192g4.f987e) {
                c0192g4.f986d = interfaceC0122q2;
            }
            this.f837v = c0192g4;
            c0192g4.m655b();
        } else {
            this.f819d.setAlpha(1.0f);
            this.f819d.setTranslationY(0.0f);
            if (this.f832q && (view2 = this.f822g) != null) {
                view2.setTranslationY(0.0f);
            }
            this.f841z.mo495a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f818c;
        if (actionBarOverlayLayout != null) {
            C0119n.m477l(actionBarOverlayLayout);
        }
    }
}
