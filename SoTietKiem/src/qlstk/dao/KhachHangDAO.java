package qlstk.dao;

import qlstk.model.entity.KhachHang;
import java.util.List;
import java.util.ArrayList;

public class KhachHangDAO {
    private final String fileName = "KH.DAT";

    public void add(KhachHang kh) {
        List<KhachHang> list = getAll();
        list.add(kh);
        FileUtil.writeFile(fileName, list);
    }

    public List<KhachHang> getAll() {
        List<KhachHang> list = FileUtil.readFile(fileName);
        return list != null ? list : new ArrayList<>();
    }

    public void updateAll(List<KhachHang> list) {
        FileUtil.writeFile(fileName, list);
    }
}
