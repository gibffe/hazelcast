/*
 * Copyright (c) 2008-2012, Hazel Bilisim Ltd. All Rights Reserved.
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

package com.hazelcast.spi;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public abstract class AbstractOperation extends Operation {

    @Override
    public void afterRun() throws Exception {
    }

    @Override
    public void beforeRun() throws Exception {
    }

    @Override
    public boolean returnsResponse() {
        return true;
    }

    @Override
    public Object getResponse() {
        return null;
    }

    @Override
    protected void writeInternal(DataOutput out) throws IOException {
    }

    @Override
    protected void readInternal(DataInput in) throws IOException {
    }
}