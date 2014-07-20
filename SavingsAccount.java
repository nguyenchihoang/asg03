package ooplab03;


class Account{
	public static int annualInterestRate = 4;  //lãi xuất theo năm;
	private double savingsBalance;			// so tien hien tai;
	
	public Account(double d){
		this.savingsBalance=d;
	}
	public void calculateMonthlyInterest(){
		double tienlai, tongtien;
		this.annualInterestRate=annualInterestRate;
		this.savingsBalance =savingsBalance;
		tienlai= ((annualInterestRate*savingsBalance)/12);
		System.out.print("tien lai la: ");
		System.out.print(tienlai);
		
		tongtien=this.savingsBalance+tienlai;
		System.out.print("tong tien la : ");
		System.out.print(tongtien);
		System.out.print("\n");
	}
	public  static int modifyInterestRate(){
		return annualInterestRate;
	}
}
public class SavingsAccount{
	public static void main(String[] args){
		Account t1= new Account(2000.00);
		Account t2 =new Account(3000.00);
		t1.calculateMonthlyInterest();
		t2.calculateMonthlyInterest();
		
		System.out.println("Tien lai va tong tai khoan sau khi thay doi lai xuat la ");
		t1.annualInterestRate=5;
		t2.annualInterestRate=5;
		t1.calculateMonthlyInterest();
		t2.calculateMonthlyInterest();
		
	}
}
