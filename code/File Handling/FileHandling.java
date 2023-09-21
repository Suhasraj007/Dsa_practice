import java.io.*;

public class FileHandling{
    public static void main(String[] args) throws IOException{
        File f = new File("note.txt");
        if (!f.createNewFile()) {
            System.out.println("file already exsist");
        }

        BufferedReader br = new BufferedReader(new FileReader("note.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt",true));

        int i = 0;
        while (true) {
            if (i == 26) {
                break;
            }
            bw.write('A'+i);
            bw.newLine();
            i++;
        }

        while (br.ready()) {
            System.out.println(br.readLine());
        }

        br.close();
        bw.close();
    }

}