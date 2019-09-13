import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TestcenterLogin extends Application {


	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox vbox = new VBox(10);
		
		vbox.getChildren().addAll(buildContentPane());
		
		
		primaryStage.setScene(new Scene(vbox, 1000, 600));
		primaryStage.setTitle("Welcome");
		primaryStage.sizeToScene();
		primaryStage.show();
	}
	

	private Node buildContentPane() {
		BorderPane mainpane = new BorderPane();
		mainpane.setLeft(buildLeftPane());
		mainpane.setRight(buildRightPane());
		return mainpane;
	

}
	private Node buildLeftPane() {
		VBox vbox = new VBox(10);
		Label welcome = new Label("Welcome");
		
		vbox.getChildren().addAll(welcome);
		return vbox;
	}

	private Node buildRightPane() {
		
		VBox vbox = new VBox(10);
		vbox.setPadding(new javafx.geometry.Insets(75.0, 0.0, 0.0, 0.0));	
		vbox.setPrefWidth(350.0);
		
		Label anmelden = new Label("Anmelden");
		anmelden.setFont(new Font("Arial", 20));
		
		VBox loginPane = new VBox(10);
		loginPane.setPadding(new javafx.geometry.Insets(10.0, 10.0, 15.0, 10.0));	
		
		TextField username= new TextField();
		username.setPromptText("Username");
		
		TextField password= new TextField();
		password.setPromptText("Password");
		
		
		Button submit = new Button("Weiter");
		submit.setPrefWidth(400.0);
		

	    loginPane.getChildren().addAll(anmelden, username, password, submit);
	    vbox.getChildren().addAll(loginPane);
		return vbox;
	}
}