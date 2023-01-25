package com.h1alexbel.k8sojo.job;

import com.h1alexbel.k8sojo.Metadata;
import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
@RequiredArgsConstructor
public class JobMetadata implements Metadata {

  private final String name;

  @Override
  public String name() {
    return this.name;
  }
}