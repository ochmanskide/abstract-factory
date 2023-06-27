package de.ochmanski.context.factory.singleton;

public class Example2
{
  private static Example2 instance;

  private Example2()
  {
  }

  public static Example2 getInstance()
  {
    if(instance == null)
    {
      instance = new Example2();
    }

    return instance;
  }

}
