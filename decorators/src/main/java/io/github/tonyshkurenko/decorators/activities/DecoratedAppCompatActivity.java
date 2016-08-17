package io.github.tonyshkurenko.decorators.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class DecoratedAppCompatActivity extends AppCompatActivity {

  protected final ActivityCompositeDecorator mActivityCompositeDecorator =
      new ActivityCompositeDecorator();

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mActivityCompositeDecorator.onCreate(savedInstanceState);
  }

  @Override protected void onPostCreate(@Nullable Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    mActivityCompositeDecorator.onPostCreate(savedInstanceState);
  }

  @Override protected void onStart() {
    super.onStart();
    mActivityCompositeDecorator.onStart();
  }

  @Override protected void onResume() {
    super.onResume();
    mActivityCompositeDecorator.onResume();
  }

  @Override protected void onPause() {
    super.onPause();
    mActivityCompositeDecorator.onPause();
  }

  @Override protected void onStop() {
    super.onStop();
    mActivityCompositeDecorator.onStop();
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    mActivityCompositeDecorator.onDestroy();
  }
}
