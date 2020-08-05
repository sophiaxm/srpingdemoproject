package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/myconfig/myconfig.properties")
public class SpringDemoApplication {
    public static void main(String[] args) {
	//启动操作
	// 憋人修改的代码
        //组员a修改
        //组员b的修改


        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
