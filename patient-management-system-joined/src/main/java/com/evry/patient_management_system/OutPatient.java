package com.evry.patient_management_system;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="outpatient500")
@PrimaryKeyJoinColumn(name="id")
//@AttributeOverrides({@AttributeOverride(name="id", column=@Column(name="id"))})
public class OutPatient extends Patient {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
