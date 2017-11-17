package org.woehlke.javaee7.petclinic.entities;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "aparelhos")
public class Aparelho  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(name = "nome")
    private String nome;

    @NotEmpty
    @Column(name = "rg")
    private String rg;
    
    @NotEmpty
    @Column(name = "endereco")
    private String endereco;
    
    @NotEmpty
    @Column(name = "serie")
    private String serie;
    
    @NotEmpty
    @Column(name = "marca")
    private String marca;
    
    @NotEmpty
    @Column(name = "defeito")
    private String defeito;

    @NotEmpty
    @Column(name = "telefone1")
    private String telefone1;

    @NotEmpty
    @Column(name = "telefone2")
    private String telefone2;
    
    @NotNull
    @Column(name = "recebido")
    @Temporal( TemporalType.DATE )
    private Date recebido;

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public void setRecebido(Date recebido) {
		this.recebido = recebido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((defeito == null) ? 0 : defeito.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((recebido == null) ? 0 : recebido.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((serie == null) ? 0 : serie.hashCode());
		result = prime * result + ((telefone1 == null) ? 0 : telefone1.hashCode());
		result = prime * result + ((telefone2 == null) ? 0 : telefone2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aparelho other = (Aparelho) obj;
		if (defeito == null) {
			if (other.defeito != null)
				return false;
		} else if (!defeito.equals(other.defeito))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (recebido == null) {
			if (other.recebido != null)
				return false;
		} else if (!recebido.equals(other.recebido))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		if (telefone1 == null) {
			if (other.telefone1 != null)
				return false;
		} else if (!telefone1.equals(other.telefone1))
			return false;
		if (telefone2 == null) {
			if (other.telefone2 != null)
				return false;
		} else if (!telefone2.equals(other.telefone2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Aparelho [id=%s, nome=%s, rg=%s, endereco=%s, serie=%s, marca=%s, defeito=%s, telefone1=%s, telefone2=%s, recebido=%s]",
				id, nome, rg, endereco, serie, marca, defeito, telefone1, telefone2, recebido);
	}    
    
    
    
    
}
