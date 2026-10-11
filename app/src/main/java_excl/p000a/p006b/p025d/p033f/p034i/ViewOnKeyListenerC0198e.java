package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0169d;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p035g.C0259q0;
import p000a.p006b.p025d.p035g.InterfaceC0257p0;

/* renamed from: a.b.d.f.i.e */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC0198e extends AbstractC0207n implements InterfaceC0209p, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C */
    public static final int f1024C = C0172g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public PopupWindow.OnDismissListener f1025A;

    /* renamed from: B */
    public boolean f1026B;

    /* renamed from: c */
    public final Context f1027c;

    /* renamed from: d */
    public final int f1028d;

    /* renamed from: e */
    public final int f1029e;

    /* renamed from: f */
    public final int f1030f;

    /* renamed from: g */
    public final boolean f1031g;

    /* renamed from: h */
    public final Handler f1032h;

    /* renamed from: p */
    public View f1040p;

    /* renamed from: q */
    public View f1041q;

    /* renamed from: r */
    public int f1042r;

    /* renamed from: s */
    public boolean f1043s;

    /* renamed from: t */
    public boolean f1044t;

    /* renamed from: u */
    public int f1045u;

    /* renamed from: v */
    public int f1046v;

    /* renamed from: x */
    public boolean f1048x;

    /* renamed from: y */
    public InterfaceC0209p.a f1049y;

    /* renamed from: z */
    public ViewTreeObserver f1050z;

    /* renamed from: i */
    public final List<C0201h> f1033i = new ArrayList();

    /* renamed from: j */
    public final List<d> f1034j = new ArrayList();

    /* renamed from: k */
    public final ViewTreeObserver.OnGlobalLayoutListener f1035k = new a();

    /* renamed from: l */
    public final View.OnAttachStateChangeListener f1036l = new b();

    /* renamed from: m */
    public final InterfaceC0257p0 f1037m = new c();

    /* renamed from: n */
    public int f1038n = 0;

    /* renamed from: o */
    public int f1039o = 0;

    /* renamed from: w */
    public boolean f1047w = false;

    /* renamed from: a.b.d.f.i.e$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0198e.this.mo676b() || ViewOnKeyListenerC0198e.this.f1034j.size() <= 0 || ViewOnKeyListenerC0198e.this.f1034j.get(0).f1058a.f1382E) {
                return;
            }
            View view = ViewOnKeyListenerC0198e.this.f1041q;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0198e.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0198e.this.f1034j.iterator();
            while (it.hasNext()) {
                it.next().f1058a.mo681d();
            }
        }
    }

    /* renamed from: a.b.d.f.i.e$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0198e.this.f1050z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0198e.this.f1050z = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0198e viewOnKeyListenerC0198e = ViewOnKeyListenerC0198e.this;
                viewOnKeyListenerC0198e.f1050z.removeGlobalOnLayoutListener(viewOnKeyListenerC0198e.f1035k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a.b.d.f.i.e$c */
    public class c implements InterfaceC0257p0 {

        /* renamed from: a.b.d.f.i.e$c$a */
        public class a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ d f1054b;

            /* renamed from: c */
            public final /* synthetic */ MenuItem f1055c;

            /* renamed from: d */
            public final /* synthetic */ C0201h f1056d;

            public a(d dVar, MenuItem menuItem, C0201h c0201h) {
                this.f1054b = dVar;
                this.f1055c = menuItem;
                this.f1056d = c0201h;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1054b;
                if (dVar != null) {
                    ViewOnKeyListenerC0198e.this.f1026B = true;
                    dVar.f1059b.m699a(false);
                    ViewOnKeyListenerC0198e.this.f1026B = false;
                }
                if (this.f1055c.isEnabled() && this.f1055c.hasSubMenu()) {
                    this.f1056d.m702a(this.f1055c, 4);
                }
            }
        }

        public c() {
        }

        @Override // p000a.p006b.p025d.p035g.InterfaceC0257p0
        /* renamed from: a */
        public void mo683a(C0201h c0201h, MenuItem menuItem) {
            ViewOnKeyListenerC0198e.this.f1032h.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0198e.this.f1034j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0201h == ViewOnKeyListenerC0198e.this.f1034j.get(i).f1059b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC0198e.this.f1032h.postAtTime(new a(i2 < ViewOnKeyListenerC0198e.this.f1034j.size() ? ViewOnKeyListenerC0198e.this.f1034j.get(i2) : null, menuItem, c0201h), c0201h, SystemClock.uptimeMillis() + 200);
        }

        @Override // p000a.p006b.p025d.p035g.InterfaceC0257p0
        /* renamed from: b */
        public void mo684b(C0201h c0201h, MenuItem menuItem) {
            ViewOnKeyListenerC0198e.this.f1032h.removeCallbacksAndMessages(c0201h);
        }
    }

    /* renamed from: a.b.d.f.i.e$d */
    public static class d {

        /* renamed from: a */
        public final C0259q0 f1058a;

        /* renamed from: b */
        public final C0201h f1059b;

        /* renamed from: c */
        public final int f1060c;

        public d(C0259q0 c0259q0, C0201h c0201h, int i) {
            this.f1058a = c0259q0;
            this.f1059b = c0201h;
            this.f1060c = i;
        }
    }

    public ViewOnKeyListenerC0198e(Context context, View view, int i, int i2, boolean z) {
        this.f1027c = context;
        this.f1040p = view;
        this.f1029e = i;
        this.f1030f = i2;
        this.f1031g = z;
        this.f1042r = C0119n.m468c(this.f1040p) == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.f1028d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0169d.abc_config_prefDialogWidth));
        this.f1032h = new Handler();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: a */
    public void mo669a(int i) {
        if (this.f1038n != i) {
            this.f1038n = i;
            this.f1039o = C0027d.m34a(i, C0119n.m468c(this.f1040p));
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: a */
    public void mo670a(C0201h c0201h) {
        c0201h.m695a(this, this.f1027c);
        if (mo676b()) {
            m679c(c0201h);
        } else {
            this.f1033i.add(c0201h);
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo659a(C0201h c0201h, boolean z) {
        int size = this.f1034j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c0201h == this.f1034j.get(i).f1059b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.f1034j.size()) {
            this.f1034j.get(i2).f1059b.m699a(false);
        }
        d remove = this.f1034j.remove(i);
        remove.f1059b.m694a(this);
        if (this.f1026B) {
            remove.f1058a.m895a((Object) null);
            remove.f1058a.f1383F.setAnimationStyle(0);
        }
        remove.f1058a.dismiss();
        int size2 = this.f1034j.size();
        if (size2 > 0) {
            this.f1042r = this.f1034j.get(size2 - 1).f1060c;
        } else {
            this.f1042r = C0119n.m468c(this.f1040p) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                this.f1034j.get(0).f1059b.m699a(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0209p.a aVar = this.f1049y;
        if (aVar != null) {
            aVar.mo579a(c0201h, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1050z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1050z.removeGlobalOnLayoutListener(this.f1035k);
            }
            this.f1050z = null;
        }
        this.f1041q.removeOnAttachStateChangeListener(this.f1036l);
        this.f1025A.onDismiss();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo660a(InterfaceC0209p.a aVar) {
        this.f1049y = aVar;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: a */
    public void mo671a(View view) {
        if (this.f1040p != view) {
            this.f1040p = view;
            this.f1039o = C0027d.m34a(this.f1038n, C0119n.m468c(this.f1040p));
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: a */
    public void mo672a(PopupWindow.OnDismissListener onDismissListener) {
        this.f1025A = onDismissListener;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo662a(boolean z) {
        Iterator<d> it = this.f1034j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f1058a.f1386d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0200g) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo673a() {
        return false;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo664a(SubMenuC0214u subMenuC0214u) {
        for (d dVar : this.f1034j) {
            if (subMenuC0214u == dVar.f1059b) {
                dVar.f1058a.f1386d.requestFocus();
                return true;
            }
        }
        if (!subMenuC0214u.hasVisibleItems()) {
            return false;
        }
        mo670a((C0201h) subMenuC0214u);
        InterfaceC0209p.a aVar = this.f1049y;
        if (aVar != null) {
            aVar.mo580a(subMenuC0214u);
        }
        return true;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: b */
    public void mo674b(int i) {
        this.f1043s = true;
        this.f1045u = i;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: b */
    public void mo675b(boolean z) {
        this.f1047w = z;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: b */
    public boolean mo676b() {
        return this.f1034j.size() > 0 && this.f1034j.get(0).f1058a.mo676b();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: c */
    public ListView mo677c() {
        if (this.f1034j.isEmpty()) {
            return null;
        }
        return this.f1034j.get(r0.size() - 1).f1058a.f1386d;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: c */
    public void mo678c(int i) {
        this.f1044t = true;
        this.f1046v = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ac  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m679c(p000a.p006b.p025d.p033f.p034i.C0201h r17) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p033f.p034i.ViewOnKeyListenerC0198e.m679c(a.b.d.f.i.h):void");
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: c */
    public void mo680c(boolean z) {
        this.f1048x = z;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: d */
    public void mo681d() {
        if (mo676b()) {
            return;
        }
        Iterator<C0201h> it = this.f1033i.iterator();
        while (it.hasNext()) {
            m679c(it.next());
        }
        this.f1033i.clear();
        this.f1041q = this.f1040p;
        if (this.f1041q != null) {
            boolean z = this.f1050z == null;
            this.f1050z = this.f1041q.getViewTreeObserver();
            if (z) {
                this.f1050z.addOnGlobalLayoutListener(this.f1035k);
            }
            this.f1041q.addOnAttachStateChangeListener(this.f1036l);
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    public void dismiss() {
        int size = this.f1034j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1034j.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f1058a.mo676b()) {
                    dVar.f1058a.dismiss();
                }
            }
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0207n
    /* renamed from: e */
    public boolean mo682e() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1034j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1034j.get(i);
            if (!dVar.f1058a.mo676b()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f1059b.m699a(false);
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
