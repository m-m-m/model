/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.address;

import io.github.mmm.bean.AbstractInterface;
import io.github.mmm.entity.bean.EntityBean;
import io.github.mmm.property.string.StringProperty;

/**
 * {@link EntityBean} for an entity that is associated with a {@link #Country()}.
 *
 * @since 1.0.0
 */
@AbstractInterface
public interface EntityWithCountry extends EntityBean {

  /**
   * @return the alpha-2 code of the associated country.
   */
  StringProperty Country();

}
