package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.AbstractC0106a;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p026a.AbstractC0141a;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p029d.p030a.C0181a;
import p000a.p006b.p025d.p033f.C0191f;
import p000a.p006b.p025d.p033f.InterfaceC0187b;
import p000a.p006b.p025d.p033f.p034i.C0201h;
import p000a.p006b.p025d.p033f.p034i.C0204k;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p033f.p034i.SubMenuC0214u;
import p000a.p006b.p025d.p035g.C0222c;
import p000a.p006b.p025d.p035g.C0224c1;
import p000a.p006b.p025d.p035g.C0230e1;
import p000a.p006b.p025d.p035g.C0248l;
import p000a.p006b.p025d.p035g.C0252n;
import p000a.p006b.p025d.p035g.C0267u0;
import p000a.p006b.p025d.p035g.C0274y;
import p000a.p006b.p025d.p035g.InterfaceC0235g0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public int f1938A;

    /* renamed from: B */
    public int f1939B;

    /* renamed from: C */
    public boolean f1940C;

    /* renamed from: D */
    public boolean f1941D;

    /* renamed from: E */
    public final ArrayList<View> f1942E;

    /* renamed from: F */
    public final ArrayList<View> f1943F;

    /* renamed from: G */
    public final int[] f1944G;

    /* renamed from: H */
    public InterfaceC0328f f1945H;

    /* renamed from: I */
    public final ActionMenuView.InterfaceC0303e f1946I;

    /* renamed from: J */
    public C0230e1 f1947J;

    /* renamed from: K */
    public C0222c f1948K;

    /* renamed from: L */
    public C0326d f1949L;

    /* renamed from: M */
    public InterfaceC0209p.a f1950M;

    /* renamed from: N */
    public C0201h.a f1951N;

    /* renamed from: O */
    public boolean f1952O;

    /* renamed from: P */
    public final Runnable f1953P;

    /* renamed from: b */
    public ActionMenuView f1954b;

    /* renamed from: c */
    public TextView f1955c;

    /* renamed from: d */
    public TextView f1956d;

    /* renamed from: e */
    public ImageButton f1957e;

    /* renamed from: f */
    public ImageView f1958f;

    /* renamed from: g */
    public Drawable f1959g;

    /* renamed from: h */
    public CharSequence f1960h;

    /* renamed from: i */
    public ImageButton f1961i;

    /* renamed from: j */
    public View f1962j;

    /* renamed from: k */
    public Context f1963k;

    /* renamed from: l */
    public int f1964l;

    /* renamed from: m */
    public int f1965m;

    /* renamed from: n */
    public int f1966n;

    /* renamed from: o */
    public int f1967o;

    /* renamed from: p */
    public int f1968p;

    /* renamed from: q */
    public int f1969q;

    /* renamed from: r */
    public int f1970r;

    /* renamed from: s */
    public int f1971s;

    /* renamed from: t */
    public int f1972t;

    /* renamed from: u */
    public C0267u0 f1973u;

    /* renamed from: v */
    public int f1974v;

    /* renamed from: w */
    public int f1975w;

    /* renamed from: x */
    public int f1976x;

    /* renamed from: y */
    public CharSequence f1977y;

    /* renamed from: z */
    public CharSequence f1978z;

    /* renamed from: android.support.v7.widget.Toolbar$a */
    public class C0323a implements ActionMenuView.InterfaceC0303e {
        public C0323a() {
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public class RunnableC0324b implements Runnable {
        public RunnableC0324b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m1120p();
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$c */
    public class ViewOnClickListenerC0325c implements View.OnClickListener {
        public ViewOnClickListenerC0325c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m1105c();
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$d */
    public class C0326d implements InterfaceC0209p {

        /* renamed from: b */
        public C0201h f1982b;

        /* renamed from: c */
        public C0204k f1983c;

        public C0326d() {
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
        /* renamed from: a */
        public void mo659a(C0201h c0201h, boolean z) {
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
        /* renamed from: a */
        public void mo661a(Context context, C0201h c0201h) {
            C0204k c0204k;
            C0201h c0201h2 = this.f1982b;
            if (c0201h2 != null && (c0204k = this.f1983c) != null) {
                c0201h2.mo701a(c0204k);
            }
            this.f1982b = c0201h;
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
        /* renamed from: a */
        public void mo662a(boolean z) {
            if (this.f1983c != null) {
                C0201h c0201h = this.f1982b;
                boolean z2 = false;
                if (c0201h != null) {
                    int size = c0201h.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f1982b.getItem(i) == this.f1983c) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                mo666b(this.f1982b, this.f1983c);
            }
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
        /* renamed from: a */
        public boolean mo673a() {
            return false;
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
        /* renamed from: a */
        public boolean mo663a(C0201h c0201h, C0204k c0204k) {
            Toolbar.this.m1109e();
            ViewParent parent = Toolbar.this.f1961i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1961i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1961i);
            }
            Toolbar.this.f1962j = c0204k.getActionView();
            this.f1983c = c0204k;
            ViewParent parent2 = Toolbar.this.f1962j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1962j);
                }
                C0327e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f683a = 8388611 | (toolbar4.f1967o & C0175j.AppCompatTheme_windowActionBarOverlay);
                generateDefaultLayoutParams.f1985b = 2;
                toolbar4.f1962j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1962j);
            }
            Toolbar.this.m1119o();
            Toolbar.this.requestLayout();
            c0204k.f1112D = true;
            c0204k.f1127n.m706b(false);
            KeyEvent.Callback callback = Toolbar.this.f1962j;
            if (callback instanceof InterfaceC0187b) {
                ((InterfaceC0187b) callback).mo644a();
            }
            return true;
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
        /* renamed from: a */
        public boolean mo664a(SubMenuC0214u subMenuC0214u) {
            return false;
        }

        @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
        /* renamed from: b */
        public boolean mo666b(C0201h c0201h, C0204k c0204k) {
            KeyEvent.Callback callback = Toolbar.this.f1962j;
            if (callback instanceof InterfaceC0187b) {
                ((InterfaceC0187b) callback).mo645b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1962j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1961i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1962j = null;
            toolbar3.m1094a();
            this.f1983c = null;
            Toolbar.this.requestLayout();
            c0204k.f1112D = false;
            c0204k.f1127n.m706b(false);
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$e */
    public static class C0327e extends AbstractC0141a.a {

        /* renamed from: b */
        public int f1985b;

        public C0327e(int i, int i2) {
            super(i, i2);
            this.f1985b = 0;
            this.f683a = 8388627;
        }

        public C0327e(AbstractC0141a.a aVar) {
            super(aVar);
            this.f1985b = 0;
        }

        public C0327e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1985b = 0;
        }

        public C0327e(C0327e c0327e) {
            super((AbstractC0141a.a) c0327e);
            this.f1985b = 0;
            this.f1985b = c0327e.f1985b;
        }

        public C0327e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1985b = 0;
        }

        public C0327e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1985b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$f */
    public interface InterfaceC0328f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$g */
    public static class C0329g extends AbstractC0106a {
        public static final Parcelable.Creator<C0329g> CREATOR = new a();

        /* renamed from: d */
        public int f1986d;

        /* renamed from: e */
        public boolean f1987e;

        /* renamed from: android.support.v7.widget.Toolbar$g$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0329g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0329g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0329g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0329g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0329g[i];
            }
        }

        public C0329g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1986d = parcel.readInt();
            this.f1987e = parcel.readInt() != 0;
        }

        public C0329g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p000a.p006b.p010c.p021h.AbstractC0106a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f589b, i);
            parcel.writeInt(this.f1986d);
            parcel.writeInt(this.f1987e ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0166a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1976x = 8388627;
        this.f1942E = new ArrayList<>();
        this.f1943F = new ArrayList<>();
        this.f1944G = new int[2];
        this.f1946I = new C0323a();
        this.f1953P = new RunnableC0324b();
        C0224c1 m775a = C0224c1.m775a(getContext(), attributeSet, C0175j.Toolbar, i, 0);
        this.f1965m = m775a.m788f(C0175j.Toolbar_titleTextAppearance, 0);
        this.f1966n = m775a.m788f(C0175j.Toolbar_subtitleTextAppearance, 0);
        this.f1976x = m775a.f1236b.getInteger(C0175j.Toolbar_android_gravity, this.f1976x);
        this.f1967o = m775a.f1236b.getInteger(C0175j.Toolbar_buttonGravity, 48);
        int m780b = m775a.m780b(C0175j.Toolbar_titleMargin, 0);
        m780b = m775a.m787e(C0175j.Toolbar_titleMargins) ? m775a.m780b(C0175j.Toolbar_titleMargins, m780b) : m780b;
        this.f1972t = m780b;
        this.f1971s = m780b;
        this.f1970r = m780b;
        this.f1969q = m780b;
        int m780b2 = m775a.m780b(C0175j.Toolbar_titleMarginStart, -1);
        if (m780b2 >= 0) {
            this.f1969q = m780b2;
        }
        int m780b3 = m775a.m780b(C0175j.Toolbar_titleMarginEnd, -1);
        if (m780b3 >= 0) {
            this.f1970r = m780b3;
        }
        int m780b4 = m775a.m780b(C0175j.Toolbar_titleMarginTop, -1);
        if (m780b4 >= 0) {
            this.f1971s = m780b4;
        }
        int m780b5 = m775a.m780b(C0175j.Toolbar_titleMarginBottom, -1);
        if (m780b5 >= 0) {
            this.f1972t = m780b5;
        }
        this.f1968p = m775a.m782c(C0175j.Toolbar_maxButtonHeight, -1);
        int m780b6 = m775a.m780b(C0175j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m780b7 = m775a.m780b(C0175j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m782c = m775a.m782c(C0175j.Toolbar_contentInsetLeft, 0);
        int m782c2 = m775a.m782c(C0175j.Toolbar_contentInsetRight, 0);
        m1110f();
        C0267u0 c0267u0 = this.f1973u;
        c0267u0.f1472h = false;
        if (m782c != Integer.MIN_VALUE) {
            c0267u0.f1469e = m782c;
            c0267u0.f1465a = m782c;
        }
        if (m782c2 != Integer.MIN_VALUE) {
            c0267u0.f1470f = m782c2;
            c0267u0.f1466b = m782c2;
        }
        if (m780b6 != Integer.MIN_VALUE || m780b7 != Integer.MIN_VALUE) {
            this.f1973u.m906a(m780b6, m780b7);
        }
        this.f1974v = m775a.m780b(C0175j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1975w = m775a.m780b(C0175j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1959g = m775a.m781b(C0175j.Toolbar_collapseIcon);
        this.f1960h = m775a.m785d(C0175j.Toolbar_collapseContentDescription);
        CharSequence m785d = m775a.m785d(C0175j.Toolbar_title);
        if (!TextUtils.isEmpty(m785d)) {
            setTitle(m785d);
        }
        CharSequence m785d2 = m775a.m785d(C0175j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m785d2)) {
            setSubtitle(m785d2);
        }
        this.f1963k = getContext();
        setPopupTheme(m775a.m788f(C0175j.Toolbar_popupTheme, 0));
        Drawable m781b = m775a.m781b(C0175j.Toolbar_navigationIcon);
        if (m781b != null) {
            setNavigationIcon(m781b);
        }
        CharSequence m785d3 = m775a.m785d(C0175j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m785d3)) {
            setNavigationContentDescription(m785d3);
        }
        Drawable m781b2 = m775a.m781b(C0175j.Toolbar_logo);
        if (m781b2 != null) {
            setLogo(m781b2);
        }
        CharSequence m785d4 = m775a.m785d(C0175j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m785d4)) {
            setLogoDescription(m785d4);
        }
        if (m775a.m787e(C0175j.Toolbar_titleTextColor)) {
            setTitleTextColor(m775a.m776a(C0175j.Toolbar_titleTextColor, -1));
        }
        if (m775a.m787e(C0175j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(m775a.m776a(C0175j.Toolbar_subtitleTextColor, -1));
        }
        m775a.f1236b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C0191f(getContext());
    }

    /* renamed from: a */
    public final int m1089a(int i) {
        int m468c = C0119n.m468c(this);
        int m34a = C0027d.m34a(i, m468c) & 7;
        return (m34a == 1 || m34a == 3 || m34a == 5) ? m34a : m468c == 1 ? 5 : 3;
    }

    /* renamed from: a */
    public final int m1090a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return (Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin) + (Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin);
    }

    /* renamed from: a */
    public final int m1091a(View view, int i) {
        C0327e c0327e = (C0327e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c0327e.f683a & C0175j.AppCompatTheme_windowActionBarOverlay;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f1976x & C0175j.AppCompatTheme_windowActionBarOverlay;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0327e).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) c0327e).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) c0327e).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: a */
    public final int m1092a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    public final int m1093a(View view, int i, int[] iArr, int i2) {
        C0327e c0327e = (C0327e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0327e).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int m1091a = m1091a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m1091a, max + measuredWidth, view.getMeasuredHeight() + m1091a);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0327e).rightMargin + max;
    }

    /* renamed from: a */
    public void m1094a() {
        for (int size = this.f1943F.size() - 1; size >= 0; size--) {
            addView(this.f1943F.get(size));
        }
        this.f1943F.clear();
    }

    /* renamed from: a */
    public void m1095a(int i, int i2) {
        m1110f();
        this.f1973u.m906a(i, i2);
    }

    /* renamed from: a */
    public void m1096a(C0201h c0201h, C0222c c0222c) {
        if (c0201h == null && this.f1954b == null) {
            return;
        }
        m1113i();
        C0201h m1047m = this.f1954b.m1047m();
        if (m1047m == c0201h) {
            return;
        }
        if (m1047m != null) {
            m1047m.m694a(this.f1948K);
            m1047m.m694a(this.f1949L);
        }
        if (this.f1949L == null) {
            this.f1949L = new C0326d();
        }
        c0222c.f1219u = true;
        if (c0201h != null) {
            c0201h.m695a(c0222c, this.f1963k);
            c0201h.m695a(this.f1949L, this.f1963k);
        } else {
            c0222c.mo661a(this.f1963k, (C0201h) null);
            this.f1949L.mo661a(this.f1963k, (C0201h) null);
            c0222c.mo662a(true);
            this.f1949L.mo662a(true);
        }
        this.f1954b.setPopupTheme(this.f1964l);
        this.f1954b.setPresenter(c0222c);
        this.f1948K = c0222c;
    }

    /* renamed from: a */
    public void m1097a(Context context, int i) {
        this.f1966n = i;
        TextView textView = this.f1956d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public final void m1098a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    public final void m1099a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0327e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0327e) layoutParams;
        generateDefaultLayoutParams.f1985b = 1;
        if (!z || this.f1962j == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f1943F.add(view);
        }
    }

    /* renamed from: a */
    public final void m1100a(List<View> list, int i) {
        boolean z = C0119n.m468c(this) == 1;
        int childCount = getChildCount();
        int m34a = C0027d.m34a(i, C0119n.m468c(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0327e c0327e = (C0327e) childAt.getLayoutParams();
                if (c0327e.f1985b == 0 && m1108d(childAt) && m1089a(c0327e.f683a) == m34a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0327e c0327e2 = (C0327e) childAt2.getLayoutParams();
            if (c0327e2.f1985b == 0 && m1108d(childAt2) && m1089a(c0327e2.f683a) == m34a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final int m1101b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final int m1102b(View view, int i, int[] iArr, int i2) {
        C0327e c0327e = (C0327e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0327e).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m1091a = m1091a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m1091a, max, view.getMeasuredHeight() + m1091a);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0327e).leftMargin);
    }

    /* renamed from: b */
    public void m1103b(Context context, int i) {
        this.f1965m = i;
        TextView textView = this.f1955c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: b */
    public boolean m1104b() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1954b) != null && actionMenuView.m1046l();
    }

    /* renamed from: c */
    public void m1105c() {
        C0326d c0326d = this.f1949L;
        C0204k c0204k = c0326d == null ? null : c0326d.f1983c;
        if (c0204k != null) {
            c0204k.collapseActionView();
        }
    }

    /* renamed from: c */
    public final boolean m1106c(View view) {
        return view.getParent() == this || this.f1943F.contains(view);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0327e);
    }

    /* renamed from: d */
    public void m1107d() {
        ActionMenuView actionMenuView = this.f1954b;
        if (actionMenuView != null) {
            actionMenuView.m1041g();
        }
    }

    /* renamed from: d */
    public final boolean m1108d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: e */
    public void m1109e() {
        if (this.f1961i == null) {
            this.f1961i = new C0248l(getContext(), null, C0166a.toolbarNavigationButtonStyle);
            this.f1961i.setImageDrawable(this.f1959g);
            this.f1961i.setContentDescription(this.f1960h);
            C0327e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f683a = 8388611 | (this.f1967o & C0175j.AppCompatTheme_windowActionBarOverlay);
            generateDefaultLayoutParams.f1985b = 2;
            this.f1961i.setLayoutParams(generateDefaultLayoutParams);
            this.f1961i.setOnClickListener(new ViewOnClickListenerC0325c());
        }
    }

    /* renamed from: f */
    public final void m1110f() {
        if (this.f1973u == null) {
            this.f1973u = new C0267u0();
        }
    }

    /* renamed from: g */
    public final void m1111g() {
        if (this.f1958f == null) {
            this.f1958f = new C0252n(getContext());
        }
    }

    @Override // android.view.ViewGroup
    public C0327e generateDefaultLayoutParams() {
        return new C0327e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public C0327e generateLayoutParams(AttributeSet attributeSet) {
        return new C0327e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public C0327e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0327e ? new C0327e((C0327e) layoutParams) : layoutParams instanceof AbstractC0141a.a ? new C0327e((AbstractC0141a.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0327e((ViewGroup.MarginLayoutParams) layoutParams) : new C0327e(layoutParams);
    }

    public int getContentInsetEnd() {
        C0267u0 c0267u0 = this.f1973u;
        if (c0267u0 != null) {
            return c0267u0.f1471g ? c0267u0.f1465a : c0267u0.f1466b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1975w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0267u0 c0267u0 = this.f1973u;
        if (c0267u0 != null) {
            return c0267u0.f1465a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0267u0 c0267u0 = this.f1973u;
        if (c0267u0 != null) {
            return c0267u0.f1466b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0267u0 c0267u0 = this.f1973u;
        if (c0267u0 != null) {
            return c0267u0.f1471g ? c0267u0.f1466b : c0267u0.f1465a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1974v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0201h m1047m;
        ActionMenuView actionMenuView = this.f1954b;
        return actionMenuView != null && (m1047m = actionMenuView.m1047m()) != null && m1047m.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1975w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return C0119n.m468c(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C0119n.m468c(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1974v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1958f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1958f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m1112h();
        return this.f1954b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1957e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1957e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0222c getOuterActionMenuPresenter() {
        return this.f1948K;
    }

    public Drawable getOverflowIcon() {
        m1112h();
        return this.f1954b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1963k;
    }

    public int getPopupTheme() {
        return this.f1964l;
    }

    public CharSequence getSubtitle() {
        return this.f1978z;
    }

    public CharSequence getTitle() {
        return this.f1977y;
    }

    public int getTitleMarginBottom() {
        return this.f1972t;
    }

    public int getTitleMarginEnd() {
        return this.f1970r;
    }

    public int getTitleMarginStart() {
        return this.f1969q;
    }

    public int getTitleMarginTop() {
        return this.f1971s;
    }

    public InterfaceC0235g0 getWrapper() {
        if (this.f1947J == null) {
            this.f1947J = new C0230e1(this, true);
        }
        return this.f1947J;
    }

    /* renamed from: h */
    public final void m1112h() {
        m1113i();
        if (this.f1954b.m1047m() == null) {
            C0201h c0201h = (C0201h) this.f1954b.getMenu();
            if (this.f1949L == null) {
                this.f1949L = new C0326d();
            }
            this.f1954b.setExpandedActionViewsExclusive(true);
            c0201h.m695a(this.f1949L, this.f1963k);
        }
    }

    /* renamed from: i */
    public final void m1113i() {
        if (this.f1954b == null) {
            this.f1954b = new ActionMenuView(getContext());
            this.f1954b.setPopupTheme(this.f1964l);
            this.f1954b.setOnMenuItemClickListener(this.f1946I);
            this.f1954b.m1039a(this.f1950M, this.f1951N);
            C0327e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f683a = 8388613 | (this.f1967o & C0175j.AppCompatTheme_windowActionBarOverlay);
            this.f1954b.setLayoutParams(generateDefaultLayoutParams);
            m1099a((View) this.f1954b, false);
        }
    }

    /* renamed from: j */
    public final void m1114j() {
        if (this.f1957e == null) {
            this.f1957e = new C0248l(getContext(), null, C0166a.toolbarNavigationButtonStyle);
            C0327e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f683a = 8388611 | (this.f1967o & C0175j.AppCompatTheme_windowActionBarOverlay);
            this.f1957e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: k */
    public boolean m1115k() {
        C0326d c0326d = this.f1949L;
        return (c0326d == null || c0326d.f1983c == null) ? false : true;
    }

    /* renamed from: l */
    public boolean m1116l() {
        ActionMenuView actionMenuView = this.f1954b;
        return actionMenuView != null && actionMenuView.m1043i();
    }

    /* renamed from: m */
    public boolean m1117m() {
        ActionMenuView actionMenuView = this.f1954b;
        return actionMenuView != null && actionMenuView.m1044j();
    }

    /* renamed from: n */
    public boolean m1118n() {
        ActionMenuView actionMenuView = this.f1954b;
        return actionMenuView != null && actionMenuView.m1045k();
    }

    /* renamed from: o */
    public void m1119o() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0327e) childAt.getLayoutParams()).f1985b != 2 && childAt != this.f1954b) {
                removeViewAt(childCount);
                this.f1943F.add(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1953P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1941D = false;
        }
        if (!this.f1941D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1941D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1941D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a5 A[LOOP:0: B:40:0x02a3->B:41:0x02a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c7 A[LOOP:1: B:44:0x02c5->B:45:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02ed A[LOOP:2: B:48:0x02eb->B:49:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x033e A[LOOP:3: B:57:0x033c->B:58:0x033e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0297  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0329g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0329g c0329g = (C0329g) parcelable;
        super.onRestoreInstanceState(c0329g.f589b);
        ActionMenuView actionMenuView = this.f1954b;
        C0201h m1047m = actionMenuView != null ? actionMenuView.m1047m() : null;
        int i = c0329g.f1986d;
        if (i != 0 && this.f1949L != null && m1047m != null && (findItem = m1047m.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c0329g.f1987e) {
            removeCallbacks(this.f1953P);
            post(this.f1953P);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m1110f();
        C0267u0 c0267u0 = this.f1973u;
        boolean z = i == 1;
        if (z == c0267u0.f1471g) {
            return;
        }
        c0267u0.f1471g = z;
        if (!c0267u0.f1472h) {
            c0267u0.f1465a = c0267u0.f1469e;
            c0267u0.f1466b = c0267u0.f1470f;
            return;
        }
        if (z) {
            int i2 = c0267u0.f1468d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = c0267u0.f1469e;
            }
            c0267u0.f1465a = i2;
            int i3 = c0267u0.f1467c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0267u0.f1470f;
            }
            c0267u0.f1466b = i3;
            return;
        }
        int i4 = c0267u0.f1467c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = c0267u0.f1469e;
        }
        c0267u0.f1465a = i4;
        int i5 = c0267u0.f1468d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = c0267u0.f1470f;
        }
        c0267u0.f1466b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0204k c0204k;
        C0329g c0329g = new C0329g(super.onSaveInstanceState());
        C0326d c0326d = this.f1949L;
        if (c0326d != null && (c0204k = c0326d.f1983c) != null) {
            c0329g.f1986d = c0204k.f1114a;
        }
        c0329g.f1987e = m1118n();
        return c0329g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1940C = false;
        }
        if (!this.f1940C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1940C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1940C = false;
        }
        return true;
    }

    /* renamed from: p */
    public boolean m1120p() {
        ActionMenuView actionMenuView = this.f1954b;
        return actionMenuView != null && actionMenuView.m1048n();
    }

    public void setCollapsible(boolean z) {
        this.f1952O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1975w) {
            this.f1975w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1974v) {
            this.f1974v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0181a.m618c(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m1111g();
            if (!m1106c(this.f1958f)) {
                m1099a((View) this.f1958f, true);
            }
        } else {
            ImageView imageView = this.f1958f;
            if (imageView != null && m1106c(imageView)) {
                removeView(this.f1958f);
                this.f1943F.remove(this.f1958f);
            }
        }
        ImageView imageView2 = this.f1958f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1111g();
        }
        ImageView imageView = this.f1958f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1114j();
        }
        ImageButton imageButton = this.f1957e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0181a.m618c(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m1114j();
            if (!m1106c(this.f1957e)) {
                m1099a((View) this.f1957e, true);
            }
        } else {
            ImageButton imageButton = this.f1957e;
            if (imageButton != null && m1106c(imageButton)) {
                removeView(this.f1957e);
                this.f1943F.remove(this.f1957e);
            }
        }
        ImageButton imageButton2 = this.f1957e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m1114j();
        this.f1957e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0328f interfaceC0328f) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m1112h();
        this.f1954b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1964l != i) {
            this.f1964l = i;
            if (i == 0) {
                this.f1963k = getContext();
            } else {
                this.f1963k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1956d;
            if (textView != null && m1106c(textView)) {
                removeView(this.f1956d);
                this.f1943F.remove(this.f1956d);
            }
        } else {
            if (this.f1956d == null) {
                Context context = getContext();
                this.f1956d = new C0274y(context);
                this.f1956d.setSingleLine();
                this.f1956d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1966n;
                if (i != 0) {
                    this.f1956d.setTextAppearance(context, i);
                }
                int i2 = this.f1939B;
                if (i2 != 0) {
                    this.f1956d.setTextColor(i2);
                }
            }
            if (!m1106c(this.f1956d)) {
                m1099a((View) this.f1956d, true);
            }
        }
        TextView textView2 = this.f1956d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1978z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        this.f1939B = i;
        TextView textView = this.f1956d;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1955c;
            if (textView != null && m1106c(textView)) {
                removeView(this.f1955c);
                this.f1943F.remove(this.f1955c);
            }
        } else {
            if (this.f1955c == null) {
                Context context = getContext();
                this.f1955c = new C0274y(context);
                this.f1955c.setSingleLine();
                this.f1955c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1965m;
                if (i != 0) {
                    this.f1955c.setTextAppearance(context, i);
                }
                int i2 = this.f1938A;
                if (i2 != 0) {
                    this.f1955c.setTextColor(i2);
                }
            }
            if (!m1106c(this.f1955c)) {
                m1099a((View) this.f1955c, true);
            }
        }
        TextView textView2 = this.f1955c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1977y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f1972t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1970r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1969q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1971s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        this.f1938A = i;
        TextView textView = this.f1955c;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }
}
