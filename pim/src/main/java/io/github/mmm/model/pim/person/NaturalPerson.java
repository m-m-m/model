/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.person;

import io.github.mmm.property.string.StringProperty;
import io.github.mmm.property.temporal.localdate.LocalDateProperty;

/**
 * {@link Person} that is a natural person (human being).
 *
 * @since 1.0.0
 */
public interface NaturalPerson extends Person {

  /** @return the {@link Gender} of this person. */
  GenderProperty Gender();

  /** @return the official or academic title of the person. */
  StringProperty Title();

  /** @return the first name of this person. */
  StringProperty FirstName();

  /** @return the middle name(s) of this person. */
  StringProperty MiddleNames();

  /** @return the last name of this person. */
  StringProperty LastName();

  /** @return the date of birth of this person. */
  LocalDateProperty Birthday();

}
