package de.ochmanski.context.factory.service;

public final class IecTypeUtils
{

  /**
   * Manual alternative to #com.google.common.primitives.Longs.toByteArray()
   *
   * @param l long value to be converted to byte array
   * @return byte array for provided long value
   */
  public static byte[] longToBytes(long l)
  {
    byte[] result = new byte[Long.BYTES];
    for(int i = Long.BYTES - 1; i >= 0; i--)
    {
      result[i] = (byte)(l & 0xFF);
      l >>= Byte.SIZE;
    }
    return result;
  }

  /**
   * Manual alternative to #com.google.common.primitives.Longs.fromByteArray()
   *
   * @param b byte array to be converted to long
   * @return long for provided byte array
   */
  public static long bytesToLong(final byte[] b)
  {
    long result = 0;
    for(int i = 0; i < Long.BYTES; i++)
    {
      result <<= Byte.SIZE;
      result |= (b[i] & 0xFF);
    }
    return result;
  }

}
