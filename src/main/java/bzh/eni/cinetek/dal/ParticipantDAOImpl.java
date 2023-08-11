package bzh.eni.cinetek.dal;

import bzh.eni.cinetek.bo.Participant;

import java.util.ArrayList;
import java.util.List;

public class ParticipantDAOImpl {
    public void participantList() {

        List<Participant> participants = new ArrayList<>();
        participants.add(new Participant(1, "Tim", "Robbins", false, true));
        participants.add(new Participant(2, "Morgan", "Freeman", true, true));
        participants.add(new Participant(3, "Marlon", "Brando", false, true));
        participants.add(new Participant(4, "Al", "Pacino", false, true));
        participants.add(new Participant(5, "John", "Travolta", false, true));
        participants.add(new Participant(6, "Samuel L.", "Jackson", false, true));
        participants.add(new Participant(7, "Brad", "Pitt", false, true));
        participants.add(new Participant(8, "Edward", "Norton", false, true));
        participants.add(new Participant(9, "Keanu", "Reeves", false, true));
        participants.add(new Participant(10, "Laurence", "Fishburne", false, true));
        participants.add(new Participant(11, "Mark", "Hamill", false, true));
        participants.add(new Participant(12, "Harrison", "Ford", false, true));
        participants.add(new Participant(13, "Elijah", "Wood", false, true));
        participants.add(new Participant(14, "Ian", "McKellen", false, true));
        participants.add(new Participant(15, "Tom", "Hanks", false, true));
        participants.add(new Participant(16, "Robin", "Wright", false, true));
        participants.add(new Participant(17, "Leonardo", "DiCaprio", false, true));
        participants.add(new Participant(18, "Joseph", "Gordon-Levitt", false, true));
        participants.add(new Participant(19, "Christian", "Bale", false, true));
        participants.add(new Participant(20, "Heath", "Ledger", false, true));
        participants.add(new Participant(21, "Jodie", "Foster", false, true));
        participants.add(new Participant(22, "Anthony", "Hopkins", false, true));
        participants.add(new Participant(23, "Michael J.", "Fox", false, true));
        participants.add(new Participant(24, "Christopher", "Lloyd", false, true));
        participants.add(new Participant(25, "Jeff", "Bridges", false, true));
        participants.add(new Participant(26, "John", "Goodman", false, true));
        participants.add(new Participant(27, "Harrison", "Ford", false, true));
        participants.add(new Participant(28, "Rutger", "Hauer", false, true));
        participants.add(new Participant(29, "Emilio", "Estevez", false, true));
        participants.add(new Participant(30, "Judd", "Nelson", false, true));
        participants.add(new Participant(31, "Henry", "Thomas", false, true));
        participants.add(new Participant(32, "Drew", "Barrymore", false, true));
        participants.add(new Participant(33, "Sam", "Neill", false, true));
        participants.add(new Participant(34, "Laura", "Dern", false, true));
        participants.add(new Participant(35, "Cary", "Elwes", false, true));
        participants.add(new Participant(36, "Robin", "Wright", false, true));
        participants.add(new Participant(37, "Sylvester", "Stallone", false, true));
        participants.add(new Participant(38, "Talia", "Shire", false, true));
        participants.add(new Participant(39, "Arnold", "Schwarzenegger", false, true));
        participants.add(new Participant(40, "Linda", "Hamilton", false, true));
    }
}
