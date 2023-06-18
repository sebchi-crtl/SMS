package controller;

import entity.students;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {


    @FXML
    private TableView<?> table_users;

    @FXML
    private TableColumn<?, Integer> col_id;

    @FXML
    private TableColumn<students, String> col_first;

    @FXML
    private TableColumn<students, String> col_last;

    @FXML
    private TableColumn<students, String> col_class;

    @FXML
    private TableColumn<students, String> col_school;

//    @FXML
//    private TextField txt_username;
//
//    @FXML
//    private TextField txt_password;
//
//    @FXML
//    private TextField txt_email;
//
//    @FXML
//    private TextField txt_type;
//
//    @FXML
//    private TextField txt_id;
//
//    @FXML
//    private TextField filterField;
}
