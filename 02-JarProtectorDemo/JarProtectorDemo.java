import java.io.IOException;
import java.io.OutputStream;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class JarProtectorDemo {
    public static void main(String[] args) throws IOException {
        int serverPort = 8000; // 服务器端口号

        // 创建HTTP服务器，并绑定到指定端口
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(serverPort), 0);

        // 创建一个上下文为 "/" 的处理器，并指定处理方法为 HelloHandler
        server.createContext("/", new HelloHandler());

        // 启动服务器
        server.start();

        System.out.println("Server started on port " + serverPort);
    }

    // 处理 HTTP 请求的处理器类
    static class HelloHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // 设置响应头
            exchange.getResponseHeaders().set("Content-Type", "text/plain");

            // 设置响应码为200（表示成功）
            exchange.sendResponseHeaders(200, 0);

            // 获取输出流，向客户端发送响应内容
            OutputStream responseBody = exchange.getResponseBody();
            responseBody.write("Hello, World!".getBytes());

            // 关闭输出流，标记响应结束
            responseBody.close();
        }
    }
}
