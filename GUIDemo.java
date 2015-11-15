import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUIDemo extends Application{

	private	Label label1=new Label("Enter your ten numbers");
	private static int number[]=new int[10];	
	private	TextField textfield =new TextField();
	private	Button btn= new Button("Enter numbers");
	private Button btn2= new Button("Sort");
	private int count=0;
		public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("submit");
		
		
		btn.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
			if (count<10){
				number[count]=Integer.parseInt(textfield.getText());
			count++;
			}
			if (count>=10){
				btn.setText("Please press sort button now!");
			}

			}			
		});
		btn2.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				Number numbers =new Number(number);
				numbers.returnArray();
				System.out.println(numbers);
			}
		});
	
	GridPane grid = new GridPane();
	grid.setAlignment(Pos.CENTER);
	grid.setVgap(20);
	grid.setHgap(20);
	grid.add(label1,0,0);
	grid.add(textfield, 1, 0);
	grid.add(btn, 1,1);
	grid.add(btn2, 1, 2);
	Scene scene =new Scene(grid, 800,800);
	primaryStage.setScene(scene);
	primaryStage.show();
	}

}
