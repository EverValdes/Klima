package com.bort.klima

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews

class KlimaWidgetProvider: AppWidgetProvider() {
    override fun onUpdate(
        context: Context?,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        appWidgetIds?.forEach { appWidgetId ->
            val intent = Intent(context, MainActivity::class.java)
            val pendingIntent = PendingIntent.getActivity(context, 0 , intent, 0)
            val remoteView = RemoteViews(context?.packageName, R.layout.widget_klima)

            appWidgetManager?.updateAppWidget(appWidgetId, remoteView)
        }
    }
}