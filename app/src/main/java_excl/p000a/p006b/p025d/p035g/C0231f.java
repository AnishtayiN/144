package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.InterfaceC0118m;
import p000a.p006b.p010c.p024i.InterfaceC0133b;

/* renamed from: a.b.d.g.f */
/* loaded from: classes.dex */
public class C0231f extends Button implements InterfaceC0118m, InterfaceC0133b {

    /* renamed from: b */
    public final C0228e f1269b;

    /* renamed from: c */
    public final C0272x f1270c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0231f(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = p000a.p006b.p025d.p027b.C0166a.buttonStyle
            android.content.Context r2 = p000a.p006b.p025d.p035g.C0277z0.m953a(r2)
            r1.<init>(r2, r3, r0)
            a.b.d.g.e r2 = new a.b.d.g.e
            r2.<init>(r1)
            r1.f1269b = r2
            a.b.d.g.e r2 = r1.f1269b
            r2.m793a(r3, r0)
            a.b.d.g.x r2 = new a.b.d.g.x
            r2.<init>(r1)
            r1.f1270c = r2
            a.b.d.g.x r2 = r1.f1270c
            r2.m932a(r3, r0)
            a.b.d.g.x r2 = r1.f1270c
            r2.m926a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0231f.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0228e c0228e = this.f1269b;
        if (c0228e != null) {
            c0228e.m789a();
        }
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            c0272x.m926a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0133b.f661a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            return c0272x.m934b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0133b.f661a) {
            return super.getAutoSizeMinTextSize();
        }
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            return c0272x.m935c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0133b.f661a) {
            return super.getAutoSizeStepGranularity();
        }
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            return c0272x.m936d();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0133b.f661a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0272x c0272x = this.f1270c;
        return c0272x != null ? c0272x.m937e() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0133b.f661a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            return c0272x.m938f();
        }
        return 0;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public ColorStateList getSupportBackgroundTintList() {
        C0228e c0228e = this.f1269b;
        if (c0228e != null) {
            return c0228e.m794b();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228e c0228e = this.f1269b;
        if (c0228e != null) {
            return c0228e.m796c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0272x c0272x = this.f1270c;
        if (c0272x == null || InterfaceC0133b.f661a) {
            return;
        }
        c0272x.f1539h.m946a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0272x c0272x = this.f1270c;
        if (c0272x == null || InterfaceC0133b.f661a || !c0272x.m939g()) {
            return;
        }
        this.f1270c.f1539h.m946a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0133b.f661a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            c0272x.m928a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0133b.f661a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            c0272x.m933a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0133b.f661a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            c0272x.m927a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228e c0228e = this.f1269b;
        if (c0228e != null) {
            c0228e.m797d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228e c0228e = this.f1269b;
        if (c0228e != null) {
            c0228e.m790a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0027d.m50a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            c0272x.f1532a.setAllCaps(z);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228e c0228e = this.f1269b;
        if (c0228e != null) {
            c0228e.m795b(colorStateList);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228e c0228e = this.f1269b;
        if (c0228e != null) {
            c0228e.m792a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0272x c0272x = this.f1270c;
        if (c0272x != null) {
            c0272x.m929a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC0133b.f661a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0272x c0272x = this.f1270c;
        if (c0272x == null || z || c0272x.m939g()) {
            return;
        }
        c0272x.f1539h.m948a(i, f);
    }
}
