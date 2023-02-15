import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cde {
    public static int SquareDigit(int n) {
        int res = 0;
        for (int i = 0; i < String.valueOf(n).length(); i++) {
            int j = Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
            res = Integer.parseInt(String.valueOf(res) + (j * j));
        }
        return (res);
    }

    public static int persistence(int n) {
        boolean is = true;
        long sum = 1;
        int count = 0;
        while (is) {
            if (String.valueOf(n).length() <= 1) {
                sum = n;
                is = false;
                System.out.println("Cycle ended");
            } else {
                count++;
                sum = n;
                n = 1;
                for (int i = 0; i < String.valueOf(sum).length(); i++) {
                    n = (Integer.parseInt("" + String.valueOf(sum).charAt(i)) * n);
                }
            }
        }
        return count;
    }

    public static int kata(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j1 = 0; j1 < i; j1++) {
                sum1 = sum1 + arr[j1];
            }
            for (int j2 = arr.length - 1; j2 > i; j2--) {
                sum2 = sum2 + arr[j2];
            }
            if (sum1 == sum2) {
                return i;
            }
        }
        return -1;
    }

    public static Double multiply(Double a, Double b) {
        return a * b;}
    public static int solution(int number) {
        int ans = 0;
        if (number <= 0) {
            ans = -1;
        } else {
            for (int i = number - 1; i > 0; i--) {
                if (i % 3 == 0 || i % 5 == 0) {
                    ans += i;
                }
            }
        }

        return ans;
    }

    public static int[] deleteNth(Integer[] elements, int maxOccurrences) {
        int countOfRepeats = 0;
        int countOfDeletes = 0;
        int countOfAllDeletes = 0;
        int[] newaar = new int[0];
        for (int i = 0; i < elements.length - 1; i++) {
            countOfAllDeletes += countOfDeletes;
            countOfDeletes = 0;
            countOfRepeats = 0;
            if (maxOccurrences == 0) {
                return newaar;
            } else {
                for (int j = i + 1; j <= elements.length - 1 - countOfAllDeletes; j++) {
//                System.out.println(Arrays.toString(elements));
                    if (elements[i] == (elements[j])) {
                        countOfRepeats++;
                        if (countOfRepeats >= maxOccurrences) {
                            countOfDeletes++;
                        }
                    } else {
                        elements[j - countOfDeletes] = elements[j];
                    }
                }
            }
        }
        int[] newar = new int[elements.length - countOfAllDeletes];
        for (int i = 0; i < newar.length; i++) {
            newar[i] = elements[i];
        }
//        System.out.println(Arrays.toString(newar));
        return newar;
    }

    public static int maxmin(int n) {
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double min = array[0];
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
            System.out.println(array[i]);
        }
        System.out.println("Max value is " + max);
        System.out.println("Min value is " + min);
        return 0;
    }

    public static boolean isValid(char[] walk) {
        //You live in the city of Cartesia where all roads are laid out in a perfect grid. You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. The city provides its citizens with a Walk Generating App on their phones -- everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, so create a function that will return true if the walk the app gives you will take you exactly ten minutes (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.
        //
        //Note: you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). It will never give you an empty array (that's not a walk, that's standing still!).
        int x = 0;
        int y = 0;
        int i = 0;
        for (char c : walk) {
            i++;
            switch (c) {
                case 'n':
                    x++;
                    break;
                case 's':
                    x--;
                    break;
                case 'w':
                    y++;
                    break;
                case 'e':
                    y--;
                    break;
            }
        }
        if ((x == 0) && (y == 0) && (i == 10)) {
            return true;
        } else {
            return false;
        }
    }

    public static String toCamelCase(String s) {
        int l = 0;
        int i;
        char[] str = new char[s.length()];

        for (int j = 0; j < s.length(); j++) {
            str[j] = s.charAt(j);
        }
        for (i = 0; i < str.length; i++) {
            if (('_' == str[i]) || ('-' == str[i])) {
                l++;
                str[i + 1] = Character.toUpperCase(str[i + 1]);
            } else {
                str[i - l] = str[i];
            }
        }
        return String.valueOf(str).substring(0, str.length - l);
    }

    public static String pigIt(String str) {

        return null;
    }

    public static int greedy(int[] dice) {
        return 0;
    }

    public static long ipsBetween(String start, String end) {
        String[] Ipv4List1 = start.split("\\.");
        String[] Ipv4List2 = end.split("\\.");
        long total = (Integer.parseInt(Ipv4List2[3]) - Integer.parseInt(Ipv4List1[3]));
        for (int i = Ipv4List1.length - 2; i >= 0; i--) {
            if (Integer.parseInt(Ipv4List2[i]) != Integer.parseInt(Ipv4List1[i])) {
                total += (Long.parseLong(Ipv4List2[i]) - Long.parseLong(Ipv4List1[i])) * (long) Math.pow(256, (Ipv4List1.length - 1 - i));
            }
        }
        return total;
    }

    public static List<String> singlePermutations(String s) {
        String[] strr = new String[s.length()];
        List<String> listOfChars = new ArrayList<>();
        List<String> listOfListsOfChars = new ArrayList<>();
        int cop = 0;
        boolean iss = false;
        String sttt ;
        int countOfChars = 1;
        int countOfVars = 1;
        int summ = 1;

        for (int i = 0; i < s.length(); i++) {
            strr[i] = String.valueOf(s.charAt(i));
            listOfChars.add(String.valueOf(s.charAt(i)));
        }

        for (int i = 1; i <= s.length(); i++) {
            countOfChars = countOfChars * i;
        }

        for (int i = 0; i < listOfChars.size(); i++) {
            int countOfEachChars = 1;
            for (int j = i + 1; j < listOfChars.size(); j++) {
                if (listOfChars.get(i).equals(listOfChars.get(j))) {
                    countOfEachChars++;
                }
            }
            summ *= countOfEachChars;
        }

        countOfVars = countOfChars / summ;

        while (!iss) {
            cop = 0;
            sttt="";
            for (String ss : listOfChars) {
                sttt += ss ;
            }
            for (String ss: listOfListsOfChars){
                if(ss.equals(sttt)){
                    cop++;
                }
            }
            if (cop<=0){

                listOfListsOfChars.add(sttt);
            }
            Collections.shuffle(listOfChars);
            if (listOfListsOfChars.size() >= countOfVars) {

                iss = true;
            }
        }

        return listOfListsOfChars;
    }

    public static double solution(int[] arr1, int[] arr2) {
        float sum = 0;
        for (int i = 0;i<arr1.length;i++){
            sum+= Math.pow(arr1[i]-arr2[i],2);
        }
        return sum/arr1.length;
    }

    public static String maskify(String str) {
        String[] sttr = new String[str.length()];

        for(int i = sttr.length; i >4;i--){
            sttr[i]= String.valueOf('*');


        }
        System.out.println(sttr.length);
        return Arrays.toString(sttr);
    }

}
