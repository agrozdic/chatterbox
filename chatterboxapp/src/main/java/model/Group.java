package model;

import javax.persistence.*;

import java.time.Instant;

@Entity
@Table
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String desc;
    @Column
    private Instant creationDate;
    @Column
    private Boolean isSuspended;
    @Column
    private String suspendedReason;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }
//
//    public Instant getCreationDate() {
//        return creationDate;
//    }
//
//    public void setCreationDate(Instant creationDate) {
//        this.creationDate = creationDate;
//    }
//
//    public Boolean getSuspended() {
//        return isSuspended;
//    }
//
//    public void setSuspended(Boolean suspended) {
//        isSuspended = suspended;
//    }
//
//    public String getSuspendedReason() {
//        return suspendedReason;
//    }
//
//    public void setSuspendedReason(String suspendedReason) {
//        this.suspendedReason = suspendedReason;
//    }
//
//    public Group(){
//
//    }
//
//    public Group(Long id, String name, String desc, Instant creationDate, Boolean isSuspended, String suspendedReason) {
//        this.id = id;
//        this.name = name;
//        this.desc = desc;
//        this.creationDate = creationDate;
//        this.isSuspended = isSuspended;
//        this.suspendedReason = suspendedReason;
//    }
}
