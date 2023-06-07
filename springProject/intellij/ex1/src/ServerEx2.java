import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx2 {
    // badCode
    public static void main(String[] args)throws Exception {

        // 서버소켓 준비
        ServerSocket serverSocket = new ServerSocket(8080);
        // accept() 연결
        while(true){
            Socket client = serverSocket.accept();
            System.out.println(client);
            
            // 파일 데이터 준비
            FileInputStream fin = new FileInputStream("C:\\zzz\\test.jpg");
            // 데이터 전송
            OutputStream out = client.getOutputStream();

            byte[] buffer = new byte[1024*8];

            long start = System.currentTimeMillis();


            while(true){
//                int data = fin.read();
//                if(data == -1){
//                    break;
//                }
//                out.write(data);
                int count = fin.read(buffer);
                if(count == -1){break;}
                out.write(buffer,0,count);
            }
            long end = System.currentTimeMillis();
            System.out.println(end-start);


            out.close();
            fin.close();
            client.close();
        }

   
        
        // 읽고 쓰기

        // close

    }
}
