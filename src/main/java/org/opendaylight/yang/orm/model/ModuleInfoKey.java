package org.opendaylight.yang.orm.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class ModuleInfoKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private LocalDate revision;

	public ModuleInfoKey(String name, LocalDate revision) {
		super();
		this.name = name;
		this.revision = revision;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getRevision() {
		return revision;
	}

	public void setRevision(LocalDate revision) {
		this.revision = revision;
	}

}
