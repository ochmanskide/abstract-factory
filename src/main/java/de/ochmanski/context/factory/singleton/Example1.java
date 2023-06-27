package de.ochmanski.context.factory.singleton;

public class Example1
{
  private static final Example1 instance = new Example1();

  private Example1()
  {
  }

  public static Example1 getInstance()
  {
    return instance;
  }

}
