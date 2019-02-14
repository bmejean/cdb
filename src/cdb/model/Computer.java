package cdb.model;

import java.sql.*;

/**
 * Classe computer
 * @author Bertrand Méjean
 */
public class Computer {
	
	private int id;
	private String name;
	private Timestamp in;
	private Timestamp out;
	private int compId;
	
	/*
	 * Constructeur par default de la classe Computer.
	 */
	public Computer(){
		
	}
	
	/**
	 * Constructeur de la classe Computer.
	 * @param pId Id du computer.
	 * @param pName Nom du computer.
	 * @param pIn Date de mise en circulation.
	 * @param pOut Date de retour.
	 * @param pComId Id de l'entreprise liée à ce computer.
	 */
	public Computer(int pId, String pName, Timestamp pIn, Timestamp pOut, int pComId) {
		this.id=pId;
		this.name=pName;
		this.in=pIn;
		this.out=pOut;
		this.compId=pComId;
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

	public Timestamp getIn() {
		return in;
	}

	public void setIn(Timestamp in) {
		this.in = in;
	}

	public Timestamp getOut() {
		return out;
	}

	public void setOut(Timestamp out) {
		this.out = out;
	}

	public int getCompId() {
		return compId;
	}

	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", in=" + in + ", out=" + out + ", compId=" + compId + "]";
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

}