package com.mw.monster.innerclasses;

/**
 * @author MwMonster
 * @Classname DotThis
 * @Description TODO
 * @Date 2019/3/6 15:11
 */
public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }

    public class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
