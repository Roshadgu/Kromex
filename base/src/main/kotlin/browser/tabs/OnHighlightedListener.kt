@file:JsModule("webextension-polyfill")
@file:JsQualifier("tabs")

package browser.tabs

/**
 * Fired when the highlighted or selected tabs in a window changes.
 */
public external interface OnHighlightedListener {
  public var highlightInfo: HighlightInfoProperty
}
