/**
 * Created by loubna on 23/11/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Box extends Application implements EventHandler<ActionEvent> {

    Button button;
    Button close;
    Label text;
    TextField nameInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("My Window");
        text = new Label("here is the name");
        nameInput = new TextField("type your name");

        StackPane layout = new StackPane();

        button = new Button();
        button.setText("Submit");
        button.setOnAction(this);
        button.setTranslateX(0);
        button.setTranslateY(0);
        layout.getChildren().add(button);
        layout.getChildren().add(nameInput);
        nameInput.setTranslateY(50);
        nameInput.setAlignment(Pos.CENTER);
        layout.getChildren().add(text);
        text.setTranslateY(-50);

        close = new Button();
        close.setText("close");
        close.setOnAction(e -> primaryStage.close());
        close.setTranslateY(-90);
        layout.getChildren().add(close);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @Override
    public void handle(ActionEvent event) {

        if (event.getSource() == button) {
            text.setText(nameInput.getText());
        }
    }
}
