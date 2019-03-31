package com.wise.bank;
/**
 * �ͻ�ȡ�Ź�����
 */
public class NumberMachine {
	/**
	 * �����Ĺ��캯������˽�л�
	 */
	private NumberMachine(){}
	/**
	 * ����
	 */
	private static NumberMachine instance = new NumberMachine();
	/**
	 * ��ȡ�����ͻ�ȡ�Ź�����
	 * @return NumberMachine
	 */
	public static NumberMachine getInstance(){
		return instance;
	}
	/**
	 * ��ͨ�ͻ���������
	 */
	private NumberManager commonManager = new NumberManager();
	/**
	 * ���ٿͻ���������
	 */
	private NumberManager expressManager = new NumberManager();
	/**
	 * VIP�ͻ���������
	 */
	private NumberManager vipManager = new NumberManager();
	/**
	 * ��ȡ��ͨ�ͻ���������
	 */
	public NumberManager getCommonManager() {
		return commonManager;
	}
	/**
	 * ��ȡ���ٿͻ���������
	 */
	public NumberManager getExpressManager() {
		return expressManager;
	}
	/**
	 * ��ȡVIP�ͻ���������
	 */
	public NumberManager getVipManager() {
		return vipManager;
	}

}