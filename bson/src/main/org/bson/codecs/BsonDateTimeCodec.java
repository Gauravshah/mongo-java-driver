/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bson.codecs;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.types.BsonDateTime;

/**
 * A Codec for BsonDateTime instances.
 *
 * @since 3.0
 */
public class BsonDateTimeCodec implements Codec<BsonDateTime> {
    @Override
    public BsonDateTime decode(final BsonReader reader) {
        return new BsonDateTime(reader.readDateTime());
    }

    @Override
    public void encode(final BsonWriter writer, final BsonDateTime value) {
        writer.writeDateTime(value.getValue());
    }

    @Override
    public Class<BsonDateTime> getEncoderClass() {
        return BsonDateTime.class;
    }
}