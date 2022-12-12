import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        AtmMethods x = new AtmOperations();       // We create instance of the class now x can acces all The Methods

        int atmnumber = 123;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("----------------------------------------------------    WELCOME To FreeBank    -------------------------------------------------------------------------------------------");
        System.out.println();

        System.out.print("Enter Your ATM Number : ");
        int inputnumber = sc.nextInt();
        System.out.print("Enter Your PIN Number : ");
        int inputpin = sc.nextInt();

        if ( (inputnumber == atmnumber) && (inputpin == atmpin) ) {
            System.out.println();
            System.out.println("-------------------------------------------------------    WELCOME Our Services   ----------------------------------------------------------------------------- ") ;
            System.out.println();

            while(true) {       // Loop for Available balence until Exit option is selected application

                // ---------------------------  Options
                System.out.println(" 1. View Available Balance\n 2. Withdraw Amount\n 3. Deposit Amount\n 4. Check MiniStatement\n 5. Exit");
                System.out.println();

                System.out.print("Enter Option : ") ;
                int choice = sc.nextInt();
                System.out.println();

                switch ( choice ) {
                    case 1 : {
                        x.viewBalance();
                        break;
                    }
                    case 2 : {                    // Withdraw
                        System.out.print("Enter The Amount to WithDraw : ") ;
                        double withdrawAmount = sc.nextDouble();
                        System.out.println();
                        x.withdrawAmount(withdrawAmount);
                        break;

                    }
                    case 3 : {                 // To Deposit
                        System.out.print("Enter Amount To Deposit : ") ;
                        double depositAmount = sc.nextDouble();
                        System.out.println();
                        x.depositAmount(depositAmount);                // Call Method
                        break;
                    }
                    case 4 : {
                        x.checkMiniStatement();
                        break;
                    }
                    case 5 : {
                        System.out.println("Please Collect your ATM Card");
                        System.out.println("-------------------------------------------------------    ThankYou For Using Our Services   ----------------------------------------------------------------------------- ") ;

                        System.exit(0);            // EXit Application
                        break;
                    }
                    default : {
                        System.out.println("-------------------------------------------------------    Please Enter Valid Option   ----------------------------------------------------------------------------- ") ;
                        break;   //In case not 1,2,3,4,5 options
                    }
                }

            }

        } else {
            System.out.println("Incorrect ATM Number or PIN Try Again ") ;

            System.exit(0);       // Exist from application if user dont enter correct ( just type 0 )
        }
    }
}
