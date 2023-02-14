//package com.h1alexbel.k8sojo.job;
//
//import com.h1alexbel.k8sojo.Container;
//import com.h1alexbel.k8sojo.Job;
//import com.h1alexbel.k8sojo.Metadata;
//import java.io.IOException;
//import org.cactoos.list.ListOf;
//import org.junit.jupiter.api.Test;
//
//class JobKojoTest {
//
//  @Test
//  void apiVersion() {
////    final Job job = new JobKojo(
////      new Metadata.Simple("nginx-proxy"),
////      new JobSpec(
////        new JobTemplate(
////          new JobTemplateSpec(
////            new ListOf<>(
////              new Container.Dc(
////                "job-nginx",
////                "nignx",
////                new ListOf<>("entry.sh")
////              )
////            ),
////            "Never"
////          )
////        ),
////        4
////      )
////    ).apply();
//  }
//
//  @Test
//  void kind() throws IOException {
////    final Kojo job = new JobKojo(
////      new Metadata.Simple("nginx-proxy"),
////      new JobSpec(
////        new JobTemplate(
////          new JobTemplateSpec(
////            new ListOf<>(
////              new Container.Dc(
////                "job-nginx",
////                "nignx",
////                new ListOf<>("entry.sh")
////              )
////            ),
////            "Never"
////          )
////        ),
////        4
////      )
////    );
//    Job job = new Job.Simple(
//      new Metadata.Simple("realo"),
//      new JobSpec(
//        new JobTemplate(
//          new JobTemplateSpec(
//            new ListOf<>(
//              new Container.Dc("realo", "abialiauski/realo",
//                new ListOf<>("entry.sh")
//              )
//            ),
//            "Never"
//          )
//        ),
//        4
//      )
//    );
//  }
//
//  @Test
//  void meta() {
//  }
//
//  @Test
//  void spec() {
//  }
//}