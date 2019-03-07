package com.mw.monster.innerclasses;

/**
 * @author MwMonster
 * @Classname DotNew
 * @Description TODO
 * @Date 2019/3/6 15:15
 */
public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
