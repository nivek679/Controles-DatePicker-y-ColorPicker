package project.componentes;

import javafx.scene.control.ColorPicker;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class colorPicker {
    private static ColorPicker seleccionColor;


    public colorPicker() {
        seleccionColor = new ColorPicker();
        seleccionColor.setOnAction(e->{
            String colorEscogido = "color escogido: " + obtenerColor().toString();
            System.out.println(colorEscogido);
        });
    }

    public static Color obtenerColor(){
        Color colorEscogido = seleccionColor.getValue();
        return colorEscogido;
    }

    public ColorPicker getColorPicker(){
        return seleccionColor;
    }
}
