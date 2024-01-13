package controller;

import db.DbConnection;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.ZoneId;
import java.util.Date;

public class LoginFormController {
    public AnchorPane context;
    public TextField txtStudentNum;
    public TextField txtFullName;
    public TextField txtDateOfBirth;
    public TextField txtAddress;
    public Button btnImport;

    public void ImportOnAction(ActionEvent actionEvent) {
        Student student = new Student(
                txtStudentNum.getText(),
                txtFullName.getText(),
                txtDateOfBirth.getText(),
                txtAddress.getText()
        );


        try {
            if (saveStudent(student)) {

                new Alert(Alert.AlertType.INFORMATION, "Student saved!").show();
            } else {
                new Alert(Alert.AlertType.WARNING, "Try Again!").show();
            }
        } catch (SQLException | ClassNotFoundException e) {
            new Alert(Alert.AlertType.ERROR, e.toString()).show();
        }
    }



    private boolean saveStudent(Student student) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DbConnection.getInstance().getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO student VALUES(?,?,?,?)");
        preparedStatement.setString(1, student.getStudentNum());
        preparedStatement.setString(2, student.getFullName());
        preparedStatement.setObject(3, student.getDateOfBirth());
        preparedStatement.setString(4, student.getAddress());
        return preparedStatement.executeUpdate() > 0;
    }
}
