package de.ochmanski.context.factory.singleton;

public class Example4
{
  private static Example4 instance;

  private Example4()
  {
  }

  public static Example4 getInstance()
  {
    if(instance == null)
    {
      synchronized(Example4.class)
      {
        if(instance == null)
        {
          instance = new Example4();
        }
      }
    }

    return instance;
  }

}
