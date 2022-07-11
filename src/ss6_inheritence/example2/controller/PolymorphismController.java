package ss6_inheritence.example2.controller;

import ss6_inheritence.example2.model.*;

public class PolymorphismController {
    public static void main(String[] args) {
        HocVien hocVien = new HocVien();
        if (hocVien instanceof SinhVien) {
            SinhVien sinhVien  = (SinhVien) hocVien;
        }

        HocVien[] dsHocVien = new HocVien[2];
        dsHocVien[0] = new SinhVien();
        dsHocVien[1] = new NVThuViec();

        for (int i = 0; i < dsHocVien.length; i++) {
            if (dsHocVien[i] instanceof SinhVien) {
                SinhVien sinhVien = (SinhVien) dsHocVien[i];
                sinhVien.run();
            } else if (dsHocVien[i] instanceof NVThuViec) {
                NVThuViec nVThuViec = (NVThuViec) dsHocVien[i];
                nVThuViec.make();
            }
        }
    }
}
