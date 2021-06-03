package h3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductDao {

	public ArrayList<Product> inputFromKeyBoard(){
		ArrayList<Product> list=new ArrayList<Product>();
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入（0000结束）：");
		String aLine = scan.nextLine();
		int seq=98;
		
		while(!aLine.equals("0000")){
			String[] s=aLine.split(",|，");
			String name = s[0];
			int num = Integer.parseInt(s[1]);
			Double price = Double.parseDouble(s[2]);
			Double totalPrice= price*num;
			String i=""+seq;
			String sno=generateSno(i);
			Product pro=new Product(sno,name,num,price,totalPrice);
			list.add(pro);
			aLine = scan.nextLine();
		}
		
		return list;
	}
	public Result process(ArrayList<Product> list){
		
		int saleNum=list.size();
		int saleVolums=0;
		double sumOfMoney=0;
		
		for(int i=0;i<list.size();i++){
			Product pro=list.get(i);
			saleVolums+=pro.getNum();
			sumOfMoney+=pro.getTotalPrice();
		}
		Result result=new Result(saleNum,saleVolums,sumOfMoney);
		
		return result;
	}
	public String output(ArrayList<Product> list,Result result){
		String info="流水号\t\t商品名称\t商品数量\t单价\t总价";
		for(Product pr:list) {
			info+=pr.toString();
		}
		info+=result.toString();
		return info;
	}
	
	public String generateSno(String s){
		String info="";
		Date date=new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		int s1=Integer.parseInt(s)+1;
		String str=""+s1;
		while(str.length()<4){
			str="0"+str;
		}
		info=df.format(date)+str;
		return info;
	}
}
