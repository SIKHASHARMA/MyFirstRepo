
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Bank {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String name = "";
			int age = 0;
			String gender = "";
			String bank = "";
			int cardnumber = 0;
			int creditlimit = 0;
			int cardnumber1 = 0;
			String transactiondate = "";
			int amount = 0;

			try {
				File f = new File("F:/bankaccount.txt");
				File f1 = new File("F:/banktransactions.txt");

				BufferedReader br = new BufferedReader(new FileReader(f));
				BufferedReader br1 = new BufferedReader(new FileReader(f1));
				String line = null; //COUNT LINE
				//System.out.println("********************************************************");
				System.out.println("Reading 1st file");
				System.out.println("********************************************************");
				while ((line = br.readLine()) != null) {
					String temp[] = line.split(","); //string array & store in pojo
					name = temp[0];
					age = Integer.parseInt(temp[1]);
					gender = temp[2];
					bank = temp[3];
					cardnumber = Integer.parseInt(temp[4]);
					creditlimit = Integer.parseInt(temp[5]);

					System.out.println("Name : " +name);
					System.out.println("Age : " +age);
					System.out.println("Gnder : " +gender);
					System.out.println("Bank : " +bank);
					System.out.println("Card_Number : " +cardnumber);
					System.out.println("Credit_Limit : " +creditlimit);
					System.out.println("********************************************************");

				}
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Reading 2nd file");
				System.out.println("********************************************************");
				while ((line = br1.readLine()) != null) {
					String temp[] = line.split(",");
					cardnumber1 = Integer.parseInt(temp[0]);
					transactiondate = temp[1];
					amount = Integer.parseInt(temp[2]);

					System.out.println("Card_Number : " +cardnumber1);
					System.out.println("Transaction_Date : "+transactiondate);
					System.out.println("Amount : "+amount);
					System.out.println("--------------------------------------------------------------");

				}
				br.close();
				br1.close();

			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
	

	}

}
