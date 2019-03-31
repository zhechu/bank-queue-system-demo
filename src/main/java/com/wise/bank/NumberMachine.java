package com.wise.bank;
/**
 * 客户取号管理器
 */
public class NumberMachine {
	/**
	 * 单例的构造函数必须私有化
	 */
	private NumberMachine(){}
	/**
	 * 单例
	 */
	private static NumberMachine instance = new NumberMachine();
	/**
	 * 获取单例客户取号管理器
	 * @return NumberMachine
	 */
	public static NumberMachine getInstance(){
		return instance;
	}
	/**
	 * 普通客户的生成器
	 */
	private NumberManager commonManager = new NumberManager();
	/**
	 * 快速客户的生成器
	 */
	private NumberManager expressManager = new NumberManager();
	/**
	 * VIP客户的生成器
	 */
	private NumberManager vipManager = new NumberManager();
	/**
	 * 获取普通客户的生成器
	 */
	public NumberManager getCommonManager() {
		return commonManager;
	}
	/**
	 * 获取快速客户的生成器
	 */
	public NumberManager getExpressManager() {
		return expressManager;
	}
	/**
	 * 获取VIP客户的生成器
	 */
	public NumberManager getVipManager() {
		return vipManager;
	}

}