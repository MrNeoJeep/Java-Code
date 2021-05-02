package demo.USTS.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Text11_1 {

	public static void main(String[] args) {
		/* �ڵ������н�����BankAccount�࣬�Լ��洢�����˻��ľۼ���Bank��
		 * Bank�����ʹ������ʵ��
		 * �١�Java�����ּ�������ʺϴ�������ʵ��Bank�ࣿ�����˾�����ArrayList�ࣩ
		 * �ڡ��޸�BankAccout�࣬ʹ���������������ȷ���Ľ��������
		 * �ۡ���дBank�࣬ʹ�ü��������������ʵ�֡�
		 * �ܡ���д���Գ���
		 * */
		Test test1 = new Test();
		test1.test();

	}

}
//��д������
class Test
{
	public void test() {
		Bank bank = new Bank();
		BankAccount b1 = new BankAccount("A1", "Tom");
		BankAccount b2 = new BankAccount("A2", "Tim");
		BankAccount b3 = new BankAccount("A3", "Jerry");
		bank.add(b1);
		bank.add(b2);
		bank.add(b3);
		//bank.testAdd();
		System.out.println("����Ϊ��" + bank.getTotal());
		System.out.println("��һλ�û����Ϊ��" + bank.getItem("b1").getAccountNumber());
		System.out.println("��һλ�û�����Ϊ��" + bank.getItem("b1").getAccountName());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//��Ǯ
		boolean flag = bank.depositMoney("A2", 10000);
		System.out.println("A2�û���Ǯ�Ƿ�ɹ���true�ɹ���falseʧ��  " + flag);
		//ȡǮ
		boolean flag2 = bank.withdrawMoney("A2", 1000);
		System.out.println("A2�û�ȡǮ�Ƿ�ɹ���true�ɹ���falseʧ��  " + flag2);
		//�Ƴ��û�
		boolean flag3 = bank.remove("A3");
		System.out.println("A3�û��Ƿ�ɾ���ɹ���true�ɹ���falseʧ��  " + flag3);
		
	}
}

//Bank��
class Bank
{
	private List<BankAccount> ls;//����ArrayList�ļ����࣬��������ΪBankAccount
	private int total;
	//���ǵ������ǿ��Զ�̬��չ�ģ����Բ�����size
	public Bank()
	{
		ls = new ArrayList<BankAccount>();
		this.total = 0;
	}
	//����һ����ʾ�˻���ŵ��ַ������������������Ŷ�Ӧ���˻������±�
	public int search(String accountNumberIn)
	{
		//����
		Iterator<BankAccount> it = ls.iterator();
		int index = -1;
		while(it.hasNext())
		{
			index++;
			if(it.next().getAccountNumber() == accountNumberIn);
			{
				
				return index;  //���������������ǰreturn��������return-999��
			}
			
		}
		return -999;
		
//		System.out.println("`````````````````");
//		if(ls.indexOf(accountNumberIn) == -1)
//		{
//			return -999;
//		}
//		else {
//			return ls.indexOf(accountNumberIn);//���������⣡��������
//		}
		
	}
	//getTotal����
	public int getTotal()
	{
		return this.total;
	}
	//add������ʵ��  ��Ӻ�������ȷ��
	public boolean add(BankAccount accountIn)
	{
		ls.add(accountIn);
		total++;
		return true;
		
	}

//	public void testAdd()
//	{
//		Iterator<BankAccount> it = ls.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next().getAccountNumber());
//		}
//		
//	}
	//getItem������ʵ�֣�Ҫ�����һ�������˻���ŵ��ַ��������������˻����BankAccount����
	public BankAccount getItem(String accountNumberIn)
	{
		int index;
		index = search(accountNumberIn);
		if(index == -999)
		{
			return null;
		}
		else {
			return ls.get(index);
		}
	}
	//��дdepositMoney����һ������Ϊ�˻���ţ��ڶ�������Ϊ���������ɹ��򷵻�true���򷵻�false
	public boolean depositMoney(String accountNumberIn,double accountIn)
	{
		int index = search(accountNumberIn);
		if(index == -999)
		{
			return false;
		}
		else {
			ls.get(index).desposit(accountIn);
			return true;
		}
	}
	//withdrawMoney
	public boolean withdrawMoney(String accountNumberIn,double amountIn)
	{
		int index = search(accountNumberIn);
		if(index == -999)
		{
			return false;
		}
		else {
			ls.get(index).withdraw(amountIn);;
			return true;
		}
	}
	
	//remove����
	public boolean remove(String accountNumberIn)
	{
		int index = search(accountNumberIn);
		if(index == -999)
		{
			return false;
		}
		else {
			ls.remove(index);
			return true;
		}
	}
	
	
}

//BankAccount��
class BankAccount
{
	private String accountNumber;
	private String accountName;
	private double balance;
	private static double interestRate;
	
	public BankAccount(String numberIn,String nameIn)
	{
		this.accountNumber = numberIn;
		this.accountName = nameIn;
		this.balance = 0;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		BankAccount.interestRate = interestRate;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}
	//��Ǯ
	public void desposit(double amountIn)
	{
		balance = balance+amountIn;
	}
	//ȡǮ
	public void withdraw(double amountIn)
	{
		balance = balance-amountIn;
	}
}



