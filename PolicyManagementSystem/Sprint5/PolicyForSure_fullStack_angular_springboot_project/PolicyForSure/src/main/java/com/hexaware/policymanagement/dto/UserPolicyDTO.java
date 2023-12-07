package com.hexaware.policymanagement.dto;

import java.time.LocalDate;

import com.hexaware.policymanagement.entity.Policy;
import com.hexaware.policymanagement.entity.PolicyPayment;
import com.hexaware.policymanagement.entity.User;

/* Author:Vidhyamalathi
 * @CreatedOn:-12-11-2023
 * Description: AddressDTO Class
 */
public class UserPolicyDTO 
{
	private long policyNo;
	private LocalDate startDate;
	private User user;
	private Policy policy;
	private PolicyPayment policyPayment;
	private String policyName;
	private String policyType;
	private String company;
	private LocalDate endDate;
	private String termPeriod;
	private double amount;
	private double maturityAmount;
	private double interest;
	
	
	
	public long getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(long policyNo) {
		this.policyNo = policyNo;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public PolicyPayment getPolicyPayment() {
		return policyPayment;
	}
	public void setPolicyPayment(PolicyPayment policyPayment) {
		this.policyPayment = policyPayment;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getTermPeriod() {
		return termPeriod;
	}
	public void setTermPeriod(String termPeriod) {
		this.termPeriod = termPeriod;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getMaturityamount() {
		return maturityAmount;
	}
	public void setMaturityamount(double maturityamount) {
		this.maturityAmount = maturityamount;
	}

	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public UserPolicyDTO(long policyNo, LocalDate startDate, User user, Policy policy, PolicyPayment policyPayment,
			 String policyName, String policyType, String company, LocalDate endDate,
			String termPeriod, double amount, double maturityAmount, double interest) {
		super();
		this.policyNo = policyNo;
		this.startDate = startDate;
		this.user = user;
		this.policy = policy;
		this.policyPayment = policyPayment;
		this.policyName = policyName;
		this.policyType = policyType;
		this.company = company;
		this.endDate = endDate;
		this.termPeriod = termPeriod;
		this.amount = amount;
		this.maturityAmount = maturityAmount;
		this.interest = interest;
	}
	
	
	public UserPolicyDTO() {
		super();
	}
	@Override
	public String toString() {
		return "UserPolicyDTO [policyNo=" + policyNo + ", startDate=" + startDate + ", user=" + user + ", policy="
				+ policy + ", policyPayment=" + policyPayment + ", policyName=" + policyName + ", policyType="
				+ policyType + ", company=" + company + ", endDate=" + endDate + ", termPeriod=" + termPeriod
				+ ", amount=" + amount + ", maturityAmount=" + maturityAmount + ", interest="
				+ interest + "]";
	}
	
	
	
	

	
	




	

}