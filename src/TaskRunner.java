import java.io.InputStreamReader;
import java.util.Scanner;

public class TaskRunner {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n =1;
        System.out.println("Task list:");

        System.out.printf("\n\n%s   %-13s %s\n","ID","Difficulty","Name");
        System.out.printf("\n%s    %-13s %s",n++,"4","So Many Permutations!");
        System.out.printf("\n%s    %-13s %s",n++,"5","Count IP Addresses");
        System.out.printf("\n%s    %-13s %s",n++,"5","Pagination Helper");
        System.out.printf("\n%s    %-13s %s",n++,"6","Convert string to camel case");
        System.out.printf("\n%s    %-13s %s",n++,"6","Take a Ten Minutes Walk");
        System.out.printf("\n%s    %-13s %s",n++,"6","Delete occurrences of an element if it occurs more than n times");
        System.out.printf("\n%s    %-13s %s",n++,"6","Multiples of 3 or 5");
        System.out.printf("\n%s    %-13s %s",n++,"6","Equal Sides Of An Array");
        System.out.printf("\n%s    %-13s %s",n++,"6","Persistent Bugger");
        System.out.printf("\n%s   %-13s %s",n++,"6","Sum of Digits / Digital Root");
        System.out.printf("\n%s   %-13s %s",n++,"6","Who liked it");
        System.out.printf("\n%s   %-13s %s",n++,"7","Square Digits");
        System.out.printf("\n%s   %-13s %s\n\n",n++,"8","Multiply");

        System.out.print("\nEnter task ID : ");
        int id =scanner.nextInt();
        switch (id){
            case 1:
                if (print(1, 4,"So Many Permutations!")){
                    description(1);
                    }
                System.out.println("Enter the string :");
                System.out.println(Cde.singlePermutations(scanner.nextLine()));
                break;
            case 2:
                if (print(2,5,"Count IP Addresses")){
                    description(2);
                }
                System.out.println("Enter two ip addresses in range 0.0.0.0 - 255.255.255.255 :");
                System.out.println(Cde.ipsBetween(scanner.nextLine(),scanner.nextLine()));
                break;
            case 3:
                if (print(3, 5,"Pagination Helper")){
                    description(3);
                }
                System.out.println("Enter Array of chars and count of pages");
//                System.out.println(Cde.);
                break;

            case 4:
                System.out.println("404");
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                if (print(13, 8,"Multiply")){
                    System.out.println("Return the multiplication of two numbers");}
                System.out.print("Enter two numbers :\n");
                System.out.println(Cde.multiply(scanner.nextDouble(),scanner.nextDouble()));
                break;
            default:
        }



//        System.out.println(Cde.SquareDigit(2));
//        System.out.println(Cde.persistence(999));
//        System.out.println(Cde.kata(new int [] {1,2,3,4,3,2,1}));
//        System.out.println(Cde.solution(100));
//        System.out.println(Arrays.toString(Cde.deleteNth(new Integer[]{1,1,1,2,1,21,2,1}, 5)));
//        Cde.maxmin(1000);
//        System.out.println(Cde.isValid(new char[]{'n','s','n','w','e','s','n','s','n','s'}));
//        System.out.println(Cde.toCamelCase("the_stealth_Warrior"));
//        System.out.println(Cde.pigIt("Word and another one"));
//        System.out.println(Cde.ipsBetween("0.0.0.0", "255.255.255.255"));
//        System.out.println( Cde.singlePermutations("aabc"));
//        System.out.println(Cde.solution(new int[]{-851, 2, 3}, new int[]{3, 4, 5}));
//        System.out.println(Cde.maskify("1234567"));
    }
    public static boolean print(int id, int difficulty,String name){
        System.out.printf("\n\n%s   %-13s %s\n","ID","Difficulty","Name");
        System.out.printf("\n%s    %-13s %s\n",id,difficulty,name);
        System.out.println("\nOpen the description? y/n");
        scanner.nextLine();
        String s =scanner.nextLine();
        return (s.equals("y"));
    }
    public static void description(int id){
        switch (id){
            case 1:
                System.out.println("In this kata, your task is to create all permutations of a non-empty input string and remove duplicates, if present.\n" +
                        "\n" +
                        "Create as many \"shufflings\" as you can!\n" +
                        "\n" +
                        "Examples:\n" +
                        "With input 'a':\n" +
                        "Your function should return: ['a']\n" +
                        "\n" +
                        "With input 'ab':\n" +
                        "Your function should return ['ab', 'ba']\n" +
                        "\n" +
                        "With input 'abc':\n" +
                        "Your function should return ['abc','acb','bac','bca','cab','cba']\n" +
                        "\n" +
                        "With input 'aabb':\n" +
                        "Your function should return ['aabb', 'abab', 'abba', 'baab', 'baba', 'bbaa']");
                break;
            case 2:
                System.out.println("Implement a function that receives two IPv4 addresses, and returns the number of addresses between them (including the first one, excluding the last one).\n" +
                        "\n" +
                        "All inputs will be valid IPv4 addresses in the form of strings. The last address will always be greater than the first one.\n" +
                        "\n");
                break;
            case 3:
                System.out.println("For this exercise you will be strengthening your page-fu mastery. You will complete the PaginationHelper class, which is a utility class helpful for querying paging information related to an array.\n" +
                        "\n" +
                        "The class is designed to take in an array of values and an integer indicating how many items will be allowed per each page. The types of values contained within the collection/array are not relevant.\n" +
                        "\n" +
                        "The following are some examples of how this class is used:");
                break;
        }
    }

}