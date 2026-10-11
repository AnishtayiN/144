package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: a.b.d.g.z0 */
/* loaded from: classes.dex */
public class C0277z0 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f1567c = new Object();

    /* renamed from: d */
    public static ArrayList<WeakReference<C0277z0>> f1568d;

    /* renamed from: a */
    public final Resources f1569a;

    /* renamed from: b */
    public final Resources.Theme f1570b;

    public C0277z0(Context context) {
        super(context);
        C0239h1.m829a();
        this.f1569a = new C0221b1(this, context.getResources());
        this.f1570b = null;
    }

    /* renamed from: a */
    public static Context m953a(Context context) {
        boolean z = false;
        if (!(context instanceof C0277z0) && !(context.getResources() instanceof C0221b1) && !(context.getResources() instanceof C0239h1)) {
            if (Build.VERSION.SDK_INT >= 21) {
                C0239h1.m829a();
            } else {
                z = true;
            }
        }
        if (!z) {
            return context;
        }
        synchronized (f1567c) {
            if (f1568d == null) {
                f1568d = new ArrayList<>();
            } else {
                for (int size = f1568d.size() - 1; size >= 0; size--) {
                    WeakReference<C0277z0> weakReference = f1568d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1568d.remove(size);
                    }
                }
                for (int size2 = f1568d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0277z0> weakReference2 = f1568d.get(size2);
                    C0277z0 c0277z0 = weakReference2 != null ? weakReference2.get() : null;
                    if (c0277z0 != null && c0277z0.getBaseContext() == context) {
                        return c0277z0;
                    }
                }
            }
            C0277z0 c0277z02 = new C0277z0(context);
            f1568d.add(new WeakReference<>(c0277z02));
            return c0277z02;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1569a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1569a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1570b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1570b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
