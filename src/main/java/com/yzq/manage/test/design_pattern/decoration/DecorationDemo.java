package com.yzq.manage.test.design_pattern.decoration;

/**
 * @description: 装饰设计模式
 * @author: yanzhiqi
 * @create: 2018-07-31 18:45
 *
 * 实现：
 *      step01：在包装类中定义被包装类的引用
 *      step02：在包装类的构造方法参数中传入被包装对象
 *      step03：增强被装饰的类
 *
 * 职责：动态的为一个对象增加新的功能
    装饰器模式是一种用于代替继承的技术，无需通过继承增加子类就能扩展对象的新功能。使用对象的关联关系代替继承关系，更加灵活，同时避免类型体系的快速膨胀。

 应用场景：
    1.IO中BuffredReader和BufferedWriter的设计
    2.servlet API中request对象默认实现了ServletRequestWrapper类增强了ServletRequest类的方法
    3.Struts2中，request，response，session对象的处理
 **/
public class DecorationDemo {

    public static void main(String[] args) {
        CommenCoder commonCoder = new CommenCoder();
        commonCoder.code();     //被装饰类的方法
        System.out.println("=====================================");
        Coder supperCoder = new SupperCoder(commonCoder);
        supperCoder.code();     //装饰类的方法
    }

}


