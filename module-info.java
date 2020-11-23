module MyContacts {
 requires javafx.controls;
 requires javafx.fxml;
 requires javafx.web;
 requires java.desktop;
 requires java.xml;

 opens sample.datamodel;

 opens sample;
}