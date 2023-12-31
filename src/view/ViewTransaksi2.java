package view;

public class ViewTransaksi2 extends javax.swing.JFrame {

    public ViewTransaksi2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        basePanel = new javax.swing.JPanel();
        backIcon = new javax.swing.JLabel();
        invoicePanel = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        brandLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        noTelpLabel = new javax.swing.JLabel();
        invoiceLabel = new javax.swing.JLabel();
        kepadaLabel = new javax.swing.JLabel();
        outputNama = new javax.swing.JTextField();
        noTelpOutput = new javax.swing.JTextField();
        idTransaksiOutput = new javax.swing.JTextField();
        tanggalOutput = new javax.swing.JTextField();
        idTransaksiLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        detailPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDetailPesanan = new javax.swing.JTable();
        bayarPanel = new javax.swing.JPanel();
        totalLabel = new javax.swing.JLabel();
        masukkanUangLabel = new javax.swing.JLabel();
        totalOutput = new javax.swing.JTextField();
        uangInput = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        kembalianLabel = new javax.swing.JLabel();
        kembalianOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basePanel.setBackground(new java.awt.Color(164, 180, 196));

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/backIcon.png"))); // NOI18N
        backIcon.setText(" ");

        invoicePanel.setBackground(new java.awt.Color(182, 192, 202));
        invoicePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 73, 97), 3, true));
        invoicePanel.setForeground(new java.awt.Color(182, 192, 202));

        logoPanel.setBackground(new java.awt.Color(224, 235, 253));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/sportFieldIcon 1.png"))); // NOI18N
        icon.setText("jLabel1");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        brandLabel.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        brandLabel.setForeground(new java.awt.Color(88, 111, 132));
        brandLabel.setText("Atma Footbal Center");

        alamatLabel.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        alamatLabel.setForeground(new java.awt.Color(0, 0, 0));
        alamatLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alamatLabel.setText("Jl. Ngoding Sangat Menyenangkan");

        noTelpLabel.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        noTelpLabel.setForeground(new java.awt.Color(0, 0, 0));
        noTelpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noTelpLabel.setText("(021) - 0101 101 / 0810101010101");

        invoiceLabel.setFont(new java.awt.Font("STZhongsong", 1, 36)); // NOI18N
        invoiceLabel.setForeground(new java.awt.Color(0, 0, 0));
        invoiceLabel.setText("TRANSAKSI");

        kepadaLabel.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        kepadaLabel.setForeground(new java.awt.Color(0, 0, 0));
        kepadaLabel.setText("Penyewa");

        outputNama.setBackground(new java.awt.Color(171, 180, 190));
        outputNama.setText(" ");
        outputNama.setBorder(null);

        noTelpOutput.setBackground(new java.awt.Color(171, 180, 190));
        noTelpOutput.setText(" ");
        noTelpOutput.setBorder(null);

        idTransaksiOutput.setBackground(new java.awt.Color(171, 180, 190));
        idTransaksiOutput.setText(" ");
        idTransaksiOutput.setBorder(null);

        tanggalOutput.setBackground(new java.awt.Color(171, 180, 190));
        tanggalOutput.setText(" ");
        tanggalOutput.setBorder(null);

        idTransaksiLabel.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        idTransaksiLabel.setForeground(new java.awt.Color(0, 0, 0));
        idTransaksiLabel.setText("No Nota :");

        tanggalLabel.setFont(new java.awt.Font("Mongolian Baiti", 0, 14)); // NOI18N
        tanggalLabel.setForeground(new java.awt.Color(0, 0, 0));
        tanggalLabel.setText("Tanggal :");

        detailPanel.setBackground(new java.awt.Color(171, 180, 190));
        detailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Detail Pesanan  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Mongolian Baiti", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        tableDetailPesanan.setBackground(new java.awt.Color(171, 180, 190));
        tableDetailPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableDetailPesanan);

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bayarPanel.setBackground(new java.awt.Color(171, 180, 190));
        bayarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Pembayaran  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Mongolian Baiti", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        totalLabel.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        totalLabel.setForeground(new java.awt.Color(0, 0, 0));
        totalLabel.setText("Total                  :");

        masukkanUangLabel.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        masukkanUangLabel.setForeground(new java.awt.Color(0, 0, 0));
        masukkanUangLabel.setText("Masukkan Uang : ");

        totalOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalOutput.setText(" ");

        uangInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        uangInput.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        kembalianLabel.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        kembalianLabel.setForeground(new java.awt.Color(0, 0, 0));
        kembalianLabel.setText("Kembalian          :");

        kembalianOutput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kembalianOutput.setText(" ");

        javax.swing.GroupLayout bayarPanelLayout = new javax.swing.GroupLayout(bayarPanel);
        bayarPanel.setLayout(bayarPanelLayout);
        bayarPanelLayout.setHorizontalGroup(
            bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bayarPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bayarPanelLayout.createSequentialGroup()
                        .addComponent(kembalianLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kembalianOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bayarPanelLayout.createSequentialGroup()
                        .addGroup(bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bayarPanelLayout.createSequentialGroup()
                                .addGroup(bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(masukkanUangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uangInput, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bayarPanelLayout.setVerticalGroup(
            bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bayarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalLabel)
                    .addComponent(totalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(masukkanUangLabel)
                    .addComponent(uangInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bayarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kembalianLabel)
                    .addComponent(kembalianOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout invoicePanelLayout = new javax.swing.GroupLayout(invoicePanel);
        invoicePanel.setLayout(invoicePanelLayout);
        invoicePanelLayout.setHorizontalGroup(
            invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(invoicePanelLayout.createSequentialGroup()
                                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(brandLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(noTelpLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alamatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(invoicePanelLayout.createSequentialGroup()
                                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idTransaksiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tanggalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idTransaksiOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tanggalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(162, 162, 162)
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(invoiceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kepadaLabel)
                            .addComponent(outputNama)
                            .addComponent(noTelpOutput))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoicePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bayarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        invoicePanelLayout.setVerticalGroup(
            invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addComponent(invoiceLabel)
                        .addGap(18, 18, 18)
                        .addComponent(kepadaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noTelpOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoicePanelLayout.createSequentialGroup()
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(invoicePanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(brandLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alamatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noTelpLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idTransaksiOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idTransaksiLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tanggalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanggalLabel))))
                .addGap(27, 27, 27)
                .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bayarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(backIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addComponent(invoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(505, Short.MAX_VALUE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(invoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backIcon)
                .addGap(41, 41, 41))
        );

        jScrollPane1.setViewportView(basePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewTransaksi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTransaksi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTransaksi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTransaksi2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTransaksi2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JLabel backIcon;
    private javax.swing.JPanel basePanel;
    private javax.swing.JPanel bayarPanel;
    private javax.swing.JLabel brandLabel;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel idTransaksiLabel;
    private javax.swing.JTextField idTransaksiOutput;
    private javax.swing.JLabel invoiceLabel;
    private javax.swing.JPanel invoicePanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel kembalianLabel;
    private javax.swing.JTextField kembalianOutput;
    private javax.swing.JLabel kepadaLabel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel masukkanUangLabel;
    private javax.swing.JLabel noTelpLabel;
    private javax.swing.JTextField noTelpOutput;
    private javax.swing.JTextField outputNama;
    private javax.swing.JTable tableDetailPesanan;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JTextField tanggalOutput;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalOutput;
    private javax.swing.JTextField uangInput;
    // End of variables declaration//GEN-END:variables
}
