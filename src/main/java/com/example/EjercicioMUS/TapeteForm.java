package com.example.EjercicioMUS;

import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;

public class TapeteForm extends FormLayout{
	
	TextField carta1 = new TextField("Carta1: ");
	TextField carta2 = new TextField("Carta2: ");
	TextField carta3 = new TextField("Carta3: ");
	TextField carta4 = new TextField("Carta4: ");
	
	public TapeteForm() {
		
		addComponents(carta1,carta2,carta3,carta4);
		
	}
}
