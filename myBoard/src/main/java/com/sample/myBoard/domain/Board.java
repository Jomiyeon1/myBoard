package com.sample.myBoard.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "BOARD_NO")
    private long boardNo;
    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name="USER_ID")
    private User user;


}
