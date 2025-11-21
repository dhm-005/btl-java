package qlstk.dao;

import qlstk.model.entity.NganHang;
import java.util.List;
import java.util.ArrayList;

public class NganHangDAO {
    private final String fileName = "NGANHANG.DAT";

    public void add(NganHang nh) {
        List<NganHang> list = getAll();
        list.add(nh);
        FileUtil.writeFile(fileName, list);
    }

    public List<NganHang> getAll() {
        List<NganHang> list = FileUtil.readFile(fileName);
        return list != null ? list : new ArrayList<>();
    }

    public void updateAll(List<NganHang> list) {
        FileUtil.writeFile(fileName, list);
    }
}
