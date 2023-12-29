package models;

import javax.swing.*;

public final class MainModel2 extends BaseModel{
    @Override
    public void execute(JButton button) {
        button.setText("Text 2");
    }
}
