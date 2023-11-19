/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo;

import io.github.mmm.bean.BeanName;
import io.github.mmm.bean.Mandatory;
import io.github.mmm.model.core.EntityWithName;
import io.github.mmm.property.number.integers.IntegerProperty;
import io.github.mmm.property.pattern.PatternProperty;
import io.github.mmm.property.string.StringProperty;

/**
 * {@link EntityWithName} for a country of the world.
 *
 * @since 1.0.0
 */
@BeanName("mmm.Country")
public interface Country extends EntityWithName {

  /**
   * @return the ISO 3166-1 alpha-2 code of this {@link Country} (e.g. "GB" for UK). Converted to lower-case and
   *         prefixed with a dot this results in the top-level domain (TLD) (e.g. ".gb" for UK).
   */
  @Mandatory
  StringProperty CodeAlpha2();

  /** @return the ISO 3166-1 alpha-3 code of this {@link Country} (e.g. "GBR" for UK). */
  @Mandatory
  StringProperty CodeAlpha3();

  /** @return the ISO 3166-1 numeric (3-digit) code of this {@link Country} (e.g. "826" for UK). */
  @Mandatory
  IntegerProperty CodeNumeric();

  /**
   * @return the regular expression pattern for the postal codes in this {@link Country} (e.g.
   *         "[A-Z][A-Z]?[0-9]{1-2}[A-Z]?[0-9][A-Z]{2}" for UK).
   */
  @Mandatory
  PatternProperty PostalCodePattern();

  /**
   * @return the <a href="https://en.wikipedia.org/wiki/List_of_country_calling_codes">county calling code</a> of this
   *         {@link Country} (e.g. "+44" for UK).
   */
  @Mandatory
  StringProperty CallingCode();

}
