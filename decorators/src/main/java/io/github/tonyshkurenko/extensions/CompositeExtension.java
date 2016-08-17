package io.github.tonyshkurenko.extensions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */

/**
 * Extension to hold other Extensions
 */
public abstract class CompositeExtension implements ExtensionContainer, Extension {

  protected final List<Extension> mExtensions = new ArrayList<>();

  @Override public void addExtension(Extension extension) {
    mExtensions.add(extension);
  }
}
