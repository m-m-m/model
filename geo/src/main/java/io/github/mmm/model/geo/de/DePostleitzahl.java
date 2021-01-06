/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo.de;

import io.github.mmm.model.geo.PostalCode;

/**
 * German {@link PostalCode} called <em>postleitzahl</em>. It is a 5-digit number. German
 * {@link io.github.mmm.model.geo.City cities} and {@link PostalCode postal codes} have a many-to-many relation.
 * That means a {@link DePostleitzahl} can belong to multiple (smaller) cities ({@link DeGemeindeteil}) and also a
 * (bigger) German city can have multiple instances of {@link DePostleitzahl} associated.
 *
 * @since 1.0.0
 */
public interface DePostleitzahl extends PostalCode, DeArea {

}
