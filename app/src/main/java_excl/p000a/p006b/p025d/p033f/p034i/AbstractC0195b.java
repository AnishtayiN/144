package p000a.p006b.p025d.p033f.p034i;

import android.content.Context;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;
import p000a.p006b.p025d.p035g.C0222c;
import p000a.p006b.p025d.p035g.C0222c.b;

/* renamed from: a.b.d.f.i.b */
/* loaded from: classes.dex */
public abstract class AbstractC0195b implements InterfaceC0209p {

    /* renamed from: b */
    public Context f1012b;

    /* renamed from: c */
    public Context f1013c;

    /* renamed from: d */
    public C0201h f1014d;

    /* renamed from: e */
    public LayoutInflater f1015e;

    /* renamed from: f */
    public InterfaceC0209p.a f1016f;

    /* renamed from: g */
    public int f1017g;

    /* renamed from: h */
    public int f1018h;

    /* renamed from: i */
    public InterfaceC0210q f1019i;

    public AbstractC0195b(Context context, int i, int i2) {
        this.f1012b = context;
        this.f1015e = LayoutInflater.from(context);
        this.f1017g = i;
        this.f1018h = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.b.d.f.i.q$a] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* renamed from: a */
    public View mo657a(C0204k c0204k, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0210q.a ? (InterfaceC0210q.a) view : (InterfaceC0210q.a) this.f1015e.inflate(this.f1018h, viewGroup, false);
        C0222c c0222c = (C0222c) this;
        actionMenuItemView.mo739a(c0204k, 0);
        ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
        actionMenuItemView2.setItemInvoker((ActionMenuView) c0222c.f1019i);
        if (c0222c.f1205B == null) {
            c0222c.f1205B = c0222c.new b();
        }
        actionMenuItemView2.setPopupCallback(c0222c.f1205B);
        return actionMenuItemView;
    }

    /* renamed from: a */
    public void m658a(int i) {
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo659a(C0201h c0201h, boolean z) {
        InterfaceC0209p.a aVar = this.f1016f;
        if (aVar != null) {
            aVar.mo579a(c0201h, z);
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo660a(InterfaceC0209p.a aVar) {
        this.f1016f = aVar;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo661a(Context context, C0201h c0201h) {
        this.f1013c = context;
        LayoutInflater.from(this.f1013c);
        this.f1014d = c0201h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo662a(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f1019i;
        if (viewGroup == null) {
            return;
        }
        C0201h c0201h = this.f1014d;
        int i = 0;
        if (c0201h != null) {
            c0201h.m690a();
            ArrayList<C0204k> m709d = this.f1014d.m709d();
            int size = m709d.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0204k c0204k = m709d.get(i3);
                if (c0204k.m725d()) {
                    View childAt = viewGroup.getChildAt(i2);
                    C0204k itemData = childAt instanceof InterfaceC0210q.a ? ((InterfaceC0210q.a) childAt).getItemData() : null;
                    View mo657a = mo657a(c0204k, childAt, viewGroup);
                    if (c0204k != itemData) {
                        mo657a.setPressed(false);
                        mo657a.jumpDrawablesToCurrentState();
                    }
                    if (mo657a != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) mo657a.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(mo657a);
                        }
                        ((ViewGroup) this.f1019i).addView(mo657a, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo665a(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo663a(C0201h c0201h, C0204k c0204k) {
        return false;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo664a(SubMenuC0214u subMenuC0214u) {
        InterfaceC0209p.a aVar = this.f1016f;
        if (aVar != null) {
            return aVar.mo580a(subMenuC0214u);
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo665a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: b */
    public boolean mo666b(C0201h c0201h, C0204k c0204k) {
        return false;
    }
}
