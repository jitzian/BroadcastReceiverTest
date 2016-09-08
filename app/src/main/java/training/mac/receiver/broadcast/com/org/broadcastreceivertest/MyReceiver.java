package training.mac.receiver.broadcast.com.org.broadcastreceivertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by User on 9/7/2016.
 */
public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "WHERE ARE THE LADIES???", Toast.LENGTH_LONG).show();
    }
}
