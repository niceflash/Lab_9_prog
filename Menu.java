package lab9;

import java.util.Scanner;

public class Menu {
    Scanner in = new Scanner(System.in);

    void menu() {
        TextDocument Secret = new TextDocument("file", 123, "24.12.1993");
        System.out.println("Enter your file name:");
        String file_name = in.next();
        System.out.println("Enter number of lines in your file:");
        int line_count = in.nextInt();
        System.out.println("Enter your file date:");
        String file_date = in.next();

        TextDocument Lab = new TextDocument(file_name, line_count, file_date);
        boolean tf = true;
        int count = 0;
        while (tf) {
            System.out.println("Now you can:\n1 - Work with file\n2 - Compare with secret file\n0 - Exit");
            int key = in.nextInt();

            if (key == 1) {
                boolean YoN = true;
                int key_for_editing;
                while (YoN) {
                    System.out.println("What do you want to do?\n1 - Edit file name\n2 - Edit number of lines\n3 - Secret lines plus yours\n4 - Show info\n0 - Return\n");
                    key_for_editing = in.nextInt();
                    switch (key_for_editing) {
                        case 1:
                            System.out.println("Enter new file name:\n");
                            String name = in.next();
                            Lab.setName(name);
                            break;
                        case 2:
                            System.out.println("Enter new number of lines:\n");
                            int number_of_lines = in.nextInt();
                            Lab.setNumber_of_lines(number_of_lines);
                            break;
                        case 3:
                            System.out.println("Do you want enter multiplier?:\n1 - Yes\nAnything - No\n");
                            int testkey = in.nextInt();
                            if (testkey == 1) {
                                System.out.println("Enter multiplier:");
                                int multiplier = in.nextInt();
                                System.out.println("Count:");
                                System.out.println(Lab.SecretPlusYour(Lab.getNumber_of_lines(), Secret.getNumber_of_lines(), multiplier));
                            }
                            else
                                Lab.SecretPlusYour(Lab.getNumber_of_lines(), Secret.getNumber_of_lines());
                        case 4:
                            System.out.println(Lab.toString());
                            break;
                        case 0:
                            YoN = false;
                            break;
                        default:
                            System.out.println("Wrong command!\n");
                            break;
                    }
                }
            } else if (key == 2) {
                if (Lab.equals(Secret)) {
                    System.out.println("OMG!IT`S SECRET FILE!!");
                } else {
                    System.out.println("Sorry, not today! :D");
                }
            } else if (key == 0) {
                tf = false;
            } else {
                count++;
                if (count >= 3)
                    System.out.println("Oh, stop breaking the programm :c");
                else
                    System.out.println("Wrong command!");
            }
        }
    }

}
