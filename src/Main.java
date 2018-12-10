import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        /* Измените пусть к файлам для корректной работы программы*/
        FileWork fl = new FileWork("C:\\Users\\zladi\\IdeaProjects\\JavaTask2.28\\src\\hello.txt",
                "C:\\Users\\zladi\\IdeaProjects\\JavaTask2.28\\src\\hello2.txt");
        fl.ModifyFile("е", "ЕЕЕ");

    }
}