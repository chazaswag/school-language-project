package application;
import java.nio.file.Paths;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Main extends Application {
	Stage Window;
	public class Loginbutton extends Button {
	    public Loginbutton() {
	    }

	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primarystage) throws Exception {
		
		Images images = new Images();
		Audio audio = new Audio();
		Video video = new Video();
		Groups groups = new Groups();
		Score score = new Score();
		multiplechoice choice = new multiplechoice();
		
		Window = primarystage;
		Window.setX(0);
		Window.setY(0);
		Window.initStyle(StageStyle.UNDECORATED);
		Scene loginscreen = new Scene(groups.screen_login,2000,2000,Color.rgb(68,114,196));
		Scene accessibility = new Scene(groups.screen_accessibility,2000,2000,Color.rgb(68,114,196));
		Scene studentScene = new Scene(groups.screen_tests,2000,2000, Color.rgb(68,114,196));
		Scene teacherScene = new Scene(groups.screen_teacher,2000,2000, Color.rgb(68,114,196));
		Scene test_screen = new Scene(groups.test1,2000,2000, Color.rgb(68,114,196));
		Scene testtranslate_screen = new Scene(groups.testtranslate,2000,2000, Color.rgb(68,114,196));
		Scene testlisten_screen = new Scene(groups.screen_testlisten,2000,2000, Color.rgb(68,114,196));
		Scene results_screen = new Scene(groups.testresults,2000,2000, Color.rgb(68,114,196));
		Scene help = new Scene(groups.screen_help,2000,2000, Color.rgb(68,114,196));
		Window.setTitle("MFL Application"); Window.show();Window.setScene(loginscreen);Window.setFullScreenExitHint("");Window.setFullScreen(true);
		
													//media importing. sound images and stuff
		
		Image icon = new Image(Paths.get("src/img/icons/logo.jpg").toUri().toString()); Window.getIcons().add(icon);
		Image logo = new Image(Paths.get("src/img/icons/wolfretonlogo.png").toUri().toString());
		ImageView logoviewer = new ImageView(logo);
		logoviewer.setX(150);logoviewer.setY(125);
		logoviewer.setFitWidth(100);logoviewer.setFitHeight(100);
		Image settings = new Image(Paths.get("src/img/icons/cog.png").toUri().toString());
		ImageView settingsviewer = new ImageView(settings);
		settingsviewer.setX(150);settingsviewer.setY(125);
		settingsviewer.setFitWidth(100);settingsviewer.setFitHeight(100);

		Rectangle baserectangle = new Rectangle();
		baserectangle.setX(125);baserectangle.setY(100);
		baserectangle.setWidth(1100);baserectangle.setHeight(600);
		baserectangle.setFill(Color.rgb(48, 84, 148));
		
		Rectangle testrectangle = new Rectangle();
		testrectangle.setX(-10);testrectangle.setY(0);
		testrectangle.setWidth(2000);testrectangle.setHeight(150);
		testrectangle.setFill(Color.rgb(48, 84, 148));
		
		ImageView testlogo = new ImageView(logo);
		testlogo.setX(40);testlogo.setY(10);
		testlogo.setFitWidth(125);testlogo.setFitHeight(125);
		
		Slider textSizeSlider = new Slider();
		textSizeSlider.setLayoutX(680);textSizeSlider.setLayoutY(297);
		textSizeSlider.setMin(1);textSizeSlider.setMax(3);textSizeSlider.setValue(1);
		
		CheckBox boldCheckBox = new CheckBox();
		boldCheckBox.setLayoutX(680);boldCheckBox.setLayoutY(340);
		
		Label subtitle = new Label();
		subtitle.setTextFill(Color.WHITE);
		subtitle.setFont(Font.font("Verdana",30));
		subtitle.setLayoutY(410); subtitle.setLayoutX(4000);
		subtitle.setBackground(new Background(new BackgroundFill(Color.rgb(0, 0, 0, 0.5), null, null)));
		subtitle.setVisible(false);
		
		Text subtitleBox_txt = new Text();
		subtitleBox_txt.setText("Subtitles :");
		subtitleBox_txt.setX(481);subtitleBox_txt.setY(410);
		subtitleBox_txt.setFont(Font.font("Verdana",30));
		
		CheckBox subtitlesBool = new CheckBox();
		subtitlesBool.setLayoutX(680);subtitlesBool.setLayoutY(390);
		subtitlesBool.setOnAction ( e ->{ if (subtitlesBool.isSelected()) {  subtitle.setVisible(true); ;
		} else {subtitle.setVisible(false);}});
		
		Text textslider_txt = new Text();
		textslider_txt.setText("Text Size :");
		textslider_txt.setX(480);textslider_txt.setY(310);
		textslider_txt.setFont(Font.font("Verdana",30));
		
		Text textbold_txt = new Text();
		textbold_txt.setText("Bold :");
		textbold_txt.setX(481);textbold_txt.setY(360);
		textbold_txt.setFont(Font.font("Verdana",30));

		Text invalid_txt = new Text();
		invalid_txt.setText("Wrong Username and or Password");
		invalid_txt.setX(550);invalid_txt.setY(675);
		invalid_txt.setFont(Font.font("Verdana",15));
		
		Text helptext_txt = new Text();
		helptext_txt.setText("Your teacher has been notified");
		helptext_txt.setX(475);helptext_txt.setY(200);
		helptext_txt.setFont(Font.font("Verdana",30));
		
		Text login_txt = new Text();
		login_txt.setText("Log-In");
		login_txt.setX(625);login_txt.setY(200);
		login_txt.setFont(Font.font("Verdana",30));
		
		Text accessibility_txt = new Text();
		accessibility_txt.setText("Settings & Accessibility");
		accessibility_txt.setX(500);accessibility_txt.setY(200);
		accessibility_txt.setFont(Font.font("Verdana",30));
		
		Text username_txt = new Text();
		username_txt.setText("username");
		username_txt.setX(600);username_txt.setY(300);
		username_txt.setFont(Font.font("Verdana",30));

		
		Text password_txt = new Text();
		password_txt.setText("password");
		password_txt.setX(600);password_txt.setY(450);
		password_txt.setFont(Font.font("Verdana",30));
		
		Text test_txt = new Text();
		test_txt.setText("Tests");
		test_txt.setX(650);test_txt.setY(150);
		test_txt.setFont(Font.font("Verdana",30));
		
		Text testset1test_txt = new Text();
		testset1test_txt.setText("Food test 1\n"+ "Food test 2\n"+ "Food test 3| due 25/12/22");
		testset1test_txt.setX(250);testset1test_txt.setY(300);
		testset1test_txt.setFont(Font.font("Verdana",20));	
		
		Text testset1_txt = new Text();
		testset1_txt.setText("Food tests");
		testset1_txt.setX(250);testset1_txt.setY(275);
		testset1_txt.setFont(Font.font("Verdana",30));	
		
		Text topic1_txt = new Text();
		Button triNext_BTN = new Button(); 
		
		TextField UNinput = new TextField ();
		UNinput.setLayoutX(550);UNinput.setLayoutY(350);
		UNinput.setFont(Font.font("Verdana",20));

		PasswordField PWinput = new PasswordField ();
		PWinput.setLayoutX(550);PWinput.setLayoutY(500);
		PWinput.setFont(Font.font("Verdana",20));
		

		

		
		Button test1button = new Button();
		test1button.setText("Start Food Tests!");
		test1button.setLayoutX(450);
		test1button.setLayoutY(300); 
		test1button.setOnAction ( e -> {Window.setScene(test_screen); Window.setFullScreen(true);
		topic1_txt.setText("Food: Multiple Choice");groups.test1.getChildren().add(topic1_txt);groups.test1.getChildren().add(0,testrectangle);
		groups.test1.getChildren().add(testlogo);groups.test1.getChildren().add(images.coffeeviewer);
		groups.test1.getChildren().add(choice.incorrect1);groups.test1.getChildren().add(choice.incorrect2);groups.test1.getChildren().add(choice.incorrect3);groups.test1.getChildren().add(choice.correct);
		});

		
		Text score_txt = new Text();
		score_txt.setText("Your test score was: " + score.testScore + " / 9");
		score_txt.setX(700);score_txt.setY(200);
		score_txt.setFont(Font.font("Verdana",30));
		
		Text name_txt = new Text();
		name_txt.setText("hi");
		name_txt.setX(200);name_txt.setY(200);
		name_txt.setFont(Font.font("Verdana",30));
		
		ImageView resultslogo = new ImageView(logo);
		resultslogo.setX(1075);
		resultslogo.setY(125);
		resultslogo.setFitWidth(100);
		resultslogo.setFitHeight(100);
		
		Button resultsbutton = new Button();
		resultsbutton.setLayoutX(1100); resultsbutton.setLayoutY(650);
		resultsbutton.setText("results");
		resultsbutton.setFont(Font.font("Verdana",15));
		resultsbutton.setOnAction(e -> {
			Window.setScene(results_screen);
			groups.testresults.getChildren().add(0,baserectangle);
			score_txt.setText("Your score is: " + score.testScore.get() + " / 9");
			groups.testresults.getChildren().add(resultslogo); 
			String feedback1 = new String("");
			String feedback2 = new String("");
			if (score.testScore.get() <= 3)
			{
				feedback1 = ("You had a good go at all of them. You tried on minerals, drinks and food.");
				feedback2 = ("You need to improve on all the subjects covered as you failed to answer the majority.");
			}
			else if (score.testScore.get() <= 6)
			{
				feedback1 = ("You did great on all the subjects covered. You did well on minerals, drinks and food.");
				feedback2 = ("You need to revise specific topics but generally not many of improvements, keep working hard.");
			}
			else if (score.testScore.get() <= 9)
			{
				feedback1 = ("You did awesome and got full marks. You really know minerals, drinks and food.");
				feedback2 = ("Try and iron out the small mistakes.");
			}

			Text WWW = new Text();
			WWW.setY(400); WWW.setX(200);
			Text TIF = new Text();
			TIF.setY(550); TIF.setX(200);
			WWW.setText("What Went Well \n Here is your feedback; " + feedback1 + "\n Well done.");
			TIF.setText("To Be Improved Further\n"+feedback2 + " Nice try.");
			groups.testresults.getChildren().add(WWW);
			groups.testresults.getChildren().add(TIF);
			WWW.setFont(Font.font("Verdana",18));
			TIF.setFont(Font.font("Verdana",18));
		});
		
		Button readaloud1_BTN = new Button();
		readaloud1_BTN.setGraphic(images.readaloud_viewer);
		readaloud1_BTN.setLayoutX(180);readaloud1_BTN.setLayoutY(30);
		readaloud1_BTN.setOnAction(e -> {audio.readaloud1.play();});
		Button readaloud2_BTN = new Button();
		readaloud2_BTN.setGraphic(images.readaloud_viewer);
		readaloud2_BTN.setLayoutX(180);readaloud2_BTN.setLayoutY(30);
		readaloud2_BTN.setOnAction(e -> {audio.readaloud2.play();});
		Button readaloud3_BTN = new Button();
		readaloud3_BTN.setGraphic(images.readaloud_viewer);
		readaloud3_BTN.setLayoutX(180);readaloud3_BTN.setLayoutY(30);
		readaloud3_BTN.setOnAction(e -> {audio.readaloud3.play();});
		

		TextField COFFEEinput = new TextField ();
		COFFEEinput.setLayoutX(212);COFFEEinput.setLayoutY(350);
		COFFEEinput.setFont(Font.font("Verdana",20));
		
		TextField WATERinput = new TextField ();
		WATERinput.setLayoutX(590);WATERinput.setLayoutY(350);
		WATERinput.setFont(Font.font("Verdana",20));
		
		TextField BURGERinput = new TextField ();
		BURGERinput.setLayoutX(960);BURGERinput.setLayoutY(350);
		BURGERinput.setFont(Font.font("Verdana",20));
		
	    String coffecorrect ="Te con limon";String watercorrect = "agua mineral";String burgercorrect = "leche"; 
	    String coffeelistencorrect ="black coffee";String burgerlistencorrect = "burger";String noodleslistencorrect = "noodles"; 

	    Button listenclear_BTN = new Button();
	    listenclear_BTN.setText("Check Your Answers");
	    listenclear_BTN.setFont(Font.font("Verdana",30));
	    listenclear_BTN.setLayoutX(540); listenclear_BTN.setLayoutY(600);
	    listenclear_BTN.setOnAction(e -> {
	    	groups.screen_testlisten.getChildren().remove(listenclear_BTN); groups.screen_testlisten.getChildren().add(resultsbutton);
	    	String coffee = COFFEEinput.getText(); String water = WATERinput.getText(); String burger = BURGERinput.getText();
		    COFFEEinput.setEditable(false);WATERinput.setEditable(false);BURGERinput.setEditable(false);COFFEEinput.setFocusTraversable(false);

		    if (coffee.equalsIgnoreCase(burgerlistencorrect)) {
		        COFFEEinput.setStyle("-fx-background-color:#50C878;");
		        score.testScore.getAndAdd(1);
		    } else {
		        COFFEEinput.setStyle("-fx-background-color:#FF2E2E;");
		    }

		    if (water.equalsIgnoreCase(noodleslistencorrect)) {
		        WATERinput.setStyle("-fx-background-color:#50C878;");
		        score.testScore.getAndAdd(1);
		    } else {
		        WATERinput.setStyle("-fx-background-color:#FF2E2E;");
		    }

		    if (burger.equalsIgnoreCase(coffeelistencorrect)) {
		        BURGERinput.setStyle("-fx-background-color:#50C878;");
		        score.testScore.getAndAdd(1);
		    } else {
		        BURGERinput.setStyle("-fx-background-color:#FF2E2E;");
		    }
	    	});
	    
		Text coffeewaterburger_txt = new Text();
		video.timer.setX(615);video.timer.setY(490);
		video.timer.setFitHeight(200);
		video.timer.setFitWidth(200);
		video.timerplayer.setOnEndOfMedia(() -> {
		  groups.testtranslate.getChildren().add(triNext_BTN); groups.testtranslate.getChildren().remove(video.timer);
		    String coffee = COFFEEinput.getText(); String water = WATERinput.getText(); String burger = BURGERinput.getText();
		    COFFEEinput.setEditable(false);WATERinput.setEditable(false);BURGERinput.setEditable(false);COFFEEinput.setFocusTraversable(false);

		    if (coffee.equalsIgnoreCase(coffecorrect)) {
		        COFFEEinput.setStyle("-fx-background-color:#50C878;");
		        score.testScore.getAndAdd(1);
		    } else {
		        COFFEEinput.setStyle("-fx-background-color:#FF2E2E;");
		    }

		    if (water.equalsIgnoreCase(watercorrect)) {
		        WATERinput.setStyle("-fx-background-color:#50C878;");
		        score.testScore.getAndAdd(1);
		    } else {
		        WATERinput.setStyle("-fx-background-color:#FF2E2E;");
		    }

		    if (burger.equalsIgnoreCase(burgercorrect)) {
		        BURGERinput.setStyle("-fx-background-color:#50C878;");
		        score.testScore.getAndAdd(1);
		    } else {
		        BURGERinput.setStyle("-fx-background-color:#FF2E2E;");
		    }
		});
	    Button playburger_BTN = new Button();
	    playburger_BTN.setLayoutX(237);playburger_BTN.setLayoutY(350);
	    playburger_BTN.setText("Sound 1 ▶");
	    playburger_BTN.setOnAction(e -> {audio.burger_snd.play();
	    subtitle.setLayoutX(210);
	    subtitle.setText("\"hamburguesa\"");
	    });
	    playburger_BTN.setFont(Font.font("Verdana",30));
	    Button playwater_BTN = new Button();
	    playwater_BTN.setLayoutX(615);playwater_BTN.setLayoutY(350);
	    playwater_BTN.setText("Sound 2 ▶");
	    playwater_BTN.setOnAction(e -> {audio.water_snd.play();
	    subtitle.setLayoutX(660);
	    subtitle.setText("\"fideos\""); 
	    });
	    playwater_BTN.setFont(Font.font("Verdana",30));
	    Button playcoffee_BTN = new Button();
	    playcoffee_BTN.setLayoutX(985);playcoffee_BTN.setLayoutY(350);
	    playcoffee_BTN.setText("Sound 3 ▶");
	    playcoffee_BTN.setOnAction(e -> {
	    subtitle.setLayoutX(985);
	    subtitle.setText("\"cafe negro\"");
	    audio.coffee_snd.play(); 
	    });
	    
	    playcoffee_BTN.setFont(Font.font("Verdana",30));
	    
		triNext_BTN.setLayoutX(1100); triNext_BTN.setLayoutY(650);
		triNext_BTN.setText("Continue");
		triNext_BTN.setFont(Font.font("Verdana",15));
		triNext_BTN.setOnAction(e -> {  Window.setScene(testlisten_screen); groups.testtranslate.getChildren().remove(video.timer);groups.screen_testlisten.getChildren().add(0,testrectangle);groups.screen_testlisten.getChildren().add(testlogo);
			topic1_txt.setText("Food: Listen and Translate!");groups.screen_testlisten.getChildren().add(topic1_txt);
			WATERinput.clear();COFFEEinput.clear();BURGERinput.clear();  topic1_txt.setFont(Font.font("Verdana",45)); 
			groups.screen_testlisten.getChildren().add(BURGERinput);groups.screen_testlisten.getChildren().add(COFFEEinput);groups.screen_testlisten.getChildren().add(WATERinput);
			groups.screen_testlisten.getChildren().add(playburger_BTN);groups.screen_testlisten.getChildren().add(playwater_BTN);groups.screen_testlisten.getChildren().add(playcoffee_BTN);
			COFFEEinput.setEditable(true);WATERinput.setEditable(true);BURGERinput.setEditable(true);
			COFFEEinput.setTranslateY(150);WATERinput.setTranslateY(150);BURGERinput.setTranslateY(150);
			topic1_txt.setText("Food: Translate Spanish audio into English!");
			WATERinput.setStyle (null);COFFEEinput.setStyle (null);BURGERinput.setStyle (null);
			
		});
		Button testcontinue2 = new Button();
		testcontinue2.setText("Continue");
		testcontinue2.setFont(Font.font("Verdana",15));
		testcontinue2.setLayoutX(1100);
		testcontinue2.setLayoutY(650);//
		testcontinue2.setTextFill(Color.RED); 
		testcontinue2.setOnAction(e -> {video.timerplayer.play();Window.setScene(testtranslate_screen);groups.test1.getChildren().remove(topic1_txt);groups.test1.getChildren().remove(testrectangle);groups.test1.getChildren().remove(testlogo);groups.testtranslate.getChildren().add(0,testrectangle);groups.testtranslate.getChildren().add(testlogo);
		;groups.testtranslate.getChildren().add(topic1_txt);topic1_txt.setTranslateX(50);topic1_txt.setText("Food: Translate into Spanish in the box!");topic1_txt.setX(250);groups.testtranslate.getChildren().add(coffeewaterburger_txt);
		groups.testtranslate.getChildren().add(COFFEEinput);groups.testtranslate.getChildren().add(WATERinput);groups.testtranslate.getChildren().add(BURGERinput); groups.testtranslate.getChildren().add(video.timer); 
		;
		;;});
		
		Button test2button = new Button();
		test2button.setText("Start Sport Tests!");
		test2button.setLayoutX(450);
		test2button.setLayoutY(400);

		topic1_txt.setText("Food");
		topic1_txt.setX(300);
		topic1_txt.setY(90);
		topic1_txt.setFont(Font.font("Verdana",50));	
		
		coffeewaterburger_txt.setText("Tea with Lemon		       mineral water			milk");
		coffeewaterburger_txt.setX(210);
		coffeewaterburger_txt.setY(300);
		coffeewaterburger_txt.setFont(Font.font("Verdana",30));
		
		
		Text testset2test_txt = new Text();
		testset2test_txt.setText("Sports test 1\n"+ "Sports test 2\n"+ "Sports test 3    | due 12/12/22");
		testset2test_txt.setX(250);
		testset2test_txt.setY(400);
		testset2test_txt.setFont(Font.font("Verdana",20));	
		
		Text testset2_txt = new Text();
		testset2_txt.setText("Sports tests");
		testset2_txt.setX(250);
		testset2_txt.setY(375);
		testset2_txt.setFont(Font.font("Verdana",30));	
		
		CheckBox test2CheckBox = new CheckBox(); 
		test2CheckBox.setLayoutX(450);
		test2CheckBox.setLayoutY(355);
		test2CheckBox.setOnAction ( e ->{ if (test2CheckBox.isSelected()) { groups.screen_tests.getChildren().add(testset2test_txt);groups.screen_tests.getChildren().add(test2button);groups.screen_tests.getChildren().add(images.sportslogoviewer);
	        							} else { groups.screen_tests.getChildren().remove(testset2test_txt);groups.screen_tests.getChildren().remove(test2button);groups.screen_tests.getChildren().remove(images.sportslogoviewer);}});	
		
		CheckBox test1CheckBox = new CheckBox();
		test1CheckBox.setLayoutX(450);
		test1CheckBox.setLayoutY(255);
		test1CheckBox.setOnAction ( e ->{ if (test1CheckBox.isSelected()) { testset2test_txt.setTranslateY(50); test2CheckBox.setTranslateY(50); groups.screen_tests.getChildren().add(testset1test_txt);testset2_txt.setTranslateY(50);;groups.screen_tests.getChildren().add(test1button);groups.screen_tests.getChildren().add(images.foodslogo);test2button.setTranslateY(50);images.sportslogoviewer.setTranslateY(50);
	        							} else { groups.screen_tests.getChildren().remove(testset1test_txt);testset2test_txt.setTranslateY(-50);;test2CheckBox.setTranslateY(-50);testset2_txt.setTranslateY(-50);groups.screen_tests.getChildren().remove(test1button);test2button.setTranslateY(-50);;groups.screen_tests.getChildren().remove(images.foodslogo);images.sportslogoviewer.setTranslateY(-50);}});
		
		
		TextField HPinput = new TextField ();
		HPinput.setLayoutX(750);
		HPinput.setLayoutY(350);
		HPinput.setFont(Font.font("Verdana",20));
		HPinput.setPromptText("Enter Name For Help");
		HPinput.setFocusTraversable(false);
		
		Button BTN_HPinput = new Button ();
		BTN_HPinput.setText("Submit Name");
		BTN_HPinput.setLayoutX(800);
		BTN_HPinput.setLayoutY(400);
		BTN_HPinput.setFont(Font.font("Verdana",20));
		BTN_HPinput.setOnAction(e -> {HPinput.clear();groups.screen_help.getChildren().add(helptext_txt);});
			
		Button BTN_logout = new Button("log out");
		BTN_logout.setFont(Font.font("Verdana",15));
		BTN_logout.setLayoutX(1100);
		BTN_logout.setLayoutY(650);
		BTN_logout.setTextFill(Color.RED);
		BTN_logout.setOnAction(e -> {Window.setScene(loginscreen); Window.setFullScreen(true);groups.screen_login.getChildren().add(0,baserectangle);});
		//
		Loginbutton BTN_login = new Loginbutton();
		BTN_login.setFont(Font.font("Verdana",20));
		BTN_login.setLayoutX(640);
		BTN_login.setLayoutY(600);
		BTN_login.setTextFill(Color.BLACK);
		BTN_login.setText("Log in");
		BTN_login.setOnAction(e -> {String passText = PWinput.getText();String setStudentPassword = "student";String setTeacherPassword = "teacher";
		if (passText.equals(setStudentPassword)) {Window.setScene(studentScene); Window.setFullScreen(true); groups.screen_tests.getChildren().add(0,baserectangle);name_txt.setText("Student ID : " + UNinput.getText());UNinput.clear(); PWinput.clear(); groups.screen_login.getChildren().remove(invalid_txt);groups.screen_tests.getChildren().add(BTN_logout);
	    } else if (passText.equals(setTeacherPassword)) {Window.setScene(teacherScene); Window.setFullScreen(true); groups.screen_teacher.getChildren().add(0,baserectangle); UNinput.clear(); PWinput.clear(); groups.screen_login.getChildren().remove(invalid_txt); groups.screen_teacher.getChildren().add(BTN_logout);;
	    } else {groups.screen_login.getChildren().add(invalid_txt);}}); 			

		Button BTN_returnhelp = new Button("return to login");
		BTN_returnhelp.setFont(Font.font("Verdana",15));
		BTN_returnhelp.setLayoutX(1050);
		BTN_returnhelp.setLayoutY(650);
		BTN_returnhelp.setTextFill(Color.BLACK);
		BTN_returnhelp.setOnAction(e -> 
		{Window.setScene(loginscreen);Window.setFullScreen(true);groups.screen_login.getChildren().add(0,baserectangle);groups.screen_accessibility.getChildren().add(BTN_returnhelp);groups.screen_help.getChildren().remove(baserectangle);groups.screen_accessibility.getChildren().remove(baserectangle);});
		
		Button BTN_quit = new Button("X");
		BTN_quit.setTextFill(Color.RED);
		BTN_quit.setStyle("-fx-background-color:#305494;");
		BTN_quit.setOnAction ( e -> {Window.hide();});
		BTN_quit.setFont(Font.font("Verdana",30));
		BTN_quit.setLayoutX(1250);
		BTN_quit.setLayoutY(30);
		
		Button BTN_quitresults = new Button("X");
		BTN_quitresults.setTextFill(Color.RED);
		BTN_quitresults.setStyle("-fx-background-color:#305494;");
		BTN_quitresults.setOnAction ( e -> {Window.setScene(studentScene);groups.screen_tests.getChildren().add(0,baserectangle); score.testScore.set(0);});
		BTN_quitresults.setFont(Font.font("Verdana",30));
		BTN_quitresults.setLayoutX(1250);
		BTN_quitresults.setLayoutY(30);
		
		Button BTN_help = new Button("  help  ");
		BTN_help.setFont(Font.font("Verdana",15));
		BTN_help.setLayoutX(1100);
		BTN_help.setLayoutY(650);
		BTN_help.setTextFill(Color.GREEN);
		BTN_help.setOnAction(e -> {Window.setScene(help); Window.setFullScreen(true);groups.screen_help.getChildren().add(0,baserectangle);groups.screen_accessibility.getChildren().remove(BTN_returnhelp);groups.screen_help.getChildren().add(BTN_returnhelp);});
		
		ImageView helplogo = new ImageView(logo);
		helplogo.setX(300);
		helplogo.setY(250);
		helplogo.setFitWidth(300);
		helplogo.setFitHeight(300);

		Button BTN_accessibility = new Button();
		BTN_accessibility.setGraphic(settingsviewer);
		BTN_accessibility.setStyle("-fx-background-color:#305494;");
		BTN_accessibility.setLayoutX(1100);
		BTN_accessibility.setLayoutY(115);
		BTN_accessibility.setOnAction(e -> {Window.setScene(accessibility); Window.setFullScreen(true);groups.screen_accessibility.getChildren().add(0,baserectangle);groups.screen_accessibility.getChildren().add(BTN_returnhelp);});
		
											//bold text
		Text[] texts = new Text[] 
		{testset2_txt, textslider_txt, textbold_txt, invalid_txt, helptext_txt, login_txt, accessibility_txt, username_txt, password_txt, test_txt, testset1test_txt, testset1_txt, topic1_txt, coffeewaterburger_txt, testset2test_txt, testset2_txt,subtitleBox_txt,};
		
		boldCheckBox.setOnAction(e -> {
		    for (Text text : texts) {
		        if (boldCheckBox.isSelected()) {
		            text.setStyle("-fx-font-weight: bold;");
		        } else {
		            text.setStyle("-fx-font-weight: normal;");
		        }
		    }
		});

			//login page
			groups.screen_login.getChildren().add(0,baserectangle);
			groups.screen_login.getChildren().add(login_txt);
			groups.screen_login.getChildren().add(username_txt);
			groups.screen_login.getChildren().add(password_txt);
			groups.screen_login.getChildren().add(logoviewer);
			groups.screen_login.getChildren().add(UNinput);
			groups.screen_login.getChildren().add(PWinput);
			groups.screen_login.getChildren().add(BTN_help);
			groups.screen_login.getChildren().add(BTN_login);
			groups.screen_login.getChildren().add(BTN_accessibility);
			groups.screen_login.getChildren().add(BTN_quit);
			//student test screen  
			groups.screen_tests.getChildren().add(testset1_txt);
			groups.screen_tests.getChildren().add(testset2_txt);
			groups.screen_tests.getChildren().add(test_txt);
			groups.screen_tests.getChildren().add(test1CheckBox); 
			groups.screen_tests.getChildren().add(test2CheckBox);
			//teacher test  
			groups.screen_testlisten.getChildren().add(listenclear_BTN);
			groups.testresults.getChildren().add(score_txt);
			//help screen 
			groups.screen_help.getChildren().add(helplogo);
			groups.screen_help.getChildren().add(HPinput);
			groups.screen_help.getChildren().add(BTN_HPinput);
			//accessibility screen 
			groups.screen_accessibility.getChildren().add(accessibility_txt);
			groups.screen_accessibility.getChildren().add(textSizeSlider);
			groups.screen_accessibility.getChildren().add(textslider_txt);
			groups.screen_accessibility.getChildren().add(textbold_txt);
			groups.screen_accessibility.getChildren().add(boldCheckBox);
			groups.screen_accessibility.getChildren().add(subtitlesBool);
			groups.screen_accessibility.getChildren().add(subtitleBox_txt);
			//results screen
			groups.testresults.getChildren().add(BTN_quitresults);
			groups.testresults.getChildren().add(name_txt);
			//multiple choice screen
			groups.test1.getChildren().add(readaloud1_BTN);
			
			choice.correct.setOnAction (e -> {choice.correct.setStyle("-fx-background-color:#50C878;");score.testScore.getAndAdd(1);groups.test1.getChildren().add(choice.testcontinue);
			groups.test1.getChildren().remove(choice.correct);groups.test1.getChildren().remove(choice.incorrect1);groups.test1.getChildren().remove(choice.incorrect2);
			groups.test1.getChildren().remove(choice.incorrect3);
			groups.test1.getChildren().add(choice.correct);});
			
			choice.correct1.setOnAction (e -> {choice.correct1.setStyle("-fx-background-color:#50C878;");score.testScore.getAndAdd(1);groups.test1.getChildren().add(choice.testcontinue1);
			groups.test1.getChildren().remove(choice.correct1);groups.test1.getChildren().remove(choice.incorrect4);groups.test1.getChildren().remove(choice.incorrect5);groups.test1.getChildren().remove(choice.incorrect6);
			groups.test1.getChildren().add(choice.correct1);});
			
			choice.correct2.setOnAction (e -> {choice.correct2.setStyle("-fx-background-color:#50C878;");score.testScore.getAndAdd(1);groups.test1.getChildren().add(testcontinue2);
			groups.test1.getChildren().remove(choice.correct2);groups.test1.getChildren().remove(choice.incorrect7);groups.test1.getChildren().remove(choice.incorrect8);groups.test1.getChildren().remove(choice.incorrect9);
			groups.test1.getChildren().add(choice.correct2);});
			
			//translation screen
			groups.testtranslate.getChildren().add(readaloud2_BTN);
			groups.testtranslate.getChildren().add(video.timer);
			//sound screen
			groups.screen_testlisten.getChildren().add(readaloud3_BTN);
			groups.screen_testlisten.getChildren().add(subtitle);
	}	
}