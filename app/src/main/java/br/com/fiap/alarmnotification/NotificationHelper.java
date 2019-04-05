package br.com.fiap.alarmnotification;

import android.app.Notification;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class NotificationHelper {

    private Context contexto;

    public static final String CHANNEL_ID_1 = "channel_1";
    private NotificationManagerCompat notificationManager;

    public NotificationHelper(Context context) {
        contexto = context;
    }

    public NotificationCompat.Builder getChannelNotification() {

        return new NotificationCompat.Builder(contexto, CHANNEL_ID_1)
                .setSmallIcon(R.drawable.ic_love)
                .setContentTitle(contexto.getString(R.string.title))
                .setContentText(contexto.getString(R.string.message))
                .setColor(Color.RED)
                .setPriority(NotificationCompat.PRIORITY_LOW);

    }

    public NotificationManagerCompat getManager() {
        notificationManager = NotificationManagerCompat.from(contexto);
        return notificationManager;
    }
}
