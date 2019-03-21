package com.mw.monster.innerclasses;

import sun.security.krb5.internal.crypto.Des;

/**
 * @author MwMonster
 * @Classname TestParcel
 * @Description TODO
 * @Date 2019/3/12 11:46
 */
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}

class Parcel4{
    private class PContents implements Contents{
        private int i = 11;

        @Override
        public int value(){
            return i;
        }
    }

    protected class PDestination implements Destination{

        private String label;

        private PDestination(String whereTo){
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContents();
    }
}
