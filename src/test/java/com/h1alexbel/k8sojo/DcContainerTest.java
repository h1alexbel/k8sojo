package com.h1alexbel.k8sojo;

import org.assertj.core.api.Assertions;
import org.cactoos.list.ListOf;
import org.junit.jupiter.api.Test;

/**
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 1.0
 */
class DcContainerTest {

  @Test
  void name() {
    final String name = "realo";
    final String image = "abialiauski/realo";
    Container container = new Container.Dc(
      name,
      image,
      new ListOf<>("-java")
    );
    Assertions.assertThat(container.name()).isEqualTo(name);
    Assertions.assertThat(container.image()).isEqualTo(image);
  }

  @Test
  void commands() {
    final ListOf<String> commands = new ListOf<>("entry.sh", "script.sh");
    final Container container = new Container.Dc(
      "nginx-test",
      "nginx/nginx",
      commands
    );
    Assertions.assertThat(container.commands())
      .isNotEmpty()
      .isNotNull()
      .hasSize(2)
      .isEqualTo(commands);
  }
}