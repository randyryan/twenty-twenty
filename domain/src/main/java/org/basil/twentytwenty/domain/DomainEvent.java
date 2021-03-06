/*
 * Copyright (c) 2020 Li Wan
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.basil.twentytwenty.domain;

import java.io.Serializable;

/**
 * The Domain Event.
 *
 * A <em>Domain Event</em> is a representation of a fact that happened within the domain. <em>Domain
 * Event</em>s are serializable.
 *
 * @param <ID> type of the ID
 */
public interface DomainEvent<ID extends Id<?>> extends Serializable {

  /**
   * Returns the ID of the event.
   *
   * @return the ID of the event
   */
  ID getId();

  /**
   * Returns the version of the event.
   *
   * @return the version of the event
   */
  int getVersion();

}
