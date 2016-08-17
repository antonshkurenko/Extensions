package io.github.tonyshkurenko.decoratortest;

import android.os.Bundle;
import io.github.tonyshkurenko.decorators.activities.DecoratedAppCompatActivity;
import io.github.tonyshkurenko.decoratortest.decorators.FullScreenDecorator;
import io.github.tonyshkurenko.decoratortest.decorators.SimpleBroadcastReceiverDecorator;
import io.github.tonyshkurenko.decoratortest.decorators.SingletonForegroundActivityDecorator;

public class SubFullScreenActivity extends DecoratedAppCompatActivity {

  {
    mActivityCompositeDecorator.addDecorator(new FullScreenDecorator(this));
    mActivityCompositeDecorator.addDecorator(new SimpleBroadcastReceiverDecorator(this));
    mActivityCompositeDecorator.addDecorator(SingletonForegroundActivityDecorator.getInstance());
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub_full_screen);
  }
}
