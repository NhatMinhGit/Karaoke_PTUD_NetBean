/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import connectdb.ConnectDB;
import dao.KhuyenMai_DAO;
import entity.KhuyenMai;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUICapNhatKhuyenMai extends javax.swing.JFrame {
    private KhuyenMai_DAO km_dao = new KhuyenMai_DAO();
    
    public GUICapNhatKhuyenMai() {
        initComponents();
        setSize(1520, 780);
        setLocationRelativeTo(null);
        // Khởi tạo kết nối CSDL
	try {
            ConnectDB.getInstance().connect();
	} catch (SQLException e) {
            e.printStackTrace();
	}
    }

    public void docDuLieuVaoBang() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachKhuyenMai.getModel();
        model.setRowCount(0);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<KhuyenMai> dsKM = km_dao.layDanhSachKhuyenMai();
        for (KhuyenMai km : dsKM) {
            model.addRow(new Object[] {km.getMaKhuyenMai(), km.getMaGiamGia(), km.getChietKhau(), km.getSoLuong(), df.format(km.getNgayBatDau()), df.format(km.getNgayKetThuc()), km.getMoTa()});
        }
        model.fireTableDataChanged();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCapNhat = new javax.swing.JPanel();
        lblMaKhachHang = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        txtMaKhuyenMai = new javax.swing.JTextField();
        lblSoDT1 = new javax.swing.JLabel();
        lblSoCCD = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();
        lblDiaChi = new javax.swing.JLabel();
        txtChietKhau = new javax.swing.JTextField();
        lblSoDT2 = new javax.swing.JLabel();
        lblSoDT3 = new javax.swing.JLabel();
        txtMaGiamGia = new javax.swing.JTextField();
        cbSoLuong = new javax.swing.JComboBox<>();
        btnCapNhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        dateNgayBD = new com.toedter.calendar.JDateChooser();
        dateNgayKT = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        pnTieuDe = new javax.swing.JPanel();
        lblTieuDe1 = new javax.swing.JLabel();
        pnlDanhSachKhachHang = new javax.swing.JPanel();
        scrDanhSachNhanVien = new javax.swing.JScrollPane();
        tblDanhSachKhuyenMai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Karaoke MMM\n");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblCapNhat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMaKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblMaKhachHang.setText("Mã khuyến mãi:");
        lblCapNhat.add(lblMaKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 21, -1, -1));

        lblNgaySinh.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblNgaySinh.setText("Ngày bắt đầu:");
        lblCapNhat.add(lblNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 35));

        txtMaKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapNhat.add(txtMaKhuyenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 260, 40));

        lblSoDT1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSoDT1.setText("Chiết khấu:");
        lblCapNhat.add(lblSoDT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblSoCCD.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSoCCD.setText("Ngày kết thúc:");
        lblCapNhat.add(lblSoCCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        txtMoTa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMoTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });
        lblCapNhat.add(txtMoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 260, 40));

        lblDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblDiaChi.setText("Mô tả:");
        lblCapNhat.add(lblDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        txtChietKhau.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtChietKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChietKhauActionPerformed(evt);
            }
        });
        lblCapNhat.add(txtChietKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 260, 40));

        lblSoDT2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSoDT2.setText("Mã giảm giá:");
        lblCapNhat.add(lblSoDT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        lblSoDT3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblSoDT3.setText("Số lượng:");
        lblCapNhat.add(lblSoDT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, -1, -1));

        txtMaGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMaGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaGiamGiaActionPerformed(evt);
            }
        });
        lblCapNhat.add(txtMaGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 260, 40));

        cbSoLuong.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cbSoLuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200" }));
        cbSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSoLuongActionPerformed(evt);
            }
        });
        lblCapNhat.add(cbSoLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 100, 30));

        btnCapNhat.setBackground(new java.awt.Color(255, 153, 102));
        btnCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        btnCapNhat.setText("CẬP NHẬT");
        lblCapNhat.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 210, 50));

        btnThem.setBackground(new java.awt.Color(204, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        lblCapNhat.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 140, 210, 50));

        btnLamMoi.setBackground(new java.awt.Color(51, 204, 255));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clean.png"))); // NOI18N
        btnLamMoi.setText("LÀM MỚI");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        lblCapNhat.add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 70, 200, 50));

        dateNgayBD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapNhat.add(dateNgayBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 260, 40));

        dateNgayKT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCapNhat.add(dateNgayKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 260, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("DANH SÁCH KHÁCH KHUYẾN MÃI:");
        lblCapNhat.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 26));

        pnTieuDe.setBackground(new java.awt.Color(102, 0, 0));

        lblTieuDe1.setBackground(new java.awt.Color(102, 0, 0));
        lblTieuDe1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTieuDe1.setForeground(new java.awt.Color(242, 242, 242));
        lblTieuDe1.setText("QUẢN LÍ THÔNG TIN KHUYẾN MÃI");

        javax.swing.GroupLayout pnTieuDeLayout = new javax.swing.GroupLayout(pnTieuDe);
        pnTieuDe.setLayout(pnTieuDeLayout);
        pnTieuDeLayout.setHorizontalGroup(
            pnTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTieuDeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTieuDe1)
                .addGap(556, 556, 556))
        );
        pnTieuDeLayout.setVerticalGroup(
            pnTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTieuDeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTieuDe1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        scrDanhSachNhanVien.setBorder(null);

        tblDanhSachKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblDanhSachKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã khuyến mãi", "Mã giảm giá", "Chiết khấu", "Số lượng khuyến mãi", "Ngày bắt đầu", "Ngày kết thúc", "Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDanhSachKhuyenMai.setRowHeight(25);
        tblDanhSachKhuyenMai.setSelectionBackground(new java.awt.Color(51, 153, 255));
        scrDanhSachNhanVien.setViewportView(tblDanhSachKhuyenMai);

        javax.swing.GroupLayout pnlDanhSachKhachHangLayout = new javax.swing.GroupLayout(pnlDanhSachKhachHang);
        pnlDanhSachKhachHang.setLayout(pnlDanhSachKhachHangLayout);
        pnlDanhSachKhachHangLayout.setHorizontalGroup(
            pnlDanhSachKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachKhachHangLayout.createSequentialGroup()
                .addComponent(scrDanhSachNhanVien)
                .addContainerGap())
        );
        pnlDanhSachKhachHangLayout.setVerticalGroup(
            pnlDanhSachKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrDanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 1518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(pnlDanhSachKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDanhSachKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                       
    private void txtChietKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChietKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChietKhauActionPerformed

    private void txtMoTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoTaActionPerformed

    private void cbSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSoLuongActionPerformed

    private void txtMaGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaGiamGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaGiamGiaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        String gioiTinh = "";
//        if (txtMaKhuyenMai.getText().equals("") ||txtTenKhachHang.getText().equals("")||txtSoDT.getText().equals("")||
//            txtMaGiamGia.getText().equals("")|| txtChietKhau.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "Bạn chưa điền đủ thông tin");
//            return;
//        }
//        if (radNam.isSelected()) {
//            gioiTinh = "Nam";
//        } else if (radNu.isSelected()) {
//            gioiTinh = "Nữ";
//        } else {
//            JOptionPane.showMessageDialog(this,"Bạn chưa điền đủ thông tin");
//            return;
//        }
//        String maKH = txtMaKhuyenMai.getText();
//        String tenKH = txtTenKhachHang.getText();
//        Date ngaySinh = dateNgaySinh.getDate(); // Updated to use dateNgaySinh
//        if (ngaySinh == null) {
//            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày sinh");
//            return;
//        }
//        String soDT = txtSoDT.getText();
//        String soCCCD = txtMaGiamGia.getText();
//        String diaChi = txtChietKhau.getText();
//
//        KhachHang kh = new KhachHang(maKH, tenKH, gioiTinh, ngaySinh, soDT, soCCCD, diaChi);
//        model = (DefaultTableModel)tblDanhSachKhachHang.getModel();
//
//        for (int i = 0; i < model.getRowCount(); i++) {
//            if (model.getValueAt(i, 1).equals(maKH)) {
//                JOptionPane.showMessageDialog(this, "Mã khách hàng đã tồn tại");
//                return;
//            }
//        }
//        try {
//            kh_dao.themKhachHang(kh);
//            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getGioiTinh(), df.format(kh.getNgaySinh()), kh.getSoDT(), kh.getSoCCCD(), kh.getDiaChi()});
//            JOptionPane.showMessageDialog(this, "Thêm thành công");
//        } catch (Exception e2) {
//            e2.printStackTrace();
//        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtMaKhuyenMai.setText("");
        txtMaGiamGia.setText("");
        txtChietKhau.setText("");
        txtMoTa.setText("");
        dateNgayBD.setDate(null);
        dateNgayKT.setDate(null);
        txtMaKhuyenMai.requestFocus();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {       
            docDuLieuVaoBang();
            System.out.println("Doc Thanh Cong");
        } catch (SQLException ex) {
            System.out.println("Loi");
        }
    }//GEN-LAST:event_formComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICapNhatKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbSoLuong;
    private com.toedter.calendar.JDateChooser dateNgayBD;
    private com.toedter.calendar.JDateChooser dateNgayKT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel lblCapNhat;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaKhachHang;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSoCCD;
    private javax.swing.JLabel lblSoDT1;
    private javax.swing.JLabel lblSoDT2;
    private javax.swing.JLabel lblSoDT3;
    private javax.swing.JLabel lblTieuDe1;
    private javax.swing.JPanel pnTieuDe;
    private javax.swing.JPanel pnlDanhSachKhachHang;
    private javax.swing.JScrollPane scrDanhSachNhanVien;
    private javax.swing.JTable tblDanhSachKhuyenMai;
    private javax.swing.JTextField txtChietKhau;
    private javax.swing.JTextField txtMaGiamGia;
    private javax.swing.JTextField txtMaKhuyenMai;
    private javax.swing.JTextField txtMoTa;
    // End of variables declaration//GEN-END:variables
}
