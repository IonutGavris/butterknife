package com.example.butterknife.unbinder;

import androidx.annotation.ColorInt;
import android.view.View;

import androidx.annotation.NonNull;
import butterknife.BindColor;
import butterknife.ButterKnife;

public class D extends C {

  @BindColor(android.R.color.darker_gray) @ColorInt int grayColor;

  public D(@NonNull View view) {
    super(view);
    ButterKnife.bind(this, view);
  }
}
