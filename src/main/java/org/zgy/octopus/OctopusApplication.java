package org.zgy.octopus;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class OctopusApplication {
    public static void main(String[] args) {
        SpringApplication.run(OctopusApplication.class,args);
        log.info("项目启动成功...");
        log.info("如下：");
        log.info("http://localhost:8080/backend/index.html");
        System.out.println("手机端：http://localhost:8080/front/index.html");
    }

}
