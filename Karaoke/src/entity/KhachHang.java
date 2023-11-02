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
public class KhachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private boolean gioiTinh;
    private Date ngaySinh;
    private String soDT;
    private String soCCCD;

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }


    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String tenKhachHang, boolean gioiTinh, Date ngaySinh, String soDT, String soCCCD) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDT = soDT;
        this.soCCCD = soCCCD;
    }
}
