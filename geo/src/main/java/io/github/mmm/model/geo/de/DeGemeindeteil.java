/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.de;

import io.github.mmm.bean.Mandatory;
import io.github.mmm.entity.property.id.IdProperty;
import io.github.mmm.model.geo.City;

/**
 * Germany {@link City} that is a rural district.
 *
 * @since 1.0.0
 */
public interface DeGemeindeteil extends City {

  /**
   * @return {@link DeGemeinde} this {@link DeGemeindeteil} belongs to.
   */
  @Mandatory
  IdProperty<DeGemeinde> Gemeinde();

}
