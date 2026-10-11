package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000a.p006b.p025d.p033f.p034i.C0201h;

/* renamed from: a.b.d.f.i.u */
/* loaded from: classes.dex */
public class SubMenuC0214u extends C0201h implements SubMenu {

    /* renamed from: B */
    public C0201h f1185B;

    /* renamed from: C */
    public C0204k f1186C;

    public SubMenuC0214u(Context context, C0201h c0201h, C0204k c0204k) {
        super(context);
        this.f1185B = c0201h;
        this.f1186C = c0204k;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: a */
    public void mo693a(C0201h.a aVar) {
        this.f1185B.mo693a(aVar);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: a */
    public boolean mo700a(C0201h c0201h, MenuItem menuItem) {
        return super.mo700a(c0201h, menuItem) || this.f1185B.mo700a(c0201h, menuItem);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: a */
    public boolean mo701a(C0204k c0204k) {
        return this.f1185B.mo701a(c0204k);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: b */
    public String mo704b() {
        C0204k c0204k = this.f1186C;
        int i = c0204k != null ? c0204k.f1114a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: b */
    public boolean mo707b(C0204k c0204k) {
        return this.f1185B.mo707b(c0204k);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: c */
    public C0201h mo708c() {
        return this.f1185B.mo708c();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: e */
    public boolean mo710e() {
        return this.f1185B.mo710e();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: f */
    public boolean mo711f() {
        return this.f1185B.mo711f();
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h
    /* renamed from: g */
    public boolean mo712g() {
        return this.f1185B.mo712g();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1186C;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1185B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m691a(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m691a(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m691a(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m691a(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m691a(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1186C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1186C.setIcon(drawable);
        return this;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.C0201h, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1185B.setQwertyMode(z);
    }
}
