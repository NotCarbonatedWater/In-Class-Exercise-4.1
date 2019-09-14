import java.util.Scanner;
   
public class inClass4_1 
{
    static void printMenu()
    {
        System.out.println("Menu: "); System.out.println();
        System.out.println("1. Sum of series");
        System.out.println("2. Find Armstrong number");
        System.out.println("3. Check if prime or composite number");
        System.out.println("4. Multiplication table");
        System.out.println("5. Sum and odd digits details");
        System.out.println("6. Check if palindrome number");
        System.out.println("7. Factoials");
        System.out.println("8. While loop exponents");
        System.out.println("9. Exit program");
        System.out.print("Enter number of chioce: ");
    }
    static void doSumOfSeries()
    {
        Scanner input = new Scanner(System.in);
        int sumRepetition = 0;
        System.out.print("Enter number of repetition: ");
        int numOfRepetition = input.nextInt();
        for (int  counter = 0; numOfRepetition > counter - 1; counter++) 
            sumRepetition += (counter * 2) * (counter * 2);
        System.out.println(sumRepetition); System.out.println(); 
    }
    static void doArmstrong()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter armstrong guesss: "); 
        String armstrongGuess = input.next();
        String[] parts = armstrongGuess.split("");
        int sumArmstrong = 0;
        for (int index = 0; armstrongGuess.length() > index; index++)
            sumArmstrong +=  Integer.parseInt(parts[index]) * 
                Integer.parseInt(parts[index]) * Integer.parseInt(parts[index]);
        if (Integer.parseInt(armstrongGuess) == sumArmstrong)
            System.out.println("Number entered is a armstrong number"); 
        else
            System.out.println("Number entered is not a armstrong number"); 
        System.out.println(); 
    }
    static void doPrimeComposite()
    {
        Scanner input = new Scanner(System.in); boolean isPrime = true; 
        System.out.print("Enter number to see if it's prime or composite: ");
        int testForPrime = input.nextInt();
        for (int index = 2; testForPrime > index; index++)
        {
            if (testForPrime % index == 0)
            {
                isPrime = false;
                System.out.println("Number is composite"); break;
            }
        }
        if (isPrime == true)
            System.out.println("Number is Prime");
        System.out.println();
    }
    static void doMultiTable()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for multiplication table ");
        int multiNumInput = input.nextInt();   
        for (int index = 0; 11 > index; index++)
            System.out.println(multiNumInput + " * " + index 
                + " = " + (multiNumInput * index));
        System.out.println();
    }
    static void doDisplayOddEvenDetails()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to display details: ");
        String numberInput = input.next();
        String[] parts = numberInput.split("");
        int sumEvenDig = 0; int sumOddDig = 0;
        int numEvenDig = 0; int numOddDig = 0;
        for (int index = 0; numberInput.length() > index; index++)
        {
            if ((Integer.parseInt(parts[index])) % 2 == 0)
            {
                sumEvenDig += Integer.parseInt(parts[index]); numEvenDig++;
            }
            else
            {
                sumOddDig += Integer.parseInt(parts[index]); numOddDig++;
            }
        }
        System.out.println("Sum of even digts = " + sumEvenDig);
        System.out.println("Sum of odd digts = " + sumOddDig);
        System.out.println("Number of Even digts = " + numEvenDig);
        System.out.println("Number of odd digts = " + numOddDig);
        System.out.println();
    }
    static void doPalindrome()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check if palindrome: ");
        String palindromeInput = input.next();
        String[] parts = palindromeInput.split("");
        boolean isPalindrome = true;
        for (int index = 0; (palindromeInput.length())/2 > index; index++)
        {
            if ((Integer.parseInt(parts[index])) != 
                (Integer.parseInt(parts[palindromeInput.length() - index - 1])))
            {
                isPalindrome = false; 
                System.out.println("Number entered is not a palindrome"); break;
            }
        }
        if (isPalindrome == true)
            System.out.println("Number entered is a palindrome");
        System.out.println();
    }
    static void doFactorial()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to find its factorial: ");
        int factorialInput = input.nextInt(); int factorialSum = 1;
        for (int index = 1; factorialInput > index - 1; index++)
            factorialSum *= index;
        System.out.println("Factorial: " + factorialSum);
        System.out.println();
    }
    static void doExponet()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int baseNumInput = input.nextInt();
        System.out.print("Enter exponent: ");
        int exponentNumInput = input.nextInt();
        int whileLoop = 1; int powerSum = baseNumInput;
        while (exponentNumInput > whileLoop)
        {
            powerSum *= baseNumInput; whileLoop++;
        }
        System.out.println(baseNumInput + " to the power of " 
            + exponentNumInput + " is " + powerSum);
        System.out.println();
    }
    // ------------------------------------------------------------
    public static void main(String [] args) 
    {
        boolean programIsRunning = true;
        while (programIsRunning == true)
        {
            printMenu(); Scanner input = new Scanner(System.in);
            int numOfChioce = input.nextInt();
            
            switch (numOfChioce) 
            {
                case 1:
                    doSumOfSeries(); break;
                case 2:
                    doArmstrong(); break;
                case 3:
                    doPrimeComposite(); break;
                case 4:
                    doMultiTable(); break;
                case 5:
                    doDisplayOddEvenDetails(); break;
                case 6:
                    doPalindrome(); break;
                case 7:
                    doFactorial(); break;
                case 8:
                    doExponet(); break;
                case 9:
                    programIsRunning = false; 
                    System.out.println("End of Program"); break;
                default:
                    System.out.print("Input is INVALID"); System.out.println();
            }         
        }
    }
}