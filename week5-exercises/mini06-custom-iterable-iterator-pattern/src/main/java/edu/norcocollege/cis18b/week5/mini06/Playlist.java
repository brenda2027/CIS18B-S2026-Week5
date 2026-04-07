package edu.norcocollege.cis18b.week5.mini06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.annotation.processing.SupportedOptions;

public class Playlist implements Iterable<PlaylistItem> {

    private final List<PlaylistItem> items = new ArrayList<>();

    public void add(PlaylistItem item) {
        items.add(item);
    }

    @Override
    public Iterator<PlaylistItem> iterator() {
        // Default traversal: insertion order.
        return List.copyOf(items).iterator();
    }

    public Iterator<PlaylistItem> priorityIterator() {
        // Alternate traversal: highest priority first.
        List<PlaylistItem> sorted = new ArrayList<>(items);
        sorted.sort(Comparator.comparingInt(PlaylistItem::getPriority).reversed());
        return sorted.iterator();
    }

    public Iterator<PlaylistItem> reverseIterator() {
        // Third traveral strategy: reverse insertion order.
        List<PlaylistItem> reversed = new ArrayList<>(items);
        java.util.Collections.reverse(reversed);
        return reversed.iterator();

    }
    // TODO: Add a third traversal strategy for the extension challenge.
}