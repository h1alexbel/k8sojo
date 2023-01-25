package com.h1alexbel.k8sojo.job;

import com.h1alexbel.k8sojo.Container;
import com.h1alexbel.k8sojo.TemplateSpec;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
@RequiredArgsConstructor
public final class JobTemplateSpec implements TemplateSpec {

  private final Iterable<Container> containers;
  private final String policy;

  @Override
  public Iterable<Container> containers() {
    return this.containers;
  }

  @Override
  public String restartPolicy() {
    return this.policy;
  }
}