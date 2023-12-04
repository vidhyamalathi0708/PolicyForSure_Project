package com.hexaware.policymanagement.dto;
/* Author:Vidhyamalathi
 * @CreatedOn:-12-11-2023
 * Description: AddressDTO Class
 */
public class PolicyDTO 
{
	private long policyId;
	private String policyName;
	private String policyDescription;
	private String policyType;
	private String company;
	private String termPeriod;
	private double amount;
	private double maturityAmount;
	private double interest;
	
	
	

	public String getTermPeriod() {
		return termPeriod;
	}

	public void setTermPeriod(String termPeriod) {
		this.termPeriod = termPeriod;
	}

	public long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(long policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyDescription() {
		return policyDescription;
	}

	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public double getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public PolicyDTO(long policyId, String policyName, String policyDescription, String policyType, String company,
			double amount, double maturityAmount,double interest,String termPeriod) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.policyDescription = policyDescription;
		this.policyType = policyType;
		this.company = company;
		this.amount = amount;
		this.maturityAmount = maturityAmount;
		this.interest = interest;
		this.termPeriod= termPeriod;
	}

	public PolicyDTO() {
		super();
	}

	@Override
	public String toString() {
		return "PolicyDTO [policyId=" + policyId + ", policyName=" + policyName + ", policyDescription="
				+ policyDescription + ", policyType=" + policyType + ", company=" + company + ", termPeriod="
				+ termPeriod + ", amount=" + amount + ", maturityAmount=" + maturityAmount
				+ ", interest=" + interest + "]";
	}

	
	
	
	
	
	
	
	
	
	

}