package project.componentes;

import java.time.LocalDate;

import javafx.scene.control.DatePicker;

public class datePicket {
    private static DatePicker fechaPorMostrar;

    public datePicket() {
        fechaPorMostrar = new DatePicker();
        fechaPorMostrar.setOnAction(e->{
            System.out.println("Fecha escogida: "+fechaPorMostrar.getValue());
        });
    }

    public static LocalDate obtenerFecha(){
        LocalDate fechaRegistrada = fechaPorMostrar.getValue();
        return fechaRegistrada;
    }

    public DatePicker gDatePicker(){
        return fechaPorMostrar;
    }
}
