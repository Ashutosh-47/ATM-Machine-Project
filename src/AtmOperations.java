import java.util.HashMap;
import java.util.Map;

public class AtmOperations implements AtmMethods {

    ATM atm = new ATM();

    HashMap < Double , String > map = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println(" Available Balance is : " + atm.getBalance() + "\n") ;
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {

       if ( ( withdrawAmount % 500 ) == 0 ) {
           if ( withdrawAmount < atm.getBalance() ) {

               map.put(withdrawAmount , "Amount Withdraw");

               System.out.println("Collect The cash : " + withdrawAmount) ;
               atm.setBalance( atm.getBalance() - withdrawAmount);
               viewBalance();
           }
           else System.out.println("Insufficient Balance\n");
       }

       else System.out.println("Please Enter The Amount in  Multiple of 500\n");

    }

    @Override
    public void depositAmount(double depositAmount) {

        map.put(depositAmount , "Amount Deposit") ;

        System.out.println("Amount of " + depositAmount + " is Deposited !!!") ;

        atm.setBalance( atm.getBalance() + depositAmount);            // Total

        viewBalance();           // To view the Balance After Deposit
    }

    @Override
    public void checkMiniStatement() {

        for( Map.Entry < Double , String> m : map.entrySet() )
            System.out.println ( m.getValue() + " : " + m.getKey() ) ;

        System.out.println();
    }
}
