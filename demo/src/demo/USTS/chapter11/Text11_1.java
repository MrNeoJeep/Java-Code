package demo.USTS.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Text11_1 {

	public static void main(String[] args) {
		/* 在第五章中介绍了BankAccount类，以及存储银行账户的聚集类Bank。
		 * Bank类可以使用数组实现
		 * ①、Java中哪种集合类更适合代替数组实现Bank类？（个人觉得是ArrayList类）
		 * ②、修改BankAccout类，使该类适用于问题①确定的解决方案。
		 * ③、重写Bank类，使用集合类而不是数组实现。
		 * ④、编写测试程序
		 * */
		Test test1 = new Test();
		test1.test();

	}

}
//编写测试类
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
		System.out.println("总数为：" + bank.getTotal());
		System.out.println("第一位用户编号为：" + bank.getItem("b1").getAccountNumber());
		System.out.println("第一位用户姓名为：" + bank.getItem("b1").getAccountName());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//存钱
		boolean flag = bank.depositMoney("A2", 10000);
		System.out.println("A2用户存钱是否成功，true成功，false失败  " + flag);
		//取钱
		boolean flag2 = bank.withdrawMoney("A2", 1000);
		System.out.println("A2用户取钱是否成功，true成功，false失败  " + flag2);
		//移除用户
		boolean flag3 = bank.remove("A3");
		System.out.println("A3用户是否删除成功，true成功，false失败  " + flag3);
		
	}
}

//Bank类
class Bank
{
	private List<BankAccount> ls;//定义ArrayList的集合类，数据类型为BankAccount
	private int total;
	//考虑到数组是可以动态拓展的，可以不传入size
	public Bank()
	{
		ls = new ArrayList<BankAccount>();
		this.total = 0;
	}
	//接收一个表示账户编号的字符串参数，返回输入编号对应的账户数组下标
	public int search(String accountNumberIn)
	{
		//遍历
		Iterator<BankAccount> it = ls.iterator();
		int index = -1;
		while(it.hasNext())
		{
			index++;
			if(it.next().getAccountNumber() == accountNumberIn);
			{
				
				return index;  //如果满足条件会提前return掉，不会return-999；
			}
			
		}
		return -999;
		
//		System.out.println("`````````````````");
//		if(ls.indexOf(accountNumberIn) == -1)
//		{
//			return -999;
//		}
//		else {
//			return ls.indexOf(accountNumberIn);//就是有问题！！！！！
//		}
		
	}
	//getTotal函数
	public int getTotal()
	{
		return this.total;
	}
	//add函数的实现  添加函数是正确的
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
	//getItem函数的实现，要求接收一个代表账户编号的字符串参数，返回账户编号BankAccount对象、
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
	//编写depositMoney，第一个参数为账户编号，第二个参数为存款额。如果存款成功则返回true否则返回false
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
	
	//remove函数
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

//BankAccount类
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
	//存钱
	public void desposit(double amountIn)
	{
		balance = balance+amountIn;
	}
	//取钱
	public void withdraw(double amountIn)
	{
		balance = balance-amountIn;
	}
}



