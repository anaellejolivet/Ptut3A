package com.ptut.syllabus.entity;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERole nom;

	// facultatif
	private Integer responsableAnneeId;

	// facultatif
	private Integer responsableUeId;

}