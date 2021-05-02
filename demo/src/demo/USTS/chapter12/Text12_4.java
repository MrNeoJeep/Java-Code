package demo.USTS.chapter12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Text12_4 {

	public static void main(String[] args) {
		/*编写程序，对于给定的字符串，使用正则表达式判断该字符串是否是合法的IP地址并输出判断结果
		 */
		String str = "92.168.0.12";
		Pattern pattern = Pattern.compile(
			"^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."

			+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."

			+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."

			+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
		//双斜杠是转义字符代表一个斜杠的意思
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.matches());
	}

}
