package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * Created by Buddhika Prasanna on 02-Oct-17.
 */
public class AlertBox {
    public static void disply(String title, String message) {
        Stage stage = new Stage();

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        //stage.setMaxWidth(250);
        stage.setResizable(false);

        Label label = new Label();
        label.setText(message);
        Button btnClose = new Button("Close");
        btnClose.setOnAction(event -> stage.close());
        VBox vBox = new VBox();
        vBox.getChildren().addAll(label,btnClose);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.showAndWait();
    }
}
