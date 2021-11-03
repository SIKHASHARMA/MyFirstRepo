import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Bank5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cardnumber = 0;
		String transactiondate = "";
		int amount = 0;
		String line = null;
		String s = "";		
		File f = new File("F:/banktransactions.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			int a[]=new int[9];
			int lineCount = 0;
			while ((line = br.readLine()) != null) {
				String temp[] = line.split(",");
				cardnumber = Integer.parseInt(temp[0]);				
				transactiondate = temp[1];
				amount = Integer.parseInt(temp[2]);
				a[lineCount] = amount;
				lineCount++;
				/*
				 * System.out.println(cardnumber); System.out.println(transactiondate);
				 * System.out.println(amount); System.out.println("------------------");
				 */
				//System.out.println(amount);
				/*
				 * for (int i = 0; i < lineCount; i++) { a[i] = amount; }
				 * //System.out.println(a[0]); List<Integer> list = new ArrayList<Integer>();
				 * list.add(a[0]); Collections.sort(list, Collections.reverseOrder()); for (int
				 * i:list) { System.out.println(i); }
				 * 
				 * 
				 * //System.out.println(list.toString());
				 */				
				
			}
			//System.out.println(lineCount);
			
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
		
			
			
				br.close();
		}
	 
	
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
