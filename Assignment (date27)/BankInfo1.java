package Assignment;

public class BankInfo extends AxisBank{
	public void  Saving() {
		System.out.println("Saving");

}
  public void fixed() {
	  System.out.println("fixed");
  }

 public void deposit() {
	 System.out.println("deposit");
}
 public static void main(String[] args) {
	BankInfo Bank=new BankInfo();
	Bank.Saving();
	Bank.fixed();
	Bank.deposit();
}}