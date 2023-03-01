package kiemtra;

public class KyThuat extends NhanVien {
    private String Major;

    public KyThuat() {
    }

    @Override
    public String moTaCongViec() {
        return Major;
    }

    public KyThuat(String ID) {
        super(ID);
    }

    public KyThuat(String ID, String name, String dob, String address, String major) {
        super(ID, name, dob, address);
        Major = major;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    @Override
    public String toString() {
        return "Kythuat[" + super.toString() +"Major='" + Major + '\'' +
                ']';
    }
}