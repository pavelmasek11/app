package com.example.application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
public class ItemsController {

    @FXML
    private TextField Nazev;

    @FXML
    private TextField incomeGoal;

    @FXML
    private TextField incomeSaved;
    @FXML
    private Text successText;
    private TableView<Item> tableView;

    public void setTableView(TableView<Item> tableView) {
        this.tableView = tableView;
    }
    private MujModel model;
    public void setMujModel(MujModel model) {
        this.model = model;
    }

    @FXML
    public void handlePridatZaznam(ActionEvent event) {
        String nazev = Nazev.getText();
        double celkova_castka = Double.parseDouble(incomeGoal.getText());
        double nasetrena_castka = Double.parseDouble(incomeSaved.getText());

        model.pridejZaznam(nazev, celkova_castka, nasetrena_castka);
        successText.setVisible(true);
    }



}







