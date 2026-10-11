package p000a.p006b.p025d.p033f;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuC0089a;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p020g.C0104i;
import p000a.p006b.p025d.p033f.AbstractC0186a;

/* renamed from: a.b.d.f.e */
/* loaded from: classes.dex */
public class C0190e extends ActionMode {

    /* renamed from: a */
    public final Context f936a;

    /* renamed from: b */
    public final AbstractC0186a f937b;

    /* renamed from: a.b.d.f.e$a */
    public static class a implements AbstractC0186a.a {

        /* renamed from: a */
        public final ActionMode.Callback f938a;

        /* renamed from: b */
        public final Context f939b;

        /* renamed from: c */
        public final ArrayList<C0190e> f940c = new ArrayList<>();

        /* renamed from: d */
        public final C0104i<Menu, Menu> f941d = new C0104i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f939b = context;
            this.f938a = callback;
        }

        /* renamed from: a */
        public final Menu m647a(Menu menu) {
            Menu menu2 = this.f941d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu m51a = C0027d.m51a(this.f939b, (InterfaceMenuC0089a) menu);
            this.f941d.put(menu, m51a);
            return m51a;
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a.a
        /* renamed from: a */
        public void mo581a(AbstractC0186a abstractC0186a) {
            this.f938a.onDestroyActionMode(m648b(abstractC0186a));
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a.a
        /* renamed from: a */
        public boolean mo582a(AbstractC0186a abstractC0186a, Menu menu) {
            return this.f938a.onPrepareActionMode(m648b(abstractC0186a), m647a(menu));
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a.a
        /* renamed from: a */
        public boolean mo583a(AbstractC0186a abstractC0186a, MenuItem menuItem) {
            return this.f938a.onActionItemClicked(m648b(abstractC0186a), C0027d.m52a(this.f939b, (InterfaceMenuItemC0090b) menuItem));
        }

        /* renamed from: b */
        public ActionMode m648b(AbstractC0186a abstractC0186a) {
            int size = this.f940c.size();
            for (int i = 0; i < size; i++) {
                C0190e c0190e = this.f940c.get(i);
                if (c0190e != null && c0190e.f937b == abstractC0186a) {
                    return c0190e;
                }
            }
            C0190e c0190e2 = new C0190e(this.f939b, abstractC0186a);
            this.f940c.add(c0190e2);
            return c0190e2;
        }

        @Override // p000a.p006b.p025d.p033f.AbstractC0186a.a
        /* renamed from: b */
        public boolean mo584b(AbstractC0186a abstractC0186a, Menu menu) {
            return this.f938a.onCreateActionMode(m648b(abstractC0186a), m647a(menu));
        }
    }

    public C0190e(Context context, AbstractC0186a abstractC0186a) {
        this.f936a = context;
        this.f937b = abstractC0186a;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f937b.mo601a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f937b.mo606b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return C0027d.m51a(this.f936a, (InterfaceMenuC0089a) this.f937b.mo609c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f937b.mo610d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f937b.mo611e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f937b.f923b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f937b.mo612f();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f937b.f924c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f937b.mo613g();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f937b.mo614h();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f937b.mo603a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f937b.mo602a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f937b.mo604a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f937b.f923b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f937b.mo607b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f937b.mo608b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f937b.mo605a(z);
    }
}
