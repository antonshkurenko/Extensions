package io.github.tonyshkurenko.decoratortest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import io.github.tonyshkurenko.decoratortest.decorators.SimpleBroadcastReceiverExtension;
import io.github.tonyshkurenko.decoratortest.decorators.ToolbarExtension;
import io.github.tonyshkurenko.extensions.activities.DecoratedAppCompatActivity;
import io.github.tonyshkurenko.decoratortest.decorators.SingletonForegroundActivityExtension;

public class MainActivity extends DecoratedAppCompatActivity
    implements AdapterView.OnItemClickListener {

  static final Demo[] DEMOS = new Demo[] {
      new Demo("Subactivity with toolbar", SubWithToolbarActivity.class),
      new Demo("Fullscreen activity", SubFullScreenActivity.class),
      new Demo("Fullscreen with toolbar activity", SubFullScreenWithToolbarActivity.class)
  };

  private static final int DELAY_MILLIS = 5000;

  {
    mActivityCompositeExtension.addExtension(new ToolbarExtension(this, R.id.toolbar));
    mActivityCompositeExtension.addExtension(new SimpleBroadcastReceiverExtension(this));
    mActivityCompositeExtension.addExtension(SingletonForegroundActivityExtension.getInstance());
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final ListView listView = (ListView) findViewById(R.id.list_view);

    if (listView != null) {
      listView.setAdapter(
          new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, DEMOS));

      listView.setOnItemClickListener(this);
    }

    final Handler mHandler = new Handler();

    final Runnable mBroadcastRunnable = new Runnable() {
      @Override public void run() {
        LocalBroadcastManager.getInstance(MainActivity.this).sendBroadcast(new Intent("event"));

        mHandler.postDelayed(this, DELAY_MILLIS);
      }
    };

    mHandler.postDelayed(mBroadcastRunnable, DELAY_MILLIS);
  }

  @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    startActivity(new Intent(this, DEMOS[position].activity));
  }

  static class Demo {
    final String name;
    final Class<? extends Activity> activity;

    public Demo(String name, Class<? extends Activity> activity) {
      this.name = name;
      this.activity = activity;
    }

    @Override public String toString() {
      return name;
    }
  }
}
