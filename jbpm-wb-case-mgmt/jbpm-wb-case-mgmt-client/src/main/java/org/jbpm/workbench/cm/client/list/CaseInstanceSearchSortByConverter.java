/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.workbench.cm.client.list;

import org.jboss.errai.databinding.client.api.Converter;
import org.jbpm.workbench.cm.util.CaseInstanceSortBy;

public class CaseInstanceSearchSortByConverter implements Converter<CaseInstanceSortBy, String> {

    @Override
    public Class<CaseInstanceSortBy> getModelType() {
        return CaseInstanceSortBy.class;
    }

    @Override
    public Class<String> getComponentType() {
        return String.class;
    }

    @Override
    public CaseInstanceSortBy toModelValue(final String componentValue) {
        return CaseInstanceSortBy.valueOf(componentValue);
    }

    @Override
    public String toWidgetValue(final CaseInstanceSortBy modelValue) {
        return modelValue == null ? null : modelValue.name();
    }
}