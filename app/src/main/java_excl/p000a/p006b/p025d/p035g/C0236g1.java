package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p027b.C0174i;

/* renamed from: a.b.d.g.g1 */
/* loaded from: classes.dex */
public class C0236g1 {

    /* renamed from: a */
    public final Context f1285a;

    /* renamed from: b */
    public final View f1286b;

    /* renamed from: c */
    public final TextView f1287c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f1288d = new WindowManager.LayoutParams();

    /* renamed from: e */
    public final Rect f1289e = new Rect();

    /* renamed from: f */
    public final int[] f1290f = new int[2];

    /* renamed from: g */
    public final int[] f1291g = new int[2];

    public C0236g1(Context context) {
        this.f1285a = context;
        this.f1286b = LayoutInflater.from(this.f1285a).inflate(C0172g.abc_tooltip, (ViewGroup) null);
        this.f1287c = (TextView) this.f1286b.findViewById(C0171f.message);
        this.f1288d.setTitle(C0236g1.class.getSimpleName());
        this.f1288d.packageName = this.f1285a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f1288d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C0174i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    public void m824a() {
        if (this.f1286b.getParent() != null) {
            ((WindowManager) this.f1285a.getSystemService("window")).removeView(this.f1286b);
        }
    }

    /* renamed from: b */
    public boolean m825b() {
        return this.f1286b.getParent() != null;
    }
}
