package com.intellij.dmserver.completion;

import com.intellij.dmserver.editor.AvailableBundlesProvider;
import com.intellij.dmserver.editor.UnitsCollector;
import com.intellij.dmserver.util.ManifestUtils;

public class BundleCompleter extends UnitCompleter {

  @Override
  public String getHeaderName() {
    return ManifestUtils.IMPORT_BUNDLE_HEADER;
  }

  @Override
  protected UnitsCollector getUnitsCollector(AvailableBundlesProvider provider) {
    return provider.getBundlesCollector();
  }
}
