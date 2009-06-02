package org.openstreetmap.josm.plugins.czechaddress.gui;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.gui.ExtendedDialog;
import org.openstreetmap.josm.plugins.czechaddress.CzechAddressPlugin;
import org.openstreetmap.josm.plugins.czechaddress.addressdatabase.Database;
import org.openstreetmap.josm.plugins.czechaddress.addressdatabase.House;
import org.openstreetmap.josm.plugins.czechaddress.addressdatabase.Region;
import org.openstreetmap.josm.plugins.czechaddress.addressdatabase.Street;
import org.openstreetmap.josm.plugins.czechaddress.addressdatabase.Suburb;
import org.openstreetmap.josm.plugins.czechaddress.addressdatabase.ViToCi;

public class Inspector extends ExtendedDialog {

    /** Creates new form Inspector */
    public Inspector() {
        super(Main.parent, "Inspektor databáze", new String[] {}, true);
        initComponents();

        //tree.setModel(new Model());
        tree.setCellRenderer(new UniversalTreeRenderer());

        // And finalize initializing the form.
        setupDialog(mainPanel, new String[] {});
    }

    /*private class Model extends HalfCookedTreeModel {

        @Override
        public Object getRoot() {
            return CzechAddressPlugin.database;
        }

        public Object getChild(Object parent, int index) {

            if (parent instanceof House)
                return null;

            if (parent instanceof Street)
                return ((Street) parent).getHouses().get(index);

            if (parent instanceof Suburb) {
                Suburb suburb = (Suburb) parent;

                if (index< suburb.getHouses().size())
                    return suburb.getHouses().get(index);
                else
                    index -= suburb.getHouses().size();

                if (index< suburb.getStreets().size())
                    return suburb.getStreets().get(index);
                else
                    return null;
            }

            if (parent instanceof ViToCi) {
                ViToCi vitoci = (ViToCi) parent;

                if (index< vitoci.getHouses().size())
                    return vitoci.getHouses().get(index);
                else
                    index -= vitoci.getHouses().size();

                if (index< vitoci.getStreets().size())
                    return vitoci.getStreets().get(index);
                else
                    index -= vitoci.getStreets().size();

                if (index< vitoci.getSuburbs().size())
                    return vitoci.getSuburbs().get(index);
                else
                    return null;
            }

            if (parent instanceof Region) {
                Region region = (Region) parent;

                if (index< region.getHouses().size())
                    return region.getHouses().get(index);
                else
                    index -= region.getHouses().size();

                if (index< region.getStreets().size())
                    return region.getStreets().get(index);
                else
                    index -= region.getStreets().size();

                if (index< region.getViToCis().size())
                    return region.getViToCis().get(index);
                else
                    return null;
            }

            if (parent instanceof Database)
                return ((Database) parent).regions.get(index);

            return null;
        }

        public int getChildCount(Object parent) {

            if (parent instanceof House)
                return 0;

            if (parent instanceof Street)
                return ((Street) parent).getHouses().size();

            if (parent instanceof Suburb)
                return ((Suburb) parent).getHouses().size() +
                       ((Suburb) parent).getStreets().size();

            if (parent instanceof ViToCi)
                return ((ViToCi) parent).getHouses().size() +
                       ((ViToCi) parent).getStreets().size() +
                       ((ViToCi) parent).getSuburbs().size();

            if (parent instanceof Region)
                return ((Region) parent).getHouses().size() +
                       ((Region) parent).getStreets().size() +
                       ((Region) parent).getViToCis().size();

            if (parent instanceof Database)
                return ((Database) parent).regions.size();

            return 0;
        }

        public int getIndexOfChild(Object parent, Object child) {
            return 0;
        }
        
    }*/

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        jScrollPane1.setViewportView(tree);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(mainPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables

}
