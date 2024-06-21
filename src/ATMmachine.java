import java.util.Scanner;

class  ATM{
    float  balance ;
    int PIN =5646;
    public void  checkpin (){
        System.out.println(" Enter your pin ");
        Scanner sc= new Scanner(System.in);
        int enterpin = sc.nextInt();
        if(enterpin==PIN){
            menu();

        }else System.out.println(" Enter a valid pin");
    }
    public  void   menu(){
        System.out.println("Enter Your choice");
        System.out.println(" 1 Check your a/c Balance");
        System.out.println(" 2 Withdraw money");
        System.out.println(" 3 Deposit money");
        System.out.println( "4 Exit");
        Scanner sc= new Scanner(System.in);
        int opt = sc.nextInt();
        if( opt ==1){
            checkBalance();
        } else if (opt==2) {
            WithdraMoney();
        } else if (opt==3) {
            depositMony();
        } else if (opt==4){
            return;
        }
        else System.out.println(" Enter a velid choice");
    }
    public  void  checkBalance(){
        System.out.println("Balance:"+balance);
        menu();
    }
    public  void  WithdraMoney(){
        System.out.println(" Enter ammount to withdraw ");
        Scanner sc= new Scanner(System.in);
         float amount = sc.nextFloat();
         if(amount>balance){
             System.out.println(" Insufficient Balance");
         }else {
             balance =balance-amount;
             System.out.println(" money withdrawl successful");
         } menu();
    }
     public  void    depositMony (){
         System.out.println( " Enter the amount");
         Scanner sc= new Scanner(System.in);
         float amount = sc.nextFloat();
         balance =balance+amount;
         System.out.println("money deposit successfully");
          menu();
     }
 }
public class ATMmachine {
    public static void main(String[] args) {
         ATM  obj = new ATM();
         obj.checkpin();
    }

}
