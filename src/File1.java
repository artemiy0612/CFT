import java.io.FileWriter;

public class File1 {
    public void write() throws Exception{
        FileWriter fileWriter1 = new FileWriter("in1.txt", false);
        String text1 = "Lorem ipsum dolor sit amet" + "\n" + "45" + "\n" + "Пример" + "\n" +
                "3.1415" + "\n" + "consectetur adipiscing" + "\n" + "-0.001" + "\n" +
                "тестовое задание" + "\n" + "100500";
        fileWriter1.write(text1);
        fileWriter1.flush();
        System.out.println("Пример входного файла in1.txt" + "\n");
        System.out.println(text1 + "\n");
    }
}
