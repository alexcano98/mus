package com.example.EjercicioMUS;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final HorizontalLayout layoutH = new HorizontalLayout();
     //   final VerticalLayout layoutH1= new VerticalLayout();
        
        TapeteForm jug1 = new TapeteForm();
        TapeteForm jug2= new TapeteForm();
        TapeteForm jug3 = new TapeteForm();
        TapeteForm jug4= new TapeteForm();
        
        layoutH.addComponent(jug1);
        layoutH.addComponent(jug2);
        layoutH.addComponent(jug3);
        layoutH.addComponent(jug4);
        setContent(layoutH);
       // setContent(layoutH1);
       
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
