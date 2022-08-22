import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Harmonik Serinin eleman sayisini gir : ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        double top=0;

        for (int i=1; i<=n; i++) {
            top += ((double) 1/i);

        }
        System.out.println("Harmonik Serinin sonucu : "+top);
    }
}