package com.evry.patient_management_system;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="inpatient")
@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="sample"))})
public class InPatient extends Patient {
	private int bed_no;
	private int no_days;

	public int getBed_no() {
		return bed_no;
	}

	public void setBed_no(int bed_no) {
		this.bed_no = bed_no;
	}

	public int getNo_days() {
		return no_days;
	}

	public void setNo_days(int no_days) {
		this.no_days = no_days;
	}

}
