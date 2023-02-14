package com.h1alexbel.k8sojo.poc;

import com.h1alexbel.k8sojo.Metadata;
import com.h1alexbel.k8sojo.Spec;
import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import lombok.RequiredArgsConstructor;
import org.xembly.Directives;
import org.xembly.ImpossibleModificationException;
import org.xembly.Xembler;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
public interface Job {

  XML asXml() throws ImpossibleModificationException;

  @RequiredArgsConstructor
  final class Simple implements Job {

    private final Metadata metadata;
    private final Spec spec;

    @Override
    public XML asXml() throws ImpossibleModificationException {
      return new XMLDocument(
        new Xembler(
          new Directives()
            .add("root")
            .add("apiVersion").set("batch/v1")
            .up()
            .add("kind").set("Job")
            .up()
            .add("metadata")
            .add("name").set(this.metadata.name())
            .up()
            .up()
            .add("spec")
            .add("backoffLimit").set(this.spec.backoffLimit())
            .up()
            .add("template")
            .add("spec")
            .add("restartPolicy").set(this.spec.template().spec().restartPolicy())
            .up()
            .add("containers")
            .add("name").set("test")
            .up()
            .add("image").set("test")
            .up()
            .add("command").set("test")
        ).xml()
      );
    }
  }
}

// new Envelope(new Job().asXml()).yaml()