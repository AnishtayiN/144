package p000a.p006b.p025d.p035g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p019f.C0095a;
import p000a.p006b.p010c.p021h.InterfaceC0118m;
import p000a.p006b.p010c.p024i.InterfaceC0133b;

/* renamed from: a.b.d.g.y */
/* loaded from: classes.dex */
public class C0274y extends TextView implements InterfaceC0118m, InterfaceC0133b {

    /* renamed from: b */
    public final C0228e f1552b;

    /* renamed from: c */
    public final C0272x f1553c;

    /* renamed from: d */
    public Future<C0095a> f1554d;

    public C0274y(Context context) {
        this(context, null);
    }

    public C0274y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C0274y(Context context, AttributeSet attributeSet, int i) {
        super(C0277z0.m953a(context), attributeSet, i);
        this.f1552b = new C0228e(this);
        this.f1552b.m793a(attributeSet, i);
        this.f1553c = new C0272x(this);
        this.f1553c.m932a(attributeSet, i);
        this.f1553c.m926a();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0228e c0228e = this.f1552b;
        if (c0228e != null) {
            c0228e.m789a();
        }
        C0272x c0272x = this.f1553c;
        if (c0272x != null) {
            c0272x.m926a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0133b.f661a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0272x c0272x = this.f1553c;
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
        C0272x c0272x = this.f1553c;
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
        C0272x c0272x = this.f1553c;
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
        C0272x c0272x = this.f1553c;
        return c0272x != null ? c0272x.m937e() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (InterfaceC0133b.f661a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0272x c0272x = this.f1553c;
        if (c0272x != null) {
            return c0272x.m938f();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public ColorStateList getSupportBackgroundTintList() {
        C0228e c0228e = this.f1552b;
        if (c0228e != null) {
            return c0228e.m794b();
        }
        return null;
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228e c0228e = this.f1552b;
        if (c0228e != null) {
            return c0228e.m796c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<C0095a> future = this.f1554d;
        if (future != null) {
            try {
                this.f1554d = null;
                C0027d.m76a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public C0095a.a getTextMetricsParamsCompat() {
        return C0027d.m40a((TextView) this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0027d.m55a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0272x c0272x = this.f1553c;
        if (c0272x == null || InterfaceC0133b.f661a) {
            return;
        }
        c0272x.f1539h.m946a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<C0095a> future = this.f1554d;
        if (future != null) {
            try {
                this.f1554d = null;
                C0027d.m76a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0272x c0272x = this.f1553c;
        if (c0272x == null || InterfaceC0133b.f661a || !c0272x.m939g()) {
            return;
        }
        this.f1553c.f1539h.m946a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0133b.f661a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0272x c0272x = this.f1553c;
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
        C0272x c0272x = this.f1553c;
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
        C0272x c0272x = this.f1553c;
        if (c0272x != null) {
            c0272x.m927a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228e c0228e = this.f1552b;
        if (c0228e != null) {
            c0228e.m797d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228e c0228e = this.f1552b;
        if (c0228e != null) {
            c0228e.m790a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0027d.m50a((TextView) this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0027d.m75a(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0027d.m95b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C0027d.m99c(this, i);
    }

    public void setPrecomputedText(C0095a c0095a) {
        C0027d.m76a((TextView) this, c0095a);
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228e c0228e = this.f1552b;
        if (c0228e != null) {
            c0228e.m795b(colorStateList);
        }
    }

    @Override // p000a.p006b.p010c.p021h.InterfaceC0118m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228e c0228e = this.f1552b;
        if (c0228e != null) {
            c0228e.m792a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0272x c0272x = this.f1553c;
        if (c0272x != null) {
            c0272x.m929a(context, i);
        }
    }

    public void setTextFuture(Future<C0095a> future) {
        this.f1554d = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(C0095a.a aVar) {
        if (Build.VERSION.SDK_INT >= 18) {
            TextDirectionHeuristic m377c = aVar.m377c();
            int i = 1;
            if (m377c != TextDirectionHeuristics.FIRSTSTRONG_RTL && m377c != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                if (m377c == TextDirectionHeuristics.ANYRTL_LTR) {
                    i = 2;
                } else if (m377c == TextDirectionHeuristics.LTR) {
                    i = 3;
                } else if (m377c == TextDirectionHeuristics.RTL) {
                    i = 4;
                } else if (m377c == TextDirectionHeuristics.LOCALE) {
                    i = 5;
                } else if (m377c == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i = 6;
                } else if (m377c == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i = 7;
                }
            }
            setTextDirection(i);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            getPaint().set(aVar.f526a);
            setBreakStrategy(aVar.m375a());
            setHyphenationFrequency(aVar.m376b());
        } else {
            float textScaleX = aVar.f526a.getTextScaleX();
            getPaint().set(aVar.f526a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC0133b.f661a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0272x c0272x = this.f1553c;
        if (c0272x == null || z || c0272x.m939g()) {
            return;
        }
        c0272x.f1539h.m948a(i, f);
    }
}
