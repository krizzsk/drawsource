package com.squareup.picasso;

import android.app.Notification;
import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.squareup.picasso.Picasso;

abstract class RemoteViewsAction extends Action<RemoteViewsTarget> {
    Callback callback;
    final RemoteViews remoteViews;
    private RemoteViewsTarget target;
    final int viewId;

    /* access modifiers changed from: package-private */
    public abstract void update();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteViewsAction(Picasso picasso, Request request, RemoteViews remoteViews2, int i, int i2, int i3, int i4, Object obj, String str, Callback callback2) {
        super(picasso, null, request, i3, i4, i2, (Drawable) null, str, obj, false);
        this.remoteViews = remoteViews2;
        this.viewId = i;
        this.callback = callback2;
    }

    /* access modifiers changed from: package-private */
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        this.remoteViews.setImageViewBitmap(this.viewId, bitmap);
        update();
        Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.onSuccess();
        }
    }

    /* access modifiers changed from: package-private */
    public void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }

    public void error(Exception exc) {
        if (this.errorResId != 0) {
            setImageResource(this.errorResId);
        }
        Callback callback2 = this.callback;
        if (callback2 != null) {
            callback2.onError(exc);
        }
    }

    /* access modifiers changed from: package-private */
    public RemoteViewsTarget getTarget() {
        if (this.target == null) {
            this.target = new RemoteViewsTarget(this.remoteViews, this.viewId);
        }
        return this.target;
    }

    /* access modifiers changed from: package-private */
    public void setImageResource(int i) {
        this.remoteViews.setImageViewResource(this.viewId, i);
        update();
    }

    static class RemoteViewsTarget {
        final RemoteViews remoteViews;
        final int viewId;

        RemoteViewsTarget(RemoteViews remoteViews2, int i) {
            this.remoteViews = remoteViews2;
            this.viewId = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RemoteViewsTarget remoteViewsTarget = (RemoteViewsTarget) obj;
            if (this.viewId != remoteViewsTarget.viewId || !this.remoteViews.equals(remoteViewsTarget.remoteViews)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.remoteViews.hashCode() * 31) + this.viewId;
        }
    }

    static class AppWidgetAction extends RemoteViewsAction {
        private final int[] appWidgetIds;

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ Object getTarget() {
            return RemoteViewsAction.super.getTarget();
        }

        AppWidgetAction(Picasso picasso, Request request, RemoteViews remoteViews, int i, int[] iArr, int i2, int i3, String str, Object obj, int i4, Callback callback) {
            super(picasso, request, remoteViews, i, i4, i2, i3, obj, str, callback);
            this.appWidgetIds = iArr;
        }

        /* access modifiers changed from: package-private */
        public void update() {
            AppWidgetManager.getInstance(this.picasso.context).updateAppWidget(this.appWidgetIds, this.remoteViews);
        }
    }

    static class NotificationAction extends RemoteViewsAction {
        private final Notification notification;
        private final int notificationId;
        private final String notificationTag;

        /* access modifiers changed from: package-private */
        public /* bridge */ /* synthetic */ Object getTarget() {
            return RemoteViewsAction.super.getTarget();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        NotificationAction(Picasso picasso, Request request, RemoteViews remoteViews, int i, int i2, Notification notification2, String str, int i3, int i4, String str2, Object obj, int i5, Callback callback) {
            super(picasso, request, remoteViews, i, i5, i3, i4, obj, str2, callback);
            this.notificationId = i2;
            this.notificationTag = str;
            this.notification = notification2;
        }

        /* access modifiers changed from: package-private */
        public void update() {
            ((NotificationManager) Utils.getService(this.picasso.context, "notification")).notify(this.notificationTag, this.notificationId, this.notification);
        }
    }
}
