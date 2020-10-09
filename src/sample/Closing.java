package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Buddhika Prasanna on 02-Oct-17.
 */
public class Closing extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Close");
        window.setOnCloseRequest(event -> {
            event.consume();
            close();
        });
        Button btnClose = new Button("Close Me");
        btnClose.setOnAction(event -> {
            event.consume();
            close();
        });

        StackPane pane = new StackPane();
        pane.getChildren().add(btnClose);
        Scene scene = new Scene(pane, 300, 300);
        window.setScene(scene);
        window.show();
    }

    private void close() {
        boolean disply = ConfirmBox.disply("Form Closing", "Are you sure ?");
        if (disply) {
            window.close();
            System.exit(0);
        }
    }


}
