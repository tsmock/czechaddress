package org.openstreetmap.josm.plugins.czechaddress;


import javax.swing.JPanel;
import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.gui.preferences.PreferenceDialog;
import org.openstreetmap.josm.gui.preferences.PreferenceSetting;
/**
 *
 * @author radek
 */
public class Preferences extends javax.swing.JPanel implements PreferenceSetting {

    public int optimize;

    private String KEY_OPTIMIZE = "czechaddress.opzimize";

    public boolean addNewTag;
    public String addNewTagKey;
    public String addNewTagValue;

    private String KEY_ADDNEWTAG = "czechaddress.newtag";
    private String KEY_ADDNEWTAGKEY = "czechaddress.newtagkey";
    private String KEY_ADDNEWTAGVALUE = "czechaddress.newtagvalue";

    private static Preferences singleton = null;
    public static Preferences getInstance() {
        if (singleton == null)
            singleton = new Preferences();
        return singleton;
    }

    /** Creates new form Preferences */
    private Preferences() {
        initComponents();
        addNewTag = Main.pref.getBoolean(KEY_ADDNEWTAG, addNewTagCheckBox.isSelected());
        addNewTagKey = Main.pref.get(KEY_ADDNEWTAGKEY, addNewTagKeyField.getText());
        addNewTagValue = Main.pref.get(KEY_ADDNEWTAGVALUE, addNewTagValueField.getText());
        optimize = Main.pref.getInteger(KEY_OPTIMIZE, optimizeComboBox.getSelectedIndex());
    }

    public void reloadSettings() {
        addNewTagCheckBox.setSelected(addNewTag);
        addNewTagKeyField.setText(addNewTagKey);
        addNewTagValueField.setText(addNewTagValue);

        optimizeComboBox.setSelectedIndex(optimizeComboBox.getSelectedIndex());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        addNewTagCheckBox = new javax.swing.JCheckBox();
        addNewTagKeyField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addNewTagValueField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        optimizeComboBox = new javax.swing.JComboBox();

        setLayout(new java.awt.GridLayout(1, 0));

        addNewTagCheckBox.setText("Přidávat následující tag při vytváření adresního bodu");
        addNewTagCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                addNewTagChanged(evt);
            }
        });
        addNewTagCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewTagCheckBoxActionPerformed(evt);
            }
        });

        addNewTagKeyField.setText("source:position");
        addNewTagKeyField.setEnabled(false);

        jLabel1.setText("=");

        addNewTagValueField.setText("cuzk:km");
        addNewTagValueField.setEnabled(false);

        jLabel2.setText("Optimalizovat algoritmus přiřazování:");

        optimizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pro rychlejší odezvu", "menší spotřebu paměti" }));
        optimizeComboBox.setSelectedIndex(1);
        optimizeComboBox.setEnabled(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(optimizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(addNewTagCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(addNewTagKeyField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addNewTagValueField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optimizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addNewTagCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewTagKeyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(addNewTagValueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        add(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void addNewTagChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_addNewTagChanged
        addNewTagKeyField.setEnabled(addNewTagCheckBox.isSelected());
        addNewTagValueField.setEnabled(addNewTagCheckBox.isSelected());
    }//GEN-LAST:event_addNewTagChanged

    private void addNewTagCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewTagCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNewTagCheckBoxActionPerformed

    public void addGui(PreferenceDialog gui) {
        JPanel p = gui.createPreferenceTab("czech_flag",
                "Nastavení CzechAddressPlugin",
                "Nastavení pluginu pro úpravu a zadávání adres na území ČR.");
        p.add(mainPanel);
        reloadSettings();
    }

    public boolean ok() {
        addNewTag = addNewTagCheckBox.isSelected();
        Main.pref.put(KEY_ADDNEWTAG, addNewTag);

        addNewTagKey = addNewTagKeyField.getText();
        Main.pref.put(KEY_ADDNEWTAGKEY, addNewTagKey);

        addNewTagValue = addNewTagValueField.getText();
        Main.pref.put(KEY_ADDNEWTAGVALUE, addNewTagValue);

        optimize = optimizeComboBox.getSelectedIndex();
        Main.pref.putInteger(KEY_OPTIMIZE, optimize);

        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addNewTagCheckBox;
    private javax.swing.JTextField addNewTagKeyField;
    private javax.swing.JTextField addNewTagValueField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JComboBox optimizeComboBox;
    // End of variables declaration//GEN-END:variables

}
