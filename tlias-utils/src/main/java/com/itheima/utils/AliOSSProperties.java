package com.itheima.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss") //去寻找配置文件中的值
public class AliOSSProperties {
    private String endpoint;
    private String bucketName;
}
