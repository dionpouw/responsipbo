package responsi3;

// class yang mengimplementasikan hari dalam seminggu
class DayWeek {
    private int value; // variabel yang tersembunyi

    // class constructor, menginisialisasi variabel nilai
    DayWeek() {
        value = 1; // default adalah "Monday"
    }

    // akses metode
    // metode yang mengembalikan data di kelas
    public int Get() {
        return value;
    }

    // metode yang menetapkan hari baru dalam seminggu
    public void Set(int _value) {
        // metode memeriksa kebenaran nilai _value
        if ((_value>=1)&&(_value<=7))
            value = _value;
    }

    // metode tambahan
    // mengembalikan nama hari dalam seminggu yang nilainya sesuai
    public String GetName() {
        String day = "Monday";
        switch (value) {
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            case 7: day = "Sunday"; break;
        }
        return day;
    }
}