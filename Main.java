import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new HBox(10);
        pane.setPadding(new Insets(5, 5, 5, 5));
        Image image1 = new Image("images/flag1.gif");
        Image image2 = new Image("images/flag2.gif");
        Image image3 = new Image("images/flag3.gif");
        Image image4 = new Image("images/flag4.gif");
        pane.getChildren().add(new ImageView(image1));
        pane.getChildren().add(ImageView(image2));
        pane.getChildren().add(ImageView(image3));
        pane.getChildren().add(ImageView(image4));
    }

    public static void main(String[] args){
        Application.launch(args);
    }
    
}
