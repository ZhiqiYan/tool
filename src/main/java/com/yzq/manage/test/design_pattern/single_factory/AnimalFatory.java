package com.yzq.manage.test.design_pattern.single_factory;

/**
 * @description: 动物工厂  用来创建动物对象
 * @author: yanzhiqi
 * @create: 2018-07-31 19:03
 **/
public class AnimalFatory {

    //以下方式会需要定义很多，复用性太差
    public static Dog createDog(){
        return new Dog();
    }

    public static Cat createCat(){
        return new Cat();
    }

    /***改进
     *  优点：客户端不需要在负责对象的创建，从而明确了各个类的职责
     *  缺点：这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类，不利于后期的维护
     * */
    public static Animal createAnimal(String animalName){
        Animal animal= null;
        if(animalName.equalsIgnoreCase("dog")){
            animal = new Dog();
        }else if (animalName.equalsIgnoreCase("cat")){
            animal = new Cat();
        }
        return animal;
    }
}
