package com.yzq.manage.test.design_pattern.template;

/**
 * @description: 模板设计模式
 *
 * A:模版设计模式概述
        模版方法模式就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现
   B:优点和缺点
        a:优点
            使用模版方法模式，在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户灵活多变的需求
        b:缺点
            如果算法骨架有修改的话，则需要修改抽象类
 * @author: yanzhiqi
 * @create: 2018-07-31 19:30
 **/
public class TemplateDemo {

    public static void main(String[] args) {
        GetTimeDemo demo = new GetTimeDemo();
        Long time = demo.getTime();
        System.out.println(time);
    }
}

/**
 *  定义一个算法的骨架
 */
abstract class GetTimeTemplate{
    public final Long getTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        return end - start;
    }

    abstract void code();
}

/**
 * 具体的算法实现
 */
class GetTimeDemo extends GetTimeTemplate{

    @Override
    void code() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
    }
}
