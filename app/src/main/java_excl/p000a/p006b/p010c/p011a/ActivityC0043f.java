package p000a.p006b.p010c.p011a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.LoaderManagerImpl;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p001a.p005b.AbstractC0008d;
import p000a.p001a.p005b.C0019o;
import p000a.p001a.p005b.InterfaceC0020p;
import p000a.p006b.p010c.p011a.C0033a;
import p000a.p006b.p010c.p020g.C0105j;

/* renamed from: a.b.c.a.f */
/* loaded from: classes.dex */
public class ActivityC0043f extends ActivityC0046g0 implements InterfaceC0020p, C0033a.a, C0033a.b {

    /* renamed from: e */
    public C0019o f272e;

    /* renamed from: f */
    public boolean f273f;

    /* renamed from: g */
    public boolean f274g;

    /* renamed from: i */
    public boolean f276i;

    /* renamed from: j */
    public boolean f277j;

    /* renamed from: k */
    public int f278k;

    /* renamed from: l */
    public C0105j<String> f279l;

    /* renamed from: c */
    public final Handler f270c = new a();

    /* renamed from: d */
    public final C0047h f271d = new C0047h(new b());

    /* renamed from: h */
    public boolean f275h = true;

    /* renamed from: a.b.c.a.f$a */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
            } else {
                ActivityC0043f.this.m212f();
                ActivityC0043f.this.f271d.m216a();
            }
        }
    }

    /* renamed from: a.b.c.a.f$b */
    public class b extends AbstractC0049i<ActivityC0043f> {
        public b() {
            super(ActivityC0043f.this);
        }

        @Override // p000a.p006b.p010c.p011a.AbstractC0045g
        /* renamed from: a */
        public View mo204a(int i) {
            return ActivityC0043f.this.findViewById(i);
        }

        @Override // p000a.p006b.p010c.p011a.AbstractC0045g
        /* renamed from: a */
        public boolean mo205a() {
            Window window = ActivityC0043f.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }

    /* renamed from: a.b.c.a.f$c */
    public static final class c {

        /* renamed from: a */
        public C0019o f282a;

        /* renamed from: b */
        public C0055o f283b;
    }

    /* renamed from: a */
    public static void m206a(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: a */
    public static boolean m207a(AbstractC0050j abstractC0050j, AbstractC0008d.b bVar) {
        boolean z = false;
        for (ComponentCallbacksC0041e componentCallbacksC0041e : abstractC0050j.mo221a()) {
            if (componentCallbacksC0041e != null) {
                if (componentCallbacksC0041e.f220T.f30b.compareTo(AbstractC0008d.b.STARTED) >= 0) {
                    componentCallbacksC0041e.f220T.m20a(bVar);
                    z = true;
                }
                LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = componentCallbacksC0041e.f243u;
                if (layoutInflaterFactory2C0051k != null) {
                    z |= m207a(layoutInflaterFactory2C0051k, bVar);
                }
            }
        }
        return z;
    }

    @Override // p000a.p001a.p005b.InterfaceC0010f
    /* renamed from: a */
    public AbstractC0008d mo14a() {
        return this.f284b;
    }

    /* renamed from: a */
    public final View m208a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f271d.f285a.f291d.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public boolean m209a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // p000a.p001a.p005b.InterfaceC0020p
    /* renamed from: b */
    public C0019o mo29b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f272e == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f272e = cVar.f282a;
            }
            if (this.f272e == null) {
                this.f272e = new C0019o();
            }
        }
        return this.f272e;
    }

    /* renamed from: d */
    public AbstractC0050j m210d() {
        return this.f271d.m217b();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f273f);
        printWriter.print(" mResumed=");
        printWriter.print(this.f274g);
        printWriter.print(" mStopped=");
        printWriter.print(this.f275h);
        if (getApplication() != null) {
            ((LoaderManagerImpl) AbstractC0038c0.m157a(this)).f1593b.m972a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f271d.m217b().mo222a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public void m211e() {
    }

    /* renamed from: f */
    public void m212f() {
        this.f271d.f285a.f291d.m290l();
    }

    /* renamed from: g */
    public Object m213g() {
        return null;
    }

    @Deprecated
    /* renamed from: h */
    public void mo214h() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f271d.m218c();
        int i3 = i >> 16;
        if (i3 == 0) {
            C0033a.m127a();
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        String m421a = this.f279l.m421a(i4);
        this.f279l.m427c(i4);
        if (m421a == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        } else if (this.f271d.f285a.f291d.m232a(m421a) == null) {
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m421a);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        AbstractC0050j m217b = this.f271d.m217b();
        boolean mo223b = m217b.mo223b();
        if (!mo223b || Build.VERSION.SDK_INT > 25) {
            if (mo223b || !m217b.mo224c()) {
                super.onBackPressed();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f271d.m218c();
        this.f271d.f285a.f291d.m246a(configuration);
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0046g0, android.app.Activity
    public void onCreate(Bundle bundle) {
        C0019o c0019o;
        AbstractC0049i<?> abstractC0049i = this.f271d.f285a;
        abstractC0049i.f291d.m244a(abstractC0049i, abstractC0049i, (ComponentCallbacksC0041e) null);
        super.onCreate(bundle);
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null && (c0019o = cVar.f282a) != null && this.f272e == null) {
            this.f272e = c0019o;
        }
        if (bundle != null) {
            this.f271d.f285a.f291d.m247a(bundle.getParcelable("android:support:fragments"), cVar != null ? cVar.f283b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f278k = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f279l = new C0105j<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f279l.m428c(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f279l == null) {
            this.f279l = new C0105j<>(10);
            this.f278k = 0;
        }
        this.f271d.f285a.f291d.m283h();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0047h c0047h = this.f271d;
        return onCreatePanelMenu | c0047h.f285a.f291d.m253a(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View m208a = m208a(view, str, context, attributeSet);
        return m208a == null ? super.onCreateView(view, str, context, attributeSet) : m208a;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View m208a = m208a(null, str, context, attributeSet);
        return m208a == null ? super.onCreateView(str, context, attributeSet) : m208a;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f272e != null && !isChangingConfigurations()) {
            this.f272e.m28a();
        }
        this.f271d.f285a.f291d.m286i();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f271d.f285a.f291d.m288j();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f271d.f285a.f291d.m262b(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f271d.f285a.f291d.m254a(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f271d.f285a.f291d.m252a(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f271d.m218c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f271d.f285a.f291d.m248a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f274g = false;
        if (this.f270c.hasMessages(2)) {
            this.f270c.removeMessages(2);
            m212f();
        }
        this.f271d.f285a.f291d.m289k();
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f271d.f285a.f291d.m260b(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f270c.removeMessages(2);
        m212f();
        this.f271d.m216a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return (i != 0 || menu == null) ? super.onPreparePanel(i, view, menu) : m209a(view, menu) | this.f271d.f285a.f291d.m261b(menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f271d.m218c();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String m421a = this.f279l.m421a(i3);
            this.f279l.m427c(i3);
            if (m421a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.f271d.f285a.f291d.m232a(m421a) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m421a);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f270c.sendEmptyMessage(2);
        this.f274g = true;
        this.f271d.m216a();
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object m213g = m213g();
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f271d.f285a.f291d;
        LayoutInflaterFactory2C0051k.m228a(layoutInflaterFactory2C0051k.f298D);
        C0055o c0055o = layoutInflaterFactory2C0051k.f298D;
        if (c0055o == null && this.f272e == null && m213g == null) {
            return null;
        }
        c cVar = new c();
        cVar.f282a = this.f272e;
        cVar.f283b = c0055o;
        return cVar;
    }

    @Override // p000a.p006b.p010c.p011a.ActivityC0046g0, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        while (m207a(m210d(), AbstractC0008d.b.CREATED)) {
        }
        Parcelable m296r = this.f271d.f285a.f291d.m296r();
        if (m296r != null) {
            bundle.putParcelable("android:support:fragments", m296r);
        }
        if (this.f279l.m424b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f278k);
            int[] iArr = new int[this.f279l.m424b()];
            String[] strArr = new String[this.f279l.m424b()];
            for (int i = 0; i < this.f279l.m424b(); i++) {
                iArr[i] = this.f279l.m425b(i);
                strArr[i] = this.f279l.m429d(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f275h = false;
        if (!this.f273f) {
            this.f273f = true;
            this.f271d.f285a.f291d.m280g();
        }
        this.f271d.m218c();
        this.f271d.m216a();
        this.f271d.f285a.f291d.m291m();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f271d.m218c();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f275h = true;
        while (m207a(m210d(), AbstractC0008d.b.CREATED)) {
        }
        LayoutInflaterFactory2C0051k layoutInflaterFactory2C0051k = this.f271d.f285a.f291d;
        layoutInflaterFactory2C0051k.f318t = true;
        layoutInflaterFactory2C0051k.m234a(2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f277j && i != -1) {
            m206a(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.f277j && i != -1) {
            m206a(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.f276i && i != -1) {
            m206a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.f276i && i != -1) {
            m206a(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
