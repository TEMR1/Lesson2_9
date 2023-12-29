package views;

import controllers.BaseController;
import javax.swing.*;

public final class MainScreen extends BaseScreen {
    private JButton button;

    public MainScreen(BaseController controller) {
        super(controller);
    }

    @Override
    protected void initComponents() {
        setLayout(null);
        button = new JButton();
        button.setText("Text");
        button.setBounds(100, 100, 200, 100);
        button.addMouseListener(controller);
        add(button);
    }
}
