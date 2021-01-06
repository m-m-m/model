/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.core.location;

import io.github.mmm.bean.AbstractInterface;
import io.github.mmm.property.number.longs.LongProperty;

/**
 * This is the abstract base class for an area like a country, state, city, etc.
 *
 * @since 1.0.0
 */
@AbstractInterface
public interface Area extends Location {

  /**
   * @return the optional surface area in square kilometers (km²).
   */
  LongProperty SurfaceArea();

  /**
   * @return the optional number of inhabitants of this area. Please note that this value frequently changes and will
   *         typically be out-dated. So consider it as an estimate.
   */
  LongProperty Inhabitants();

}
