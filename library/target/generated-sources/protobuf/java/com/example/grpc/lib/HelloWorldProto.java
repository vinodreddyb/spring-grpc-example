// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.example.grpc.lib;

public final class HelloWorldProto {
  private HelloWorldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\032net.devh.boot.grpc.exampl" +
      "e\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"\035\n\nHello" +
      "Reply\022\017\n\007message\030\001 \001(\t2k\n\tMyService\022^\n\010S" +
      "ayHello\022(.net.devh.boot.grpc.example.Hel" +
      "loRequest\032&.net.devh.boot.grpc.example.H" +
      "elloReply\"\000B)\n\024com.example.grpc.libB\017Hel" +
      "loWorldProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_net_devh_boot_grpc_example_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_net_devh_boot_grpc_example_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_net_devh_boot_grpc_example_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_net_devh_boot_grpc_example_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}