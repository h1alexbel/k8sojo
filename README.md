<img alt="logo" src="https://www.objectionary.com/cactus.svg" height="100px" />

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](https://www.rultor.com/b/yegor256/rultor)](https://www.rultor.com/p/yegor256/rultor)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/h1alexbel/k8sojo/blob/master/LICENSE.txt)
[![PDD status](http://www.0pdd.com/svg?name=h1alexbel/k8sojo)](http://www.0pdd.com/p?name=h1alexbel/k8sojo)

[![mvn](https://github.com/h1alexbel/k8sojo/actions/workflows/mvn.yml/badge.svg)](https://github.com/h1alexbel/k8sojo/actions/workflows/mvn.yml)
[![codecov](https://codecov.io/github/h1alexbel/k8sojo/branch/master/graph/badge.svg?token=sEB3gXmLwZ)](https://codecov.io/github/h1alexbel/k8sojo)
[![Hits-of-Code](https://hitsofcode.com/github/h1alexbel/k8sojo)](https://hitsofcode.com/view/github/h1alexbel/k8sojo)

**Kubernetes objects - Java objects** - It's a simple object-oriented representation of [```Kubernetes```](https://kubernetes.io) objects(pods, services,
deployments, jobs, etc.).
You can create and manage them in pretty declarative way.

**Principles**.
These are the [design principles](https://www.elegantobjects.org#principles) behind k8sojo.

You add this to your `pom.xml`:

```xml

<dependency>
  <groupId>com.h1alexbel</groupId>
  <artifactId>k8sojo</artifactId>
</dependency>
```

## [Job](https://kubernetes.io/docs/concepts/workloads/controllers/job/) API

```java
import com.h1alexbel.k8sojo.Container;
import com.h1alexbel.k8sojo.DcContainer;
import com.h1alexbel.k8sojo.Kojo;
import com.h1alexbel.k8sojo.Metadata;
import com.h1alexbel.k8sojo.Spec;

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
```

## Pod API
**TBD**

## Deployment API
**TBD**

## How to Contribute
**TBD**

Fork repository, make changes, send us a [pull request](https://www.yegor256.com/2014/04/15/github-guidelines.html).
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install
```

You will need Maven 3.3+ and Java 17+.