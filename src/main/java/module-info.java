module co.edu.uniquindio.co.poo.practica {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.co.poo.practica to javafx.fxml;
    exports co.edu.uniquindio.co.poo.practica;
    exports co.edu.uniquindio.co.poo.practica.viewController;
    opens co.edu.uniquindio.co.poo.practica.viewController to javafx.fxml;

}