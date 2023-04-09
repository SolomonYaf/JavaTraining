package JavaLoops;

import java.util.Scanner;

public class WhileLoopIfElseTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


while (true){
        System.out.println(" Do you want to calculate your taxes");
        String userInput= scanner.next();
if(userInput.equalsIgnoreCase("no"))
    break;
    System.out.println(" Please insert Your Salary");
    double salary = scanner.nextDouble();

        double incomeTax;
        double pensionTax;
        double netPay;
//        System.out.println(" Do you want to calculate your salary?");
//        String answer = scanner.next();
//        if (answer.equalsIgnoreCase("Yes")){
        while(salary>5000){
            if (salary>=60001) {
                incomeTax = salary * 0.3;
                pensionTax = salary * .07;
                netPay=salary-incomeTax-pensionTax;


                System.out.println(" Income Tax: "+incomeTax + "  &  Pension Tax: "+pensionTax);
                System.out.println(" Your net pay is: "+ netPay);
                break;
            }
                else if (salary>=30001){

                incomeTax = salary * 0.15;
                pensionTax = salary * .05;
                netPay=salary-incomeTax-pensionTax;

                System.out.println(" Income Tax: "+incomeTax + "  &  Pension Tax: "+pensionTax);
                System.out.println(" Your net pay is: "+ netPay);
                break;
                }
            else if (salary>5000){

                incomeTax = salary * 0.1;
                pensionTax = salary * .03;
                netPay=salary-incomeTax-pensionTax;
                System.out.println(" Income Tax: "+incomeTax + " & Pension Tax: "+pensionTax);
                System.out.println(" Your net pay is: "+ netPay);
                break;
            }

        }


        }

        }
}


