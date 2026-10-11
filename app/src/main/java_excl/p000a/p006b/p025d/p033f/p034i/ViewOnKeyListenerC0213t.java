package p000a.p006b.p025d.p033f.p034i;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import p000a.p006b.p025d.p027b.C0169d;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p035g.C0241i0;
import p000a.p006b.p025d.p035g.C0259q0;

/* renamed from: a.b.d.f.i.t */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0213t extends AbstractC0207n implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0209p, View.OnKeyListener {

    /* renamed from: w */
    public static final int f1162w = C0172g.abc_popup_menu_item_layout;

    /* renamed from: c */
    public final Context f1163c;

    /* renamed from: d */
    public final C0201h f1164d;

    /* renamed from: e */
    public final C0200g f1165e;

    /* renamed from: f */
    public final boolean f1166f;

    /* renamed from: g */
    public final int f1167g;

    /* renamed from: h */
    public final int f1168h;

    /* renamed from: i */
    public final int f1169i;

    /* renamed from: j */
    public final C0259q0 f1170j;

    /* renamed from: m */
    public PopupWindow.OnDismissListener f1173m;

    /* renamed from: n */
    public View f1174n;

    /* renamed from: o */
    public View f1175o;

    /* renamed from: p */
    public InterfaceC0209p.a f1176p;

    /* renamed from: q */
    public ViewTreeObserver f1177q;

    /* renamed from: r */
    public boolean f1178r;

    /* renamed from: s */
    public boolean f1179s;

    /* renamed from: t */
    public int f1180t;

    /* renamed from: v */
    public boolean f1182v;

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f1171k = new a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f1172l = new b();

    /* renamed from: u */
    public int f1181u = 0;

    /* renamed from: a.b.d.f.i.t$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerC0213t.this.mo676b()) {
                ViewOnKeyListenerC0213t viewOnKeyListenerC0213t = ViewOnKeyListenerC0213t.this;
                if (viewOnKeyListenerC0213t.f1170j.f1382E) {
                    return;
                }
                View view = viewOnKeyListenerC0213t.f1175o;
                if (view == null || !view.isShown()) {
                    ViewOnKeyListenerC0213t.this.dismiss();
                } else {
                    ViewOnKeyListenerC0213t.this.f1170j.mo681d();
                }
            }
        }
    }

    /* renamed from: a.b.d.f.i.t$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0213t.this.f1177q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0213t.this.f1177q = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0213t viewOnKeyListenerC0213t = ViewOnKeyListenerC0213t.this;
                viewOnKeyListenerC0213t.f1177q.removeGlobalOnLayoutListener(viewOnKeyListenerC0213t.f1171k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0213t(Context context, C0201h c0201h, View view, int i, int i2, boolean z) {
        this.f1163c = context;
        this.f1164d = c0201h;
        this.f1166f = z;
        this.f1165e = new C0200g(c0201h, LayoutInflater.from(context), this.f1166f, f1162w);
        this.f1168h = i;
        this.f1169i = i2;
        Resources resources = context.getResources();
        this.f1167g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0169d.abc_config_prefDialogWidth));
        this.f1174n = view;
        this.f1170j = new C0259q0(this.f1163c, null, this.f1168h, this.f1169i);
        c0201h.m695a(this, context);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: a */
    public void mo669a(int i) {
        this.f1181u = i;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: a */
    public void mo670a(C0201h c0201h) {
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo659a(C0201h c0201h, boolean z) {
        if (c0201h != this.f1164d) {
            return;
        }
        dismiss();
        InterfaceC0209p.a aVar = this.f1176p;
        if (aVar != null) {
            aVar.mo579a(c0201h, z);
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo660a(InterfaceC0209p.a aVar) {
        this.f1176p = aVar;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: a */
    public void mo671a(View view) {
        this.f1174n = view;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: a */
    public void mo672a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1173m = onDismissListener;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo662a(boolean z) {
        this.f1179s = false;
        C0200g c0200g = this.f1165e;
        if (c0200g != null) {
            c0200g.notifyDataSetChanged();
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo673a() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo664a(p000a.p006b.p025d.p033f.p034i.SubMenuC0214u r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L76
            a.b.d.f.i.o r0 = new a.b.d.f.i.o
            android.content.Context r3 = r9.f1163c
            android.view.View r5 = r9.f1175o
            boolean r6 = r9.f1166f
            int r7 = r9.f1168h
            int r8 = r9.f1169i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            a.b.d.f.i.p$a r2 = r9.f1176p
            r0.m734a(r2)
            boolean r2 = p000a.p006b.p025d.p033f.p034i.AbstractC0207n.m730b(r10)
            r0.f1156h = r2
            a.b.d.f.i.n r3 = r0.f1158j
            if (r3 == 0) goto L2a
            r3.mo675b(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f1173m
            r0.f1159k = r2
            r2 = 0
            r9.f1173m = r2
            a.b.d.f.i.h r2 = r9.f1164d
            r2.m699a(r1)
            a.b.d.g.q0 r2 = r9.f1170j
            int r3 = r2.f1389g
            boolean r4 = r2.f1392j
            if (r4 != 0) goto L40
            r2 = 0
            goto L42
        L40:
            int r2 = r2.f1390h
        L42:
            int r4 = r9.f1181u
            android.view.View r5 = r9.f1174n
            int r5 = p000a.p006b.p010c.p021h.C0119n.m468c(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5a
            android.view.View r4 = r9.f1174n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5a:
            boolean r4 = r0.m735b()
            r5 = 1
            if (r4 == 0) goto L62
            goto L6b
        L62:
            android.view.View r4 = r0.f1154f
            if (r4 != 0) goto L68
            r0 = 0
            goto L6c
        L68:
            r0.m733a(r3, r2, r5, r5)
        L6b:
            r0 = 1
        L6c:
            if (r0 == 0) goto L76
            a.b.d.f.i.p$a r0 = r9.f1176p
            if (r0 == 0) goto L75
            r0.mo580a(r10)
        L75:
            return r5
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p033f.p034i.ViewOnKeyListenerC0213t.mo664a(a.b.d.f.i.u):boolean");
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: b */
    public void mo674b(int i) {
        this.f1170j.f1389g = i;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: b */
    public void mo675b(boolean z) {
        this.f1165e.f1074d = z;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: b */
    public boolean mo676b() {
        return !this.f1178r && this.f1170j.mo676b();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: c */
    public ListView mo677c() {
        return this.f1170j.f1386d;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: c */
    public void mo678c(int i) {
        C0259q0 c0259q0 = this.f1170j;
        c0259q0.f1390h = i;
        c0259q0.f1392j = true;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: c */
    public void mo680c(boolean z) {
        this.f1182v = z;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: d */
    public void mo681d() {
        View view;
        boolean z = true;
        if (!mo676b()) {
            if (this.f1178r || (view = this.f1174n) == null) {
                z = false;
            } else {
                this.f1175o = view;
                this.f1170j.f1383F.setOnDismissListener(this);
                C0259q0 c0259q0 = this.f1170j;
                c0259q0.f1404v = this;
                c0259q0.m891a(true);
                View view2 = this.f1175o;
                boolean z2 = this.f1177q == null;
                this.f1177q = view2.getViewTreeObserver();
                if (z2) {
                    this.f1177q.addOnGlobalLayoutListener(this.f1171k);
                }
                view2.addOnAttachStateChangeListener(this.f1172l);
                C0259q0 c0259q02 = this.f1170j;
                c0259q02.f1402t = view2;
                c0259q02.f1395m = this.f1181u;
                if (!this.f1179s) {
                    this.f1180t = AbstractC0207n.m729a(this.f1165e, null, this.f1163c, this.f1167g);
                    this.f1179s = true;
                }
                this.f1170j.m887a(this.f1180t);
                this.f1170j.f1383F.setInputMethodMode(2);
                this.f1170j.m888a(m731f());
                this.f1170j.mo681d();
                C0241i0 c0241i0 = this.f1170j.f1386d;
                c0241i0.setOnKeyListener(this);
                if (this.f1182v && this.f1164d.f1092n != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1163c).inflate(C0172g.abc_popup_menu_header_item_layout, (ViewGroup) c0241i0, false);
                    TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                    if (textView != null) {
                        textView.setText(this.f1164d.f1092n);
                    }
                    frameLayout.setEnabled(false);
                    c0241i0.addHeaderView(frameLayout, null, false);
                }
                this.f1170j.mo890a((ListAdapter) this.f1165e);
                this.f1170j.mo681d();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    public void dismiss() {
        if (mo676b()) {
            this.f1170j.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1178r = true;
        this.f1164d.m699a(true);
        ViewTreeObserver viewTreeObserver = this.f1177q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1177q = this.f1175o.getViewTreeObserver();
            }
            this.f1177q.removeGlobalOnLayoutListener(this.f1171k);
            this.f1177q = null;
        }
        this.f1175o.removeOnAttachStateChangeListener(this.f1172l);
        PopupWindow.OnDismissListener onDismissListener = this.f1173m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
