package org.example.lambda;

import org.example.functionalInterface.FunctionalInterfaceDemo;

public class LambdaExpressionDemo {
  // ()-> {}
  public static void main(String[] args) {
    /* FunctionalInterfaceDemo functionalInterfaceDemo  =
             () -> System.out.println("LambdaExpressionDemo");

     functionalInterfaceDemo.test();*/


//    FunctionalInterfaceDemo functionalInterfaceDemo  =    x -> System.out.println("the arguement passed to test method is "+x);
//
//
//      functionalInterfaceDemo.test(34);

     /* FunctionalInterfaceDemo functionalInterfaceDemo  =    ( x,  y) -> System.out.println("the arguement passed to test method are "+x +" and "+y);

      functionalInterfaceDemo.test(23,34);*/


      FunctionalInterfaceDemo functionalInterfaceDemo =  ( x,  y) -> x+y;


     int ans  = functionalInterfaceDemo.test(34,23);


      System.out.println(ans);
  }
}
