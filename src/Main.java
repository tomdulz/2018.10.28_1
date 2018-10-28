public class Main {
    public static void main (String[] args)
    {
        //Task1
        System.out.println("Task 1 - while");
        int starLimit = 5;
        int x = 1;
        while(x <= starLimit){
            System.out.print("*");
        x++;}
        System.out.println("");
        // Task 2
        System.out.println("Task 2 - while");
        x = 1;
        while(x <= starLimit){
            System.out.println("*");
            x++; }
         // Task 3
        System.out.println("Task 3");
        int a = 1;
        int b = 1;
        int starRowLimit = 5;
        int starColLimit = 5;
        while(b <= starColLimit) {
            while (a <= starRowLimit) {
                System.out.print("*");
                a++;
            }
            a = 1;
            System.out.println("");
            b++;
        }
        //Task 4
        System.out.println("Task 4");
        a = 1;
        b = 1;
        starRowLimit = 5;
        starColLimit = 5;
        while(b <= starColLimit) {
            while (a <= starRowLimit) {
                System.out.print("*");
                a++;
            }
            a = 1;
            System.out.println("");
            b++;
            starRowLimit--;
        }
        //Task 5
        System.out.println("Task 5");
        int c = 1;
        int d = 1;
        starRowLimit = 5;
        starColLimit = 5;
        while (d <=starColLimit) {
            switch (d)
            {
                case 1: System.out.print("");
                break;
                case 2: System.out.print(" ");
                break;
                case 3: System.out.print("  ");
                break;
                case 4: System.out.print("   ");
                break;
                case 5: System.out.print("    ");
                break;
            }
            while (c <= starRowLimit) {

                System.out.print("*");
                c++;
            }
        System.out.println("");
        c = 1;
        d++;
        starRowLimit--;
        }

    }
}
