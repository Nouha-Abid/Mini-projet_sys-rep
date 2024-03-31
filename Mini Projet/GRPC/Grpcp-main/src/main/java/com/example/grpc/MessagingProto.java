// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging.proto

package com.example.grpc;

public final class MessagingProto {
  private MessagingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessagesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017messaging.proto\"A\n\016MessageRequest\022\016\n\006s" +
      "ender\030\001 \001(\t\022\021\n\trecipient\030\002 \001(\t\022\014\n\004text\030\003" +
      " \001(\t\"\033\n\013UserRequest\022\014\n\004user\030\001 \001(\t\"!\n\017Mes" +
      "sageResponse\022\016\n\006status\030\001 \001(\t\"$\n\020Messages" +
      "Response\022\020\n\010messages\030\001 \003(\t2{\n\020MessagingS" +
      "ervice\0220\n\013SendMessage\022\017.MessageRequest\032\020" +
      ".MessageResponse\0225\n\022GetMessagesForUser\022\014" +
      ".UserRequest\032\021.MessagesResponseB$\n\020com.e" +
      "xample.grpcB\016MessagingProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageRequest_descriptor,
        new java.lang.String[] { "Sender", "Recipient", "Text", });
    internal_static_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserRequest_descriptor,
        new java.lang.String[] { "User", });
    internal_static_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_MessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_MessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessagesResponse_descriptor,
        new java.lang.String[] { "Messages", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}