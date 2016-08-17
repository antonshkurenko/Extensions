package io.github.tonyshkurenko.decoratortest.decorators;

import io.github.tonyshkurenko.decorators.Decorator;
import io.github.tonyshkurenko.decorators.activities.OnPauseDecorator;
import io.github.tonyshkurenko.decorators.activities.OnResumeDecorator;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public final class SingletonForegroundActivityDecorator
    implements OnResumeDecorator, OnPauseDecorator, Decorator {

  private boolean mIsForeground;

  private static final SingletonForegroundActivityDecorator INSTANCE =
      new SingletonForegroundActivityDecorator();

  public static SingletonForegroundActivityDecorator getInstance() {
    return INSTANCE;
  }

  private SingletonForegroundActivityDecorator() {

  }

  public static boolean isForeground() {
    return INSTANCE.mIsForeground;
  }

  @Override public void onPause() {
    mIsForeground = false;
  }

  @Override public void onResume() {
    mIsForeground = true;
  }
}
