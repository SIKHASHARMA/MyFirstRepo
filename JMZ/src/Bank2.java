import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bank2 {

	static void m1() {
		String name = "";
		int age = 0;
		String gender = "";
		String bank = "";
		int cardnumber = 0;
		int creditlimit = 0;
		String line = null;
		String bank1 = "HDFC";
		String bank2 = "ICICI";
		File f = new File("F:/bankaccount.txt");
		System.out.println(bank1);
		System.out.println("[Name, Age,Gender,Card,Limit]");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));

			while ((line = br.readLine()) != null) {
				String temp[] = line.split(",");
				name = temp[0];
				age = Integer.parseInt(temp[1]);
				gender = temp[2];
				bank = temp[3];
				cardnumber = Integer.parseInt(temp[4]);
				creditlimit = Integer.parseInt(temp[5]);
				ArrayList<Object> list = new ArrayList<Object>(); //to store object 
				
				if (temp[3].equals(bank1)) {
					
					list.add(temp[0]);
					list.add(temp[1]);
					list.add(temp[2]);
					list.add(temp[4]);
					list.add(temp[5]);
					System.out.println(list);

				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

	}

	static void m2() {

		String name = "";
		int age = 0;
		String gender = "";
		String bank = "";
		int cardnumber = 0;
		int creditlimit = 0;
		String line = null;
		String bank1 = "HDFC";
		String bank2 = "ICICI";
		File f = new File("F:/bankaccount.txt");
		System.out.println(bank2);
		System.out.println("[Name, Age,Gender,Card,Limit]");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));

			while ((line = br.readLine()) != null) {
				String temp[] = line.split(",");
				name = temp[0];
				age = Integer.parseInt(temp[1]);
				gender = temp[2];
				bank = temp[3];
				cardnumber = Integer.parseInt(temp[4]);
				creditlimit = Integer.parseInt(temp[5]);

				ArrayList<Object> list1 = new ArrayList<Object>();
				
				if (temp[3].equals(bank2)) {
					
					list1.add(temp[0]);
					list1.add(temp[1]);
					list1.add(temp[2]);
					list1.add(temp[4]);
					list1.add(temp[5]);
					System.out.println(list1);
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank2.m1();
		Bank2.m2();

	}

}
