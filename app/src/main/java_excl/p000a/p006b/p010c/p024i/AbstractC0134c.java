package p000a.p006b.p010c.p024i;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p000a.p006b.p010c.p024i.C0135d;

/* renamed from: a.b.c.i.c */
/* loaded from: classes.dex */
public abstract class AbstractC0134c extends BaseAdapter implements Filterable, C0135d.a {

    /* renamed from: b */
    public boolean f662b;

    /* renamed from: c */
    public boolean f663c;

    /* renamed from: d */
    public Cursor f664d;

    /* renamed from: e */
    public Context f665e;

    /* renamed from: f */
    public int f666f;

    /* renamed from: g */
    public a f667g;

    /* renamed from: h */
    public DataSetObserver f668h;

    /* renamed from: i */
    public C0135d f669i;

    /* renamed from: a.b.c.i.c$a */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            AbstractC0134c abstractC0134c = AbstractC0134c.this;
            if (!abstractC0134c.f663c || (cursor = abstractC0134c.f664d) == null || cursor.isClosed()) {
                return;
            }
            abstractC0134c.f662b = abstractC0134c.f664d.requery();
        }
    }

    /* renamed from: a.b.c.i.c$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0134c abstractC0134c = AbstractC0134c.this;
            abstractC0134c.f662b = true;
            abstractC0134c.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0134c abstractC0134c = AbstractC0134c.this;
            abstractC0134c.f662b = false;
            abstractC0134c.notifyDataSetInvalidated();
        }
    }

    public AbstractC0134c(Context context, Cursor cursor, boolean z) {
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.f663c = true;
        } else {
            this.f663c = false;
        }
        boolean z2 = cursor != null;
        this.f664d = cursor;
        this.f662b = z2;
        this.f665e = context;
        this.f666f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f667g = new a();
            this.f668h = new b();
        } else {
            this.f667g = null;
            this.f668h = null;
        }
        if (z2) {
            a aVar = this.f667g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f668h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract View mo510a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: a */
    public void mo511a(Cursor cursor) {
        Cursor cursor2 = this.f664d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f667g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f668h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f664d = cursor;
            if (cursor != null) {
                a aVar2 = this.f667g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f668h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f666f = cursor.getColumnIndexOrThrow("_id");
                this.f662b = true;
                notifyDataSetChanged();
            } else {
                this.f666f = -1;
                this.f662b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: a */
    public abstract void mo512a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public abstract CharSequence mo513b(Cursor cursor);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f662b || (cursor = this.f664d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f662b) {
            return null;
        }
        this.f664d.moveToPosition(i);
        if (view == null) {
            AbstractC0137f abstractC0137f = (AbstractC0137f) this;
            view = abstractC0137f.f676l.inflate(abstractC0137f.f675k, viewGroup, false);
        }
        mo512a(view, this.f665e, this.f664d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f669i == null) {
            this.f669i = new C0135d(this);
        }
        return this.f669i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f662b || (cursor = this.f664d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f664d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f662b && (cursor = this.f664d) != null && cursor.moveToPosition(i)) {
            return this.f664d.getLong(this.f666f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f662b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f664d.moveToPosition(i)) {
            if (view == null) {
                view = mo510a(this.f665e, this.f664d, viewGroup);
            }
            mo512a(view, this.f665e, this.f664d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }
}
