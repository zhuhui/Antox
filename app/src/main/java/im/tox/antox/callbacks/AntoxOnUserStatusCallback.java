package im.tox.antox.callbacks;

import android.content.Context;
import android.util.Log;

import im.tox.antox.AntoxFriend;
import im.tox.jtoxcore.ToxUserStatus;
import im.tox.jtoxcore.callbacks.OnUserStatusCallback;

/**
 * Created by soft on 03/03/14.
 */
public class AntoxOnUserStatusCallback implements OnUserStatusCallback<AntoxFriend> {

    private final static String TAG = "im.tox.antox.TAG";
    private Context ctx;

    public AntoxOnUserStatusCallback(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public void execute(AntoxFriend friend, ToxUserStatus newStatus) {
        Log.d(TAG, "OnUserStatusCallback received");
    }
}
