
public class Main {
    public static void main(String[] args) throws Exception{

        FloatsFileWriter floatsFileWriter = new FloatsFileWriter();
        StringsFileWriter stringsFileWriter = new StringsFileWriter();
        IntegersFileWriter integersFileWriter = new IntegersFileWriter();

        try {
            for (int i = 0;;i++) {
                if (args[i].equals("-o")) {
                    floatsFileWriter.write(args[1], args[3]);
                    stringsFileWriter.write(args[1], args[3]);
                    integersFileWriter.write(args[1], args[3]);
                }
                if (args[i].equals("-p")) {
                    floatsFileWriter.write(args[1], args[3]);
                    stringsFileWriter.write(args[1], args[3]);
                    integersFileWriter.write(args[1], args[3]);
                }
            }
        } catch (Exception e) {
            System.out.println("\n" + " -o задает путь для результатов (-o /some/path)" + "\n" +
                    " -p задает префикс имен выходных файлов (-p result_)" + "\n" +
                    " -s выводит краткую статистику (количество элементов в файлах" + "\n" +
                    " -f выводит полную статистику (содержит минимальное и максимальное значения, сумма и среднее)" + "\n");
        }
        ShortStatistics shortStatistics = new ShortStatistics();
        FullStatistics fullStatistics = new FullStatistics();

        try {
            for (int i = 0;; i++) {
                if (args[i].equals("-s")) {
                    shortStatistics.getNumberOfElements();
                }
                if (args[i].equals("-f")) {
                    fullStatistics.getMinInt();
                    fullStatistics.getMinDouble();
                    fullStatistics.getMaxInt();
                    fullStatistics.getMaxDouble();
                    fullStatistics.getSumInt();
                    fullStatistics.getSumDouble();
                    fullStatistics.getAverageInt();
                    fullStatistics.getAverageDouble();
                }
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}
