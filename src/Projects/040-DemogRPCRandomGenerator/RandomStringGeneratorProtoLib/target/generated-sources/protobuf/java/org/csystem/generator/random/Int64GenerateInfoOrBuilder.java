// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: randomgenerator.proto

package org.csystem.generator.random;

public interface Int64GenerateInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.csystem.generator.random.Int64GenerateInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>sint64 min = 2;</code>
   * @return The min.
   */
  long getMin();

  /**
   * <code>sint64 bound = 3;</code>
   * @return The bound.
   */
  long getBound();
}
