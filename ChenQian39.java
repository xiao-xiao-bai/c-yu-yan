import java.util.Scanner;
public class ChenQian39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入两个整数:");
		a = input.nextInt();
		b = input.nextInt();
		System.out.println("和:" + (a + b));
		System.out.println("差:" + (a - b));
		System.out.println("积:" + (a * b));
		System.out.println("商:" + (a / b));


	}

}
