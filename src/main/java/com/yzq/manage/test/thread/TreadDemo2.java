package com.yzq.manage.test.thread;

/**
 * @description: 多线程实现方式2
 * 实现Runable接口，并重写run()方法
 * 好处:
 *      即使自己定义的线程类有了父类也没关系,因为有了父类也可以实现接口,而且接口是可以多实现的
 * 弊端:
 *      不能直接使用Thread中的方法需要先获取到线程对象后,才能得到Thread的方法,代码复杂
 * @author: yanzhiqi
 * @create: 2018-07-31 20:45
 **/
public class TreadDemo2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());//新增线程
        thread.start();                             //开启线程  调用start方法，有CPU的执行资格，但不一定有执行权

        /**匿名内部类实现*/
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    System.out.println(i+"#####################################匿名内部类");
                }
            }
        }).start();

        for (int i = 0; i < 2000; i++) {
            System.out.println(i+"#####################################MyRunnable");
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println(i+"+++++++++++++++++MyThread");
        }
    }
}
