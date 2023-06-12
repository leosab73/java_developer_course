import java.io.*;
import java.util.Iterator;
import java.util.Stack;

public class LeggiFile {
    public static void main(String[] args) throws IOException {
        Stack<String> pilaDiFrasi = new Stack<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/Users/leo/Library/CloudStorage/OneDrive-PolitecnicodiBari/JavaDeveloper/Slide/Lezione 19/Righe/righe.txt"))) {
            while(br.ready()) {
                String a = br.readLine();
                pilaDiFrasi.push(a);
            }
        } catch (IOException e) {
            System.out.println("C'è stato un problema");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/leo/Library/CloudStorage/OneDrive-PolitecnicodiBari/JavaDeveloper/Slide/Lezione 19/Righe/righeInverted.txt"))) {
            while (!pilaDiFrasi.isEmpty()) {
                String a = pilaDiFrasi.pop();
                bw.write(a + "\n");
            }

        } catch (IOException e) {
            System.out.println("C'è stato un problema");
        }




    }
}
