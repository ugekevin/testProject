import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminGui extends Application {

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
		Text t = new Text("Testcenter");
		hbox.setAlignment(Pos.CENTER);
		t.setFont( Font.font( "Calibri", FontWeight.NORMAL, 30 ) );
		
		hbox.getChildren().addAll(t);
		return hbox;
	}

}
