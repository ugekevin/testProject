import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProjectGui extends Application {

	Stage primaryStage;
	StudentGui StudentGui1;
	private Scene StudentGuiScene ;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StudentGui1 = new StudentGui();
		StudentGuiScene = new Scene(StudentGui1);	  
		
		this.primaryStage = primaryStage;
		primaryStage.setScene(StudentGuiScene);
		primaryStage.setTitle("UniCycle");
		primaryStage.setHeight(720);
		primaryStage.setWidth(1280);
		primaryStage.setResizable(false);
		primaryStage.show();

	}

}
