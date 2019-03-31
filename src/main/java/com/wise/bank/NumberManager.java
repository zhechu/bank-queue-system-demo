package com.wise.bank;
import java.util.ArrayList;
import java.util.List;
/**
 * �ͻ�ȡ��������
 */
public class NumberManager {
	/**
	 * ���һ���ţ����һ���ţ�
	 */
	private int lastNumber = 0;
	/**
	 * �ͻ�ȡ�ż�
	 */
	private List<Integer> queueNumbers = new ArrayList<Integer>();

	/**
	 * �������һ����
	 * @return Integer
	 */
	public synchronized Integer generateNewNumber(){
		queueNumbers.add(++lastNumber);
		return lastNumber;
	}

	/**
	 * ��ȡ���һ���ţ�������ӿͻ�ȡ�ż���ɾ��
	 * @return Integer
	 */
	public synchronized Integer fetchNumber(){
		if(queueNumbers.size()>0){
			return (Integer)queueNumbers.remove(0);
		}else{
			return null;
		}
	}
}