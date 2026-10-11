package p000a.p006b.p010c.p024i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: a.b.c.i.g */
/* loaded from: classes.dex */
public class ActionModeCallbackC0138g implements ActionMode.Callback {

    /* renamed from: a */
    public final ActionMode.Callback f677a;

    /* renamed from: b */
    public final TextView f678b;

    /* renamed from: c */
    public Class f679c;

    /* renamed from: d */
    public Method f680d;

    /* renamed from: e */
    public boolean f681e;

    /* renamed from: f */
    public boolean f682f = false;

    public ActionModeCallbackC0138g(ActionMode.Callback callback, TextView textView) {
        this.f677a = callback;
        this.f678b = textView;
    }

    /* renamed from: a */
    public final Intent m514a() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f677a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f677a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f677a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        String str;
        Context context = this.f678b.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f682f) {
            this.f682f = true;
            try {
                this.f679c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f680d = this.f679c.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f681e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f679c = null;
                this.f680d = null;
                this.f681e = false;
            }
        }
        try {
            Method declaredMethod = (this.f681e && this.f679c.isInstance(menu)) ? this.f680d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m514a(), 0)) {
                    if (context.getPackageName().equals(resolveInfo.activityInfo.packageName) || (resolveInfo.activityInfo.exported && ((str = resolveInfo.activityInfo.permission) == null || context.checkSelfPermission(str) == 0))) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                TextView textView = this.f678b;
                add.setIntent(m514a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled())).setClassName(resolveInfo2.activityInfo.packageName, resolveInfo2.activityInfo.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f677a.onPrepareActionMode(actionMode, menu);
    }
}
