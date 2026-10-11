package p000a.p006b.p010c.p011a;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import p000a.p001a.p005b.AbstractC0008d;
import p000a.p001a.p005b.C0011g;
import p000a.p001a.p005b.FragmentC0016l;
import p000a.p001a.p005b.InterfaceC0010f;
import p000a.p006b.p010c.p020g.C0099d;
import p000a.p006b.p010c.p021h.C0109d;
import p000a.p006b.p010c.p021h.C0119n;

/* renamed from: a.b.c.a.g0 */
/* loaded from: classes.dex */
public class ActivityC0046g0 extends Activity implements InterfaceC0010f, C0109d.a {

    /* renamed from: b */
    public C0011g f284b;

    public ActivityC0046g0() {
        int[] iArr = C0099d.f544a;
        Object[] objArr = C0099d.f546c;
        this.f284b = new C0011g(this);
    }

    @Override // p000a.p006b.p010c.p021h.C0109d.a
    /* renamed from: a */
    public boolean mo215a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0119n.m467b(decorView, keyEvent)) {
            return C0109d.m443a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0119n.m467b(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0016l.m25a(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f284b.m20a(AbstractC0008d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
