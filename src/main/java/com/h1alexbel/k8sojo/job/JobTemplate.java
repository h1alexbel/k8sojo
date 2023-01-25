package com.h1alexbel.k8sojo.job;

import com.h1alexbel.k8sojo.Template;
import com.h1alexbel.k8sojo.TemplateSpec;
import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
@RequiredArgsConstructor
public final class JobTemplate implements Template {

  private final TemplateSpec spec;

  @Override
  public TemplateSpec spec() {
    return this.spec;
  }
}