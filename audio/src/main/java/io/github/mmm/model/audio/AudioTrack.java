/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.mmm.model.audio;

import io.github.mmm.entity.property.id.IdProperty;
import io.github.mmm.model.core.EntityWithName;
import io.github.mmm.model.media.artist.Artist;
import io.github.mmm.property.number.integers.IntegerProperty;
import io.github.mmm.property.string.StringProperty;

/**
 * The metadata of an audio track such as a song, movement of a symphony, section of an audio-book, etc.
 *
 * @since 1.0.0
 */
public interface AudioTrack extends EntityWithName {

  /**
   * @return the optional average number of beats per minute.
   */
  IntegerProperty Bpm();

  /**
   * @return the {@link AudioGenre genre} of the track.
   */
  IdProperty<AudioGenre> Genre();

  /**
   * @return the musical key of the track. Value will be empty if no music, not in a main key, or unknown.
   */
  StringProperty MusicalKey();
  //
  // /**
  // * @return the primary {@link Language} of the track. Value will be empty if undefined, or if in no language (e.g.
  // * instrumantal).
  // */
  // LinkProperty<Language> PrimaryLanguage;
  //
  // /**
  // * @return the list of optional additional {@link Language}s of the track. Sometimes a song has verses in different
  // * languages or the refrain is in a different language. In that case all {@link Language}s in addition to the
  // * {@link #PrimaryLanguage() primary language} should be listed here.
  // */
  // LinkListProperty<Language> AdditionalLanguages;

  /**
   * @return the {@link Artist} who performed this track.
   */
  IdProperty<Artist> Artist();

  /**
   * @return the optional {@link Artist} who composed this track. Should only be set if different from
   *         {@link #Artist()}.
   */
  IdProperty<Artist> Composer();

}
