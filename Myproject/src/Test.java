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
				System.out.println("请输入第["+(count+1)+"]个数(0~100)");
				int temp = sc.nextInt();
				if(temp>=0&&temp<=100){
					count++;
					fw.write(String.valueOf(temp));
					fw.write("\r\r");
					fw.flush();
				}else{
					System.out.println("输入的数不在范围内.");
					continue;
				}
				if(count==5){
					System.out.println("输入完毕.");
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
