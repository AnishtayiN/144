package p000a.p006b.p025d.p035g;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p000a.p006b.p010c.p024i.AbstractC0137f;
import p000a.p006b.p025d.p027b.C0171f;

/* renamed from: a.b.d.g.w0 */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0271w0 extends AbstractC0137f implements View.OnClickListener {

    /* renamed from: m */
    public final SearchView f1513m;

    /* renamed from: n */
    public final SearchableInfo f1514n;

    /* renamed from: o */
    public final Context f1515o;

    /* renamed from: p */
    public final WeakHashMap<String, Drawable.ConstantState> f1516p;

    /* renamed from: q */
    public final int f1517q;

    /* renamed from: r */
    public boolean f1518r;

    /* renamed from: s */
    public int f1519s;

    /* renamed from: t */
    public ColorStateList f1520t;

    /* renamed from: u */
    public int f1521u;

    /* renamed from: v */
    public int f1522v;

    /* renamed from: w */
    public int f1523w;

    /* renamed from: x */
    public int f1524x;

    /* renamed from: y */
    public int f1525y;

    /* renamed from: z */
    public int f1526z;

    /* renamed from: a.b.d.g.w0$a */
    public static final class a {

        /* renamed from: a */
        public final TextView f1527a;

        /* renamed from: b */
        public final TextView f1528b;

        /* renamed from: c */
        public final ImageView f1529c;

        /* renamed from: d */
        public final ImageView f1530d;

        /* renamed from: e */
        public final ImageView f1531e;

        public a(View view) {
            this.f1527a = (TextView) view.findViewById(R.id.text1);
            this.f1528b = (TextView) view.findViewById(R.id.text2);
            this.f1529c = (ImageView) view.findViewById(R.id.icon1);
            this.f1530d = (ImageView) view.findViewById(R.id.icon2);
            this.f1531e = (ImageView) view.findViewById(C0171f.edit_query);
        }
    }

    public ViewOnClickListenerC0271w0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1518r = false;
        this.f1519s = 1;
        this.f1521u = -1;
        this.f1522v = -1;
        this.f1523w = -1;
        this.f1524x = -1;
        this.f1525y = -1;
        this.f1526z = -1;
        this.f1513m = searchView;
        this.f1514n = searchableInfo;
        this.f1517q = searchView.getSuggestionCommitIconResId();
        this.f1515o = context;
        this.f1516p = weakHashMap;
    }

    /* renamed from: a */
    public static String m917a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m918a(Cursor cursor, String str) {
        return m917a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    public Cursor m919a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f665e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: a */
    public Cursor m920a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1513m.getVisibility() == 0 && this.f1513m.getWindowVisibility() == 0) {
            try {
                Cursor m919a = m919a(this.f1514n, charSequence2, 50);
                if (m919a != null) {
                    m919a.getCount();
                    return m919a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public Drawable m921a(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f665e.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0131  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable m922a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.ViewOnClickListenerC0271w0.m922a(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // p000a.p006b.p010c.p024i.AbstractC0137f, p000a.p006b.p010c.p024i.AbstractC0134c
    /* renamed from: a */
    public View mo510a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View mo510a = super.mo510a(context, cursor, viewGroup);
        mo510a.setTag(new a(mo510a));
        ((ImageView) mo510a.findViewById(C0171f.edit_query)).setImageResource(this.f1517q);
        return mo510a;
    }

    /* renamed from: a */
    public void m923a(int i) {
        this.f1519s = i;
    }

    @Override // p000a.p006b.p010c.p024i.AbstractC0134c
    /* renamed from: a */
    public void mo511a(Cursor cursor) {
        if (this.f1518r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo511a(cursor);
            if (cursor != null) {
                this.f1521u = cursor.getColumnIndex("suggest_text_1");
                this.f1522v = cursor.getColumnIndex("suggest_text_2");
                this.f1523w = cursor.getColumnIndex("suggest_text_2_url");
                this.f1524x = cursor.getColumnIndex("suggest_icon_1");
                this.f1525y = cursor.getColumnIndex("suggest_icon_2");
                this.f1526z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
    @Override // p000a.p006b.p010c.p024i.AbstractC0134c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo512a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.ViewOnClickListenerC0271w0.mo512a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // p000a.p006b.p010c.p024i.AbstractC0134c
    /* renamed from: b */
    public CharSequence mo513b(Cursor cursor) {
        String m917a;
        String m917a2;
        if (cursor == null) {
            return null;
        }
        String m917a3 = m917a(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (m917a3 != null) {
            return m917a3;
        }
        if (this.f1514n.shouldRewriteQueryFromData() && (m917a2 = m917a(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return m917a2;
        }
        if (!this.f1514n.shouldRewriteQueryFromText() || (m917a = m917a(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return m917a;
    }

    /* renamed from: c */
    public final void m924c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // p000a.p006b.p010c.p024i.AbstractC0134c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f676l.inflate(this.f675k, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1527a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // p000a.p006b.p010c.p024i.AbstractC0134c, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View mo510a = mo510a(this.f665e, this.f664d, viewGroup);
            if (mo510a != null) {
                ((a) mo510a.getTag()).f1527a.setText(e.toString());
            }
            return mo510a;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m924c(this.f664d);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m924c(this.f664d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1513m.m1064a((CharSequence) tag);
        }
    }
}
