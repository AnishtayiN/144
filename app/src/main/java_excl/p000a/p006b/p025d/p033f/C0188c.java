package p000a.p006b.p025d.p033f;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p000a.p006b.p025d.p027b.C0174i;

/* renamed from: a.b.d.f.c */
/* loaded from: classes.dex */
public class C0188c extends ContextWrapper {

    /* renamed from: a */
    public int f925a;

    /* renamed from: b */
    public Resources.Theme f926b;

    /* renamed from: c */
    public LayoutInflater f927c;

    /* renamed from: d */
    public Configuration f928d;

    /* renamed from: e */
    public Resources f929e;

    public C0188c() {
        super(null);
    }

    public C0188c(Context context, int i) {
        super(context);
        this.f925a = i;
    }

    /* renamed from: a */
    public final void m646a() {
        if (this.f926b == null) {
            this.f926b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f926b.setTo(theme);
            }
        }
        this.f926b.applyStyle(this.f925a, true);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f929e == null) {
            Configuration configuration = this.f928d;
            if (configuration == null) {
                this.f929e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.f929e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f929e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f927c == null) {
            this.f927c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f927c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f926b;
        if (theme != null) {
            return theme;
        }
        if (this.f925a == 0) {
            this.f925a = C0174i.Theme_AppCompat_Light;
        }
        m646a();
        return this.f926b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f925a != i) {
            this.f925a = i;
            m646a();
        }
    }
}
