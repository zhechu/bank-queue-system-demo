package com.wise.bank;
import java.util.ArrayList;
import java.util.List;
/**
 * 客户取号生成器
 */
public class NumberManager {
	/**
	 * 最近一个号（最后一个号）
	 */
	private int lastNumber = 0;
	/**
	 * 客户取号集
	 */
	private List<Integer> queueNumbers = new ArrayList<Integer>();

	/**
	 * 生成最后一个号
	 * @return Integer
	 */
	public synchronized Integer generateNewNumber(){
		queueNumbers.add(++lastNumber);
		return lastNumber;
	}

	/**
	 * 获取最后一个号，并将其从客户取号集里删除
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