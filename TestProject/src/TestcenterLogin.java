import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class TestcenterLogin extends BorderPane{
	
	StudentGui studentgui;
	Scene testscene;
	private Button submit;


	public TestcenterLogin() {
		
	setLeft(buildLeftPane());
	setRight(buildRightPane());

	

}
	private Node buildLeftPane() {
		VBox vbox = new VBox(10);
		Label welcome = new Label("Welcome");
		
		vbox.getChildren().addAll(welcome);
		return vbox;
	}

	@SuppressWarnings("unlikely-arg-type")
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
		
		
		submit = new Button("Weiter");
		submit.setPrefWidth(400.0);
		
		submit.setOnAction(ev -> {
			
		PreparedStatement st;
		ResultSet rs;
		
		//wir holen uns den Text aus den TextAreas
		
		String user = username.getText();
		String pass = password.getText();
		
		// Select anweisung
		
		String query = "SELECT * FROM mydb.studenten WHERE `username` =? AND `Password` =?";
		
		try {
		
		st = dbConnect.getConnect().prepareStatement(query);
		
		st.setString(1, user);
		st.setString(2, pass);
		
		rs = st.executeQuery();
		
		if(rs.next()) {
				
		 JOptionPane.showMessageDialog(null, "Confirm", "Logged in", 1);
	
		}else {
		//zeigt fehler
			JOptionPane.showMessageDialog(null, "invalid logindata", "Login failed", 2);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		});

	    loginPane.getChildren().addAll(anmelden, username, password, submit);
	    vbox.getChildren().addAll(loginPane);
		return vbox;
	}
}