package com.h1alexbel.k8sojo.job;

import com.h1alexbel.k8sojo.Container;
import com.h1alexbel.k8sojo.DcContainer;
import com.h1alexbel.k8sojo.Kojo;
import com.h1alexbel.k8sojo.Metadata;
import com.h1alexbel.k8sojo.Spec;
import java.util.List;
import lombok.RequiredArgsConstructor;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
@RequiredArgsConstructor
public final class JobKojo implements Kojo {

  private final Metadata metadata;
  private final Spec spec;

  @Override
  public String apiVersion() {
    return "batch/v1";
  }

  @Override
  public String kind() {
    return "Job";
  }

  @Override
  public Metadata meta() {
    return this.metadata;
  }

  @Override
  public Spec spec() {
    return this.spec;
  }
}

class T {
  public static void main(String[] args) {
    final Container realo = new DcContainer("realo", "abialiauski/realo", List.of("-java"));
    Kojo kojo = new JobKojo(
      new JobMetadata("realo-job"),
      new JobSpec(
        new JobTemplate(
          new JobTemplateSpec(
            List.of(realo), "Never"
          )
        ),
        4)
    );
    System.out.println(kojo.apiVersion());
  }
}