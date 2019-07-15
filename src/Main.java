import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("files/text");


        try {
            FileWriter fileWriter = new FileWriter(file); //подключаем FileWriter
            BufferedWriter bufferedWriter = new BufferedWriteer(fileWriter); //подключаем буффер, через него будет производиться запись
            bufferedWriter.write("Привет, мир"); //write() - записывает любой тип данных в файл
            bufferedWriter.close();//закрываем потоки записи
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //посимвольное чтение из файла
            int c;
            //read() возвращает символ в виде кодировки, если символа нет, то вернёт -1,
            //поэтому при с = -1 мы прерываем наш цикл, так как дальше нет символов
            while((c=bufferedReader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
