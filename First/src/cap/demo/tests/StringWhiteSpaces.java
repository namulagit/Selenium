package cap.demo.tests;

public class StringWhiteSpaces {
	
	public static void main(String n[])
	{
		String str="JDBC ODBC Driver";
		String replace=str.replaceAll("\\s", "");
		System.out.println(replace);
		char[] chararray=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<chararray.length;i++)
		{
			if((!Character.isSpaceChar(chararray[i]) && chararray[i]!='\t'))
					{
				sb.append(chararray[i]);
				
				
				
					}
			
		}
		System.out.println(sb);
		
	}

}
