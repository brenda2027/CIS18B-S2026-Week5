package edu.norcocollege.cis18b.week5.mini05;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnrollmentMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> enrollment = new HashMap<>();

        enrollment.put("SEC-101", 30);
        enrollment.put("SEC-099", 12);

        // Core map lifecycle operations.
        enrollment.put("SEC-101", 32);
        enrollment.remove("SEC-099");

        // Lambda-based updates.
        enrollment.merge("SEC-101", 1, Integer::sum);
        enrollment.compute("SEC-102", (key, value) -> value == null ? 1 : value + 2);
        enrollment.replace("SEC-102", enrollment.get("SEC-102"), 28);

        enrollment.forEach((section, count) -> System.out.println(section + " -> " + count));
        System.out.println("Removed SEC-099");
        System.out.println("Updated with merge/compute operations.");

        Map<String, Integer> defaults = Map.of("retryLimit", 3, "waitlistCap", 10);
        System.out.println("Defaults: " + defaults);

        Map<String, List<String>> departments = new HashMap<>();
        departments.computeIfAbsent("CIS", key -> new java.util.ArrayList<>()).add("SEC-101");
        departments.computeIfAbsent("CIS", key -> new java.util.ArrayList<>()).add("SEC-102");
        System.out.println("Grouped sections: " + departments);

        System.out.println("Mutable key hazerd: if a key changes after being stored in a hash-based map, later lookups can fail because the hash location no longer matches the original key.");

        // TODO: Demonstrate and explain why mutable keys are hazardous in hash-based maps.
    }
}