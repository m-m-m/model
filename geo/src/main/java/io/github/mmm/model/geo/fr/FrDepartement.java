/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.fr;

import io.github.mmm.bean.Mandatory;
import io.github.mmm.entity.property.link.LinkProperty;
import io.github.mmm.model.geo.Region;

/**
 * French {@link Region} called <em>Département</em>. France consists of 101 Départements (96 in metropolitan France and
 * 5 overseas).
 *
 * @since 1.0.0
 */
public interface FrDepartement extends FrArea {

  /**
   * @return the {@link FrRegion} this {@link FrDepartement} belongs to.
   */
  @Mandatory
  LinkProperty<FrRegion> Region();

}
