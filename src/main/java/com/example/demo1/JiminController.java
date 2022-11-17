package com.example.demo1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class JiminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login;

    @FXML
    private TextField pass;

    @FXML
    private Button OK;

    @FXML
    private TextField name;

    @FXML
    private TextField surname;

    @FXML
    private TextField Country;
    @FXML
    void initialize() {
        OK.setOnAction(clik -> {
            OK.setText("Спасибо за регистрацию ");
            System.out.println("Логин: " + login.getText());
            System.out.println("Пароль: " + pass.getText());
            System.out.println("Фамилия: " + surname.getText());
            System.out.println("Имя: " + name.getText());
            System.out.println("Страна: " + Country.getText());
            OK.getScene().getWindow().hide();
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("Add.fxml"));
                loader.load();
                Object root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene((Parent) root));
                stage.show();
            } catch (Exception e) {
                e.printStackTrace();
            }

                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BadRabbit\\IdeaProjects\\demo1\\src\\main\\resources\\Login.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(login.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Add.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный логин");
                        }else {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Date.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Данные введены некорректно");
                        }
                    }
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BadRabbit\\IdeaProjects\\demo1\\src\\main\\resources\\pass.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(pass.getText().trim())) {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Add.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Верный пароль");
                        }else {
                            try {
                                FXMLLoader loader = new FXMLLoader();
                                loader.setLocation(getClass().getResource("Date.fxml"));
                                loader.load();
                                Parent root = loader.getRoot();
                                Stage stage = new Stage();
                                stage.setScene(new Scene(root));
                                stage.show();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            System.out.println("Данные введены некорректно");
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }