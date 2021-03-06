/*
 * Copyright 2009-2013 Cloud Castle Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudcastlegroup.digitaloceanplugin.apiclient;

import org.jetbrains.annotations.NotNull;

/**
 * User: graf
 * Date: 09/12/13
 * Time: 14:42
 */
public class SshKey extends DigitalOceanObject {

  private String name;

  public static SshKey findByName(@NotNull final SshKey[] sshKeys, @NotNull final String name) {
    if (name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }

    for (SshKey sshKey : sshKeys) {
      if (name.equals(sshKey.getName())) {
        return sshKey;
      }
    }

    return null;
  }

  public String getName() {
    return name;
  }
}
