package com.h1alexbel.k8sojo.poc;

import com.jcabi.xml.XML;
import org.yaml.snakeyaml.Yaml;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
public interface YamlXml {

  Yaml yaml(XML xml);
}