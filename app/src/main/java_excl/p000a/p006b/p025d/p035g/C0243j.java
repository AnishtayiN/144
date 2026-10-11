package p000a.p006b.p025d.p035g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p006b.p008b.p009a.C0026c;
import p000a.p006b.p008b.p009a.C0027d;
import p000a.p006b.p008b.p009a.C0032i;
import p000a.p006b.p010c.p012b.C0067a;
import p000a.p006b.p010c.p014c.C0077a;
import p000a.p006b.p010c.p020g.C0096a;
import p000a.p006b.p010c.p020g.C0099d;
import p000a.p006b.p010c.p020g.C0101f;
import p000a.p006b.p010c.p020g.C0102g;
import p000a.p006b.p010c.p020g.C0105j;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0168c;
import p000a.p006b.p025d.p027b.C0170e;
import p000a.p006b.p025d.p029d.p030a.C0181a;
import p000a.p006b.p025d.p031e.p032a.C0182a;

/* renamed from: a.b.d.g.j */
/* loaded from: classes.dex */
public final class C0243j {

    /* renamed from: h */
    public static C0243j f1318h;

    /* renamed from: a */
    public WeakHashMap<Context, C0105j<ColorStateList>> f1326a;

    /* renamed from: b */
    public C0096a<String, d> f1327b;

    /* renamed from: c */
    public C0105j<String> f1328c;

    /* renamed from: d */
    public final WeakHashMap<Context, C0101f<WeakReference<Drawable.ConstantState>>> f1329d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f1330e;

    /* renamed from: f */
    public boolean f1331f;

    /* renamed from: g */
    public static final PorterDuff.Mode f1317g = PorterDuff.Mode.SRC_IN;

    /* renamed from: i */
    public static final c f1319i = new c(6);

    /* renamed from: j */
    public static final int[] f1320j = {C0170e.abc_textfield_search_default_mtrl_alpha, C0170e.abc_textfield_default_mtrl_alpha, C0170e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: k */
    public static final int[] f1321k = {C0170e.abc_ic_commit_search_api_mtrl_alpha, C0170e.abc_seekbar_tick_mark_material, C0170e.abc_ic_menu_share_mtrl_alpha, C0170e.abc_ic_menu_copy_mtrl_am_alpha, C0170e.abc_ic_menu_cut_mtrl_alpha, C0170e.abc_ic_menu_selectall_mtrl_alpha, C0170e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: l */
    public static final int[] f1322l = {C0170e.abc_textfield_activated_mtrl_alpha, C0170e.abc_textfield_search_activated_mtrl_alpha, C0170e.abc_cab_background_top_mtrl_alpha, C0170e.abc_text_cursor_material, C0170e.abc_text_select_handle_left_mtrl_dark, C0170e.abc_text_select_handle_middle_mtrl_dark, C0170e.abc_text_select_handle_right_mtrl_dark, C0170e.abc_text_select_handle_left_mtrl_light, C0170e.abc_text_select_handle_middle_mtrl_light, C0170e.abc_text_select_handle_right_mtrl_light};

    /* renamed from: m */
    public static final int[] f1323m = {C0170e.abc_popup_background_mtrl_mult, C0170e.abc_cab_background_internal_bg, C0170e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: n */
    public static final int[] f1324n = {C0170e.abc_tab_indicator_material, C0170e.abc_textfield_search_material};

    /* renamed from: o */
    public static final int[] f1325o = {C0170e.abc_btn_check_material, C0170e.abc_btn_radio_material};

    /* renamed from: a.b.d.g.j$a */
    public static class a implements d {
        @Override // p000a.p006b.p025d.p035g.C0243j.d
        /* renamed from: a */
        public Drawable mo857a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0182a.m619a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: a.b.d.g.j$b */
    public static class b implements d {
        @Override // p000a.p006b.p025d.p035g.C0243j.d
        /* renamed from: a */
        public Drawable mo857a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C0026c c0026c = new C0026c(context, null, null);
                c0026c.inflate(resources, xmlPullParser, attributeSet, theme);
                return c0026c;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a.b.d.g.j$c */
    public static class c extends C0102g<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        /* renamed from: a */
        public PorterDuffColorFilter m858a(int i, PorterDuff.Mode mode) {
            return m405a((c) Integer.valueOf(mode.hashCode() + ((i + 31) * 31)));
        }

        /* renamed from: a */
        public PorterDuffColorFilter m859a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m406a((c) Integer.valueOf(mode.hashCode() + ((i + 31) * 31)), (Integer) porterDuffColorFilter);
        }
    }

    /* renamed from: a.b.d.g.j$d */
    public interface d {
        /* renamed from: a */
        Drawable mo857a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: a.b.d.g.j$e */
    public static class e implements d {
        @Override // p000a.p006b.p025d.p035g.C0243j.d
        /* renamed from: a */
        public Drawable mo857a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0032i.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized C0243j m839a() {
        C0243j c0243j;
        synchronized (C0243j.class) {
            if (f1318h == null) {
                f1318h = new C0243j();
                C0243j c0243j2 = f1318h;
                if (Build.VERSION.SDK_INT < 24) {
                    c0243j2.m850a("vector", new e());
                    c0243j2.m850a("animated-vector", new b());
                    c0243j2.m850a("animated-selector", new a());
                }
            }
            c0243j = f1318h;
        }
        return c0243j;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m840a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m858a;
        synchronized (C0243j.class) {
            m858a = f1319i.m858a(i, mode);
            if (m858a == null) {
                m858a = new PorterDuffColorFilter(i, mode);
                f1319i.m859a(i, mode, m858a);
            }
        }
        return m858a;
    }

    /* renamed from: a */
    public static void m841a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0238h0.m827a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1317g;
        }
        drawable.setColorFilter(m840a(i, mode));
    }

    /* renamed from: a */
    public static void m842a(Drawable drawable, C0218a1 c0218a1, int[] iArr) {
        if (C0238h0.m827a(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (c0218a1.f1201d || c0218a1.f1200c) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = c0218a1.f1201d ? c0218a1.f1198a : null;
            PorterDuff.Mode mode = c0218a1.f1200c ? c0218a1.f1199b : f1317g;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = m840a(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0046  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m843a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = p000a.p006b.p025d.p035g.C0243j.f1317g
            int[] r1 = p000a.p006b.p025d.p035g.C0243j.f1320j
            boolean r1 = m844a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L15
            int r2 = p000a.p006b.p025d.p027b.C0166a.colorControlNormal
        L12:
            r7 = 1
            r1 = -1
            goto L44
        L15:
            int[] r1 = p000a.p006b.p025d.p035g.C0243j.f1322l
            boolean r1 = m844a(r1, r7)
            if (r1 == 0) goto L20
            int r2 = p000a.p006b.p025d.p027b.C0166a.colorControlActivated
            goto L12
        L20:
            int[] r1 = p000a.p006b.p025d.p035g.C0243j.f1323m
            boolean r1 = m844a(r1, r7)
            if (r1 == 0) goto L2b
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L12
        L2b:
            int r1 = p000a.p006b.p025d.p027b.C0170e.abc_list_divider_mtrl_alpha
            if (r7 != r1) goto L3c
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L44
        L3c:
            int r1 = p000a.p006b.p025d.p027b.C0170e.abc_dialog_material_background
            if (r7 != r1) goto L41
            goto L12
        L41:
            r7 = 0
            r1 = -1
            r2 = 0
        L44:
            if (r7 == 0) goto L61
            boolean r7 = p000a.p006b.p025d.p035g.C0238h0.m827a(r8)
            if (r7 == 0) goto L50
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L50:
            int r6 = p000a.p006b.p025d.p035g.C0273x0.m941b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m840a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L60
            r8.setAlpha(r1)
        L60:
            return r5
        L61:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p025d.p035g.C0243j.m843a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    public static boolean m844a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final ColorStateList m845a(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList m942c = C0273x0.m942c(context, C0166a.colorSwitchThumbNormal);
        if (m942c == null || !m942c.isStateful()) {
            iArr[0] = C0273x0.f1546b;
            iArr2[0] = C0273x0.m940a(context, C0166a.colorSwitchThumbNormal);
            iArr[1] = C0273x0.f1549e;
            iArr2[1] = C0273x0.m941b(context, C0166a.colorControlActivated);
            iArr[2] = C0273x0.f1550f;
            iArr2[2] = C0273x0.m941b(context, C0166a.colorSwitchThumbNormal);
        } else {
            iArr[0] = C0273x0.f1546b;
            iArr2[0] = m942c.getColorForState(iArr[0], 0);
            iArr[1] = C0273x0.f1549e;
            iArr2[1] = C0273x0.m941b(context, C0166a.colorControlActivated);
            iArr[2] = C0273x0.f1550f;
            iArr2[2] = m942c.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: a */
    public final ColorStateList m846a(Context context, int i) {
        int m941b = C0273x0.m941b(context, C0166a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0273x0.f1546b, C0273x0.f1548d, C0273x0.f1547c, C0273x0.f1550f}, new int[]{C0273x0.m940a(context, C0166a.colorButtonNormal), C0077a.m332a(m941b, i), C0077a.m332a(m941b, i), i});
    }

    /* renamed from: a */
    public synchronized Drawable m847a(Context context, int i, boolean z) {
        Drawable m856e;
        if (!this.f1331f) {
            boolean z2 = true;
            this.f1331f = true;
            Drawable m854c = m854c(context, C0170e.abc_vector_test);
            if (m854c != null) {
                if (!(m854c instanceof C0032i) && !"android.graphics.drawable.VectorDrawable".equals(m854c.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f1331f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        m856e = m856e(context, i);
        if (m856e == null) {
            m856e = m852b(context, i);
        }
        if (m856e == null) {
            m856e = C0067a.m320b(context, i);
        }
        if (m856e != null) {
            m856e = m848a(context, i, z, m856e);
        }
        if (m856e != null) {
            C0238h0.m828b(m856e);
        }
        return m856e;
    }

    /* renamed from: a */
    public final Drawable m848a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m855d = m855d(context, i);
        if (m855d != null) {
            if (C0238h0.m827a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m91b = C0027d.m91b(drawable);
            C0027d.m65a(m91b, m855d);
            PorterDuff.Mode mode = i == C0170e.abc_switch_thumb_material ? PorterDuff.Mode.MULTIPLY : null;
            if (mode == null) {
                return m91b;
            }
            C0027d.m66a(m91b, mode);
            return m91b;
        }
        if (i == C0170e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m841a(layerDrawable.findDrawableByLayerId(R.id.background), C0273x0.m941b(context, C0166a.colorControlNormal), f1317g);
            m841a(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), C0273x0.m941b(context, C0166a.colorControlNormal), f1317g);
            m841a(layerDrawable.findDrawableByLayerId(R.id.progress), C0273x0.m941b(context, C0166a.colorControlActivated), f1317g);
            return drawable;
        }
        if (i != C0170e.abc_ratingbar_material && i != C0170e.abc_ratingbar_indicator_material && i != C0170e.abc_ratingbar_small_material) {
            if (m843a(context, i, drawable) || !z) {
                return drawable;
            }
            return null;
        }
        LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
        m841a(layerDrawable2.findDrawableByLayerId(R.id.background), C0273x0.m940a(context, C0166a.colorControlNormal), f1317g);
        m841a(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), C0273x0.m941b(context, C0166a.colorControlActivated), f1317g);
        m841a(layerDrawable2.findDrawableByLayerId(R.id.progress), C0273x0.m941b(context, C0166a.colorControlActivated), f1317g);
        return drawable;
    }

    /* renamed from: a */
    public final synchronized Drawable m849a(Context context, long j) {
        C0101f<WeakReference<Drawable.ConstantState>> c0101f = this.f1329d.get(context);
        if (c0101f == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m403b = c0101f.m403b(j, null);
        if (m403b != null) {
            Drawable.ConstantState constantState = m403b.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int m396a = C0099d.m396a(c0101f.f551c, c0101f.f553e, j);
            if (m396a >= 0) {
                Object[] objArr = c0101f.f552d;
                Object obj = objArr[m396a];
                Object obj2 = C0101f.f549f;
                if (obj != obj2) {
                    objArr[m396a] = obj2;
                    c0101f.f550b = true;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m850a(String str, d dVar) {
        if (this.f1327b == null) {
            this.f1327b = new C0096a<>();
        }
        this.f1327b.put(str, dVar);
    }

    /* renamed from: a */
    public final synchronized boolean m851a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0101f<WeakReference<Drawable.ConstantState>> c0101f = this.f1329d.get(context);
        if (c0101f == null) {
            c0101f = new C0101f<>();
            this.f1329d.put(context, c0101f);
        }
        c0101f.m404c(j, new WeakReference<>(constantState));
        return true;
    }

    /* renamed from: b */
    public final Drawable m852b(Context context, int i) {
        if (this.f1330e == null) {
            this.f1330e = new TypedValue();
        }
        TypedValue typedValue = this.f1330e;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m849a = m849a(context, j);
        if (m849a != null) {
            return m849a;
        }
        if (i == C0170e.abc_cab_background_top_material) {
            m849a = new LayerDrawable(new Drawable[]{m854c(context, C0170e.abc_cab_background_internal_bg), m854c(context, C0170e.abc_cab_background_top_mtrl_alpha)});
        }
        if (m849a != null) {
            m849a.setChangingConfigurations(typedValue.changingConfigurations);
            m851a(context, j, m849a);
        }
        return m849a;
    }

    /* renamed from: b */
    public synchronized void m853b(Context context) {
        C0101f<WeakReference<Drawable.ConstantState>> c0101f = this.f1329d.get(context);
        if (c0101f != null) {
            int i = c0101f.f553e;
            Object[] objArr = c0101f.f552d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            c0101f.f553e = 0;
            c0101f.f550b = false;
        }
    }

    /* renamed from: c */
    public synchronized Drawable m854c(Context context, int i) {
        return m847a(context, i, false);
    }

    /* renamed from: d */
    public synchronized ColorStateList m855d(Context context, int i) {
        ColorStateList colorStateList;
        C0105j<ColorStateList> c0105j;
        WeakHashMap<Context, C0105j<ColorStateList>> weakHashMap = this.f1326a;
        colorStateList = null;
        if (weakHashMap != null && (c0105j = weakHashMap.get(context)) != null) {
            colorStateList = c0105j.m426b(i, null);
        }
        if (colorStateList == null) {
            if (i == C0170e.abc_edit_text_material) {
                colorStateList = C0181a.m617b(context, C0168c.abc_tint_edittext);
            } else if (i == C0170e.abc_switch_track_mtrl_alpha) {
                colorStateList = C0181a.m617b(context, C0168c.abc_tint_switch_track);
            } else if (i == C0170e.abc_switch_thumb_material) {
                colorStateList = m845a(context);
            } else if (i == C0170e.abc_btn_default_mtrl_shape) {
                colorStateList = m846a(context, C0273x0.m941b(context, C0166a.colorButtonNormal));
            } else if (i == C0170e.abc_btn_borderless_material) {
                colorStateList = m846a(context, 0);
            } else if (i == C0170e.abc_btn_colored_material) {
                colorStateList = m846a(context, C0273x0.m941b(context, C0166a.colorAccent));
            } else {
                if (i != C0170e.abc_spinner_mtrl_am_alpha && i != C0170e.abc_spinner_textfield_background_material) {
                    if (m844a(f1321k, i)) {
                        colorStateList = C0273x0.m942c(context, C0166a.colorControlNormal);
                    } else if (m844a(f1324n, i)) {
                        colorStateList = C0181a.m617b(context, C0168c.abc_tint_default);
                    } else if (m844a(f1325o, i)) {
                        colorStateList = C0181a.m617b(context, C0168c.abc_tint_btn_checkable);
                    } else if (i == C0170e.abc_seekbar_thumb_material) {
                        colorStateList = C0181a.m617b(context, C0168c.abc_tint_seek_thumb);
                    }
                }
                colorStateList = C0181a.m617b(context, C0168c.abc_tint_spinner);
            }
            if (colorStateList != null) {
                if (this.f1326a == null) {
                    this.f1326a = new WeakHashMap<>();
                }
                C0105j<ColorStateList> c0105j2 = this.f1326a.get(context);
                if (c0105j2 == null) {
                    c0105j2 = new C0105j<>(10);
                    this.f1326a.put(context, c0105j2);
                }
                c0105j2.m423a(i, colorStateList);
            }
        }
        return colorStateList;
    }

    /* renamed from: e */
    public final Drawable m856e(Context context, int i) {
        int next;
        C0096a<String, d> c0096a = this.f1327b;
        if (c0096a == null || c0096a.isEmpty()) {
            return null;
        }
        C0105j<String> c0105j = this.f1328c;
        if (c0105j != null) {
            String m426b = c0105j.m426b(i, null);
            if ("appcompat_skip_skip".equals(m426b) || (m426b != null && this.f1327b.get(m426b) == null)) {
                return null;
            }
        } else {
            this.f1328c = new C0105j<>(10);
        }
        if (this.f1330e == null) {
            this.f1330e = new TypedValue();
        }
        TypedValue typedValue = this.f1330e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m849a = m849a(context, j);
        if (m849a != null) {
            return m849a;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1328c.m423a(i, name);
                d dVar = this.f1327b.get(name);
                if (dVar != null) {
                    m849a = dVar.mo857a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m849a != null) {
                    m849a.setChangingConfigurations(typedValue.changingConfigurations);
                    m851a(context, j, m849a);
                }
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManag", "Exception while inflating drawable", e2);
            }
        }
        if (m849a == null) {
            this.f1328c.m423a(i, "appcompat_skip_skip");
        }
        return m849a;
    }
}
