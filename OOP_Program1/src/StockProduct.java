import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] pd = new Product[4];
		for(int i=0;i<pd.length;i++) {
			System.out.print("Input product Id    : ");
			pd[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			pd[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");
			pd[i].setPrice(scan.nextDouble());
		}

	}

}
