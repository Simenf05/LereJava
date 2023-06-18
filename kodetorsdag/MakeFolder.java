import java.io.File;

public class MakeFolder {
    public static void main(String[] args) {
        new File("./katalog/savegame").mkdirs();
    }
}
