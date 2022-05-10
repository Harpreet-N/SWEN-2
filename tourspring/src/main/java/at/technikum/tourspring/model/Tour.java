package at.technikum.tourspring.model;

import lombok.*;


import java.io.Serializable;
import javax.persistence.*;


@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Table(name = "tour")
@Entity
@EqualsAndHashCode
@ToString
@Setter
@Getter
public class Tour implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "fromDestination")
    private String fromDestination;

    @Column(name = "toDestination")
    private String toDestination;

    @Column(name = "transport")
    private String transport;

    @Column(name = "distance")
    private int distance;

    @Column(name = "estimatedTime")
    private int estimatedTime;

    @Column(name = "routeInformation")
    private String routeInformation;

}