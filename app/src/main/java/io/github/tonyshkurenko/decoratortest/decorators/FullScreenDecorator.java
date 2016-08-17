package io.github.tonyshkurenko.decoratortest.decorators;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import io.github.tonyshkurenko.decorators.activities.AppCompatActivityDecorator;
import io.github.tonyshkurenko.decorators.activities.OnCreateDecorator;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class FullScreenDecorator extends AppCompatActivityDecorator implements OnCreateDecorator {

  public FullScreenDecorator(AppCompatActivity appCompatActivity) {
    super(appCompatActivity);
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    mAppCompatActivity.requestWindowFeature(Window.FEATURE_NO_TITLE);
    mAppCompatActivity.getWindow()
        .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
  }
}
