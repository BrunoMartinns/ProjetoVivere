package br.com.projetoVivere.bibliotecasb.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="livrosCaixa")
public class LivrosCaixa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="dataLancamento")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date datalancamento;
	
	@Column(name="descricao", nullable = false, length = 50)
	private String descricao;
	
	@Column(name="tipo", columnDefinition = "enum('D','C')", nullable = false, length = 1)
	private String type;
	
	@Column(name="valor", nullable = false, columnDefinition = "decimal(12,2)")
	private float valor;
	
	@ManyToOne
	@JsonIgnore
	private Clientes clientes;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the datalancamento
	 */
	public Date getDatalancamento() {
		return datalancamento;
	}

	/**
	 * @param datalancamento the datalancamento to set
	 */
	public void setDatalancamento(Date datalancamento) {
		this.datalancamento = datalancamento;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	
	
	public LivrosCaixa () {
		
	}

	public LivrosCaixa(int id, Date datalancamento, String descricao, String type, float valor, Clientes clientes) {
		this.id = id;
		this.datalancamento = datalancamento;
		this.descricao = descricao;
		this.type = type;
		this.valor = valor;
		this.clientes = clientes;
	}


	public LivrosCaixa(Date datalancamento, String descricao, String type, float valor, Clientes clientes) {
		super();
		this.datalancamento = datalancamento;
		this.descricao = descricao;
		this.type = type;
		this.valor = valor;
		this.clientes = clientes;
	}
	
	
	
	
	
	
}
