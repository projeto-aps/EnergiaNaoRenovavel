package br.edu.energianaorenovavel.view;

import br.edu.energianaorenovavel.model.FonteNaoRenovavel;
import br.edu.energianaorenovavel.model.FonteRenovavel;

public class Introducao extends javax.swing.JFrame {

    public FonteNaoRenovavel[] fontesNaoRenovaveis = {
        novaFonteNaoRenovavel("Petróleo", "TesteTesteTesteTesteTesteTesteTesteTesteTeste", "TestandoTestandoTestandoTestandoTestandoTestandoTestando"),
        novaFonteNaoRenovavel("Gás Natural", "TesteTesteTesteTestete", "TestandoTestandoTestandoTestandoTestandoTestandoTestando"),
        novaFonteNaoRenovavel("Carvão Mineral", "teTesteTesteTesteTesteTesteTesteTeste", "TestandoTestandoTestandoTestandoTestandoTestandoTestando"),
        novaFonteNaoRenovavel("Combustível Nuclear", "TeeTesteTesteTeste", "TestandoTestandoTestandoTestandoTestandoTestandoTestando")};
    public FonteRenovavel[] fontesRenovaveis = {
        novaFonteRenovavel("Solar", "TesteTesteTesteTesteTesteTesteTesteTesteTeste", "TestandoTestandoTestandoTestandoTestandoTestandoTestando"),
        novaFonteRenovavel("Eólica", "TesteTesteTesteTestete", "TestandoTestandoTestandoTestandoTestandoTestandoTestando"),
        novaFonteRenovavel("Hidro", "teTesteTesteTesteTesteTesteTesteTeste", "TestandoTestandoTestandoTestandoTestandoTestandoTestando"),
        novaFonteRenovavel("Nuclear Limpa", "TeeTesteTesteTeste", "TestandoTestandoTestandoTestandoTestandoTestandoTestando")};

    public Introducao() {
        initComponents();
        this.setLocationRelativeTo(null); //Abre componente no centro da tela
    }

    private FonteNaoRenovavel novaFonteNaoRenovavel(String nome, String descricao, String problemas) {
        FonteNaoRenovavel fonte = new FonteNaoRenovavel(); //Cria um objeto
        fonte.setNome(nome);
        fonte.setDescricao(descricao);
        fonte.setProblemas(problemas);
        return fonte;
    }

    private FonteRenovavel novaFonteRenovavel(String nome, String descricao, String pontosPositivos) {
        FonteRenovavel fonte = new FonteRenovavel(); //Cria um objeto
        fonte.setNome(nome);
        fonte.setDescricao(descricao);
        fonte.setPontosPositivos(pontosPositivos);
        return fonte;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIntroducao = new javax.swing.JLabel();
        btnNaoRenovaveis = new javax.swing.JButton();
        btnFontesAlternativas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIntroducao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIntroducao.setText("Energia Não-Renovável");

        btnNaoRenovaveis.setText("Fontes Não-Renováveis");
        btnNaoRenovaveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoRenovaveisActionPerformed(evt);
            }
        });

        btnFontesAlternativas.setText("Alternativas Melhores");
        btnFontesAlternativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFontesAlternativasActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnNaoRenovaveis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnFontesAlternativas)
                .addGap(96, 96, 96))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblIntroducao)
                .addGap(160, 160, 160))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIntroducao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNaoRenovaveis)
                    .addComponent(btnFontesAlternativas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNaoRenovaveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoRenovaveisActionPerformed
        EnergiaNaoRenovavel energiaNaoRenovavel = new EnergiaNaoRenovavel(fontesNaoRenovaveis);
        energiaNaoRenovavel.setDefaultCloseOperation(EnergiaNaoRenovavel.HIDE_ON_CLOSE);
        energiaNaoRenovavel.setLocationRelativeTo(null);
        energiaNaoRenovavel.setVisible(true);
    }//GEN-LAST:event_btnNaoRenovaveisActionPerformed

    private void btnFontesAlternativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFontesAlternativasActionPerformed
        EnergiaRenovavel energiaRenovavel = new EnergiaRenovavel(fontesRenovaveis);
        energiaRenovavel.setDefaultCloseOperation(EnergiaNaoRenovavel.HIDE_ON_CLOSE);
        energiaRenovavel.setLocationRelativeTo(null);
        energiaRenovavel.setVisible(true);
    }//GEN-LAST:event_btnFontesAlternativasActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Introducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Introducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Introducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Introducao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Introducao().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFontesAlternativas;
    private javax.swing.JButton btnNaoRenovaveis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblIntroducao;
    // End of variables declaration//GEN-END:variables
}
