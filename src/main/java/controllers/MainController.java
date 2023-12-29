package controllers;

import models.BaseModel;
import models.MainModel1;
import models.MainModel2;
import views.MainScreen;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class MainController extends BaseController {
    private BaseModel model;

    public MainController() {
        screen = new MainScreen(this);
        model = new MainModel1();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object object = e.getSource();
        if (object instanceof JButton button) {

            model.execute(button);

            if (model instanceof MainModel1)
                model = new MainModel2();
            else if (model instanceof MainModel2)
                model = new MainModel1();


        }
    }
}
