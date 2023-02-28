/*
 * Copyright 2022-2023 Bytedance Ltd. and/or its affiliates.
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

package com.bytedance.bitsail.test.e2e;

import com.bytedance.bitsail.common.configuration.BitSailConfiguration;

import org.junit.Test;

import java.io.File;
import java.nio.file.Paths;

public class SftpToPrintE2ETest extends AbstractE2ETest {

  /**
   * todo: add test for type date and timestamp
   */
  @Test
  public void testSftpToPrint() throws Exception {
    BitSailConfiguration jobConf = BitSailConfiguration.from(
        new File(Paths.get(getClass().getClassLoader()
            .getResource("sftp_to_print.json")
            .toURI()).toString()));
    submitJob(jobConf, "test_sftp_to_print");
  }
}