// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package net.sourceforge.eclipsejetty.jetty8;

import java.util.Collection;

import net.sourceforge.eclipsejetty.jetty7.Jetty7LibStrategy;

/**
 * Resolve libs for Jetty 8
 * 
 * @author Christian K&ouml;berl
 * @author Manfred Hantschel
 */
public class Jetty8LibStrategy extends Jetty7LibStrategy
{

    protected void addWebsocketDependencies(Collection<String> dependencies) {
        dependencies.add(".*/jetty-continuation-.*\\.jar");
        dependencies.add(".*/jetty-websocket-.*\\.jar");
    }

}
