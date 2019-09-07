import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProfGui extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

	Pane p = new Pane();
		
		//bp.setTop(TopOfTestCenter());
		//bp.setCenter(CenterOfTextCenter());
		primaryStage.setScene(new Scene(p, 900, 600));
		primaryStage.setTitle("TestCenter");
		primaryStage.show();
		
		 Button btn = new Button();
		 btn.setText("'Hello World'");

		 
		    btn.setLayoutX(810);
		    btn.setLayoutY(0);
		    p.getChildren().add(btn);
		  
	}

	
}
