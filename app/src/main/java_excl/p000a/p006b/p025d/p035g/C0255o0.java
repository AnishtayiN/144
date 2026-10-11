package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0212s;

/* renamed from: a.b.d.g.o0 */
/* loaded from: classes.dex */
public class C0255o0 implements InterfaceC0212s {

    /* renamed from: G */
    public static Method f1375G;

    /* renamed from: H */
    public static Method f1376H;

    /* renamed from: I */
    public static Method f1377I;

    /* renamed from: B */
    public final Handler f1379B;

    /* renamed from: D */
    public Rect f1381D;

    /* renamed from: E */
    public boolean f1382E;

    /* renamed from: F */
    public PopupWindow f1383F;

    /* renamed from: b */
    public Context f1384b;

    /* renamed from: c */
    public ListAdapter f1385c;

    /* renamed from: d */
    public C0241i0 f1386d;

    /* renamed from: g */
    public int f1389g;

    /* renamed from: h */
    public int f1390h;

    /* renamed from: j */
    public boolean f1392j;

    /* renamed from: k */
    public boolean f1393k;

    /* renamed from: l */
    public boolean f1394l;

    /* renamed from: q */
    public View f1399q;

    /* renamed from: s */
    public DataSetObserver f1401s;

    /* renamed from: t */
    public View f1402t;

    /* renamed from: u */
    public Drawable f1403u;

    /* renamed from: v */
    public AdapterView.OnItemClickListener f1404v;

    /* renamed from: w */
    public AdapterView.OnItemSelectedListener f1405w;

    /* renamed from: e */
    public int f1387e = -2;

    /* renamed from: f */
    public int f1388f = -2;

    /* renamed from: i */
    public int f1391i = 1002;

    /* renamed from: m */
    public int f1395m = 0;

    /* renamed from: n */
    public boolean f1396n = false;

    /* renamed from: o */
    public boolean f1397o = false;

    /* renamed from: p */
    public int f1398p = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f1400r = 0;

    /* renamed from: x */
    public final e f1406x = new e();

    /* renamed from: y */
    public final d f1407y = new d();

    /* renamed from: z */
    public final c f1408z = new c();

    /* renamed from: A */
    public final a f1378A = new a();

    /* renamed from: C */
    public final Rect f1380C = new Rect();

    /* renamed from: a.b.d.g.o0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0241i0 c0241i0 = C0255o0.this.f1386d;
            if (c0241i0 != null) {
                c0241i0.setListSelectionHidden(true);
                c0241i0.requestLayout();
            }
        }
    }

    /* renamed from: a.b.d.g.o0$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0255o0.this.mo676b()) {
                C0255o0.this.mo681d();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0255o0.this.dismiss();
        }
    }

    /* renamed from: a.b.d.g.o0$c */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1) {
                if ((C0255o0.this.f1383F.getInputMethodMode() == 2) || C0255o0.this.f1383F.getContentView() == null) {
                    return;
                }
                C0255o0 c0255o0 = C0255o0.this;
                c0255o0.f1379B.removeCallbacks(c0255o0.f1406x);
                C0255o0.this.f1406x.run();
            }
        }
    }

    /* renamed from: a.b.d.g.o0$d */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0255o0.this.f1383F) != null && popupWindow.isShowing() && x >= 0 && x < C0255o0.this.f1383F.getWidth() && y >= 0 && y < C0255o0.this.f1383F.getHeight()) {
                C0255o0 c0255o0 = C0255o0.this;
                c0255o0.f1379B.postDelayed(c0255o0.f1406x, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C0255o0 c0255o02 = C0255o0.this;
            c0255o02.f1379B.removeCallbacks(c0255o02.f1406x);
            return false;
        }
    }

    /* renamed from: a.b.d.g.o0$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0241i0 c0241i0 = C0255o0.this.f1386d;
            if (c0241i0 == null || !C0119n.m474i(c0241i0) || C0255o0.this.f1386d.getCount() <= C0255o0.this.f1386d.getChildCount()) {
                return;
            }
            int childCount = C0255o0.this.f1386d.getChildCount();
            C0255o0 c0255o0 = C0255o0.this;
            if (childCount <= c0255o0.f1398p) {
                c0255o0.f1383F.setInputMethodMode(2);
                C0255o0.this.mo681d();
            }
        }
    }

    static {
        try {
            f1375G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f1376H = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f1377I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C0255o0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1384b = context;
        this.f1379B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.ListPopupWindow, i, i2);
        this.f1389g = obtainStyledAttributes.getDimensionPixelOffset(C0175j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f1390h = obtainStyledAttributes.getDimensionPixelOffset(C0175j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f1390h != 0) {
            this.f1392j = true;
        }
        obtainStyledAttributes.recycle();
        this.f1383F = new C0256p(context, attributeSet, i, i2);
        this.f1383F.setInputMethodMode(1);
    }

    /* renamed from: a */
    public C0241i0 mo885a(Context context, boolean z) {
        return new C0241i0(context, z);
    }

    /* renamed from: a */
    public Drawable m886a() {
        return this.f1383F.getBackground();
    }

    /* renamed from: a */
    public void m887a(int i) {
        Drawable background = this.f1383F.getBackground();
        if (background == null) {
            this.f1388f = i;
            return;
        }
        background.getPadding(this.f1380C);
        Rect rect = this.f1380C;
        this.f1388f = rect.left + rect.right + i;
    }

    /* renamed from: a */
    public void m888a(Rect rect) {
        this.f1381D = rect;
    }

    /* renamed from: a */
    public void m889a(Drawable drawable) {
        this.f1383F.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo890a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1401s;
        if (dataSetObserver == null) {
            this.f1401s = new b();
        } else {
            ListAdapter listAdapter2 = this.f1385c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1385c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1401s);
        }
        C0241i0 c0241i0 = this.f1386d;
        if (c0241i0 != null) {
            c0241i0.setAdapter(this.f1385c);
        }
    }

    /* renamed from: a */
    public void m891a(boolean z) {
        this.f1382E = z;
        this.f1383F.setFocusable(z);
    }

    /* renamed from: b */
    public void m892b(int i) {
        this.f1390h = i;
        this.f1392j = true;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: b */
    public boolean mo676b() {
        return this.f1383F.isShowing();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: c */
    public ListView mo677c() {
        return this.f1386d;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo681d() {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0255o0.mo681d():void");
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0212s
    public void dismiss() {
        this.f1383F.dismiss();
        View view = this.f1399q;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1399q);
            }
        }
        this.f1383F.setContentView(null);
        this.f1386d = null;
        this.f1379B.removeCallbacks(this.f1406x);
    }
}
