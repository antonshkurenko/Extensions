package io.github.tonyshkurenko.extensions.activities;

import android.support.v7.app.AppCompatActivity;
import io.github.tonyshkurenko.extensions.Extension;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public abstract class AppCompatActivityExtension implements Extension {

  protected final AppCompatActivity mAppCompatActivity;

  protected AppCompatActivityExtension(AppCompatActivity appCompatActivity) {
    mAppCompatActivity = appCompatActivity;
  }
}
