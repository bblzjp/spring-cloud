/*
 *  Copyright 2019 https://github.com/romeoblog/spring-cloud.git Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.dg.mall.inventory.controller;

import com.dg.mall.platform.common.model.ResultMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private final static Logger logger = LoggerFactory.getLogger(InventoryController.class);

    @Value("${server.port}")
    String serverPort;

    @RequestMapping(value = "/countInventory/{inventoryId}", produces = {"application/json"}, method = RequestMethod.GET)
    public ResultMsg<Integer> countInventory(@PathVariable(value = "inventoryId") Integer inventoryId) {
        logger.info("====请求端口：{}===", serverPort);
        return ResultMsg.ok(inventoryId);
    }

}