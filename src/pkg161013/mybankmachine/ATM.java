

package pkg161013.mybankmachine;
import java.util.*;

public class ATM {
    private int method,money,x;
    private double remain,a,p,i,n;
    Scanner input=new Scanner(System.in);
    
    public ATM(double r){
        System.out.println("1.deposit");
        System.out.println("2.withdraw");
        System.out.println("3.display the current balance");
        System.out.println("4.add daily interest");
        System.out.println("Input the num of method you want:");
        method=input.nextInt();
        
        if (method==1){
            do{
            System.out.println("How much money do you want to deposit:");
            money=input.nextInt();  
            }while(money<0);
            
            remain=r+money;
        }else if (method==2){
            do{
            System.out.println("How much money do you want to withdraw:");
            money=input.nextInt();  
            }while(money<0);
            
            
            if((r-money)<0){
                System.out.println("Error!\n"
                        + "You do not have that much money");
                remain=r;
            }else{
                remain=r-money;
            }
        }else if (method==3){
            System.out.println(r);
            remain=r;
        }else if (method==4){
            System.out.println("Please enter annual interest rate:");
            i=(input.nextDouble())/365;
            System.out.println("Please enter the number of days:");
            n=input.nextDouble();
            p=r;
            
            a=p*Math.pow((1+i),n);
            a=Math.round(a*100);
            a=a/100;
            System.out.println(a);
            remain=a;
        }
        
        
    }
    public double remain(){
        return(remain);
    }
    
    public int over(){
        System.out.println("Input 1 to continue \nInput 0 to quit");
        x=input.nextInt();
        return(x);
    }
}
