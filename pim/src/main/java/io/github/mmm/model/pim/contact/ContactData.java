/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.contact;

import io.github.mmm.bean.PropertyMethod;
import io.github.mmm.entity.bean.EntityBean;
import io.github.mmm.model.pim.person.Person;
import io.github.mmm.property.builder.lang.StringPropertyBuilder;
import io.github.mmm.property.string.StringProperty;

/**
 * {@link EntityBean} for contact data. E.g. a {@link Person} may have one or multiple instances of {@link ContactData}
 * associated. The links may be classified with tags such as "work" or "home".
 *
 * @since 1.0.0
 */
public interface ContactData extends EntityBean {

  /** Classifier for work (business) information. */
  public static final String CLASSIFIER_WORK = "work";

  /** Classifier for home (private) information. */
  public static final String CLASSIFIER_HOME = "home";

  /** @return the optional phone number of the contact. */
  @PropertyMethod
  default StringProperty Phone() {

    return new StringPropertyBuilder(this).withValidator().phoneNumber().and().build("Phone");
  }

  /** @return the optional mobile phone number of the contact. */
  @PropertyMethod
  default StringProperty Mobile() {

    return new StringPropertyBuilder(this).withValidator().phoneNumber().and().build("Mobile");
  }

  /** @return the optional fax phone number of the contact. */
  @PropertyMethod
  default StringProperty Fax() {

    return new StringPropertyBuilder(this).withValidator().phoneNumber().and().build("Fax");
  }

  /** @return the optional email address of the contact. */
  @PropertyMethod
  default StringProperty Email() {

    return new StringPropertyBuilder(this).withValidator().email().and().build("Email");
  }

  /** @return the optional instant messaging link of the contact. */
  @PropertyMethod
  default StringProperty Messaging() {

    return new StringPropertyBuilder(this).withValidator().pattern("[a-z0-9]+:.*").and().build("Messaging");
  }

  /** @return the optional URL of the contact (e.g. company or private home page). */
  @PropertyMethod
  default StringProperty Url() {

    return new StringPropertyBuilder(this).withValidator().url().and().build("Url");
  }

}
