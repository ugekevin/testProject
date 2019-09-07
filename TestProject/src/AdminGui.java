

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AdminGui extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

	BorderPane bp = new BorderPane();
		
	//bp.setRight(RightOfTestCenter());
		bp.setTop(TopOfTestCenter());
		Scene scene = new Scene(bp,900,600);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TestCenter");
		primaryStage.show();

	}
/*
	private Node RightOfTestCenter() {
		HBox hbox =new HBox();
		Button btn = new Button();
		 btn.setText("'Hello World'");
		 hbox.setAlignment(Pos.TOP_RIGHT);
		//t.setFont( Font.font( "Calibri", FontWeight.EXTRA_BOLD, 40 ) );
		
		hbox.getChildren().addAll(btn);
		return hbox;
	
	}
*/
	private Node TopOfTestCenter() {
		
		HBox hbox =new HBox();
		Text t1= new Text("                                                            ");
		Text t2 = new Text("Testcenter                              ");
		Button btn = new Button();
		 btn.setText("'Log Out'");
		hbox.setAlignment(Pos.CENTER);
		t2.setFill(Color.DARKGREEN);
		t2.setFont( Font.font( "Calibri", FontWeight.BLACK, 40 ) );
		
		hbox.getChildren().addAll(t1,t2, btn);
		return hbox;
	}

}
