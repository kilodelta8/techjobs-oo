package org.launchcode.models.forms;

import org.launchcode.models.CoreCompetency;
import org.launchcode.models.Employer;
import org.launchcode.models.Location;
import org.launchcode.models.PositionType;
import org.launchcode.models.data.JobData;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

/**
 * Created by LaunchCode
 */
public class JobForm {

    @NotNull
    @Size(min=1, message = "A Name is Required!!!")
    private String name;

    @NotNull
    private int employerId;

    @NotNull
    private ArrayList<Employer> employers;

    public Employer getEmployer(){
        JobData jobData = JobData.getInstance();
        return jobData.getEmployers().findById(this.employerId);
    }

    @NotNull
    private int locationId;

    public Location getLocation(){
        JobData jobData = JobData.getInstance();
        return jobData.getLocations().findById(this.locationId);
    }

    public int getLocationId() { return locationId; }

    public void setLocationId(int locationId) { this.locationId = locationId; }

    @NotNull
    private ArrayList<Location> locations;

    @NotNull
    private int coreCompetencyId;

    public CoreCompetency getCompetency(){
        JobData jobData = JobData.getInstance();
        return jobData.getCoreCompetencies().findById(this.coreCompetencyId);
    }

    public int getCoreCompetencyId() {
        return coreCompetencyId;
    }

    public void setCoreCompetencyId(int coreCompetenciesId) {
        this.coreCompetencyId = coreCompetenciesId;
    }

    @NotNull
    private ArrayList<CoreCompetency> coreCompetencies;

    private int positionTypeId;

    public PositionType getPositionType(){
        JobData jobData = JobData.getInstance();
        return jobData.getPositionTypes().findById(this.positionTypeId);
    }

    public int getPositionTypeId() {
        return positionTypeId;
    }

    public void setPositionTypeId(int positionTypesId) {
        this.positionTypeId = positionTypesId;
    }

    @NotNull
    private ArrayList<PositionType> positionTypes;
    /*
            //TODOne #3 - Included other fields needed to create a job, - Done
            with correct validation attributes and display names.
            Don't forget to add getters and setters
         */

    public JobForm() {

        JobData jobData = JobData.getInstance();
        /*
            //TODOne #4 - populate the other ArrayList collections needed in the view - Done
        */
        employers = jobData.getEmployers().findAll();
        locations = jobData.getLocations().findAll();
        coreCompetencies = jobData.getCoreCompetencies().findAll();
        positionTypes = jobData.getPositionTypes().findAll();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployerId() {
        return employerId;
    }

    public void setEmployerId(int employerId) {
        this.employerId = employerId;
    }

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<CoreCompetency> getCoreCompetencies() {
        return coreCompetencies;
    }

    public void setCoreCompetencies(ArrayList<CoreCompetency> coreCompetencies) {
        this.coreCompetencies = coreCompetencies;
    }

    public ArrayList<PositionType> getPositionTypes() {
        return positionTypes;
    }

    public void setPositionTypes(ArrayList<PositionType> positionTypes) {
        this.positionTypes = positionTypes;
    }
}