package demo.USTS.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text11_2 {

	public static void main(String[] args) {
		/*��ҽԺ�Ŷӽкž���Ϊҵ�񱳾���ѵ��Java�б����List����Ӧ�ó���������ȡ���Ŷ�
		 * ���ȴ��кš��к�������кţ��кź��Ƴ��ŶӵĶ��׻��ߣ�����ʾ���������ˡ�
		 * �����Ŷӽк���ҵ���ࣨQueueCaller����˽�������л����Ŷ��б�(ArrayList<String>queue);
		 * �����У�
		 * �١��޲ι��췽�������췽����ʵ���������Ŷ��б�Queue��
		 * �ڡ���ȡ���������ķ���int size�������÷����Ĺ����Ǵ��ŶӶ���queue�л�ȡ��Ч���ȡ�
		 * �ۡ�ȡ�ŵķ���void fetchNumber��String patientName���������������ﻼ�߼��뵽�ŶӵĶ�����
		 * ��������ߵľ�����Ϣ����Ϣ���ݣ�
		 * ��������+��ǰ�滹�С�+�Ŷ�����+��λ�ڵȴ������
		 * �ܡ���ʾ���ﻼ����Ϣ�ķ��� void showPatients�������÷�����ȡ�Ŷӵ����л��ߵ�������
		 * �����ÿλ���ߵ���������Ϣ����
		 * ��������+�������С�
		 * �ݡ��кŷ���void callNumber�������÷����Ĺ����Ǵ��ŶӶ����з��ض��׻��ߵ�������
		 * �Ƴ����׻��ߣ���ʾ�����Ѿ���������ŶӶ����У���������кŵĻ��ߵ���Ϣ����Ϣ����
		 * ���뻼�ߣ���+��������+���������Ҿ����
		 * 
		 * �������ࣨMainClass��ģ��к����������main�������ڷ���������������񣺴���һ���Ŷӽк����Ķ���
		 * ��к�����������������ߵ�������ѭ���кŵ�û�л���Ϊֹ��ÿ�νкž�����ʾ�����ŶӵĻ�����Ϣ
		 * 
		 * 
		 */
		MainClass test = new MainClass();
		test.main();
	}

}

class MainClass extends QueueCaller
{
	public void main()
	{
		QueueCaller caller = new QueueCaller();
		caller.fetchNumber("����");
		caller.fetchNumber("����");
		caller.fetchNumber("����");
		//������queue.size,��Ϊsize���ڶ�̬�仯�ġ�
		for(int i = 0; i < 3;i++)
		{
			caller.callNumber();
			caller.showPatients();
			System.out.println("~~~~~~~~~~~~~~");
		}
		
	}
}

//��д�к���ҵ����QueueCaller
class QueueCaller
{
	protected List<String> queue;//�ŶӵĶ�������
	public QueueCaller()
	{
		queue = new ArrayList<String>();
	}
	//��ȡ���еĳ���
	public int getSize()
	{
		return queue.size();
	}
	//ȡ��
	public void fetchNumber(String patientName)
	{
		int num = getSize();
		queue.add(patientName);
		System.out.println(patientName + "ǰ�滹��" + num + "λ�ڵȴ����");
	}
	//��ʾ������Ϣ
	public void showPatients()
	{
		Iterator<String> it = queue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+"�����С�");
		}
	}
	//�кŷ���
	public void callNumber()
	{
		System.out.println("�뻼�ߣ�" + queue.get(0) + "�������Ҿ��");
		queue.remove(0);
	}
	
}
