package cap.demo.tests;

public class AddingHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Selenium";
		String str=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			
			str+=s.charAt(i)+"#";
		}
		System.out.println(str);
		StringBuilder sb=new StringBuilder(str);
		sb.deleteCharAt(str.length()-1);
		str=sb.toString();
		System.out.println(str);

	}

}
