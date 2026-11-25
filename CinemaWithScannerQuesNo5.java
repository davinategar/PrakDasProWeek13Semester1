import java.util.Scanner;

public class CinemaWithScannerQuesNo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, col, menu;
        String name;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Enter audience data");
            System.out.println("2. Show the audience list");
            System.out.println("3. Exit");

            System.out.print("Choose menu: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a number!");
                sc.nextLine();
                continue;
            }

            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Enter name: ");
                    name = sc.nextLine();

                    while (true) {
                        System.out.print("Enter row: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Please enter a number!");
                            sc.nextLine();
                            continue;
                        }
                        row = sc.nextInt();

                        System.out.print("Enter column: ");

                        if (!sc.hasNextInt()) {
                            System.out.println("Please enter a number!");
                            sc.nextLine();
                            continue;
                        }
                        col = sc.nextInt();
                        sc.nextLine();

                        if (row < 1 || row > audience.length) {
                            System.out.println("Invalid row number!");
                        } else if (col < 1 || col > audience[row - 1].length) {
                            System.out.println("Invalid column number!");
                        } else if (audience[row - 1][col - 1] != null) {
                            System.out.println("Seat is already occupied! Please choose another seat.");
                        } else {
                            audience[row - 1][col - 1] = name;
                            System.out.println("Audience data successfully added!");
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nAudience list:");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("*** ");
                            } else {
                                System.out.print(audience[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program exited.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid menu choice!");
            }
        }
    }
}