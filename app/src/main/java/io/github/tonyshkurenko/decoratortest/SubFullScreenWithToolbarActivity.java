package io.github.tonyshkurenko.decoratortest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import io.github.tonyshkurenko.decorators.activities.DecoratedAppCompatActivity;
import io.github.tonyshkurenko.decoratortest.decorators.ChildToolbarDecorator;
import io.github.tonyshkurenko.decoratortest.decorators.FullScreenDecorator;
import io.github.tonyshkurenko.decoratortest.decorators.SimpleBroadcastReceiverDecorator;
import io.github.tonyshkurenko.decoratortest.decorators.SingletonForegroundActivityDecorator;

public class SubFullScreenWithToolbarActivity extends DecoratedAppCompatActivity {

  {
    mActivityCompositeDecorator.addDecorator(new ChildToolbarDecorator(this, R.id.toolbar));
    mActivityCompositeDecorator.addDecorator(new FullScreenDecorator(this));
    mActivityCompositeDecorator.addDecorator(new SimpleBroadcastReceiverDecorator(this));
    mActivityCompositeDecorator.addDecorator(SingletonForegroundActivityDecorator.getInstance());
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_full_screen_with_toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Snackbar.make(view, "Is foreground: " + SingletonForegroundActivityDecorator.isForeground(),
            Snackbar.LENGTH_LONG).show();
      }
    });
  }
}
