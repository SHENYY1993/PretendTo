package com.shenyy.pretendto.pathfactory.algo;

import com.shenyy.pretendto.pathfactory.Path;

import java.util.Map;

public class RRTStarAlgo<T, O> extends PathAlgo {
    public RRTStarAlgo(Path<T, O> path) {
        super(path);
    }

    @Override
    public void initialize() {
        //TODO 2D path construct
        System.out.println("RRT star algorithm initializing...");
    }

    @Override
    public void construct() {
        //TODO 2D path construct
        System.out.println("RRT star algorithm constructing 2D path...");
    }
}
