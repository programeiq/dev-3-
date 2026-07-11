package com.example.demo_new;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Launcher extends Application {
    @Override
    public void start(Stage stage) {
        // 🌐 Javaの中にブラウザのパーツを作成！
        WebView webView = new WebView();

        // 🚀 RailwayのURL、またはローカルのindex.htmlを読み込む！
        webView.getEngine().load("https://demonew-production.up.railway.app");
        // ※手元のファイルを読み込むなら： webView.getEngine().load(getClass().getResource("/index.html").toExternalForm());

        // 📺 画面の大きさを設定して表示！
        Scene scene = new Scene(webView, 960, 600);
        stage.setTitle("SPEED DEBATE - Web Edition");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}