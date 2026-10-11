package p000a.p006b.p025d.p035g;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: a.b.d.g.n0 */
/* loaded from: classes.dex */
public class C0253n0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ C0255o0 f1371b;

    public C0253n0(C0255o0 c0255o0) {
        this.f1371b = c0255o0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0241i0 c0241i0;
        if (i == -1 || (c0241i0 = this.f1371b.f1386d) == null) {
            return;
        }
        c0241i0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
