package io.github.tonyshkurenko.decorators.activities;

import android.support.v7.app.AppCompatActivity;
import io.github.tonyshkurenko.decorators.Decorator;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public abstract class AppCompatActivityDecorator implements Decorator {

  protected final AppCompatActivity mAppCompatActivity;

  protected AppCompatActivityDecorator(AppCompatActivity appCompatActivity) {
    mAppCompatActivity = appCompatActivity;
  }
}
