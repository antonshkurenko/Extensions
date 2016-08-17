package io.github.tonyshkurenko.decoratortest.decorators;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import io.github.tonyshkurenko.decorators.activities.AppCompatActivityDecorator;
import io.github.tonyshkurenko.decorators.activities.OnPostCreateDecorator;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class ToolbarDecorator extends AppCompatActivityDecorator implements OnPostCreateDecorator {

  protected Toolbar mToolbar;

  @IdRes private final int mToolbarId;

  public ToolbarDecorator(AppCompatActivity appCompatActivity, @IdRes int toolbarId) {
    super(appCompatActivity);
    mToolbarId = toolbarId;
  }

  @Override public void onPostCreate(@Nullable Bundle savedInstanceState) {
    mToolbar = (Toolbar) mAppCompatActivity.findViewById(mToolbarId);
    mAppCompatActivity.setSupportActionBar(mToolbar);
  }
}
