package de.ochmanski.context.factory.singleton;

public class Example3
{
  private static Example3 instance;

  private Example3()
  {
  }

  public synchronized static Example3 getInstance()
  {
    if(instance == null)
    {
      instance = new Example3();
    }

    return instance;
  }

}
