/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 *
 * @author campitos
 */

@SpringUI
@Theme("valo")
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
//Usaremos un VerticalLayout  que distribuye las componentes
//de arriba hacia abajo
   VerticalLayout layout=new VerticalLayout();
   
  layout.setSpacing(true);
  layout.setMargin(true);
  
  Label label1=new Label("MI primera etiqueta");
  label1.setStyleName(ValoTheme.LABEL_H1); 
  
  //Agregamos la etiqueta al layout
  layout.addComponent(label1);
  
  
  //Agregamos el boton
  Button boton1=new Button("Apachurrame!!");
  boton1.setStyleName(ValoTheme.BUTTON_PRIMARY);
  layout.addComponent(boton1);
  
  //Maneraremos el evento de tipo boton usando LAMBDAS
  //Una lambda es la representacion funcional de una funcion
  

  
  boton1.addClickListener(gato->{
      Notification.show("Me has hecho click"); 
      label1.setValue("Tambien cambia la etiqueta");
  });
  // Generamos el ComboBox
ComboBox select = new ComboBox("Conversión");

// Agregamos las conversiones
select.addItem("De Farenheit a Centigrados");
select.addItem("De Centigrados a Farenheit");
layout.addComponent(select);

//Campo de texto para los grados
 TextField texto1=new TextField();
 texto1.setInputPrompt("Introduce el valor");
 layout.addComponent(texto1);
 
 //Boton de conversion
 Button botonConversion=new Button("Convertir");
 layout.addComponent(botonConversion);
 botonConversion.addClickListener(cliqueo->{
     float grados=Float.parseFloat(texto1.getValue());
     //Pido el valor al combobox
     float resultado=-999;
    String opcion=  select.getValue().toString();
 
     
     Notification.show("El resultado es:"+resultado);
 });

  
  //Indicamos al metodo init que ajuste su contenido al del layout
   setContent(layout);
  
          
        
    }
    
}
