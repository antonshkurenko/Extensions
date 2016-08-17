package io.github.tonyshkurenko.decorators.activities;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */

import io.github.tonyshkurenko.decorators.Decorator;

/**
 * Activity callback onDestroy() decorator
 */
public interface OnDestroyDecorator extends Decorator {
  void onDestroy();
}
