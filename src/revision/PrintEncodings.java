package revision;
public class PrintEncodings {
	public static void printEncode(String ques, String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return;
		}
		else if(ques.length() == 1)
		{
			char ch = ques.charAt(0);
			if(ch == '0')
			{
				return;
			}
			else
			{
				int ch_val = ch - '0';
				char code = (char) ('a' + ch_val - 1);
				ans = ans + code;
				System.out.println(ans);
			}
		}
		else
		{
			char ch = ques.charAt(0);
			String restOfString = ques.substring(1);
			
			if(ch == '0')
			{
				return;
			}
			else
			{
				int ch_val = ch - '0';
				char code = (char) ('a' + ch_val - 1);
				printEncode(restOfString, ans + code);
			}
			
			String ch_ft = ques.substring(0,2);
			String roq = ques.substring(2);
			
			int ch_ft_val = Integer.parseInt(ch_ft);
			if(ch_ft_val <= 26)
			{
				char code = (char) ('a' + ch_ft_val - 1);
				printEncode(roq, ans + code);
			}
		}
	}
	public static void main(String[] args)
	{
		String str = "123";
		printEncode(str, "");
	}

}
