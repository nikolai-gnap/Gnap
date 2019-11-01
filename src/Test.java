import java.io.*;
import java.io.File;

public class Test {


    public static void main(String[] args) {

        try {
            File file = new File("/C:\\Users\\Николай\\Desktop\\Java.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                break;
                // считываем остальные строки в цикле
             //   line = reader.readLine();
                }
            } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
