package com.intellij.dmserver.intention;

import com.intellij.dmserver.editor.AvailableBundlesProvider;
import com.intellij.dmserver.editor.UnitsCollector;
import com.intellij.dmserver.util.DmServerBundle;
import com.intellij.dmserver.util.ManifestUtils;
import org.jetbrains.annotations.Nls;

public class BundleResolver extends UnitResolver {

  @Override
  public String getHeaderName() {
    return ManifestUtils.IMPORT_BUNDLE_HEADER;
  }

  @Nls
  @Override
  protected String getProblemMessage(String unitName) {
    return DmServerBundle.message("UnknownImportedPackageInspection.problem.message.unknown-bundle", unitName);
  }

  @Override
  protected UnitsCollector getUnitsCollector(AvailableBundlesProvider provider) {
    return provider.getBundlesCollector();
  }
}
