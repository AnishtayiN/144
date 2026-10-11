package p000a.p006b.p025d.p026a;

import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000a.p006b.p010c.p021h.C0109d;
import p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o;
import p000a.p006b.p025d.p033f.AbstractC0186a;

/* renamed from: a.b.d.a.v */
/* loaded from: classes.dex */
public class DialogC0162v extends Dialog implements InterfaceC0153m {

    /* renamed from: b */
    public AbstractC0154n f796b;

    /* renamed from: c */
    public final C0109d.a f797c;

    /* renamed from: a.b.d.a.v$a */
    public class a implements C0109d.a {
        public a() {
        }

        @Override // p000a.p006b.p010c.p021h.C0109d.a
        /* renamed from: a */
        public boolean mo215a(KeyEvent keyEvent) {
            return DialogC0162v.this.m592a(keyEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC0162v(android.content.Context r4, int r5) {
        /*
            r3 = this;
            if (r5 != 0) goto L13
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int r1 = p000a.p006b.p025d.p027b.C0166a.dialogTheme
            r2 = 1
            r0.resolveAttribute(r1, r5, r2)
            int r5 = r5.resourceId
        L13:
            r3.<init>(r4, r5)
            a.b.d.a.v$a r4 = new a.b.d.a.v$a
            r4.<init>()
            r3.f797c = r4
            a.b.d.a.n r4 = r3.m591a()
            r5 = 0
            r4.mo545a(r5)
            a.b.d.a.n r4 = r3.m591a()
            r4.mo549a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p026a.DialogC0162v.<init>(android.content.Context, int):void");
    }

    /* renamed from: a */
    public AbstractC0154n m591a() {
        if (this.f796b == null) {
            this.f796b = new LayoutInflaterFactory2C0155o(getContext(), getWindow(), this);
        }
        return this.f796b;
    }

    @Override // p000a.p006b.p025d.p026a.InterfaceC0153m
    /* renamed from: a */
    public AbstractC0186a mo533a(AbstractC0186a.a aVar) {
        return null;
    }

    @Override // p000a.p006b.p025d.p026a.InterfaceC0153m
    /* renamed from: a */
    public void mo535a(AbstractC0186a abstractC0186a) {
    }

    /* renamed from: a */
    public boolean m592a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m591a();
        layoutInflaterFactory2C0155o.m570f();
        ((ViewGroup) layoutInflaterFactory2C0155o.f749t.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0155o.f733d.onContentChanged();
    }

    @Override // p000a.p006b.p025d.p026a.InterfaceC0153m
    /* renamed from: b */
    public void mo537b(AbstractC0186a abstractC0186a) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0109d.m443a(this.f797c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m591a();
        layoutInflaterFactory2C0155o.m570f();
        return (T) layoutInflaterFactory2C0155o.f732c.findViewById(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m591a().mo553c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m591a().mo551b();
        super.onCreate(bundle);
        m591a().mo545a(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m591a();
        layoutInflaterFactory2C0155o.m576i();
        AbstractC0141a abstractC0141a = layoutInflaterFactory2C0155o.f736g;
        if (abstractC0141a != null) {
            abstractC0141a.mo524c(false);
        }
        LayoutInflaterFactory2C0155o.f fVar = layoutInflaterFactory2C0155o.f723K;
        if (fVar != null) {
            fVar.m586a();
        }
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m591a().mo552b(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m591a().mo546a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m591a().mo547a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m591a().mo548a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m591a().mo548a(charSequence);
    }
}
