import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        System.out.println("masukan angka = ");
        Scanner inputuser = new Scanner(System.in);
        int number = inputuser.nextInt();
        int batas_atas = 30;

        while (number<=batas_atas){
            System.out.println("angka " + number);
            number++;
        }
    }
}