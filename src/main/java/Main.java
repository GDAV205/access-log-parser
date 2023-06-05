import java.io.File;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int i = 0;

        while (i >= 0){

            System.out.println("Введите полный путь к файлу:");

            String path = new Scanner(System.in).nextLine();
            File file = new File(path);

            boolean isDirectory = file.isDirectory();

            boolean fileExists = file.exists();

            if (fileExists == true && isDirectory == true){
                System.out.println("Введен путь к директории, а не к файлу. Попробуйде снова");
                continue;
            }
            if (fileExists == true && isDirectory == false){
                i++;
                System.out.println("Путь указан верно.");
                System.out.println("Это файл номер "+i);
                continue;
            }
            else {
                System.out.println("Указанный файл не существует.");
                continue;
            }
        }


    }
}