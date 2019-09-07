import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StudentGui extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane bp = new BorderPane();
		
		bp.setTop(TopOfTestCenter());
		Scene scene = new Scene(bp,900,600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TestCenter");
		primaryStage.show();

	}

	private Node TopOfTestCenter() {
		HBox hbox =new HBox();
		
		return null;
	}

}
