package application;
import java.util.concurrent.atomic.AtomicInteger;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
		
		Window = primarystage;
		Window.setX(0);
		Window.setY(0);
		Window.initStyle(StageStyle.UNDECORATED);
		Group screen_login = new Group();
		Group screen_accessibility = new Group();
		Group screen_tests = new Group();
		Group test1 = new Group();
		Group test1listen = new Group();
		Group test2 = new Group();
		Group testresults = new Group();
		Group screen_help = new Group();
		Group screen_teacher = new Group();
		Scene loginscreen = new Scene(screen_login,2000,2000,Color.rgb(68,114,196));
		Scene accessibility = new Scene(screen_accessibility,2000,2000,Color.rgb(68,114,196));
		Scene studentScene = new Scene(screen_tests,2000,2000, Color.rgb(68,114,196));
		Scene teacherScene = new Scene(screen_teacher,2000,2000, Color.rgb(68,114,196));
		Scene test1_screen = new Scene(test1,2000,2000, Color.rgb(68,114,196));
		Scene test1listen_screen = new Scene(test1listen,2000,2000, Color.rgb(68,114,196));
		Scene test2_screen = new Scene(test2,2000,2000, Color.rgb(68,114,196));
		Scene results_screen = new Scene(testresults,2000,2000, Color.rgb(68,114,196));
		Scene help = new Scene(screen_help,2000,2000, Color.rgb(68,114,196));
		Image icon = new Image("logo.jpg");
		AtomicInteger testScore = new AtomicInteger();
		
		Window.getIcons().add(icon);
		Window.setTitle("MFL login");
		
		Image logo = new Image("wolfreton.png");
		ImageView imageview = new ImageView(logo);
		imageview.setX(150);
		imageview.setY(125);
		imageview.setFitWidth(100);
		imageview.setFitHeight(100);
		
		Image coffeeimg = new Image("blackcoffee.png");
		ImageView coffeeview = new ImageView(coffeeimg);
		coffeeview.setX(100); 
		coffeeview.setY(275);
		coffeeview.setFitWidth(400);
		coffeeview.setFitHeight(300);
		Image burgerimg = new Image("burger.jpg");
		ImageView burgerview = new ImageView(burgerimg);
		burgerview.setX(100); 
		burgerview.setY(275);
		burgerview.setFitWidth(400);
		burgerview.setFitHeight(300);
		Image waterimg = new Image("water.jpg");
		ImageView waterview = new ImageView(waterimg);
		waterview.setX(100); 
		waterview.setY(275);
		waterview.setFitWidth(400);
		waterview.setFitHeight(300);
		
		Image settings = new Image("cog.png");
		ImageView imageview1 = new ImageView(settings);
		imageview1.setX(150);
		imageview1.setY(125);
		imageview1.setFitWidth(100);
		imageview1.setFitHeight(100);
		
		Rectangle baserectangle = new Rectangle();
		baserectangle.setX(125);
		baserectangle.setY(100);
		baserectangle.setWidth(1100);
		baserectangle.setHeight(600);
		baserectangle.setFill(Color.rgb(48, 84, 148));
		
		Rectangle testrectangle = new Rectangle();
		testrectangle.setX(-10);
		testrectangle.setY(0);
		testrectangle.setWidth(2000);
		testrectangle.setHeight(150);
		testrectangle.setFill(Color.rgb(48, 84, 148));
		
		ImageView testlogo = new ImageView(logo);
		testlogo.setX(40);
		testlogo.setY(10);
		testlogo.setFitWidth(125);
		testlogo.setFitHeight(125);
		
		Slider textSizeSlider = new Slider();
		textSizeSlider.setLayoutX(680);
		textSizeSlider.setLayoutY(297);
		textSizeSlider.setMin(1);
		textSizeSlider.setMax(3);
		textSizeSlider.setValue(1);
		
		CheckBox boldCheckBox = new CheckBox();
		boldCheckBox.setLayoutX(680);
		boldCheckBox.setLayoutY(350);
		
		Text textslider_txt = new Text();
		textslider_txt.setText("Text Size :");
		textslider_txt.setX(530);
		textslider_txt.setY(310);
		textslider_txt.setFont(Font.font("Verdana",20));
		
		Text textbold_txt = new Text();
		textbold_txt.setText("Bold :");
		textbold_txt.setX(531);
		textbold_txt.setY(360);
		textbold_txt.setFont(Font.font("Verdana",20));

		Text invalid_txt = new Text();
		invalid_txt.setText("Wrong Username and or Password");
		invalid_txt.setX(550);
		invalid_txt.setY(575);
		invalid_txt.setFont(Font.font("Verdana",15));
		
		Text helptext_txt = new Text();
		helptext_txt.setText("Your teacher has been notified");
		helptext_txt.setX(475);
		helptext_txt.setY(200);
		helptext_txt.setFont(Font.font("Verdana",30));
		
		Text login_txt = new Text();
		login_txt.setText("Log-In");
		login_txt.setX(625);
		login_txt.setY(200);
		login_txt.setFont(Font.font("Verdana",30));
		
		Text accessibility_txt = new Text();
		accessibility_txt.setText("Settings & Accessibility");
		accessibility_txt.setX(500);
		accessibility_txt.setY(200);
		accessibility_txt.setFont(Font.font("Verdana",30));
		
		Text username_txt = new Text();
		username_txt.setText("username");
		username_txt.setX(600);
		username_txt.setY(300);
		username_txt.setFont(Font.font("Verdana",30));
		
		Text password_txt = new Text();
		password_txt.setText("password");
		password_txt.setX(600);
		password_txt.setY(450);
		password_txt.setFont(Font.font("Verdana",30));
		
		Text test_txt = new Text();
		test_txt.setText("Tests");
		test_txt.setX(650);
		test_txt.setY(150);
		test_txt.setFont(Font.font("Verdana",30));
		
		Text testset1test_txt = new Text();
		testset1test_txt.setText("Food test 1\n"+ "Food test 2\n"+ "Food test 3| due 25/12/22");
		testset1test_txt.setX(250);
		testset1test_txt.setY(300);
		testset1test_txt.setFont(Font.font("Verdana",20));	
		
		Text testset1_txt = new Text();
		testset1_txt.setText("Food tests");
		testset1_txt.setX(250);
		testset1_txt.setY(275);
		testset1_txt.setFont(Font.font("Verdana",30));	
		
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
		Text topic1_txt = new Text();

		
		correct.setStyle("-fx-background-color:#305494;");
		correct.setFont(Font.font("Verdana",25));
		correct.setTextFill(Color.BLACK);
		correct.setText("café negro");
		correct.setLayoutX(1000);correct.setLayoutY(300);
		correct.setOnAction (e -> {correct.setStyle("-fx-background-color:#50C878;");testScore.addAndGet(1);test1.getChildren().add(testcontinue);
		test1.getChildren().remove(correct);
		test1.getChildren().remove(incorrect1);
		test1.getChildren().remove(incorrect2);
		test1.getChildren().remove(incorrect3);
		test1.getChildren().add(correct);});
		
		correct1.setStyle("-fx-background-color:#305494;");
		correct1.setFont(Font.font("Verdana",25));
		correct1.setTextFill(Color.BLACK);
		correct1.setText("agua");
		correct1.setLayoutX(700); correct1.setLayoutY(300); 
		correct1.setOnAction (e -> {correct1.setStyle("-fx-background-color:#50C878;");testScore.addAndGet(1);test1.getChildren().add(testcontinue1);
		test1.getChildren().remove(correct1);
		test1.getChildren().remove(incorrect4);
		test1.getChildren().remove(incorrect5);
		test1.getChildren().remove(incorrect6);
		test1.getChildren().add(correct1);});
		
		correct2.setStyle("-fx-background-color:#305494;");
		correct2.setFont(Font.font("Verdana",25));
		correct2.setTextFill(Color.BLACK);
		correct2.setText("Hamburguesa");
		correct2.setLayoutX(1000); correct2.setLayoutY(400);
		correct2.setOnAction (e -> {correct2.setStyle("-fx-background-color:#50C878;");testScore.addAndGet(1);test1.getChildren().add(testcontinue2);
		test1.getChildren().remove(correct2);
		test1.getChildren().remove(incorrect7);
		test1.getChildren().remove(incorrect8);
		test1.getChildren().remove(incorrect9);
		test1.getChildren().add(correct2);});
		
		incorrect1.setStyle("-fx-background-color:#305494;");
		incorrect1.setFont(Font.font("Verdana",25));
		incorrect1.setTextFill(Color.BLACK);
		incorrect1.setText("café oscuro");
		incorrect1.setLayoutX(700);incorrect1.setLayoutY(300);
		incorrect1.setOnAction (e -> {incorrect1.setStyle("-fx-background-color:#FF2E2E;"); test1.getChildren().add(testcontinue);
		test1.getChildren().remove(correct);
		test1.getChildren().remove(incorrect1);
		test1.getChildren().remove(incorrect2);
		test1.getChildren().remove(incorrect3);
		test1.getChildren().add(incorrect1);});

		
		incorrect2.setStyle("-fx-background-color:#305494;");
		incorrect2.setFont(Font.font("Verdana",25));	
		incorrect2.setTextFill(Color.BLACK);
		incorrect2.setText("café fresco");
		incorrect2.setLayoutX(1000);incorrect2.setLayoutY(400);
		incorrect2.setOnAction (e -> {incorrect2.setStyle("-fx-background-color:#FF2E2E;");test1.getChildren().add(testcontinue);
		test1.getChildren().remove(correct);
		test1.getChildren().remove(incorrect1);
		test1.getChildren().remove(incorrect2);
		test1.getChildren().remove(incorrect3);
		test1.getChildren().add(incorrect2);});
	
		incorrect3.setStyle("-fx-background-color:#305494;");
		incorrect3.setFont(Font.font("Verdana",25));	
		incorrect3.setTextFill(Color.BLACK);
		incorrect3.setText("cafe grande");
		incorrect3.setLayoutX(700);incorrect3.setLayoutY(400);
		incorrect3.setOnAction (e -> {incorrect3.setStyle("-fx-background-color:#FF2E2E;");test1.getChildren().add(testcontinue);
		test1.getChildren().remove(correct);
		test1.getChildren().remove(incorrect1);
		test1.getChildren().remove(incorrect2);
		test1.getChildren().remove(incorrect3);
		test1.getChildren().add(incorrect3);});

		incorrect4.setStyle("-fx-background-color:#305494;");
		incorrect4.setFont(Font.font("Verdana",25));
		incorrect4.setTextFill(Color.BLACK);
		incorrect4.setText("submarina");
		incorrect4.setLayoutX(1000); incorrect4.setLayoutY(300);
		incorrect4.setOnAction (e -> {incorrect4.setStyle("-fx-background-color:#FF2E2E;"); test1.getChildren().add(testcontinue1);
		test1.getChildren().remove(correct1);
		test1.getChildren().remove(incorrect4);
		test1.getChildren().remove(incorrect5);
		test1.getChildren().remove(incorrect6);
		test1.getChildren().add(incorrect4);});

		
		incorrect5.setStyle("-fx-background-color:#305494;");
		incorrect5.setFont(Font.font("Verdana",25));	
		incorrect5.setTextFill(Color.BLACK);
		incorrect5.setText("Oceano");
		incorrect5.setLayoutX(1000);incorrect5.setLayoutY(400);
		incorrect5.setOnAction (e -> {incorrect5.setStyle("-fx-background-color:#FF2E2E;");test1.getChildren().add(testcontinue1);
		test1.getChildren().remove(correct1);
		test1.getChildren().remove(incorrect4);
		test1.getChildren().remove(incorrect5);
		test1.getChildren().remove(incorrect6);
		test1.getChildren().add(incorrect5);});
	
		incorrect6.setStyle("-fx-background-color:#305494;");
		incorrect6.setFont(Font.font("Verdana",25));	
		incorrect6.setTextFill(Color.BLACK);
		incorrect6.setText("bebida");
		incorrect6.setLayoutX(700);incorrect6.setLayoutY(400);
		incorrect6.setOnAction (e -> {incorrect6.setStyle("-fx-background-color:#FF2E2E;");test1.getChildren().add(testcontinue1);
		test1.getChildren().remove(correct1);
		test1.getChildren().remove(incorrect4);
		test1.getChildren().remove(incorrect5);
		test1.getChildren().remove(incorrect6);
		test1.getChildren().add(incorrect6);});
		
		
		incorrect7.setStyle("-fx-background-color:#305494;");
		incorrect7.setFont(Font.font("Verdana",25));
		incorrect7.setTextFill(Color.BLACK);
		incorrect7.setText("Hamburgo");
		incorrect7.setLayoutX(1000); incorrect7.setLayoutY(300);
		incorrect7.setOnAction (e -> {incorrect7.setStyle("-fx-background-color:#FF2E2E;"); test1.getChildren().add(testcontinue2);
		test1.getChildren().remove(correct2);
		test1.getChildren().remove(incorrect7);
		test1.getChildren().remove(incorrect8);
		test1.getChildren().remove(incorrect9);
		test1.getChildren().add(incorrect7);});

		
		incorrect8.setStyle("-fx-background-color:#305494;");
		incorrect8.setFont(Font.font("Verdana",25));	
		incorrect8.setTextFill(Color.BLACK);
		incorrect8.setText("Hamofburgs");
		incorrect8.setLayoutX(700); incorrect8.setLayoutY(300);
		incorrect8.setOnAction (e -> {incorrect8.setStyle("-fx-background-color:#FF2E2E;");test1.getChildren().add(testcontinue2);
		test1.getChildren().remove(correct2);
		test1.getChildren().remove(incorrect7);
		test1.getChildren().remove(incorrect8);
		test1.getChildren().remove(incorrect9);
		test1.getChildren().add(incorrect8);});
	
		incorrect9.setStyle("-fx-background-color:#305494;");
		incorrect9.setFont(Font.font("Verdana",25));	
		incorrect9.setTextFill(Color.BLACK);
		incorrect9.setText("Mcburger");
		incorrect9.setLayoutX(700);incorrect9.setLayoutY(400);
		incorrect9.setOnAction (e -> {incorrect9.setStyle("-fx-background-color:#FF2E2E;");test1.getChildren().add(testcontinue2);
		test1.getChildren().remove(correct2);
		test1.getChildren().remove(incorrect7);
		test1.getChildren().remove(incorrect8);
		test1.getChildren().remove(incorrect9);
		test1.getChildren().add(incorrect9);});
		
		Button test1button = new Button();
		test1button.setText("Start Food Tests!");
		test1button.setLayoutX(450);
		test1button.setLayoutY(300); 
		test1button.setOnAction ( e -> {Window.setScene(test1_screen); Window.setFullScreen(true);
		topic1_txt.setText("Food: Multiple Choice");test1.getChildren().add(topic1_txt);test1.getChildren().add(0,testrectangle);
		test1.getChildren().add(testlogo);test1.getChildren().add(coffeeview);
		test1.getChildren().add(incorrect1);test1.getChildren().add(incorrect2);test1.getChildren().add(incorrect3);test1.getChildren().add(correct);
		});

		testcontinue.setText("Continue");
		testcontinue.setFont(Font.font("Verdana",15));
		testcontinue.setLayoutX(1100);
		testcontinue.setLayoutY(650);
		testcontinue.setTextFill(Color.RED);
		testcontinue.setOnAction(e -> {
		test1.getChildren().remove(coffeeview); test1.getChildren().add(waterview); test1.getChildren().remove(testcontinue);
		test1.getChildren().remove(correct);test1.getChildren().remove(incorrect1);test1.getChildren().remove(incorrect2);test1.getChildren().remove(incorrect3);
		test1.getChildren().add(correct1);test1.getChildren().add(incorrect4);test1.getChildren().add(incorrect5);test1.getChildren().add(incorrect6);;});
		
		testcontinue1.setText("Continue");
		testcontinue1.setFont(Font.font("Verdana",15));
		testcontinue1.setLayoutX(1100);
		testcontinue1.setLayoutY(650);
		testcontinue1.setTextFill(Color.RED);
		testcontinue1.setOnAction(e -> {
		test1.getChildren().remove(waterview); test1.getChildren().add(burgerview); test1.getChildren().remove(testcontinue1);
		test1.getChildren().remove(correct1);test1.getChildren().remove(incorrect4);test1.getChildren().remove(incorrect5);test1.getChildren().remove(incorrect6);
		test1.getChildren().add(correct2);test1.getChildren().add(incorrect7);test1.getChildren().add(incorrect8);test1.getChildren().add(incorrect9);;});
				
		TextField COFFEEinput = new TextField ();
		COFFEEinput.setLayoutX(212);
		COFFEEinput.setLayoutY(350);
		COFFEEinput.setFont(Font.font("Verdana",20));
		TextField WATERinput = new TextField ();
		WATERinput.setLayoutX(590);
		WATERinput.setLayoutY(350);
		WATERinput.setFont(Font.font("Verdana",20));
		TextField BURGERinput = new TextField ();
		BURGERinput.setLayoutX(960);
		BURGERinput.setLayoutY(350);
		BURGERinput.setFont(Font.font("Verdana",20));
		
		Text coffeewaterburger_txt = new Text();
		
		testcontinue2.setText("Continue");
		testcontinue2.setFont(Font.font("Verdana",15));
		testcontinue2.setLayoutX(1100);
		testcontinue2.setLayoutY(650);//
		testcontinue2.setTextFill(Color.RED);
		testcontinue2.setOnAction(e -> {Window.setScene(test1listen_screen);Window.setFullScreen(true);test1.getChildren().remove(topic1_txt);test1.getChildren().remove(testrectangle);test1.getChildren().remove(testlogo);test1listen.getChildren().add(0,testrectangle);test1listen.getChildren().add(testlogo);
		;test1listen.getChildren().add(topic1_txt);topic1_txt.setText("Food: Translate in the box!");test1listen.getChildren().add(coffeewaterburger_txt);
		test1listen.getChildren().add(COFFEEinput);test1listen.getChildren().add(WATERinput);test1listen.getChildren().add(BURGERinput); 
		; ;;});
		
		Button tri_BTN = new Button();
		tri_BTN.setText("Check");
		tri_BTN.setOnAction(e -> {String coffee = COFFEEinput.getText();String water = WATERinput.getText();String burger = BURGERinput.getText();String coffecorrect ="cafe negro";String watercorrect = "agua";String burgercorrect = " hamburguesas";
		if (coffee.equals(coffecorrect)) {testScore.addAndGet(1);
	    } else if (water.equals(watercorrect)) {testScore.addAndGet(1);
	    } else if (burger.equals(burgercorrect)) {testScore.addAndGet(1);
	    } else {testScore.addAndGet(0);}}); 	

		
		Button test2button = new Button();
		test2button.setText("Start Food Tests!");
		test2button.setLayoutX(450);
		test2button.setLayoutY(400);
		test2button.setOnAction ( e -> {
			Window.setScene(test2_screen); Window.setFullScreen(true);
			test2.getChildren().add(0,testrectangle);test2.getChildren().add(testlogo);test1.getChildren().add(testlogo);
			
		});
		topic1_txt.setText("Food");
		topic1_txt.setX(300);
		topic1_txt.setY(90);
		topic1_txt.setFont(Font.font("Verdana",50));	
		
		coffeewaterburger_txt.setText("Black Coffee                       Water                          Burger");
		coffeewaterburger_txt.setX(250);
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
		test2CheckBox.setOnAction ( e ->{ if (test2CheckBox.isSelected()) { screen_tests.getChildren().add(testset2test_txt);screen_tests.getChildren().add(test2button);
	        							} else { screen_tests.getChildren().remove(testset2test_txt);screen_tests.getChildren().remove(test2button);}});	
		
		CheckBox test1CheckBox = new CheckBox();
		test1CheckBox.setLayoutX(450);
		test1CheckBox.setLayoutY(255);
		test1CheckBox.setOnAction ( e ->{ if (test1CheckBox.isSelected()) { testset2test_txt.setY(450); test2CheckBox.setLayoutY(405); screen_tests.getChildren().add(testset1test_txt);testset2_txt.setY(425);test2button.setLayoutY(450);screen_tests.getChildren().add(test1button);;
	        							} else { screen_tests.getChildren().remove(testset1test_txt);testset2test_txt.setY(400);test2CheckBox.setLayoutY(355);testset2_txt.setY(375);screen_tests.getChildren().remove(test1button);test2button.setLayoutY(400);}});
		
		TextField UNinput = new TextField ();
		UNinput.setLayoutX(550);
		UNinput.setLayoutY(350);
		UNinput.setFont(Font.font("Verdana",20));

		PasswordField PWinput = new PasswordField ();
		PWinput.setLayoutX(550);
		PWinput.setLayoutY(500);
		PWinput.setFont(Font.font("Verdana",20));
				
		Button BTN_logout = new Button("log out");
		BTN_logout.setFont(Font.font("Verdana",15));
		BTN_logout.setLayoutX(1100);
		BTN_logout.setLayoutY(650);
		BTN_logout.setTextFill(Color.RED);
		BTN_logout.setOnAction(e -> {Window.setScene(loginscreen); Window.setFullScreen(true);screen_login.getChildren().add(0,baserectangle);});
		//
		Loginbutton BTN_login = new Loginbutton();
		BTN_login.setFont(Font.font("Verdana",20));
		BTN_login.setLayoutX(640);
		BTN_login.setLayoutY(600);
		BTN_login.setTextFill(Color.BLACK);
		BTN_login.setText("Log in");
		BTN_login.setOnAction(e -> {String passText = PWinput.getText();String setStudentPassword = "student";String setTeacherPassword = "teacher";
		if (passText.equals(setStudentPassword)) {Window.setScene(studentScene); Window.setFullScreen(true); screen_tests.getChildren().add(0,baserectangle);UNinput.clear(); PWinput.clear(); screen_login.getChildren().remove(invalid_txt);screen_tests.getChildren().add(BTN_logout);
	    } else if (passText.equals(setTeacherPassword)) {Window.setScene(teacherScene); Window.setFullScreen(true); screen_teacher.getChildren().add(0,baserectangle); UNinput.clear(); PWinput.clear(); screen_login.getChildren().remove(invalid_txt); screen_teacher.getChildren().add(BTN_logout);;
	    } else {screen_login.getChildren().add(invalid_txt);}}); 			

		Button BTN_returnhelp = new Button("return to login");
		BTN_returnhelp.setFont(Font.font("Verdana",15));
		BTN_returnhelp.setLayoutX(1050);
		BTN_returnhelp.setLayoutY(650);
		BTN_returnhelp.setTextFill(Color.BLACK);
		BTN_returnhelp.setOnAction(e -> 
		{Window.setScene(loginscreen);Window.setFullScreen(true);screen_login.getChildren().add(0,baserectangle);screen_accessibility.getChildren().add(BTN_returnhelp);screen_help.getChildren().remove(baserectangle);screen_accessibility.getChildren().remove(baserectangle);});
		
		Button BTN_quit = new Button("X");
		BTN_quit.setTextFill(Color.RED);
		BTN_quit.setStyle("-fx-background-color:#305494;");
		BTN_quit.setOnAction ( e -> {Window.hide();});
		BTN_quit.setFont(Font.font("Verdana",30));
		BTN_quit.setLayoutX(1250);
		BTN_quit.setLayoutY(30);
		
		Button BTN_help = new Button("  help  ");
		BTN_help.setFont(Font.font("Verdana",15));
		BTN_help.setLayoutX(1100);
		BTN_help.setLayoutY(650);
		BTN_help.setTextFill(Color.GREEN);
		BTN_help.setOnAction(e -> {Window.setScene(help); Window.setFullScreen(true);screen_help.getChildren().add(0,baserectangle);screen_accessibility.getChildren().remove(BTN_returnhelp);screen_help.getChildren().add(BTN_returnhelp);});
		
		ImageView helplogo = new ImageView(logo);
		helplogo.setX(550);
		helplogo.setY(250);
		helplogo.setFitWidth(300);
		helplogo.setFitHeight(300);
		
		Button BTN_accessibility = new Button();
		BTN_accessibility.setGraphic(imageview1);
		BTN_accessibility.setStyle("-fx-background-color:#305494;");
		BTN_accessibility.setLayoutX(1100);
		BTN_accessibility.setLayoutY(115);
		BTN_accessibility.setOnAction(e -> {Window.setScene(accessibility); Window.setFullScreen(true);screen_accessibility.getChildren().add(0,baserectangle);screen_accessibility.getChildren().add(BTN_returnhelp);});
		
		Text[] texts = new Text[] 
		{textslider_txt, textbold_txt,invalid_txt,
				helptext_txt,login_txt,accessibility_txt,
				username_txt,password_txt, test_txt,
				testset2test_txt,testset1test_txt, testset1_txt,
				testset2_txt};
		
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
			screen_login.getChildren().add(0,baserectangle);
			screen_login.getChildren().add(login_txt);
			screen_login.getChildren().add(username_txt);
			screen_login.getChildren().add(password_txt);
			screen_login.getChildren().add(imageview);
			screen_login.getChildren().add(UNinput);
			screen_login.getChildren().add(PWinput);
			screen_login.getChildren().add(BTN_help);
			screen_login.getChildren().add(BTN_login);
			screen_login.getChildren().add(BTN_accessibility);
			screen_login.getChildren().add(BTN_quit);
			//student test screen  
			screen_tests.getChildren().add(testset1_txt);
			screen_tests.getChildren().add(testset2_txt);
			screen_tests.getChildren().add(test_txt);
			screen_tests.getChildren().add(test1CheckBox); 
			screen_tests.getChildren().add(test2CheckBox);
			
			//teacher test screen

			//help screen
			screen_help.getChildren().add(helptext_txt);
			screen_help.getChildren().add(helplogo);
			//accessibility screen 
			screen_accessibility.getChildren().add(accessibility_txt);
			screen_accessibility.getChildren().add(textSizeSlider);
			screen_accessibility.getChildren().add(textslider_txt);
			screen_accessibility.getChildren().add(textbold_txt);
			screen_accessibility.getChildren().add(boldCheckBox);
			//sports tests correct

			test1.getChildren().add(correct);

			Window.show();
			Window.setScene(loginscreen);
			Window.setFullScreenExitHint("");
			Window.setFullScreen(true);
			


	}	
}

