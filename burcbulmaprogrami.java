import java.util.Scanner;

public class burcbulmaprogrami {
    public static void main(String[] args) {

        int month, day;

        Scanner input = new Scanner(System.in);

        System.out.println("Hangi Ayda Doğdunuz : ");
        month = input.nextInt();

        System.out.println("Hangi Günde Doğdunuz : ");
        day = input.nextInt();


        if (month == 1) {
            if (day < 21) {
                System.out.println("Burcunuz Oğlak Burcudur ");
            } else {
                System.out.println("Burcunuz Kova Burcudur");
            }
        }
        if (month == 2) {
            if (day < 22) {
                System.out.println("Burcunuz Kova Burcudur");
            } else {
                System.out.println("Burcunuz Balık Burcudur");
            }
        }
        if (month == 3) {
            if (day < 20) {
                System.out.println("Burcunuz Balık Burcudur");
            } else {
                System.out.println("Burcunuz Koç Burcudur");
            }
        }
        if (month == 4) {
            if (day < 20) {
                System.out.println("Burcunuz Koç Burcudur");
            } else {
                System.out.println("Burcunuz Boğa Burcudur");
            }
        }

        if (month == 5) {
            if (day < 21) {
                System.out.println("Burcunuz Boğa Burcudur");
            } else {
                System.out.println("Burcunuz İkizler Burcudur");
            }
        }
        if (month == 6) {
            if (day < 22) {
                System.out.println("Burcunuz İkizler Burcudur");
            } else {
                System.out.println("Burcunuz Yengeç Burcudur");
            }
        }
        if (month == 7) {
            if (day < 22) {
                System.out.println("Burcunuz Yengeç Burcudur");
            } else {
                System.out.println("Burcunuz Aslan Burcudur");
            }
        }

        if (month == 8) {
            if (day < 22) {
                System.out.println("Burcunuz Aslan Burcudur");
            } else {
                System.out.println("Burcunuz Başak Burcudur");
            }
        }
        if (month == 9) {
            if (day < 22) {
                System.out.println("Burcunuz Başak Burcudur");
            } else {
                System.out.println("Burcunuz Terazi Burcudur");
            }
        }
        if (month == 10) {
            if (day < 22) {
                System.out.println("Burcunuz Terazi Burcudur");
            } else {
                System.out.println("Burcunuz Akrep Burcudur");
            }
        }
        if (month == 11) {
            if (day < 22) {
                System.out.println("Burcunuz Akrep Burcudur");
            } else {
                System.out.println("Burcunuz Yay Burcudur");
            }
        }
        if (month == 12) {
            if (day < 21) {
                System.out.println("Burcunuz Yay Burcudur");
            } else {
                System.out.println("Burcunuz Oğlak Burcudur");
            }

        }
        }
    }


