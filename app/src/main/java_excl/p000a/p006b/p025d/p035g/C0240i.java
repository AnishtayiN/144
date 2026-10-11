package p000a.p006b.p025d.p035g;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p024i.InterfaceC0139h;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.i */
/* loaded from: classes.dex */
public class C0240i {

    /* renamed from: a */
    public final CompoundButton f1294a;

    /* renamed from: b */
    public ColorStateList f1295b = null;

    /* renamed from: c */
    public PorterDuff.Mode f1296c = null;

    /* renamed from: d */
    public boolean f1297d = false;

    /* renamed from: e */
    public boolean f1298e = false;

    /* renamed from: f */
    public boolean f1299f;

    public C0240i(CompoundButton compoundButton) {
        this.f1294a = compoundButton;
    }

    /* renamed from: a */
    public int m830a(int i) {
        Drawable m49a;
        return (Build.VERSION.SDK_INT >= 17 || (m49a = C0027d.m49a(this.f1294a)) == null) ? i : i + m49a.getIntrinsicWidth();
    }

    /* renamed from: a */
    public void m831a() {
        Drawable m49a = C0027d.m49a(this.f1294a);
        if (m49a != null) {
            if (this.f1297d || this.f1298e) {
                Drawable mutate = C0027d.m91b(m49a).mutate();
                if (this.f1297d) {
                    C0027d.m65a(mutate, this.f1295b);
                }
                if (this.f1298e) {
                    C0027d.m66a(mutate, this.f1296c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1294a.getDrawableState());
                }
                this.f1294a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m832a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1294a.getContext().obtainStyledAttributes(attributeSet, C0175j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C0175j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C0175j.CompoundButton_android_button, 0)) != 0) {
                this.f1294a.setButtonDrawable(C0181a.m618c(this.f1294a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C0175j.CompoundButton_buttonTint)) {
                CompoundButton compoundButton = this.f1294a;
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C0175j.CompoundButton_buttonTint);
                if (Build.VERSION.SDK_INT >= 21) {
                    compoundButton.setButtonTintList(colorStateList);
                } else if (compoundButton instanceof InterfaceC0139h) {
                    ((InterfaceC0139h) compoundButton).setSupportButtonTintList(colorStateList);
                }
            }
            if (obtainStyledAttributes.hasValue(C0175j.CompoundButton_buttonTintMode)) {
                CompoundButton compoundButton2 = this.f1294a;
                PorterDuff.Mode m826a = C0238h0.m826a(obtainStyledAttributes.getInt(C0175j.CompoundButton_buttonTintMode, -1), null);
                if (Build.VERSION.SDK_INT >= 21) {
                    compoundButton2.setButtonTintMode(m826a);
                } else if (compoundButton2 instanceof InterfaceC0139h) {
                    ((InterfaceC0139h) compoundButton2).setSupportButtonTintMode(m826a);
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
