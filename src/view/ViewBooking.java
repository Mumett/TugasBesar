package view;

import control.KaryawanControl;
import control.PeminjamanLapanganControl;
import control.LapanganControl;
import control.PenyewaControl;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import java.util.Date;
import model.Karyawan;
import model.PeminjamanLapangan;
import model.Lapangan;
import model.Penyewa;
import exception.InputKosongException;
import exception.InputKosongJamException;
import exception.jamExeption;
import java.text.SimpleDateFormat;
import table.TablePeminjamanLapangan;
import table.TablePenyewa;

public class ViewBooking extends javax.swing.JFrame {

    private KaryawanControl kControl;
    private PeminjamanLapanganControl plControl;
    private LapanganControl lControl;
    private PenyewaControl pControl;
    private Karyawan karyawan;
    private PeminjamanLapangan pl;
    private Penyewa p;
    String action = null;
    List<Karyawan> listKaryawan;
    List<Lapangan> listLapangan;
    List<Penyewa> listPenyewa;
    int selectedId = 0;
    int globalIndexLap = -1;

    public ViewBooking() {
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        kControl = new KaryawanControl();
        lControl = new LapanganControl();
        plControl = new PeminjamanLapanganControl();
        pControl = new PenyewaControl();
        showPeminjamanLapangan();
        setKaryawanToDropdown();
        setLapanganToDropdown();
        this.setLocationRelativeTo(null);
        //listLapangan = lControl.showLap();
//        for (int i = 0; i < listLapangan.size(); i++) {
//            tableLapangan.add
//
//        }

        showDataLapangan();
    }

    public void showDataLapangan() {
        tableLapangan.setModel(lControl.showDataLapangan(""));
    }

    public void setComponent(boolean value) {
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);

        karyawanOption.setEnabled(value);
        lapanganOption.setEnabled(value);
        inputIdPenyewa.setEnabled(value);
        inputNamaPenyewa.setEnabled(value);
        inputUsiaPenyewa.setEnabled(value);
        inputAlamatPenyewa.setEnabled(value);
        noTelpPenyewa.setEnabled(value);
        inputIdPeminjaman.setEnabled(value);
        tanggal.setEnabled(value);
        jamRBtn1.setEnabled(value);
        jamRBtn2.setEnabled(value);
        jamRBtn3.setEnabled(value);
        jamRBtn4.setEnabled(value);
        jamRBtn5.setEnabled(value);
        jamRBtn6.setEnabled(value);
        jamRBtn7.setEnabled(value);
        jamRBtn8.setEnabled(value);
        jamRBtn9.setEnabled(value);
        jamRBtn10.setEnabled(value);
        jamRBtn11.setEnabled(value);
        jamRBtn12.setEnabled(value);
        jamRBtn13.setEnabled(value);
        jamRBtn14.setEnabled(value);
        jamRBtn15.setEnabled(value);
    }

    public void setEditDeleteBtn(boolean value) {
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }

    public void setKaryawanToDropdown() {
        listKaryawan = kControl.showKaryawan();
        for (int i = 0; i < listKaryawan.size(); i++) {
            karyawanOption.addItem(listKaryawan.get(i));
        }
    }

    public void setLapanganToDropdown() {
        listLapangan = lControl.showListLap();
        for (int i = 0; i < listLapangan.size(); i++) {
            lapanganOption.addItem(listLapangan.get(i));
        }
    }

    public void InputanKosongException() throws InputKosongException {
        if (inputIdPenyewa.getText().isEmpty() || inputNamaPenyewa.getText().isEmpty() || inputUsiaPenyewa.getText().isEmpty()
                || inputAlamatPenyewa.getText().isEmpty() || noTelpPenyewa.getText().isEmpty() || inputIdPeminjaman.getText().isEmpty()
                || karyawanOption.getSelectedIndex() == -1 || lapanganOption.getSelectedIndex() == -1 || tanggal.getDate() == null) {
            throw new InputKosongException();
        }
    }

    public void InputKosongJamException() throws InputKosongJamException {
        if (!jamRBtn1.isSelected() || !jamRBtn2.isSelected() || !jamRBtn3.isSelected() || !jamRBtn4.isSelected() || !jamRBtn5.isSelected() || !jamRBtn6.isSelected()
                || !jamRBtn7.isSelected() || !jamRBtn8.isSelected() || !jamRBtn9.isSelected() || !jamRBtn10.isSelected() || !jamRBtn11.isSelected() || !jamRBtn12.isSelected()
                || !jamRBtn13.isSelected() || !jamRBtn14.isSelected() || !jamRBtn15.isSelected()) {
            throw new InputKosongJamException();
        }
    }

    public void jamException() throws jamExeption {
        if (dateToString(tanggal.getDate()).equals(pl)) {
            if (pl.getLapangan().getStatusLapangan().equalsIgnoreCase("Booked")) {
                throw new jamExeption();
            }
        }
    }

    public void showPeminjamanLapangan() {
        tablePeminjaman.setModel(plControl.showDataPL(""));
    }

    public void clearText() {
        inputIdPenyewa.setText("");
        inputNamaPenyewa.setText("");
        inputUsiaPenyewa.setText("");
        inputAlamatPenyewa.setText("");
        noTelpPenyewa.setText("");
        inputIdPeminjaman.setText("");

        jamRBtn1.setSelected(false);
        jamRBtn2.setSelected(false);
        jamRBtn3.setSelected(false);
        jamRBtn4.setSelected(false);
        jamRBtn5.setSelected(false);
        jamRBtn6.setSelected(false);
        jamRBtn7.setSelected(false);
        jamRBtn8.setSelected(false);
        jamRBtn9.setSelected(false);
        jamRBtn10.setSelected(false);
        jamRBtn11.setSelected(false);
        jamRBtn12.setSelected(false);
        jamRBtn13.setSelected(false);
        jamRBtn14.setSelected(false);
        jamRBtn15.setSelected(false);
        karyawanOption.setSelectedItem(ABORT);
        lapanganOption.setSelectedItem(ABORT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jamPinjam = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        basePanel = new javax.swing.JPanel();
        sidePanel2 = new javax.swing.JPanel();
        logoPanel = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        karyawanPanel = new javax.swing.JPanel();
        karyawanIcon = new javax.swing.JLabel();
        karyawanLabel = new javax.swing.JLabel();
        lapanganPanel = new javax.swing.JPanel();
        lapanganIcon = new javax.swing.JLabel();
        lapanganLabel = new javax.swing.JLabel();
        bookingPanel = new javax.swing.JPanel();
        bookingIcon = new javax.swing.JLabel();
        bookingLabel = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        idPenyewaLabel = new javax.swing.JLabel();
        inputIdPenyewa = new javax.swing.JTextField();
        namaPenyewaLabel = new javax.swing.JLabel();
        inputNamaPenyewa = new javax.swing.JTextField();
        usiaPenyewaLabel = new javax.swing.JLabel();
        inputUsiaPenyewa = new javax.swing.JTextField();
        alamatPenyewaLabel = new javax.swing.JLabel();
        noTelpPenyewaLabel = new javax.swing.JLabel();
        inputAlamatPenyewa = new javax.swing.JTextField();
        noTelpPenyewa = new javax.swing.JTextField();
        panel3 = new javax.swing.JPanel();
        idPeminjamanLabel = new javax.swing.JLabel();
        inputIdPeminjaman = new javax.swing.JTextField();
        tanggalLabel = new javax.swing.JLabel();
        lamaPinjamLabel = new javax.swing.JLabel();
        karyawanOptionLabel = new javax.swing.JLabel();
        karyawanOption = new javax.swing.JComboBox<>();
        lapanganOptionLabel = new javax.swing.JLabel();
        lapanganOption = new javax.swing.JComboBox<>();
        tanggal = new com.toedter.calendar.JDateChooser();
        jamRBtn1 = new javax.swing.JRadioButton();
        jamRBtn2 = new javax.swing.JRadioButton();
        jamRBtn3 = new javax.swing.JRadioButton();
        jamRBtn4 = new javax.swing.JRadioButton();
        jamRBtn5 = new javax.swing.JRadioButton();
        jamRBtn6 = new javax.swing.JRadioButton();
        jamRBtn7 = new javax.swing.JRadioButton();
        jamRBtn8 = new javax.swing.JRadioButton();
        jamRBtn9 = new javax.swing.JRadioButton();
        jamRBtn10 = new javax.swing.JRadioButton();
        jamRBtn11 = new javax.swing.JRadioButton();
        jamRBtn12 = new javax.swing.JRadioButton();
        jamRBtn13 = new javax.swing.JRadioButton();
        jamRBtn14 = new javax.swing.JRadioButton();
        jamRBtn15 = new javax.swing.JRadioButton();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePeminjaman = new javax.swing.JTable();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();
        inputSearch = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        panel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLapangan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basePanel.setBackground(new java.awt.Color(164, 180, 196));

        sidePanel2.setBackground(new java.awt.Color(88, 111, 132));

        logoPanel.setBackground(new java.awt.Color(224, 235, 253));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/sportFieldIcon 1.png"))); // NOI18N
        icon2.setText("jLabel1");

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        karyawanPanel.setBackground(new java.awt.Color(69, 91, 112));
        karyawanPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanPanelMouseClicked(evt);
            }
        });

        karyawanIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        karyawanIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/karyawanIcon.png"))); // NOI18N
        karyawanIcon.setText(" ");

        karyawanLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        karyawanLabel.setForeground(new java.awt.Color(0, 0, 0));
        karyawanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        karyawanLabel.setText("KARYAWAN");

        javax.swing.GroupLayout karyawanPanelLayout = new javax.swing.GroupLayout(karyawanPanel);
        karyawanPanel.setLayout(karyawanPanelLayout);
        karyawanPanelLayout.setHorizontalGroup(
            karyawanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(karyawanIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(karyawanLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        karyawanPanelLayout.setVerticalGroup(
            karyawanPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(karyawanPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karyawanIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karyawanLabel)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        lapanganPanel.setBackground(new java.awt.Color(69, 91, 112));
        lapanganPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lapanganPanelMouseClicked(evt);
            }
        });

        lapanganIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lapanganIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/lapanganIcon.png"))); // NOI18N
        lapanganIcon.setText(" ");

        lapanganLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        lapanganLabel.setForeground(new java.awt.Color(0, 0, 0));
        lapanganLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lapanganLabel.setText("LAPANGAN");

        javax.swing.GroupLayout lapanganPanelLayout = new javax.swing.GroupLayout(lapanganPanel);
        lapanganPanel.setLayout(lapanganPanelLayout);
        lapanganPanelLayout.setHorizontalGroup(
            lapanganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
            .addGroup(lapanganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lapanganIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addComponent(lapanganLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
        );
        lapanganPanelLayout.setVerticalGroup(
            lapanganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
            .addGroup(lapanganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lapanganPanelLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(lapanganIcon)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lapanganLabel)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        bookingPanel.setBackground(new java.awt.Color(164, 180, 196));
        bookingPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingPanelMouseClicked(evt);
            }
        });

        bookingIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/bookingIcon.png"))); // NOI18N
        bookingIcon.setText(" ");

        bookingLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        bookingLabel.setForeground(new java.awt.Color(0, 0, 0));
        bookingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bookingLabel.setText("BOOKING LAPANGAN");

        javax.swing.GroupLayout bookingPanelLayout = new javax.swing.GroupLayout(bookingPanel);
        bookingPanel.setLayout(bookingPanelLayout);
        bookingPanelLayout.setHorizontalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bookingIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bookingPanelLayout.setVerticalGroup(
            bookingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingLabel)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidePanel2Layout = new javax.swing.GroupLayout(sidePanel2);
        sidePanel2.setLayout(sidePanel2Layout);
        sidePanel2Layout.setHorizontalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(karyawanPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lapanganPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bookingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanel2Layout.setVerticalGroup(
            sidePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(karyawanPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lapanganPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(859, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(143, 122, 122));

        panel2.setBackground(new java.awt.Color(122, 92, 92));

        idPenyewaLabel.setBackground(new java.awt.Color(77, 107, 136));
        idPenyewaLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        idPenyewaLabel.setForeground(new java.awt.Color(199, 176, 176));
        idPenyewaLabel.setText("ID Penyewa");

        inputIdPenyewa.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        inputIdPenyewa.setText(" ");
        inputIdPenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdPenyewaActionPerformed(evt);
            }
        });

        namaPenyewaLabel.setBackground(new java.awt.Color(77, 107, 136));
        namaPenyewaLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        namaPenyewaLabel.setForeground(new java.awt.Color(199, 176, 176));
        namaPenyewaLabel.setText("Nama Penyewa");

        inputNamaPenyewa.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        inputNamaPenyewa.setText(" ");
        inputNamaPenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaPenyewaActionPerformed(evt);
            }
        });

        usiaPenyewaLabel.setBackground(new java.awt.Color(77, 107, 136));
        usiaPenyewaLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        usiaPenyewaLabel.setForeground(new java.awt.Color(199, 176, 176));
        usiaPenyewaLabel.setText("Usia");

        inputUsiaPenyewa.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        inputUsiaPenyewa.setText(" ");
        inputUsiaPenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsiaPenyewaActionPerformed(evt);
            }
        });

        alamatPenyewaLabel.setBackground(new java.awt.Color(77, 107, 136));
        alamatPenyewaLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        alamatPenyewaLabel.setForeground(new java.awt.Color(199, 176, 176));
        alamatPenyewaLabel.setText("Alamat");

        noTelpPenyewaLabel.setBackground(new java.awt.Color(77, 107, 136));
        noTelpPenyewaLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        noTelpPenyewaLabel.setForeground(new java.awt.Color(199, 176, 176));
        noTelpPenyewaLabel.setText("Nomor Telepon");

        inputAlamatPenyewa.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        inputAlamatPenyewa.setText(" ");
        inputAlamatPenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAlamatPenyewaActionPerformed(evt);
            }
        });

        noTelpPenyewa.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        noTelpPenyewa.setText(" ");
        noTelpPenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTelpPenyewaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputIdPenyewa)
                    .addComponent(inputNamaPenyewa)
                    .addComponent(inputUsiaPenyewa)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usiaPenyewaLabel)
                            .addComponent(noTelpPenyewaLabel)
                            .addComponent(idPenyewaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaPenyewaLabel)
                            .addComponent(alamatPenyewaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 257, Short.MAX_VALUE))
                    .addComponent(inputAlamatPenyewa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noTelpPenyewa))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(idPenyewaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputIdPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(namaPenyewaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(usiaPenyewaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsiaPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(alamatPenyewaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputAlamatPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(noTelpPenyewaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noTelpPenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(122, 92, 92));

        idPeminjamanLabel.setBackground(new java.awt.Color(77, 107, 136));
        idPeminjamanLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        idPeminjamanLabel.setForeground(new java.awt.Color(199, 176, 176));
        idPeminjamanLabel.setText("ID Peminjaman");

        inputIdPeminjaman.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        inputIdPeminjaman.setText(" ");
        inputIdPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdPeminjamanActionPerformed(evt);
            }
        });

        tanggalLabel.setBackground(new java.awt.Color(77, 107, 136));
        tanggalLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        tanggalLabel.setForeground(new java.awt.Color(199, 176, 176));
        tanggalLabel.setText("Tanggal");

        lamaPinjamLabel.setBackground(new java.awt.Color(77, 107, 136));
        lamaPinjamLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lamaPinjamLabel.setForeground(new java.awt.Color(199, 176, 176));
        lamaPinjamLabel.setText("Lama Peminjaman");

        karyawanOptionLabel.setBackground(new java.awt.Color(77, 107, 136));
        karyawanOptionLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        karyawanOptionLabel.setForeground(new java.awt.Color(199, 176, 176));
        karyawanOptionLabel.setText("Karyawan yang Bertanggung Jawab");

        karyawanOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karyawanOptionActionPerformed(evt);
            }
        });

        lapanganOptionLabel.setBackground(new java.awt.Color(77, 107, 136));
        lapanganOptionLabel.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        lapanganOptionLabel.setForeground(new java.awt.Color(199, 176, 176));
        lapanganOptionLabel.setText("Lapangan");

        lapanganOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapanganOptionActionPerformed(evt);
            }
        });

        tanggal.setDateFormatString("yyyy-MM-dd");

        jamPinjam.add(jamRBtn1);
        jamRBtn1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn1.setText("08:00 - 09:00");

        jamPinjam.add(jamRBtn2);
        jamRBtn2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn2.setText("09:00 - 10:00");

        jamPinjam.add(jamRBtn3);
        jamRBtn3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn3.setText("10:00 - 11:00");

        jamPinjam.add(jamRBtn4);
        jamRBtn4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn4.setText("11:00 - 12:00");

        jamPinjam.add(jamRBtn5);
        jamRBtn5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn5.setText("12:00 - 13:00");

        jamPinjam.add(jamRBtn6);
        jamRBtn6.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn6.setText("13:00 - 14:00");

        jamPinjam.add(jamRBtn7);
        jamRBtn7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn7.setText("14:00 - 15:00");

        jamPinjam.add(jamRBtn8);
        jamRBtn8.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn8.setText("15:00 - 16:00");

        jamPinjam.add(jamRBtn9);
        jamRBtn9.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn9.setText("16:00 - 17:00");

        jamPinjam.add(jamRBtn10);
        jamRBtn10.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn10.setText("17:00 - 18:00");

        jamPinjam.add(jamRBtn11);
        jamRBtn11.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn11.setText("18:00 - 19:00");

        jamPinjam.add(jamRBtn12);
        jamRBtn12.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn12.setText("19:00 - 20:00");

        jamPinjam.add(jamRBtn13);
        jamRBtn13.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn13.setText("20:00 - 21:00");

        jamPinjam.add(jamRBtn14);
        jamRBtn14.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn14.setText("21:00 - 22:00");

        jamPinjam.add(jamRBtn15);
        jamRBtn15.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        jamRBtn15.setText("22:00 - 23:00");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputIdPeminjaman)
                    .addComponent(karyawanOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lapanganOption, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tanggalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idPeminjamanLabel)
                            .addComponent(lamaPinjamLabel)
                            .addComponent(karyawanOptionLabel)
                            .addComponent(lapanganOptionLabel)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jamRBtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jamRBtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jamRBtn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jamRBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jamRBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jamRBtn7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jamRBtn12)
                                            .addGap(6, 6, 6))
                                        .addGroup(panel3Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jamRBtn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jamRBtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                                .addComponent(jamRBtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                                    .addGap(13, 13, 13)
                                                    .addComponent(jamRBtn15))
                                                .addGroup(panel3Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jamRBtn14)
                                                        .addComponent(jamRBtn13))
                                                    .addGap(0, 0, Short.MAX_VALUE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jamRBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jamRBtn11)
                                        .addGap(12, 12, 12)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(idPeminjamanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(tanggalLabel)
                .addGap(8, 8, 8)
                .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lamaPinjamLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamRBtn1)
                    .addComponent(jamRBtn6)
                    .addComponent(jamRBtn11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamRBtn2)
                    .addComponent(jamRBtn7)
                    .addComponent(jamRBtn12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamRBtn3)
                    .addComponent(jamRBtn8)
                    .addComponent(jamRBtn13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamRBtn4)
                    .addComponent(jamRBtn9)
                    .addComponent(jamRBtn14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jamRBtn5)
                    .addComponent(jamRBtn10)
                    .addComponent(jamRBtn15))
                .addGap(10, 10, 10)
                .addComponent(karyawanOptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karyawanOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(lapanganOptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lapanganOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn)
                        .addGap(18, 18, 18)
                        .addComponent(saveBtn))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn)
                    .addComponent(addBtn))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panel4.setBackground(new java.awt.Color(143, 122, 122));
        panel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Data Peminjaman Lapangan  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 18))); // NOI18N

        tablePeminjaman.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePeminjamanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablePeminjaman);

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        payBtn.setText("Pay");
        payBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payBtnMouseClicked(evt);
            }
        });
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        inputSearch.setText(" ");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(searchBtn))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(payBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn)
                    .addComponent(payBtn))
                .addGap(16, 16, 16))
        );

        panel5.setBackground(new java.awt.Color(143, 122, 122));
        panel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  Data Lapangan  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB Demi", 0, 18))); // NOI18N

        tableLapangan.setModel(new javax.swing.table.DefaultTableModel(
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
        tableLapangan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLapanganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableLapangan);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(sidePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );

        jScrollPane1.setViewportView(basePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIdPenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdPenyewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdPenyewaActionPerformed

    private void inputNamaPenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaPenyewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaPenyewaActionPerformed

    private void inputUsiaPenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsiaPenyewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsiaPenyewaActionPerformed

    private void inputAlamatPenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAlamatPenyewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAlamatPenyewaActionPerformed

    private void noTelpPenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTelpPenyewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpPenyewaActionPerformed

    private void inputIdPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdPeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdPeminjamanActionPerformed

    private void karyawanOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karyawanOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_karyawanOptionActionPerformed

    private void lapanganOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapanganOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lapanganOptionActionPerformed

    private Date stringToDate(String value) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            date = sdf.parse(value);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return date;
    }

    private String dateToString(Date value) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return (String) sdf.format(value);
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            String lamaPeminjaman = "";
            InputanKosongException();
            jamException();
            int selectedIndex = karyawanOption.getSelectedIndex();
            Karyawan k = listKaryawan.get(selectedIndex);

            selectedIndex = lapanganOption.getSelectedIndex();
            Lapangan l = listLapangan.get(selectedIndex);

            Penyewa p = new Penyewa(inputNamaPenyewa.getText(), inputAlamatPenyewa.getText(), noTelpPenyewa.getText(), Integer.parseInt(inputIdPenyewa.getText()), Integer.parseInt(inputUsiaPenyewa.getText()));

            if (jamRBtn1.isSelected() == true) {
                lamaPeminjaman = "08:00 - 09:00";
            } else if (jamRBtn2.isSelected() == true) {
                lamaPeminjaman = "09:00 - 10:00";
            } else if (jamRBtn3.isSelected() == true) {
                lamaPeminjaman = "10:00 - 11:00";
            } else if (jamRBtn4.isSelected() == true) {
                lamaPeminjaman = "11:00 - 12:00";
            } else if (jamRBtn5.isSelected() == true) {
                lamaPeminjaman = "12:00 - 13:00";
            } else if (jamRBtn6.isSelected() == true) {
                lamaPeminjaman = "13:00 - 14:00";
            } else if (jamRBtn7.isSelected() == true) {
                lamaPeminjaman = "14:00 - 15:00";
            } else if (jamRBtn8.isSelected() == true) {
                lamaPeminjaman = "15:00 - 16:00";
            } else if (jamRBtn9.isSelected() == true) {
                lamaPeminjaman = "16:00 - 17:00";
            } else if (jamRBtn10.isSelected() == true) {
                lamaPeminjaman = "17:00 - 18:00";
            } else if (jamRBtn11.isSelected() == true) {
                lamaPeminjaman = "18:00 - 19:00";
            } else if (jamRBtn12.isSelected() == true) {
                lamaPeminjaman = "19:00 - 20:00";
            } else if (jamRBtn13.isSelected() == true) {
                lamaPeminjaman = "20:00 - 21:00";
            } else if (jamRBtn14.isSelected() == true) {
                lamaPeminjaman = "21:00 - 22:00";
            } else if (jamRBtn15.isSelected() == true) {
                lamaPeminjaman = "22:00 - 23:00";
            }

            if (action.equals("Tambah")) {
                pControl.insertPenyewa(p);
                PeminjamanLapangan pl = new PeminjamanLapangan(Integer.parseInt(inputIdPeminjaman.getText()), dateToString(tanggal.getDate()), lamaPeminjaman, k, l, p);
                plControl.inserDataPL(pl);
            } else {
                pControl.insertPenyewa(p);
                PeminjamanLapangan pl = new PeminjamanLapangan(Integer.parseInt(inputIdPeminjaman.getText()), dateToString(tanggal.getDate()), lamaPeminjaman, k, l, p);
                plControl.updateDataPL(pl);
            }

//            if(dateToString(tanggal.getDate()).equals(pl)){
//                if(lamaPeminjaman.equals(pl.getLamaPeminjaman().toString())){
//                    JOptionPane.showMessageDialog(null, "Gagal Meninput Data !");
//                }
//            }
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
            clearText();
            showPeminjamanLapangan();
            setComponent(false);
            setEditDeleteBtn(false);
        } catch (InputKosongException e) {
            JOptionPane.showMessageDialog(this, e.message());
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this, "Input Invalid !");
        } catch (jamExeption e2) {
            JOptionPane.showMessageDialog(this, e2.message());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        setComponent(true);
        clearText();
        inputSearch.setText("");
        action = "Tambah";
    }//GEN-LAST:event_addBtnActionPerformed


    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        setEditDeleteBtn(false);
        setComponent(false);

        try {
            TablePeminjamanLapangan tPL = plControl.showDataPL(inputSearch.getText());

            if (tPL.getRowCount() == 0) {
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data Tidak Ditemukan !", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            } else {
                tablePeminjaman.setModel(tPL);
            }
            clearText();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        switch (getAnswer) {
            case 0:
                try {
                plControl.deleteDataPL(selectedId);
                clearText();
                showPeminjamanLapangan();
                setComponent(false);
                setEditDeleteBtn(false);
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
            }
            break;
            case 1:
                JOptionPane.showMessageDialog(null, "Batal Menghapus Data!");
                break;
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void karyawanPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanPanelMouseClicked
        ViewKaryawan vk = new ViewKaryawan();
        this.dispose();
        vk.setVisible(true);
    }//GEN-LAST:event_karyawanPanelMouseClicked

    private void lapanganPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapanganPanelMouseClicked
        ViewLapangan vl = new ViewLapangan();
        this.dispose();
        vl.setVisible(true);
    }//GEN-LAST:event_lapanganPanelMouseClicked

    private void bookingPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingPanelMouseClicked
        ViewBooking vb = new ViewBooking();
        this.dispose();
        vb.setVisible(true);
    }//GEN-LAST:event_bookingPanelMouseClicked

    private void tableLapanganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLapanganMouseClicked
        int indexLap = -1;
        globalIndexLap = -1;

        int clickedRow = tableLapangan.getSelectedRow();
        TableModel tm = tableLapangan.getModel();

        selectedId = Integer.parseInt(tm.getValueAt(clickedRow, 0).toString());
        globalIndexLap = selectedId;
    }//GEN-LAST:event_tableLapanganMouseClicked

    private void tablePeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePeminjamanMouseClicked
        int indexKaryawan = -1;
        int indexPenyewa = -1;
        int indexLapangan = -1;

        String lamaPeminjaman = "";
        setEditDeleteBtn(true);
        setComponent(false);
        int clickedRow = tablePeminjaman.getSelectedRow();
        TableModel tm = tablePeminjaman.getModel();

        selectedId = Integer.parseInt(tm.getValueAt(clickedRow, 0).toString());
        tanggal.setDate(stringToDate(tm.getValueAt(clickedRow, 1).toString()));
        lamaPeminjaman = tm.getValueAt(clickedRow, 2).toString();

        if (jamRBtn1.isSelected() == true) {
            jamRBtn1.setSelected(true);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn2.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(true);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn3.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(true);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn4.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(true);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn5.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(true);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn6.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(true);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn7.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(true);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn8.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(true);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn9.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(true);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn10.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(true);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn11.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(true);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn12.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(true);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn13.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(true);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn14.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(true);
            jamRBtn15.setSelected(false);
        } else if (jamRBtn15.isSelected() == true) {
            jamRBtn1.setSelected(false);
            jamRBtn2.setSelected(false);
            jamRBtn3.setSelected(false);
            jamRBtn4.setSelected(false);
            jamRBtn5.setSelected(false);
            jamRBtn6.setSelected(false);
            jamRBtn7.setSelected(false);
            jamRBtn8.setSelected(false);
            jamRBtn9.setSelected(false);
            jamRBtn10.setSelected(false);
            jamRBtn11.setSelected(false);
            jamRBtn12.setSelected(false);
            jamRBtn13.setSelected(false);
            jamRBtn14.setSelected(false);
            jamRBtn15.setSelected(true);
        }

        int idKaryawan = Integer.parseInt(tm.getValueAt(clickedRow, 7).toString());
        for (Karyawan k : listKaryawan) {
            if (k.getId() == idKaryawan) {
                indexKaryawan = listKaryawan.indexOf(k);
            }
        }
        karyawanOption.setSelectedIndex(indexKaryawan);

        int idLapangan = Integer.parseInt(tm.getValueAt(clickedRow, 8).toString());
        for (Lapangan l : listLapangan) {
            if (l.getId() == idLapangan) {
                indexLapangan = listLapangan.indexOf(l);
            }
        }
        lapanganOption.setSelectedIndex(indexLapangan);

        int idPenyewa = Integer.parseInt(tm.getValueAt(clickedRow, 9).toString());
        for (Penyewa p : listPenyewa) {
            if (p.getId() == idPenyewa) {
                indexPenyewa = listPenyewa.indexOf(p);
            }
        }

        inputNamaPenyewa.setText(pl.getPenyewa().getNama());
        inputUsiaPenyewa.setText(Integer.toString(pl.getPenyewa().getUsia()));
        inputAlamatPenyewa.setText(pl.getPenyewa().getAlamat());
        noTelpPenyewa.setText(pl.getPenyewa().getNotelp());

//        idTransaksiOutput.setText(Integer.toString(tControl.getLastId()));
//        tanggalOutput.setText(pl.getTanggal());
//        outputNama.setText(pl.getPenyewa().getNama());
//        noTelpOutput.setText(pl.getPenyewa().getNotelp());
//        totalOutput.setText(Integer.toString(totalHarga));
        setEditDeleteBtn(true);
    }//GEN-LAST:event_tablePeminjamanMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        setComponent(true);
        action = "Ubah";
    }//GEN-LAST:event_editBtnActionPerformed

    private void payBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payBtnMouseClicked

    }//GEN-LAST:event_payBtnMouseClicked

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        int clickedRow = tablePeminjaman.getSelectedRow();
        TableModel tm = tablePeminjaman.getModel();
        int id = Integer.parseInt(tm.getValueAt(clickedRow, 0).toString());
        String tanggal = tm.getValueAt(clickedRow, 1).toString();
        String lamaPeminjaman = tm.getValueAt(clickedRow, 2).toString();
        karyawan = kControl.getKaryawan(tm.getValueAt(clickedRow, 3).toString());
        Lapangan l = lControl.getLapangan(tm.getValueAt(clickedRow, 4).toString());
        Penyewa p = pControl.getPenyewa(tm.getValueAt(clickedRow, 6).toString());

        pl = new PeminjamanLapangan(id, tanggal, lamaPeminjaman, karyawan, l, p);
        ViewTransaksi vt = new ViewTransaksi(pl);
        this.dispose();
        vt.setVisible(true);
    }//GEN-LAST:event_payBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel alamatPenyewaLabel;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel bookingIcon;
    private javax.swing.JLabel bookingLabel;
    private javax.swing.JPanel bookingPanel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel idPeminjamanLabel;
    private javax.swing.JLabel idPenyewaLabel;
    private javax.swing.JTextField inputAlamatPenyewa;
    private javax.swing.JTextField inputIdPeminjaman;
    private javax.swing.JTextField inputIdPenyewa;
    private javax.swing.JTextField inputNamaPenyewa;
    private javax.swing.JTextField inputSearch;
    private javax.swing.JTextField inputUsiaPenyewa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.ButtonGroup jamPinjam;
    private javax.swing.JRadioButton jamRBtn1;
    private javax.swing.JRadioButton jamRBtn10;
    private javax.swing.JRadioButton jamRBtn11;
    private javax.swing.JRadioButton jamRBtn12;
    private javax.swing.JRadioButton jamRBtn13;
    private javax.swing.JRadioButton jamRBtn14;
    private javax.swing.JRadioButton jamRBtn15;
    private javax.swing.JRadioButton jamRBtn2;
    private javax.swing.JRadioButton jamRBtn3;
    private javax.swing.JRadioButton jamRBtn4;
    private javax.swing.JRadioButton jamRBtn5;
    private javax.swing.JRadioButton jamRBtn6;
    private javax.swing.JRadioButton jamRBtn7;
    private javax.swing.JRadioButton jamRBtn8;
    private javax.swing.JRadioButton jamRBtn9;
    private javax.swing.JLabel karyawanIcon;
    private javax.swing.JLabel karyawanLabel;
    private javax.swing.JComboBox<Karyawan> karyawanOption;
    private javax.swing.JLabel karyawanOptionLabel;
    private javax.swing.JPanel karyawanPanel;
    private javax.swing.JLabel lamaPinjamLabel;
    private javax.swing.JLabel lapanganIcon;
    private javax.swing.JLabel lapanganLabel;
    private javax.swing.JComboBox<Lapangan> lapanganOption;
    private javax.swing.JLabel lapanganOptionLabel;
    private javax.swing.JPanel lapanganPanel;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel namaPenyewaLabel;
    private javax.swing.JTextField noTelpPenyewa;
    private javax.swing.JLabel noTelpPenyewaLabel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JPanel panel5;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JPanel sidePanel2;
    private javax.swing.JTable tableLapangan;
    private javax.swing.JTable tablePeminjaman;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JLabel usiaPenyewaLabel;
    // End of variables declaration//GEN-END:variables
}
