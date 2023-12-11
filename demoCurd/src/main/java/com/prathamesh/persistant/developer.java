package com.prathamesh.persistant;

import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Developer")
public class developer {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="D_ID")
	private int id;
	
	public developer(String name) {
		super();
		this.name = name;
	}

	@Column(name="Dev_name")
	private String name;

}
