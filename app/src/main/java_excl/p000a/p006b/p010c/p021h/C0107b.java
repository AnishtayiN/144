package p000a.p006b.p010c.p021h;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import p000a.p006b.p010c.p021h.p022u.C0126a;
import p000a.p006b.p010c.p021h.p022u.C0127b;

/* renamed from: a.b.c.h.b */
/* loaded from: classes.dex */
public class C0107b {

    /* renamed from: b */
    public static final View.AccessibilityDelegate f590b = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f591a = new a(this);

    /* renamed from: a.b.c.h.b$a */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C0107b f592a;

        public a(C0107b c0107b) {
            this.f592a = c0107b;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f592a.m434a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0127b m430a = this.f592a.m430a(view);
            if (m430a != null) {
                return (AccessibilityNodeProvider) m430a.f625a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f592a.mo436b(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            this.f592a.mo432a(view, new C0126a(accessibilityNodeInfo));
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f592a.m437c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f592a.m435a(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f592a.mo433a(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f592a.m431a(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f592a.m438d(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public C0127b m430a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = f590b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0127b(accessibilityNodeProvider);
    }

    /* renamed from: a */
    public void m431a(View view, int i) {
        f590b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo432a(View view, C0126a c0126a) {
        f590b.onInitializeAccessibilityNodeInfo(view, c0126a.f624a);
    }

    /* renamed from: a */
    public boolean mo433a(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return f590b.performAccessibilityAction(view, i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public boolean m434a(View view, AccessibilityEvent accessibilityEvent) {
        return f590b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean m435a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f590b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo436b(View view, AccessibilityEvent accessibilityEvent) {
        f590b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public void m437c(View view, AccessibilityEvent accessibilityEvent) {
        f590b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void m438d(View view, AccessibilityEvent accessibilityEvent) {
        f590b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
