package org.opendaylight.yang.orm.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class ModuleInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ModuleInfoKey moduleInfoKey;
	@Lob
	private String namespace;

	@ManyToOne
	private Set<ModuleInfo> inportedModules;

	public ModuleInfo() {
		super();
	}
	
	public ModuleInfo(String name, LocalDate revision) {
		super();
		this.moduleInfoKey = new ModuleInfoKey(name, revision);
	}

	public ModuleInfo(String name, LocalDate revision, String namespace) {
		super();
		this.moduleInfoKey = new ModuleInfoKey(name, revision);
		this.namespace = namespace;
	}

	public ModuleInfo(String name, LocalDate revision, String namespace, Set<ModuleInfo> inportedModules) {
		super();
		this.moduleInfoKey = new ModuleInfoKey(name, revision);
		this.namespace = namespace;
		this.inportedModules = inportedModules;
	}

	public ModuleInfo(ModuleInfoKey moduleInfoKey, String namespace, Set<ModuleInfo> inportedModules) {
		super();
		this.moduleInfoKey = moduleInfoKey;
		this.namespace = namespace;
		this.inportedModules = inportedModules;
	}

	public ModuleInfoKey getModuleInfoKey() {
		return moduleInfoKey;
	}

	public void setModuleInfoKey(ModuleInfoKey moduleInfoKey) {
		this.moduleInfoKey = moduleInfoKey;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public Set<ModuleInfo> getInportedModules() {
		return inportedModules;
	}

	public void setInportedModules(Set<ModuleInfo> inportedModules) {
		this.inportedModules = inportedModules;
	}

	public String getName() {
		return moduleInfoKey.getName();
	}

	public LocalDate getRevision() {
		return moduleInfoKey.getRevision();
	}

}
