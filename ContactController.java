package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import sample.datamodel.Contact;

public class ContactController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField eMailField;

    public Contact getNewContact(){
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String eMail = eMailField.getText();

        //create objects and pass fields
        return new Contact(firstName, lastName, phoneNumber, eMail);
    }

    public void editContact(Contact contact){
        firstNameField.setText(contact.getFirstName());
        lastNameField.setText(contact.getLastName());
        phoneNumberField.setText(contact.getPhoneNumber());
        eMailField.setText(contact.geteMail());
    }

    public void updateContact(Contact contact){
        contact.setFirstName(firstNameField.getText());
        contact.setLastName(lastNameField.getText());
        contact.setPhoneNumber(phoneNumberField.getText());
        contact.seteMail(eMailField.getText());
    }

}
