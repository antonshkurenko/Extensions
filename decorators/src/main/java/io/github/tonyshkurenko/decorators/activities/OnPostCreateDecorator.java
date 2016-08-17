package io.github.tonyshkurenko.decorators.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import io.github.tonyshkurenko.decorators.Decorator;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public interface OnPostCreateDecorator extends Decorator {
  void onPostCreate(@Nullable Bundle savedInstanceState);
}
