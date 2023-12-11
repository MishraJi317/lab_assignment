package com.myapp.insert;
import javax.persistence.*;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="People_Data")
public class person {
	
	public person(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="PID")
	private int id;
	
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public person(int id, String name, String address, int age) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	@Column(name="name")
	private String name;
	@Column(name="Address")
	private String address;
	@Column(name="AGE")
	private int age;
	

}
