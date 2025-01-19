package com.ntmodalize

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.NtModalizeViewManagerInterface
import com.facebook.react.viewmanagers.NtModalizeViewManagerDelegate

@ReactModule(name = NtModalizeViewManager.NAME)
class NtModalizeViewManager : SimpleViewManager<NtModalizeView>(),
  NtModalizeViewManagerInterface<NtModalizeView> {
  private val mDelegate: ViewManagerDelegate<NtModalizeView>

  init {
    mDelegate = NtModalizeViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<NtModalizeView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): NtModalizeView {
    return NtModalizeView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: NtModalizeView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "NtModalizeView"
  }
}
