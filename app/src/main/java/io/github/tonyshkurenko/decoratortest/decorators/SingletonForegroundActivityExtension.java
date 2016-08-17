package io.github.tonyshkurenko.decoratortest.decorators;

import io.github.tonyshkurenko.extensions.Extension;
import io.github.tonyshkurenko.extensions.activities.OnPauseExtension;
import io.github.tonyshkurenko.extensions.activities.OnResumeExtension;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public final class SingletonForegroundActivityExtension
    implements OnResumeExtension, OnPauseExtension, Extension {

  private boolean mIsForeground;

  private static final SingletonForegroundActivityExtension INSTANCE =
      new SingletonForegroundActivityExtension();

  public static SingletonForegroundActivityExtension getInstance() {
    return INSTANCE;
  }

  private SingletonForegroundActivityExtension() {

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
