package org.owasp.webgoat.container.asciidoc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Make environment available in the asciidoc code (which you cannot inject because it is handled by
 * the frameworks)
 */
@Component
public class EnvironmentExposure implements ApplicationContextAware {

  private static ApplicationContext context;

  public static Environment getEnv() {
    return (null != context) ? context.getEnvironment() : null;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    context = applicationContext;
  }
}
