package demo.USTS.chapter12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Text12_4 {

	public static void main(String[] args) {
		/*��д���򣬶��ڸ������ַ�����ʹ��������ʽ�жϸ��ַ����Ƿ��ǺϷ���IP��ַ������жϽ��
		 */
		String str = "92.168.0.12";
		Pattern pattern = Pattern.compile(
			"^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."

			+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."

			+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."

			+"(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
		//˫б����ת���ַ�����һ��б�ܵ���˼
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.matches());
	}

}
