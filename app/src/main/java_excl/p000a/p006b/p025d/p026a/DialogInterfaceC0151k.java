package p000a.p006b.p025d.p026a;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertController;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import p000a.p006b.p010c.p021h.C0119n;
import p000a.p006b.p025d.p027b.C0166a;
import p000a.p006b.p025d.p027b.C0171f;
import p000a.p006b.p025d.p035g.C0249l0;

/* renamed from: a.b.d.a.k */
/* loaded from: classes.dex */
public class DialogInterfaceC0151k extends DialogC0162v implements DialogInterface {

    /* renamed from: d */
    public final AlertController f706d;

    public DialogInterfaceC0151k(Context context, int i) {
        super(context, m532a(context, i));
        this.f706d = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: a */
    public static int m532a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0166a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000a.p006b.p025d.p026a.DialogC0162v, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f706d;
        int i2 = alertController.f1648K;
        if (i2 == 0) {
            i2 = alertController.f1647J;
        } else if (alertController.f1654Q != 1) {
            i2 = alertController.f1647J;
        }
        alertController.f1658b.setContentView(i2);
        View findViewById2 = alertController.f1659c.findViewById(C0171f.parentPanel);
        View findViewById3 = findViewById2.findViewById(C0171f.topPanel);
        View findViewById4 = findViewById2.findViewById(C0171f.contentPanel);
        View findViewById5 = findViewById2.findViewById(C0171f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C0171f.customPanel);
        View view = alertController.f1664h;
        if (view == null) {
            view = alertController.f1665i != 0 ? LayoutInflater.from(alertController.f1657a).inflate(alertController.f1665i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !AlertController.m1005a(view)) {
            alertController.f1659c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f1659c.findViewById(C0171f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f1670n) {
                frameLayout.setPadding(alertController.f1666j, alertController.f1667k, alertController.f1668l, alertController.f1669m);
            }
            if (alertController.f1663g != null) {
                ((C0249l0.a) viewGroup.getLayoutParams()).f1362a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(C0171f.topPanel);
        View findViewById7 = viewGroup.findViewById(C0171f.contentPanel);
        View findViewById8 = viewGroup.findViewById(C0171f.buttonPanel);
        ViewGroup m1007a = alertController.m1007a(findViewById6, findViewById3);
        ViewGroup m1007a2 = alertController.m1007a(findViewById7, findViewById4);
        ViewGroup m1007a3 = alertController.m1007a(findViewById8, findViewById5);
        alertController.f1638A = (NestedScrollView) alertController.f1659c.findViewById(C0171f.scrollView);
        alertController.f1638A.setFocusable(false);
        alertController.f1638A.setNestedScrollingEnabled(false);
        alertController.f1643F = (TextView) m1007a2.findViewById(R.id.message);
        TextView textView = alertController.f1643F;
        if (textView != null) {
            CharSequence charSequence = alertController.f1662f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f1638A.removeView(alertController.f1643F);
                if (alertController.f1663g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f1638A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f1638A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f1663g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    m1007a2.setVisibility(8);
                }
            }
        }
        alertController.f1671o = (Button) m1007a3.findViewById(R.id.button1);
        alertController.f1671o.setOnClickListener(alertController.f1656S);
        if (TextUtils.isEmpty(alertController.f1672p) && alertController.f1674r == null) {
            alertController.f1671o.setVisibility(8);
            i = 0;
        } else {
            alertController.f1671o.setText(alertController.f1672p);
            Drawable drawable = alertController.f1674r;
            if (drawable != null) {
                int i3 = alertController.f1660d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.f1671o.setCompoundDrawables(alertController.f1674r, null, null, null);
            }
            alertController.f1671o.setVisibility(0);
            i = 1;
        }
        alertController.f1675s = (Button) m1007a3.findViewById(R.id.button2);
        alertController.f1675s.setOnClickListener(alertController.f1656S);
        if (TextUtils.isEmpty(alertController.f1676t) && alertController.f1678v == null) {
            alertController.f1675s.setVisibility(8);
        } else {
            alertController.f1675s.setText(alertController.f1676t);
            Drawable drawable2 = alertController.f1678v;
            if (drawable2 != null) {
                int i4 = alertController.f1660d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.f1675s.setCompoundDrawables(alertController.f1678v, null, null, null);
            }
            alertController.f1675s.setVisibility(0);
            i |= 2;
        }
        alertController.f1679w = (Button) m1007a3.findViewById(R.id.button3);
        alertController.f1679w.setOnClickListener(alertController.f1656S);
        if (TextUtils.isEmpty(alertController.f1680x) && alertController.f1682z == null) {
            alertController.f1679w.setVisibility(8);
        } else {
            alertController.f1679w.setText(alertController.f1680x);
            Drawable drawable3 = alertController.f1674r;
            if (drawable3 != null) {
                int i5 = alertController.f1660d;
                drawable3.setBounds(0, 0, i5, i5);
                alertController.f1671o.setCompoundDrawables(alertController.f1674r, null, null, null);
            }
            alertController.f1679w.setVisibility(0);
            i |= 4;
        }
        Context context = alertController.f1657a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0166a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                alertController.m1009a(alertController.f1671o);
            } else if (i == 2) {
                alertController.m1009a(alertController.f1675s);
            } else if (i == 4) {
                alertController.m1009a(alertController.f1679w);
            }
        }
        if (!(i != 0)) {
            m1007a3.setVisibility(8);
        }
        if (alertController.f1644G != null) {
            m1007a.addView(alertController.f1644G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f1659c.findViewById(C0171f.title_template).setVisibility(8);
        } else {
            alertController.f1641D = (ImageView) alertController.f1659c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f1661e)) && alertController.f1653P) {
                alertController.f1642E = (TextView) alertController.f1659c.findViewById(C0171f.alertTitle);
                alertController.f1642E.setText(alertController.f1661e);
                int i6 = alertController.f1639B;
                if (i6 != 0) {
                    alertController.f1641D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.f1640C;
                    if (drawable4 != null) {
                        alertController.f1641D.setImageDrawable(drawable4);
                    } else {
                        alertController.f1642E.setPadding(alertController.f1641D.getPaddingLeft(), alertController.f1641D.getPaddingTop(), alertController.f1641D.getPaddingRight(), alertController.f1641D.getPaddingBottom());
                        alertController.f1641D.setVisibility(8);
                    }
                }
            } else {
                alertController.f1659c.findViewById(C0171f.title_template).setVisibility(8);
                alertController.f1641D.setVisibility(8);
                m1007a.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        boolean z3 = (m1007a == null || m1007a.getVisibility() == 8) ? 0 : 1;
        boolean z4 = m1007a3.getVisibility() != 8;
        if (!z4 && (findViewById = m1007a2.findViewById(C0171f.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z3 != 0) {
            NestedScrollView nestedScrollView = alertController.f1638A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f1662f == null && alertController.f1663g == null) ? null : m1007a.findViewById(C0171f.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = m1007a2.findViewById(C0171f.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f1663g;
        if (listView instanceof AlertController.RecycleListView) {
            ((AlertController.RecycleListView) listView).m1012a(z3, z4);
        }
        if (!z2) {
            View view2 = alertController.f1663g;
            if (view2 == null) {
                view2 = alertController.f1638A;
            }
            if (view2 != null) {
                int i7 = z3 | (z4 ? 2 : 0);
                View findViewById11 = alertController.f1659c.findViewById(C0171f.scrollIndicatorUp);
                View findViewById12 = alertController.f1659c.findViewById(C0171f.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    C0119n.m456a(view2, i7, 3);
                    if (findViewById11 != null) {
                        m1007a2.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        m1007a2.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i7 & 1) == 0) {
                        m1007a2.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 != null && (i7 & 2) == 0) {
                        m1007a2.removeView(findViewById12);
                        findViewById12 = null;
                    }
                    if (findViewById11 != null || findViewById12 != null) {
                        if (alertController.f1662f != null) {
                            alertController.f1638A.setOnScrollChangeListener(new C0143c(alertController, findViewById11, findViewById12));
                            alertController.f1638A.post(new RunnableC0144d(alertController, findViewById11, findViewById12));
                        } else {
                            ListView listView2 = alertController.f1663g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new C0145e(alertController, findViewById11, findViewById12));
                                alertController.f1663g.post(new RunnableC0146f(alertController, findViewById11, findViewById12));
                            } else {
                                if (findViewById11 != null) {
                                    m1007a2.removeView(findViewById11);
                                }
                                if (findViewById12 != null) {
                                    m1007a2.removeView(findViewById12);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f1663g;
        if (listView3 == null || (listAdapter = alertController.f1645H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i8 = alertController.f1646I;
        if (i8 > -1) {
            listView3.setItemChecked(i8, true);
            listView3.setSelection(i8);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f706d.f1638A;
        if (nestedScrollView != null && nestedScrollView.m992a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f706d.f1638A;
        if (nestedScrollView != null && nestedScrollView.m992a(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p000a.p006b.p025d.p026a.DialogC0162v, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f706d;
        alertController.f1661e = charSequence;
        TextView textView = alertController.f1642E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
