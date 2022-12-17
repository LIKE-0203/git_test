package com.zzj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
        System.out.println("同一位置上，是来自master分支修改的内容");
        System.out.println("同一位置上，是来自test分支修改的内容");
        System.out.println("111");
        System.out.println("来GitHub上与本地不同的代码");
    }

}
