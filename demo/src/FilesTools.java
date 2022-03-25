import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesTools {
    private String fileName, content;

    FilesTools(String nazwaPliku) {
        this.fileName = nazwaPliku;
    }

    public Boolean store(String content) {
        return true;
    }

    public String read(String name) {
        String content = "";
        try {
            File file = new File(name);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                content += sc.nextLine();
                content += '\n';
            }
        } catch (FileNotFoundException e) {
            System.out.println("plik nie istnieje");
        }
        return content;
    }
}
