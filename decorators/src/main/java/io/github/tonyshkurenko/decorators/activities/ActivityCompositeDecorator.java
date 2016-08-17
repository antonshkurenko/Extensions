package io.github.tonyshkurenko.decorators.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import io.github.tonyshkurenko.decorators.CompositeDecorator;
import io.github.tonyshkurenko.decorators.Decorator;

/**
 * Created by: Anton Shkurenko (anthonyshkurenko)
 * Project: DecoratorTest
 * Date: 8/17/16
 * Code style: SquareAndroid (https://github.com/square/java-code-styles)
 * Follow me: @tonyshkurenko
 */
public class ActivityCompositeDecorator extends CompositeDecorator
    implements OnCreateDecorator, OnDestroyDecorator, OnPauseDecorator, OnPostCreateDecorator,
    OnResumeDecorator, OnStartDecorator, OnStopDecorator {

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    for (Decorator decorator : mDecorators) {
      if (decorator instanceof OnCreateDecorator) {
        ((OnCreateDecorator) decorator).onCreate(savedInstanceState);
      }
    }
  }

  @Override public void onDestroy() {
    for (Decorator decorator : mDecorators) {
      if (decorator instanceof OnDestroyDecorator) {
        ((OnDestroyDecorator) decorator).onDestroy();
      }
    }
  }

  @Override public void onPause() {
    for (Decorator decorator : mDecorators) {
      if (decorator instanceof OnPauseDecorator) {
        ((OnPauseDecorator) decorator).onPause();
      }
    }
  }

  @Override public void onPostCreate(@Nullable Bundle savedInstanceState) {
    for (Decorator decorator : mDecorators) {
      if (decorator instanceof OnPostCreateDecorator) {
        ((OnPostCreateDecorator) decorator).onPostCreate(savedInstanceState);
      }
    }
  }

  @Override public void onResume() {
    for (Decorator decorator : mDecorators) {
      if (decorator instanceof OnResumeDecorator) {
        ((OnResumeDecorator) decorator).onResume();
      }
    }
  }

  @Override public void onStart() {
    for (Decorator decorator : mDecorators) {
      if (decorator instanceof OnStartDecorator) {
        ((OnStartDecorator) decorator).onStart();
      }
    }
  }

  @Override public void onStop() {
    for (Decorator decorator : mDecorators) {
      if (decorator instanceof OnStopDecorator) {
        ((OnStopDecorator) decorator).onStop();
      }
    }
  }
}
