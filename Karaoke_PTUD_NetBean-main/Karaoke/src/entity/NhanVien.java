/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Duong Ngo Manh
 */
public class NhanVien {
    private String maNhanVien;
    private String maChucVu;
    private String tenNhanVien;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String soDienThoai;
    private String diaChi;
    private String matKhau;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String maChucVu, String tenNhanVien, boolean gioiTinh, Date ngaySinh, String soDienThoai, String diaChi, String matKhau) {
        this.maNhanVien = maNhanVien;
        this.maChucVu = maChucVu;
        this.tenNhanVien = tenNhanVien;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.matKhau = matKhau;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.maNhanVien);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        return Objects.equals(this.maNhanVien, other.maNhanVien);
    }
    
    

    @Override
    public String toString() {
        return "NhanVien{" + "maNhanVien=" + maNhanVien + ", maChucVu=" + maChucVu + ", tenNhanVien=" + tenNhanVien + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", soDienThoai=" + soDienThoai + ", diaChi=" + diaChi + ", matKhau=" + matKhau + '}';
    }
    
}
