package javaapplication3;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5;

        System.out.println("Informe cinco números inteiros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        n5 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5) {
            System.out.println("O numero " + n1 + " é o maior.");
        } else if (n1 <= n2 && n1 <= n3 && n1 <= n4 && n1 <= n5) {
            System.out.println("O numero " + n1 + " é o menor.");
        }
        
        if (n2 >= n1 && n2 >= n3 && n2 >= n4 && n2 >= n5) {
            System.out.println("O numero " + n2 + " é o maior.");
        } else if (n2 <= n1 && n2 <= n3 && n2 <= n4 && n2 <= n5) {
            System.out.println("O numero " + n2 + " é o menor.");
        }
        
        if (n3 >= n2 && n3 >= n1 && n3 >= n4 && n3 >= n5) {
            System.out.println("O numero " + n3 + " é o maior.");
        } else if (n3 <= n2 && n3 <= n1 && n3 <= n4 && n3 <= n5) {
            System.out.println("O numero " + n3 + " é o menor.");
        }
        
        if (n4 >= n2 && n4 >= n3 && n4 >= n1 && n4 >= n5) {
            System.out.println("O numero " + n4 + " é o maior.");
        } else if (n4 <= n2 && n4 <= n3 && n4 <= n1 && n4 <= n5) {
            System.out.println("O numero " + n4 + " é o menor.");
        }
                
        if (n5 >= n2 && n5 >= n3 && n5 >= n4 && n5 >= n1){
            System.out.println("O numero " + n5 + " é o maior.");
        } else if(n5 <= n2 && n5 <= n3 && n5 <= n4 && n5 <= n1){
            System.out.println("O numero " + n5 + " é o menor.");
        }
        sc.close();
    }

}
