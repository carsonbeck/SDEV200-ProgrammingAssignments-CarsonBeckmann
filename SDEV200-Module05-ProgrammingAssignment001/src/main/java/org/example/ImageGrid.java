package org.example;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Objects;

public class ImageGrid extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        ImageView flag1 = createImageView("/flag1.gif", 412, 217);
        ImageView flag2 = createImageView("/flag2.gif", 434, 217);
        ImageView flag6 = createImageView("/flag6.gif", 145, 96);
        ImageView flag7 = createImageView("/flag7.gif", 362, 217);

        gridPane.add(flag1, 0, 0);
        gridPane.add(flag2, 1, 0);
        gridPane.add(flag6, 0, 1);
        gridPane.add(flag7, 1, 1);

        Scene scene = new Scene(gridPane, 900, 400);
        primaryStage.setTitle("FLag Images Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ImageView createImageView(String filename, int originalWidth, int originalHeight) {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/" + filename)));
        ImageView imageView = new ImageView(image);
        double scaleFactor = 0.5;
        imageView.setFitWidth(originalWidth * scaleFactor);
        imageView.setFitHeight(originalHeight * scaleFactor);
        imageView.setPreserveRatio(true);

        return imageView;
    }

    public static void main(String[] args) {
        Application.launch(ImageGrid.class, args);
        launch(args);
    }
}