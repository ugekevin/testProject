import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AddPane extends BorderPane {
	
	public AddPane() {
		
		setLeft(BuildLeft());
		setCenter(BuildCenter());
		setTop(BuildTop());
	}

	private Node BuildTop() {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(70,70,0,70));
		return vbox;
	}

	private Node BuildCenter() {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(30,30,0,30));
		
		TableView table = new TableView();
		
        TableColumn firstNameCol = new TableColumn("Vorname");
        firstNameCol.setMinWidth(120);
        TableColumn lastNameCol = new TableColumn("Nachname");
        lastNameCol.setMinWidth(120);
        TableColumn RolleCol = new TableColumn("Rolle");
        RolleCol.setMinWidth(120);
        TableColumn BenutzernameCol = new TableColumn("Benutzername");
        BenutzernameCol.setMinWidth(120);
        TableColumn PasswortCol = new TableColumn("Passwort");
        PasswortCol.setMinWidth(120);
        
        table.getColumns().addAll(firstNameCol,lastNameCol,RolleCol,BenutzernameCol,PasswortCol);
        table.setMinHeight(300);
        table.setMaxWidth(600);
        vbox.getChildren().addAll(table);
		return vbox;
	}

	private Node BuildLeft() {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(30,30,30,30));
		vbox.setSpacing(20);
		Label lbl = new Label("Benutzer hinzufügen");
		lbl.setFont(Font.font ("Verdana", 20));
		TextField txtName = new TextField();
		txtName.setPromptText("Name eingeben");
		TextField txtVorname = new TextField();
		txtVorname.setPromptText("Vorname eingeben");
		TextField txtRolle = new TextField();
		txtRolle.setPromptText("Rolle eingeben");
		TextField txtPasswort = new TextField();
		txtPasswort.setPromptText("Passwort eingeben");
		TextField txtBenutzername = new TextField();
		txtBenutzername.setPromptText("Benutzername eingeben");
		
		
		vbox.getChildren().addAll(lbl,txtName,txtVorname,txtRolle,txtPasswort,txtBenutzername,BuildButtons());
		return vbox;
	}

	private Node BuildButtons() {
		HBox hbox = new HBox();
		hbox.setSpacing(60);
		
		Button btnHinzufuegen = new Button("Hinzufuegen");
		btnHinzufuegen.setStyle("-fx-background-color: Green");
		btnHinzufuegen.setTextFill(Color.WHITE);
		
		Button btnLoeschen = new Button("Loeschen");
		btnLoeschen.setStyle("-fx-background-color: Red");
		btnLoeschen.setTextFill(Color.WHITE);
		
		hbox.getChildren().addAll(btnHinzufuegen,btnLoeschen);
		return hbox;
	}

}
