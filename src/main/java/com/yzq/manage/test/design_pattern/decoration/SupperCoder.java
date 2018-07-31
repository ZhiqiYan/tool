package com.yzq.manage.test.design_pattern.decoration;

public class SupperCoder implements Coder{

    private CommenCoder commenCoder;        //被装饰类的引用

    public SupperCoder(CommenCoder commenCoder){        //将被装饰类的对象作为参数传入装饰类的构造方法中
        this.commenCoder = commenCoder;
    }

    @Override
    public void code() {
       commenCoder.code();
        System.out.println("I am a supper coder");      //对被包装的方法进行装饰
    }
}


