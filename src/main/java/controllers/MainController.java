package controllers;

import models.MainModel1;
import views.MainScreen;
import java.awt.event.MouseEvent;

public class MainController extends BaseController {
    private final MainModel1 model;

    public MainController() {
        screen = new MainScreen(this);
        model = new MainModel1(screen);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        model.execute();
        // ..........
    }
}
