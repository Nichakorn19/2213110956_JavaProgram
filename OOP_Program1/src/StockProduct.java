import java.util.*;
import java.text.*;
public class StockProduct {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		Product[] pd = new Product[4];
		for(int i=0;i<pd.length;i++) {
			pd[i] = new Product();
			System.out.print("Input product Id    : ");
			pd[i].setId(scan.next()); 
			System.out.print("Input product Unit  : ");
			pd[i].setUnit(scan.nextInt());
			while(!pd[i].checkUnit()) {
				System.out.println("Input product Unit  : ");
				pd[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price : ");
			pd[i].setPrice(scan.nextDouble());
			while(!pd[i].checkPrice()) {
				System.out.println("Input product Price  : ");
				pd[i].setPrice(scan.nextInt());
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		for(Product _pd:pd) {
			System.out.println("Product ID : "+_pd.getId()+", Total price = "+_pd.calculate()+" baht.");
		}
		double total=0;
		for(int i=0;i<pd.length;i++) {
			total=(pd[0].calculate()+pd[1].calculate()+pd[2].calculate()+pd[3].calculate());
		}
		System.out.println("-------------------------------------");
		System.out.println("Total price of all product is "+frm.format(total)+" baht.");
	}

}
