module com.yci.rps {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.yci.rps to javafx.fxml;
    exports com.yci.rps;
}