package cn.edu.sdu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication(scanBasePackages = "cn.edu.sdu")
@MapperScan("cn.edu.sdu.dao")
@EnableScheduling   //开启定时任务
@EnableTransactionManagement  //开启事务支持
public class MistoreServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MistoreServerApplication.class, args);
    }

}
