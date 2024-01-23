import java.io.FileWriter;

public class StringsFileWriter {
    Strings strings = new Strings();
    public FileWriter write (String pathOut, String prefix) throws Exception{
        FileWriter fileWriter = new FileWriter(pathOut + prefix + "strings.txt",false);
        fileWriter.write(strings.write());
        fileWriter.flush();
        return fileWriter;
    }
}
