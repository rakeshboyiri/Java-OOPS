import java.awt.*;
import java.awt.event.*;

public class MenuExample {
    private Frame frame;
    private MenuBar menuBar;
    private Menu fileMenu;
    private MenuItem newItem, openItem, saveItem, exitItem;

    public MenuExample() {
        frame = new Frame("Menu Example");
        menuBar = new MenuBar();
        fileMenu = new Menu("File");

        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        frame.setMenuBar(menuBar);

        // Add action listener for the Exit menu item
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
