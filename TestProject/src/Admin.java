import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Admin extends BorderPane {

	public Admin() {
		setTop(BuildTop());
		setCenter(BuildCenter());
		setLeft(BuildLeft());
	}



	private Node BuildLeft() {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(30,30,0,30));

		return vbox;
	}

	private Node BuildCenter() {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(80,80,0,80));
		vbox.setSpacing(8);

		vbox.getChildren().addAll(BuildModul(),BuildDelete(),BuildTable());
		return vbox;
	}


	private Node BuildTable() {
		HBox hbox = new HBox();
		
		TableView table = new TableView();
		
        TableColumn firstNameCol = new TableColumn("Vorname");
        TableColumn lastNameCol = new TableColumn("Nachname");
        TableColumn StudDozCol = new TableColumn("Stud/Doz");
        
        table.getColumns().addAll(firstNameCol, lastNameCol, StudDozCol);
        table.setPrefSize(430, 400);
        TableView table1 = new TableView();
		
        TableColumn firstNameCol1 = new TableColumn("Vorname");
        TableColumn lastNameCol1 = new TableColumn("Nachname");
        TableColumn StudDozCol1 = new TableColumn("Stud/Doz");
        table1.setPrefSize(430,400);
        
        table1.getColumns().addAll(firstNameCol1, lastNameCol1, StudDozCol1);
        
        hbox.getChildren().addAll(table,table1);
		return hbox;
	}



	private Node BuildModul() {
		HBox hbox = new HBox();
		Label lbl = new Label("Benutzer");
		Label lbl1 = new Label("Modul");
		lbl.setFont(Font.font ("Verdana", 20));
		lbl1.setFont(Font.font ("Verdana", 20));
		hbox.setSpacing(340);
		hbox.getChildren().addAll(lbl,lbl1);
		return hbox;
	}



	private Node BuildDelete() {
		HBox hbox = new HBox();
		hbox.setSpacing(155);
		Label lbl1 = new Label("Löschen");
		Label lbl2 = new Label("Hinzufügen");
		Label lbl3 = new Label("Löschen");
		Label lbl4 = new Label("Hinzufügen");
		hbox.getChildren().addAll(lbl1,lbl2,lbl3,lbl4);
		return hbox;
	}

	private Node BuildTop() {
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.CENTER);
		Label lbl1 = new Label("Testcenter");
		lbl1.setFont(Font.font ("Verdana", 30));
		
		Label lbl2 = new Label("Admin");
		lbl2.setFont(Font.font ("Verdana", 25));
		lbl2.setUnderline(true);
		
		vbox.setSpacing(40);
		vbox.getChildren().addAll(lbl1,lbl2);
		return vbox;
	}

	

}
