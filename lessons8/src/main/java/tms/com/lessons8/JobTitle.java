package tms.com.lessons8;

public enum JobTitle {
    WORKER(2),
    DIRECTOR(3);

    private int k;

    JobTitle(int k) {
        this.k = k;
    }

    public int getK() {
        return k;
    }


}
