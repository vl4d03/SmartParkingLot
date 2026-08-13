import java.util.Objects;

public class ParkingPass {
    private String passID;
    private String ownerName;
    private int accessZone;

    public ParkingPass(String passID, String ownerName, int accessZone) {
        this.setPassID(passID);
        this.setOwnerName(ownerName);
        this.setAccessZone(accessZone);
    }

    public String getPassID() {return passID;}
    public String getOwnerName() {return  ownerName;}
    public int getAccessZone() {return accessZone;}

    private void setPassID(String passID) {
        if(passID != null && !passID.isEmpty()) {
            this.passID = passID;
        } else System.out.println("No Pass ID given. Try one more time.");
    }
    private void setOwnerName(String ownerName) {
        if(ownerName != null && !ownerName.isEmpty()) {
            this.ownerName = ownerName;
        } else System.out.println("No Owner given. Try one more time.");
    }
    private void setAccessZone(int accessZone) {
        if(accessZone > 0) {
            this.accessZone = accessZone;
        } else System.out.println("No Access Zone given. Try one more time.");
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ParkingPass pass = (ParkingPass) o;
        return Objects.equals(passID, pass.passID);
    }
    @Override
    public int hashCode() {
        return Objects.hash(passID);
    }
}
