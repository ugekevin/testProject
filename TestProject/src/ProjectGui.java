import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProjectGui extends Application {

	Stage primaryStage;
	StudentGui studentGui;
	QuizPane quizGui;
	private Scene studentGuiScene;
	private Scene quizScene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		studentGui = new StudentGui();
		studentGuiScene = new Scene(studentGui);
		
		quizGui = new QuizPane();
		quizScene = new Scene(quizGui);
		
		studentGui.startTestAction(ev -> primaryStage.setScene(quizScene));
		
		this.primaryStage = primaryStage;
		primaryStage.setScene(studentGuiScene);
		primaryStage.setTitle("UniCycle");
		primaryStage.setHeight(720);
		primaryStage.setWidth(1280);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

}
