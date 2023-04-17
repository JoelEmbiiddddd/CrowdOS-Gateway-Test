package cn.crowdos.gateway;

/**
 * @File : CrowdosGatewayTestApplication.java
 * @Author : LiXin Huang, NWPU
 * @Desc :
 * @Email : iHuanglixin@outlook.com
 */

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Configurable
@EnableDubbo
public class CrowdosGatewayTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrowdosGatewayTestApplication.class, args);
    }

}
