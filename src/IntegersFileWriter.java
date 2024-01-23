import java.io.FileWriter;

public class IntegersFileWriter {
    Integers integers = new Integers();
    public FileWriter write (String pathOut, String prefix) throws Exception{
        FileWriter fileWriter = new FileWriter(pathOut + prefix + "integers.txt", false);
        fileWriter.write(integers.write());
        fileWriter.flush();
        return fileWriter;
    }

}
