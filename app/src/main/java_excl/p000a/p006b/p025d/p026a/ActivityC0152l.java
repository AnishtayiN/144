package p000a.p006b.p025d.p026a;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p011a.ActivityC0043f;
import p000a.p006b.p010c.p011a.C0033a;
import p000a.p006b.p010c.p011a.C0048h0;
import p000a.p006b.p010c.p012b.C0067a;
import p000a.p006b.p025d.p026a.LayoutInflaterFactory2C0155o;
import p000a.p006b.p025d.p033f.AbstractC0186a;
import p000a.p006b.p025d.p033f.C0191f;
import p000a.p006b.p025d.p035g.C0239h1;
import p000a.p006b.p025d.p035g.C0243j;

/* renamed from: a.b.d.a.l */
/* loaded from: classes.dex */
public class ActivityC0152l extends ActivityC0043f implements InterfaceC0153m, C0048h0.a, InterfaceC0142b {

    /* renamed from: m */
    public AbstractC0154n f707m;

    /* renamed from: n */
    public int f708n = 0;

    /* renamed from: o */
    public Resources f709o;

    @Override // p000a.p006b.p025d.p026a.InterfaceC0153m
    /* renamed from: a */
    public AbstractC0186a mo533a(AbstractC0186a.a aVar) {
        return null;
    }

    /* renamed from: a */
    public void m534a(C0048h0 c0048h0) {
        c0048h0.m219a(this);
    }

    @Override // p000a.p006b.p025d.p026a.InterfaceC0153m
    /* renamed from: a */
    public void mo535a(AbstractC0186a abstractC0186a) {
    }

    /* renamed from: a */
    public void m536a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m540i();
        layoutInflaterFactory2C0155o.m570f();
        ((ViewGroup) layoutInflaterFactory2C0155o.f749t.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0155o.f733d.onContentChanged();
    }

    @Override // p000a.p006b.p025d.p026a.InterfaceC0153m
    /* renamed from: b */
    public void mo537b(AbstractC0186a abstractC0186a) {
    }

    /* renamed from: b */
    public boolean m538b(Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return shouldUpRecreateTask(intent);
        }
        String action = getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }

    /* renamed from: b */
    public final boolean m539b(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // p000a.p006b.p010c.p011a.C0048h0.a
    /* renamed from: c */
    public Intent mo220c() {
        return C0027d.m45a((Activity) this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        m541j();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0046g0, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        m541j();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m540i();
        layoutInflaterFactory2C0155o.m570f();
        return (T) layoutInflaterFactory2C0155o.f732c.findViewById(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m540i();
        if (layoutInflaterFactory2C0155o.f737h == null) {
            layoutInflaterFactory2C0155o.m576i();
            AbstractC0141a abstractC0141a = layoutInflaterFactory2C0155o.f736g;
            layoutInflaterFactory2C0155o.f737h = new C0191f(abstractC0141a != null ? abstractC0141a.mo523c() : layoutInflaterFactory2C0155o.f731b);
        }
        return layoutInflaterFactory2C0155o.f737h;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f709o == null) {
            C0239h1.m829a();
        }
        Resources resources = this.f709o;
        return resources == null ? super.getResources() : resources;
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f
    /* renamed from: h */
    public void mo214h() {
        m540i().mo553c();
    }

    /* renamed from: i */
    public AbstractC0154n m540i() {
        if (this.f707m == null) {
            this.f707m = new LayoutInflaterFactory2C0155o(this, getWindow(), this);
        }
        return this.f707m;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m540i().mo553c();
    }

    /* renamed from: j */
    public AbstractC0141a m541j() {
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m540i();
        layoutInflaterFactory2C0155o.m576i();
        return layoutInflaterFactory2C0155o.f736g;
    }

    /* renamed from: k */
    public void m542k() {
    }

    @Deprecated
    /* renamed from: l */
    public void m543l() {
    }

    /* renamed from: m */
    public boolean m544m() {
        Intent mo220c = mo220c();
        if (mo220c == null) {
            return false;
        }
        if (!m538b(mo220c)) {
            m536a(mo220c);
            return true;
        }
        C0048h0 c0048h0 = new C0048h0(this);
        m534a(c0048h0);
        m542k();
        if (c0048h0.f286b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = c0048h0.f286b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        C0067a.m319a(c0048h0.f287c, intentArr, null);
        try {
            C0033a.m128a(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m540i();
        if (layoutInflaterFactory2C0155o.f754y && layoutInflaterFactory2C0155o.f748s) {
            layoutInflaterFactory2C0155o.m576i();
            AbstractC0141a abstractC0141a = layoutInflaterFactory2C0155o.f736g;
            if (abstractC0141a != null) {
                abstractC0141a.mo516a(configuration);
            }
        }
        C0243j.m839a().m853b(layoutInflaterFactory2C0155o.f731b);
        layoutInflaterFactory2C0155o.mo549a();
        if (this.f709o != null) {
            this.f709o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        m543l();
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, p000a.p006b.p010c.p011a.ActivityC0046g0, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        AbstractC0154n m540i = m540i();
        m540i.mo551b();
        m540i.mo545a(bundle);
        if (m540i.mo549a() && (i = this.f708n) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f708n, false);
            } else {
                setTheme(i);
            }
        }
        super.onCreate(bundle);
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m540i();
        if (layoutInflaterFactory2C0155o.f724L) {
            layoutInflaterFactory2C0155o.f732c.getDecorView().removeCallbacks(layoutInflaterFactory2C0155o.f726N);
        }
        layoutInflaterFactory2C0155o.f720H = true;
        AbstractC0141a abstractC0141a = layoutInflaterFactory2C0155o.f736g;
        if (abstractC0141a != null) {
            abstractC0141a.m525d();
        }
        LayoutInflaterFactory2C0155o.f fVar = layoutInflaterFactory2C0155o.f723K;
        if (fVar != null) {
            fVar.m586a();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m539b(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0141a m541j = m541j();
        if (menuItem.getItemId() != 16908332 || m541j == null || (m541j.mo521b() & 4) == 0) {
            return false;
        }
        return m544m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0155o) m540i()).m570f();
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m540i();
        layoutInflaterFactory2C0155o.m576i();
        AbstractC0141a abstractC0141a = layoutInflaterFactory2C0155o.f736g;
        if (abstractC0141a != null) {
            abstractC0141a.mo524c(true);
        }
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, p000a.p006b.p010c.p011a.ActivityC0046g0, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i = ((LayoutInflaterFactory2C0155o) m540i()).f721I;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C0155o) m540i()).mo549a();
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0043f, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0155o layoutInflaterFactory2C0155o = (LayoutInflaterFactory2C0155o) m540i();
        layoutInflaterFactory2C0155o.m576i();
        AbstractC0141a abstractC0141a = layoutInflaterFactory2C0155o.f736g;
        if (abstractC0141a != null) {
            abstractC0141a.mo524c(false);
        }
        LayoutInflaterFactory2C0155o.f fVar = layoutInflaterFactory2C0155o.f723K;
        if (fVar != null) {
            fVar.m586a();
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m540i().mo548a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        m541j();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m540i().mo552b(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m540i().mo546a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m540i().mo547a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        this.f708n = i;
    }
}
