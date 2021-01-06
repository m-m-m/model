/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo;

import io.github.mmm.bean.AbstractInterface;
import io.github.mmm.model.core.EntityWithName;
import io.github.mmm.model.core.location.Area;
import io.github.mmm.model.pim.address.EntityWithCountry;

/**
 * An {@link Area} that has a {@link #Name()}. It represents a part of the world as a political {@link Area}.
 *
 * @since 1.0.0
 */
@AbstractInterface
public interface CountryArea extends Area, EntityWithName, EntityWithCountry {

}
