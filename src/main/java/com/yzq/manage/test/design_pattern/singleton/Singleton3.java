package com.yzq.manage.test.design_pattern.singleton;

/**
 * @description: 单例设计模式  懒汉式  线程不安全
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * @author: yanzhiqi
 * @create: 2018-07-31 18:06
 **/
public class Singleton3 {
    private static Singleton3 singleton3;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(singleton3 == null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}

/***
 * 单例设计模式  懒汉式  线程安全
 * 这种写法在getInstance()方法中加入了synchronized锁。
 * 能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，
 * 但是效率很低（因为锁），并且大多数情况下不需要同步。
 */
class Singleton4 {
    private static Singleton4 singleton4 ;
    private Singleton4(){}
    public static synchronized Singleton4 getInstance(){
        if(singleton4 == null){
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}

/**
 * 单例设计模式  双重校验锁
 *      在JDK1.5之后，双重检查锁定才能够正常达到单例效果
 * volatile特点：
 *      1.保证此变量对所有的线程的可见性，当一个线程修改了这个变量的值，volatile 保证了新值能立即同步到主内存，以及每次使用前立即从主内存刷新。
 *      2.禁止指令重排序优化。
 *          什么是指令重排序：是指CPU采用了允许将多条指令不按程序规定的顺序分开发送给各相应电路单元处理
 *
 * volatile 性能：
 　　volatile 的读性能消耗与普通变量几乎相同，但是写操作稍慢，因为它需要在本地代码中插入许多内存屏障指令来保证处理器不发生乱序执行。
 */
class Singleton5 {
    private volatile static Singleton5 singleton5;      //第一重锁
    private Singleton5(){}
    public static Singleton5 getInstance(){
        if(singleton5 == null){
            synchronized (Singleton5.class){            //第二重锁
                singleton5 = new Singleton5();
            }
        }
        return singleton5;
    }
}


