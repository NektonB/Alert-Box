package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Hello");

        button = new Button("Click Me");
        //button.setOnAction(event -> AlertBox.disply("Alert Box", "Fuck U All"));
        button.setOnAction(event -> {
            boolean confirm = ConfirmBox.disply("Confirm", "Are you sure ?");
            System.out.println(confirm);
        });

        StackPane pane = new StackPane();
        pane.getChildren().addAll(button);
        Scene scene = new Scene(pane, 300, 300);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
