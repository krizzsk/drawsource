package com.tapjoy.internal;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatExtras;
import androidx.core.app.NotificationManagerCompat;
import com.tapjoy.internal.C11665js;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tapjoy.internal.jt */
public final class C11670jt implements C11664jr {

    /* renamed from: a */
    private final Notification.Builder f28163a;

    /* renamed from: b */
    private final C11665js.C11668c f28164b;

    /* renamed from: c */
    private RemoteViews f28165c;

    /* renamed from: d */
    private RemoteViews f28166d;

    /* renamed from: e */
    private final List<Bundle> f28167e = new ArrayList();

    /* renamed from: f */
    private final Bundle f28168f = new Bundle();

    /* renamed from: g */
    private int f28169g;

    /* renamed from: h */
    private RemoteViews f28170h;

    public C11670jt(C11665js.C11668c cVar) {
        this.f28164b = cVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28163a = new Notification.Builder(cVar.f28133a, cVar.f28126H);
        } else {
            this.f28163a = new Notification.Builder(cVar.f28133a);
        }
        Notification notification = cVar.f28131M;
        this.f28163a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.f28139g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f28135c).setContentText(cVar.f28136d).setContentInfo(cVar.f28141i).setContentIntent(cVar.f28137e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f28138f, (notification.flags & 128) != 0).setLargeIcon(cVar.f28140h).setNumber(cVar.f28142j).setProgress(cVar.f28149q, cVar.f28150r, cVar.f28151s);
        if (Build.VERSION.SDK_INT < 21) {
            this.f28163a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f28163a.setSubText(cVar.f28147o).setUsesChronometer(cVar.f28145m).setPriority(cVar.f28143k);
            Iterator<C11665js.C11666a> it = cVar.f28134b.iterator();
            while (it.hasNext()) {
                m32024a(it.next());
            }
            if (cVar.f28119A != null) {
                this.f28168f.putAll(cVar.f28119A);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.f28155w) {
                    this.f28168f.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                if (cVar.f28152t != null) {
                    this.f28168f.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, cVar.f28152t);
                    if (cVar.f28153u) {
                        this.f28168f.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                    } else {
                        this.f28168f.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                if (cVar.f28154v != null) {
                    this.f28168f.putString(NotificationCompatExtras.EXTRA_SORT_KEY, cVar.f28154v);
                }
            }
            this.f28165c = cVar.f28123E;
            this.f28166d = cVar.f28124F;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f28163a.setShowWhen(cVar.f28144l);
            if (Build.VERSION.SDK_INT < 21 && cVar.f28132N != null && !cVar.f28132N.isEmpty()) {
                this.f28168f.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) cVar.f28132N.toArray(new String[cVar.f28132N.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f28163a.setLocalOnly(cVar.f28155w).setGroup(cVar.f28152t).setGroupSummary(cVar.f28153u).setSortKey(cVar.f28154v);
            this.f28169g = cVar.f28130L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f28163a.setCategory(cVar.f28158z).setColor(cVar.f28120B).setVisibility(cVar.f28121C).setPublicVersion(cVar.f28122D).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = cVar.f28132N.iterator();
            while (it2.hasNext()) {
                this.f28163a.addPerson(it2.next());
            }
            this.f28170h = cVar.f28125G;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f28163a.setExtras(cVar.f28119A).setRemoteInputHistory(cVar.f28148p);
            if (cVar.f28123E != null) {
                this.f28163a.setCustomContentView(cVar.f28123E);
            }
            if (cVar.f28124F != null) {
                this.f28163a.setCustomBigContentView(cVar.f28124F);
            }
            if (cVar.f28125G != null) {
                this.f28163a.setCustomHeadsUpContentView(cVar.f28125G);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28163a.setBadgeIconType(cVar.f28127I).setShortcutId(cVar.f28128J).setTimeoutAfter(cVar.f28129K).setGroupAlertBehavior(cVar.f28130L);
            if (cVar.f28157y) {
                this.f28163a.setColorized(cVar.f28156x);
            }
            if (!TextUtils.isEmpty(cVar.f28126H)) {
                this.f28163a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    /* renamed from: a */
    public final Notification.Builder mo70296a() {
        return this.f28163a;
    }

    /* renamed from: b */
    public final Notification mo70305b() {
        Notification notification;
        C11665js.C11669d dVar = this.f28164b.f28146n;
        if (dVar != null) {
            dVar.mo70298a((C11664jr) this);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notification = this.f28163a.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            notification = this.f28163a.build();
            if (this.f28169g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.f28169g != 2)) {
                    m32023a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.f28169g == 1) {
                    m32023a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f28163a.setExtras(this.f28168f);
            notification = this.f28163a.build();
            RemoteViews remoteViews = this.f28165c;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f28166d;
            if (remoteViews2 != null) {
                notification.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f28170h;
            if (remoteViews3 != null) {
                notification.headsUpContentView = remoteViews3;
            }
            if (this.f28169g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.f28169g != 2)) {
                    m32023a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.f28169g == 1) {
                    m32023a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f28163a.setExtras(this.f28168f);
            notification = this.f28163a.build();
            RemoteViews remoteViews4 = this.f28165c;
            if (remoteViews4 != null) {
                notification.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f28166d;
            if (remoteViews5 != null) {
                notification.bigContentView = remoteViews5;
            }
            if (this.f28169g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.f28169g != 2)) {
                    m32023a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.f28169g == 1) {
                    m32023a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> a = C11671ju.m32029a(this.f28167e);
            if (a != null) {
                this.f28168f.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, a);
            }
            this.f28163a.setExtras(this.f28168f);
            notification = this.f28163a.build();
            RemoteViews remoteViews6 = this.f28165c;
            if (remoteViews6 != null) {
                notification.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f28166d;
            if (remoteViews7 != null) {
                notification.bigContentView = remoteViews7;
            }
        } else if (Build.VERSION.SDK_INT >= 16) {
            notification = this.f28163a.build();
            Bundle a2 = C11665js.m32012a(notification);
            Bundle bundle = new Bundle(this.f28168f);
            for (String str : this.f28168f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C11671ju.m32029a(this.f28167e);
            if (a3 != null) {
                C11665js.m32012a(notification).putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, a3);
            }
            RemoteViews remoteViews8 = this.f28165c;
            if (remoteViews8 != null) {
                notification.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f28166d;
            if (remoteViews9 != null) {
                notification.bigContentView = remoteViews9;
            }
        } else {
            notification = this.f28163a.getNotification();
        }
        if (this.f28164b.f28123E != null) {
            notification.contentView = this.f28164b.f28123E;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 16 && dVar != null) {
            C11665js.m32012a(notification);
        }
        return notification;
    }

    /* renamed from: a */
    private void m32024a(C11665js.C11666a aVar) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.f28115e, aVar.f28116f, aVar.f28117g);
            if (aVar.f28112b != null) {
                for (RemoteInput addRemoteInput : C11672jv.m32031a(aVar.f28112b)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.f28111a != null) {
                bundle = new Bundle(aVar.f28111a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f28114d);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.f28114d);
            }
            builder.addExtras(bundle);
            this.f28163a.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f28167e.add(C11671ju.m32027a(this.f28163a, aVar));
        }
    }

    /* renamed from: a */
    private static void m32023a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
