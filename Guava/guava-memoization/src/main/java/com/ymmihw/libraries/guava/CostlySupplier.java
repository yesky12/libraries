package com.ymmihw.libraries.guava;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class CostlySupplier {

  public static BigInteger generateBigNumber() {
    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
    }
    return new BigInteger("12345");
  }

}
