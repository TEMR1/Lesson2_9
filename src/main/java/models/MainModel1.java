package models;

import views.BaseScreen;

public final class MainModel1 extends BaseModel {

    public MainModel1(BaseScreen screen) {
        super(screen);
    }

    @Override
    public void execute() {
        screen.setName("MainModel2");
    }
}
