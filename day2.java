import java.util.Scanner;


public class day2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Swapping Variables 

        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int num2 = sc.nextInt();

        // Using third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping Using third variable");
        System.out.println("First number : " + num1);
        System.out.println("Second number : " + num2);

        // Without using third variable 
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping without using third variable");
        System.out.println("First number : " + num1);
        System.out.println("Second number : " + num2);




        // Type casting

        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int  result = num1/num2;

        int result = (double) result;

        System.out.println("Division result:"+result);



        // Logical operators 

        System.out.println("Comparison of two integers");

        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        if ((num1 == 0) || (num2>num1)){
            System.out.println(num2+" is greater than "+num2);
        }
        else if ((num2 == 0) || (num1>num2)){
            System.out.println(num1+" is greater than "+num2);
        }
        else {
            System.out.println("Both given numbers are equal");
        }



              
        // Positive and Even Checker
        
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter num3");
        int num3 = sc.nextInt();

        if (num1>0 && num2>0 && num3>0){
            System.out.println("All given numbers are positive numbers");
        }
        if(num1%2==0 || num2%2==0 || num3%2==0){
            System.out.println("In the above given numbers, one is even number");
        }

        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        int diff = num1-num2;
        int product = num1*num2;
        int quotient = num1/num2;
        int rem = num1%num2;


        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+diff);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+quotient);
        System.out.println("Remainder:"+rem);



        // Leap year checker 

        System.out.println("Leap year Checker");
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if ((year%4==0) || (year%100!=0)  || (year%400==0)){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }




        // To check in which quadrant the input number lies 

        System.out.print("Enter the x coordinate to check its quadrant:");
        int x_coord = sc.nextInt();

        System.out.print("Enter the y coordinate to check its quadrant:");
        int y_coord = sc.nextInt();

        if (x_coord < 0 && y_coord > 0){
            System.out.println("First Quadrant");
        }
        if (x_coord < 0 && y_coord < 0){
            System.out.println("Second Quadrant");
        }
        if (x_coord < 0 && y_coord < 0){
            System.out.println("Third Quadrant");
        }
        if (x_coord > 0 && y_coord < 0){
            System.out.println("Fouth Quadrant");
        }



        // Even odd checker

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println(num+" is an Even number");
        }
        else {
            System.out.println(num+" is an odd number");
        }



        // Character classifier
        you can also classify it using the range of ASCII values456
        

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ( ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U' ||
             ch=='a' || ch =='e' || ch=='o' || ch=='o' || ch=='u' )
             {
                System.out.println("Given character is an Vowel");
             }

        else if (ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0'){
            System.out.println(ch+" is a Digit");
        }

        else if (ch=='@' || ch=='!' || ch=='#' || ch=='#' || ch=='%' || ch=='^' ||ch=='&'||ch=='*'){
            System.out.println(ch +" is a special character");
        }
        else {
            System.out.println(ch +" is a Consonant");
        }



        // Grade Calculator 

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if ((marks>=90)){
            System.out.println("A Grade");
        }
        else if (marks >=80){
            System.out.println("B Grade");
        }
        else if (marks >=70){
            System.out.println("C Grade");
        } 
        else if (marks >=60){
            System.out.println("D Grade");
        } 
        else {
            System.out.println("Fail");
        }



        // Converting given number to its word form    

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        String[] a = {"Zero","One","Two","Three","Four","Five", "Six","Seven","Eight","Nine","Ten", 
        "Eleven","Twelve","Thirteen","Fourteen", "Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        
        String[] b = {"","","Twenty","Thirty","Forty","Fifty", "Sixty","Seventy","Eighty","Ninety"}; 

    
        if (num < 20) 
         System.out.print(a[num]); 

        else 
        System.out.print(b[num / 10] + " " + a[num % 10]);



        sc.close();                                                                                                            
    }
}

        
    