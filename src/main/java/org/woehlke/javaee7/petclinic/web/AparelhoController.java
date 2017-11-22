package org.woehlke.javaee7.petclinic.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBTransactionRolledbackException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.woehlke.javaee7.petclinic.dao.AparelhoDao;
import org.woehlke.javaee7.petclinic.entities.Aparelho;
import org.woehlke.javaee7.petclinic.entities.PetType;

/**
 * 
 * @author marco.mangan@pucrs.br
 *
 */
@ManagedBean
@SessionScoped
public class AparelhoController implements Serializable {

	@EJB
	private AparelhoDao aparelhoDao;

	private Aparelho aparelho;

	public Aparelho getAparelho() {
		return aparelho;
	}

	public void setAparelho(Aparelho aparelho) {
		this.aparelho = aparelho;
	}

	public String getNewAparelhoForm() {
		aparelho = new Aparelho();
		return "newAparelho.jsf"; // newAparelho.jsf
	}

	public String saveNewAparelho() {
		aparelhoDao.addNew(this.aparelho);
		return "/"; // petTypes.jsf
	}

}
