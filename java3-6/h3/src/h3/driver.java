package h3;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ProductDao pd=new ProductDao();
		ArrayList<Product> pList=pd.inputFromKeyBoard();
		Result rs=pd.process(pList);
		System.out.println(pd.output(pList, rs));

	}

}

