package p000a.p006b.p025d.p033f.p034i;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p000a.p006b.p025d.p026a.DialogInterfaceC0151k;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;

/* renamed from: a.b.d.f.i.i */
/* loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC0202i implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0209p.a {

    /* renamed from: b */
    public C0201h f1105b;

    /* renamed from: c */
    public DialogInterfaceC0151k f1106c;

    /* renamed from: d */
    public C0199f f1107d;

    /* renamed from: e */
    public InterfaceC0209p.a f1108e;

    public DialogInterfaceOnKeyListenerC0202i(C0201h c0201h) {
        this.f1105b = c0201h;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
    /* renamed from: a */
    public void mo579a(C0201h c0201h, boolean z) {
        DialogInterfaceC0151k dialogInterfaceC0151k;
        if ((z || c0201h == this.f1105b) && (dialogInterfaceC0151k = this.f1106c) != null) {
            dialogInterfaceC0151k.dismiss();
        }
        InterfaceC0209p.a aVar = this.f1108e;
        if (aVar != null) {
            aVar.mo579a(c0201h, z);
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p.a
    /* renamed from: a */
    public boolean mo580a(C0201h c0201h) {
        InterfaceC0209p.a aVar = this.f1108e;
        if (aVar != null) {
            return aVar.mo580a(c0201h);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1105b.m702a((C0204k) this.f1107d.m685b().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1107d.mo659a(this.f1105b, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1106c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1106c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1105b.m699a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1105b.performShortcut(i, keyEvent, 0);
    }
}
