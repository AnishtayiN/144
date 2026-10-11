package p000a.p006b.p025d.p035g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p025d.p029d.p030a.C0181a;

/* renamed from: a.b.d.g.h */
/* loaded from: classes.dex */
public class C0237h extends CheckedTextView {

    /* renamed from: c */
    public static final int[] f1292c = {R.attr.checkMark};

    /* renamed from: b */
    public final C0272x f1293b;

    public C0237h(Context context, AttributeSet attributeSet) {
        super(C0277z0.m953a(context), attributeSet, R.attr.checkedTextViewStyle);
        this.f1293b = new C0272x(this);
        this.f1293b.m932a(attributeSet, R.attr.checkedTextViewStyle);
        this.f1293b.m926a();
        C0224c1 m775a = C0224c1.m775a(getContext(), attributeSet, f1292c, R.attr.checkedTextViewStyle, 0);
        setCheckMarkDrawable(m775a.m781b(0));
        m775a.f1236b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0272x c0272x = this.f1293b;
        if (c0272x != null) {
            c0272x.m926a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0027d.m55a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0181a.m618c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0027d.m50a((TextView) this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0272x c0272x = this.f1293b;
        if (c0272x != null) {
            c0272x.m929a(context, i);
        }
    }
}
