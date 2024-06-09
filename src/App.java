import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.time.LocalDate;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label lblfecha = new Label("Selecciona una fecha:");
        DatePicker datePicker = new DatePicker();
        Label lblcolor = new Label("Selecciona un color:");
        ColorPicker colorPicker = new ColorPicker();
        Button btnconfirmar = new Button("Confirmar");
        Label resultado = new Label();

        btnconfirmar.setOnAction(e -> {
            LocalDate fecha = datePicker.getValue();
            Color color = colorPicker.getValue();
            
            resultado.setText("La fecha seleccionada fue: " + fecha + " y el color seleccionado fue: " + color);
        });

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(lblfecha, datePicker, lblcolor, colorPicker, btnconfirmar, resultado);

        Scene scene = new Scene(vbox, 500, 250);
        primaryStage.setTitle("Date picker y color picker_Antonio Salazar");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}