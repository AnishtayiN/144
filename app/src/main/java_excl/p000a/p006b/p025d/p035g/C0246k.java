package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.InterfaceC0118m;

/* renamed from: a.b.d.g.k */
/* loaded from: classes.dex */
public class C0246k extends EditText implements InterfaceC0118m {

    /* renamed from: b */
    public final C0228e f1332b;

    /* renamed from: c */
    public final C0272x f1333c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0246k(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = p000a.p006b.p025d.p027b.C0166a.editTextStyle
            android.content.Context r2 = p000a.p006b.p025d.p035g.C0277z0.m953a(r2)
            r1.<init>(r2, r3, r0)
            a.b.d.g.e r2 = new a.b.d.g.e
            r2.<init>(r1)
            r1.f1332b = r2
            a.b.d.g.e r2 = r1.f1332b
            r2.m793a(r3, r0)
            a.b.d.g.x r2 = new a.b.d.g.x
            r2.<init>(r1)
            r1.f1333c = r2
            a.b.d.g.x r2 = r1.f1333c
            r2.m932a(r3, r0)
            a.b.d.g.x r2 = r1.f1333c
            r2.m926a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0246k.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0228e c0228e = this.f1332b;
        if (c0228e != null) {
            c0228e.m789a();
        }
        C0272x c0272x = this.f1333c;
        if (c0272x != null) {
            c0272x.m926a();
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public ColorStateList getSupportBackgroundTintList() {
        C0228e c0228e = this.f1332b;
        if (c0228e != null) {
            return c0228e.m794b();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228e c0228e = this.f1332b;
        if (c0228e != null) {
            return c0228e.m796c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0027d.m55a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228e c0228e = this.f1332b;
        if (c0228e != null) {
            c0228e.m797d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228e c0228e = this.f1332b;
        if (c0228e != null) {
            c0228e.m790a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0027d.m50a((TextView) this, callback));
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228e c0228e = this.f1332b;
        if (c0228e != null) {
            c0228e.m795b(colorStateList);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228e c0228e = this.f1332b;
        if (c0228e != null) {
            c0228e.m792a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0272x c0272x = this.f1333c;
        if (c0272x != null) {
            c0272x.m929a(context, i);
        }
    }
}
