/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

/**
 *
 * @author fgailly
 */
public class HappyFaceFXColor extends Application {
  
  public static final int DIAMETER_GEZICHT = 200;
  public static final int X_GEZICHT = 100;
  public static final int Y_GEZICHT = 50;
  
  public static final int BREEDTE_OOG = 10;
  public static final int LENGTE_OOG = 20;
  public static final int X_RECHTEROOG = 155;
  public static final int Y_RECHTEROOG = 100;
  public static final int X_LINKEROOG = 230;
  public static final int Y_LINKEROOG = Y_RECHTEROOG;

  public static final int NEUS_DIAMETER = 10;
  public static final int X_NEUS = 195;
  public static final int Y_NEUS = 135;
  
  public static final int BREEDTE_MOND = 100;
  public static final int LENGTE_MOND = 50;
  public static final int X_MOND = 150;
  public static final int Y_MOND = 160;
  public static final int START_HOEK_MOND = 180;
  public static final int EIND_HOEK_MOND = 180;


  @Override
  public void start(Stage stage) throws Exception {
    Group root =new Group();
    Scene scene = new Scene(root);
    Canvas canvas = new Canvas(400, 300);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    gc.setFill(Color.YELLOW);
    gc.fillOval(X_GEZICHT, Y_GEZICHT, DIAMETER_GEZICHT, DIAMETER_GEZICHT);
    gc.setFill(Color.BLACK);
    gc.fillOval(X_RECHTEROOG, Y_RECHTEROOG, BREEDTE_OOG, LENGTE_OOG);
    gc.fillOval(X_LINKEROOG, Y_LINKEROOG, BREEDTE_OOG, LENGTE_OOG);
    gc.setStroke(Color.RED);
    gc.strokeArc(X_MOND, Y_MOND, BREEDTE_MOND, LENGTE_MOND, START_HOEK_MOND, EIND_HOEK_MOND, ArcType.OPEN);

    root.getChildren().add(canvas);
    stage.setTitle("HappyFace in JavaFX");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
