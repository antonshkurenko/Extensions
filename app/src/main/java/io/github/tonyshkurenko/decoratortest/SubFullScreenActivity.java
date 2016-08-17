package io.github.tonyshkurenko.decoratortest;

import android.os.Bundle;
import io.github.tonyshkurenko.decoratortest.decorators.SimpleBroadcastReceiverExtension;
import io.github.tonyshkurenko.extensions.activities.DecoratedAppCompatActivity;
import io.github.tonyshkurenko.decoratortest.decorators.FullScreenExtension;
import io.github.tonyshkurenko.decoratortest.decorators.SingletonForegroundActivityExtension;

public class SubFullScreenActivity extends DecoratedAppCompatActivity {

  {
    mActivityCompositeExtension.addExtension(new FullScreenExtension(this));
    mActivityCompositeExtension.addExtension(new SimpleBroadcastReceiverExtension(this));
    mActivityCompositeExtension.addExtension(SingletonForegroundActivityExtension.getInstance());
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub_full_screen);
  }
}
