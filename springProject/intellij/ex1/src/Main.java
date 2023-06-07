import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // bad code
    public static void main(String[] args) throws Exception {
        // URL
        URL url = new URL("https://cdn.011st.com/11dims/resize/600x600/quality/75/11src/product/744699031/B.png?757000000");
        URL url1 = new URL("https://img.megabox.co.kr/SharedImg/2023/05/07/XbkZesk2KFfQbbagfMtyp8rVUWi8568M_420.jpg");

        InputStream fin = url1.openStream();
        // 1단계
//        FileInputStream fin = new FileInputStream("C:\\zzz\\test.jpg");
        System.out.println(fin);

        FileOutputStream fos = new FileOutputStream("C:\\zzz\\copy.jpg");
        // 2 읽고쓰기
        while(true){
            int data = fin.read();
            if(data == -1){
                break;
            }
            fos.write(data);
        }// end while

    }
}