package Input_OutputPackage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputFromFile {

    public static String readTextFromFile(){

        StringBuilder sb = new StringBuilder();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aw22\\Desktop\\Java NEW\\TextAnalyser\\src\\main\\resources\\TextAnalysed.txt"))) {
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(InputFromFile.readTextFromFile());
    }

}
