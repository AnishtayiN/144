package p000a.p006b.p025d.p035g;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.p */
/* loaded from: classes.dex */
public class C0256p extends PopupWindow {

    /* renamed from: b */
    public static final boolean f1414b;

    /* renamed from: a */
    public boolean f1415a;

    static {
        f1414b = Build.VERSION.SDK_INT < 21;
    }

    public C0256p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0175j.PopupWindow, i, i2);
        if (obtainStyledAttributes.hasValue(C0175j.PopupWindow_overlapAnchor)) {
            boolean z = obtainStyledAttributes.getBoolean(C0175j.PopupWindow_overlapAnchor, false);
            if (f1414b) {
                this.f1415a = z;
            } else {
                C0027d.m74a(this, z);
            }
        }
        int i3 = C0175j.PopupWindow_android_popupBackground;
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(i3) || (resourceId = obtainStyledAttributes.getResourceId(i3, 0)) == 0) ? obtainStyledAttributes.getDrawable(i3) : C0181a.m618c(context, resourceId));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1414b && this.f1415a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1414b && this.f1415a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1414b && this.f1415a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
