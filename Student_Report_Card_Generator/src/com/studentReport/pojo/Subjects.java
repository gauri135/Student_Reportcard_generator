package com.studentReport.pojo;

public class Subjects {

	private int marathi;
	private int English;
	private int Biology;
	private int chemistry;
	private int physics;
	private int maths;

	public Subjects() {

	}

	public Subjects(int marathi, int english, int biology, int chemistry, int physics, int maths) {
		super();
		this.marathi = marathi;
		English = english;
		Biology = biology;
		this.chemistry = chemistry;
		this.physics = physics;
		this.maths = maths;
	}

	public int getMarathi() {
		return marathi;
	}

	public void setMarathi(int marathi) {
		this.marathi = marathi;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getBiology() {
		return Biology;
	}

	public void setBiology(int biology) {
		Biology = biology;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

}
