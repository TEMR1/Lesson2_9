package models;

import views.BaseScreen;

public final class MainModel2 extends BaseModel{
    public MainModel2(BaseScreen screen) {
        super(screen);
    }

    @Override
    public void execute() {
        screen.setName("MainModel1");
    }
}
