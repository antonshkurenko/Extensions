package io.github.tonyshkurenko.decoratortest.decorators;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class ChildToolbarDecorator extends ToolbarDecorator {

  public ChildToolbarDecorator(AppCompatActivity appCompatActivity, @IdRes int toolbarId) {
    super(appCompatActivity, toolbarId);
  }

  @Override public void onPostCreate(@Nullable Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    mAppCompatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }
}
