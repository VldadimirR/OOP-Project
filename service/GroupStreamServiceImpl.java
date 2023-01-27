package service;

import java.util.Collections;
import java.util.List;

import dto.GroupStream;
import dto.comparators.GroupStreamComparator;

public class GroupStreamServiceImpl implements GroupStreamService {

    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }

}
