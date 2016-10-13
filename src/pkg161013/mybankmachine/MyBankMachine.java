
package pkg161013.mybankmachine;

public class MyBankMachine {

    public static void main(String[] args) {
        int x=1; 
        double remain=0;
        
       while (x!=0){
           ATM atm1 = new ATM (remain);
           remain=atm1.remain();
           x=atm1.over();
       }
    }
    
}
