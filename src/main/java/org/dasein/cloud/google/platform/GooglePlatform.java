/**
 * Copyright (C) 2012-2015 Dell, Inc
 * See annotations for authorship information
 *
 * ====================================================================
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
 * ====================================================================
 */

package org.dasein.cloud.google.platform;

import javax.annotation.Nonnull;

import org.dasein.cloud.google.Google;
import org.dasein.cloud.platform.AbstractPlatformServices;

public class GooglePlatform extends AbstractPlatformServices<Google> {

    public GooglePlatform(Google provider) {
        super(provider);
    }

    @Override
    public @Nonnull RDS getRelationalDatabaseSupport() {
        return new RDS(getProvider());
    }
}
