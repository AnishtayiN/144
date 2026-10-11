package p000a.p006b.p025d.p033f;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p000a.p006b.p025d.p033f.AbstractC0186a;
import p000a.p006b.p025d.p033f.p034i.C0201h;

/* renamed from: a.b.d.f.d */
/* loaded from: classes.dex */
public class C0189d extends AbstractC0186a implements C0201h.a {

    /* renamed from: d */
    public Context f930d;

    /* renamed from: e */
    public ActionBarContextView f931e;

    /* renamed from: f */
    public AbstractC0186a.a f932f;

    /* renamed from: g */
    public WeakReference<View> f933g;

    /* renamed from: h */
    public boolean f934h;

    /* renamed from: i */
    public C0201h f935i;

    public C0189d(Context context, ActionBarContextView actionBarContextView, AbstractC0186a.a aVar, boolean z) {
        this.f930d = context;
        this.f931e = actionBarContextView;
        this.f932f = aVar;
        C0201h c0201h = new C0201h(actionBarContextView.getContext());
        c0201h.f1090l = 1;
        this.f935i = c0201h;
        this.f935i.mo693a(this);
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: a */
    public void mo601a() {
        if (this.f934h) {
            return;
        }
        this.f934h = true;
        this.f931e.sendAccessibilityEvent(32);
        this.f932f.mo581a(this);
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: a */
    public void mo602a(int i) {
        mo604a(this.f930d.getString(i));
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h.a
    /* renamed from: a */
    public void mo559a(C0201h c0201h) {
        mo613g();
        this.f931e.m1031e();
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: a */
    public void mo603a(View view) {
        this.f931e.setCustomView(view);
        this.f933g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: a */
    public void mo604a(CharSequence charSequence) {
        this.f931e.setSubtitle(charSequence);
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: a */
    public void mo605a(boolean z) {
        this.f924c = z;
        this.f931e.setTitleOptional(z);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h.a
    /* renamed from: a */
    public boolean mo561a(C0201h c0201h, MenuItem menuItem) {
        return this.f932f.mo583a(this, menuItem);
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: b */
    public View mo606b() {
        WeakReference<View> weakReference = this.f933g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: b */
    public void mo607b(int i) {
        mo608b(this.f930d.getString(i));
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: b */
    public void mo608b(CharSequence charSequence) {
        this.f931e.setTitle(charSequence);
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: c */
    public Menu mo609c() {
        return this.f935i;
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: d */
    public MenuInflater mo610d() {
        return new C0191f(this.f931e.getContext());
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: e */
    public CharSequence mo611e() {
        return this.f931e.getSubtitle();
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: f */
    public CharSequence mo612f() {
        return this.f931e.getTitle();
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: g */
    public void mo613g() {
        this.f932f.mo582a(this, this.f935i);
    }

    @Override // p000a.p006b.p025d.p033f.AbstractC0186a
    /* renamed from: h */
    public boolean mo614h() {
        return this.f931e.m1029c();
    }
}
