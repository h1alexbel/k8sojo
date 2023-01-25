package com.h1alexbel.k8sojo;

import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
@RequiredArgsConstructor
public final class DcContainer implements Container {

  private final String name;
  private final String image;
  private final Iterable<String> commands;

  @Override
  public String name() {
    return this.name;
  }

  @Override
  public String image() {
    return this.image;
  }

  @Override
  public Iterable<String> commands() {
    return this.commands;
  }
}