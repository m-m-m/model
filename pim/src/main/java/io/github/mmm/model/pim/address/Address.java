/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.address;

import io.github.mmm.bean.Name;
import io.github.mmm.entity.bean.EntityBean;
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

  /**
   * @return the house number in the {@link #Street}. Typically numeric but can also be alpha-numeric (e.g. "6b" or
   *         "12½").
   */
  StringProperty StreetNumber();

  /**
   * @return the postal code (ZIP) of the {@link #City()}. The postal codes depend on the {@link #Country()}: Some
   *         countries do not have postal codes at all, some have strictly numeric and others have alpha-numeric ones.
   */
  StringProperty PostalCode();

  /**
   * @return the name of the city the {@link Address} is located in.
   */
  StringProperty City();

  /** @return the name of the region (state or provice) the {@link Address} is located in. */
  StringProperty Region();

}
