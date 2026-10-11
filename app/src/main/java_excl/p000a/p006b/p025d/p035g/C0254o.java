package p000a.p006b.p025d.p035g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.InterfaceC0118m;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.o */
/* loaded from: classes.dex */
public class C0254o extends MultiAutoCompleteTextView implements InterfaceC0118m {

    /* renamed from: d */
    public static final int[] f1372d = {R.attr.popupBackground};

    /* renamed from: b */
    public final C0228e f1373b;

    /* renamed from: c */
    public final C0272x f1374c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0254o(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = p000a.p006b.p025d.p027b.C0166a.autoCompleteTextViewStyle
            android.content.Context r4 = p000a.p006b.p025d.p035g.C0277z0.m953a(r4)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            int[] r1 = p000a.p006b.p025d.p035g.C0254o.f1372d
            r2 = 0
            a.b.d.g.c1 r4 = p000a.p006b.p025d.p035g.C0224c1.m775a(r4, r5, r1, r0, r2)
            boolean r1 = r4.m787e(r2)
            if (r1 == 0) goto L21
            android.graphics.drawable.Drawable r1 = r4.m781b(r2)
            r3.setDropDownBackgroundDrawable(r1)
        L21:
            android.content.res.TypedArray r4 = r4.f1236b
            r4.recycle()
            a.b.d.g.e r4 = new a.b.d.g.e
            r4.<init>(r3)
            r3.f1373b = r4
            a.b.d.g.e r4 = r3.f1373b
            r4.m793a(r5, r0)
            a.b.d.g.x r4 = new a.b.d.g.x
            r4.<init>(r3)
            r3.f1374c = r4
            a.b.d.g.x r4 = r3.f1374c
            r4.m932a(r5, r0)
            a.b.d.g.x r4 = r3.f1374c
            r4.m926a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0254o.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0228e c0228e = this.f1373b;
        if (c0228e != null) {
            c0228e.m789a();
        }
        C0272x c0272x = this.f1374c;
        if (c0272x != null) {
            c0272x.m926a();
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public ColorStateList getSupportBackgroundTintList() {
        C0228e c0228e = this.f1373b;
        if (c0228e != null) {
            return c0228e.m794b();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228e c0228e = this.f1373b;
        if (c0228e != null) {
            return c0228e.m796c();
        }
        return null;
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
        C0228e c0228e = this.f1373b;
        if (c0228e != null) {
            c0228e.m797d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228e c0228e = this.f1373b;
        if (c0228e != null) {
            c0228e.m790a(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0181a.m618c(getContext(), i));
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228e c0228e = this.f1373b;
        if (c0228e != null) {
            c0228e.m795b(colorStateList);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228e c0228e = this.f1373b;
        if (c0228e != null) {
            c0228e.m792a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0272x c0272x = this.f1374c;
        if (c0272x != null) {
            c0272x.m929a(context, i);
        }
    }
}
