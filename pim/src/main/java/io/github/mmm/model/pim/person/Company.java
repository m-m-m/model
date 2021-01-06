/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.person;

import io.github.mmm.bean.Mandatory;
import io.github.mmm.model.core.EntityWithName;
import io.github.mmm.property.string.StringProperty;

/**
 * {@link Person} that is not natural but a company as legal entity.
 *
 * @since 1.0.0
 */
public interface Company extends Person, EntityWithName {

  /** @return the official company name. */
  @Override
  @Mandatory
  StringProperty Name();

}
