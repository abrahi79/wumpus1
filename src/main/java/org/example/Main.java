package org.example;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Üdvözöllek a Wumpus játékomban! ");


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Add meg a felasználóneved:");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("A fehasználóneved: " + userName);  // Output user input

        System.out.println("Kezdődjék a játék: ");

        char[][] fixpalya = {
                {'W','U','U','G','U'},
                {'U','U','G','U','U'},
                {'W','U','U','U','W'},
                {'U','A','U','G','U'},
                {'E','U','G','U','U'},

        };






        for (int i = 0; i < fixpalya.length; ++i) {
            for (int j = 0; j < fixpalya[i].length; ++j) {
                System.out.print(fixpalya[i][j]);
            }
            System.out.println(' ');
        }

        System.out.println("Add meg a lépésed (E1 H2 J3 B4  vagy nyomd meg a 0 gombot a játék befejezéséhez!)");
        String valasz = myObj.nextLine();  // Read user input
        System.out.println("A lépésed: " + valasz);  // Output user input

        int e1,e2;

        e1=0;e2=4;
        int x=0;
        int y=0;
        for (int i = 0; i < fixpalya.length; ++i) {
            for (int j = 0; j < fixpalya[i].length; ++j) {
                if (fixpalya[i][j] == 'E') {
                    System.out.print(i);
                    System.out.print(" ");
                    System.out.print(j);
                    x=i;
                    y=j;
                }
            }
        }

        if ("E".equals(valasz))
        {
            if (fixpalya[x][y]=='W')
            {
                System.out.println("Megölt a wumpus!");  // Output user input
            }
            if (fixpalya[x][y]=='A')
            {
                System.out.println("Aranyat találtál!");  // Output user input
            }
            if (fixpalya[x][y]=='U')
            {
                System.out.println("Üres mezőn vagy, nincs veszély!");  // Output user input
            }
            if (fixpalya[x][y]=='G')
            {
                System.out.println("Gödörbe estél! Vége a játéknak!");  // Output user input
            }
            fixpalya[x][y]='U';
            y=y;
            x=x-1;
            fixpalya[x][y]='E';
            System.out.print(fixpalya[x][y]);
            System.out.print(x);
            System.out.print(" ");
            System.out.print(y);
            if (fixpalya[y][x-1]=='U')
            {
                System.out.println("Közel a wumpus");
                System.out.print(x);
                System.out.print(" ");
                System.out.println(y);
            }
            if (fixpalya[y+1][x]=='U')
            {
                System.out.println("Közel a wumpus");
                System.out.print(x);
                System.out.print(" ");
                System.out.println(y);
            }
            for (int i = 0; i < fixpalya.length; ++i) {
                for (int j = 0; j < fixpalya[i].length; ++j) {
                    System.out.print(fixpalya[i][j]);
                }
                System.out.println(' ');
            }

        }
        System.out.println("Add meg a lépésed (E1 H2 J3 B4  vagy nyomd meg a 0 gombot a játék befejezéséhez!)");
        valasz = myObj.nextLine();  // Read user input
        System.out.println("A lépésed: " + valasz);  // Output user input
        if ("E".equals(valasz))
        {
            if (fixpalya[x][y]=='W')
            {
                System.out.println("Megölt a wumpus!");  // Output user input
            }
            if (fixpalya[x][y]=='A')
            {
                System.out.println("Aranyat találtál!");  // Output user input
            }
            if (fixpalya[x][y]=='U')
            {
                System.out.println("Üres mezőn vagy, nincs veszély!");  // Output user input
            }
            if (fixpalya[x][y]=='G')
            {
                System.out.println("Gödörbe estél! Vége a játéknak!");  // Output user input
            }
            fixpalya[x][y]='U';
            y=y;
            x=x-1;
            fixpalya[x][y]='E';
            System.out.print(fixpalya[x][y]);
            System.out.print(x);
            System.out.print(" ");
            System.out.print(y);
            if (fixpalya[y][x-1]=='U')
            {
                System.out.println("Közel a wumpus");
                System.out.print(x);
                System.out.print(" ");
                System.out.println(y);
            }
            if (fixpalya[y+1][x]=='U')
            {
                System.out.println("Közel a wumpus");
                System.out.print(x);
                System.out.print(" ");
                System.out.println(y);
            }


        }


        for (int i = 0; i < fixpalya.length; ++i) {
            for (int j = 0; j < fixpalya[i].length; ++j) {
                System.out.print(fixpalya[i][j]);
            }
            System.out.println(' ');
        }



        //While ( != "0")
        //{
            //System.out.println("Add meg a lépésed (E H J B  vagy nyomd meg a 0 gombot a játék befejezéséhez!)");
        //};

        }
}