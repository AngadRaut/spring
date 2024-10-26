package org.standalone_collections;

import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class Student {
    private Set<String> friends;
    private Map<String,Integer> feeStructure;
    private String name;

}
