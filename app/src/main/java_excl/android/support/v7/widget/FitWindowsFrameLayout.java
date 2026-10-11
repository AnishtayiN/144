package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000a.p006b.p025d.p026a.C0157q;
import p000a.p006b.p025d.p035g.InterfaceC0244j0;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0244j0 {

    /* renamed from: b */
    public InterfaceC0244j0.a f1863b;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0244j0.a aVar = this.f1863b;
        if (aVar != null) {
            rect.top = ((C0157q) aVar).f790a.m574h(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // p000a.p006b.p025d.p035g.InterfaceC0244j0
    public void setOnFitSystemWindowsListener(InterfaceC0244j0.a aVar) {
        this.f1863b = aVar;
    }
}
