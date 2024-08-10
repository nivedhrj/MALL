import java.util.*;
class Main{
    public static void main(String[]Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO TRIVANDRUM MALL");
        System.out.println("#I💖TVM");
        System.out.println("Enter your name to register:");
        String name = sc.nextLine();
        System.out.println("Enter your Phone Number:");
        long phno = sc.nextLong();
        System.out.println("Enter your Field:");
        System.out.println("1 TVM Fashion");
        System.out.println("2 T-Toys");
        System.out.println("3 TVM Stationary");
        System.out.println("4 T-Books");
        System.out.println("5 TVM Secure");
        System.out.println("6 T-MAX Cinemas");
        System.out.println("7 TVM PlayPitch");
        int field = sc.nextInt();
        System.out.println("Enter your/your Kids Age:");
        int age = sc.nextInt();
        switch (field) {
            case 1:
                if (age >= 1 && age <= 5) {
                    System.out.println("FLOOR 5 Left");
                    System.out.println("Staff in-charge:");
                    System.out.println("PHONE NUMBER:");
                } else  if (age > 5 && age <= 10) {
                System.out.println("FLOOR 5 Right");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
            } else  if (age > 10 && age <= 20) {
                System.out.println("FLOOR 4 Left");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
            } else if (age > 20 && age < 30) {
                System.out.println("FLOOR 4 Right");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
            } else  if (age > 30 && age < 50) {
                System.out.println("FLOOR 3 Left");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
            }
                else if (age > 60 && age < 100) {
                System.out.println("FLOOR 2");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
            }
                else{
                    System.out.println("ERROR!");
                }
                break;

            case 2:
                System.out.println("FLOOR 6");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
                break;
            case 3:
                System.out.println("FLOOR 1");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
                break;
            case 4:
                System.out.println("FLOOR 7");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
                break;
            case 5:
                System.out.println("FLOOR 8");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
                break;
            case 7:
                System.out.println("FLOOR 9");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
                break;
            case 6:
                System.out.println("FLOOR 10");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
                System.out.println("Registration:");
                System.out.println("MOVIE:");
                System.out.println(" ");
                sc.nextInt();
                String movie = sc.nextLine();
                System.out.println("YOUR TICKET");
                System.out.println("Name:" + name);
                System.out.println(" ");
                System.out.println("MOVIE: " + movie);
                System.out.println("Phone Number: " + phno);
                System.out.println("TICKET CODE:" + Math.random());
                break;
            case 8:
                System.out.println("FLOOR 10");
                System.out.println("Staff in-charge:");
                System.out.println("PHONE NUMBER:");
                break;
        }

    }
}