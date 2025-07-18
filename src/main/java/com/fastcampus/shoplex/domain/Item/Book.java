package com.fastcampus.shoplex.domain.Item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")    //dtype = "M"
@Getter
@Setter
public class Book extends Item{

    private String author;
    private String isbn;

}
