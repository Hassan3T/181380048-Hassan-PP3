package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private Button btn;

    private Label le;
    private VBox v1;
    private VBox v2;
    private  FlowPane flowPane;
    private HBox h1;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Button btn1= new Button("Username Button");
        Button btn2= new Button("Password Button");
        Label le1 = new Label("Username");
        Label le2 = new Label("Password");
        v1 = new VBox();
        v1.getChildren().addAll(le1,le2);
        v1.setAlignment(Pos.CENTER);
        v1.setSpacing(20);
        v2 = new VBox();
        v2.getChildren().addAll(btn1,btn2);
        v2.setAlignment(Pos.CENTER);
        v2.setSpacing(20);


        h1 = new HBox();
        h1.getChildren().addAll(v1,v2);

        h1.setAlignment(Pos.CENTER);
        h1.setSpacing(20);
        Scene scene = new Scene(h1,400,400);



        primaryStage.setTitle("181380048");

        primaryStage.setScene(scene);


        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
