import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class ClientEx2 {
    // Bad Code
    public static void main(String[] args) throws Exception{

        Socket socket = new Socket("192.168.0.32",8080);

        InputStream in = socket.getInputStream();

        FileOutputStream fos = new FileOutputStream("C:\\zzz\\server.jpg");

        long start = System.currentTimeMillis();

        while(true){
            int data = in.read();
            if(data == -1){
                break;
            }
            fos.write(data);
        }// end while
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        in.close();
        fos.close();
        socket.close();

    }
}
