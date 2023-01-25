package com.h1alexbel.k8sojo;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
public interface Kojo {

  String apiVersion();

  String kind();

  Metadata meta();

  Spec spec();
}