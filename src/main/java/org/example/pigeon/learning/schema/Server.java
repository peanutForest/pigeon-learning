package org.example.pigeon.learning.schema;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/schema/provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
