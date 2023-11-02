public class Covid19Data {
    private String region;
    private String ageGroups;
    private int confirmedCases;
    private int casualties;
    private int admittedICU;
    private int admitted;
    private String date;

    public Covid19Data(String region, String ageGroups, int confirmedCases, int casualties, int admittedICU, int admitted, String date) {
        this.region = region;
        this.ageGroups = ageGroups;
        this.confirmedCases = confirmedCases;
        this.casualties = casualties;
        this.admittedICU = admittedICU;
        this.admitted = admitted;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", ageGroups='" + ageGroups + '\'' +
                ", confirmedCases=" + confirmedCases +
                ", casualties=" + casualties +
                ", admittedICU=" + admittedICU +
                ", admitted=" + admitted +
                ", date='" + date + '\'' +
                '}';
    }
}
