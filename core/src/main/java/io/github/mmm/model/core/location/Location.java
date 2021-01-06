/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.core.location;

import io.github.mmm.bean.AbstractInterface;
import io.github.mmm.bean.WritableBean;
import io.github.mmm.property.number.doubles.DoubleProperty;

/**
 * {@link WritableBean} that may have a geo-location with {@link #Latitude()} and {@link #Longitude()}.
 *
 * @since 1.0.0
 */
@AbstractInterface
public interface Location extends WritableBean {

  /**
   * @return the optional latitude part of the geo-location. If set then also {@link #Longitude()} should be set.
   */
  DoubleProperty Latitude();

  /**
   * @return the optional longitude part of the geo-location. If set then also {@link #Latitude()} should be set.
   */
  DoubleProperty Longitude();

}
