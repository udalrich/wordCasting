package wordcasting.gui;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Gui {
  private final JFrame frame;

  public Gui() throws IOException {
    frame = new JFrame("Wordcasting");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(new JScrollPane(new JTable(new WordCastingTableModel())));
  }

  public void show() {
    frame.pack();
    frame.setVisible(true);
  }
}
