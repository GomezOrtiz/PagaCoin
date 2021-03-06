package com.pagantis.pagacoin.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

	@Column(name="created_at")
	@JsonIgnore
	protected LocalDate createdAt;
	
	@Column(name="created_by")
	@JsonIgnore
	protected String createdBy;
	
	@Column(name="updated_at")
	@JsonIgnore
	protected LocalDate updatedAt;
	
	@Column(name="updated_by")
	@JsonIgnore
	protected String updatedBy;
	
	private static final long serialVersionUID = 2068806722542832265L;
}
