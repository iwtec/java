package h3;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ProductDao pd=new ProductDao();
		ArrayList<Product> pList=pd.inputFromKeyBoard();
		Result rs=pd.process(pList);
		System.out.println(pd.output(pList, rs));

	}

}

