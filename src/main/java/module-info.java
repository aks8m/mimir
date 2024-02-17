module cloud.sills.mimir.app {
    requires javafx.controls;
    requires javafx.fxml;
    exports cloud.sills.mimir;

    opens cloud.sills.mimir to javafx.fxml;
}
