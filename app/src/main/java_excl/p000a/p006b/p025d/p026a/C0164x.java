package p000a.p006b.p025d.p026a;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p000a.p006b.p008b.p009a.C0027d;

/* renamed from: a.b.d.a.x */
/* loaded from: classes.dex */
public class C0164x {

    /* renamed from: d */
    public static C0164x f803d;

    /* renamed from: a */
    public final Context f804a;

    /* renamed from: b */
    public final LocationManager f805b;

    /* renamed from: c */
    public final a f806c = new a();

    /* renamed from: a.b.d.a.x$a */
    public static class a {

        /* renamed from: a */
        public boolean f807a;

        /* renamed from: b */
        public long f808b;

        /* renamed from: c */
        public long f809c;

        /* renamed from: d */
        public long f810d;

        /* renamed from: e */
        public long f811e;

        /* renamed from: f */
        public long f812f;
    }

    public C0164x(Context context, LocationManager locationManager) {
        this.f804a = context;
        this.f805b = locationManager;
    }

    /* renamed from: a */
    public final Location m594a(String str) {
        try {
            if (this.f805b.isProviderEnabled(str)) {
                return this.f805b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: a */
    public boolean m595a() {
        long j;
        a aVar = this.f806c;
        if (aVar.f812f > System.currentTimeMillis()) {
            return aVar.f807a;
        }
        Location m594a = C0027d.m35a(this.f804a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m594a("network") : null;
        Location m594a2 = C0027d.m35a(this.f804a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m594a("gps") : null;
        if (m594a2 == null || m594a == null ? m594a2 != null : m594a2.getTime() > m594a.getTime()) {
            m594a = m594a2;
        }
        if (m594a == null) {
            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
            int i = Calendar.getInstance().get(11);
            return i < 6 || i >= 22;
        }
        a aVar2 = this.f806c;
        long currentTimeMillis = System.currentTimeMillis();
        if (C0163w.f799d == null) {
            C0163w.f799d = new C0163w();
        }
        C0163w c0163w = C0163w.f799d;
        c0163w.m593a(currentTimeMillis - 86400000, m594a.getLatitude(), m594a.getLongitude());
        long j2 = c0163w.f800a;
        c0163w.m593a(currentTimeMillis, m594a.getLatitude(), m594a.getLongitude());
        boolean z = c0163w.f802c == 1;
        long j3 = c0163w.f801b;
        long j4 = c0163w.f800a;
        c0163w.m593a(currentTimeMillis + 86400000, m594a.getLatitude(), m594a.getLongitude());
        long j5 = c0163w.f801b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar2.f807a = z;
        aVar2.f808b = j2;
        aVar2.f809c = j3;
        aVar2.f810d = j4;
        aVar2.f811e = j5;
        aVar2.f812f = j;
        return aVar.f807a;
    }
}
