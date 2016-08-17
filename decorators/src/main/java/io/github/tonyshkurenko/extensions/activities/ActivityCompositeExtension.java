package io.github.tonyshkurenko.extensions.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import io.github.tonyshkurenko.extensions.CompositeExtension;
import io.github.tonyshkurenko.extensions.Extension;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: Extensions
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class ActivityCompositeExtension extends CompositeExtension
    implements OnCreateExtension, OnDestroyExtension, OnPauseExtension, OnPostCreateExtension,
    OnResumeExtension, OnStartExtension, OnStopExtension {

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    for (Extension extension : mExtensions) {
      if (extension instanceof OnCreateExtension) {
        ((OnCreateExtension) extension).onCreate(savedInstanceState);
      }
    }
  }

  @Override public void onDestroy() {
    for (Extension extension : mExtensions) {
      if (extension instanceof OnDestroyExtension) {
        ((OnDestroyExtension) extension).onDestroy();
      }
    }
  }

  @Override public void onPause() {
    for (Extension extension : mExtensions) {
      if (extension instanceof OnPauseExtension) {
        ((OnPauseExtension) extension).onPause();
      }
    }
  }

  @Override public void onPostCreate(@Nullable Bundle savedInstanceState) {
    for (Extension extension : mExtensions) {
      if (extension instanceof OnPostCreateExtension) {
        ((OnPostCreateExtension) extension).onPostCreate(savedInstanceState);
      }
    }
  }

  @Override public void onResume() {
    for (Extension extension : mExtensions) {
      if (extension instanceof OnResumeExtension) {
        ((OnResumeExtension) extension).onResume();
      }
    }
  }

  @Override public void onStart() {
    for (Extension extension : mExtensions) {
      if (extension instanceof OnStartExtension) {
        ((OnStartExtension) extension).onStart();
      }
    }
  }

  @Override public void onStop() {
    for (Extension extension : mExtensions) {
      if (extension instanceof OnStopExtension) {
        ((OnStopExtension) extension).onStop();
      }
    }
  }
}
