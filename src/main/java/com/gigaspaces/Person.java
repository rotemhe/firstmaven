package com.gigaspaces;

import com.gigaspaces.annotation.pojo.*;


import static com.gigaspaces.metadata.index.SpaceIndexType.BASIC;

/**
 * Created by rotemh-pcu on 1/4/17.
 */

@SpaceClass
public class Person {
    private Integer id;
    private String name;
    private String lastName;
    private int age;


    public Person() {}

    @SpaceId(autoGenerate=false)
    @SpaceRouting
    public Integer getId() { return id;}

    public void setId(Integer id) {  this.id = id; }

    @SpaceIndex(type = BASIC)
    public String getLastName() { return lastName; }

    public void setLastName(String type) { this.lastName = lastName; }

    @SpaceProperty(nullValue="-1")
    public int getAge(){ return age; }

}

