/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo;

import io.github.mmm.bean.BeanName;
import io.github.mmm.model.core.EntityWithCode;
import io.github.mmm.model.pim.address.EntityWithCountry;

/**
 * {@link EntityWithCountry} for a postal code.
 *
 * @since 1.0.0
 */
@BeanName("mmm.PostalCode")
public interface PostalCode extends CountryArea, EntityWithCode {

}
