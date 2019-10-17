public class Fizzbuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzbuzz(i));


        }
    }

    public static String getFizzbuzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {

            return "buzz";
        } else
            return Integer.toString(number);

    }
}




