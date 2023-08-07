module com.example.javafx {
    requires org.apache.httpcomponents.client5.httpclient5;
    requires com.google.gson;
    requires java.desktop;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx.pars to com.google.gson;
    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
    opens com.example.javafx.pars.pojo to com.google.gson;
}
