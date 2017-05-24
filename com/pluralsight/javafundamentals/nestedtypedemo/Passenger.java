package com.pluralsight.javafundamentals.nestedtypedemo;

public class Passenger {
	
	public Passenger(){}
	public Passenger(String name){
		this.name = name;
	}
	
	private RewardsProgram rewardsProgram = new RewardsProgram();
	private String name;
	public static class RewardsProgram{
		private int memberLevel;
		private int memberDays;
		public int getMemberLevel() {
			return memberLevel;
		}
		public void setMemberLevel(int memberLevel) {
			this.memberLevel = memberLevel;
		}
		public int getMemberDays() {
			return memberDays;
		}
		public void setMemberDays(int memberDays) {
			this.memberDays = memberDays;
		}
	}
	public RewardsProgram getRewardsProgram() {
		return rewardsProgram;
	}
	public void setRewardsProgram(RewardsProgram rewardsProgram) {
		this.rewardsProgram = rewardsProgram;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
