package com.NetTrading.server.ibatis.dao;

import com.NetTrading.server.ibatis.model.Administrateur;

public interface AdministrateurDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table administrateur
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	int deleteByPrimaryKey(Integer id_admin);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table administrateur
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	void insert(Administrateur record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table administrateur
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	void insertSelective(Administrateur record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table administrateur
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	Administrateur selectByPrimaryKey(Integer id_admin);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table administrateur
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	int updateByPrimaryKeySelective(Administrateur record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table administrateur
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	int updateByPrimaryKey(Administrateur record);
}