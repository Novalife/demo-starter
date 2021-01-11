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