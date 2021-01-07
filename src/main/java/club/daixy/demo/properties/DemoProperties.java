/*
 * Copyright 2021 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package club.daixy.demo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author daixiaoyong
 * @date 2021/1/7 17:42
 * @description 配置信息
 */

@Data
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {

    private String sayWhat;

    private String toWho;
}