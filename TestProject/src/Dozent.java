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

public class Dozent extends BorderPane {

	public Dozent() {
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
		
        TableColumn firstNameCol = new TableColumn("Kurs Id");
        TableColumn lastNameCol = new TableColumn("TID");
        TableColumn StudDozCol = new TableColumn("Themen");
        
        table.getColumns().addAll(firstNameCol, lastNameCol, StudDozCol);
        table.setPrefSize(430, 400);
        TableView table1 = new TableView();
		
        TableColumn firstNameCol1 = new TableColumn("TID");
        TableColumn lastNameCol1 = new TableColumn("Frage");
        TableColumn StudDozCol1 = new TableColumn("Antwort");
        TableColumn difficultyCol1 = new TableColumn("Antwort");
        table1.setPrefSize(430,400);
        
        table1.getColumns().addAll(firstNameCol1, lastNameCol1, StudDozCol1,difficultyCol1);
        
        hbox.getChildren().addAll(table,table1);
		return hbox;
	}



	private Node BuildModul() {
		HBox hbox = new HBox();
		Label lbl = new Label("Themen");
		Label lbl1 = new Label("Fragen");
		lbl.setFont(Font.font ("Verdana", 20));
		lbl1.setFont(Font.font ("Verdana", 20));
		hbox.setSpacing(345);
		hbox.getChildren().addAll(lbl,lbl1);
		return hbox;
	}



	private Node BuildDelete() {
		HBox hbox = new HBox();
		hbox.setSpacing(153);
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
		
		Label lbl2 = new Label("Dozent");
		lbl2.setFont(Font.font ("Verdana", 25));
		lbl2.setUnderline(true);
		
		vbox.setSpacing(40);
		vbox.getChildren().addAll(lbl1,lbl2);
		return vbox;
	}

	

}
