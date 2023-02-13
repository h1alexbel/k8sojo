/*
 *  Copyright (c) 2022 Aliaksei Bialiauski
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.h1alexbel.k8sojo;

import lombok.RequiredArgsConstructor;

/**
 * Container.
 *
 * @author Aliaksei Bialiauski (abialiauski@solvd.com)
 * @since 0.0.1
 */
public interface Container {

  /**
   * Name
   *
   * @return container name as string
   */
  String name();

  /**
   * Image.
   *
   * @return container image as string
   */
  String image();

  /**
   * Commands.
   *
   * @return list of commands
   */
  Iterable<String> commands();

  /**
   * Docker container.
   */
  @RequiredArgsConstructor
  final class Dc implements Container {

    /**
     * Name.
     */
    private final String name;
    /**
     * Image.
     */
    private final String image;
    /**
     * Commands.
     */
    private final Iterable<String> commands;

    @Override
    public String name() {
      return this.name;
    }

    @Override
    public String image() {
      return "docker.io/" + this.image;
    }

    @Override
    public Iterable<String> commands() {
      return this.commands;
    }
  }
}