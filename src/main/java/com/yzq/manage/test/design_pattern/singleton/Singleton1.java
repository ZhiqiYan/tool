package com.yzq.manage.test.design_pattern.singleton;

/**
 * @description: 单例设计模式  饿汉式
 *  这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，这时候初始化instance显然没有达到lazy loading的效果。
 * @author: yanzhiqi
 * @create: 2018-07-31 18:06
 **/
public class Singleton1 {
    private Singleton1(){};
    private static Singleton1 singleton1 = new Singleton1();
    public static Singleton1 getInstance(){
        return singleton1;
    }
}

/***
 * 单例设计模式  饿汉式（变种）
 * 表面上看起来差别挺大，实际上与上面的恶汉式差别不大，都是在类初始化即实例化instance
 */
class Singleton2 {
    private static Singleton2 singleton2 = null;
    static {
        singleton2 = new Singleton2();
    }
    private Singleton2(){};
    public static Singleton2 getInstance(){
        return singleton2;
    }
}

/***
 * 单例设计模式  静态内部类
 *
 * 这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程，
 * 它跟上面两种饿汉式不同的是（很细微的差别）：
 *      上面两种饿汉式是只要Singleton类被装载了，那么instance就会被实例化（没有达到lazy loading效果），
 *      而这种方式是Singleton类被装载了，instance不一定被初始化。
 *      因为SingletonHolder类没有被主动使用，只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance。
 *
 * 优点：
 * 如果实例化instance很消耗资源，我想让他延迟加载，
 * 另外一方面，我不希望在Singleton类加载时就实例化，
 * 因为我不能确保Singleton类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化instance显然是不合适的。
 */
class Singleton6 {
    private static class SigletonHolder{
        private static final Singleton6 singleton6 = new Singleton6();
    }

    private Singleton6(){}

    private static Singleton6 getInstance(){
        return SigletonHolder.singleton6;
    }
}
