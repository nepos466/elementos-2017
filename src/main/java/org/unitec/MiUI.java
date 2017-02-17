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
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author campitos
 */

@SpringUI
@Theme("valo")
public class MiUI extends UI{

    @Autowired RepositorioCliente repoCliente;
    @Autowired RepositorioDireccion repoDireccion;
    @Autowired ServicioConversion repoConversion;
   
    
    @Override
    protected void init(VaadinRequest request) {
//Usaremos un VerticalLayout  que distribuye las componentes
//de arriba hacia abajo
   VerticalLayout layout=new VerticalLayout();
   
  layout.setSpacing(true);
  layout.setMargin(true);
  
  Label label1=new Label("Cliente. Buscar por id");
  label1.setStyleName(ValoTheme.LABEL_H1); 
  
  //Agregamos la etiqueta al layout
  layout.addComponent(label1);
  
  
  //Agregamos el boton
  Button boton1=new Button("Apachurrame!!");
  boton1.setStyleName(ValoTheme.BUTTON_PRIMARY);
  layout.addComponent(boton1);

  TextField t1=new TextField();
  Label l2=new Label("Estatus");
  
  layout.addComponent(t1);
  layout.addComponent(l2);
  
  boton1.addClickListener(cliqueo->{
      
     // Cliente c1=new Cliente("juan", "juan@gmail.com");

     //repoCliente.save(c1);
    // repoDireccion.save(new Direccion(c1, "calle 1","ecatepunk", 333l));
  

long miId=Integer.parseInt( t1.getValue());
      l2.setValue(" Minucipio "+ repoDireccion.findOne(miId).getMunicipio()+" Email:"+repoDireccion.findOne(miId).getCliente().getEmail());
  });
  //Indicamos al metodo init que ajuste su contenido al del layout
   setContent(layout);
  
          
        
    }
    
}
