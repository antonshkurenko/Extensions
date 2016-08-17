package io.github.tonyshkurenko.decoratortest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import io.github.tonyshkurenko.decoratortest.decorators.ToolbarExtension;
import io.github.tonyshkurenko.extensions.activities.DecoratedAppCompatActivity;
import io.github.tonyshkurenko.decoratortest.decorators.ChildToolbarExtension;
import io.github.tonyshkurenko.decoratortest.decorators.SimpleBroadcastReceiverExtension;
import io.github.tonyshkurenko.decoratortest.decorators.SingletonForegroundActivityExtension;

public class SubWithToolbarActivity extends DecoratedAppCompatActivity {

  {
    mActivityCompositeExtension.addExtension(new ToolbarExtension(this, R.id.toolbar));
    mActivityCompositeExtension.addExtension(new ChildToolbarExtension(this));
    mActivityCompositeExtension.addExtension(new SimpleBroadcastReceiverExtension(this));
    mActivityCompositeExtension.addExtension(SingletonForegroundActivityExtension.getInstance());
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub_with_toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        Snackbar.make(view, "Is foreground: " + SingletonForegroundActivityExtension.isForeground(),
            Snackbar.LENGTH_LONG).show();
      }
    });
  }
}
