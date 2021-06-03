package h6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileIo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String question="e:/question.txt";
			File aFile=new File(question);
			FileReader fr=new FileReader(aFile);
			//读入
			BufferedReader bf= new BufferedReader(fr);
			String answer="e:/answer.txt";
			File bFile=new File(answer);
			FileWriter fw = new FileWriter(bFile);
			PrintWriter pw = new PrintWriter(fw);
			String aLine = "";
			while((aLine=bf.readLine())!=null)
			{
				String s=js(aLine);
				pw.write(s);
			}	
			pw.close();
			bf.close();
			fr.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}//异常
//
	}
	public static String js(String express){
		String regex="((add)|(sub)|(max)|(min))\\(\\d{1,}(,\\d{1,})?\\)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(express);
		String result=express;
		while(m.find())
		{
			String BasicExpress=m.group();
			String s=cal(BasicExpress);
			//System.out.println(BasicExpress+"="+s);
			BasicExpress=BasicExpress.replaceAll("\\(", "\\\\(");
			BasicExpress=BasicExpress.replaceAll("\\)", "\\\\)");
			//System.out.println("表达式为："+BasicExpress);
			result=result.replaceAll(BasicExpress, s);
			//System.out.println("替换为："+result);
			m=p.matcher(result);
		}
//		System.out.println("运算结果为：");
		System.out.println(express+"="+result);
		return express+"="+result+"\r\n";
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

