/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.us;

import io.github.mmm.bean.AbstractInterface;
import io.github.mmm.model.geo.CountryArea;
import io.github.mmm.model.geo.impl.GeoConstants;
import io.github.mmm.property.string.StringProperty;

/**
 * US American {@link CountryArea}.
 */
@AbstractInterface
public interface UsArea extends CountryArea {

  @Override
  default StringProperty Country() {

    return GeoConstants.COUNTRY_FR;
  }

}
