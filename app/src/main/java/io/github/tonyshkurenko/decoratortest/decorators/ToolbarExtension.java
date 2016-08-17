package io.github.tonyshkurenko.decoratortest.decorators;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import io.github.tonyshkurenko.extensions.activities.AppCompatActivityExtension;
import io.github.tonyshkurenko.extensions.activities.OnPostCreateExtension;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class ToolbarExtension extends AppCompatActivityExtension implements OnPostCreateExtension {

  @IdRes private final int mToolbarId;

  public ToolbarExtension(AppCompatActivity appCompatActivity, @IdRes int toolbarId) {
    super(appCompatActivity);
    mToolbarId = toolbarId;
  }

  @Override public void onPostCreate(@Nullable Bundle savedInstanceState) {
    final Toolbar toolbar = (Toolbar) mAppCompatActivity.findViewById(mToolbarId);
    mAppCompatActivity.setSupportActionBar(toolbar);
  }
}
