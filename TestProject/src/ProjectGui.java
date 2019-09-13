import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProjectGui extends Application {

	Stage primaryStage;
	TestcenterLogin loginGui;
	StudentGui studentGui;
	QuizPane quizGui;
	private Scene loginGuiScene;
	private Scene studentGuiScene;
	private Scene quizScene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		loginGui = new TestcenterLogin();
		loginGuiScene = new Scene(loginGui);
		
		studentGui = new StudentGui();
		studentGuiScene = new Scene(studentGui);
		
		quizGui = new QuizPane();
		quizScene = new Scene(quizGui);
		
		studentGui.startLogoutAction(ev -> primaryStage.setScene(quizScene));
		studentGui.startLogoutAction(ev -> primaryStage.setScene(loginGuiScene));
		
		
		this.primaryStage = primaryStage;
		primaryStage.setScene(loginGuiScene);
		primaryStage.setTitle("UniCycle");
		primaryStage.setHeight(750);
		primaryStage.setWidth(1100);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

}
