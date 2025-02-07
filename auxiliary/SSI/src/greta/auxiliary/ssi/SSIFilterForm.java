/*
 * This file is part of the auxiliaries of Greta.
 *
 * Greta is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Greta is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Greta.  If not, see <https://www.gnu.org/licenses/>.
 *
 */
package greta.auxiliary.ssi;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Angelo Cafaro
 */
public class SSIFilterForm extends javax.swing.JFrame {

    private SSIXMLToFrameTranslator ssiTranslator;

    /**
     * Creates new form SSIFilterForm
     */
    public SSIFilterForm() {
        initComponents();

        // get the 'friendly' names for the filter options
        String[] names = Arrays.asList(SSIXMLToFrameTranslator.SSIParsingFilterOption.values())
                .stream()
                .map(SSIXMLToFrameTranslator.SSIParsingFilterOption::toString)
                .collect(Collectors.toList())
                .toArray(new String[SSIXMLToFrameTranslator.SSIParsingFilterOption.size]);

        // set the values straight from the filter options,
        ssiFilterFormChoice.setModel(new javax.swing.DefaultComboBoxModel<>(names));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ssiFilterFormChoice = new javax.swing.JComboBox();
        ssiFilterFormLbl = new javax.swing.JLabel();

        ssiFilterFormChoice.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Prosody Only", "Head Only", "Body Only" }));
        ssiFilterFormChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssiFilterFormChoiceActionPerformed(evt);
            }
        });

        ssiFilterFormLbl.setText("Parse: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ssiFilterFormLbl)
                .addGap(18, 18, 18)
                .addComponent(ssiFilterFormChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ssiFilterFormLbl)
                    .addComponent(ssiFilterFormChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ssiFilterFormChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssiFilterFormChoiceActionPerformed
        if (ssiTranslator != null) {
            int index = ssiFilterFormChoice.getSelectedIndex();
            if (index >= 0)
            {
                ssiTranslator.SetParserFilter(index);
            }
        }
    }//GEN-LAST:event_ssiFilterFormChoiceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ssiFilterFormChoice;
    private javax.swing.JLabel ssiFilterFormLbl;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the ssiTranslator
     */
    public SSIXMLToFrameTranslator getSSITranslator() {
        return ssiTranslator;
    }

    /**
     * @param ssiTranslator the ssiTranslator to set
     */
    public void setSSITranslator(SSIXMLToFrameTranslator ssiTranslator) {
        this.ssiTranslator = ssiTranslator;
    }

}
