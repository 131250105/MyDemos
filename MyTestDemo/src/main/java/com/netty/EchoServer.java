//package com.netty;
//
//import io.netty.bootstrap.ServerBootstrap;
//import io.netty.channel.ChannelFuture;
//import io.netty.channel.ChannelInitializer;
//import io.netty.channel.ChannelOption;
//import io.netty.channel.EventLoopGroup;
//import io.netty.channel.nio.NioEventLoopGroup;
//import io.netty.channel.socket.nio.NioServerSocketChannel;
//import io.netty.handler.logging.LogLevel;
//import io.netty.handler.logging.LoggingHandler;
//
//import java.nio.channels.SocketChannel;
//
///**
// * Created by zy118686 on 16/10/25.
// */
//public class EchoServer {
//
//    private int port;
//
//    public EchoServer(int port){
//        this.port = port;
//    }
//
//    public void run() throws Exception {
//        // Configure the server.
//        EventLoopGroup bossGroup = new NioEventLoopGroup();  // (1)
//        EventLoopGroup workerGroup = new NioEventLoopGroup();
//        try {
//            ServerBootstrap b = new ServerBootstrap(); // (2)
//            b.group(bossGroup, workerGroup)
//                    .channel(NioServerSocketChannel.class) // (3)
//                    .option(ChannelOption.SO_BACKLOG, 100)
//                    .handler(new LoggingHandler(LogLevel.INFO))
//                    .childHandler(new ChannelInitializer<SocketChannel>() { // (4)
//                        @Override
//                        public void initChannel(SocketChannel ch) throws Exception {
//                            ch.pipeline().addLast(
//                                    //new LoggingHandler(LogLevel.INFO),
//                                    new EchoServerHandler());
//                        }
//                    });
//
//            // Start the server.
//            ChannelFuture f = b.bind(port).sync(); // (5)
//
//            // Wait until the server socket is closed.
//            f.channel().closeFuture().sync();
//        } finally {
//            // Shut down all event loops to terminate all threads.
//            bossGroup.shutdownGracefully();
//            workerGroup.shutdownGracefully();
//        }
//    }
//}
