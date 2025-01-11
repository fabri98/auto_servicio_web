package com.AutoServicio.gestion_de_autoservicio.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "news")
public class NewsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long news_id;
    private String title;
    private String content;
    private String image_url;
    private Date published_at;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id"
    )
    private UserEntity user;

    @Override
    public String toString() {
        return "NewsEntity{" +
                "news_id=" + news_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", image_url='" + image_url + '\'' +
                ", published_at=" + published_at +
                ", user_id=" + user +
                '}';
    }
}
