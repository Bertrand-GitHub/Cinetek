package bzh.eni.cinetek.bo;

public class Actor {
    private int actorId;
    private String firstname;
    private String lastname;

    public Actor(int actorId, String firstname, String lastname) {
        this.actorId = actorId;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actorId=" + actorId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
