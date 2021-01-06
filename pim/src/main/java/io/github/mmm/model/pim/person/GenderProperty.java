/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.person;

import io.github.mmm.property.object.ObjectProperty;

/**
 * {@link ObjectProperty Property} for Gender.
 *
 * @since 1.0.0
 */
public class GenderProperty extends ObjectProperty<Gender> {

  /**
   * The constructor.
   */
  public GenderProperty() {

    this("Gender");
  }

  /**
   * The constructor.
   *
   * @param name the {@link #getName() name}.
   */
  public GenderProperty(String name) {

    super(name, Gender.class);
  }

}
