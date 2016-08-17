package io.github.tonyshkurenko.extensions.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class DecoratedAppCompatActivity extends AppCompatActivity {

  protected final ActivityCompositeExtension mActivityCompositeExtension =
      new ActivityCompositeExtension();

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mActivityCompositeExtension.onCreate(savedInstanceState);
  }

  @Override protected void onPostCreate(@Nullable Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    mActivityCompositeExtension.onPostCreate(savedInstanceState);
  }

  @Override protected void onStart() {
    super.onStart();
    mActivityCompositeExtension.onStart();
  }

  @Override protected void onResume() {
    super.onResume();
    mActivityCompositeExtension.onResume();
  }

  @Override protected void onPause() {
    super.onPause();
    mActivityCompositeExtension.onPause();
  }

  @Override protected void onStop() {
    super.onStop();
    mActivityCompositeExtension.onStop();
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    mActivityCompositeExtension.onDestroy();
  }
}
