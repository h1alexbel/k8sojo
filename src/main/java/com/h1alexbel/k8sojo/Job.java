///*
// *  Copyright (c) 2022 Aliaksei Bialiauski
// *
// * Permission is hereby granted, free of charge, to any person obtaining a copy
// * of this software and associated documentation files (the "Software"), to deal
// * in the Software without restriction, including without limitation the rights
// * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// * copies of the Software, and to permit persons to whom the Software is
// * furnished to do so, subject to the following conditions:
// *
// * The above copyright notice and this permission notice shall be included in all
// * copies or substantial portions of the Software.
// *
// * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// * SOFTWARE.
// */
//
//package com.h1alexbel.k8sojo;
//
//import com.h1alexbel.k8sojo.yml.YamlJob;
//import com.h1alexbel.k8sojo.yml.YamlMetadata;
//import com.h1alexbel.k8sojo.yml.YamlSpec;
//import com.h1alexbel.k8sojo.yml.YamlTemplate;
//import lombok.RequiredArgsConstructor;
//
///**
// * Kubernetes Object.
// *
// * @author Aliaksei Bialiauski (abialiauski@solvd.com)
// * @since 0.0.1
// */
//public interface Job {
//
//  Job apply();
//
//  /**
//   * Api version.
//   *
//   * @return api version as string
//   */
//  String apiVersion();
//
//  /**
//   * Kind.
//   *
//   * @return kind as string
//   */
//  String kind();
//
//  /**
//   * Metadata.
//   *
//   * @return metadata
//   */
//  Metadata meta();
//
//  Spec spec();
//
//  @RequiredArgsConstructor
//  final class Simple implements Job {
//
//    private final Metadata metadata;
//    private final Spec spec;
//
//    @Override
//    public Job apply() {
//      return new YamlJob(this.apiVersion(), this.kind(),
//        new YamlMetadata(this.metadata.name()),
//        new YamlSpec(
//          new YamlTemplate(""),
//          this.spec.backoffLimit()
//        )
//      );
//    }
//
//    @Override
//    public String apiVersion() {
//      return "batch/v1";
//    }
//
//    @Override
//    public String kind() {
//      return "Job";
//    }
//
//    @Override
//    public Metadata meta() {
//      return this.metadata;
//    }
//
//    @Override
//    public Spec spec() {
//      return this.spec;
//    }
//  }
//}