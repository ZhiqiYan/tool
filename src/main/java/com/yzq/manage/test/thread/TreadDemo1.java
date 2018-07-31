package com.yzq.manage.test.thread;

/**
 * @description: 多线程实现方式1
 * 继承Thread类，并重写run()方法
 * 好处:
 *      可以直接使用Thread类中的方法,代码简单
 * 弊端:
 *      如果已经有了父类,就不能用这种方法
 * @author: yanzhiqi
 * @create: 2018-07-31 20:45
 **/
public class TreadDemo1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();     //新增线程
        myThread.start();   //开启线程  调用start方法，有CPU的执行资格，但不一定有执行权

        /**匿名内部类实现多线程*/
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 2000; i++) {
                    System.out.println(i+"#####################################匿名内部类");
                }
            }
        }.start();

        for (int i = 0; i < 2000; i++) {
            System.out.println(i+"#####################################MainThread");
        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+"+++++++++++++++++MyThread");
        }
    }
}


