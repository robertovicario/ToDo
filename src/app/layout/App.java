package app.layout;

import javax.swing.*;
import javax.swing.Box.Filler;

import java.awt.*;

/**
 * The App class represents the application GUI.
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class App extends JFrame {
    private final JTextField jTextField1 = new JTextField();
    private final JCheckBox jCheckBox1 = new JCheckBox("ToDo");
    private final JCheckBox jCheckBox2 = new JCheckBox("Completed");
    private final JCheckBox jCheckBox3 = new JCheckBox("Marked");
    private final JCheckBox jCheckBox4 = new JCheckBox("Private");
    private final JRadioButton jRadioButton1 = new JRadioButton("ASC");
    private final JRadioButton jRadioButton2 = new JRadioButton("DESC");
    private final JComboBox<String> jComboBox1 = new JComboBox<>();
    private final JComboBox<String> jComboBox2 = new JComboBox<>();
    private final JSpinner jSpinner1 = new JSpinner();
    private final JSpinner jSpinner2 = new JSpinner();
    private final JButton jButton1 = new JButton("Open");
    private final JButton jButton2 = new JButton("Insert");
    private final JButton jButton3 = new JButton("Update");
    private final JButton jButton4 = new JButton("Remove");
    private final JButton jButton5 = new JButton("Print");
    private final JTable jTable1 = new JTable();

    /**
     * Constructs a new instance of the App class.
     */
    public App() {
        initComponents();
        initEvents();
    }

    /**
     * Initializes the components of the calculator GUI.
     */
    public void initComponents() {
        JPanel jPanel1 = new JPanel();
        JToolBar jToolBar1 = new JToolBar();
        JLabel jLabel1 = new JLabel("Search:");
        Filler filler1 = new Box.Filler(new Dimension(12, 0), new Dimension(12, 0), new Dimension(12, 32767));
        JToolBar jToolBar2 = new JToolBar();
        Filler filler2 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        Filler filler3 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        JLabel jLabel2 = new JLabel("Priority:");
        Filler filler4 = new Box.Filler(new Dimension(12, 0), new Dimension(12, 0), new Dimension(12, 32767));
        Filler filler5 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        JLabel jLabel3 = new JLabel("Tag:");
        Filler filler6 = new Box.Filler(new Dimension(12, 0), new Dimension(12, 0), new Dimension(12, 32767));
        JToolBar jToolBar3 = new JToolBar();
        JLabel jLabel4 = new JLabel("Date:");
        Filler filler7 = new Box.Filler(new Dimension(12, 0), new Dimension(12, 0), new Dimension(12, 32767));
        JSeparator jSeparator1 = new JSeparator();
        JToolBar jToolBar4 = new JToolBar();
        JLabel jLabel6 = new JLabel("Results:");
        Filler filler8 = new Box.Filler(new Dimension(12, 0), new Dimension(12, 0), new Dimension(12, 32767));
        Filler filler9 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        Filler filler10 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        JScrollPane jScrollPane1 = new JScrollPane();
        
        // TOOLBAR 1
        jToolBar1.setRollover(true);
        jToolBar1.add(jLabel1);
        jToolBar1.add(filler1);
        jToolBar1.add(jTextField1);

        // TOOLBAR 2
        jToolBar2.setRollover(true);
        jToolBar2.add(jCheckBox1);
        jToolBar2.add(jCheckBox2);
        jToolBar2.add(jCheckBox3);
        jToolBar2.add(jCheckBox4);
        jToolBar2.add(filler2);
        jToolBar2.add(jRadioButton1);
        jToolBar2.add(jRadioButton2);
        jToolBar2.add(filler3);
        jToolBar2.add(jLabel2);
        jToolBar2.add(filler4);
        jToolBar2.add(jComboBox1);
        jToolBar2.add(filler5);
        jToolBar2.add(jLabel3);
        jToolBar2.add(filler6);
        jToolBar2.add(jComboBox2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);

        jRadioButton2.setSelected(true);

        initComboBox();

        // TOOLBAR 3
        jToolBar3.setRollover(true);
        jToolBar3.add(jLabel4);
        jToolBar3.add(filler7);
        jToolBar3.add(jSpinner2);

        jSpinner2.setModel(new SpinnerDateModel(new java.util.Date(), new java.util.Date(-2208992400000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        // TOOLBAR 4
        jToolBar4.setRollover(true);
        jToolBar4.add(jLabel6);
        jToolBar4.add(filler8);
        jToolBar4.add(jSpinner1);
        jToolBar4.add(filler9);
        jToolBar4.add(jButton1);
        jToolBar4.add(jButton2);
        jToolBar4.add(jButton3);
        jToolBar4.add(jButton4);
        jToolBar4.add(filler10);
        jToolBar4.add(jButton5);

        jSpinner1.setModel(new SpinnerNumberModel(50, null, null, 1));

        jScrollPane1.setViewportView(jTable1);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addComponent(jToolBar4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setTitle("ToDo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(700, 525));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * 
     */
    public void initComboBox() {
        // COMBOBOX 1
        String[] items = {"0", "1", "2", "3", "4", "5"};

        for (String item : items) {
            jComboBox1.addItem(item);
        }

        // COMBOBOX 2
    }

    /**
     * Initializes the event handlers for the application components.
     */
    public void initEvents() {

    }
}
