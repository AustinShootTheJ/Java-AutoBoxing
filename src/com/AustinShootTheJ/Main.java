package com.AustinShootTheJ;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// ArrayLists do not support the use of primitive types by default. To counter act this we use some pre wrapped classes.
        // For each of the primitive types there is a class build into java ie: Integer.


        // Long way to autobox

        // This is an example of AutoBoxing. AutoBoxing is when we take a primitive type and convert it to a class. (Wrap it)
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
       // for(int i = 0; i<=10; i++){
         //   intArrayList.add(Integer.valueOf(i));
        //}

        // Unboxing is taking the class type and converting it back to a primitive data value. (Unwrapping)
        //for(int i = 0; i<=10; i++){
          //  System.out.println(i + " --> " + intArrayList.get(i).intValue());
        //}

        // Short WAY!

        Integer myIntValue = 56; // compiles as Integer.valueOf(56);
        int myInt = myIntValue; // myInt.intValue();




        Double myDouble = 12.25;
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        //boxing
        for(double dbl=0.0; dbl<=10.0; dbl+=0.5){
            myDoubleValues.add(dbl);
        }

        //unboxing.
        for (int i=0; i<myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }

    }
}
