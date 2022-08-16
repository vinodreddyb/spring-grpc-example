package com.example.grpc.client;

import com.example.grpc.lib.HelloReply;
import com.example.grpc.lib.HelloRequest;
import com.example.grpc.lib.MyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


class LibraryApplicationTests {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
        MyServiceGrpc.MyServiceBlockingStub myServiceBlockingStub = MyServiceGrpc.newBlockingStub(channel);

        HelloRequest request = HelloRequest.newBuilder()
                .setName("Test")
                .build();
        HelloReply helloReply = myServiceBlockingStub.sayHello(request);
        System.out.println(helloReply.getMessage());
    }

}
