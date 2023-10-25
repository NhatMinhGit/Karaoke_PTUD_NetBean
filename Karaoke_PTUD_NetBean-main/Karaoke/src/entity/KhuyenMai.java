/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class KhuyenMai {
    private String maKhuyenMai;
    private String maGiamGia;
    private int chietKhau;
    private int soLuong;
    private Date ngayBatDau;
    private Date ngayKetThuc;

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public String getMaGiamGia() {
        return maGiamGia;
    }

    public int getChietKhau() {
        return chietKhau;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public void setMaGiamGia(String maGiamGia) {
        this.maGiamGia = maGiamGia;
    }

    public void setChietKhau(int chietKhau) {
        this.chietKhau = chietKhau;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.maKhuyenMai);
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
        final KhuyenMai other = (KhuyenMai) obj;
        return true;
    }

    public KhuyenMai() {
    }

    public KhuyenMai(String maKhuyenMai, String maGiamGia, int chietKhau, int soLuong, Date ngayBatDau, Date ngayKetThuc) {
        this.maKhuyenMai = maKhuyenMai;
        this.maGiamGia = maGiamGia;
        this.chietKhau = chietKhau;
        this.soLuong = soLuong;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "maKhuyenMai=" + maKhuyenMai + ", maGiamGia=" + maGiamGia + ", chietKhau=" + chietKhau + ", soLuong=" + soLuong + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + '}';
    }
    
    
}
