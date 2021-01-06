/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.de;

import io.github.mmm.entity.property.id.IdProperty;
import io.github.mmm.model.geo.Region;

/**
 * German {@link Region} called <em>Bundesland</em> (see
 * <a href="https://en.wikipedia.org/wiki/States_of_Germany">States of Germany</a>). Germany is divided into 16 such
 * regions.
 *
 * @since 1.0.0
 */
public interface DeBundesland extends Region {

  /** @return the capital city of this {@link DeBundesland}. */
  IdProperty<DeGemeinde> Capital();

}
