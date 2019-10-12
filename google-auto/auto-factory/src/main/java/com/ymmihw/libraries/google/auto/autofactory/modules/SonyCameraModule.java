package com.ymmihw.libraries.google.auto.autofactory.modules;

import javax.inject.Named;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.ymmihw.libraries.google.auto.autofactory.model.Camera;

/**
 * @author aiet
 */
public class SonyCameraModule extends AbstractModule {

  private static int SONY_CAMERA_SERIAL = 1;

  @Named("Sony")
  @Provides
  Camera cameraProvider() {
    return new Camera("Sony", String.format("%03d", SONY_CAMERA_SERIAL++));
  }

}