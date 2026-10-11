package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p021h.C0121p;
import p000a.p006b.p010c.p021h.C0123r;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0173h;
import p000a.p006b.p025d.p027b.C0175j;

/* renamed from: a.b.d.g.e1 */
/* loaded from: classes.dex */
public class C0230e1 implements InterfaceC0235g0 {

    /* renamed from: a */
    public Toolbar f1249a;

    /* renamed from: b */
    public int f1250b;

    /* renamed from: c */
    public View f1251c;

    /* renamed from: d */
    public View f1252d;

    /* renamed from: e */
    public Drawable f1253e;

    /* renamed from: f */
    public Drawable f1254f;

    /* renamed from: g */
    public Drawable f1255g;

    /* renamed from: h */
    public boolean f1256h;

    /* renamed from: i */
    public CharSequence f1257i;

    /* renamed from: j */
    public CharSequence f1258j;

    /* renamed from: k */
    public CharSequence f1259k;

    /* renamed from: l */
    public Window.Callback f1260l;

    /* renamed from: m */
    public boolean f1261m;

    /* renamed from: n */
    public C0222c f1262n;

    /* renamed from: o */
    public int f1263o;

    /* renamed from: p */
    public int f1264p;

    /* renamed from: q */
    public Drawable f1265q;

    /* renamed from: a.b.d.g.e1$a */
    public class a extends C0123r {

        /* renamed from: a */
        public boolean f1266a = false;

        /* renamed from: b */
        public final /* synthetic */ int f1267b;

        public a(int i) {
            this.f1267b = i;
        }

        @Override // p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: a */
        public void mo495a(View view) {
            if (this.f1266a) {
                return;
            }
            C0230e1.this.f1249a.setVisibility(this.f1267b);
        }

        @Override // p000a.p006b.p010c.p021h.C0123r, p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: b */
        public void mo496b(View view) {
            C0230e1.this.f1249a.setVisibility(0);
        }

        @Override // p000a.p006b.p010c.p021h.C0123r, p000a.p006b.p010c.p021h.InterfaceC0122q
        /* renamed from: c */
        public void mo497c(View view) {
            this.f1266a = true;
        }
    }

    public C0230e1(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = C0173h.abc_action_bar_up_description;
        this.f1263o = 0;
        this.f1264p = 0;
        this.f1249a = toolbar;
        this.f1257i = toolbar.getTitle();
        this.f1258j = toolbar.getSubtitle();
        this.f1256h = this.f1257i != null;
        this.f1255g = toolbar.getNavigationIcon();
        C0224c1 m775a = C0224c1.m775a(toolbar.getContext(), null, C0175j.ActionBar, C0166a.actionBarStyle, 0);
        this.f1265q = m775a.m781b(C0175j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence m785d = m775a.m785d(C0175j.ActionBar_title);
            if (!TextUtils.isEmpty(m785d)) {
                this.f1256h = true;
                m803a(m785d);
            }
            CharSequence m785d2 = m775a.m785d(C0175j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m785d2)) {
                this.f1258j = m785d2;
                if ((this.f1250b & 8) != 0) {
                    this.f1249a.setSubtitle(m785d2);
                }
            }
            Drawable m781b = m775a.m781b(C0175j.ActionBar_logo);
            if (m781b != null) {
                m802a(m781b);
            }
            Drawable m781b2 = m775a.m781b(C0175j.ActionBar_icon);
            if (m781b2 != null) {
                this.f1253e = m781b2;
                m810f();
            }
            if (this.f1255g == null && (drawable = this.f1265q) != null) {
                this.f1255g = drawable;
                m809e();
            }
            m800a(m775a.m784d(C0175j.ActionBar_displayOptions, 0));
            int m788f = m775a.m788f(C0175j.ActionBar_customNavigationLayout, 0);
            if (m788f != 0) {
                View inflate = LayoutInflater.from(this.f1249a.getContext()).inflate(m788f, (ViewGroup) this.f1249a, false);
                View view = this.f1252d;
                if (view != null && (this.f1250b & 16) != 0) {
                    this.f1249a.removeView(view);
                }
                this.f1252d = inflate;
                if (inflate != null && (this.f1250b & 16) != 0) {
                    this.f1249a.addView(this.f1252d);
                }
                m800a(this.f1250b | 16);
            }
            int m786e = m775a.m786e(C0175j.ActionBar_height, 0);
            if (m786e > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1249a.getLayoutParams();
                layoutParams.height = m786e;
                this.f1249a.setLayoutParams(layoutParams);
            }
            int m780b = m775a.m780b(C0175j.ActionBar_contentInsetStart, -1);
            int m780b2 = m775a.m780b(C0175j.ActionBar_contentInsetEnd, -1);
            if (m780b >= 0 || m780b2 >= 0) {
                this.f1249a.m1095a(Math.max(m780b, 0), Math.max(m780b2, 0));
            }
            int m788f2 = m775a.m788f(C0175j.ActionBar_titleTextStyle, 0);
            if (m788f2 != 0) {
                Toolbar toolbar2 = this.f1249a;
                toolbar2.m1103b(toolbar2.getContext(), m788f2);
            }
            int m788f3 = m775a.m788f(C0175j.ActionBar_subtitleTextStyle, 0);
            if (m788f3 != 0) {
                Toolbar toolbar3 = this.f1249a;
                toolbar3.m1097a(toolbar3.getContext(), m788f3);
            }
            int m788f4 = m775a.m788f(C0175j.ActionBar_popupTheme, 0);
            if (m788f4 != 0) {
                this.f1249a.setPopupTheme(m788f4);
            }
        } else {
            if (this.f1249a.getNavigationIcon() != null) {
                i = 15;
                this.f1265q = this.f1249a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f1250b = i;
        }
        m775a.f1236b.recycle();
        if (i2 != this.f1264p) {
            this.f1264p = i2;
            if (TextUtils.isEmpty(this.f1249a.getNavigationContentDescription())) {
                int i3 = this.f1264p;
                this.f1259k = i3 != 0 ? m799a().getString(i3) : null;
                m808d();
            }
        }
        this.f1259k = this.f1249a.getNavigationContentDescription();
        this.f1249a.setNavigationOnClickListener(new ViewOnClickListenerC0227d1(this));
    }

    /* renamed from: a */
    public C0121p m798a(int i, long j) {
        C0121p m453a = C0119n.m453a(this.f1249a);
        m453a.m488a(i == 0 ? 1.0f : 0.0f);
        m453a.m489a(j);
        m453a.m490a(new a(i));
        return m453a;
    }

    /* renamed from: a */
    public Context m799a() {
        return this.f1249a.getContext();
    }

    /* renamed from: a */
    public void m800a(int i) {
        View view;
        int i2 = this.f1250b ^ i;
        this.f1250b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m808d();
                }
                m809e();
            }
            if ((i2 & 3) != 0) {
                m810f();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1249a.setTitle(this.f1257i);
                    this.f1249a.setSubtitle(this.f1258j);
                } else {
                    this.f1249a.setTitle((CharSequence) null);
                    this.f1249a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f1252d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1249a.addView(view);
            } else {
                this.f1249a.removeView(view);
            }
        }
    }

    /* renamed from: a */
    public void m801a(C0269v0 c0269v0) {
        View view = this.f1251c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1249a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1251c);
            }
        }
        this.f1251c = c0269v0;
        if (c0269v0 == null || this.f1263o != 2) {
            return;
        }
        this.f1249a.addView(this.f1251c, 0);
        Toolbar.C0327e c0327e = (Toolbar.C0327e) this.f1251c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0327e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0327e).height = -2;
        c0327e.f683a = 8388691;
        c0269v0.setAllowCollapse(true);
    }

    /* renamed from: a */
    public void m802a(Drawable drawable) {
        this.f1254f = drawable;
        m810f();
    }

    /* renamed from: a */
    public final void m803a(CharSequence charSequence) {
        this.f1257i = charSequence;
        if ((this.f1250b & 8) != 0) {
            this.f1249a.setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public void m804a(boolean z) {
    }

    /* renamed from: b */
    public void m805b() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: b */
    public void m806b(CharSequence charSequence) {
        if (this.f1256h) {
            return;
        }
        this.f1257i = charSequence;
        if ((this.f1250b & 8) != 0) {
            this.f1249a.setTitle(charSequence);
        }
    }

    /* renamed from: c */
    public void m807c() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: d */
    public final void m808d() {
        if ((this.f1250b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1259k)) {
                this.f1249a.setNavigationContentDescription(this.f1264p);
            } else {
                this.f1249a.setNavigationContentDescription(this.f1259k);
            }
        }
    }

    /* renamed from: e */
    public final void m809e() {
        if ((this.f1250b & 4) == 0) {
            this.f1249a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1249a;
        Drawable drawable = this.f1255g;
        if (drawable == null) {
            drawable = this.f1265q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: f */
    public final void m810f() {
        Drawable drawable;
        int i = this.f1250b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1254f;
            if (drawable == null) {
                drawable = this.f1253e;
            }
        } else {
            drawable = this.f1253e;
        }
        this.f1249a.setLogo(drawable);
    }
}
