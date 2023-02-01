package application;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class multiplechoice {
	Score score = new Score();
	Groups groups = new Groups();
	Images images = new Images();
	Button testcontinue = new Button();
	Button testcontinue1 = new Button();
	Button testcontinue2 = new Button();
	Button incorrect1 = new Button();
	Button incorrect2 = new Button();
	Button incorrect3 = new Button();
	Button incorrect4 = new Button();
	Button incorrect5 = new Button();
	Button incorrect6 = new Button();		
	Button incorrect7 = new Button();
	Button incorrect8 = new Button();
	Button incorrect9 = new Button();
	Button correct = new Button();
	Button correct1 = new Button();
	Button correct2 = new Button();
	
	public multiplechoice() {
		//buttons
		testcontinue.setText("Continue");
		testcontinue.setFont(Font.font("Verdana",15));
		testcontinue.setLayoutX(1100);
		testcontinue.setLayoutY(650);
		testcontinue.setTextFill(Color.RED);
		testcontinue.setOnAction(e -> {
		groups.test1.getChildren().remove(images.coffeeviewer); groups.test1.getChildren().add(images.waterviewer); groups.test1.getChildren().remove(testcontinue);
		groups.test1.getChildren().remove(correct);groups.test1.getChildren().remove(incorrect1);groups.test1.getChildren().remove(incorrect2);groups.test1.getChildren().remove(incorrect3);
		groups.test1.getChildren().add(correct1);groups.test1.getChildren().add(incorrect4);groups.test1.getChildren().add(incorrect5);groups.test1.getChildren().add(incorrect6);;});
		
		testcontinue1.setText("Continue");
		testcontinue1.setFont(Font.font("Verdana",15));
		testcontinue1.setLayoutX(1100);
		testcontinue1.setLayoutY(650);
		testcontinue1.setTextFill(Color.RED);
		testcontinue1.setOnAction(e -> {
		groups.test1.getChildren().remove(images.waterviewer); groups.test1.getChildren().add(images.burgerviewer); groups.test1.getChildren().remove(testcontinue1);
		groups.test1.getChildren().remove(correct1);groups.test1.getChildren().remove(incorrect4);groups.test1.getChildren().remove(incorrect5);groups.test1.getChildren().remove(incorrect6);
		groups.test1.getChildren().add(correct2);groups.test1.getChildren().add(incorrect7);groups.test1.getChildren().add(incorrect8);groups.test1.getChildren().add(incorrect9);;});
		//answers
		correct.setStyle("-fx-background-color:#305494;");
		correct.setFont(Font.font("Verdana",25));
		correct.setTextFill(Color.BLACK);
		correct.setText("azúcar");
		correct.setLayoutX(1000);correct.setLayoutY(300);
		
		correct1.setStyle("-fx-background-color:#305494;");
		correct1.setFont(Font.font("Verdana",25));
		correct1.setTextFill(Color.BLACK);
		correct1.setText("sal");
		correct1.setLayoutX(700); correct1.setLayoutY(300); 
		
		correct2.setStyle("-fx-background-color:#305494;");
		correct2.setFont(Font.font("Verdana",25));
		correct2.setTextFill(Color.BLACK);
		correct2.setText("pimienta");
		correct2.setLayoutX(1000); correct2.setLayoutY(400);
		
		incorrect1.setStyle("-fx-background-color:#305494;");
		incorrect1.setFont(Font.font("Verdana",25));
		incorrect1.setTextFill(Color.BLACK);
		incorrect1.setText("estucar");
		incorrect1.setLayoutX(700);incorrect1.setLayoutY(300);
		incorrect1.setOnAction (e -> {incorrect1.setStyle("-fx-background-color:#FF2E2E;"); groups.test1.getChildren().add(testcontinue);
		groups.test1.getChildren().remove(correct);
		groups.test1.getChildren().remove(incorrect1);
		groups.test1.getChildren().remove(incorrect2);
		groups.test1.getChildren().remove(incorrect3);
		groups.test1.getChildren().add(incorrect1);});

		incorrect2.setStyle("-fx-background-color:#305494;");
		incorrect2.setFont(Font.font("Verdana",25));	
		incorrect2.setTextFill(Color.BLACK);
		incorrect2.setText("embabucar");
		incorrect2.setLayoutX(1000);incorrect2.setLayoutY(400);
		incorrect2.setOnAction (e -> {incorrect2.setStyle("-fx-background-color:#FF2E2E;");groups.test1.getChildren().add(testcontinue);
		groups.test1.getChildren().remove(correct);
		groups.test1.getChildren().remove(incorrect1);
		groups.test1.getChildren().remove(incorrect2);
		groups.test1.getChildren().remove(incorrect3);
		groups.test1.getChildren().add(incorrect2);});
	
		incorrect3.setStyle("-fx-background-color:#305494;");
		incorrect3.setFont(Font.font("Verdana",25));	
		incorrect3.setTextFill(Color.BLACK);
		incorrect3.setText("zabucar");
		incorrect3.setLayoutX(700);incorrect3.setLayoutY(400);
		incorrect3.setOnAction (e -> {incorrect3.setStyle("-fx-background-color:#FF2E2E;");groups.test1.getChildren().add(testcontinue);
		groups.test1.getChildren().remove(correct);
		groups.test1.getChildren().remove(incorrect1);
		groups.test1.getChildren().remove(incorrect2);
		groups.test1.getChildren().remove(incorrect3);
		groups.test1.getChildren().add(incorrect3);});

		incorrect4.setStyle("-fx-background-color:#305494;");
		incorrect4.setFont(Font.font("Verdana",25));
		incorrect4.setTextFill(Color.BLACK);
		incorrect4.setText("slat");
		incorrect4.setLayoutX(1000); incorrect4.setLayoutY(300);
		incorrect4.setOnAction (e -> {incorrect4.setStyle("-fx-background-color:#FF2E2E;"); groups.test1.getChildren().add(testcontinue1);
		groups.test1.getChildren().remove(correct1);
		groups.test1.getChildren().remove(incorrect4);
		groups.test1.getChildren().remove(incorrect5);
		groups.test1.getChildren().remove(incorrect6);
		groups.test1.getChildren().add(incorrect4);});

		
		incorrect5.setStyle("-fx-background-color:#305494;");
		incorrect5.setFont(Font.font("Verdana",25));	
		incorrect5.setTextFill(Color.BLACK);
		incorrect5.setText("salino");
		incorrect5.setLayoutX(1000);incorrect5.setLayoutY(400);
		incorrect5.setOnAction (e -> {incorrect5.setStyle("-fx-background-color:#FF2E2E;");groups.test1.getChildren().add(testcontinue1);
		groups.test1.getChildren().remove(correct1);
		groups.test1.getChildren().remove(incorrect4);
		groups.test1.getChildren().remove(incorrect5);
		groups.test1.getChildren().remove(incorrect6);
		groups.test1.getChildren().add(incorrect5);});
	
		incorrect6.setStyle("-fx-background-color:#305494;");
		incorrect6.setFont(Font.font("Verdana",25));	
		incorrect6.setTextFill(Color.BLACK);
		incorrect6.setText("salado");
		incorrect6.setLayoutX(700);incorrect6.setLayoutY(400);
		incorrect6.setOnAction (e -> {incorrect6.setStyle("-fx-background-color:#FF2E2E;");groups.test1.getChildren().add(testcontinue1);
		groups.test1.getChildren().remove(correct1);
		groups.test1.getChildren().remove(incorrect4);
		groups.test1.getChildren().remove(incorrect5);
		groups.test1.getChildren().remove(incorrect6);
		groups.test1.getChildren().add(incorrect6);});
		
		
		incorrect7.setStyle("-fx-background-color:#305494;");
		incorrect7.setFont(Font.font("Verdana",25));
		incorrect7.setTextFill(Color.BLACK);
		incorrect7.setText("Panama");
		incorrect7.setLayoutX(1000); incorrect7.setLayoutY(300);
		incorrect7.setOnAction (e -> {incorrect7.setStyle("-fx-background-color:#FF2E2E;"); groups.test1.getChildren().add(testcontinue2);
		groups.test1.getChildren().remove(correct2);
		groups.test1.getChildren().remove(incorrect7);
		groups.test1.getChildren().remove(incorrect8);
		groups.test1.getChildren().remove(incorrect9);
		groups.test1.getChildren().add(incorrect7);});

		
		incorrect8.setStyle("-fx-background-color:#305494;");
		incorrect8.setFont(Font.font("Verdana",25));	
		incorrect8.setTextFill(Color.BLACK);
		incorrect8.setText("pera");
		incorrect8.setLayoutX(700); incorrect8.setLayoutY(300);
		incorrect8.setOnAction (e -> {incorrect8.setStyle("-fx-background-color:#FF2E2E;");groups.test1.getChildren().add(testcontinue2);
		groups.test1.getChildren().remove(correct2);
		groups.test1.getChildren().remove(incorrect7);
		groups.test1.getChildren().remove(incorrect8);
		groups.test1.getChildren().remove(incorrect9);
		groups.test1.getChildren().add(incorrect8);});
	
		incorrect9.setStyle("-fx-background-color:#305494;");
		incorrect9.setFont(Font.font("Verdana",25));	
		incorrect9.setTextFill(Color.BLACK);
		incorrect9.setText("pierna");
		incorrect9.setLayoutX(700);incorrect9.setLayoutY(400);
		incorrect9.setOnAction (e -> {incorrect9.setStyle("-fx-background-color:#FF2E2E;");groups.test1.getChildren().add(testcontinue2);
		groups.test1.getChildren().remove(correct2);
		groups.test1.getChildren().remove(incorrect7);
		groups.test1.getChildren().remove(incorrect8);
		groups.test1.getChildren().remove(incorrect9);
		groups.test1.getChildren().add(incorrect9);});
		
	}
	public void handleCorrectAnswer(Button correct, int scoreIncrement) {
		correct.setStyle("-fx-background-color:#50C878;");
	    score.testScore.getAndAdd(scoreIncrement);
	    groups.test1.getChildren().add(correct);
	    groups.test1.getChildren().remove(correct1);
	    groups.test1.getChildren().remove(incorrect4);
	    groups.test1.getChildren().remove(incorrect5);
	    groups.test1.getChildren().remove(incorrect6);
	}
}