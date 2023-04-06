package javfx;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private ComboBox<String> pick = new ComboBox<>();
    private int currentIndex = 0;
    private  String cValue;
   @Override
    public void start(Stage primaryStage)
     {
        primaryStage.setTitle("Converter App");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        //grid.setPadding(new Insets(25,25,25,25));
         Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 1, 1);

        Label userName = new Label("Value:");
        grid.add(userName, 0, 1);

        
        Text convertedValue = new Text(cValue);
        grid.add(convertedValue, 1, 1);

        Label pw = new Label("Converted Value:");
        grid.add(pw, 0, 2);

        TextField tBox = new TextField();
        grid.add(tBox, 1, 1);
        Button btn = new Button("Convert");
       // btn.setAlignment(Pos.BOTTOM_RIGHT);
        HBox hbBtn = new HBox(10);
        
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
       // grid.add(btn, 1, 1);
        grid.add(hbBtn, 1, 1);
       // ComboBox<String> pick = new ComboBox<>();
        ObservableList<String> items = FXCollections.observableArrayList
        ("kg->lb","lb->kg", "km->m", "m->km", "ft->m","m->ft", "mi->km","km->mi", "mph->kph", "kph->mph");
        pick.getItems().addAll(items);
        pick.setValue(items.get(0));
        pick.setOnAction(e -> {
        currentIndex = items.indexOf(pick.getValue());
    });
        grid.add(pick,1, 0);
       
            
        btnHandlerClass handler1 = new btnHandlerClass();
        grid.getChildren().addAll(btn);
    btn.setOnAction((EventHandler<ActionEvent>) handler1);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
      }
      class btnHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
           Converter conv =new Converter();
           cValue=conv.Conv(pick.getItems().toString());
           
        }

        
    
}
}
