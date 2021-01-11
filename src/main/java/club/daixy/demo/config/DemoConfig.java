package club.daixy.demo.config;

import club.daixy.demo.properties.DemoProperties;
import club.daixy.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author daixiaoyong
 * @date 2021/1/7 19:13
 * @description 配置类
 */

@Configuration
@EnableConfigurationProperties(DemoProperties.class)
@ConditionalOnProperty(
        prefix = "demo",
        name = "isOpen",
        havingValue = "true"
)
public class DemoConfig {
    @Autowired
    private DemoProperties demoProperties;

    @Bean
    public DemoService demoService() {
        return new DemoService(demoProperties.getSayWhat(), demoProperties.getToWho());
    }
}