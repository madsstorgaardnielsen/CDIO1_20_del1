package com.company;

public class TerningeKast {

    public int getØjne() {

        //faceValue får en værdi alt efter hvilken værdi math.random finder frem til
        int faceValue = (int) (Math.random() * 6 + 1);
        return faceValue;
    }

}

