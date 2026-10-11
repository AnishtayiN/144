package p000a.p006b.p025d.p035g;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import p000a.p006b.p010c.p024i.InterfaceC0139h;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.g */
/* loaded from: classes.dex */
public class C0234g extends CheckBox implements InterfaceC0139h {

    /* renamed from: b */
    public final C0240i f1284b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0234g(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = p000a.p006b.p025d.p027b.C0166a.checkboxStyle
            android.content.Context r2 = p000a.p006b.p025d.p035g.C0277z0.m953a(r2)
            r1.<init>(r2, r3, r0)
            a.b.d.g.i r2 = new a.b.d.g.i
            r2.<init>(r1)
            r1.f1284b = r2
            a.b.d.g.i r2 = r1.f1284b
            r2.m832a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0234g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0240i c0240i = this.f1284b;
        return c0240i != null ? c0240i.m830a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        C0240i c0240i = this.f1284b;
        if (c0240i != null) {
            return c0240i.f1295b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0240i c0240i = this.f1284b;
        if (c0240i != null) {
            return c0240i.f1296c;
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C0181a.m618c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0240i c0240i = this.f1284b;
        if (c0240i != null) {
            if (c0240i.f1299f) {
                c0240i.f1299f = false;
            } else {
                c0240i.f1299f = true;
                c0240i.m831a();
            }
        }
    }

    @Override // p000a.p006b.p010c.p024i.InterfaceC0139h
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0240i c0240i = this.f1284b;
        if (c0240i != null) {
            c0240i.f1295b = colorStateList;
            c0240i.f1297d = true;
            c0240i.m831a();
        }
    }

    @Override // p000a.p006b.p010c.p024i.InterfaceC0139h
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0240i c0240i = this.f1284b;
        if (c0240i != null) {
            c0240i.f1296c = mode;
            c0240i.f1298e = true;
            c0240i.m831a();
        }
    }
}
