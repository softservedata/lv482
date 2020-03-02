package thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Hw4 {

	public static void main(String[] args) {
		int count = 0;
		List<String> list = new ArrayList<>();
		String s = "";
		String max = " ";
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("D:\\My Project\\lv482\\src\\main\\java\\thread\\Birds.txt"));

			while ((s = br.readLine()) != null) {
				list.add(s);
				count++;
				System.out.printf("\nLine " + count + " length  = " + s.length());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < list.size(); i++) {
			if (max.length() < list.get(i).length()) {
				max = list.get(i);
			}
		}
		BufferedWriter fw;
		
		try {
			fw = new BufferedWriter(new FileWriter("D:\\My Project\\lv482\\src\\main\\java\\thread\\myTxt.txt", false));
			fw.write("Number of lines " + list.size());
			
			fw.write("Number of lines " + count);
			
			fw.write("The longest line ic " + max + " its length = " + max.length());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
