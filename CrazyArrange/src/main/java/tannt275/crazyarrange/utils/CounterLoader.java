package tannt275.crazyarrange.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.lang.ref.WeakReference;

import tannt275.crazyarrange.MainActivity;

public class CounterLoader extends AsyncTaskLoader<Integer> {
    public static WeakReference<MainActivity> activity_weakReference;
    private int endCount;

    public CounterLoader(@NonNull MainActivity mainActivity_, int endCount) {
        super(mainActivity_);
        activity_weakReference = new WeakReference<>(mainActivity_);
        this.endCount = endCount;
    }

    @Nullable
    @Override
    public Integer loadInBackground() {
        Log.d("CounterLoader", "loadInBackground");
        int i = 0;
        while (i < endCount) {
            try {

                final int finalI = i;
                activity_weakReference.get().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        activity_weakReference.get().mDisplayTime.setText(String.valueOf(finalI));
                    }
                });
                Thread.sleep(1000);
                i++;

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return i;
    }

}
