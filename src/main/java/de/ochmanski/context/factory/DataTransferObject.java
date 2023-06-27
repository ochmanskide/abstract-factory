package de.ochmanski.context.factory;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.math.BigInteger;

@Value
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
public class DataTransferObject
{

  BigInteger value;
  String a, b, c;
  int d, e, f;

}
