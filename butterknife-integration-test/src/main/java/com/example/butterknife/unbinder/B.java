package com.example.butterknife.unbinder;

import androidx.annotation.ColorInt;
import android.view.View;

import androidx.annotation.NonNull;
import butterknife.BindColor;
import butterknife.ButterKnife;

public class B extends A {

  @BindColor(android.R.color.white) @ColorInt int whiteColor;

  public B(@NonNull View view) {
    super(view);
    ButterKnife.bind(this, view);
  }
}
