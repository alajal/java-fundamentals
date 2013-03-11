package org.zeroturnaround.jf2012.classloaders;

public class WhatIsMyClassLoader {
  public static void main(String[] args) {
    Class myClassLoader = WhatIsMyClassLoader.class.getClassLoader().getClass();
    System.out.print("My ClassLoader is: ");
    System.out.println(myClassLoader.getCanonicalName());

    System.out.print("The parent classloader is: ");
    System.out.println(myClassLoader.getClassLoader());
  }
}