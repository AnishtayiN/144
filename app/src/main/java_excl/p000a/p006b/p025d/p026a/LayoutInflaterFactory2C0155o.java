package p000a.p006b.p025d.p026a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.Thread;
import java.util.List;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.C0121p;
import p000a.p006b.p010c.p021h.C0123r;
import p000a.p006b.p010c.p021h.InterfaceC0122q;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0168c;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p027b.C0174i;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p029d.p030a.C0181a;
import p000a.p006b.p025d.p033f.AbstractC0186a;
import p000a.p006b.p025d.p033f.C0188c;
import p000a.p006b.p025d.p033f.C0190e;
import p000a.p006b.p025d.p033f.WindowCallbackC0193h;
import p000a.p006b.p025d.p033f.p034i.C0199f;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p035g.C0242i1;
import p000a.p006b.p025d.p035g.C0243j;
import p000a.p006b.p025d.p035g.InterfaceC0232f0;
import p000a.p006b.p025d.p035g.InterfaceC0244j0;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.d.a.o */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0155o extends AbstractC0154n implements C0201h.a, LayoutInflater.Factory2 {

    /* renamed from: S */
    public static final boolean f710S;

    /* renamed from: T */
    public static final int[] f711T;

    /* renamed from: U */
    public static boolean f712U;

    /* renamed from: A */
    public boolean f713A;

    /* renamed from: B */
    public boolean f714B;

    /* renamed from: C */
    public boolean f715C;

    /* renamed from: D */
    public boolean f716D;

    /* renamed from: E */
    public h[] f717E;

    /* renamed from: F */
    public h f718F;

    /* renamed from: G */
    public boolean f719G;

    /* renamed from: H */
    public boolean f720H;

    /* renamed from: J */
    public boolean f722J;

    /* renamed from: K */
    public f f723K;

    /* renamed from: L */
    public boolean f724L;

    /* renamed from: M */
    public int f725M;

    /* renamed from: O */
    public boolean f727O;

    /* renamed from: P */
    public Rect f728P;

    /* renamed from: Q */
    public Rect f729Q;

    /* renamed from: R */
    public AppCompatViewInflater f730R;

    /* renamed from: b */
    public final Context f731b;

    /* renamed from: c */
    public final Window f732c;

    /* renamed from: d */
    public final Window.Callback f733d;

    /* renamed from: e */
    public final Window.Callback f734e;

    /* renamed from: f */
    public final InterfaceC0153m f735f;

    /* renamed from: g */
    public AbstractC0141a f736g;

    /* renamed from: h */
    public MenuInflater f737h;

    /* renamed from: i */
    public CharSequence f738i;

    /* renamed from: j */
    public InterfaceC0232f0 f739j;

    /* renamed from: k */
    public c f740k;

    /* renamed from: l */
    public i f741l;

    /* renamed from: m */
    public AbstractC0186a f742m;

    /* renamed from: n */
    public ActionBarContextView f743n;

    /* renamed from: o */
    public PopupWindow f744o;

    /* renamed from: p */
    public Runnable f745p;

    /* renamed from: s */
    public boolean f748s;

    /* renamed from: t */
    public ViewGroup f749t;

    /* renamed from: u */
    public TextView f750u;

    /* renamed from: v */
    public View f751v;

    /* renamed from: w */
    public boolean f752w;

    /* renamed from: x */
    public boolean f753x;

    /* renamed from: y */
    public boolean f754y;

    /* renamed from: z */
    public boolean f755z;

    /* renamed from: q */
    public C0121p f746q = null;

    /* renamed from: r */
    public boolean f747r = true;

    /* renamed from: I */
    public int f721I = -100;

    /* renamed from: N */
    public final Runnable f726N = new b();

    /* renamed from: a.b.d.a.o$a */
    public static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f756a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f756a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (!z) {
                this.f756a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f756a.uncaughtException(thread, notFoundException);
        }
    }

    /* renamed from: a.b.d.a.o$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = LayoutInflaterFactory2C0155o.this;
            if ((layoutInflaterFactory2C0155o.f725M & 1) != 0) {
                layoutInflaterFactory2C0155o.m565c(0);
            }
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o2 = LayoutInflaterFactory2C0155o.this;
            if ((layoutInflaterFactory2C0155o2.f725M & 4096) != 0) {
                layoutInflaterFactory2C0155o2.m565c(C0175j.AppCompatTheme_tooltipForegroundColor);
            }
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o3 = LayoutInflaterFactory2C0155o.this;
            layoutInflaterFactory2C0155o3.f724L = false;
            layoutInflaterFactory2C0155o3.f725M = 0;
        }
    }

    /* renamed from: a.b.d.a.o$c */
    public final class c implements InterfaceC0209p.a {
        public c() {
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
        /* renamed from: a */
        public void mo579a(C0201h c0201h, boolean z) {
            LayoutInflaterFactory2C0155o.this.m563b(c0201h);
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
        /* renamed from: a */
        public boolean mo580a(C0201h c0201h) {
            Window.Callback m575h = LayoutInflaterFactory2C0155o.this.m575h();
            if (m575h == null) {
                return true;
            }
            m575h.onMenuOpened(C0175j.AppCompatTheme_tooltipForegroundColor, c0201h);
            return true;
        }
    }

    /* renamed from: a.b.d.a.o$d */
    public class d implements AbstractC0186a.a {

        /* renamed from: a */
        public AbstractC0186a.a f759a;

        /* renamed from: a.b.d.a.o$d$a */
        public class a extends C0123r {
            public a() {
            }

            @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
            /* renamed from: a */
            public void mo495a(View view) {
                LayoutInflaterFactory2C0155o.this.f743n.setVisibility(8);
                LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = LayoutInflaterFactory2C0155o.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0155o.f744o;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0155o.f743n.getParent() instanceof View) {
                    C0119n.m477l((View) LayoutInflaterFactory2C0155o.this.f743n.getParent());
                }
                LayoutInflaterFactory2C0155o.this.f743n.removeAllViews();
                LayoutInflaterFactory2C0155o.this.f746q.m490a((InterfaceC0122q) null);
                LayoutInflaterFactory2C0155o.this.f746q = null;
            }
        }

        public d(AbstractC0186a.a aVar) {
            this.f759a = aVar;
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a.a
        /* renamed from: a */
        public void mo581a(AbstractC0186a abstractC0186a) {
            this.f759a.mo581a(abstractC0186a);
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = LayoutInflaterFactory2C0155o.this;
            if (layoutInflaterFactory2C0155o.f744o != null) {
                layoutInflaterFactory2C0155o.f732c.getDecorView().removeCallbacks(LayoutInflaterFactory2C0155o.this.f745p);
            }
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o2 = LayoutInflaterFactory2C0155o.this;
            if (layoutInflaterFactory2C0155o2.f743n != null) {
                layoutInflaterFactory2C0155o2.m567d();
                LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o3 = LayoutInflaterFactory2C0155o.this;
                C0121p m453a = C0119n.m453a(layoutInflaterFactory2C0155o3.f743n);
                m453a.m488a(0.0f);
                layoutInflaterFactory2C0155o3.f746q = m453a;
                LayoutInflaterFactory2C0155o.this.f746q.m490a(new a());
            }
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o4 = LayoutInflaterFactory2C0155o.this;
            InterfaceC0153m interfaceC0153m = layoutInflaterFactory2C0155o4.f735f;
            if (interfaceC0153m != null) {
                interfaceC0153m.mo537b(layoutInflaterFactory2C0155o4.f742m);
            }
            LayoutInflaterFactory2C0155o.this.f742m = null;
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a.a
        /* renamed from: a */
        public boolean mo582a(AbstractC0186a abstractC0186a, Menu menu) {
            return this.f759a.mo582a(abstractC0186a, menu);
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a.a
        /* renamed from: a */
        public boolean mo583a(AbstractC0186a abstractC0186a, MenuItem menuItem) {
            return this.f759a.mo583a(abstractC0186a, menuItem);
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a.a
        /* renamed from: b */
        public boolean mo584b(AbstractC0186a abstractC0186a, Menu menu) {
            return this.f759a.mo584b(abstractC0186a, menu);
        }
    }

    /* renamed from: a.b.d.a.o$e */
    public class e extends WindowCallbackC0193h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        public final ActionMode m585a(ActionMode.Callback callback) {
            C0190e.a aVar = new C0190e.a(LayoutInflaterFactory2C0155o.this.f731b, callback);
            AbstractC0186a m555a = LayoutInflaterFactory2C0155o.this.m555a(aVar);
            if (m555a != null) {
                return aVar.m648b(m555a);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0155o.this.m562a(keyEvent) || this.f992b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (r6 != false) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f992b
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4f
                a.b.d.a.o r0 = p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.this
                int r3 = r6.getKeyCode()
                r0.m576i()
                a.b.d.a.a r4 = r0.f736g
                if (r4 == 0) goto L1f
                boolean r3 = r4.mo520a(r3, r6)
                if (r3 == 0) goto L1f
            L1d:
                r6 = 1
                goto L4d
            L1f:
                a.b.d.a.o$h r3 = r0.f718F
                if (r3 == 0) goto L34
                int r4 = r6.getKeyCode()
                boolean r3 = r0.m560a(r3, r4, r6, r2)
                if (r3 == 0) goto L34
                a.b.d.a.o$h r6 = r0.f718F
                if (r6 == 0) goto L1d
                r6.f782n = r2
                goto L1d
            L34:
                a.b.d.a.o$h r3 = r0.f718F
                if (r3 != 0) goto L4c
                a.b.d.a.o$h r3 = r0.m566d(r1)
                r0.m564b(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.m560a(r3, r4, r6, r2)
                r3.f781m = r1
                if (r6 == 0) goto L4c
                goto L1d
            L4c:
                r6 = 0
            L4d:
                if (r6 == 0) goto L50
            L4f:
                r1 = 1
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0201h)) {
                return this.f992b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            this.f992b.onMenuOpened(i, menu);
            LayoutInflaterFactory2C0155o.this.m571f(i);
            return true;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            this.f992b.onPanelClosed(i, menu);
            LayoutInflaterFactory2C0155o.this.m573g(i);
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0201h c0201h = menu instanceof C0201h ? (C0201h) menu : null;
            if (i == 0 && c0201h == null) {
                return false;
            }
            if (c0201h != null) {
                c0201h.f1104z = true;
            }
            boolean onPreparePanel = this.f992b.onPreparePanel(i, view, menu);
            if (c0201h != null) {
                c0201h.f1104z = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0201h c0201h;
            h m566d = LayoutInflaterFactory2C0155o.this.m566d(0);
            if (m566d == null || (c0201h = m566d.f778j) == null) {
                this.f992b.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                this.f992b.onProvideKeyboardShortcuts(list, c0201h, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflaterFactory2C0155o.this.f747r ? m585a(callback) : this.f992b.onWindowStartingActionMode(callback);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (LayoutInflaterFactory2C0155o.this.f747r && i == 0) ? m585a(callback) : this.f992b.onWindowStartingActionMode(callback, i);
        }
    }

    /* renamed from: a.b.d.a.o$f */
    public final class f {

        /* renamed from: a */
        public C0164x f763a;

        /* renamed from: b */
        public boolean f764b;

        /* renamed from: c */
        public BroadcastReceiver f765c;

        /* renamed from: d */
        public IntentFilter f766d;

        public f(C0164x c0164x) {
            this.f763a = c0164x;
            this.f764b = c0164x.m595a();
        }

        /* renamed from: a */
        public void m586a() {
            BroadcastReceiver broadcastReceiver = this.f765c;
            if (broadcastReceiver != null) {
                LayoutInflaterFactory2C0155o.this.f731b.unregisterReceiver(broadcastReceiver);
                this.f765c = null;
            }
        }
    }

    /* renamed from: a.b.d.a.o$g */
    public class g extends ContentFrameLayout {
        public g(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0155o.this.m562a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = LayoutInflaterFactory2C0155o.this;
                    layoutInflaterFactory2C0155o.m558a(layoutInflaterFactory2C0155o.m566d(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0181a.m618c(getContext(), i));
        }
    }

    /* renamed from: a.b.d.a.o$h */
    public static final class h {

        /* renamed from: a */
        public int f769a;

        /* renamed from: b */
        public int f770b;

        /* renamed from: c */
        public int f771c;

        /* renamed from: d */
        public int f772d;

        /* renamed from: e */
        public int f773e;

        /* renamed from: f */
        public int f774f;

        /* renamed from: g */
        public ViewGroup f775g;

        /* renamed from: h */
        public View f776h;

        /* renamed from: i */
        public View f777i;

        /* renamed from: j */
        public C0201h f778j;

        /* renamed from: k */
        public C0199f f779k;

        /* renamed from: l */
        public Context f780l;

        /* renamed from: m */
        public boolean f781m;

        /* renamed from: n */
        public boolean f782n;

        /* renamed from: o */
        public boolean f783o;

        /* renamed from: p */
        public boolean f784p;

        /* renamed from: q */
        public boolean f785q = false;

        /* renamed from: r */
        public boolean f786r;

        /* renamed from: s */
        public Bundle f787s;

        public h(int i) {
            this.f769a = i;
        }

        /* renamed from: a */
        public void m587a(C0201h c0201h) {
            C0199f c0199f;
            C0201h c0201h2 = this.f778j;
            if (c0201h == c0201h2) {
                return;
            }
            if (c0201h2 != null) {
                c0201h2.m694a(this.f779k);
            }
            this.f778j = c0201h;
            if (c0201h == null || (c0199f = this.f779k) == null) {
                return;
            }
            c0201h.m695a(c0199f, c0201h.f1079a);
        }

        /* renamed from: a */
        public void m588a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0166a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C0166a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C0174i.Theme_AppCompat_CompactMenu, true);
            }
            C0188c c0188c = new C0188c(context, 0);
            c0188c.getTheme().setTo(newTheme);
            this.f780l = c0188c;
            TypedArray obtainStyledAttributes = c0188c.obtainStyledAttributes(C0175j.AppCompatTheme);
            this.f770b = obtainStyledAttributes.getResourceId(C0175j.AppCompatTheme_panelBackground, 0);
            this.f774f = obtainStyledAttributes.getResourceId(C0175j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a.b.d.a.o$i */
    public final class i implements InterfaceC0209p.a {
        public i() {
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
        /* renamed from: a */
        public void mo579a(C0201h c0201h, boolean z) {
            C0201h mo708c = c0201h.mo708c();
            boolean z2 = mo708c != c0201h;
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = LayoutInflaterFactory2C0155o.this;
            if (z2) {
                c0201h = mo708c;
            }
            h m554a = layoutInflaterFactory2C0155o.m554a((Menu) c0201h);
            if (m554a != null) {
                if (!z2) {
                    LayoutInflaterFactory2C0155o.this.m558a(m554a, z);
                } else {
                    LayoutInflaterFactory2C0155o.this.m556a(m554a.f769a, m554a, mo708c);
                    LayoutInflaterFactory2C0155o.this.m558a(m554a, true);
                }
            }
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
        /* renamed from: a */
        public boolean mo580a(C0201h c0201h) {
            Window.Callback m575h;
            if (c0201h != null) {
                return true;
            }
            LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = LayoutInflaterFactory2C0155o.this;
            if (!layoutInflaterFactory2C0155o.f754y || (m575h = layoutInflaterFactory2C0155o.m575h()) == null || LayoutInflaterFactory2C0155o.this.f720H) {
                return true;
            }
            m575h.onMenuOpened(C0175j.AppCompatTheme_tooltipForegroundColor, c0201h);
            return true;
        }
    }

    static {
        f710S = Build.VERSION.SDK_INT < 21;
        f711T = new int[]{R.attr.windowBackground};
        if (!f710S || f712U) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f712U = true;
    }

    public LayoutInflaterFactory2C0155o(Context context, Window window, InterfaceC0153m interfaceC0153m) {
        int resourceId;
        Drawable drawable = null;
        this.f731b = context;
        this.f732c = window;
        this.f735f = interfaceC0153m;
        this.f733d = this.f732c.getCallback();
        Window.Callback callback = this.f733d;
        if (callback instanceof e) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f734e = new e(callback);
        this.f732c.setCallback(this.f734e);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f711T);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = C0243j.m839a().m847a(context, resourceId, true);
        }
        if (drawable != null) {
            this.f732c.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public h m554a(Menu menu) {
        h[] hVarArr = this.f717E;
        int length = hVarArr != null ? hVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            h hVar = hVarArr[i2];
            if (hVar != null && hVar.f778j == menu) {
                return hVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000a.p006b.p025d.p033f.AbstractC0186a m555a(p000a.p006b.p025d.p033f.AbstractC0186a.a r8) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.m555a(a.b.d.f.a$a):a.b.d.f.a");
    }

    /* renamed from: a */
    public void m556a(int i2, h hVar, Menu menu) {
        if (menu == null) {
            if (hVar == null && i2 >= 0) {
                h[] hVarArr = this.f717E;
                if (i2 < hVarArr.length) {
                    hVar = hVarArr[i2];
                }
            }
            if (hVar != null) {
                menu = hVar.f778j;
            }
        }
        if ((hVar == null || hVar.f783o) && !this.f720H) {
            this.f733d.onPanelClosed(i2, menu);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        if (r14.f776h != null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m557a(p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.h r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.m557a(a.b.d.a.o$h, android.view.KeyEvent):void");
    }

    /* renamed from: a */
    public void m558a(h hVar, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0232f0 interfaceC0232f0;
        if (z && hVar.f769a == 0 && (interfaceC0232f0 = this.f739j) != null && interfaceC0232f0.mo817e()) {
            m563b(hVar.f778j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f731b.getSystemService("window");
        if (windowManager != null && hVar.f783o && (viewGroup = hVar.f775g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m556a(hVar.f769a, hVar, null);
            }
        }
        hVar.f781m = false;
        hVar.f782n = false;
        hVar.f783o = false;
        hVar.f776h = null;
        hVar.f785q = true;
        if (this.f718F == hVar) {
            this.f718F = null;
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h.a
    /* renamed from: a */
    public void mo559a(C0201h c0201h) {
        InterfaceC0232f0 interfaceC0232f0 = this.f739j;
        if (interfaceC0232f0 == null || !interfaceC0232f0.mo818f() || (ViewConfiguration.get(this.f731b).hasPermanentMenuKey() && !this.f739j.mo815c())) {
            h m566d = m566d(0);
            m566d.f785q = true;
            m558a(m566d, false);
            m557a(m566d, (KeyEvent) null);
            return;
        }
        Window.Callback m575h = m575h();
        if (this.f739j.mo817e()) {
            this.f739j.mo819g();
            if (this.f720H) {
                return;
            }
            m575h.onPanelClosed(C0175j.AppCompatTheme_tooltipForegroundColor, m566d(0).f778j);
            return;
        }
        if (m575h == null || this.f720H) {
            return;
        }
        if (this.f724L && (1 & this.f725M) != 0) {
            this.f732c.getDecorView().removeCallbacks(this.f726N);
            this.f726N.run();
        }
        h m566d2 = m566d(0);
        C0201h c0201h2 = m566d2.f778j;
        if (c0201h2 == null || m566d2.f786r || !m575h.onPreparePanel(0, m566d2.f777i, c0201h2)) {
            return;
        }
        m575h.onMenuOpened(C0175j.AppCompatTheme_tooltipForegroundColor, m566d2.f778j);
        this.f739j.mo813a();
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: a */
    public void mo545a(Bundle bundle) {
        Window.Callback callback = this.f733d;
        if (callback instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) callback;
                try {
                    str = C0027d.m93b(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0141a abstractC0141a = this.f736g;
                if (abstractC0141a == null) {
                    this.f727O = true;
                } else {
                    abstractC0141a.mo522b(true);
                }
            }
        }
        if (bundle == null || this.f721I != -100) {
            return;
        }
        this.f721I = bundle.getInt("appcompat:local_night_mode", -100);
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: a */
    public void mo546a(View view) {
        m570f();
        ViewGroup viewGroup = (ViewGroup) this.f749t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f733d.onContentChanged();
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: a */
    public void mo547a(View view, ViewGroup.LayoutParams layoutParams) {
        m570f();
        ViewGroup viewGroup = (ViewGroup) this.f749t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f733d.onContentChanged();
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: a */
    public final void mo548a(CharSequence charSequence) {
        this.f738i = charSequence;
        InterfaceC0232f0 interfaceC0232f0 = this.f739j;
        if (interfaceC0232f0 != null) {
            interfaceC0232f0.setWindowTitle(charSequence);
            return;
        }
        AbstractC0141a abstractC0141a = this.f736g;
        if (abstractC0141a != null) {
            abstractC0141a.mo517a(charSequence);
            return;
        }
        TextView textView = this.f750u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if ((r3.getPackageManager().getActivityInfo(new android.content.ComponentName(r11.f731b, r11.f731b.getClass()), 0).configChanges & 512) == 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo549a() {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.mo549a():boolean");
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: a */
    public boolean mo550a(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = C0175j.AppCompatTheme_tooltipForegroundColor;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = C0175j.AppCompatTheme_tooltipFrameBackground;
        }
        if (this.f715C && i2 == 108) {
            return false;
        }
        if (this.f754y && i2 == 1) {
            this.f754y = false;
        }
        if (i2 == 1) {
            m578k();
            this.f715C = true;
            return true;
        }
        if (i2 == 2) {
            m578k();
            this.f752w = true;
            return true;
        }
        if (i2 == 5) {
            m578k();
            this.f753x = true;
            return true;
        }
        if (i2 == 10) {
            m578k();
            this.f713A = true;
            return true;
        }
        if (i2 == 108) {
            m578k();
            this.f754y = true;
            return true;
        }
        if (i2 != 109) {
            return this.f732c.requestFeature(i2);
        }
        m578k();
        this.f755z = true;
        return true;
    }

    /* renamed from: a */
    public final boolean m560a(h hVar, int i2, KeyEvent keyEvent, int i3) {
        C0201h c0201h;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((hVar.f781m || m564b(hVar, keyEvent)) && (c0201h = hVar.f778j) != null) {
            z = c0201h.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.f739j == null) {
            m558a(hVar, true);
        }
        return z;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h.a
    /* renamed from: a */
    public boolean mo561a(C0201h c0201h, MenuItem menuItem) {
        h m554a;
        Window.Callback m575h = m575h();
        if (m575h == null || this.f720H || (m554a = m554a((Menu) c0201h.mo708c())) == null) {
            return false;
        }
        return m575h.onMenuItemSelected(m554a.f769a, menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m562a(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.m562a(android.view.KeyEvent):boolean");
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: b */
    public void mo551b() {
        LayoutInflater from = LayoutInflater.from(this.f731b);
        if (from.getFactory() == null) {
            C0027d.m94b(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0155o) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: b */
    public void mo552b(int i2) {
        m570f();
        ViewGroup viewGroup = (ViewGroup) this.f749t.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f731b).inflate(i2, viewGroup);
        this.f733d.onContentChanged();
    }

    /* renamed from: b */
    public void m563b(C0201h c0201h) {
        if (this.f716D) {
            return;
        }
        this.f716D = true;
        this.f739j.mo814b();
        Window.Callback m575h = m575h();
        if (m575h != null && !this.f720H) {
            m575h.onPanelClosed(C0175j.AppCompatTheme_tooltipForegroundColor, c0201h);
        }
        this.f716D = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8 A[RETURN] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m564b(p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.h r11, android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.m564b(a.b.d.a.o$h, android.view.KeyEvent):boolean");
    }

    @Override // p000a.p006b.p025d.p026a.AbstractC0154n
    /* renamed from: c */
    public void mo553c() {
        m576i();
        AbstractC0141a abstractC0141a = this.f736g;
        m569e(0);
    }

    /* renamed from: c */
    public void m565c(int i2) {
        h m566d;
        h m566d2 = m566d(i2);
        if (m566d2.f778j != null) {
            Bundle bundle = new Bundle();
            m566d2.f778j.m705b(bundle);
            if (bundle.size() > 0) {
                m566d2.f787s = bundle;
            }
            m566d2.f778j.m716k();
            m566d2.f778j.clear();
        }
        m566d2.f786r = true;
        m566d2.f785q = true;
        if ((i2 != 108 && i2 != 0) || this.f739j == null || (m566d = m566d(0)) == null) {
            return;
        }
        m566d.f781m = false;
        m564b(m566d, null);
    }

    /* renamed from: d */
    public h m566d(int i2) {
        h[] hVarArr = this.f717E;
        if (hVarArr == null || hVarArr.length <= i2) {
            h[] hVarArr2 = new h[i2 + 1];
            if (hVarArr != null) {
                System.arraycopy(hVarArr, 0, hVarArr2, 0, hVarArr.length);
            }
            this.f717E = hVarArr2;
            hVarArr = hVarArr2;
        }
        h hVar = hVarArr[i2];
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(i2);
        hVarArr[i2] = hVar2;
        return hVar2;
    }

    /* renamed from: d */
    public void m567d() {
        C0121p c0121p = this.f746q;
        if (c0121p != null) {
            c0121p.m492a();
        }
    }

    /* renamed from: e */
    public final void m568e() {
        if (this.f723K == null) {
            Context context = this.f731b;
            if (C0164x.f803d == null) {
                Context applicationContext = context.getApplicationContext();
                C0164x.f803d = new C0164x(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f723K = new f(C0164x.f803d);
        }
    }

    /* renamed from: e */
    public final void m569e(int i2) {
        this.f725M = (1 << i2) | this.f725M;
        if (this.f724L) {
            return;
        }
        C0119n.m462a(this.f732c.getDecorView(), this.f726N);
        this.f724L = true;
    }

    /* renamed from: f */
    public final void m570f() {
        ViewGroup viewGroup;
        if (this.f748s) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f731b.obtainStyledAttributes(C0175j.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(C0175j.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C0175j.AppCompatTheme_windowNoTitle, false)) {
            mo550a(1);
        } else if (obtainStyledAttributes.getBoolean(C0175j.AppCompatTheme_windowActionBar, false)) {
            mo550a(C0175j.AppCompatTheme_tooltipForegroundColor);
        }
        if (obtainStyledAttributes.getBoolean(C0175j.AppCompatTheme_windowActionBarOverlay, false)) {
            mo550a(C0175j.AppCompatTheme_tooltipFrameBackground);
        }
        if (obtainStyledAttributes.getBoolean(C0175j.AppCompatTheme_windowActionModeOverlay, false)) {
            mo550a(10);
        }
        this.f714B = obtainStyledAttributes.getBoolean(C0175j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.f732c.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f731b);
        if (this.f715C) {
            viewGroup = this.f713A ? (ViewGroup) from.inflate(C0172g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C0172g.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C0119n.m458a(viewGroup, new C0156p(this));
            } else {
                ((InterfaceC0244j0) viewGroup).setOnFitSystemWindowsListener(new C0157q(this));
            }
        } else if (this.f714B) {
            viewGroup = (ViewGroup) from.inflate(C0172g.abc_dialog_title_material, (ViewGroup) null);
            this.f755z = false;
            this.f754y = false;
        } else if (this.f754y) {
            TypedValue typedValue = new TypedValue();
            this.f731b.getTheme().resolveAttribute(C0166a.actionBarTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            viewGroup = (ViewGroup) LayoutInflater.from(i2 != 0 ? new C0188c(this.f731b, i2) : this.f731b).inflate(C0172g.abc_screen_toolbar, (ViewGroup) null);
            this.f739j = (InterfaceC0232f0) viewGroup.findViewById(C0171f.decor_content_parent);
            this.f739j.setWindowCallback(m575h());
            if (this.f755z) {
                this.f739j.mo811a(C0175j.AppCompatTheme_tooltipFrameBackground);
            }
            if (this.f752w) {
                this.f739j.mo811a(2);
            }
            if (this.f753x) {
                this.f739j.mo811a(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder m1134a = C0335a.m1134a("AppCompat does not support the current theme features: { windowActionBar: ");
            m1134a.append(this.f754y);
            m1134a.append(", windowActionBarOverlay: ");
            m1134a.append(this.f755z);
            m1134a.append(", android:windowIsFloating: ");
            m1134a.append(this.f714B);
            m1134a.append(", windowActionModeOverlay: ");
            m1134a.append(this.f713A);
            m1134a.append(", windowNoTitle: ");
            m1134a.append(this.f715C);
            m1134a.append(" }");
            throw new IllegalArgumentException(m1134a.toString());
        }
        if (this.f739j == null) {
            this.f750u = (TextView) viewGroup.findViewById(C0171f.title);
        }
        C0242i1.m838b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0171f.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f732c.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f732c.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0158r(this));
        this.f749t = viewGroup;
        Window.Callback callback = this.f733d;
        CharSequence title = callback instanceof Activity ? ((Activity) callback).getTitle() : this.f738i;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0232f0 interfaceC0232f0 = this.f739j;
            if (interfaceC0232f0 != null) {
                interfaceC0232f0.setWindowTitle(title);
            } else {
                AbstractC0141a abstractC0141a = this.f736g;
                if (abstractC0141a != null) {
                    abstractC0141a.mo517a(title);
                } else {
                    TextView textView = this.f750u;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f749t.findViewById(R.id.content);
        View decorView = this.f732c.getDecorView();
        contentFrameLayout2.m1058a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes2 = this.f731b.obtainStyledAttributes(C0175j.AppCompatTheme);
        obtainStyledAttributes2.getValue(C0175j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(C0175j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(C0175j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes2.getValue(C0175j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(C0175j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes2.getValue(C0175j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(C0175j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes2.getValue(C0175j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(C0175j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes2.getValue(C0175j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f748s = true;
        h m566d = m566d(0);
        if (this.f720H) {
            return;
        }
        if (m566d == null || m566d.f778j == null) {
            m569e(C0175j.AppCompatTheme_tooltipForegroundColor);
        }
    }

    /* renamed from: f */
    public void m571f(int i2) {
        if (i2 == 108) {
            m576i();
            AbstractC0141a abstractC0141a = this.f736g;
            if (abstractC0141a != null) {
                abstractC0141a.mo518a(true);
            }
        }
    }

    /* renamed from: g */
    public final Context m572g() {
        m576i();
        AbstractC0141a abstractC0141a = this.f736g;
        Context mo523c = abstractC0141a != null ? abstractC0141a.mo523c() : null;
        return mo523c == null ? this.f731b : mo523c;
    }

    /* renamed from: g */
    public void m573g(int i2) {
        if (i2 == 108) {
            m576i();
            AbstractC0141a abstractC0141a = this.f736g;
            if (abstractC0141a != null) {
                abstractC0141a.mo518a(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            h m566d = m566d(i2);
            if (m566d.f783o) {
                m558a(m566d, false);
            }
        }
    }

    /* renamed from: h */
    public int m574h(int i2) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.f743n;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f743n.getLayoutParams();
            if (this.f743n.isShown()) {
                if (this.f728P == null) {
                    this.f728P = new Rect();
                    this.f729Q = new Rect();
                }
                Rect rect = this.f728P;
                Rect rect2 = this.f729Q;
                rect.set(0, i2, 0, 0);
                C0242i1.m836a(this.f749t, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.f751v;
                    if (view == null) {
                        this.f751v = new View(this.f731b);
                        this.f751v.setBackgroundColor(this.f731b.getResources().getColor(C0168c.abc_input_method_navigation_guard));
                        this.f749t.addView(this.f751v, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.f751v.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = this.f751v != null;
                if (!this.f713A && z) {
                    i2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                this.f743n.setLayoutParams(marginLayoutParams);
            }
        }
        View view2 = this.f751v;
        if (view2 != null) {
            view2.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    /* renamed from: h */
    public final Window.Callback m575h() {
        return this.f732c.getCallback();
    }

    /* renamed from: i */
    public final void m576i() {
        m570f();
        if (this.f754y && this.f736g == null) {
            Window.Callback callback = this.f733d;
            if (callback instanceof Activity) {
                this.f736g = new C0165y((Activity) callback, this.f755z);
            } else if (callback instanceof Dialog) {
                this.f736g = new C0165y((Dialog) callback);
            }
            AbstractC0141a abstractC0141a = this.f736g;
            if (abstractC0141a != null) {
                abstractC0141a.mo522b(this.f727O);
            }
        }
    }

    /* renamed from: j */
    public final boolean m577j() {
        ViewGroup viewGroup;
        return this.f748s && (viewGroup = this.f749t) != null && C0119n.m475j(viewGroup);
    }

    /* renamed from: k */
    public final void m578k() {
        if (this.f748s) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            android.support.v7.app.AppCompatViewInflater r0 = r11.f730R
            r1 = 0
            if (r0 != 0) goto L62
            android.content.Context r0 = r11.f731b
            int[] r2 = p000a.p006b.p025d.p027b.C0175j.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = p000a.p006b.p025d.p027b.C0175j.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L5b
            java.lang.Class<android.support.v7.app.AppCompatViewInflater> r2 = android.support.v7.app.AppCompatViewInflater.class
            java.lang.String r2 = r2.getName()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L22
            goto L5b
        L22:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Throwable -> L37
            android.support.v7.app.AppCompatViewInflater r2 = (android.support.v7.app.AppCompatViewInflater) r2     // Catch: java.lang.Throwable -> L37
            r11.f730R = r2     // Catch: java.lang.Throwable -> L37
            goto L62
        L37:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to instantiate custom view inflater "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "AppCompatDelegate"
            android.util.Log.i(r3, r0, r2)
            android.support.v7.app.AppCompatViewInflater r0 = new android.support.v7.app.AppCompatViewInflater
            r0.<init>()
            r11.f730R = r0
            goto L62
        L5b:
            android.support.v7.app.AppCompatViewInflater r0 = new android.support.v7.app.AppCompatViewInflater
            r0.<init>()
            r11.f730R = r0
        L62:
            boolean r0 = p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.f710S
            if (r0 == 0) goto L9c
            boolean r0 = r15 instanceof org.xmlpull.v1.XmlPullParser
            r2 = 1
            if (r0 == 0) goto L75
            r0 = r15
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L9a
            goto L83
        L75:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            if (r0 != 0) goto L7b
            goto L9a
        L7b:
            android.view.Window r3 = r11.f732c
            android.view.View r3 = r3.getDecorView()
        L81:
            if (r0 != 0) goto L85
        L83:
            r1 = 1
            goto L9a
        L85:
            if (r0 == r3) goto L9a
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L9a
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            boolean r4 = p000a.p006b.p010c.p021h.C0119n.m474i(r4)
            if (r4 == 0) goto L95
            goto L9a
        L95:
            android.view.ViewParent r0 = r0.getParent()
            goto L81
        L9a:
            r7 = r1
            goto L9d
        L9c:
            r7 = 0
        L9d:
            android.support.v7.app.AppCompatViewInflater r2 = r11.f730R
            boolean r8 = p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.f710S
            r9 = 1
            p000a.p006b.p025d.p035g.C0239h1.m829a()
            r10 = 0
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.m1014a(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
