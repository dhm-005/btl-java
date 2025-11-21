package qlstk.model.entity;

import qlstk.model.interfaces.IFileEntity;
import qlstk.model.interfaces.IAutoId;
import java.io.Serializable;

public class KhachHang implements Serializable, IAutoId, IFileEntity  {
    private static int id = 10000;
    private int maKH;
    private String hoTen;
    private String diaChi;
    private String loaiKH;

    public KhachHang() {
    }

    public KhachHang(int maKH, String hoTen, String diaChi, String loaiKH) {
        this.maKH = id++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiKH = loaiKH;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiKH() {
        return loaiKH;
    }

    public void setLoaiKH(String loaiKH) {
        this.loaiKH = loaiKH;
    }
    @Override
    public String toString(){
        return String.format("%05d %s %s %s", maKH, hoTen, diaChi, loaiKH);
    }
}

