package factory;

public class Custumer {

    private String gradeRequest;
    private boolean hasCompanyContract;

    public Custumer(String gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }
    public boolean isHasCompanyContract() {
        return hasCompanyContract;
    }
    public String getGradeRequest() {
        return gradeRequest;
    }
}
