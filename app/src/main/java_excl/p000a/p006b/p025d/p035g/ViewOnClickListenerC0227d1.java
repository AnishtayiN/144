package p000a.p006b.p025d.p035g;

import android.R;
import android.view.View;
import android.view.Window;
import p000a.p006b.p025d.p033f.p034i.C0194a;

/* renamed from: a.b.d.g.d1 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0227d1 implements View.OnClickListener {

    /* renamed from: b */
    public final C0194a f1241b;

    /* renamed from: c */
    public final /* synthetic */ C0230e1 f1242c;

    public ViewOnClickListenerC0227d1(C0230e1 c0230e1) {
        this.f1242c = c0230e1;
        this.f1241b = new C0194a(this.f1242c.f1249a.getContext(), 0, R.id.home, 0, 0, this.f1242c.f1257i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0230e1 c0230e1 = this.f1242c;
        Window.Callback callback = c0230e1.f1260l;
        if (callback == null || !c0230e1.f1261m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1241b);
    }
}
