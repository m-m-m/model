/*
 * Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
/**
 * Provides entity classes for personal information management (PIM) data-model.
 */
module io.github.mmm.model.pim {

  requires transitive io.github.mmm.model.core;

  exports io.github.mmm.model.pim.address;

  exports io.github.mmm.model.pim.contact;

  exports io.github.mmm.model.pim.person;

}
