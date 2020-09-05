package edu.tecnasa.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="E_CATEGORY")
public class Category implements Identifiable, Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID_CATEGORY")
	private Long id;
	
	@Column(length=50, nullable=false)
	private String title;
	
	@Column(length=3000, nullable=false)
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
