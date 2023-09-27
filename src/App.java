import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int[] array1 = new int[4];

        int[] array2 = new int[4];

        Scanner tb = new Scanner(System.in);

        System.out.println("Skriv tal ett: ");
        int tal1 = tb.nextInt();
        System.out.println("Skriv tal två: ");
        int tal2 = tb.nextInt();
        System.out.println("Skriv tal tre: ");
        int tal3 = tb.nextInt();
        System.out.println("Skriv tal fyra: ");
        int tal4 = tb.nextInt();

        array1[0] = tal1;
        array1[1] = tal2;
        array1[2] = tal3;
        array1[3] = tal4;
        
        System.out.println(" ");
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);

        
        int tal1a = array1[0];
        int tal1b = array1[1];
        int tal1c = array1[2];
        int tal1d = array1[3];

        
        System.out.println(" ");
        System.out.println(tal1d);
        System.out.println(tal1c);
        System.out.println(tal1b);
        System.out.println(tal1a);



        

        

        

    }
}
