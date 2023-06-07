import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientEx1 {
    // badCode
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("192.168.0.32",8080);
        System.out.println(socket);

        // OutputStream
        OutputStream out = socket.getOutputStream();

        FileInputStream fin = new FileInputStream("c:\\zzz\\test.jpg");

        // 계속 읽어서 보내기
        while(true){
            // 1바이트 내용물
            int data = fin.read();
            // OutputStream 전송
            out.write(data);

            // -1 : 파일을 다 읽음
            if(data == -1){
                break;

            }
        }
        // 사용한 자원 정리
        System.out.println("close");
        fin.close();
        out.close();
        socket.close();

//        out.write(65);;
//        out.write(66);
//        out.write(67);

    }
}
