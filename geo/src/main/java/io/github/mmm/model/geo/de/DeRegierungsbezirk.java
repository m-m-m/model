/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.de;

import io.github.mmm.bean.Mandatory;
import io.github.mmm.entity.property.id.IdProperty;
import io.github.mmm.model.geo.CountryArea;

/**
 * German {@link CountryArea} for NUTS level 2. A {@link DeBundesland} is typically divided into multiple
 * {@link DeRegierungsbezirk}s. As some of them are not, for simplicity a {@link DeRegierungsbezirk} is created that
 * represents the entire {@link DeBundesland}.
 *
 * @since 1.0.0
 */
public interface DeRegierungsbezirk extends DeArea {

  /**
   * @return the {@link DeBundesland} this {@link DeRegierungsbezirk} belong to.
   */
  @Mandatory
  IdProperty<DeBundesland> Bundesland();

}
