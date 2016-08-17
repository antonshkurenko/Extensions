package io.github.tonyshkurenko.decorators;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */

/**
 * Decorator to hold other decorators
 */
public abstract class CompositeDecorator implements DecoratorContainer, Decorator {

  protected final List<Decorator> mDecorators = new ArrayList<>();

  @Override public void addDecorator(Decorator decorator) {
    mDecorators.add(decorator);
  }
}
