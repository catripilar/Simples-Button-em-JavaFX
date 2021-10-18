import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
        System.out.println("ok");
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Bem vindo");
        Button botao = new Button("Clique");
        botao.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){System.out.println("Botão clicado!");}
        });
        StackPane root = new StackPane();
        root.getChildren().addAll(botao);
        primaryStage.setScene(new Scene(root,300,250));
        primaryStage.show();  
    }
}
