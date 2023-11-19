/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.media.genre;

import io.github.mmm.bean.AbstractInterface;
import io.github.mmm.bean.BeanName;
import io.github.mmm.model.core.EntityWithCode;
import io.github.mmm.model.core.EntityWithName;
import io.github.mmm.model.core.TreeNode;

/**
 * {@link EntityWithName} that represents a genre. It is used to tag media such as audio tracks or movies.
 *
 * @param <T> type of the genre itself.
 * @since 1.0.0
 */
@BeanName("mmm.Genre")
@AbstractInterface
public interface Genre<T extends Genre<T>> extends TreeNode<T>, EntityWithCode, EntityWithName {

}
