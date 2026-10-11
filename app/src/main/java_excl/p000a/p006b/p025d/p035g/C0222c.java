package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.AbstractC0108c;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p033f.p034i.AbstractC0195b;
import p000a.p006b.p025d.p033f.p034i.AbstractC0207n;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.C0204k;
import p000a.p006b.p025d.p033f.p034i.C0208o;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0212s;
import p000a.p006b.p025d.p033f.p034i.SubMenuC0214u;

/* renamed from: a.b.d.g.c */
/* loaded from: classes.dex */
public class C0222c extends AbstractC0195b implements AbstractC0108c.a {

    /* renamed from: A */
    public c f1204A;

    /* renamed from: B */
    public b f1205B;

    /* renamed from: C */
    public final f f1206C;

    /* renamed from: D */
    public int f1207D;

    /* renamed from: j */
    public d f1208j;

    /* renamed from: k */
    public Drawable f1209k;

    /* renamed from: l */
    public boolean f1210l;

    /* renamed from: m */
    public boolean f1211m;

    /* renamed from: n */
    public boolean f1212n;

    /* renamed from: o */
    public int f1213o;

    /* renamed from: p */
    public int f1214p;

    /* renamed from: q */
    public int f1215q;

    /* renamed from: r */
    public boolean f1216r;

    /* renamed from: s */
    public boolean f1217s;

    /* renamed from: t */
    public boolean f1218t;

    /* renamed from: u */
    public boolean f1219u;

    /* renamed from: v */
    public int f1220v;

    /* renamed from: w */
    public final SparseBooleanArray f1221w;

    /* renamed from: x */
    public View f1222x;

    /* renamed from: y */
    public e f1223y;

    /* renamed from: z */
    public a f1224z;

    /* renamed from: a.b.d.g.c$a */
    public class a extends C0208o {
        public a(Context context, SubMenuC0214u subMenuC0214u, View view) {
            super(context, subMenuC0214u, view, false, C0166a.actionOverflowMenuStyle, 0);
            if (!subMenuC0214u.f1186C.m725d()) {
                View view2 = C0222c.this.f1208j;
                this.f1154f = view2 == null ? (View) C0222c.this.f1019i : view2;
            }
            m734a(C0222c.this.f1206C);
        }

        @Override // p000a.p006b.p025d.p033f.p034i.C0208o
        /* renamed from: c */
        public void mo736c() {
            C0222c c0222c = C0222c.this;
            c0222c.f1224z = null;
            c0222c.f1207D = 0;
            super.mo736c();
        }
    }

    /* renamed from: a.b.d.g.c$b */
    public class b extends ActionMenuItemView.AbstractC0292b {
        public b() {
        }
    }

    /* renamed from: a.b.d.g.c$c */
    public class c implements Runnable {

        /* renamed from: b */
        public e f1227b;

        public c(e eVar) {
            this.f1227b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0201h.a aVar;
            C0201h c0201h = C0222c.this.f1014d;
            if (c0201h != null && (aVar = c0201h.f1083e) != null) {
                aVar.mo559a(c0201h);
            }
            View view = (View) C0222c.this.f1019i;
            if (view != null && view.getWindowToken() != null && this.f1227b.m737d()) {
                C0222c.this.f1223y = this.f1227b;
            }
            C0222c.this.f1204A = null;
        }
    }

    /* renamed from: a.b.d.g.c$d */
    public class d extends C0252n implements ActionMenuView.InterfaceC0299a {

        /* renamed from: a.b.d.g.c$d$a */
        public class a extends AbstractViewOnTouchListenerC0247k0 {
            public a(View view, C0222c c0222c) {
                super(view);
            }

            @Override // p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0
            /* renamed from: b */
            public InterfaceC0212s mo770b() {
                e eVar = C0222c.this.f1223y;
                if (eVar == null) {
                    return null;
                }
                return eVar.m732a();
            }

            @Override // p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0
            /* renamed from: c */
            public boolean mo771c() {
                C0222c.this.m767f();
                return true;
            }

            @Override // p000a.p006b.p025d.p035g.AbstractViewOnTouchListenerC0247k0
            /* renamed from: d */
            public boolean mo772d() {
                C0222c c0222c = C0222c.this;
                if (c0222c.f1204A != null) {
                    return false;
                }
                c0222c.m764c();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, C0166a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0027d.m69a((View) this, getContentDescription());
            setOnTouchListener(new a(this, C0222c.this));
        }

        @Override // android.support.v7.widget.ActionMenuView.InterfaceC0299a
        /* renamed from: a */
        public boolean mo768a() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.InterfaceC0299a
        /* renamed from: b */
        public boolean mo769b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0222c.this.m767f();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0027d.m64a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: a.b.d.g.c$e */
    public class e extends C0208o {
        public e(Context context, C0201h c0201h, View view, boolean z) {
            super(context, c0201h, view, z, C0166a.actionOverflowMenuStyle, 0);
            this.f1155g = 8388613;
            m734a(C0222c.this.f1206C);
        }

        @Override // p000a.p006b.p025d.p033f.p034i.C0208o
        /* renamed from: c */
        public void mo736c() {
            C0201h c0201h = C0222c.this.f1014d;
            if (c0201h != null) {
                c0201h.m699a(true);
            }
            C0222c.this.f1223y = null;
            super.mo736c();
        }
    }

    /* renamed from: a.b.d.g.c$f */
    public class f implements InterfaceC0209p.a {
        public f() {
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
        /* renamed from: a */
        public void mo579a(C0201h c0201h, boolean z) {
            if (c0201h instanceof SubMenuC0214u) {
                c0201h.mo708c().m699a(false);
            }
            InterfaceC0209p.a aVar = C0222c.this.f1016f;
            if (aVar != null) {
                aVar.mo579a(c0201h, z);
            }
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
        /* renamed from: a */
        public boolean mo580a(C0201h c0201h) {
            if (c0201h == null) {
                return false;
            }
            C0222c.this.f1207D = ((SubMenuC0214u) c0201h).f1186C.getItemId();
            InterfaceC0209p.a aVar = C0222c.this.f1016f;
            if (aVar != null) {
                return aVar.mo580a(c0201h);
            }
            return false;
        }
    }

    public C0222c(Context context) {
        super(context, C0172g.abc_action_menu_layout, C0172g.abc_action_menu_item_layout);
        this.f1221w = new SparseBooleanArray();
        this.f1206C = new f();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0195b
    /* renamed from: a */
    public View mo657a(C0204k c0204k, View view, ViewGroup viewGroup) {
        View actionView = c0204k.getActionView();
        if (actionView == null || c0204k.m723c()) {
            actionView = super.mo657a(c0204k, view, viewGroup);
        }
        actionView.setVisibility(c0204k.f1112D ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0195b, p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo659a(C0201h c0201h, boolean z) {
        m763b();
        super.mo659a(c0201h, z);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0195b, p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo661a(Context context, C0201h c0201h) {
        super.mo661a(context, c0201h);
        Resources resources = context.getResources();
        if (!this.f1212n) {
            this.f1211m = Build.VERSION.SDK_INT < 19 ? true ^ ViewConfiguration.get(context).hasPermanentMenuKey() : true;
        }
        int i = 2;
        if (!this.f1218t) {
            this.f1213o = context.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.f1216r) {
            Configuration configuration = context.getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else if (i2 >= 360) {
                i = 3;
            }
            this.f1215q = i;
        }
        int i4 = this.f1213o;
        if (this.f1211m) {
            if (this.f1208j == null) {
                this.f1208j = new d(this.f1012b);
                if (this.f1210l) {
                    this.f1208j.setImageDrawable(this.f1209k);
                    this.f1209k = null;
                    this.f1210l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1208j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f1208j.getMeasuredWidth();
        } else {
            this.f1208j = null;
        }
        this.f1214p = i4;
        this.f1220v = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f1222x = null;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0195b, p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo662a(boolean z) {
        ArrayList<C0204k> arrayList;
        super.mo662a(z);
        ((View) this.f1019i).requestLayout();
        C0201h c0201h = this.f1014d;
        boolean z2 = false;
        if (c0201h != null) {
            c0201h.m690a();
            ArrayList<C0204k> arrayList2 = c0201h.f1087i;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                AbstractC0108c abstractC0108c = arrayList2.get(i).f1110B;
            }
        }
        C0201h c0201h2 = this.f1014d;
        if (c0201h2 != null) {
            c0201h2.m690a();
            arrayList = c0201h2.f1088j;
        } else {
            arrayList = null;
        }
        if (this.f1211m && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).f1112D;
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1208j == null) {
                this.f1208j = new d(this.f1012b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1208j.getParent();
            if (viewGroup != this.f1019i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1208j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1019i;
                actionMenuView.addView(this.f1208j, actionMenuView.m1042h());
            }
        } else {
            d dVar = this.f1208j;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f1019i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1208j);
                }
            }
        }
        ((ActionMenuView) this.f1019i).setOverflowReserved(this.f1211m);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo673a() {
        ArrayList<C0204k> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C0222c c0222c = this;
        C0201h c0201h = c0222c.f1014d;
        int i7 = 0;
        if (c0201h != null) {
            arrayList = c0201h.m709d();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i8 = c0222c.f1215q;
        int i9 = c0222c.f1214p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0222c.f1019i;
        int i10 = i8;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i2 = 2;
            if (i11 >= i) {
                break;
            }
            C0204k c0204k = arrayList.get(i11);
            if ((c0204k.f1139z & 2) == 2) {
                i12++;
            } else if ((c0204k.f1139z & 1) == 1) {
                i13++;
            } else {
                z = true;
            }
            if (c0222c.f1219u && c0204k.f1112D) {
                i10 = 0;
            }
            i11++;
        }
        if (c0222c.f1211m && (z || i13 + i12 > i10)) {
            i10--;
        }
        int i14 = i10 - i12;
        SparseBooleanArray sparseBooleanArray = c0222c.f1221w;
        sparseBooleanArray.clear();
        if (c0222c.f1217s) {
            int i15 = c0222c.f1220v;
            i4 = i9 / i15;
            i3 = i15 + ((i9 % i15) / i4);
        } else {
            i3 = 0;
            i4 = 0;
        }
        int i16 = i9;
        int i17 = 0;
        int i18 = 0;
        while (i17 < i) {
            C0204k c0204k2 = arrayList.get(i17);
            if ((c0204k2.f1139z & i2) == i2) {
                View mo657a = c0222c.mo657a(c0204k2, c0222c.f1222x, viewGroup);
                if (c0222c.f1222x == null) {
                    c0222c.f1222x = mo657a;
                }
                if (c0222c.f1217s) {
                    i4 -= ActionMenuView.m1038b(mo657a, i3, i4, makeMeasureSpec, i7);
                } else {
                    mo657a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i6 = mo657a.getMeasuredWidth();
                i16 -= i6;
                if (i18 != 0) {
                    i6 = i18;
                }
                int i19 = c0204k2.f1115b;
                if (i19 != 0) {
                    sparseBooleanArray.put(i19, true);
                }
                c0204k2.m722b(true);
                i5 = i;
            } else if ((c0204k2.f1139z & 1) == 1) {
                int i20 = c0204k2.f1115b;
                boolean z2 = sparseBooleanArray.get(i20);
                boolean z3 = (i14 > 0 || z2) && i16 > 0 && (!c0222c.f1217s || i4 > 0);
                if (z3) {
                    boolean z4 = z3;
                    View mo657a2 = c0222c.mo657a(c0204k2, c0222c.f1222x, viewGroup);
                    i5 = i;
                    if (c0222c.f1222x == null) {
                        c0222c.f1222x = mo657a2;
                    }
                    if (c0222c.f1217s) {
                        int m1038b = ActionMenuView.m1038b(mo657a2, i3, i4, makeMeasureSpec, 0);
                        i4 -= m1038b;
                        if (m1038b == 0) {
                            z4 = false;
                        }
                    } else {
                        mo657a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth = mo657a2.getMeasuredWidth();
                    i16 -= measuredWidth;
                    if (i18 == 0) {
                        i18 = measuredWidth;
                    }
                    z3 = z4 & (!c0222c.f1217s ? i16 + i18 <= 0 : i16 < 0);
                } else {
                    i5 = i;
                }
                if (z3 && i20 != 0) {
                    sparseBooleanArray.put(i20, true);
                } else if (z2) {
                    sparseBooleanArray.put(i20, false);
                    for (int i21 = 0; i21 < i17; i21++) {
                        C0204k c0204k3 = arrayList.get(i21);
                        if (c0204k3.f1115b == i20) {
                            if (c0204k3.m725d()) {
                                i14++;
                            }
                            c0204k3.m722b(false);
                        }
                    }
                }
                if (z3) {
                    i14--;
                }
                c0204k2.m722b(z3);
                i6 = i18;
            } else {
                i5 = i;
                c0204k2.m722b(false);
                i17++;
                i7 = 0;
                i2 = 2;
                c0222c = this;
                i = i5;
            }
            i18 = i6;
            i17++;
            i7 = 0;
            i2 = 2;
            c0222c = this;
            i = i5;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0195b, p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo664a(SubMenuC0214u subMenuC0214u) {
        boolean z = false;
        if (!subMenuC0214u.hasVisibleItems()) {
            return false;
        }
        SubMenuC0214u subMenuC0214u2 = subMenuC0214u;
        while (true) {
            C0201h c0201h = subMenuC0214u2.f1185B;
            if (c0201h == this.f1014d) {
                break;
            }
            subMenuC0214u2 = (SubMenuC0214u) c0201h;
        }
        C0204k c0204k = subMenuC0214u2.f1186C;
        ViewGroup viewGroup = (ViewGroup) this.f1019i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC0210q.a) && ((InterfaceC0210q.a) childAt).getItemData() == c0204k) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        subMenuC0214u.f1186C.getItemId();
        int size = subMenuC0214u.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = subMenuC0214u.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        this.f1224z = new a(this.f1013c, subMenuC0214u, view);
        a aVar = this.f1224z;
        aVar.f1156h = z;
        AbstractC0207n abstractC0207n = aVar.f1158j;
        if (abstractC0207n != null) {
            abstractC0207n.mo675b(z);
        }
        if (!this.f1224z.m737d()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        InterfaceC0209p.a aVar2 = this.f1016f;
        if (aVar2 != null) {
            aVar2.mo580a(subMenuC0214u);
        }
        return true;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.AbstractC0195b
    /* renamed from: a */
    public boolean mo665a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1208j) {
            return false;
        }
        super.mo665a(viewGroup, i);
        return true;
    }

    /* renamed from: b */
    public boolean m763b() {
        return m764c() | m765d();
    }

    /* renamed from: c */
    public boolean m764c() {
        Object obj;
        c cVar = this.f1204A;
        if (cVar != null && (obj = this.f1019i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f1204A = null;
            return true;
        }
        e eVar = this.f1223y;
        if (eVar == null) {
            return false;
        }
        if (eVar.m735b()) {
            eVar.f1158j.dismiss();
        }
        return true;
    }

    /* renamed from: d */
    public boolean m765d() {
        a aVar = this.f1224z;
        if (aVar == null) {
            return false;
        }
        if (!aVar.m735b()) {
            return true;
        }
        aVar.f1158j.dismiss();
        return true;
    }

    /* renamed from: e */
    public boolean m766e() {
        e eVar = this.f1223y;
        return eVar != null && eVar.m735b();
    }

    /* renamed from: f */
    public boolean m767f() {
        C0201h c0201h;
        if (!this.f1211m || m766e() || (c0201h = this.f1014d) == null || this.f1019i == null || this.f1204A != null) {
            return false;
        }
        c0201h.m690a();
        if (c0201h.f1088j.isEmpty()) {
            return false;
        }
        this.f1204A = new c(new e(this.f1013c, this.f1014d, this.f1208j, true));
        ((View) this.f1019i).post(this.f1204A);
        super.mo664a((SubMenuC0214u) null);
        return true;
    }
}
