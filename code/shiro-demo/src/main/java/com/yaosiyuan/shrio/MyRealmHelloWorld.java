package com.yaosiyuan.shrio;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * @ClassName MyRealmHelloWorld
 * @Description TODO
 * @Author yaosiyuan
 * @Date 2019/4/21 20:37
 * @Version 1.0
 **/
public class MyRealmHelloWorld {
    public static void main(String[] args) {
        //1.创建SecurityManager
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");
        SecurityManager securityManager = factory.getInstance();


        SecurityUtils.setSecurityManager(securityManager);

        //2.获取Subject对象
        Subject subject = SecurityUtils.getSubject();
    }
}
