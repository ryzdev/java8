package dev.project;

import com.google.common.collect.Lists;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Thing {

    public String getResult() {
        List<String> myList = Lists.newArrayList("alpha", "bravo", "charlie");
        List<String> result = myList.stream().map(a -> a.substring(0, 1)).collect(toList());
        return result.toString();
    }
}
