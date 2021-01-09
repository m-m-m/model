/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.geo;

import io.github.mmm.model.geo.de.DeBundesland;
import io.github.mmm.model.geo.fr.FrRegion;
import io.github.mmm.model.geo.us.UsState;

/**
 * A {@link Region} is an {@link CountryArea} a {@link Country} is divided into on the highest administrative level. In
 * most countries these regions are typically called either state or province. They typically represent NUTS
 * (nomenclature des unités territoriales statistiques) level 1. Here are some common examples:
 * <table border="1">
 * <tr>
 * <th>{@link Country}</th>
 * <th>{@link Region}</th>
 * </tr>
 * <tr>
 * <td>USA</td>
 * <td>{@link io.github.mmm.model.geo.us.UsState State}</td>
 * </tr>
 * <tr>
 * <td>Germany</td>
 * <td>{@link io.github.mmm.model.geo.de.DeBundesland Bundesland}</td>
 * </tr>
 * <tr>
 * <td>France</td>
 * <td>{@link io.github.mmm.model.geo.fr.FrRegion Region}</td>
 * </tr>
 * <tr>
 * <td>Ireland</td>
 * <td>{@link io.github.mmm.model.geo.ie.IeCounty County}</td>
 * </tr>
 * </table>
 * So for the USA this is a {@link UsState state}, for Germany this is a {@link DeBundesland Bundesland} and for France
 * it is a {@link FrRegion Region}.
 *
 * @since 1.0.0
 */
public interface Region extends CountryArea {

}
