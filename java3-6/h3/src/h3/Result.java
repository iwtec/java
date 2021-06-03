package h3;

public class Result {
	private int saleNum;
	private int saleVolums;
	private double sumOfMoney;
	
	public Result(int saleNum,int saleVolums,double sumOfMoney){
		this.saleNum=saleNum;
		this.saleVolums=saleVolums;
		this.sumOfMoney=sumOfMoney;
	}
	
	public int getSaleNum() {
		return saleNum;
	}
	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}
	public int getSaleVolums() {
		return saleVolums;
	}
	public void setSaleVolums(int saleVolums) {
		this.saleVolums = saleVolums;
	}
	public double getSumOfMoney() {
		return sumOfMoney;
	}
	public void setSumOfMoney(double sumOfMoney) {
		this.sumOfMoney = sumOfMoney;
	}
	@Override
	public String toString() {
		return "\n"+"总计：     销售笔数 "+saleNum+"，销售数量 "+saleVolums+"，销售金额  "+sumOfMoney;
	}
	
	
}
