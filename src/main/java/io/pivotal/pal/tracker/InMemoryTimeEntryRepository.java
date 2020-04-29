package io.pivotal.pal.tracker;

import java.util.HashMap;
import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{
    private HashMap<Long, TimeEntry> timeEntries = new HashMap<>();

    private long currentId = 1L;

    public TimeEntry create(TimeEntry timeEntry) {
        Long id  = currentId++;

        TimeEntry newTimeEntry = new TimeEntry(
                id,
                timeEntry.getProjectId(),
                timeEntry.getUserId(),
                timeEntry.getDate(),
                timeEntry.getHours());
    }


    public TimeEntry find(long id) {
        return null;
    }

    public List<TimeEntry> list() {
        return null;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        return null;
    }

    public TimeEntry delete(long id) {
        return null;
    }
}
