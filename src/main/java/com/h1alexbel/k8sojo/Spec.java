package com.h1alexbel.k8sojo;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
public interface Spec {

  Template template();

  int backOffLimit();
}