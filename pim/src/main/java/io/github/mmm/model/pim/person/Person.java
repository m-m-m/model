/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.pim.person;

import io.github.mmm.bean.AbstractInterface;
import io.github.mmm.bean.BeanName;
import io.github.mmm.entity.bean.EntityBean;
import io.github.mmm.entity.property.link.LinkProperty;
import io.github.mmm.model.pim.address.Address;
import io.github.mmm.model.pim.contact.ContactData;

/**
 * {@link EntityBean} for a person as a legal entity.
 *
 * @since 1.0.0
 */
@BeanName("mmm.Person")
@AbstractInterface
public interface Person extends EntityBean {

  /** @return the (primary) {@link Address} of this {@link Person}. */
  LinkProperty<Address> Address();

  /** @return the (primary) {@link ContactData} of this {@link Person}. */
  LinkProperty<ContactData> Contact();

}
