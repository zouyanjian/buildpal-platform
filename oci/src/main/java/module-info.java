/*
 * Copyright 2017 Buildpal
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

module io.buildpal.oci {
    exports io.buildpal.oci;
    provides io.buildpal.core.pipeline.Plugin with io.buildpal.oci.DockerClientVerticle;

    requires jdk.unsupported;

    requires vertx.core;
    requires vertx.web;

    requires static io.netty.transport.epoll;
    //requires static io.netty.transport.kqueue;

    requires io.buildpal.core;
}