/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.address;

import io.github.mmm.bean.Name;
import io.github.mmm.entity.bean.EntityBean;
import io.github.mmm.model.pim.geo.City;
import io.github.mmm.model.pim.geo.PostalCode;
import io.github.mmm.model.pim.geo.Region;
import io.github.mmm.property.string.StringProperty;

/**
 * {@link EntityBean} for a postal address.
 *
 * @since 1.0.0
 */
@Name("mmm.Address")
public interface Address extends EntityWithCountry {

  /** @return the name of the street this {@link Address} is located in. */
  StringProperty Street();

  /** @return the house number in the {@link #Street}. */
  StringProperty StreetNumber();

  /**
   * @return the {@link PostalCode#Code() postal code} (ZIP) of the {@link #City()}.
   */
  StringProperty PostalCode();

  /**
   * @return the {@link City#Name name} of the {@link City} the {@link Address} is located in.
   */
  StringProperty City();

  /** @return the {@link Region#Name name} of the {@link Region} the {@link Address} is located in. */
  StringProperty Region();

}
