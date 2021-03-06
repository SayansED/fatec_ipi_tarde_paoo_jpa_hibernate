package br.com.eduardo.model.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_consumo")
public class Consumo {
	
	@Id
	@GeneratedValue
	private Long id;
	private Date dataHora;
	
	@ManyToOne
	private Feedback feedback;
	
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	
	public Feedback getFeedback() {
		return feedback;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	
}
