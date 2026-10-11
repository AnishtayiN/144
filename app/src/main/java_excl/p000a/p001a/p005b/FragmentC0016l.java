package p000a.p001a.p005b;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import p000a.p001a.p005b.AbstractC0008d;

/* renamed from: a.a.b.l */
/* loaded from: classes.dex */
public class FragmentC0016l extends Fragment {
    /* renamed from: a */
    public static void m25a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0016l(), "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void m26a(AbstractC0008d.a aVar) {
        ComponentCallbacks2 activity = getActivity();
        if (activity instanceof InterfaceC0012h) {
            ((InterfaceC0012h) activity).mo14a().m19a(aVar);
        } else if (activity instanceof InterfaceC0010f) {
            AbstractC0008d mo14a = ((InterfaceC0010f) activity).mo14a();
            if (mo14a instanceof C0011g) {
                ((C0011g) mo14a).m19a(aVar);
            }
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m26a(AbstractC0008d.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m26a(AbstractC0008d.a.ON_DESTROY);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m26a(AbstractC0008d.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m26a(AbstractC0008d.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m26a(AbstractC0008d.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m26a(AbstractC0008d.a.ON_STOP);
    }
}
