/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.de;

import io.github.mmm.bean.Mandatory;
import io.github.mmm.entity.property.id.IdProperty;
import io.github.mmm.model.geo.CountryArea;

/**
 * German {@link CountryArea} for NUTS level 3. A {@link DeRegierungsbezirk} is divided into multiple
 * {@link DeGemeinde}s.
 *
 * @since 1.0.0
 */
public interface DeLandkreis extends DeArea {

  /**
   * @return the {@link DeRegierungsbezirk} this {@link DeLandkreis} belongs to.
   */
  @Mandatory
  IdProperty<DeRegierungsbezirk> Regierungsbezirk();

}
