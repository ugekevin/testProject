import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StudentGui extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane bp = new BorderPane();
		
		
		Scene scene = new Scene(bp,900,600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TestCenter");
		primaryStage.show();

	}

}
