package br.edu.energianaorenovavel.view;

import br.edu.energianaorenovavel.model.FonteNaoRenovavel;
import br.edu.energianaorenovavel.model.FonteRenovavel;

public class Introducao extends javax.swing.JFrame {

    public FonteNaoRenovavel[] fontesNaoRenovaveis = {
        novaFonteNaoRenovavel("Petróleo", "É um recurso natural de caráter estratégico, pois é amplamente utilizado por veículos, constituindo-se "
        + "como um elemento importante nos meios de transporte, além de também pode ser utilizado na fabricação de produtos derivados, "
        + "notadamente o plástico.", "As consequências de utilizar-se do petróleo é que para a geração de energia é emitido muitos poluentes "
        + "na atmosfera."),
        novaFonteNaoRenovavel("Carvão Mineral", "A formação do carvão mineral assemelha-se, em partes, com a do petróleo, pois ambos são combustíveis "
        + "fósseis.", "As consequências do carvão mineral, é a construção de poços e tuneis, que em alguns casos invadem áreas reservadas ou "
        + "florestas, além disso, a queima do carvão mineral é considerada mais poluente que a do petróleo assim causando uma grande "
        + "emissão de poluentes da atmosfera."),
        novaFonteNaoRenovavel("Energia Nuclear", "A Energia Nuclear é obtida a partir do processo de fissão nuclear de átomos de urânio, que é "
        + "considerado uma fonte esgotável de energia. Quando ocorre a fissão do núcleo desse material, libera-se uma grande quantidade de "
        + "energia.", "Apesar de não emitirem poluentes gasosos na atmosfera existem muitas críticas devido aos elevados custos de produção, os "
        + "altos riscos ambientais e sociais em casos de acidentes e também o fato de essa ser a mesma tecnologia utilizada para a fabricação "
        + "de armamentos nucleares.")};
    public FonteRenovavel[] fontesRenovaveis = {
        novaFonteRenovavel("Solar", "A obtenção da energia solar, é captada por células fotovoltaicas presentes em painéis solares. Pode ser obtida de"
        + " forma direta, por meio dos painéis constituídos por essas células fotovoltaicas ou coletores instalados nos telhados das residências,"
        + " ou ainda de forma indireta, por meio da construção de usinas em áreas de intensa insolação, nas quais são instalados diversos "
        + "coletores de energia solar.", "É considerada uma fonte de energia renovável e limpa, além de apresentar bom custo benefício. Trata-se "
        + "de um recurso abundante, principalmente nas regiões intertropicais."),
        novaFonteRenovavel("Eólica", "É uma fonte de energia que utiliza o vento como força motriz. A geração de energia eólica acontece por meio de "
        + "equipamentos conhecidos como aerogeradores eólicos, que conseguem de converter a energia cinética dos ventos em energia elétrica.",
        "A produção energética a partir da energia eólica apresenta baixo custo, uma vez que o vento é um recurso natural abundante. Este "
        + "processo não produz ou emite nenhum gás poluente a atmosfera, sendo assim considerada uma fonte de energia limpa."),
        novaFonteRenovavel("Maremotriz", "A obtenção desse tipo de energia pode ser feita por meio da energia das ondas, da energia das marés, "
        + "da energia das correntes marítimas ou da energia térmica dos oceanos.", "É considerada uma energia limpa e que apresenta poucos "
        + "riscos ao meio ambiente.")};

    public Introducao() {
        initComponents();
        this.setLocationRelativeTo(null); //Abre componente no centro da tela
        txtIntroducao.setText("A energia não renovável (ou energia suja) são aquelas produzidas a partir de fontes de energia que se esgotam na natureza "
                + "e, portanto, causam diversos impactos ambientais. Essa energia de origem orgânica (de origem vegetal ou animal) é limitada e demora "
                + "milhões de anos para se formarem na natureza. Ainda que apresentam grandes quantidades, se esgotadas não podem ser regeneradas facilmente, "
                + "uma vez que suas reservas são finitas.");
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
        txtIntroducao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        txtIntroducao.setEditable(false);
        txtIntroducao.setColumns(20);
        txtIntroducao.setLineWrap(true);
        txtIntroducao.setRows(5);
        txtIntroducao.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtIntroducao);

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
    private javax.swing.JLabel lblIntroducao;
    private javax.swing.JTextArea txtIntroducao;
    // End of variables declaration//GEN-END:variables
}
