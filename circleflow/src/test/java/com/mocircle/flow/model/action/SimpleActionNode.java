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

package com.mocircle.flow.model.action;

import com.mocircle.flow.model.Token;

import java.util.Map;

public class SimpleActionNode extends ActionNode {

    private String type;
    private Map<String, Object> data;

    public SimpleActionNode() {
    }

    public SimpleActionNode(String type) {
        this.type = type;
    }

    public SimpleActionNode(String type, Map<String, Object> data) {
        this.type = type;
        this.data = data;
    }

    @Override
    public Token execute() {
        return new Token(type, data);
    }
}
