package com.yci.rps;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

public class RPSController implements Initializable {

    @FXML
    private Label lblComputerState;
    @FXML
    private Label lblScore;
    @FXML
    private Label lblUserState;
    @FXML
    private Label lblGameState;

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSOR = "Scissor";
    private int userScore = 0;

    String[] gameItems = {ROCK, PAPER, SCISSOR};

    @FXML
    void onPaperTap() {
        String userSelected = PAPER;
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 3);
        String computerSelected = gameItems[randomIndex];
        decideGameResult(userSelected, computerSelected);
    }

    @FXML
    void onRockTap() {
        String userSelected = ROCK;
        int randomIndex = ThreadLocalRandom.current().nextInt(0, 3);
        String computerSelected = gameItems[randomIndex];
        decideGameResult(userSelected, computerSelected);
    }

    @FXML
    void onScissorTap() {
        System.out.println("On Scissor tap");
        lblComputerState.setText("Scissor");
        lblUserState.setText("Scissor");
        lblGameState.setText("=");
        lblScore.setText("10");
    }

    @FXML
    void onResetTap() {
        System.out.println("");
    }

    private void decideGameResult(String user, String computer) {
        if (user == ROCK && computer == ROCK) {
            System.out.println("Tie");
        } else if (user == PAPER && computer == ROCK) {

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
