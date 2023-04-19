package com.generation.lojagames.model;
import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id; 
	
    @NotBlank(message = "O atributo Nome é OBRIGATÓRIO!")
    @Size(min = 5, max = 100, message = "O atributo título deve ter no mínimo 5 e no máximo 100 cacteres.")
	private String nome;
	
    
    @NotBlank(message = "O atributo Descrição é OBRIGATÓRIO!")
    @Size(min = 10, max = 1000, message = "O atributo texto deve ter no mínimo 5 e no máximo 100 cacteres.")
	private String descricao; 
    
    @NotBlank(message = "O atributo Console é OBRIGATÓRIO!")
    @Size(min = 10, max = 100, message = "O atributo texto deve ter no mínimo 5 e no máximo 100 cacteres.")
	private String console;
    
    @PositiveOrZero
    private int quatidade;
	
   /* @UpdateTimestamp
	private LocalDateTime data_lancamento;*/
    
    @ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}

	/*public LocalDateTime getData_lancamento() {
		return data_lancamento;
	}

	public void setData_lancamento(LocalDateTime data_lancamento) {
		this.data_lancamento = data_lancamento;
	}*/

	
	// GET SET Categoria //
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
    
    
    
}
    
    
    
	