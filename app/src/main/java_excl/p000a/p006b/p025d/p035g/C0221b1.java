package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: a.b.d.g.b1 */
/* loaded from: classes.dex */
public class C0221b1 extends C0261r0 {

    /* renamed from: b */
    public final WeakReference<Context> f1203b;

    public C0221b1(Context context, Resources resources) {
        super(resources);
        this.f1203b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = this.f1427a.getDrawable(i);
        Context context = this.f1203b.get();
        if (drawable != null && context != null) {
            C0243j.m839a();
            C0243j.m843a(context, i, drawable);
        }
        return drawable;
    }
}
