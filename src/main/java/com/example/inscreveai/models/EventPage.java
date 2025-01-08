package com.example.inscreveai.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_EVENT_PAGE")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EventPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EVENT_PAGE_ID")
    private Long eventPageId;

    @OneToOne
    @JoinColumn(name = "Event_ID", nullable = false)
    private Event eventId;

    /*@OneToOne
    private Cap cap;*/

    /*@OneToOne
    private About about;*/

    /*@OneToOne
    private Locale locale;*/

    /*@OneToMany(mappedBy = "EventPage")
    private List<Panelist> panelist;*/

    /*@OneToMany(mappedBy = "EventPage")
    private List<Programing> programingList;*/


}
