package io.github.tonyshkurenko.extensions.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import io.github.tonyshkurenko.extensions.Extension;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public interface OnPostCreateExtension extends Extension {
  void onPostCreate(@Nullable Bundle savedInstanceState);
}
