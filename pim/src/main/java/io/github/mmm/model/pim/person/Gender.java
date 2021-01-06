/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.person;

/**
 * {@link Enum} with the possible values of a gender. It may differ from the sex of a person due to personal identity.
 */
public enum Gender {

  /** A male (masculin) gender. */
  Male,

  /** A female (feminin) gender. */
  Female,

  /** A gender that is other than {@link #Male} or {@link #Female} (transgender, intersex, etc.). */
  Other

}
