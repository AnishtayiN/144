package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0169d;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;

/* renamed from: a.b.d.f.i.o */
/* loaded from: classes.dex */
public class C0208o implements InterfaceC0203j {

    /* renamed from: a */
    public final Context f1149a;

    /* renamed from: b */
    public final C0201h f1150b;

    /* renamed from: c */
    public final boolean f1151c;

    /* renamed from: d */
    public final int f1152d;

    /* renamed from: e */
    public final int f1153e;

    /* renamed from: f */
    public View f1154f;

    /* renamed from: h */
    public boolean f1156h;

    /* renamed from: i */
    public InterfaceC0209p.a f1157i;

    /* renamed from: j */
    public AbstractC0207n f1158j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f1159k;

    /* renamed from: g */
    public int f1155g = 8388611;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f1160l = new a();

    /* renamed from: a.b.d.f.i.o$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0208o.this.mo736c();
        }
    }

    public C0208o(Context context, C0201h c0201h, View view, boolean z, int i, int i2) {
        this.f1149a = context;
        this.f1150b = c0201h;
        this.f1154f = view;
        this.f1151c = z;
        this.f1152d = i;
        this.f1153e = i2;
    }

    /* renamed from: a */
    public AbstractC0207n m732a() {
        if (this.f1158j == null) {
            Display defaultDisplay = ((WindowManager) this.f1149a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            AbstractC0207n viewOnKeyListenerC0198e = Math.min(point.x, point.y) >= this.f1149a.getResources().getDimensionPixelSize(C0169d.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC0198e(this.f1149a, this.f1154f, this.f1152d, this.f1153e, this.f1151c) : new ViewOnKeyListenerC0213t(this.f1149a, this.f1150b, this.f1154f, this.f1152d, this.f1153e, this.f1151c);
            viewOnKeyListenerC0198e.mo670a(this.f1150b);
            viewOnKeyListenerC0198e.mo672a(this.f1160l);
            viewOnKeyListenerC0198e.mo671a(this.f1154f);
            viewOnKeyListenerC0198e.mo660a(this.f1157i);
            viewOnKeyListenerC0198e.mo675b(this.f1156h);
            viewOnKeyListenerC0198e.mo669a(this.f1155g);
            this.f1158j = viewOnKeyListenerC0198e;
        }
        return this.f1158j;
    }

    /* renamed from: a */
    public final void m733a(int i, int i2, boolean z, boolean z2) {
        AbstractC0207n m732a = m732a();
        m732a.mo680c(z2);
        if (z) {
            if ((C0027d.m34a(this.f1155g, C0119n.m468c(this.f1154f)) & 7) == 5) {
                i -= this.f1154f.getWidth();
            }
            m732a.mo674b(i);
            m732a.mo678c(i2);
            int i3 = (int) ((this.f1149a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m732a.f1148b = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        m732a.mo681d();
    }

    /* renamed from: a */
    public void m734a(InterfaceC0209p.a aVar) {
        this.f1157i = aVar;
        AbstractC0207n abstractC0207n = this.f1158j;
        if (abstractC0207n != null) {
            abstractC0207n.mo660a(aVar);
        }
    }

    /* renamed from: b */
    public boolean m735b() {
        AbstractC0207n abstractC0207n = this.f1158j;
        return abstractC0207n != null && abstractC0207n.mo676b();
    }

    /* renamed from: c */
    public void mo736c() {
        this.f1158j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1159k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public boolean m737d() {
        if (m735b()) {
            return true;
        }
        if (this.f1154f == null) {
            return false;
        }
        m733a(0, 0, false, false);
        return true;
    }
}
