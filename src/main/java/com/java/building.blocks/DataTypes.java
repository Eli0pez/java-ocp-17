package com.java.building.blocks;

import java.rmi.server.LogStream;

public class DataTypes {

    public static void main(String[] args) {
        longValues();
        floatValues();
        casting();

        /*You can add underscores anywhere except at the beginning of a literal, the end of a literal,
        right before a decimal point, or right after a decimal point.
        You can even place multiple underscore characters next to each other, although we don't recommend it*/
    }

    private static void longValues(){

        /* A long requires the letter l or L following the number so Java knows it is a long.
        Without an l or L, Java interprets a number without a decimal point as an int in most scenarios.

        *   You could add a lowercase l to the number. But please use the uppercase L.
            The lowercase l looks like the number 1.
        */
        //long max = 3123456789;  //DOES NOT COMPILE
        long max = 3123456789L; //COMPILE
        long max2 = 312_345_6789L; //COMPILE
        System.out.println(max);;
    }

    private static void floatValues(){

        /*A float requires the letter f or F following the number so Java knows it is a float.
        Without an f or F, Java interprets a decimal value as a double.*/

        /*  Float value = 123.4555555555555; //DOES NOT COMPILE
            Float value = 123.00; //DOES NOT COMPILE*/
        float value = 45_555.555_555_555_55F;

        System.out.println(value);;
    }


    private static void casting(){
        /*valueOf() variant that converts a String into the wrapper class*/
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");
        System.out.println("Is Integer = "+wrapper);

    }



}
