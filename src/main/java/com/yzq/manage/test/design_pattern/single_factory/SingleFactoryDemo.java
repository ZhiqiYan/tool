package com.yzq.manage.test.design_pattern.single_factory;

/**
 * @description: 简单工厂设计模式
 *  优点：客户端不需要在负责对象的创建，从而明确了各个类的职责
 *  缺点：这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类，不利于后期的维护
 * @author: yanzhiqi
 * @create: 2018-07-31 19:00
 **/
public class SingleFactoryDemo {
    public static void main(String[] args) {
        AnimalFatory.createCat().eat();

        AnimalFatory.createDog().eat();

        AnimalFatory.createAnimal("dog").eat();
        AnimalFatory.createAnimal("cat").eat();
    }
}
