import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) throws IOException {

        System.out.println("Ile liczb chcesz wprowadzić?");
        Scanner input = new Scanner(System.in);
        int size= input.nextInt();
        double [] array = new double[size];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Podaj liczbę zmiennoprzecinkową");
            array[i]=input.nextDouble();
        }

        FileWriter fileWriter = new FileWriter("wprowadzoneLiczby.txt");
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        bfw.write(Arrays.toString(array));
        bfw.close();
    }
}