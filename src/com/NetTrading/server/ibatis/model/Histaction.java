package com.NetTrading.server.ibatis.model;

import java.util.Date;

public class Histaction {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column histaction.idHistact
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	private Integer idHistact;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column histaction.dateExec_action
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	private Date dateExec_action;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column histaction.valeur_action
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	private Float valeur_action;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column histaction.idHistact
	 * @return  the value of histaction.idHistact
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	public Integer getIdHistact() {
		return idHistact;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column histaction.idHistact
	 * @param idHistact  the value for histaction.idHistact
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	public void setIdHistact(Integer idHistact) {
		this.idHistact = idHistact;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column histaction.dateExec_action
	 * @return  the value of histaction.dateExec_action
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	public Date getDateExec_action() {
		return dateExec_action;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column histaction.dateExec_action
	 * @param dateExec_action  the value for histaction.dateExec_action
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	public void setDateExec_action(Date dateExec_action) {
		this.dateExec_action = dateExec_action;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column histaction.valeur_action
	 * @return  the value of histaction.valeur_action
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	public Float getValeur_action() {
		return valeur_action;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column histaction.valeur_action
	 * @param valeur_action  the value for histaction.valeur_action
	 * @ibatorgenerated  Mon Jan 14 17:44:12 CET 2013
	 */
	public void setValeur_action(Float valeur_action) {
		this.valeur_action = valeur_action;
	}
}