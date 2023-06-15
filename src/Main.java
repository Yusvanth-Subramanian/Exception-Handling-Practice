import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void show() {
        //Handling Checked exceptions
        FileReader reader = null;
        try {
            reader = new FileReader("file1.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist");
        }
        finally {  //To make the close() get executed in all cases
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            //Handling Unchecked exceptions
            finally {
                try {
                    int b = 0;
                    int a = 10 / b;
                } catch (ArithmeticException e) {
                    System.out.println("Divide by zero error");
                }
            }

        }

    }

    public static void main(String[] args) {

        show();

    }
}