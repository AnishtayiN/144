package p000a.p006b.p025d.p033f.p034i;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;

/* renamed from: a.b.d.f.i.g */
/* loaded from: classes.dex */
public class C0200g extends BaseAdapter {

    /* renamed from: b */
    public C0201h f1072b;

    /* renamed from: c */
    public int f1073c = -1;

    /* renamed from: d */
    public boolean f1074d;

    /* renamed from: e */
    public final boolean f1075e;

    /* renamed from: f */
    public final LayoutInflater f1076f;

    /* renamed from: g */
    public final int f1077g;

    public C0200g(C0201h c0201h, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1075e = z;
        this.f1076f = layoutInflater;
        this.f1072b = c0201h;
        this.f1077g = i;
        m687a();
    }

    /* renamed from: a */
    public void m687a() {
        C0201h c0201h = this.f1072b;
        C0204k c0204k = c0201h.f1102x;
        if (c0204k != null) {
            c0201h.m690a();
            ArrayList<C0204k> arrayList = c0201h.f1088j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == c0204k) {
                    this.f1073c = i;
                    return;
                }
            }
        }
        this.f1073c = -1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0204k> m709d;
        if (this.f1075e) {
            C0201h c0201h = this.f1072b;
            c0201h.m690a();
            m709d = c0201h.f1088j;
        } else {
            m709d = this.f1072b.m709d();
        }
        return this.f1073c < 0 ? m709d.size() : m709d.size() - 1;
    }

    @Override // android.widget.Adapter
    public C0204k getItem(int i) {
        ArrayList<C0204k> m709d;
        if (this.f1075e) {
            C0201h c0201h = this.f1072b;
            c0201h.m690a();
            m709d = c0201h.f1088j;
        } else {
            m709d = this.f1072b.m709d();
        }
        int i2 = this.f1073c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m709d.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1076f.inflate(this.f1077g, viewGroup, false);
        }
        int i2 = getItem(i).f1115b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1072b.mo710e() && i2 != (i3 >= 0 ? getItem(i3).f1115b : i2));
        InterfaceC0210q.a aVar = (InterfaceC0210q.a) view;
        if (this.f1074d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo739a(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m687a();
        super.notifyDataSetChanged();
    }
}
