package p000a.p006b.p010c.p021h;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import p000a.p006b.p025d.p033f.p034i.MenuItemC0205l;
import p038c.p039a.p040a.p041a.C0335a;

/* renamed from: a.b.c.h.c */
/* loaded from: classes.dex */
public abstract class AbstractC0108c {

    /* renamed from: a */
    public b f593a;

    /* renamed from: a.b.c.h.c$a */
    public interface a {
    }

    /* renamed from: a.b.c.h.c$b */
    public interface b {
    }

    public AbstractC0108c(Context context) {
    }

    /* renamed from: a */
    public View mo439a(MenuItem menuItem) {
        return ((MenuItemC0205l.a) this).f1142b.onCreateActionView();
    }

    /* renamed from: a */
    public void mo440a(b bVar) {
        if (this.f593a != null && bVar != null) {
            StringBuilder m1134a = C0335a.m1134a("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            m1134a.append(getClass().getSimpleName());
            m1134a.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", m1134a.toString());
        }
        this.f593a = bVar;
    }

    /* renamed from: a */
    public boolean mo441a() {
        return true;
    }

    /* renamed from: b */
    public boolean mo442b() {
        return false;
    }
}
