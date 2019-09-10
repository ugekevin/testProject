

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

public class StudentGui extends BorderPane {

	public StudentGui() {
		setTop(TopOfTestCenter());
	}

	private Node TopOfTestCenter() {
		HBox hbox =new HBox();
		Text t1= new Text("                                                            ");
		Text t2 = new Text("Testcenter                              ");
		Button btn = new Button();
		 btn.setText("'Log Out'");
		hbox.setAlignment(Pos.CENTER);
		t2.setFill(Color.DARKGREEN);
		t2.setFont( Font.font( "Calibri", FontWeight.BLACK, 40 ) );
		System.out.println("HI");
		hbox.getChildren().addAll(t1,t2, btn);
		return hbox;
	}

}
