package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p010c.p021h.AbstractC0106a;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p010c.p024i.AbstractC0134c;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0169d;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p027b.C0172g;
import p000a.p006b.p025d.p027b.C0173h;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.InterfaceC0187b;
import p000a.p006b.p025d.p035g.C0224c1;
import p000a.p006b.p025d.p035g.C0225d;
import p000a.p006b.p025d.p035g.C0242i1;
import p000a.p006b.p025d.p035g.C0249l0;
import p000a.p006b.p025d.p035g.ViewOnClickListenerC0271w0;
import p038c.p039a.p040a.p041a.C0335a;

/* loaded from: classes.dex */
public class SearchView extends C0249l0 implements InterfaceC0187b {

    /* renamed from: o0 */
    public static final C0317k f1865o0 = new C0317k();

    /* renamed from: A */
    public Rect f1866A;

    /* renamed from: B */
    public Rect f1867B;

    /* renamed from: C */
    public int[] f1868C;

    /* renamed from: D */
    public int[] f1869D;

    /* renamed from: E */
    public final ImageView f1870E;

    /* renamed from: F */
    public final Drawable f1871F;

    /* renamed from: G */
    public final int f1872G;

    /* renamed from: H */
    public final int f1873H;

    /* renamed from: I */
    public final Intent f1874I;

    /* renamed from: J */
    public final Intent f1875J;

    /* renamed from: K */
    public final CharSequence f1876K;

    /* renamed from: L */
    public View.OnFocusChangeListener f1877L;

    /* renamed from: M */
    public View.OnClickListener f1878M;

    /* renamed from: N */
    public boolean f1879N;

    /* renamed from: O */
    public boolean f1880O;

    /* renamed from: P */
    public AbstractC0134c f1881P;

    /* renamed from: Q */
    public boolean f1882Q;

    /* renamed from: R */
    public CharSequence f1883R;

    /* renamed from: S */
    public boolean f1884S;

    /* renamed from: T */
    public boolean f1885T;

    /* renamed from: U */
    public int f1886U;

    /* renamed from: V */
    public boolean f1887V;

    /* renamed from: W */
    public CharSequence f1888W;

    /* renamed from: a0 */
    public CharSequence f1889a0;

    /* renamed from: b0 */
    public boolean f1890b0;

    /* renamed from: c0 */
    public int f1891c0;

    /* renamed from: d0 */
    public SearchableInfo f1892d0;

    /* renamed from: e0 */
    public Bundle f1893e0;

    /* renamed from: f0 */
    public final Runnable f1894f0;

    /* renamed from: g0 */
    public Runnable f1895g0;

    /* renamed from: h0 */
    public final WeakHashMap<String, Drawable.ConstantState> f1896h0;

    /* renamed from: i0 */
    public final View.OnClickListener f1897i0;

    /* renamed from: j0 */
    public View.OnKeyListener f1898j0;

    /* renamed from: k0 */
    public final TextView.OnEditorActionListener f1899k0;

    /* renamed from: l0 */
    public final AdapterView.OnItemClickListener f1900l0;

    /* renamed from: m0 */
    public final AdapterView.OnItemSelectedListener f1901m0;

    /* renamed from: n0 */
    public TextWatcher f1902n0;

    /* renamed from: q */
    public final SearchAutoComplete f1903q;

    /* renamed from: r */
    public final View f1904r;

    /* renamed from: s */
    public final View f1905s;

    /* renamed from: t */
    public final View f1906t;

    /* renamed from: u */
    public final ImageView f1907u;

    /* renamed from: v */
    public final ImageView f1908v;

    /* renamed from: w */
    public final ImageView f1909w;

    /* renamed from: x */
    public final ImageView f1910x;

    /* renamed from: y */
    public final View f1911y;

    /* renamed from: z */
    public C0322p f1912z;

    public static class SearchAutoComplete extends C0225d {

        /* renamed from: e */
        public int f1913e;

        /* renamed from: f */
        public SearchView f1914f;

        /* renamed from: g */
        public boolean f1915g;

        /* renamed from: h */
        public final Runnable f1916h;

        /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete$a */
        public class RunnableC0306a implements Runnable {
            public RunnableC0306a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m1087b();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0166a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1916h = new RunnableC0306a();
            this.f1913e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: a */
        public boolean m1086a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: b */
        public void m1087b() {
            if (this.f1915g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1915g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1913e <= 0 || super.enoughToFilter();
        }

        @Override // p000a.p006b.p025d.p035g.C0225d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1915g) {
                removeCallbacks(this.f1916h);
                post(this.f1916h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1914f.m1080n();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1914f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            Method method;
            super.onWindowFocusChanged(z);
            if (z && this.f1914f.hasFocus() && getVisibility() == 0) {
                this.f1915g = true;
                if (!SearchView.m1060a(getContext()) || (method = SearchView.f1865o0.f1930c) == null) {
                    return;
                }
                try {
                    method.invoke(this, true);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1915g = false;
                removeCallbacks(this.f1916h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f1915g = true;
                    return;
                }
                this.f1915g = false;
                removeCallbacks(this.f1916h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1914f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1913e = i;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    public class C0307a implements TextWatcher {
        public C0307a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.m1068b(charSequence);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public class RunnableC0308b implements Runnable {
        public RunnableC0308b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m1083q();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public class RunnableC0309c implements Runnable {
        public RunnableC0309c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0134c abstractC0134c = SearchView.this.f1881P;
            if (abstractC0134c == null || !(abstractC0134c instanceof ViewOnClickListenerC0271w0)) {
                return;
            }
            abstractC0134c.mo511a(null);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public class ViewOnFocusChangeListenerC0310d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0310d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1877L;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    public class ViewOnLayoutChangeListenerC0311e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0311e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.m1073g();
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$f */
    public class ViewOnClickListenerC0312f implements View.OnClickListener {
        public ViewOnClickListenerC0312f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1907u) {
                searchView.m1078l();
                return;
            }
            if (view == searchView.f1909w) {
                searchView.m1077k();
                return;
            }
            if (view == searchView.f1908v) {
                searchView.m1079m();
            } else if (view == searchView.f1910x) {
                searchView.m1081o();
            } else if (view == searchView.f1903q) {
                searchView.m1074h();
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$g */
    public class ViewOnKeyListenerC0313g implements View.OnKeyListener {
        public ViewOnKeyListenerC0313g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1892d0 == null) {
                return false;
            }
            if (searchView.f1903q.isPopupShowing() && SearchView.this.f1903q.getListSelection() != -1) {
                return SearchView.this.m1067a(i, keyEvent);
            }
            if (SearchView.this.f1903q.m1086a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m1063a(0, null, searchView2.f1903q.getText().toString());
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$h */
    public class C0314h implements TextView.OnEditorActionListener {
        public C0314h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.m1079m();
            return true;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$i */
    public class C0315i implements AdapterView.OnItemClickListener {
        public C0315i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m1071c(i);
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$j */
    public class C0316j implements AdapterView.OnItemSelectedListener {
        public C0316j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.m1072d(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$k */
    public static class C0317k {

        /* renamed from: a */
        public Method f1928a;

        /* renamed from: b */
        public Method f1929b;

        /* renamed from: c */
        public Method f1930c;

        public C0317k() {
            try {
                this.f1928a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1928a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f1929b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1929b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f1930c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1930c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$l */
    public interface InterfaceC0318l {
    }

    /* renamed from: android.support.v7.widget.SearchView$m */
    public interface InterfaceC0319m {
    }

    /* renamed from: android.support.v7.widget.SearchView$n */
    public interface InterfaceC0320n {
    }

    /* renamed from: android.support.v7.widget.SearchView$o */
    public static class C0321o extends AbstractC0106a {
        public static final Parcelable.Creator<C0321o> CREATOR = new a();

        /* renamed from: d */
        public boolean f1931d;

        /* renamed from: android.support.v7.widget.SearchView$o$a */
        public static class a implements Parcelable.ClassLoaderCreator<C0321o> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0321o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0321o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0321o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0321o[i];
            }
        }

        public C0321o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1931d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public C0321o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m1134a = C0335a.m1134a("SearchView.SavedState{");
            m1134a.append(Integer.toHexString(System.identityHashCode(this)));
            m1134a.append(" isIconified=");
            m1134a.append(this.f1931d);
            m1134a.append("}");
            return m1134a.toString();
        }

        @Override // p000a.p006b.p010c.p021h.AbstractC0106a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f589b, i);
            parcel.writeValue(Boolean.valueOf(this.f1931d));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$p */
    public static class C0322p extends TouchDelegate {

        /* renamed from: a */
        public final View f1932a;

        /* renamed from: b */
        public final Rect f1933b;

        /* renamed from: c */
        public final Rect f1934c;

        /* renamed from: d */
        public final Rect f1935d;

        /* renamed from: e */
        public final int f1936e;

        /* renamed from: f */
        public boolean f1937f;

        public C0322p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1936e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1933b = new Rect();
            this.f1935d = new Rect();
            this.f1934c = new Rect();
            m1088a(rect, rect2);
            this.f1932a = view;
        }

        /* renamed from: a */
        public void m1088a(Rect rect, Rect rect2) {
            this.f1933b.set(rect);
            this.f1935d.set(rect);
            Rect rect3 = this.f1935d;
            int i = this.f1936e;
            rect3.inset(-i, -i);
            this.f1934c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z2 = true;
            if (action == 0) {
                if (this.f1933b.contains(x, y)) {
                    this.f1937f = true;
                    z = true;
                }
                z = false;
            } else if (action == 1 || action == 2) {
                z = this.f1937f;
                if (z && !this.f1935d.contains(x, y)) {
                    z2 = false;
                }
            } else {
                if (action == 3) {
                    z = this.f1937f;
                    this.f1937f = false;
                }
                z = false;
            }
            if (!z) {
                return false;
            }
            if (!z2 || this.f1934c.contains(x, y)) {
                Rect rect = this.f1934c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.f1932a.getWidth() / 2, this.f1932a.getHeight() / 2);
            }
            return this.f1932a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0166a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1866A = new Rect();
        this.f1867B = new Rect();
        this.f1868C = new int[2];
        this.f1869D = new int[2];
        this.f1894f0 = new RunnableC0308b();
        this.f1895g0 = new RunnableC0309c();
        this.f1896h0 = new WeakHashMap<>();
        this.f1897i0 = new ViewOnClickListenerC0312f();
        this.f1898j0 = new ViewOnKeyListenerC0313g();
        this.f1899k0 = new C0314h();
        this.f1900l0 = new C0315i();
        this.f1901m0 = new C0316j();
        this.f1902n0 = new C0307a();
        C0224c1 c0224c1 = new C0224c1(context, context.obtainStyledAttributes(attributeSet, C0175j.SearchView, i, 0));
        LayoutInflater.from(context).inflate(c0224c1.m788f(C0175j.SearchView_layout, C0172g.abc_search_view), (ViewGroup) this, true);
        this.f1903q = (SearchAutoComplete) findViewById(C0171f.search_src_text);
        this.f1903q.setSearchView(this);
        this.f1904r = findViewById(C0171f.search_edit_frame);
        this.f1905s = findViewById(C0171f.search_plate);
        this.f1906t = findViewById(C0171f.submit_area);
        this.f1907u = (ImageView) findViewById(C0171f.search_button);
        this.f1908v = (ImageView) findViewById(C0171f.search_go_btn);
        this.f1909w = (ImageView) findViewById(C0171f.search_close_btn);
        this.f1910x = (ImageView) findViewById(C0171f.search_voice_btn);
        this.f1870E = (ImageView) findViewById(C0171f.search_mag_icon);
        C0119n.m461a(this.f1905s, c0224c1.m781b(C0175j.SearchView_queryBackground));
        C0119n.m461a(this.f1906t, c0224c1.m781b(C0175j.SearchView_submitBackground));
        this.f1907u.setImageDrawable(c0224c1.m781b(C0175j.SearchView_searchIcon));
        this.f1908v.setImageDrawable(c0224c1.m781b(C0175j.SearchView_goIcon));
        this.f1909w.setImageDrawable(c0224c1.m781b(C0175j.SearchView_closeIcon));
        this.f1910x.setImageDrawable(c0224c1.m781b(C0175j.SearchView_voiceIcon));
        this.f1870E.setImageDrawable(c0224c1.m781b(C0175j.SearchView_searchIcon));
        this.f1871F = c0224c1.m781b(C0175j.SearchView_searchHintIcon);
        C0027d.m69a((View) this.f1907u, (CharSequence) getResources().getString(C0173h.abc_searchview_description_search));
        this.f1872G = c0224c1.m788f(C0175j.SearchView_suggestionRowLayout, C0172g.abc_search_dropdown_item_icons_2line);
        this.f1873H = c0224c1.m788f(C0175j.SearchView_commitIcon, 0);
        this.f1907u.setOnClickListener(this.f1897i0);
        this.f1909w.setOnClickListener(this.f1897i0);
        this.f1908v.setOnClickListener(this.f1897i0);
        this.f1910x.setOnClickListener(this.f1897i0);
        this.f1903q.setOnClickListener(this.f1897i0);
        this.f1903q.addTextChangedListener(this.f1902n0);
        this.f1903q.setOnEditorActionListener(this.f1899k0);
        this.f1903q.setOnItemClickListener(this.f1900l0);
        this.f1903q.setOnItemSelectedListener(this.f1901m0);
        this.f1903q.setOnKeyListener(this.f1898j0);
        this.f1903q.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0310d());
        setIconifiedByDefault(c0224c1.m779a(C0175j.SearchView_iconifiedByDefault, true));
        int m782c = c0224c1.m782c(C0175j.SearchView_android_maxWidth, -1);
        if (m782c != -1) {
            setMaxWidth(m782c);
        }
        this.f1876K = c0224c1.m785d(C0175j.SearchView_defaultQueryHint);
        this.f1883R = c0224c1.m785d(C0175j.SearchView_queryHint);
        int m784d = c0224c1.m784d(C0175j.SearchView_android_imeOptions, -1);
        if (m784d != -1) {
            setImeOptions(m784d);
        }
        int m784d2 = c0224c1.m784d(C0175j.SearchView_android_inputType, -1);
        if (m784d2 != -1) {
            setInputType(m784d2);
        }
        setFocusable(c0224c1.m779a(C0175j.SearchView_android_focusable, true));
        c0224c1.f1236b.recycle();
        this.f1874I = new Intent("android.speech.action.WEB_SEARCH");
        this.f1874I.addFlags(268435456);
        this.f1874I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f1875J = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1875J.addFlags(268435456);
        this.f1911y = findViewById(this.f1903q.getDropDownAnchor());
        View view = this.f1911y;
        if (view != null) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0311e());
        }
        m1069b(this.f1879N);
        m1084r();
    }

    /* renamed from: a */
    public static boolean m1060a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0169d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0169d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1903q.setText(charSequence);
        this.f1903q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: a */
    public final Intent m1061a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1893e0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    public final Intent m1062a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1889a0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1893e0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1892d0.getSearchActivity());
        return intent;
    }

    @Override // p000a.p006b.p025d.p033f.InterfaceC0187b
    /* renamed from: a */
    public void mo644a() {
        if (this.f1890b0) {
            return;
        }
        this.f1890b0 = true;
        this.f1891c0 = this.f1903q.getImeOptions();
        this.f1903q.setImeOptions(this.f1891c0 | 33554432);
        this.f1903q.setText("");
        setIconified(false);
    }

    /* renamed from: a */
    public void m1063a(int i, String str, String str2) {
        getContext().startActivity(m1062a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* renamed from: a */
    public void m1064a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void m1065a(CharSequence charSequence, boolean z) {
        this.f1903q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1903q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1889a0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m1079m();
    }

    /* renamed from: a */
    public final void m1066a(boolean z) {
        this.f1908v.setVisibility((this.f1882Q && m1076j() && hasFocus() && (z || !this.f1887V)) ? 0 : 8);
    }

    /* renamed from: a */
    public boolean m1067a(int i, KeyEvent keyEvent) {
        if (this.f1892d0 != null && this.f1881P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return m1071c(this.f1903q.getListSelection());
            }
            if (i == 21 || i == 22) {
                this.f1903q.setSelection(i == 21 ? 0 : this.f1903q.length());
                this.f1903q.setListSelection(0);
                this.f1903q.clearListSelection();
                C0317k c0317k = f1865o0;
                SearchAutoComplete searchAutoComplete = this.f1903q;
                Method method = c0317k.f1930c;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, true);
                    } catch (Exception unused) {
                    }
                }
                return true;
            }
            if (i != 19 || this.f1903q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    @Override // p000a.p006b.p025d.p033f.InterfaceC0187b
    /* renamed from: b */
    public void mo645b() {
        m1065a("", false);
        clearFocus();
        m1069b(true);
        this.f1903q.setImeOptions(this.f1891c0);
        this.f1890b0 = false;
    }

    /* renamed from: b */
    public void m1068b(CharSequence charSequence) {
        Editable text = this.f1903q.getText();
        this.f1889a0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m1066a(z);
        m1070c(!z);
        m1082p();
        m1085s();
        this.f1888W = charSequence.toString();
    }

    /* renamed from: b */
    public final void m1069b(boolean z) {
        this.f1880O = z;
        int i = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1903q.getText());
        this.f1907u.setVisibility(i);
        m1066a(z2);
        this.f1904r.setVisibility(z ? 8 : 0);
        this.f1870E.setVisibility((this.f1870E.getDrawable() == null || this.f1879N) ? 8 : 0);
        m1082p();
        m1070c(!z2);
        m1085s();
    }

    /* renamed from: c */
    public final void m1070c(boolean z) {
        int i;
        if (this.f1887V && !m1075i() && z) {
            i = 0;
            this.f1908v.setVisibility(8);
        } else {
            i = 8;
        }
        this.f1910x.setVisibility(i);
    }

    /* renamed from: c */
    public boolean m1071c(int i) {
        int i2;
        String m917a;
        Cursor cursor = this.f1881P.f664d;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                String m918a = ViewOnClickListenerC0271w0.m918a(cursor, "suggest_intent_action");
                if (m918a == null) {
                    m918a = this.f1892d0.getSuggestIntentAction();
                }
                if (m918a == null) {
                    m918a = "android.intent.action.SEARCH";
                }
                String str = m918a;
                String m917a2 = ViewOnClickListenerC0271w0.m917a(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (m917a2 == null) {
                    m917a2 = this.f1892d0.getSuggestIntentData();
                }
                if (m917a2 != null && (m917a = ViewOnClickListenerC0271w0.m917a(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    m917a2 = m917a2 + "/" + Uri.encode(m917a);
                }
                intent = m1062a(str, m917a2 == null ? null : Uri.parse(m917a2), ViewOnClickListenerC0271w0.m917a(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ViewOnClickListenerC0271w0.m917a(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        this.f1903q.setImeVisibility(false);
        this.f1903q.dismissDropDown();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1885T = true;
        super.clearFocus();
        this.f1903q.clearFocus();
        this.f1903q.setImeVisibility(false);
        this.f1885T = false;
    }

    /* renamed from: d */
    public boolean m1072d(int i) {
        Editable text = this.f1903q.getText();
        Cursor cursor = this.f1881P.f664d;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return true;
        }
        CharSequence mo513b = this.f1881P.mo513b(cursor);
        if (mo513b != null) {
            setQuery(mo513b);
            return true;
        }
        setQuery(text);
        return true;
    }

    /* renamed from: g */
    public void m1073g() {
        if (this.f1911y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1905s.getPaddingLeft();
            Rect rect = new Rect();
            boolean m837a = C0242i1.m837a(this);
            int dimensionPixelSize = this.f1879N ? resources.getDimensionPixelSize(C0169d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C0169d.abc_dropdownitem_icon_width) : 0;
            this.f1903q.getDropDownBackground().getPadding(rect);
            this.f1903q.setDropDownHorizontalOffset(m837a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f1903q.setDropDownWidth((((this.f1911y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public int getImeOptions() {
        return this.f1903q.getImeOptions();
    }

    public int getInputType() {
        return this.f1903q.getInputType();
    }

    public int getMaxWidth() {
        return this.f1886U;
    }

    public CharSequence getQuery() {
        return this.f1903q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1883R;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1892d0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f1876K : getContext().getText(this.f1892d0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f1873H;
    }

    public int getSuggestionRowLayout() {
        return this.f1872G;
    }

    public AbstractC0134c getSuggestionsAdapter() {
        return this.f1881P;
    }

    /* renamed from: h */
    public void m1074h() {
        C0317k c0317k = f1865o0;
        SearchAutoComplete searchAutoComplete = this.f1903q;
        Method method = c0317k.f1928a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C0317k c0317k2 = f1865o0;
        SearchAutoComplete searchAutoComplete2 = this.f1903q;
        Method method2 = c0317k2.f1929b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: i */
    public boolean m1075i() {
        return this.f1880O;
    }

    /* renamed from: j */
    public final boolean m1076j() {
        return (this.f1882Q || this.f1887V) && !m1075i();
    }

    /* renamed from: k */
    public void m1077k() {
        if (!TextUtils.isEmpty(this.f1903q.getText())) {
            this.f1903q.setText("");
            this.f1903q.requestFocus();
            this.f1903q.setImeVisibility(true);
        } else if (this.f1879N) {
            clearFocus();
            m1069b(true);
        }
    }

    /* renamed from: l */
    public void m1078l() {
        m1069b(false);
        this.f1903q.requestFocus();
        this.f1903q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1878M;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: m */
    public void m1079m() {
        Editable text = this.f1903q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f1892d0 != null) {
            m1063a(0, null, text.toString());
        }
        this.f1903q.setImeVisibility(false);
        this.f1903q.dismissDropDown();
    }

    /* renamed from: n */
    public void m1080n() {
        m1069b(m1075i());
        post(this.f1894f0);
        if (this.f1903q.hasFocus()) {
            m1074h();
        }
    }

    /* renamed from: o */
    public void m1081o() {
        SearchableInfo searchableInfo = this.f1892d0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m1061a(this.f1875J, searchableInfo));
                }
            } else {
                Intent intent = new Intent(this.f1874I);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1894f0);
        post(this.f1895g0);
        super.onDetachedFromWindow();
    }

    @Override // p000a.p006b.p025d.p035g.C0249l0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1350e == 1) {
            m869b(i, i2, i3, i4);
        } else {
            m864a(i, i2, i3, i4);
        }
        if (z) {
            SearchAutoComplete searchAutoComplete = this.f1903q;
            Rect rect = this.f1866A;
            searchAutoComplete.getLocationInWindow(this.f1868C);
            getLocationInWindow(this.f1869D);
            int[] iArr = this.f1868C;
            int i5 = iArr[1];
            int[] iArr2 = this.f1869D;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.f1867B;
            Rect rect3 = this.f1866A;
            rect2.set(rect3.left, 0, rect3.right, i4 - i2);
            C0322p c0322p = this.f1912z;
            if (c0322p != null) {
                c0322p.m1088a(this.f1867B, this.f1866A);
            } else {
                this.f1912z = new C0322p(this.f1867B, this.f1866A, this.f1903q);
                setTouchDelegate(this.f1912z);
            }
        }
    }

    @Override // p000a.p006b.p025d.p035g.C0249l0, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (m1075i()) {
            if (this.f1350e == 1) {
                m876d(i, i2);
                return;
            } else {
                m874c(i, i2);
                return;
            }
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1886U;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1886U;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1886U) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0321o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0321o c0321o = (C0321o) parcelable;
        super.onRestoreInstanceState(c0321o.f589b);
        m1069b(c0321o.f1931d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0321o c0321o = new C0321o(super.onSaveInstanceState());
        c0321o.f1931d = m1075i();
        return c0321o;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.f1894f0);
    }

    /* renamed from: p */
    public final void m1082p() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1903q.getText());
        if (!z2 && (!this.f1879N || this.f1890b0)) {
            z = false;
        }
        this.f1909w.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f1909w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: q */
    public void m1083q() {
        int[] iArr = this.f1903q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1905s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1906t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: r */
    public final void m1084r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1903q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.f1879N && this.f1871F != null) {
            double textSize = this.f1903q.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i = (int) (textSize * 1.25d);
            this.f1871F.setBounds(0, 0, i, i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f1871F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.f1885T || !isFocusable()) {
            return false;
        }
        if (m1075i()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1903q.requestFocus(i, rect);
        if (requestFocus) {
            m1069b(false);
        }
        return requestFocus;
    }

    /* renamed from: s */
    public final void m1085s() {
        this.f1906t.setVisibility((m1076j() && (this.f1908v.getVisibility() == 0 || this.f1910x.getVisibility() == 0)) ? 0 : 8);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1893e0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m1077k();
        } else {
            m1078l();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1879N == z) {
            return;
        }
        this.f1879N = z;
        m1069b(z);
        m1084r();
    }

    public void setImeOptions(int i) {
        this.f1903q.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1903q.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1886U = i;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0318l interfaceC0318l) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1877L = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0319m interfaceC0319m) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1878M = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0320n interfaceC0320n) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1883R = charSequence;
        m1084r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1884S = z;
        AbstractC0134c abstractC0134c = this.f1881P;
        if (abstractC0134c instanceof ViewOnClickListenerC0271w0) {
            ((ViewOnClickListenerC0271w0) abstractC0134c).f1519s = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f1892d0 = r7
            android.app.SearchableInfo r7 = r6.f1892d0
            r0 = 1
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = 0
            if (r7 == 0) goto L73
            android.support.v7.widget.SearchView$SearchAutoComplete r3 = r6.f1903q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            android.support.v7.widget.SearchView$SearchAutoComplete r7 = r6.f1903q
            android.app.SearchableInfo r3 = r6.f1892d0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f1892d0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L38
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f1892d0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L38
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L38:
            android.support.v7.widget.SearchView$SearchAutoComplete r3 = r6.f1903q
            r3.setInputType(r7)
            a.b.c.i.c r7 = r6.f1881P
            if (r7 == 0) goto L44
            r7.mo511a(r2)
        L44:
            android.app.SearchableInfo r7 = r6.f1892d0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L70
            a.b.d.g.w0 r7 = new a.b.d.g.w0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f1892d0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f1896h0
            r7.<init>(r3, r6, r4, r5)
            r6.f1881P = r7
            android.support.v7.widget.SearchView$SearchAutoComplete r7 = r6.f1903q
            a.b.c.i.c r3 = r6.f1881P
            r7.setAdapter(r3)
            a.b.c.i.c r7 = r6.f1881P
            a.b.d.g.w0 r7 = (p000a.p006b.p025d.p035g.ViewOnClickListenerC0271w0) r7
            boolean r3 = r6.f1884S
            if (r3 == 0) goto L6c
            r3 = 2
            goto L6d
        L6c:
            r3 = 1
        L6d:
            r7.m923a(r3)
        L70:
            r6.m1084r()
        L73:
            android.app.SearchableInfo r7 = r6.f1892d0
            r3 = 0
            if (r7 == 0) goto La4
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto La4
            android.app.SearchableInfo r7 = r6.f1892d0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L89
            android.content.Intent r2 = r6.f1874I
            goto L93
        L89:
            android.app.SearchableInfo r7 = r6.f1892d0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L93
            android.content.Intent r2 = r6.f1875J
        L93:
            if (r2 == 0) goto La4
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto La4
            goto La5
        La4:
            r0 = 0
        La5:
            r6.f1887V = r0
            boolean r7 = r6.f1887V
            if (r7 == 0) goto Lb2
            android.support.v7.widget.SearchView$SearchAutoComplete r7 = r6.f1903q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lb2:
            boolean r7 = r6.m1075i()
            r6.m1069b(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1882Q = z;
        m1069b(m1075i());
    }

    public void setSuggestionsAdapter(AbstractC0134c abstractC0134c) {
        this.f1881P = abstractC0134c;
        this.f1903q.setAdapter(this.f1881P);
    }
}
