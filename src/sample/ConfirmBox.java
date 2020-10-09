package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Buddhika Prasanna on 02-Oct-17.
 */
public class ConfirmBox {

    public static boolean answer;

    public static boolean disply(String title, String message) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        //stage.setMaxWidth(250);
        stage.setResizable(false);
        Label label = new Label();
        label.setText(message);

        Button btnYes = new Button("YES");
        Button btnNo = new Button("NO");

        btnYes.setOnAction(event -> {
            answer = true;
            stage.close();
        });

        btnNo.setOnAction(event -> {
            answer = false;
            stage.close();
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label,btnYes,btnNo);
        vBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.showAndWait();

        return answer;
    }
}
