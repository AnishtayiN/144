package p000a.p006b.p025d.p033f.p034i;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import p000a.p006b.p025d.p026a.C0147g;
import p000a.p006b.p025d.p026a.C0148h;
import p000a.p006b.p025d.p026a.C0149i;
import p000a.p006b.p025d.p026a.C0150j;
import p000a.p006b.p025d.p026a.DialogInterfaceC0151k;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0209p;
import p000a.p006b.p025d.p033f.p034i.InterfaceC0210q;

/* renamed from: a.b.d.f.i.f */
/* loaded from: classes.dex */
public class C0199f implements InterfaceC0209p, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public Context f1061b;

    /* renamed from: c */
    public LayoutInflater f1062c;

    /* renamed from: d */
    public C0201h f1063d;

    /* renamed from: e */
    public ExpandedMenuView f1064e;

    /* renamed from: f */
    public int f1065f;

    /* renamed from: g */
    public int f1066g = 0;

    /* renamed from: h */
    public int f1067h;

    /* renamed from: i */
    public InterfaceC0209p.a f1068i;

    /* renamed from: j */
    public a f1069j;

    /* renamed from: a.b.d.f.i.f$a */
    public class a extends BaseAdapter {

        /* renamed from: b */
        public int f1070b = -1;

        public a() {
            m686a();
        }

        /* renamed from: a */
        public void m686a() {
            C0201h c0201h = C0199f.this.f1063d;
            C0204k c0204k = c0201h.f1102x;
            if (c0204k != null) {
                c0201h.m690a();
                ArrayList<C0204k> arrayList = c0201h.f1088j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == c0204k) {
                        this.f1070b = i;
                        return;
                    }
                }
            }
            this.f1070b = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            C0201h c0201h = C0199f.this.f1063d;
            c0201h.m690a();
            int size = c0201h.f1088j.size() - C0199f.this.f1065f;
            return this.f1070b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public C0204k getItem(int i) {
            C0201h c0201h = C0199f.this.f1063d;
            c0201h.m690a();
            ArrayList<C0204k> arrayList = c0201h.f1088j;
            int i2 = i + C0199f.this.f1065f;
            int i3 = this.f1070b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0199f c0199f = C0199f.this;
                view = c0199f.f1062c.inflate(c0199f.f1067h, viewGroup, false);
            }
            ((InterfaceC0210q.a) view).mo739a(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m686a();
            super.notifyDataSetChanged();
        }
    }

    public C0199f(Context context, int i) {
        this.f1067h = i;
        this.f1061b = context;
        this.f1062c = LayoutInflater.from(this.f1061b);
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo659a(C0201h c0201h, boolean z) {
        InterfaceC0209p.a aVar = this.f1068i;
        if (aVar != null) {
            aVar.mo579a(c0201h, z);
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo660a(InterfaceC0209p.a aVar) {
        this.f1068i = aVar;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo661a(Context context, C0201h c0201h) {
        int i = this.f1066g;
        if (i != 0) {
            this.f1061b = new ContextThemeWrapper(context, i);
            this.f1062c = LayoutInflater.from(this.f1061b);
        } else if (this.f1061b != null) {
            this.f1061b = context;
            if (this.f1062c == null) {
                this.f1062c = LayoutInflater.from(this.f1061b);
            }
        }
        this.f1063d = c0201h;
        a aVar = this.f1069j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public void mo662a(boolean z) {
        a aVar = this.f1069j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo673a() {
        return false;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo663a(C0201h c0201h, C0204k c0204k) {
        return false;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: a */
    public boolean mo664a(SubMenuC0214u subMenuC0214u) {
        ListAdapter listAdapter;
        if (!subMenuC0214u.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC0202i dialogInterfaceOnKeyListenerC0202i = new DialogInterfaceOnKeyListenerC0202i(subMenuC0214u);
        C0201h c0201h = dialogInterfaceOnKeyListenerC0202i.f1105b;
        Context context = c0201h.f1079a;
        int m532a = DialogInterfaceC0151k.m532a(context, 0);
        AlertController.C0287b c0287b = new AlertController.C0287b(new ContextThemeWrapper(context, DialogInterfaceC0151k.m532a(context, m532a)));
        dialogInterfaceOnKeyListenerC0202i.f1107d = new C0199f(c0287b.f1700a, C0172g.abc_list_menu_item_layout);
        C0199f c0199f = dialogInterfaceOnKeyListenerC0202i.f1107d;
        c0199f.f1068i = dialogInterfaceOnKeyListenerC0202i;
        C0201h c0201h2 = dialogInterfaceOnKeyListenerC0202i.f1105b;
        c0201h2.m695a(c0199f, c0201h2.f1079a);
        c0287b.f1722w = dialogInterfaceOnKeyListenerC0202i.f1107d.m685b();
        c0287b.f1723x = dialogInterfaceOnKeyListenerC0202i;
        View view = c0201h.f1094p;
        if (view != null) {
            c0287b.f1706g = view;
        } else {
            c0287b.f1703d = c0201h.f1093o;
            c0287b.f1705f = c0201h.f1092n;
        }
        c0287b.f1720u = dialogInterfaceOnKeyListenerC0202i;
        DialogInterfaceC0151k dialogInterfaceC0151k = new DialogInterfaceC0151k(c0287b.f1700a, m532a);
        AlertController alertController = dialogInterfaceC0151k.f706d;
        View view2 = c0287b.f1706g;
        if (view2 != null) {
            alertController.f1644G = view2;
        } else {
            CharSequence charSequence = c0287b.f1705f;
            if (charSequence != null) {
                alertController.m1010a(charSequence);
            }
            Drawable drawable = c0287b.f1703d;
            if (drawable != null) {
                alertController.f1640C = drawable;
                alertController.f1639B = 0;
                ImageView imageView = alertController.f1641D;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    alertController.f1641D.setImageDrawable(drawable);
                }
            }
            int i = c0287b.f1702c;
            if (i != 0) {
                alertController.m1011b(i);
            }
            int i2 = c0287b.f1704e;
            if (i2 != 0) {
                alertController.m1011b(alertController.m1006a(i2));
            }
        }
        CharSequence charSequence2 = c0287b.f1707h;
        if (charSequence2 != null) {
            alertController.f1662f = charSequence2;
            TextView textView = alertController.f1643F;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        if (c0287b.f1708i != null || c0287b.f1709j != null) {
            alertController.m1008a(-1, c0287b.f1708i, c0287b.f1710k, null, c0287b.f1709j);
        }
        if (c0287b.f1711l != null || c0287b.f1712m != null) {
            alertController.m1008a(-2, c0287b.f1711l, c0287b.f1713n, null, c0287b.f1712m);
        }
        if (c0287b.f1714o != null || c0287b.f1715p != null) {
            alertController.m1008a(-3, c0287b.f1714o, c0287b.f1716q, null, c0287b.f1715p);
        }
        if (c0287b.f1721v != null || c0287b.f1696K != null || c0287b.f1722w != null) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0287b.f1701b.inflate(alertController.f1649L, (ViewGroup) null);
            if (c0287b.f1692G) {
                Cursor cursor = c0287b.f1696K;
                listAdapter = cursor == null ? new C0147g(c0287b, c0287b.f1700a, alertController.f1650M, R.id.text1, c0287b.f1721v, recycleListView) : new C0148h(c0287b, c0287b.f1700a, cursor, false, recycleListView, alertController);
            } else {
                int i3 = c0287b.f1693H ? alertController.f1651N : alertController.f1652O;
                Cursor cursor2 = c0287b.f1696K;
                if (cursor2 != null) {
                    listAdapter = new SimpleCursorAdapter(c0287b.f1700a, i3, cursor2, new String[]{c0287b.f1697L}, new int[]{R.id.text1});
                } else {
                    listAdapter = c0287b.f1722w;
                    if (listAdapter == null) {
                        listAdapter = new AlertController.C0289d(c0287b.f1700a, i3, R.id.text1, c0287b.f1721v);
                    }
                }
            }
            alertController.f1645H = listAdapter;
            alertController.f1646I = c0287b.f1694I;
            if (c0287b.f1723x != null) {
                recycleListView.setOnItemClickListener(new C0149i(c0287b, alertController));
            } else if (c0287b.f1695J != null) {
                recycleListView.setOnItemClickListener(new C0150j(c0287b, recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = c0287b.f1699N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (c0287b.f1693H) {
                recycleListView.setChoiceMode(1);
            } else if (c0287b.f1692G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f1663g = recycleListView;
        }
        View view3 = c0287b.f1725z;
        if (view3 == null) {
            int i4 = c0287b.f1724y;
            if (i4 != 0) {
                alertController.f1664h = null;
                alertController.f1665i = i4;
                alertController.f1670n = false;
            }
        } else if (c0287b.f1690E) {
            int i5 = c0287b.f1686A;
            int i6 = c0287b.f1687B;
            int i7 = c0287b.f1688C;
            int i8 = c0287b.f1689D;
            alertController.f1664h = view3;
            alertController.f1665i = 0;
            alertController.f1670n = true;
            alertController.f1666j = i5;
            alertController.f1667k = i6;
            alertController.f1668l = i7;
            alertController.f1669m = i8;
        } else {
            alertController.f1664h = view3;
            alertController.f1665i = 0;
            alertController.f1670n = false;
        }
        dialogInterfaceC0151k.setCancelable(c0287b.f1717r);
        if (c0287b.f1717r) {
            dialogInterfaceC0151k.setCanceledOnTouchOutside(true);
        }
        dialogInterfaceC0151k.setOnCancelListener(c0287b.f1718s);
        dialogInterfaceC0151k.setOnDismissListener(c0287b.f1719t);
        DialogInterface.OnKeyListener onKeyListener = c0287b.f1720u;
        if (onKeyListener != null) {
            dialogInterfaceC0151k.setOnKeyListener(onKeyListener);
        }
        dialogInterfaceOnKeyListenerC0202i.f1106c = dialogInterfaceC0151k;
        dialogInterfaceOnKeyListenerC0202i.f1106c.setOnDismissListener(dialogInterfaceOnKeyListenerC0202i);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC0202i.f1106c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC0202i.f1106c.show();
        InterfaceC0209p.a aVar = this.f1068i;
        if (aVar != null) {
            aVar.mo580a(subMenuC0214u);
        }
        return true;
    }

    /* renamed from: b */
    public ListAdapter m685b() {
        if (this.f1069j == null) {
            this.f1069j = new a();
        }
        return this.f1069j;
    }

    @Override // p000a.p006b.p025d.p033f.p034i.InterfaceC0209p
    /* renamed from: b */
    public boolean mo666b(C0201h c0201h, C0204k c0204k) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1063d.m703a(this.f1069j.getItem(i), this, 0);
    }
}
