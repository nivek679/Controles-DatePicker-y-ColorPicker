module principal {
    // requires, este termino se usa para ndicar al programa que mi modulo depende de otros modulos.
    requires javafx.controls;
    requires javafx.fxml;
    //opens indica que este paquete sera modificado o usado por clases fuera de este. Esto es cuando se ejecuta el programa. 
    opens test to javafx.fxml;
    opens project.componentes;

    // exports, esto indica que el paquete del modulo, necesita o sera usado por otro modulo
    exports test;
    
}
