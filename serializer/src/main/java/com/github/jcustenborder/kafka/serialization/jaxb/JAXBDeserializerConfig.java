/**
 * Copyright © 2017 Jeremy Custenborder (jcustenborder@gmail.com)
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
package com.github.jcustenborder.kafka.serialization.jaxb;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

import java.util.Map;

class JAXBDeserializerConfig extends AbstractConfig {

  public final Class<?> deserializedClass;

  public static final String DESERIALIZED_CLASS_CONF = "deserialized.class";
  static final String DESERIALIZED_CLASS_DOC = "";

  public JAXBDeserializerConfig(Map<String, ?> originals) {
    super(config(), originals);
    this.deserializedClass = getClass(DESERIALIZED_CLASS_CONF);
  }

  public static ConfigDef config() {
    return new ConfigDef()
        .define(DESERIALIZED_CLASS_CONF, ConfigDef.Type.CLASS, ConfigDef.Importance.LOW, DESERIALIZED_CLASS_DOC);
  }
}
