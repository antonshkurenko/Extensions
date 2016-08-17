package io.github.tonyshkurenko.decoratortest.decorators;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import io.github.tonyshkurenko.extensions.activities.AppCompatActivityExtension;
import io.github.tonyshkurenko.extensions.activities.OnPostCreateExtension;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class ChildToolbarExtension extends AppCompatActivityExtension
    implements OnPostCreateExtension {

  public ChildToolbarExtension(AppCompatActivity appCompatActivity) {
    super(appCompatActivity);
  }

  @Override public void onPostCreate(@Nullable Bundle savedInstanceState) {
    mAppCompatActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
  }
}
