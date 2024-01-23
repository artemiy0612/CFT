
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
            System.out.println("\n" + " -o ������ ���� ��� ����������� (-o /some/path)" + "\n" +
                    " -p ������ ������� ���� �������� ������ (-p result_)" + "\n" +
                    " -s ������� ������� ���������� (���������� ��������� � ������" + "\n" +
                    " -f ������� ������ ���������� (�������� ����������� � ������������ ��������, ����� � �������)" + "\n");
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
