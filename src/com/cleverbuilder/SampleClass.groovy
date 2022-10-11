#!/usr/bin/env groovy
package com.cleverbuilder

class SampleClass {
   String name
   Integer age

   def increaseAge(Integer years) {
      this.age += years
   }

   def String callGet()
   {
        // GET
      def get = new URL("https://httpbin.org/get").openConnection();
      def getRC = get.getResponseCode();
      println(getRC);
      if(getRC.equals(200)) {
         println(get.getInputStream().getText());
      }
   }
}

 
