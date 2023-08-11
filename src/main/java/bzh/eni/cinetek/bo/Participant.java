package bzh.eni.cinetek.bo;

import lombok.Getter;

public class Participant {
    @Getter
    private int actorId;
    @Getter
    private String firstname;
    @Getter
    private String lastname;
    private Boolean isDirector;
    private Boolean isActor;

    public Participant() {
    }

    public Participant(int actorId, String firstname, String lastname, Boolean isDirector, Boolean isActor) {
        this.actorId = actorId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.isDirector = isDirector;
        this.isActor = isActor;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getDirector() {
        return isDirector;
    }

    public void setDirector(Boolean director) {
        isDirector = director;
    }

    public Boolean getActor() {
        return isActor;
    }

    public void setActor(Boolean actor) {
        isActor = actor;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "actorId=" + actorId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", isDirector=" + isDirector +
                ", isActor=" + isActor +
                '}';
    }
}
