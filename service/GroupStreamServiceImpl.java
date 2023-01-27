package service;

public class GroupStreamServiceImpl implements GroupStreamService {

    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }

}
