package Oops;

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OnlineBanking o=new  OnlineBanking();
		 o.setAcc_balance(15000);
		 System.out.println(o.getAcc_balance());
	}

}


class OnlineBanking{
	private String acc_name="pooja";
	private long acc_number=123456;
	private String ifsc="SBIN00345";
	private int acc_balance = 10000;
	
	public int getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(int acc_balance) {
		this.acc_balance = acc_balance;
	}
	
}