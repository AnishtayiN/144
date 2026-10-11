package p000a.p006b.p025d.p026a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o;

/* renamed from: a.b.d.a.u */
/* loaded from: classes.dex */
public class C0161u extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C0155o.f f795a;

    public C0161u(LayoutInflaterFactory2C0155o.f fVar) {
        this.f795a = fVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LayoutInflaterFactory2C0155o.f fVar = this.f795a;
        boolean m595a = fVar.f763a.m595a();
        if (m595a != fVar.f764b) {
            fVar.f764b = m595a;
            LayoutInflaterFactory2C0155o.this.mo549a();
        }
    }
}
