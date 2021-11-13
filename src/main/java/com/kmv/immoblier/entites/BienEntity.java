package com.kmv.immoblier.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BienEntity implements Cloneable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bien", nullable = false)
	private Long idBien;

	@Column(name = "titre", nullable = false, length = 255)
	private String titre;
	
	@Column(name = "description", nullable = false, length = 255)
	private String description;
	
	@Lob
	@Column(name = "image",columnDefinition="MEDIUMBLOB", nullable = false, length = 255)
	private byte[] image;
	
	public Long getId() {
		return idBien;
	}

}
