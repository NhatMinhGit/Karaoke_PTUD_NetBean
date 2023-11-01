/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import connectdb.ConnectDB;
import dao.Phong_DAO;
import entity.Phong;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Duong Ngo Manh
 */
public class GUITimKiemPhong extends javax.swing.JFrame {
    Phong_DAO p_dao = new Phong_DAO();
    DefaultTableModel dftbl ;
    
    /**
     * Creates new form GUIThongTinPhong
     */
    public GUITimKiemPhong() {
        try {
            ConnectDB.getInstance().connect();
	} catch (SQLException e) {
            e.printStackTrace();
	}
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlThongTinPhong = new javax.swing.JPanel();
        lblMaPhong = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        cboLoaiPhong = new javax.swing.JComboBox<>();
        cboTrangThai = new javax.swing.JComboBox<>();
        pnlTieuDe = new javax.swing.JPanel();
        lblTieuDe = new javax.swing.JLabel();
        scrDanhSachPhong = new javax.swing.JScrollPane();
        tblDanhSachPhong = new javax.swing.JTable();
        btnTimPhong = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        mnuTong = new javax.swing.JMenuBar();
        mnHeThong = new javax.swing.JMenu();
        mniTrangChu = new javax.swing.JMenuItem();
        mniTroGiup = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mnuPhong = new javax.swing.JMenu();
        mniCapNhatPhong = new javax.swing.JMenuItem();
        mniCapNhatLoaiPhong = new javax.swing.JMenuItem();
        mniTimKiemPhong = new javax.swing.JMenuItem();
        mniDatPhong = new javax.swing.JMenuItem();
        mniDatPhongCho = new javax.swing.JMenuItem();
        mnuNhanVien = new javax.swing.JMenu();
        mniCapNhatNhanVien = new javax.swing.JMenuItem();
        mniTimKiemNhanVien = new javax.swing.JMenuItem();
        mnuKhachHang = new javax.swing.JMenu();
        mniCapNhatKhachHang = new javax.swing.JMenuItem();
        mniTimKiemKhachHang = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniThongKeDoanhThu = new javax.swing.JMenuItem();
        mniThongKeDoanhThuTheoKhachHang = new javax.swing.JMenuItem();
        mnuHoaDon = new javax.swing.JMenu();
        mniLapHoaDon = new javax.swing.JMenuItem();
        mniThanhToan = new javax.swing.JMenuItem();
        mnuDichVu = new javax.swing.JMenu();
        mniCapNhatDichVu = new javax.swing.JMenuItem();
        mniTimKiemDichVu = new javax.swing.JMenuItem();
        mnuKhuyenMai = new javax.swing.JMenu();
        mniCapNhatKhuyenMai = new javax.swing.JMenuItem();
        mniTimKiemKhuyenMai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblMaPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMaPhong.setText("Loại phòng:");

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTrangThai.setText("Trạng thái:");

        cboLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LP001", "LP002" }));

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trống", "Đầy", "Chờ" }));

        javax.swing.GroupLayout pnlThongTinPhongLayout = new javax.swing.GroupLayout(pnlThongTinPhong);
        pnlThongTinPhong.setLayout(pnlThongTinPhongLayout);
        pnlThongTinPhongLayout.setHorizontalGroup(
            pnlThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaPhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lblTrangThai)
                .addGap(31, 31, 31)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlThongTinPhongLayout.setVerticalGroup(
            pnlThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlThongTinPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTrangThai)
                    .addGroup(pnlThongTinPhongLayout.createSequentialGroup()
                        .addGroup(pnlThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaPhong)
                            .addComponent(cboLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlTieuDe.setBackground(new java.awt.Color(102, 0, 0));

        lblTieuDe.setBackground(new java.awt.Color(102, 0, 0));
        lblTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTieuDe.setForeground(new java.awt.Color(242, 242, 242));
        lblTieuDe.setText("TÌM KIẾM PHÒNG");

        javax.swing.GroupLayout pnlTieuDeLayout = new javax.swing.GroupLayout(pnlTieuDe);
        pnlTieuDe.setLayout(pnlTieuDeLayout);
        pnlTieuDeLayout.setHorizontalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTieuDeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTieuDe)
                .addGap(531, 531, 531))
        );
        pnlTieuDeLayout.setVerticalGroup(
            pnlTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTieuDeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTieuDe)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tblDanhSachPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Mã loại phòng", "Tên phòng", "Giá phòng", "Số người", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDanhSachPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachPhongMouseClicked(evt);
            }
        });
        tblDanhSachPhong.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tblDanhSachPhongComponentShown(evt);
            }
        });
        scrDanhSachPhong.setViewportView(tblDanhSachPhong);

        btnTimPhong.setBackground(new java.awt.Color(153, 255, 255));
        btnTimPhong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTimPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        btnTimPhong.setText("Tìm kiếm");
        btnTimPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimPhongActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(153, 255, 153));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clean.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        mnuTong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/system.png"))); // NOI18N
        mnHeThong.setText("Hệ Thống");
        mnHeThong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mniTrangChu.setText("Trang chủ");
        mniTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTrangChuActionPerformed(evt);
            }
        });
        mnHeThong.add(mniTrangChu);

        mniTroGiup.setText("Trợ giúp");
        mniTroGiup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTroGiupActionPerformed(evt);
            }
        });
        mnHeThong.add(mniTroGiup);

        mniDangXuat.setText("Đăng xuất");
        mnHeThong.add(mniDangXuat);

        mnuTong.add(mnHeThong);

        mnuPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        mnuPhong.setText("Phòng");
        mnuPhong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mniCapNhatPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/room (1).png"))); // NOI18N
        mniCapNhatPhong.setText("Cập nhật phòng");
        mniCapNhatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatPhongActionPerformed(evt);
            }
        });
        mnuPhong.add(mniCapNhatPhong);

        mniCapNhatLoaiPhong.setText("Cập nhật loại phòng");
        mniCapNhatLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatLoaiPhongActionPerformed(evt);
            }
        });
        mnuPhong.add(mniCapNhatLoaiPhong);

        mniTimKiemPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        mniTimKiemPhong.setText("Tìm kiếm phòng");
        mniTimKiemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemPhongActionPerformed(evt);
            }
        });
        mnuPhong.add(mniTimKiemPhong);

        mniDatPhong.setText("Đặt phòng");
        mniDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDatPhongActionPerformed(evt);
            }
        });
        mnuPhong.add(mniDatPhong);

        mniDatPhongCho.setText("Đặt phòng chờ");
        mniDatPhongCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDatPhongChoActionPerformed(evt);
            }
        });
        mnuPhong.add(mniDatPhongCho);

        mnuTong.add(mnuPhong);

        mnuNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nhanvien.png"))); // NOI18N
        mnuNhanVien.setText("Nhân viên");
        mnuNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mniCapNhatNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/patient.png"))); // NOI18N
        mniCapNhatNhanVien.setText("Cập nhật nhân viên");
        mniCapNhatNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatNhanVienActionPerformed(evt);
            }
        });
        mnuNhanVien.add(mniCapNhatNhanVien);

        mniTimKiemNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        mniTimKiemNhanVien.setText("Tìm kiếm nhân viên");
        mniTimKiemNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemNhanVienActionPerformed(evt);
            }
        });
        mnuNhanVien.add(mniTimKiemNhanVien);

        mnuTong.add(mnuNhanVien);

        mnuKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/khachHang.png"))); // NOI18N
        mnuKhachHang.setText("Khách hàng");
        mnuKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mniCapNhatKhachHang.setText("Cập nhật khách hàng");
        mniCapNhatKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatKhachHangActionPerformed(evt);
            }
        });
        mnuKhachHang.add(mniCapNhatKhachHang);

        mniTimKiemKhachHang.setText("Tìm kiếm khách hàng");
        mniTimKiemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemKhachHangActionPerformed(evt);
            }
        });
        mnuKhachHang.add(mniTimKiemKhachHang);

        mnuTong.add(mnuKhachHang);

        mnuThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/thongke.png"))); // NOI18N
        mnuThongKe.setText("Thống Kê");
        mnuThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mniThongKeDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trend.png"))); // NOI18N
        mniThongKeDoanhThu.setText("Thống kê doanh thu");
        mniThongKeDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniThongKeDoanhThu);

        mniThongKeDoanhThuTheoKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stats.png"))); // NOI18N
        mniThongKeDoanhThuTheoKhachHang.setText("Thống kê doanh thu theo khách hàng");
        mniThongKeDoanhThuTheoKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongKeDoanhThuTheoKhachHangActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniThongKeDoanhThuTheoKhachHang);

        mnuTong.add(mnuThongKe);

        mnuHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hoadon.png"))); // NOI18N
        mnuHoaDon.setText("Hoá đơn");
        mnuHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mniLapHoaDon.setText("Lập hoá đơn");
        mniLapHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLapHoaDonActionPerformed(evt);
            }
        });
        mnuHoaDon.add(mniLapHoaDon);

        mniThanhToan.setText("Thanh toán");
        mniThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThanhToanActionPerformed(evt);
            }
        });
        mnuHoaDon.add(mniThanhToan);

        mnuTong.add(mnuHoaDon);

        mnuDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dichvu.png"))); // NOI18N
        mnuDichVu.setText("Dịch vụ");
        mnuDichVu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mniCapNhatDichVu.setText("Cập nhật dịch vụ");
        mniCapNhatDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatDichVuActionPerformed(evt);
            }
        });
        mnuDichVu.add(mniCapNhatDichVu);

        mniTimKiemDichVu.setText("Tìm kiếm dịch vụ");
        mniTimKiemDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemDichVuActionPerformed(evt);
            }
        });
        mnuDichVu.add(mniTimKiemDichVu);

        mnuTong.add(mnuDichVu);

        mnuKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/khuyenmai.png"))); // NOI18N
        mnuKhuyenMai.setText("Khuyến mãi");
        mnuKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        mniCapNhatKhuyenMai.setText("Cập nhật khuyến mãi");
        mniCapNhatKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCapNhatKhuyenMaiActionPerformed(evt);
            }
        });
        mnuKhuyenMai.add(mniCapNhatKhuyenMai);

        mniTimKiemKhuyenMai.setText("Tìm kiếm khuyến mãi");
        mniTimKiemKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTimKiemKhuyenMaiActionPerformed(evt);
            }
        });
        mnuKhuyenMai.add(mniTimKiemKhuyenMai);

        mnuTong.add(mnuKhuyenMai);

        setJMenuBar(mnuTong);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrDanhSachPhong)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlThongTinPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(661, 661, 661)
                        .addComponent(btnTimPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(pnlThongTinPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTimPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(scrDanhSachPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTrangChuActionPerformed
        GUITrangChu tc = new GUITrangChu();
        tc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTrangChuActionPerformed

    private void mniTroGiupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTroGiupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniTroGiupActionPerformed

    private void mniCapNhatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatPhongActionPerformed
        GUICapNhatPhong cnp = new GUICapNhatPhong();
        cnp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatPhongActionPerformed

    private void mniCapNhatLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatLoaiPhongActionPerformed
        GUICapNhatLoaiPhong cnlp = new GUICapNhatLoaiPhong();
        cnlp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatLoaiPhongActionPerformed

    private void mniTimKiemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemPhongActionPerformed
        GUITimKiemPhong tkp = new GUITimKiemPhong();
        tkp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemPhongActionPerformed

    private void mniDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDatPhongActionPerformed
        // TODO add your handling code here:
        GUIDatPhong ttdp = new GUIDatPhong();
        ttdp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniDatPhongActionPerformed

    private void mniDatPhongChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDatPhongChoActionPerformed
        GUIDatPhongCho dpc = new GUIDatPhongCho();
        dpc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniDatPhongChoActionPerformed

    private void mniCapNhatNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatNhanVienActionPerformed
        GUICapNhatNhanVien cnnv = new GUICapNhatNhanVien();
        cnnv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatNhanVienActionPerformed

    private void mniTimKiemNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemNhanVienActionPerformed
        GUITimKiemNhanVien tknv = new GUITimKiemNhanVien();
        tknv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemNhanVienActionPerformed

    private void mniCapNhatKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatKhachHangActionPerformed
        GUICapNhatKhachHang cnkh = new GUICapNhatKhachHang();
        cnkh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatKhachHangActionPerformed

    private void mniTimKiemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemKhachHangActionPerformed
        GUITimKiemKhachHang tkkh = new GUITimKiemKhachHang();
        tkkh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemKhachHangActionPerformed

    private void mniThongKeDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeDoanhThuActionPerformed
        GUIThongKeDoanhThu tkdt = new GUIThongKeDoanhThu();
        tkdt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniThongKeDoanhThuActionPerformed

    private void mniThongKeDoanhThuTheoKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongKeDoanhThuTheoKhachHangActionPerformed
        GUIThongKeKhachHang tkdtkh = new GUIThongKeKhachHang();
        tkdtkh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniThongKeDoanhThuTheoKhachHangActionPerformed

    private void mniLapHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLapHoaDonActionPerformed
        GUILapHoaDon lhd = new GUILapHoaDon();
        lhd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniLapHoaDonActionPerformed

    private void mniThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThanhToanActionPerformed
        GUIThanhToan tt = new GUIThanhToan();
        tt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniThanhToanActionPerformed

    private void mniCapNhatDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatDichVuActionPerformed
        GUICapNhatDichVu cndv = new GUICapNhatDichVu();
        cndv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatDichVuActionPerformed

    private void mniTimKiemDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemDichVuActionPerformed
        GUITimKiemDichVu tkdv = new GUITimKiemDichVu();
        tkdv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemDichVuActionPerformed

    private void mniCapNhatKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCapNhatKhuyenMaiActionPerformed
        GUICapNhatKhuyenMai cnkm = new GUICapNhatKhuyenMai();
        cnkm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniCapNhatKhuyenMaiActionPerformed

    private void mniTimKiemKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTimKiemKhuyenMaiActionPerformed
        GUITimKiemKhuyenMai tkkm = new GUITimKiemKhuyenMai();
        tkkm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mniTimKiemKhuyenMaiActionPerformed

    private void tblDanhSachPhongComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblDanhSachPhongComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_tblDanhSachPhongComponentShown
    public void docDuLieuTuDataVaoTableDanhSachPhong() throws SQLException 
	{
//            DichVu_DAO dv_dao = new DichVu_DAO();
//            DefaultTableModel dftbl = (DefaultTableModel)tblDanhSachDichVu.getModel();
//            dftbl.setColumnCount(0);
//            for(int i = 0;i < dsdv.size();i++)
//            {
//                String madv = dsdv.get(i).getMaDV();
//                String tendv = dsdv.get(i).getTenDV();
//                int soluong = dsdv.get(i).getSoLuong();
//                double dongia = dsdv.get(i).getGiaBan();
//                String dvt = dsdv.get(i).getDonViTinh();
//                boolean ttdv = dsdv.get(i).isTrangThaiDV();
//                Object[] row = new Object[]{madv,tendv,soluong,dongia,dvt,ttdv};
//                dftbl.addRow(row);
//            }
            ///
//            try{
//            tblDanhSachDichVu.removeAll();
//            String[] arr = {"Mã dịch vụ","Tên dịch vụ","Số lượng dịch vụ","Giá bán","Đơn vị tính","Trạng thái dịch vụ"};
//            DefaultTableModel mdlPhong = new DefaultTableModel(arr,0); 
//            
//            Connection connection = ConnectDB.getConnection();
//            String query = "SELECT * FROM DichVu";
//            PreparedStatement ps = connection.prepareStatement(query);
//            ResultSet rs = ps.executeQuery();
//            
//            while(rs.next()){
//                DichVu dv = new DichVu();
//                dv.add(rs.getString(1));
//                dv.add(rs.getString(2));
//                dv.add(rs.getInt(3));
//                dv.add(rs.getString(4));
//                dv.add(rs.getInt(5));
//                dv.add(rs.getBoolean(6));
//                mdlPhong.addRow(dv);
//            }
//            tblDanhSachDichVu.setModel(mdlPhong);
//            }catch(SQLException ex){
//                Logger.getLogger(GUIDatPhongCho.class.getName()).log(Level.SEVERE, null,ex);
//            }
            ///
            
            DefaultTableModel dftbl = (DefaultTableModel)tblDanhSachPhong.getModel();
            ArrayList<Phong> listp = p_dao.getAllPhong();
		for(Phong x : listp)
		{
			dftbl.addRow(new Object[] {x.getMaPhong(),x.getLoaiPhong().getMaLoaiPhong(),x.getTenPhong(),x.getGiaPhong(),x.getSoNguoiToiDa(),x.getTrangThaiPhong()});
		}
        }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try {       
            //themDuLieuComboBox();
            docDuLieuTuDataVaoTableDanhSachPhong();
            System.out.println("Đọc thành công");
        } catch (SQLException ex) {
            System.out.println("Đọc lỗi");
        }
    }//GEN-LAST:event_formComponentShown

    private void btnTimPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimPhongActionPerformed
        // TODO add your handling code here:
        String maLP = (String)cboLoaiPhong.getSelectedItem();
        String trangThaiP = (String)cboTrangThai.getSelectedItem();
        DefaultTableModel dftbl = (DefaultTableModel)tblDanhSachPhong.getModel();
	ArrayList<Phong> dsp = p_dao.locPhong(maLP,trangThaiP);
	dftbl.setRowCount(0);
	for(Phong x : dsp)
	{					
		dftbl.addRow(new Object[] {x.getMaPhong(),x.getLoaiPhong().getMaLoaiPhong(),x.getTenPhong(),x.getGiaPhong(),x.getSoNguoiToiDa(),x.getTrangThaiPhong()});
	}
	
    }//GEN-LAST:event_btnTimPhongActionPerformed
    private void themDuLieuComboBox() throws SQLException{
        ArrayList<Phong> dsP = p_dao.getAllPhong();
		for(Phong x : dsP)
		{
			cboLoaiPhong.addItem(x.getLoaiPhong().getMaLoaiPhong());
                        cboTrangThai.addItem(x.getTrangThaiPhong());
		}
    }
    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        cboLoaiPhong.setSelectedIndex(0);
        cboTrangThai.setSelectedIndex(0);
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblDanhSachPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachPhongMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDanhSachPhongMouseClicked

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
            java.util.logging.Logger.getLogger(GUITimKiemPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITimKiemPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITimKiemPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITimKiemPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITimKiemPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnTimPhong;
    private javax.swing.JComboBox<String> cboLoaiPhong;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel lblMaPhong;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenu mnHeThong;
    private javax.swing.JMenuItem mniCapNhatDichVu;
    private javax.swing.JMenuItem mniCapNhatKhachHang;
    private javax.swing.JMenuItem mniCapNhatKhuyenMai;
    private javax.swing.JMenuItem mniCapNhatLoaiPhong;
    private javax.swing.JMenuItem mniCapNhatNhanVien;
    private javax.swing.JMenuItem mniCapNhatPhong;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDatPhong;
    private javax.swing.JMenuItem mniDatPhongCho;
    private javax.swing.JMenuItem mniLapHoaDon;
    private javax.swing.JMenuItem mniThanhToan;
    private javax.swing.JMenuItem mniThongKeDoanhThu;
    private javax.swing.JMenuItem mniThongKeDoanhThuTheoKhachHang;
    private javax.swing.JMenuItem mniTimKiemDichVu;
    private javax.swing.JMenuItem mniTimKiemKhachHang;
    private javax.swing.JMenuItem mniTimKiemKhuyenMai;
    private javax.swing.JMenuItem mniTimKiemNhanVien;
    private javax.swing.JMenuItem mniTimKiemPhong;
    private javax.swing.JMenuItem mniTrangChu;
    private javax.swing.JMenuItem mniTroGiup;
    private javax.swing.JMenu mnuDichVu;
    private javax.swing.JMenu mnuHoaDon;
    private javax.swing.JMenu mnuKhachHang;
    private javax.swing.JMenu mnuKhuyenMai;
    private javax.swing.JMenu mnuNhanVien;
    private javax.swing.JMenu mnuPhong;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenuBar mnuTong;
    private javax.swing.JPanel pnlThongTinPhong;
    private javax.swing.JPanel pnlTieuDe;
    private javax.swing.JScrollPane scrDanhSachPhong;
    private javax.swing.JTable tblDanhSachPhong;
    // End of variables declaration//GEN-END:variables
}
