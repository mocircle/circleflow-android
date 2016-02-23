/*
 * Copyright (C) 2016 mocircle.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mocircle.flow.model.signal;

import java.util.Map;

/**
 * A {@link Signal} that passes in mobile device level, which means it can cross apps.
 */
public class DeviceEvent extends Signal {

    public DeviceEvent() {
    }

    public DeviceEvent(String name) {
        this.name = name;
    }

    public DeviceEvent(String name, Map<String, Object> data) {
        this.name = name;
        this.data = data;
    }

}