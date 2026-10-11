package p000a.p006b.p010c.p024i;

import android.database.Cursor;
import android.widget.Filter;
import p000a.p006b.p025d.p035g.ViewOnClickListenerC0271w0;

/* renamed from: a.b.c.i.d */
/* loaded from: classes.dex */
public class C0135d extends Filter {

    /* renamed from: a */
    public a f672a;

    /* renamed from: a.b.c.i.d$a */
    public interface a {
    }

    public C0135d(a aVar) {
        this.f672a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC0271w0) this.f672a).mo513b((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor m920a = ((ViewOnClickListenerC0271w0) this.f672a).m920a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (m920a != null) {
            filterResults.count = m920a.getCount();
            filterResults.values = m920a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f672a;
        Cursor cursor = ((AbstractC0134c) aVar).f664d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC0271w0) aVar).mo511a((Cursor) obj);
    }
}
