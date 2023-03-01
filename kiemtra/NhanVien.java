package kiemtra;


public abstract class NhanVien {
    private String ID;
    private String name;
    private String dob;
    private String address;

    public NhanVien() {
    }

    public NhanVien(String ID) {
        this.ID = ID;
    }

    public NhanVien(String ID, String name, String dob, String address) {
        this.ID = ID;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getID() {
        return ID;
    }
    public abstract String moTaCongViec();

    @Override
    public String toString() {
        return "Nhanvien[" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}
