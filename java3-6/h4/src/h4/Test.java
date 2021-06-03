package h4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入表达式（如add(2,min(3，5))）：");
		Scanner scan=new Scanner(System.in);
		String express=scan.next();
		String regex="((add)|(sub)|(max)|(min))\\(\\d{1,}(,\\d{1,})?\\)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(express);
		String result=express;
		while(m.find())
		{
			String BasicExpress=m.group();
			String s=cal(BasicExpress);
			BasicExpress=BasicExpress.replaceAll("\\(", "\\\\(");
			BasicExpress=BasicExpress.replaceAll("\\)", "\\\\)");
			result=result.replaceAll(BasicExpress, s);
			m=p.matcher(result);
		}
		System.out.println("运算结果为：");
		System.out.println(express+"="+result);

	}
	public static String cal(String BasicExpress){
		String result="";
		int Iresult=0;
		int op1=BasicExpress.indexOf("(");
		int op2=BasicExpress.indexOf(",");
		int op3=BasicExpress.indexOf(")");
		int first=Integer.parseInt(BasicExpress.substring(op1+1,op2));
		int second=Integer.parseInt(BasicExpress.substring(op2+1,op3));
		switch(BasicExpress.substring(0, op1)){
		case "add":Iresult=first+second;break;
		case "sub":Iresult=first+second;break;
		case "min":if(first<second)
			Iresult=first;
		else
			Iresult=second;
		break;
		case "max":if(first>second)
			Iresult=first;
		else
			Iresult=second;
		break;
		
		}
		result+=Iresult;
		return result;
	}

}

