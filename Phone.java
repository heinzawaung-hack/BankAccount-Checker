public class Phone {
   private long accountNumber;
   private long balance;
   private String customerName;
   private String email;
   private int phoneNumber;


   //This is getter.
   public long getAccountNumber(){
      return accountNumber;
   }
   public long getBalance(){
      return balance;
   }
   public String getCustomerName(){
      return customerName;
   }
   public String getEmail(){
      return email;
   }
   public int getPhoneNumber(){
      return phoneNumber;
   }

   //This is setter.
   public void setAccountNumber(long newAccountNumber){
      this.accountNumber = newAccountNumber;
   }
   public void setBalance(long newBalance){
      this.balance = newBalance;
   }
   public void setCustomerName(String newCustomerName){
      this.customerName = newCustomerName;
   }
   public void setEmail(String newEmail){
      this.email = newEmail;
   }
   public void setPhoneNumber(int newPhoneNumber){
      this.phoneNumber = newPhoneNumber;
   }

   //This is Deposit and withdraw Function.

   public void depositFund(int depositAmount){
      this.balance += depositAmount;
      System.out.println("You deposited " + depositAmount + " USD. Total Balance is " +
              this.balance + " USD.");
   }

   public void withdrawFund(int totalWithdraw){
      if (this.balance - totalWithdraw < 0){
         System.out.println( "Your balance is " + this.balance +
                 ". You are FUCKING BROKE, Add Some Fucking Fund.");
      }else {
         this.balance -= totalWithdraw;
         System.out.println("You withdrew " + totalWithdraw +
                 " USD. Final Balance is  " + this.balance);
      }
   }
}
