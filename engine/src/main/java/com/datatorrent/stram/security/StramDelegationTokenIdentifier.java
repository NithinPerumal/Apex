/**
 * Copyright (C) 2015 DataTorrent, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datatorrent.stram.security;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.security.token.delegation.AbstractDelegationTokenIdentifier;

/**
 * <p>StramDelegationTokenIdentifier class.</p>
 *
 * @since 0.3.2
 */
public class StramDelegationTokenIdentifier extends AbstractDelegationTokenIdentifier
{
  public static final Text IDENTIFIER_KIND = new Text("DT_DELEGATION_TOKEN");

  public StramDelegationTokenIdentifier() {
  }

  public StramDelegationTokenIdentifier(Text owner, Text renewer, Text realUser) {
    super(owner, renewer, realUser);
  }

  @Override
  public Text getKind()
  {
    return IDENTIFIER_KIND;
  }

}
