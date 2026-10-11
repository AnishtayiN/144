package p000a.p006b.p010c.p011a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.p006b.p008b.p009a.C0027d;

/* renamed from: a.b.c.a.h0 */
/* loaded from: classes.dex */
public final class C0048h0 implements Iterable<Intent> {

    /* renamed from: b */
    public final ArrayList<Intent> f286b = new ArrayList<>();

    /* renamed from: c */
    public final Context f287c;

    /* renamed from: a.b.c.a.h0$a */
    public interface a {
        /* renamed from: c */
        Intent mo220c();
    }

    public C0048h0(Context context) {
        this.f287c = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public C0048h0 m219a(Activity activity) {
        Intent mo220c = activity instanceof a ? ((a) activity).mo220c() : null;
        if (mo220c == null) {
            mo220c = C0027d.m45a(activity);
        }
        if (mo220c != null) {
            ComponentName component = mo220c.getComponent();
            if (component == null) {
                component = mo220c.resolveActivity(this.f287c.getPackageManager());
            }
            int size = this.f286b.size();
            try {
                Intent m46a = C0027d.m46a(this.f287c, component);
                while (m46a != null) {
                    this.f286b.add(size, m46a);
                    m46a = C0027d.m46a(this.f287c, m46a.getComponent());
                }
                this.f286b.add(mo220c);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f286b.iterator();
    }
}
