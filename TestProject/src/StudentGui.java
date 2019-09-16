

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StudentGui extends BorderPane {

	private Button startTest;
	private Button logout;
	public StudentGui() {
		
			
			setLeft(buildLeftPane());
			setCenter(buildCenterPane());
			setTop(buildTopPane());
	}
		

		private Node buildTopPane() {
			HBox hbox =new HBox();
			Text t1= new Text("                                                            ");
			Text t2 = new Text("Testcenter                              ");
			logout = new Button();
			 logout.setText("'Log Out'");
			 logout.setOnAction(ev -> startLogoutAction(null));
			 
			hbox.setAlignment(Pos.CENTER);
			t2.setFill(Color.DARKGREEN);
			t2.setFont( Font.font( "Calibri", FontWeight.BLACK, 40 ) );
			hbox.getChildren().addAll(t1,t2, logout);
			return hbox;
		}

		private Node buildCenterPane() {
			HBox hbox = new HBox();
			hbox.setPadding(new Insets(0.0, 0.0, 0.0, 0.0));
			hbox.getChildren().addAll(buildThemenPane(), buildFragenPane(), buildSchwierigkeitPane());
			
			
			return hbox;
		}

		private Node buildSchwierigkeitPane() {
			// TODO Auto-generated method stub
			VBox vbox = new VBox();
			Label lblSchwierigkeit = new Label("Schwierigkeit");
			lblSchwierigkeit.setFont(Font.font ("Calibri", 22));
			vbox.setPadding(new Insets(25,25,25,25));
			CheckBox cbEinfach = new CheckBox("Einfach");  //Später Exception wenn keine checkbox ausgewählt!
			cbEinfach.setStyle("-fx-font-size: 20;" + "-fx-padding: 6 6 6 6");
			CheckBox cbMittel = new CheckBox("Mittel");
			cbMittel.setStyle("-fx-font-size: 20;" + "-fx-padding: 6 6 6 6");
			CheckBox cbSchwer = new CheckBox("Schwer");
			cbSchwer.setStyle("-fx-font-size: 20;" + "-fx-padding: 6 6 66 6");
			
			startTest = new Button("Quiz starten!");
			startTest.setStyle( "-fx-font-size: 20;" + "-fx-background-color: Blue;" + "-fx-padding: 6 6 6 6;");
			startTest.setTextFill(Color.WHITE);
			
			
			vbox.getChildren().addAll(lblSchwierigkeit,cbEinfach, cbMittel, cbSchwer, startTest);
			return vbox;
		}

		private Node buildThemenPane() {
			// TODO Auto-generated method stub
			VBox vbox = new VBox();
			Label lblThemen = new Label("Themen");
			lblThemen.setFont(Font.font ("Calibri", 22));
			vbox.setPadding(new Insets(25,25,25,25));
			//vbox.setAlignment(Pos.CENTER);
			ListView<String> listThemen = new ListView<String>();
			ObservableList<String> itemsThemen =FXCollections.observableArrayList (
			    "Software Engineering: Allgemeines", "Software Engineering: Lastenheft", "Software Engineering: Pflichtenheft",
			    "Programmieren: Java","Programmieren JavaFX", "Wirtschaftsinformatik: Allgemein", "BWL", "Internes RW", "Externes RW");
			listThemen.setItems(itemsThemen);
			//listThemen.setMinSize(500, 500); //breite, höhe
			vbox.getChildren().addAll(lblThemen, listThemen);
			return vbox;
		}

		private Node buildFragenPane() {
			// TODO Auto-generated method stub
			VBox vbox = new VBox();
			Label lblFragen = new Label("Fragen");
			lblFragen.setFont(Font.font ("Calibri", 22));
			vbox.setPadding(new Insets(25,25,25,25));
			//vbox.setAlignment(Pos.CENTER);
			ListView<String> listFragen = new ListView<String>();
			ObservableList<String> itemsFragen =FXCollections.observableArrayList (
			    "Software Engineering: Allgemeines", "Software Engineering: Lastenheft", "Software Engineering: Pflichtenheft",
			    "Programmieren: Java","Programmieren JavaFX", "Wirtschaftsinformatik: Allgemein", "BWL", "Internes RW", "Externes RW");
			listFragen.setItems(itemsFragen);
			vbox.getChildren().addAll(lblFragen, listFragen);
			return vbox;
		}

		private Node buildLeftPane() {
			// TODO Auto-generated method stub
			VBox vbox = new VBox();
			Label lblModul = new Label("Modul");
			lblModul.setFont(Font.font ("Calibri", 22));
			vbox.setPadding(new Insets(25,25,25,25));
			//vbox.setAlignment(Pos.CENTER);
			
			ListView<String> listModul = new ListView<String>();
			ObservableList<String> itemsModul =FXCollections.observableArrayList (
			    "Wirtschaft & Informatik", "Informatik");
			listModul.setItems(itemsModul);

			Label lblKurs = new Label("Kurs");
			lblKurs.setFont(Font.font ("Calibri", 22));
			vbox.setPadding(new Insets(30,30,30,30));
			//vbox.setAlignment(Pos.CENTER);
			
			ListView<String> listKurs = new ListView<String>();
			ObservableList<String> itemsKurs =FXCollections.observableArrayList (
			"Programmieren", "Software Engineering", "Wirtschaftsinformatik I", "BWL & Rechnungswesen");
			listKurs.setItems(itemsKurs);

				
			vbox.getChildren().addAll(lblModul, listModul, lblKurs, listKurs);
			return vbox;

		
		}
		public void startTestAction(EventHandler<ActionEvent> eventHandler) {
			startTest.setOnAction(eventHandler);
		}
		
		public void startLogoutAction(EventHandler<ActionEvent>eventhandler) {
			logout.setOnAction(eventhandler);
		}
	}

