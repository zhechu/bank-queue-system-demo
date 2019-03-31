package com.wise.bank;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * �����
 * @author lingyuwang
 *
 */
public class MainClass {

	public static void main(String[] args) {
		//����4����ͨ����
		for(int i=1;i<5;i++){
			ServiceWindow commonWindow =  new ServiceWindow();
			commonWindow.setNumber(i);
			commonWindow.setType(CustomerType.COMMON);
			commonWindow.start();
		}

		//����1�����ٴ���
		ServiceWindow expressWindow =  new ServiceWindow();
		expressWindow.setNumber(5);
		expressWindow.setType(CustomerType.EXPRESS);
		expressWindow.start();

		//����1��VIP����
		ServiceWindow vipWindow =  new ServiceWindow();
		vipWindow.setNumber(6);
		vipWindow.setType(CustomerType.VIP);
		vipWindow.start();

		//��ͨ�ͻ��ú�
		Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				new Runnable(){
					public void run(){
						Integer serviceNumber = NumberMachine.getInstance().getCommonManager().generateNewNumber();
						/**
						 * ����logger��ʽ���޷�����ֱ�۵�����Ч������Ϊlogger.log�����ڲ�������ֱ�Ӱ����ݴ�ӡ��������
						 * ���ǽ����ڲ���һ���߳�ȥ�������ԣ���ӡ�����Ľ����ʱ��˳���Ͽ������ܻ��ҡ�
						 */
						//logger.info("��" + serviceNumber + "����ͨ�ͻ����ڵȴ�����");
						System.out.println("��" + serviceNumber + "����ͨ�ͻ����ڵȴ�����");
					}
				},
				0,
				Constants.COMMON_CUSTOMER_INTERVAL_TIME,
				TimeUnit.SECONDS);

		//���ٿͻ��ú�
		Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				new Runnable(){
					public void run(){
						Integer serviceNumber = NumberMachine.getInstance().getExpressManager().generateNewNumber();
						System.out.println("��" + serviceNumber + "�ſ��ٿͻ����ڵȴ�����");
					}
				},
				0,
				Constants.COMMON_CUSTOMER_INTERVAL_TIME * 2,
				TimeUnit.SECONDS);

		//VIP�ͻ��ú�
		Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
				new Runnable(){
					public void run(){
						Integer serviceNumber = NumberMachine.getInstance().getVipManager().generateNewNumber();
						System.out.println("��" + serviceNumber + "��VIP�ͻ����ڵȴ�����");
					}
				},
				0,
				Constants.COMMON_CUSTOMER_INTERVAL_TIME * 6,
				TimeUnit.SECONDS);
	}

}