package me.panavtec.drawableview.gestures;

import android.view.ScaleGestureDetector;

public class ScaleListener implements ScaleGestureDetector.OnScaleGestureListener {
  
  private OnScaleListener listener;

  public ScaleListener(OnScaleListener listener) {
    this.listener = listener;
  }

  @Override public boolean onScale(ScaleGestureDetector detector) {
    return listener.onScale(detector.getScaleFactor());
  }

  @Override public boolean onScaleBegin(ScaleGestureDetector detector) {
    return true;
  }

  @Override public void onScaleEnd(ScaleGestureDetector detector) {
  }

  static interface OnScaleListener {
    boolean onScale(float scaleFactor);
  }
}
