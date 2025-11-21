package qlstk.model.business;

import qlstk.model.entity.SoTietKiem;
import qlstk.model.entity.KhachHang;
import java.util.*;

public class SoTietKiemCalculator {

    private List<SoTietKiem> dsSoTK;

    public SoTietKiemCalculator(List<SoTietKiem> dsSoTK) {
        this.dsSoTK = dsSoTK != null ? dsSoTK : new ArrayList<>();
    }

    // 1. Tổng tiền gửi theo khách hàng
    public Map<Integer, Double> tongTienTheoKhachHang() {
        Map<Integer, Double> tongTien = new HashMap<>();
        for (SoTietKiem stk : dsSoTK) {
            int maKH = stk.getKhachHang().getMaKH();
            tongTien.put(maKH, tongTien.getOrDefault(maKH, 0.0) + stk.getSoTienGui());
        }
        return tongTien;
    }

    // 2. Sắp xếp danh sách theo Họ tên khách hàng
    public void sortByHoTen() {
        dsSoTK.sort(Comparator.comparing(stk -> stk.getKhachHang().getHoTen()));
    }

    // 3. Sắp xếp danh sách theo số tiền gửi
    public void sortBySoTien() {
        dsSoTK.sort(Comparator.comparingDouble(SoTietKiem::getSoTienGui));
    }

    // 4. Lấy danh sách Sổ tiết kiệm
    public List<SoTietKiem> getDsSoTK() {
        return dsSoTK;
    }
}
