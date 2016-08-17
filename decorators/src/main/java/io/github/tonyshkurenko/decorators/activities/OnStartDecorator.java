package io.github.tonyshkurenko.decorators.activities;

import io.github.tonyshkurenko.decorators.Decorator;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public interface OnStartDecorator extends Decorator {
  void onStart();
}
