package com.ymmihw.libraries.jasypt.simple;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceForJasyptSimple {
  @Value("${encryptedv2.property}")
  private String property;

  public String getProperty() {
    return property;
  }

  public String getPasswordUsingEnvironment(Environment environment) {
    return environment.getProperty("encryptedv2.property");
  }
}
