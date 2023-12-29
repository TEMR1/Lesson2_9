package models;

import javax.swing.*;

public final class MainModel1 extends BaseModel {
    @Override
    public void execute(JButton button) {
        button.setText("Text 1");
    }
}
