package com.buildapi.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pkmn")
public class Pkmn {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="total")
	private int total;
	
	@Column(name="hp")
	private int hp;
	
	@Column(name="attack")
	private int attack;
	
	@Column(name="defense")
	private int defense;
	
	@Column(name="sp_attack")
	private int sp_attack;
	
	@Column(name="sp_defense")
	private int sp_defense;
	
	@Column(name="speed")
	private int speed;
	
	public Pkmn() {
		
		super();
	}
	
	public Pkmn(int id, String name, String type, int total, int hp, 
			int attack, int defense, int sp_attack, int sp_defense, int speed) {
		
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.total = total;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.sp_attack = sp_attack;
		this.sp_defense = sp_defense;
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSp_attack() {
		return sp_attack;
	}

	public void setSp_attack(int sp_attack) {
		this.sp_attack = sp_attack;
	}

	public int getSp_defense() {
		return sp_defense;
	}

	public void setSp_defense(int sp_defense) {
		this.sp_defense = sp_defense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
