package io.github.tonyshkurenko.extensions.activities;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */

import io.github.tonyshkurenko.extensions.Extension;

/**
 * Activity callback onDestroy() decorator
 */
public interface OnDestroyExtension extends Extension {
  void onDestroy();
}
