package com.h1alexbel.k8sojo.poc;

import com.h1alexbel.k8sojo.Container;
import com.h1alexbel.k8sojo.Metadata;
import com.h1alexbel.k8sojo.job.JobSpec;
import com.h1alexbel.k8sojo.job.JobTemplate;
import com.h1alexbel.k8sojo.job.JobTemplateSpec;
import com.jcabi.xml.XML;
import org.cactoos.list.ListOf;
import org.junit.jupiter.api.Test;
import org.xembly.Directives;
import org.xembly.ImpossibleModificationException;
import org.xembly.Xembler;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
class JobTest {

  @Test
  void xml() throws ImpossibleModificationException {
//    final String xml = new Xembler(
//      new Directives()
//        .add("root")
//        .add("apiVersion").set("batch/v1")
//        .up()
//        .add("kind").set("Job")
//        .up()
//        .add("metadata")
//        .add("name")
//        .up()
//        .up()
//        .add("spec")
//        .add("backoffLimit")
//        .up()
//        .add("template")
//        .add("spec")
//        .add("containers")
//        .add("name")
//        .up()
//        .add("image")
//        .up()
//        .add("command")
//    ).xml();
//    System.out.println(xml);
    Job job = new Job.Simple(
      new Metadata.Simple("realo-job"),
      new JobSpec(
        new JobTemplate(
          new JobTemplateSpec(
            new ListOf<>(new Container.Dc("name", "image",
              new ListOf<>("command")
            )
            ),
            "Never"
          )
        ),
        4
      )
    );
    final XML xml = job.asXml();
    System.out.println(xml);
  }
}