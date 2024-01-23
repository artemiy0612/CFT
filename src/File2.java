import java.io.FileWriter;

public class File2 {
    public void write () throws Exception{
        FileWriter fileWriter2 = new FileWriter("in2.txt", false);
        String text2 = "Нормальная форма числа с плавающей запятой" + "\n" + "1.528535047E-25" + "\n" +
                "Long" + "\n" + "1234567890123456789";
        fileWriter2.write(text2);
        fileWriter2.flush();
        System.out.println("Пример входного файла in2.txt" + "\n");
        System.out.println(text2);
    }
}
