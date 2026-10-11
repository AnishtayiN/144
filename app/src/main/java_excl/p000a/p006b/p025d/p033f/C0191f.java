package p000a.p006b.p025d.p033f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuC0089a;
import p000a.p006b.p010c.p016d.p017a.InterfaceMenuItemC0090b;
import p000a.p006b.p010c.p021h.AbstractC0108c;
import p000a.p006b.p025d.p027b.C0175j;
import p000a.p006b.p025d.p033f.p034i.C0204k;
import p000a.p006b.p025d.p033f.p034i.MenuItemC0205l;
import p000a.p006b.p025d.p035g.C0238h0;

/* renamed from: a.b.d.f.f */
/* loaded from: classes.dex */
public class C0191f extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f942e = {Context.class};

    /* renamed from: f */
    public static final Class<?>[] f943f = f942e;

    /* renamed from: a */
    public final Object[] f944a;

    /* renamed from: b */
    public final Object[] f945b;

    /* renamed from: c */
    public Context f946c;

    /* renamed from: d */
    public Object f947d;

    /* renamed from: a.b.d.f.f$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f948c = {MenuItem.class};

        /* renamed from: a */
        public Object f949a;

        /* renamed from: b */
        public Method f950b;

        public a(Object obj, String str) {
            this.f949a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f950b = cls.getMethod(str, f948c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f950b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f950b.invoke(this.f949a, menuItem)).booleanValue();
                }
                this.f950b.invoke(this.f949a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a.b.d.f.f$b */
    public class b {

        /* renamed from: A */
        public AbstractC0108c f951A;

        /* renamed from: B */
        public CharSequence f952B;

        /* renamed from: C */
        public CharSequence f953C;

        /* renamed from: a */
        public Menu f957a;

        /* renamed from: h */
        public boolean f964h;

        /* renamed from: i */
        public int f965i;

        /* renamed from: j */
        public int f966j;

        /* renamed from: k */
        public CharSequence f967k;

        /* renamed from: l */
        public CharSequence f968l;

        /* renamed from: m */
        public int f969m;

        /* renamed from: n */
        public char f970n;

        /* renamed from: o */
        public int f971o;

        /* renamed from: p */
        public char f972p;

        /* renamed from: q */
        public int f973q;

        /* renamed from: r */
        public int f974r;

        /* renamed from: s */
        public boolean f975s;

        /* renamed from: t */
        public boolean f976t;

        /* renamed from: u */
        public boolean f977u;

        /* renamed from: v */
        public int f978v;

        /* renamed from: w */
        public int f979w;

        /* renamed from: x */
        public String f980x;

        /* renamed from: y */
        public String f981y;

        /* renamed from: z */
        public String f982z;

        /* renamed from: D */
        public ColorStateList f954D = null;

        /* renamed from: E */
        public PorterDuff.Mode f955E = null;

        /* renamed from: b */
        public int f958b = 0;

        /* renamed from: c */
        public int f959c = 0;

        /* renamed from: d */
        public int f960d = 0;

        /* renamed from: e */
        public int f961e = 0;

        /* renamed from: f */
        public boolean f962f = true;

        /* renamed from: g */
        public boolean f963g = true;

        public b(Menu menu) {
            this.f957a = menu;
        }

        /* renamed from: a */
        public SubMenu m651a() {
            this.f964h = true;
            SubMenu addSubMenu = this.f957a.addSubMenu(this.f958b, this.f965i, this.f966j, this.f967k);
            m653a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public final <T> T m652a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0191f.this.f946c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: a */
        public final void m653a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f975s).setVisible(this.f976t).setEnabled(this.f977u).setCheckable(this.f974r >= 1).setTitleCondensed(this.f968l).setIcon(this.f969m);
            int i = this.f978v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f982z != null) {
                if (C0191f.this.f946c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                C0191f c0191f = C0191f.this;
                if (c0191f.f947d == null) {
                    c0191f.f947d = c0191f.m649a(c0191f.f946c);
                }
                menuItem.setOnMenuItemClickListener(new a(c0191f.f947d, this.f982z));
            }
            boolean z2 = menuItem instanceof C0204k;
            if (z2) {
            }
            if (this.f974r >= 2) {
                if (z2) {
                    C0204k c0204k = (C0204k) menuItem;
                    c0204k.f1138y = (c0204k.f1138y & (-5)) | 4;
                } else if (menuItem instanceof MenuItemC0205l) {
                    MenuItemC0205l menuItemC0205l = (MenuItemC0205l) menuItem;
                    try {
                        if (menuItemC0205l.f1141e == null) {
                            menuItemC0205l.f1141e = ((InterfaceMenuItemC0090b) menuItemC0205l.f1023a).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC0205l.f1141e.invoke(menuItemC0205l.f1023a, true);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str = this.f980x;
            if (str != null) {
                menuItem.setActionView((View) m652a(str, C0191f.f942e, C0191f.this.f944a));
                z = true;
            }
            int i2 = this.f979w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            AbstractC0108c abstractC0108c = this.f951A;
            if (abstractC0108c != null) {
                if (menuItem instanceof InterfaceMenuItemC0090b) {
                    ((InterfaceMenuItemC0090b) menuItem).mo363a(abstractC0108c);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f952B;
            boolean z3 = menuItem instanceof InterfaceMenuItemC0090b;
            if (z3) {
                ((InterfaceMenuItemC0090b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f953C;
            if (z3) {
                ((InterfaceMenuItemC0090b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f970n;
            int i3 = this.f971o;
            if (z3) {
                ((InterfaceMenuItemC0090b) menuItem).setAlphabeticShortcut(c2, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i3);
            }
            char c3 = this.f972p;
            int i4 = this.f973q;
            if (z3) {
                ((InterfaceMenuItemC0090b) menuItem).setNumericShortcut(c3, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i4);
            }
            PorterDuff.Mode mode = this.f955E;
            if (mode != null) {
                if (z3) {
                    ((InterfaceMenuItemC0090b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f954D;
            if (colorStateList != null) {
                if (z3) {
                    ((InterfaceMenuItemC0090b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    public C0191f(Context context) {
        super(context);
        this.f946c = context;
        this.f944a = new Object[]{context};
        this.f945b = this.f944a;
    }

    /* renamed from: a */
    public final Object m649a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m649a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: a */
    public final void m650a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (i != 2) {
                if (i == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.f958b = 0;
                        bVar.f959c = 0;
                        bVar.f960d = 0;
                        bVar.f961e = 0;
                        bVar.f962f = true;
                        bVar.f963g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar.f964h) {
                            AbstractC0108c abstractC0108c = bVar.f951A;
                            if (abstractC0108c == null || !((MenuItemC0205l.a) abstractC0108c).f1142b.hasSubMenu()) {
                                bVar.f964h = true;
                                bVar.m653a(bVar.f957a.add(bVar.f958b, bVar.f965i, bVar.f966j, bVar.f967k));
                            } else {
                                bVar.m651a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = C0191f.this.f946c.obtainStyledAttributes(attributeSet, C0175j.MenuGroup);
                    bVar.f958b = obtainStyledAttributes.getResourceId(C0175j.MenuGroup_android_id, 0);
                    bVar.f959c = obtainStyledAttributes.getInt(C0175j.MenuGroup_android_menuCategory, 0);
                    bVar.f960d = obtainStyledAttributes.getInt(C0175j.MenuGroup_android_orderInCategory, 0);
                    bVar.f961e = obtainStyledAttributes.getInt(C0175j.MenuGroup_android_checkableBehavior, 0);
                    bVar.f962f = obtainStyledAttributes.getBoolean(C0175j.MenuGroup_android_visible, true);
                    bVar.f963g = obtainStyledAttributes.getBoolean(C0175j.MenuGroup_android_enabled, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    TypedArray obtainStyledAttributes2 = C0191f.this.f946c.obtainStyledAttributes(attributeSet, C0175j.MenuItem);
                    bVar.f965i = obtainStyledAttributes2.getResourceId(C0175j.MenuItem_android_id, 0);
                    bVar.f966j = (obtainStyledAttributes2.getInt(C0175j.MenuItem_android_menuCategory, bVar.f959c) & (-65536)) | (obtainStyledAttributes2.getInt(C0175j.MenuItem_android_orderInCategory, bVar.f960d) & 65535);
                    bVar.f967k = obtainStyledAttributes2.getText(C0175j.MenuItem_android_title);
                    bVar.f968l = obtainStyledAttributes2.getText(C0175j.MenuItem_android_titleCondensed);
                    bVar.f969m = obtainStyledAttributes2.getResourceId(C0175j.MenuItem_android_icon, 0);
                    String string = obtainStyledAttributes2.getString(C0175j.MenuItem_android_alphabeticShortcut);
                    bVar.f970n = string == null ? (char) 0 : string.charAt(0);
                    bVar.f971o = obtainStyledAttributes2.getInt(C0175j.MenuItem_alphabeticModifiers, 4096);
                    String string2 = obtainStyledAttributes2.getString(C0175j.MenuItem_android_numericShortcut);
                    bVar.f972p = string2 == null ? (char) 0 : string2.charAt(0);
                    bVar.f973q = obtainStyledAttributes2.getInt(C0175j.MenuItem_numericModifiers, 4096);
                    if (obtainStyledAttributes2.hasValue(C0175j.MenuItem_android_checkable)) {
                        bVar.f974r = obtainStyledAttributes2.getBoolean(C0175j.MenuItem_android_checkable, false) ? 1 : 0;
                    } else {
                        bVar.f974r = bVar.f961e;
                    }
                    bVar.f975s = obtainStyledAttributes2.getBoolean(C0175j.MenuItem_android_checked, false);
                    bVar.f976t = obtainStyledAttributes2.getBoolean(C0175j.MenuItem_android_visible, bVar.f962f);
                    bVar.f977u = obtainStyledAttributes2.getBoolean(C0175j.MenuItem_android_enabled, bVar.f963g);
                    bVar.f978v = obtainStyledAttributes2.getInt(C0175j.MenuItem_showAsAction, -1);
                    bVar.f982z = obtainStyledAttributes2.getString(C0175j.MenuItem_android_onClick);
                    bVar.f979w = obtainStyledAttributes2.getResourceId(C0175j.MenuItem_actionLayout, 0);
                    bVar.f980x = obtainStyledAttributes2.getString(C0175j.MenuItem_actionViewClass);
                    bVar.f981y = obtainStyledAttributes2.getString(C0175j.MenuItem_actionProviderClass);
                    boolean z3 = bVar.f981y != null;
                    if (z3 && bVar.f979w == 0 && bVar.f980x == null) {
                        bVar.f951A = (AbstractC0108c) bVar.m652a(bVar.f981y, f943f, C0191f.this.f945b);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar.f951A = null;
                    }
                    bVar.f952B = obtainStyledAttributes2.getText(C0175j.MenuItem_contentDescription);
                    bVar.f953C = obtainStyledAttributes2.getText(C0175j.MenuItem_tooltipText);
                    if (obtainStyledAttributes2.hasValue(C0175j.MenuItem_iconTintMode)) {
                        bVar.f955E = C0238h0.m826a(obtainStyledAttributes2.getInt(C0175j.MenuItem_iconTintMode, -1), bVar.f955E);
                    } else {
                        bVar.f955E = null;
                    }
                    if (obtainStyledAttributes2.hasValue(C0175j.MenuItem_iconTint)) {
                        bVar.f954D = obtainStyledAttributes2.getColorStateList(C0175j.MenuItem_iconTint);
                    } else {
                        bVar.f954D = null;
                    }
                    obtainStyledAttributes2.recycle();
                    bVar.f964h = false;
                } else if (name3.equals("menu")) {
                    m650a(xmlPullParser, attributeSet, bVar.m651a());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            i = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0089a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f946c.getResources().getLayout(i);
                    m650a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
