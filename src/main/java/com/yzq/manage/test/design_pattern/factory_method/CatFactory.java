package com.yzq.manage.test.design_pattern.factory_method;

/**
 * @description: dog工厂
 * @author: yanzhiqi
 * @create: 2018-07-31 19:17
 **/
public class CatFactory implements AnimalFatory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
