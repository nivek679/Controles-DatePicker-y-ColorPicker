package test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project.componentes.boton;
import project.componentes.colorPicker;
import project.componentes.datePicket;
import project.componentes.fchaEscojida;
import project.componentes.labelColor;
import project.componentes.labelfecha;
import project.componentes.lblCambioColor;
import project.componentes.lblResultadoDos;
import project.componentes.lblresultadoUno;

import java.io.IOException;


public class App extends Application {

    @Override
    public void start(Stage scenario) throws IOException{
        //Creación de componentes o cracion de objetos
        //Nodo raiz
        HBox layoutHBOX = new HBox();
        //Parte izquierda
        VBox vbIzq = new VBox();
        vbIzq.styleProperty().set("-fx-border-color: gray");
        vbIzq.setAlignment(Pos.CENTER);
        //pARTE DERECHA
        VBox vbDer = new VBox();
        vbDer.styleProperty().set("-fx-border-color: gray");
        vbDer.setAlignment(Pos.CENTER);
        Scene root = new Scene(layoutHBOX);
        
        datePicket fechaEscoger = new datePicket();
        colorPicker seleccionColor = new colorPicker();
        labelColor lblPrincipal = new labelColor();
        labelfecha lblSecundario = new labelfecha();
        lblCambioColor lblColorC = new lblCambioColor();
        lblresultadoUno lblrtoU = new lblresultadoUno();
        lblResultadoDos lblrtoD = new lblResultadoDos();
        fchaEscojida lblFE = new fchaEscojida();

        boton botonPrincipal = new boton(lblColorC.getlblColor(), lblFE.getF_escojida());

        // configuracion Componentes (agregar, modificar, etc)
        layoutHBOX.setPrefSize(375, 360);
        vbIzq.setMargin(botonPrincipal.geButton(), new Insets(10));
        vbIzq.setMargin(fechaEscoger.gDatePicker(), new Insets(10));
        vbIzq.setMargin(seleccionColor.getColorPicker(), new Insets(10));
        vbIzq.setMargin(lblPrincipal.getindicarLugarColorLabel(), new Insets(10));
        vbIzq.setMargin(lblSecundario.getindicarLugarFechLabel(), new Insets(10));
        
        vbIzq.getChildren().addAll(lblSecundario.getindicarLugarFechLabel(), fechaEscoger.gDatePicker(), lblPrincipal.getindicarLugarColorLabel(), seleccionColor.getColorPicker(),botonPrincipal.geButton());
        
        layoutHBOX.getChildren().addAll(vbIzq, vbDer);
        
        vbDer.setMargin(lblFE.getF_escojida(), new Insets(10));;
        vbDer.setMargin(lblrtoU.getLblrstoUno(), new Insets(10));
        vbDer.setMargin(lblrtoD.getLblrdoDos(), new Insets(10) );
        vbDer.setMargin(lblColorC.getlblColor(), new Insets(10) );
        vbDer.getChildren().addAll(lblrtoU.getLblrstoUno(), lblFE.getF_escojida(), lblrtoD.getLblrdoDos(), lblColorC.getlblColor());

        //Mostrar scenario
        scenario.setTitle("GUI");
        scenario.setScene(root);
        scenario.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}