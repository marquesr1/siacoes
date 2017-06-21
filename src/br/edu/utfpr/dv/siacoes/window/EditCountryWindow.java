package br.edu.utfpr.dv.siacoes.window;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

import br.edu.utfpr.dv.siacoes.bo.CountryBO;
import br.edu.utfpr.dv.siacoes.model.Country;
import br.edu.utfpr.dv.siacoes.view.ListView;

public class EditCountryWindow extends EditWindow {
	
	private final Country country;
	
	private final TextField textName;
	
	public EditCountryWindow(Country country, ListView parentView){
		super("Editar Pa�s", parentView);
		
		if(country == null){
			this.country = new Country();
		}else{
			this.country = country;
		}
		
		this.textName = new TextField("Pa�s");
		this.textName.setWidth("400px");
		this.textName.setMaxLength(100);
		
		this.addField(this.textName);
		
		this.loadCountry();
		this.textName.focus();
	}
	
	private void loadCountry(){
		this.textName.setValue(this.country.getName());
	}

	@Override
	public void save() {
		try{
			CountryBO bo = new CountryBO();
			
			this.country.setName(this.textName.getValue());
			
			bo.save(this.country);
			
			Notification.show("Salvar Pa�s", "Pa�s salvo com sucesso.", Notification.Type.HUMANIZED_MESSAGE);
			
			this.parentViewRefreshGrid();
			this.close();
		}catch(Exception e){
			Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
			
			Notification.show("Salvar Pa�s", e.getMessage(), Notification.Type.ERROR_MESSAGE);
		}
	}

}
