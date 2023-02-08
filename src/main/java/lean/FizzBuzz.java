package lean;

public class FizzBuzz {
    public static void main(String[] args) {

    }

    public static void fizzBuzz1 (int number){
        for (int i=1; i<=number; i++){
            if (i%3==0 & i%5==0) System.out.println("FizzBuzz");
            else if(i%3==0) System.out.println("Fizz");
            else if (i%5==0) System.out.println("Buzz");
            else System.out.println(i);

        }
    }

    public static void fizzBuzzAppend( int number){
        for (int i=1; i<=number; i++){
            StringBuilder stringBuilder = new StringBuilder();
            if(i%3==0) stringBuilder.append("Fizz");
            if (i%5==0) stringBuilder.append("Buzz");
            System.out.println( i + " = " +stringBuilder);
        }
    }
}
