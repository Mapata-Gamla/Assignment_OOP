package _27926.q1;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) {
            throw new HospitalDataException("ID must be > 0");
        }
        if (createdDate == null || createdDate.isEmpty()) {
            throw new HospitalDataException("createdDate cannot be empty");
        }
        if (updatedDate == null || updatedDate.isEmpty()) {
            throw new HospitalDataException("updatedDate cannot be empty");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        if (updatedDate == null || updatedDate.isEmpty()) {
            throw new HospitalDataException("updatedDate cannot be empty");
        }
        this.updatedDate = updatedDate;
    }
}
