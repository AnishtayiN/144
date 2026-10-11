package p000a.p006b.p025d.p035g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.InterfaceC0118m;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.d */
/* loaded from: classes.dex */
public class C0225d extends AutoCompleteTextView implements InterfaceC0118m {

    /* renamed from: d */
    public static final int[] f1238d = {R.attr.popupBackground};

    /* renamed from: b */
    public final C0228e f1239b;

    /* renamed from: c */
    public final C0272x f1240c;

    public C0225d(Context context) {
        this(context, null);
    }

    public C0225d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0166a.autoCompleteTextViewStyle);
    }

    public C0225d(Context context, AttributeSet attributeSet, int i) {
        super(C0277z0.m953a(context), attributeSet, i);
        C0224c1 m775a = C0224c1.m775a(getContext(), attributeSet, f1238d, i, 0);
        if (m775a.m787e(0)) {
            setDropDownBackgroundDrawable(m775a.m781b(0));
        }
        m775a.f1236b.recycle();
        this.f1239b = new C0228e(this);
        this.f1239b.m793a(attributeSet, i);
        this.f1240c = new C0272x(this);
        this.f1240c.m932a(attributeSet, i);
        this.f1240c.m926a();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0228e c0228e = this.f1239b;
        if (c0228e != null) {
            c0228e.m789a();
        }
        C0272x c0272x = this.f1240c;
        if (c0272x != null) {
            c0272x.m926a();
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public ColorStateList getSupportBackgroundTintList() {
        C0228e c0228e = this.f1239b;
        if (c0228e != null) {
            return c0228e.m794b();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228e c0228e = this.f1239b;
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
        C0228e c0228e = this.f1239b;
        if (c0228e != null) {
            c0228e.m797d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228e c0228e = this.f1239b;
        if (c0228e != null) {
            c0228e.m790a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0027d.m50a((TextView) this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0181a.m618c(getContext(), i));
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228e c0228e = this.f1239b;
        if (c0228e != null) {
            c0228e.m795b(colorStateList);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228e c0228e = this.f1239b;
        if (c0228e != null) {
            c0228e.m792a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0272x c0272x = this.f1240c;
        if (c0272x != null) {
            c0272x.m929a(context, i);
        }
    }
}
