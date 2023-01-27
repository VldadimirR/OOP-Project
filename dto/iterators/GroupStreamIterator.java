package dto.iterators;

import java.util.Iterator;
import java.util.List;

import dto.GroupStream;
import dto.StudentGroup;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private int cursor;
    private final GroupStream groupStream;
    private final List<StudentGroup> studentGroups;

    public GroupStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
        this.studentGroups = groupStream.getStudentGroupList();

    }

    @Override
    public boolean hasNext() {
        return cursor < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroups.get(cursor++);
    }

    @Override
    public void remove() {
        this.studentGroups.remove(cursor);
    }

}
