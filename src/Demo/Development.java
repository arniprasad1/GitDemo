package Demo;

public class Development implements BankingClient{

	public static void main(String[] args) {
		
	Development d = new Development();
	d.checkingbalance();
	d.transferbalance();
	d.paycrcard();
	d.login();

	}

	@Override
	public void paycrcard() 
	{
		
		System.out.println("completed paycard development");
		
	}

	@Override
	public void transferbalance() {
		System.out.println("completed transfer balance development");
		
	}

	@Override
	public void checkingbalance() {
		System.out.println("completed Checking Balance development");
		
	}

	public void login()
	{
		System.out.println("login successfully");
	}
}
