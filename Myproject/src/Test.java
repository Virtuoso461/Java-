import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

public class Test {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		File file = new File("C:\\Users\\Virtuoso Q\\Desktop\\Test.txt");
		FileWriter fw = null;
		int count = 0;
		try {
			fw = new FileWriter(file);
			while(true) {
				System.out.println("�������["+(count+1)+"]����(0~100)");
				int temp = sc.nextInt();
				if(temp>=0&&temp<=100){
					count++;
					fw.write(String.valueOf(temp));
					fw.write("\r\r");
					fw.flush();
				}else{
					System.out.println("����������ڷ�Χ��.");
					continue;
				}
				if(count==5){
					System.out.println("�������.");
					break;
				}
			}
		} catch (Exception e){
			e.printStackTrace();
		}finally {
			if(fw !=null){
				try {
					fw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
