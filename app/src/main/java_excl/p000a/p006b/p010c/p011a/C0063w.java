package p000a.p006b.p010c.p011a;

import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p000a.p006b.p010c.p011a.C0064x;
import p000a.p006b.p010c.p011a.ComponentCallbacksC0041e;
import p000a.p006b.p010c.p020g.AbstractC0103h;
import p000a.p006b.p010c.p020g.C0096a;
import p000a.p006b.p010c.p021h.C0119n;

/* renamed from: a.b.c.a.w */
/* loaded from: classes.dex */
public class C0063w {

    /* renamed from: a */
    public static final int[] f402a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b */
    public static final AbstractC0036b0 f403b;

    /* renamed from: c */
    public static final AbstractC0036b0 f404c;

    /* renamed from: a.b.c.a.w$a */
    public static class a {

        /* renamed from: a */
        public ComponentCallbacksC0041e f405a;

        /* renamed from: b */
        public boolean f406b;

        /* renamed from: c */
        public C0035b f407c;

        /* renamed from: d */
        public ComponentCallbacksC0041e f408d;

        /* renamed from: e */
        public boolean f409e;

        /* renamed from: f */
        public C0035b f410f;
    }

    static {
        AbstractC0036b0 abstractC0036b0;
        f403b = Build.VERSION.SDK_INT >= 21 ? new C0064x() : null;
        try {
            abstractC0036b0 = (AbstractC0036b0) Class.forName("android.support.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC0036b0 = null;
        }
        f404c = abstractC0036b0;
    }

    /* renamed from: a */
    public static AbstractC0036b0 m301a(ComponentCallbacksC0041e componentCallbacksC0041e, ComponentCallbacksC0041e componentCallbacksC0041e2) {
        Object obj;
        Object obj2;
        Object m195n;
        ArrayList arrayList = new ArrayList();
        if (componentCallbacksC0041e != null) {
            Object m191j = componentCallbacksC0041e.m191j();
            if (m191j != null) {
                arrayList.add(m191j);
            }
            ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
            if (cVar == null) {
                obj2 = null;
            } else {
                obj2 = cVar.f258h;
                if (obj2 == ComponentCallbacksC0041e.f200Y) {
                    obj2 = componentCallbacksC0041e.m189h();
                }
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            ComponentCallbacksC0041e.c cVar2 = componentCallbacksC0041e.f214N;
            if (cVar2 == null) {
                m195n = null;
            } else {
                Object obj3 = cVar2.f262l;
                m195n = obj3 == ComponentCallbacksC0041e.f200Y ? componentCallbacksC0041e.m195n() : obj3;
            }
            if (m195n != null) {
                arrayList.add(m195n);
            }
        }
        if (componentCallbacksC0041e2 != null) {
            Object m189h = componentCallbacksC0041e2.m189h();
            if (m189h != null) {
                arrayList.add(m189h);
            }
            ComponentCallbacksC0041e.c cVar3 = componentCallbacksC0041e2.f214N;
            if (cVar3 == null) {
                obj = null;
            } else {
                obj = cVar3.f260j;
                if (obj == ComponentCallbacksC0041e.f200Y) {
                    obj = componentCallbacksC0041e2.m191j();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            Object m195n2 = componentCallbacksC0041e2.m195n();
            if (m195n2 != null) {
                arrayList.add(m195n2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC0036b0 abstractC0036b0 = f403b;
        if (abstractC0036b0 != null && m314a(abstractC0036b0, arrayList)) {
            return f403b;
        }
        AbstractC0036b0 abstractC0036b02 = f404c;
        if (abstractC0036b02 != null && m314a(abstractC0036b02, arrayList)) {
            return f404c;
        }
        if (f403b == null && f404c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    public static C0096a<String, View> m302a(AbstractC0036b0 abstractC0036b0, C0096a<String, String> c0096a, Object obj, a aVar) {
        ArrayList<String> arrayList;
        ComponentCallbacksC0041e componentCallbacksC0041e = aVar.f405a;
        View view = componentCallbacksC0041e.f210J;
        if (c0096a.isEmpty() || obj == null || view == null) {
            c0096a.clear();
            return null;
        }
        C0096a<String, View> c0096a2 = new C0096a<>();
        abstractC0036b0.m149a((Map<String, View>) c0096a2, view);
        C0035b c0035b = aVar.f407c;
        if (aVar.f406b) {
            ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
            if (cVar != null) {
                AbstractC0042e0 abstractC0042e0 = cVar.f266p;
            }
            arrayList = c0035b.f173q;
        } else {
            componentCallbacksC0041e.m190i();
            arrayList = c0035b.f174r;
        }
        if (arrayList != null) {
            AbstractC0103h.m408a((Map) c0096a2, (Collection<?>) arrayList);
            AbstractC0103h.m408a((Map) c0096a2, (Collection<?>) c0096a.values());
        }
        int i = c0096a.f582d;
        while (true) {
            i--;
            if (i < 0) {
                return c0096a2;
            }
            if (!c0096a2.containsKey(c0096a.m420d(i))) {
                c0096a.m419c(i);
            }
        }
    }

    /* renamed from: a */
    public static View m303a(C0096a<String, View> c0096a, a aVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C0035b c0035b = aVar.f407c;
        if (obj == null || c0096a == null || (arrayList = c0035b.f173q) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0096a.get(z ? c0035b.f173q.get(0) : c0035b.f174r.get(0));
    }

    /* renamed from: a */
    public static Object m304a(AbstractC0036b0 abstractC0036b0, ComponentCallbacksC0041e componentCallbacksC0041e, ComponentCallbacksC0041e componentCallbacksC0041e2, boolean z) {
        Object m195n;
        if (componentCallbacksC0041e == null || componentCallbacksC0041e2 == null) {
            return null;
        }
        if (z) {
            ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e2.f214N;
            if (cVar == null) {
                m195n = null;
            } else {
                m195n = cVar.f262l;
                if (m195n == ComponentCallbacksC0041e.f200Y) {
                    m195n = componentCallbacksC0041e2.m195n();
                }
            }
        } else {
            m195n = componentCallbacksC0041e.m195n();
        }
        Object mo151b = abstractC0036b0.mo151b(m195n);
        if (mo151b == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) mo151b);
        return transitionSet;
    }

    /* renamed from: a */
    public static Object m305a(AbstractC0036b0 abstractC0036b0, ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        Object obj = null;
        if (componentCallbacksC0041e == null) {
            return null;
        }
        if (z) {
            ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
            if (cVar != null) {
                Object obj2 = cVar.f260j;
                obj = obj2 == ComponentCallbacksC0041e.f200Y ? componentCallbacksC0041e.m191j() : obj2;
            }
        } else {
            obj = componentCallbacksC0041e.m189h();
        }
        return abstractC0036b0.mo151b(obj);
    }

    /* renamed from: a */
    public static Object m306a(AbstractC0036b0 abstractC0036b0, Object obj, Object obj2, Object obj3, ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        Boolean bool;
        Boolean bool2;
        boolean z2 = true;
        if (obj != null && obj2 != null && componentCallbacksC0041e != null) {
            if (z) {
                ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
                if (cVar != null && (bool2 = cVar.f263m) != null) {
                    z2 = bool2.booleanValue();
                }
            } else {
                ComponentCallbacksC0041e.c cVar2 = componentCallbacksC0041e.f214N;
                if (cVar2 != null && (bool = cVar2.f264n) != null) {
                    z2 = bool.booleanValue();
                }
            }
        }
        return z2 ? abstractC0036b0.mo152b(obj2, obj, obj3) : abstractC0036b0.mo139a(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static ArrayList<View> m307a(AbstractC0036b0 abstractC0036b0, Object obj, ComponentCallbacksC0041e componentCallbacksC0041e, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = componentCallbacksC0041e.f210J;
        if (view2 != null) {
            abstractC0036b0.m148a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        abstractC0036b0.mo146a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    public static void m308a(AbstractC0036b0 abstractC0036b0, Object obj, Object obj2, C0096a<String, View> c0096a, boolean z, C0035b c0035b) {
        ArrayList<String> arrayList = c0035b.f173q;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0096a.get(z ? c0035b.f174r.get(0) : c0035b.f173q.get(0));
        abstractC0036b0.mo153b(obj, view);
        if (obj2 != null) {
            C0064x c0064x = (C0064x) abstractC0036b0;
            if (view != null) {
                Rect rect = new Rect();
                c0064x.m140a(view, rect);
                ((Transition) obj2).setEpicenterCallback(new C0064x.a(c0064x, rect));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0088, code lost:
    
        if (r6.f202B == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0038, code lost:
    
        if (r6.f234l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008a, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0076, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m309a(p000a.p006b.p010c.p011a.C0035b r11, p000a.p006b.p010c.p011a.C0035b.a r12, android.util.SparseArray<p000a.p006b.p010c.p011a.C0063w.a> r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p011a.C0063w.m309a(a.b.c.a.b, a.b.c.a.b$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    public static void m310a(ComponentCallbacksC0041e componentCallbacksC0041e, ComponentCallbacksC0041e componentCallbacksC0041e2, boolean z, C0096a<String, View> c0096a, boolean z2) {
        if (z) {
            componentCallbacksC0041e2.m190i();
        } else {
            componentCallbacksC0041e.m190i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0220  */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m311a(p000a.p006b.p010c.p011a.LayoutInflaterFactory2C0051k r39, java.util.ArrayList<p000a.p006b.p010c.p011a.C0035b> r40, java.util.ArrayList<java.lang.Boolean> r41, int r42, int r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p006b.p010c.p011a.C0063w.m311a(a.b.c.a.k, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    /* renamed from: a */
    public static void m312a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m313a(ArrayList<View> arrayList, C0096a<String, View> c0096a, Collection<String> collection) {
        for (int i = c0096a.f582d - 1; i >= 0; i--) {
            View m420d = c0096a.m420d(i);
            if (collection.contains(C0119n.m470e(m420d))) {
                arrayList.add(m420d);
            }
        }
    }

    /* renamed from: a */
    public static boolean m314a(AbstractC0036b0 abstractC0036b0, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC0036b0.mo150a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static C0096a<String, View> m315b(AbstractC0036b0 abstractC0036b0, C0096a<String, String> c0096a, Object obj, a aVar) {
        ArrayList<String> arrayList;
        if (c0096a.isEmpty() || obj == null) {
            c0096a.clear();
            return null;
        }
        ComponentCallbacksC0041e componentCallbacksC0041e = aVar.f408d;
        C0096a<String, View> c0096a2 = new C0096a<>();
        abstractC0036b0.m149a((Map<String, View>) c0096a2, componentCallbacksC0041e.f210J);
        C0035b c0035b = aVar.f410f;
        if (aVar.f409e) {
            componentCallbacksC0041e.m190i();
            arrayList = c0035b.f174r;
        } else {
            ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
            if (cVar != null) {
                AbstractC0042e0 abstractC0042e0 = cVar.f266p;
            }
            arrayList = c0035b.f173q;
        }
        AbstractC0103h.m408a((Map) c0096a2, (Collection<?>) arrayList);
        AbstractC0103h.m408a((Map) c0096a, (Collection<?>) c0096a2.keySet());
        return c0096a2;
    }

    /* renamed from: b */
    public static Object m316b(AbstractC0036b0 abstractC0036b0, ComponentCallbacksC0041e componentCallbacksC0041e, boolean z) {
        Object obj = null;
        if (componentCallbacksC0041e == null) {
            return null;
        }
        if (z) {
            ComponentCallbacksC0041e.c cVar = componentCallbacksC0041e.f214N;
            if (cVar != null) {
                Object obj2 = cVar.f258h;
                obj = obj2 == ComponentCallbacksC0041e.f200Y ? componentCallbacksC0041e.m189h() : obj2;
            }
        } else {
            obj = componentCallbacksC0041e.m191j();
        }
        return abstractC0036b0.mo151b(obj);
    }
}
