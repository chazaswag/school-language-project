package application;
import java.nio.file.Paths;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Images {
  Image coffeeimg;
  ImageView coffeeviewer;
  Image burgerimg;
  ImageView burgerviewer;
  Image waterimg;
  ImageView waterviewer;
  Image sportlogo;
  ImageView sportslogoviewer;
  Image foodlogo;
  ImageView foodslogo;
  Image rdald;
  ImageView readaloud_viewer;

  public Images() {
    coffeeimg = new Image(Paths.get("src/img/testresources/sugar.jpg").toUri().toString());
    coffeeviewer = new ImageView(coffeeimg);
    coffeeviewer.setX(100); coffeeviewer.setY(275);
    coffeeviewer.setFitWidth(400);coffeeviewer.setFitHeight(300);

    burgerimg = new Image(Paths.get("src/img/testresources/pepper.png").toUri().toString());
    burgerviewer = new ImageView(burgerimg);
    burgerviewer.setX(100); burgerviewer.setY(275);
    burgerviewer.setFitWidth(400);burgerviewer.setFitHeight(300);

    waterimg = new Image(Paths.get("src/img/testresources/salt.jpg").toUri().toString());
    waterviewer = new ImageView(waterimg);
    waterviewer.setX(100); waterviewer.setY(275);
    waterviewer.setFitWidth(400);waterviewer.setFitHeight(300);

    sportlogo = new Image(Paths.get("src/img/testresources/sportlogo.png").toUri().toString());
    sportslogoviewer = new ImageView(sportlogo);
    sportslogoviewer.setFitWidth(70);sportslogoviewer.setFitHeight(70);
    sportslogoviewer.setLayoutX(170);sportslogoviewer.setLayoutY(375);

    foodlogo = new Image(Paths.get("src/img/testresources/foodlogo.png").toUri().toString());
    foodslogo = new ImageView(foodlogo);
    foodslogo.setFitWidth(100);foodslogo.setFitHeight(100);
    foodslogo.setLayoutX(150);foodslogo.setLayoutY(260);
    
    rdald = new Image(Paths.get("src/img/testresources/readaloudimg.png").toUri().toString());
	readaloud_viewer = new ImageView(rdald);
	readaloud_viewer.setFitWidth(75);
	readaloud_viewer.setFitHeight(75);
  }
}
