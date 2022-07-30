/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * Base package for the Configuration building code
 *
 * 解析配置文件信息到Configuration对象中
 * 1.配置文件有mybatis的整体配置
 * 2.mapper映射的SQL配置文件（常见的xml形式）
 * 3.分别有xml方式和注解的模式
 *
 * BaseBuilder是基础，都是基于这个类进行扩展的
 */
package org.apache.ibatis.builder;
