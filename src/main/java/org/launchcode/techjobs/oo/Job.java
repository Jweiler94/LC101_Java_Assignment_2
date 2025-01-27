package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    public String toString (Job this) {

        String stringName, stringEmployer, stringLocation, stringPosition, stringCore;

        if (this.getName() == null) {
            stringName = "Data not available";
        } else {
            stringName = this.getName();
        }

        if (this.getEmployer().getValue() == null) {
            stringEmployer = "Data not available";
        } else if (this.getEmployer().getValue().isEmpty()){
            stringEmployer = "Data not available";
        } else {
            stringEmployer = this.getEmployer().getValue();
        }

        if (this.getLocation().getValue() == null) {
            stringLocation = "Data not available";
        } else if (this.getLocation().getValue().isEmpty()){
            stringLocation = "Data not available";
        } else {
            stringLocation = this.getLocation().getValue();
        }

        if(this.getPositionType().getValue() == null) {
            stringPosition = "Data not available";
        } else if (this.getPositionType().getValue().isEmpty()){
            stringPosition = "Data not available";
        } else {
            stringPosition = this.getPositionType().getValue();
        }

        if (this.getCoreCompetency().getValue() == null) {
            stringCore = "Data not available";
        } else if (this.getCoreCompetency().getValue().isEmpty()){
            stringCore = "Data not available";
        } else {
            stringCore = this.getCoreCompetency().getValue();
        }


        String toStringReturn = String.format(System.lineSeparator() +
                "ID: " + this.getId() + System.lineSeparator() +
                "Name: " + stringName + System.lineSeparator() +
                "Employer: " + stringEmployer + System.lineSeparator() +
                "Location: " + stringLocation + System.lineSeparator() +
                "Position Type: " + stringPosition + System.lineSeparator() +
                "Core Competency: " + stringCore + System.lineSeparator());

        return toStringReturn;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == ((Job) o).getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
