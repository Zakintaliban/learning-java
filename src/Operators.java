class Operators {
    public static void main(String[] args) throws Exception {
        // operators
        double number1 = 12.5;
        int number2 = 6;
        
        System.out.println("operator angka");
        //  addition 
        System.out.println(number1 + number2);

        //  substraction
        System.out.println(number1 - number2);

        // multiplication
        System.out.println(number1 * number2);

        // division
        System.out.println(number1 / number2);

        // modulus
        System.out.println(number1 % number2);

        System.out.println("assignments angka");

        // assignment  +=, -=, *=, /=, %=
        System.out.println(number1 += 5);
        System.out.println(number1 -= 5);
        System.out.println(number1 *= 5);
        System.out.println(number1 /= 5);
        System.out.println(number1 %= 5);

        System.out.println("increment decrement");

        // increment 
        System.out.println(number1++); 
        
        // decrement
        System.out.println(number2--);

        System.out.println("is equal to");

        // is equal to
        System.out.println(number1 == number2);

        // is not equal to
        System.out.println(number1 != number2);

        // is greater than
        System.out.println(number1 > number2);

        // is lower than
        System.out.println(number1 < number2);

        // is greater than or equal to
        System.out.println(number1 >= number2);

        // is lower than or equal to 
        System.out.println(number1 <= number2);

        System.out.println("logical operators");
        System.out.println(number2>= 10 && number2<= 20);

        System.out.println(number2>= 10 || number2<= 20);

        boolean isStudent = false;
        boolean isLibraryMember = true;

        System.out.println(isStudent && isLibraryMember);

        System.out.println(isStudent || isLibraryMember);

        System.out.println(!isStudent);
    }
}
