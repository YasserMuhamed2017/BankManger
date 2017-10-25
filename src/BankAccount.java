
public class BankAccount {
	int account;
	int balance;
	 private double width;
	   private double height;
	   public BankAccount(double width, double height){
	      this.width = width;
	      this.height =height;
	   }
	   public final double getArea(){
	      return width*height;
	   }
}
