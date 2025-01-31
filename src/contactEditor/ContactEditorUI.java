package contactEditor;

import java.awt.Color;
import java.io.IOException;
import shapes.*;

/**
 *
 * @author Owner
 */
public class ContactEditorUI extends javax.swing.JFrame {

    private Color color;
    private String shape; // "Circle", "Square", "Triangle", "Diamond"
    private javax.swing.JButton colorButton;
    private javax.swing.JColorChooser colorChooser;
    private DrawPanel drawPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser openFileChooser;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton resetButton;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JFileChooser saveFileChooser;
    private javax.swing.JComboBox<String> shapeComboBox;
    private javax.swing.JSlider sizeSlider;
    private javax.swing.JSpinner sizeSpinner;

    /**
     * Creates new form ContactEditorUI
     */
    public ContactEditorUI() {
        initComponents();
        color = Color.BLACK;
        shape = "Circle";
    }

    private void initComponents() {
        colorChooser = new javax.swing.JColorChooser();
        saveFileChooser = new javax.swing.JFileChooser();
        openFileChooser = new javax.swing.JFileChooser();
        drawPanel = new DrawPanel();
        jPanel1 = new javax.swing.JPanel();
        sizeSpinner = new javax.swing.JSpinner();
        sizeSlider = new javax.swing.JSlider();
        shapeComboBox = new javax.swing.JComboBox<>();
        colorButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveAsMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();

        saveFileChooser.setFileFilter(null);
        saveFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileChooserActionPerformed(evt);
            }
        });

        openFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drawPanel.setBackground(new java.awt.Color(255, 255, 255));
        drawPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawPanelMouseDragged(evt);
            }
        });
        drawPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drawPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        sizeSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 1, 100, 1));
        sizeSpinner.setToolTipText("");
        sizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeSpinnerStateChanged(evt);
            }
        });

        sizeSlider.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        sizeSlider.setMinimum(1);
        sizeSlider.setValue(10);
        sizeSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sizeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeSliderStateChanged(evt);
            }
        });

        shapeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Circle", "Square", "Triangle", "Diamond" }));
        shapeComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                shapeComboBoxItemStateChanged(evt);
            }
        });

        colorButton.setBackground(new java.awt.Color(0, 0, 0));
        colorButton.setText("Color");
        colorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorButtonMouseClicked(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.setToolTipText("");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(sizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resetButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shapeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(colorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton))
                    .addComponent(sizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        saveAsMenuItem.setText("Save As");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveAsMenuItem);

        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(drawPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drawPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    // Changes size of brush when slider is moved
    private void sizeSliderStateChanged(javax.swing.event.ChangeEvent evt) {
        sizeSpinner.setValue(sizeSlider.getValue());
    }

    // Changes size of brush when spinner is changed
    private void sizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {
        sizeSlider.setValue((Integer)sizeSpinner.getValue());
    }

    // If the color menu button is clicked, the color selector opens
    private void colorButtonMouseClicked(java.awt.event.MouseEvent evt) {
        this.color = colorChooser.showDialog(null, "Colors", this.color);
        colorButton.setBackground(this.color.darker());
    }

    // When the mouse is clicked on the draw panel, draws the selected shape
    private void drawPanelMouseClicked(java.awt.event.MouseEvent evt) {
        this.addShape(evt);
        drawPanel.repaint();
    }

    // If the reset button is clicked, then the drawing panel is reset
    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {
        drawPanel.reset();
        drawPanel.repaint();
    }

    // Draws the selected shape wherever the mouse is clicked and drawn
    private void drawPanelMouseDragged(java.awt.event.MouseEvent evt) {
        this.addShape(evt);
        drawPanel.repaint();
    }

    // Adds the selected shape to the drawing canvas
    void addShape(java.awt.event.MouseEvent evt) {
        if(shape.equals("Circle"))
            drawPanel.addShape(new Circle(evt.getX(), evt.getY(), color, this.sizeSlider.getValue()));
        else if(shape.equals("Square"))
            drawPanel.addShape(new Square(evt.getX(), evt.getY(), color, this.sizeSlider.getValue()));
        else if(shape.equals("Triangle"))
            drawPanel.addShape(new Triangle(evt.getX(), evt.getY(), color, this.sizeSlider.getValue()));
        else if(shape.equals("Diamond"))
            drawPanel.addShape(new Diamond(evt.getX(), evt.getY(), color, this.sizeSlider.getValue()));
        else
            drawPanel.addShape(new Circle(evt.getX(), evt.getY(), Color.RED, this.sizeSlider.getValue()));
    }
    
    // Changes the selected shape based on the shape selected in the combo box
    private void shapeComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {
        this.shape = (String)shapeComboBox.getSelectedItem();
    }

    // Opens the save menu if the save button is clicked in the drop down menu
    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        this.saveFileChooser.showSaveDialog(new javax.swing.JPanel());
    }

    // Saves the current picture under the path made in the pop up save menu
    private void saveFileChooserActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            drawPanel.save(saveFileChooser.getSelectedFile().getPath());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    // Opens the picture with the entered path from the pop up menu
    private void openFileChooserActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            drawPanel.loadImage(openFileChooser.getSelectedFile());
            drawPanel.repaint();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    // Opens the menu if the "open" button is clicked in the drop down menu
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        openFileChooser.showOpenDialog(new javax.swing.JPanel());
    }

    public static void main(String args[]) {
        // sets Nimbus look and feel.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    System.out.println(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContactEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactEditorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // create and display drawing menu
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactEditorUI().setVisible(true);
            }
        });
    }
}
