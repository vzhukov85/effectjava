package item31;

public enum Ensemble {
    SOLO(1),
    DUET(2),
    TRIO(3),
    QUARTET(4),
    QUINTET(5),
    SEXTET(6),
    SEPTET(7),
    OCTET(8),
    DOUBLE_OCTET(8),
    NONET(9),
    DECTET(10),
    TRIPLE_QUARTET(12);

    private final int numberOfMusicants;

    Ensemble(int numberOfMusicants) {
        this.numberOfMusicants = numberOfMusicants;
    }
    public int numberOfMusicians() { return numberOfMusicants; }

}
