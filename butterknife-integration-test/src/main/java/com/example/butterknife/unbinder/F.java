package com.example.butterknife.unbinder;

import androidx.annotation.ColorInt;
import android.view.View;

import androidx.annotation.NonNull;
import butterknife.BindColor;
import butterknife.ButterKnife;

public final class F extends D {

  @BindColor(android.R.color.background_light) @ColorInt int backgroundLightColor;

  public F(@NonNull View view) {
    super(view);
    ButterKnife.bind(this, view);
  }
}
