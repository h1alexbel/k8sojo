package com.h1alexbel.k8sojo.job;

import com.h1alexbel.k8sojo.Spec;
import com.h1alexbel.k8sojo.Template;
import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
@RequiredArgsConstructor
public final class JobSpec implements Spec {

  private final Template template;
  private final int backoff;

  @Override
  public Template template() {
    return this.template;
  }

  @Override
  public int backoffLimit() {
    return this.backoff;
  }
}