// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.io.*;

// public class TextEditor extends JFrame {
//     private JTextArea textArea;
//     private JFileChooser fileChooser;

//     public TextEditor() {
//         // Set up the main frame
//         setTitle("Java Text Editor"); // Fixed: Title should be enclosed in quotes
//         setSize(800, 600);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // Create components
//         textArea = new JTextArea();
//         JScrollPane scrollPane = new JScrollPane(textArea);
//         fileChooser = new JFileChooser();

//         // Create menus
//         JMenuBar menuBar = new JMenuBar();
//         JMenu fileMenu = new JMenu("File"); // Fixed: Menu names should be enclosed in quotes
//         JMenu editMenu = new JMenu("Edit"); // Fixed: Menu names should be enclosed in quotes

//         // File menu items
//         JMenuItem openMenuItem = new JMenuItem("Open"); // Fixed: Menu item names should be enclosed in quotes
//         JMenuItem saveMenuItem = new JMenuItem("Save"); // Fixed: Menu item names should be enclosed in quotes
//         JMenuItem saveAsMenuItem = new JMenuItem("Save As"); // Fixed: Menu item names should be enclosed in quotes
//         JMenuItem exitMenuItem = new JMenuItem("Exit"); // Fixed: Menu item names should be enclosed in quotes

//         // Edit menu items
//         JMenuItem cutMenuItem = new JMenuItem("Cut"); // Fixed: Menu item names should be enclosed in quotes
//         JMenuItem copyMenuItem = new JMenuItem("Copy"); // Fixed: Menu item names should be enclosed in quotes
//         JMenuItem pasteMenuItem = new JMenuItem("Paste"); // Fixed: Menu item names should be enclosed in quotes

//         // Add components to menus
//         fileMenu.add(openMenuItem);
//         fileMenu.add(saveMenuItem);
//         fileMenu.add(saveAsMenuItem);
//         fileMenu.addSeparator();
//         fileMenu.add(exitMenuItem);

//         editMenu.add(cutMenuItem);
//         editMenu.add(copyMenuItem);
//         editMenu.add(pasteMenuItem);

//         // Add menus to the menu bar
//         menuBar.add(fileMenu);
//         menuBar.add(editMenu);

//         // Add action listeners
//         openMenuItem.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 openFile();
//             }
//         });

//         saveMenuItem.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 saveFile();
//             }
//         });

//         saveAsMenuItem.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 saveFileAs();
//             }
//         });

//         exitMenuItem.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 System.exit(0);
//             }
//         });

//         cutMenuItem.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 textArea.cut();
//             }
//         });

//         copyMenuItem.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 textArea.copy();
//             }
//         });

//         pasteMenuItem.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 textArea.paste();
//             }
//         });

//         // Set up layout
//         setLayout(new BorderLayout());
//         add(scrollPane, BorderLayout.CENTER);

//         // Set up the frame
//         setJMenuBar(menuBar);
//         setVisible(true);
//     }

//     private void openFile() {
//         int result = fileChooser.showOpenDialog(this);
//         if (result == JFileChooser.APPROVE_OPTION) {
//             File selectedFile = fileChooser.getSelectedFile();
//             try {
//                 BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
//                 textArea.read(reader, null);
//                 reader.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     private void saveFile() {
//         int result = fileChooser.showSaveDialog(this);
//         if (result == JFileChooser.APPROVE_OPTION) {
//             File selectedFile = fileChooser.getSelectedFile();
//             try {
//                 BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
//                 textArea.write(writer);
//                 writer.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     private void saveFileAs() {
//         int result = fileChooser.showSaveDialog(this);
//         if (result == JFileChooser.APPROVE_OPTION) {
//             File selectedFile = fileChooser.getSelectedFile();
//             try {
//                 BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));
//                 textArea.write(writer);
//                 writer.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 new TextEditor();
//             }
//         });
//     }
// }
