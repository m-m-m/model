/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.de;

import io.github.mmm.bean.Mandatory;
import io.github.mmm.entity.property.id.IdProperty;
import io.github.mmm.model.geo.City;

/**
 * Germany {@link City} that is a municipality and local administrative unit (LAU).
 *
 * @since 1.0.0
 */
public interface DeGemeinde extends City {

  /**
   * @return the {@link DeLandkreis} this {@link DeGemeinde} belongs to. Please note that some instances of
   *         {@link DeGemeinde} do not officially have a {@link DeLandkreis} (<em>Kreisfreie Stadt</em>). For simplicity
   *         a {@link DeLandkreis} is created that represents that entire {@link DeGemeinde}.
   */
  @Mandatory
  IdProperty<DeLandkreis> Landkreis();

}
