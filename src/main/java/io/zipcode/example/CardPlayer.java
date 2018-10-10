package io.zipcode.example;

import javax.persistence.*;

@Entity
public class CardPlayer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name ="profile_id", nullable = false)
    private Profile profile;

    public CardPlayer(Profile profile){
        this.profile = profile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Double getBalance(){
        this.profile.getBalance();
    }
}
