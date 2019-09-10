import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DragandDrope extends BorderPane {

public DragandDrope() {

	setCenter(BuildCenter());
	setBottom(BuildBottom());
	setLeft(BuildLeft());
	setTop(BuildTop());
	
}



private Node BuildTop() {
	VBox vbox = new VBox();
	vbox.setAlignment(Pos.CENTER);
	
	Label lbl1 = new Label("Testcenter");
	lbl1.setFont(Font.font ("Verdana", 30));
	
	Label lbl2 = new Label("Quiz");
	lbl2.setFont(Font.font ("Verdana", 25));
	lbl2.setUnderline(true);
	
	vbox.getChildren().addAll(lbl1,lbl2);
	return vbox;
}



private Node BuildLeft() {
	VBox vboxSpace = new VBox();
	vboxSpace.setPadding(new Insets(0,0,0,50));
	return vboxSpace;
}



private Node BuildBottom() {
	HBox hbox = new HBox();
	hbox.setAlignment(Pos.CENTER);
	hbox.setPadding(new Insets(50,50,50,50));
	Button btn = new Button("Weiter");
	btn.setPadding(new Insets(10,10,10,10));
	btn.setStyle(
			"-fx-background-color: Blue;"+
			"-fx-padding:15px;"+
		     "-fx-border-width: 8;"
			);
	btn.setTextFill(Color.WHITE);
	
	hbox.getChildren().addAll(btn);
	return hbox;
}



private Node BuildCenter() {
	Pane p = new Pane();

	Label lbl = new Label("  Frage X ");
	lbl.setFont(Font.font ("Verdana", 25));
	lbl.setLayoutX(195);
	lbl.setLayoutY(83);
	Rectangle rectangle = new Rectangle();
	rectangle.setStyle("-fx-border-widht: 3;");
	rectangle.setStroke(Color.GREEN);
	rectangle.setFill(null);
	rectangle.setVisible(true);
	rectangle.setWidth(120);
    rectangle.setHeight(40);
    rectangle.setLayoutX(200);
    rectangle.setLayoutY(80);
	

    Label lblTextArea = new Label(" ******* ");
    lblTextArea.setFont(Font.font ("Verdana", 20));
    lblTextArea.setLayoutX(220);
    lblTextArea.setLayoutY(160);
	Rectangle rectangleTextArea = new Rectangle();
	rectangleTextArea.setWidth(700);
	rectangleTextArea.setHeight(100);
	rectangleTextArea.setStroke(Color.GREEN);
	rectangleTextArea.setFill(null);
	rectangleTextArea.setVisible(true);
	rectangleTextArea.setLayoutX(200);
	rectangleTextArea.setLayoutY(120);
	
	
	Label lblAnswer = new Label("  Antwort X ");
	lblAnswer.setFont(Font.font ("Verdana", 25));
	lblAnswer.setLayoutX(680);
	lblAnswer.setLayoutY(230);
	Rectangle rectangleAnswer = new Rectangle();
	rectangleAnswer.setStyle("-fx-border-widht: 3;");
	rectangleAnswer.setStroke(Color.GREEN);
	rectangleAnswer.setFill(null);
	rectangleAnswer.setVisible(true);
	rectangleAnswer.setWidth(230);
	rectangleAnswer.setHeight(55);
	rectangleAnswer.setLayoutX(670);
	rectangleAnswer.setLayoutY(220);
	
	Label lblAnswerBox = new Label(" Antworten");
	lblAnswerBox.setFont(Font.font ("Verdana", 25));
	lblAnswerBox.setLayoutX(195);
	lblAnswerBox.setLayoutY(310);
	Rectangle rectangleAnswerBox = new Rectangle();
	rectangleAnswerBox.setStyle("-fx-border-widht: 3;");
	rectangleAnswerBox.setStroke(Color.GREEN);
	rectangleAnswerBox.setFill(null);
	rectangleAnswerBox.setVisible(true);
	rectangleAnswerBox.setWidth(140);
	rectangleAnswerBox.setHeight(40);
	rectangleAnswerBox.setLayoutX(200);
	rectangleAnswerBox.setLayoutY(310);
	
	Label lblAnswerOne = new Label(" Antworten 1");
	lblAnswerOne.setFont(Font.font ("Verdana", 25));
	lblAnswerOne.setLayoutX(220);
	lblAnswerOne.setLayoutY(360);
	
	Label lblAnswerTwo = new Label(" Antworten 2");
	lblAnswerTwo.setFont(Font.font ("Verdana", 25));
	lblAnswerTwo.setLayoutX(450);
	lblAnswerTwo.setLayoutY(360);
	
	Label lblAnswerThree = new Label(" Antworten 3");
	lblAnswerThree.setFont(Font.font ("Verdana", 25));
	lblAnswerThree.setLayoutX(670);
	lblAnswerThree.setLayoutY(360);

	Rectangle rectangleAnswerBoxOne = new Rectangle();
	rectangleAnswerBoxOne.setStyle("-fx-border-widht: 3;");
	rectangleAnswerBoxOne.setStroke(Color.GREEN);
	rectangleAnswerBoxOne.setFill(null);
	rectangleAnswerBoxOne.setVisible(true);
	rectangleAnswerBoxOne.setWidth(230);
	rectangleAnswerBoxOne.setHeight(60);
	rectangleAnswerBoxOne.setLayoutX(200);
	rectangleAnswerBoxOne.setLayoutY(350);
	
	Rectangle rectangleAnswerBoxTwo = new Rectangle();
	rectangleAnswerBoxTwo.setStyle("-fx-border-widht: 3;");
	rectangleAnswerBoxTwo.setStroke(Color.GREEN);
	rectangleAnswerBoxTwo.setFill(null);
	rectangleAnswerBoxTwo.setVisible(true);
	rectangleAnswerBoxTwo.setWidth(230);
	rectangleAnswerBoxTwo.setHeight(60);
	rectangleAnswerBoxTwo.setLayoutX(430);
	rectangleAnswerBoxTwo.setLayoutY(350);
	
	Rectangle rectangleAnswerBoxThree = new Rectangle();
	rectangleAnswerBoxThree.setStyle("-fx-border-widht: 3;");
	rectangleAnswerBoxThree.setStroke(Color.GREEN);
	rectangleAnswerBoxThree.setFill(null);
	rectangleAnswerBoxThree.setVisible(true);
	rectangleAnswerBoxThree.setWidth(235);
	rectangleAnswerBoxThree.setHeight(60);
	rectangleAnswerBoxThree.setLayoutX(660);
	rectangleAnswerBoxThree.setLayoutY(350);
	
	
	p.getChildren().addAll(lbl,rectangle,rectangleTextArea,lblTextArea,rectangleAnswer,lblAnswer,rectangleAnswerBox,lblAnswerBox,
			rectangleAnswerBoxOne,rectangleAnswerBoxTwo,rectangleAnswerBoxThree,lblAnswerOne,lblAnswerTwo,lblAnswerThree);
	
	return p;
	
}


	
	}



		
		
	


