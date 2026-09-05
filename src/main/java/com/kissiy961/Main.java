package com.kissiy961;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // 「こんにちは！」を表示する場所
        Label message = new Label();

        // ボタン
        Button button = new Button("クリック");

        // ボタンを押したときの処理
        button.setOnAction(event -> {
            message.setText("こんにちは！");
        });

        // ボタンとメッセージを縦に並べる
        VBox root = new VBox(20);
        root.getChildren().addAll(button, message);

        // ウィンドウ
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("テスト");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
