import java.io.FileWriter;

public class FloatsFileWriter {
    Floats floats = new Floats();
    public FileWriter write (String pathOut, String prefix) throws Exception{
        FileWriter fileWriter = new FileWriter(pathOut + prefix + "floats.txt", false);
        fileWriter.write(floats.write());
        fileWriter.flush();
        return fileWriter;
    }
}
