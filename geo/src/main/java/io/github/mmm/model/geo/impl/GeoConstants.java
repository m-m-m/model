/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.impl;

import io.github.mmm.property.PropertyMetadata;
import io.github.mmm.property.string.StringProperty;

/**
 * Internal constants of this module.
 *
 * @since 1.0.0
 */
public class GeoConstants {

  public static final StringProperty COUNTRY_DE = new StringProperty("Country",
      PropertyMetadata.ofExpression(() -> "DE"));

  public static final StringProperty COUNTRY_FR = new StringProperty("Country",
      PropertyMetadata.ofExpression(() -> "FR"));

  public static final StringProperty COUNTRY_IE = new StringProperty("Country",
      PropertyMetadata.ofExpression(() -> "IE"));

  public static final StringProperty COUNTRY_US = new StringProperty("Country",
      PropertyMetadata.ofExpression(() -> "US"));

}
